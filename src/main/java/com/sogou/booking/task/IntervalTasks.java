package com.sogou.booking.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 任务间隔多久的定时任务
 *
 * @author hankun
 * @date 2018/8/14
 */
@Component
public class IntervalTasks {

    @Scheduled(fixedDelay = 1000 )
    public void processOneSecond() {//一秒的定时任务用于测试
//        System.out.println("hello world");
    }

    @Scheduled(fixedDelay = 1000 * 60)
    public void processOneMintue() {
    }

    @Scheduled(fixedDelay = 1000 * 60 * 10)
    public void processTenMintue() {
    }


    @Scheduled(fixedDelay = 1000 * 60 * 30)
    public void processHalfHour() {
    }

    @Scheduled(fixedDelay = 1000 * 60 * 60)
    public void processOneHour() {
    }

    @Scheduled(fixedDelay = 1000 * 60 * 60 * 24)
    public void processOneDay() {
    }

}
