package com.sogou.booking.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * cron表达式类型的定时任务
 *
 * @author hankun
 * @date 2018/8/14
 */

@Component
public class CronTasks {

    //每日0点
    @Scheduled(cron = "0 0 0 * * ?")
    private void processAtZeroEveryday() {
    }

    //每日1点
    @Scheduled(cron = "0 0 1 * * ?")
    private void processAtOneEveryday() {
    }

    //每日12点
    @Scheduled(cron = "0 0 12 * * ?")
    private void processAtTwelveEveryday() {
    }

    //每月1日0点
    @Scheduled(cron = "0 0 0 1 * ?")
    private void processAtZeroEveryMonth() {
    }

    //每月1日1点
    @Scheduled(cron = "0 0 1 1 * ?")
    private void processAtOneEveryMonth() {
    }

    //每月1日早上8点
    @Scheduled(cron = "0 0 8 1 * ?")
    private void processAtEightEveryMonth() {
    }

}
