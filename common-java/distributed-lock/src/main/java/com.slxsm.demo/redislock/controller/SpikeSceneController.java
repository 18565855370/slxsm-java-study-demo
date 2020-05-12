package com.slxsm.demo.redislock.controller;

import com.slxsm.demo.redislock.service.SpikeSceneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 秒杀场景Controller
 */
@RestController
public class SpikeSceneController {

    private final SpikeSceneService spikeSceneService;

    public SpikeSceneController(SpikeSceneService spikeSceneService) {
        this.spikeSceneService = spikeSceneService;
    }

    @RequestMapping(value = "spikeThinkBook", method = RequestMethod.GET)
    public void spikeThinkBook(){
        System.out.println("start -> spikeThinkBook");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500; i++){
            Thread thread = new Thread(spikeSceneService::spikeThinkBook);
            thread.setName("skpiThinkBook_" + i);
            thread.start();
        }
        System.out.println("end -> spikeThinkBook, 耗时: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
