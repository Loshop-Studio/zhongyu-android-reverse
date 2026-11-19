package com.zykj.blackboard.core.execute;

import com.zykj.blackboard.enums.PlayStatus;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public abstract class EventPlayThread<T> extends PlayThread {
    private long currentTime;
    private ListIterator<T> iterator;
    private long startPlayTime;

    public final long getStartPlayTime() {
        return this.startPlayTime;
    }

    public abstract void handle(T t10);

    public final void initStartPlayTime(long j10) {
        this.startPlayTime = j10;
    }

    public abstract boolean needHandle(T t10, long j10);

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ListIterator<T> listIterator = this.iterator;
        if (listIterator != null) {
            long j10 = 0;
            long j11 = 0;
            while (listIterator.hasNext()) {
                while (getPlayStatus() == PlayStatus.RECORD_PAUSE) {
                    Thread.sleep(16L);
                }
                if (getPlayStatus() == PlayStatus.RECORD_END) {
                    notifyFinish(false);
                    return;
                }
                T next = listIterator.next();
                if (needHandle(next, this.currentTime)) {
                    handle(next);
                } else {
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    this.currentTime = this.currentTime + (getPlaySpeed() != null ? r14.getPlayIncrement() : 16);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (j10 != 0) {
                        long j12 = (16 - (jCurrentTimeMillis2 - j10)) + j11;
                        j11 = j12 > 0 ? j12 : 0L;
                    } else {
                        j11 = 16;
                    }
                    System.out.println((Object) ("命令执行，sleepTime:" + j11));
                    Thread.sleep(j11);
                    j10 = jCurrentTimeMillis2;
                }
            }
        }
        notifyFinish(true);
        System.out.println((Object) ("命令执行， 总时间花费：" + (System.currentTimeMillis() - jCurrentTimeMillis)));
    }

    public final void seekTo(long j10) {
        this.currentTime = j10;
        while (true) {
            ListIterator<T> listIterator = this.iterator;
            if (listIterator == null || !listIterator.hasPrevious()) {
                break;
            }
            ListIterator<T> listIterator2 = this.iterator;
            if (listIterator2 != null) {
                listIterator2.previous();
            }
        }
        ListIterator<T> listIterator3 = this.iterator;
        if (listIterator3 != null) {
            while (listIterator3.hasNext()) {
                T next = listIterator3.next();
                if (!needHandle(next, j10)) {
                    if (listIterator3.hasPrevious()) {
                        listIterator3.previous();
                        return;
                    }
                    return;
                }
                handle(next);
            }
        }
    }

    public final void setListIterator(ListIterator<T> listIterator) {
        AbstractC9133u.m16133g(listIterator, "listIterator");
        this.iterator = listIterator;
    }
}
