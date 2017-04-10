package com.xjtushilei.core.scheduler;

import com.xjtushilei.model.UrlSeed;

/**
 * 调度器
 * 我们可以自定义调度器。
 * Created by shilei on 2017/4/10.
 */
public interface Scheduler {

    /**
     * 写进去url种子
     *
     * @param urlSeed
     */
    public void push(UrlSeed urlSeed);

    /**
     * poll种子
     *
     * @return UrlSeed
     */
    public UrlSeed poll();
}