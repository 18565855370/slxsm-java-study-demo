package com.slxsm.demo.redislock.service;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 秒杀场景Service
 */
@Service
public class SpikeSceneService {

    @Resource
    private Redisson redisson;

    private final StringRedisTemplate stringRedisTemplate;

    public SpikeSceneService(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    public void spikeThinkBook(){
        String lockKey = "lock";
        RLock lock = redisson.getLock(lockKey);
        lock.lock();
        try {
            int thinkBootStore = Integer.parseInt(stringRedisTemplate.opsForValue().get("thinkBootStore"));
            if (thinkBootStore > 0){
                stringRedisTemplate.opsForValue().set("thinkBootStore",(thinkBootStore - 1) + "");
                System.out.println("扣减【thinkBook15】库存成功，剩余库存：" + (thinkBootStore - 1));
            }else {
                System.out.println("扣减【thinkBook15】库存失败，库存不足，请等待补货！");
            }
        }finally {
            lock.unlock();
        }
    }

}
