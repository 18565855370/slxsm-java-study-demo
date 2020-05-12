Synchronized、reentrantLock是单机环境下保证线程安全加锁的方式，如果是分布式的话需要额外的服务帮助我们实现加锁动作，
如：redis、zookeeper、文件系统、数据库.....
redis可以通过setnx+expire或incr+decr+expire自定义实现，也可以通过redis提供的redission包来实现。
zookeeper是一个分布式协调任务系统，zk存储数据通过node节点存储的，数据结构是一个树形，节点存在临时节点、永久节点、有序节点、无需节点，
可以通过临时节点实现分布式锁
数据库、文件系统类似。。。