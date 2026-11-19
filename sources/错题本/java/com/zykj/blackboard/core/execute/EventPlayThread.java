package com.zykj.blackboard.core.execute;

import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.blackboard.enums.PlayStatus;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\nJ\u001b\u0010\u0010\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u0000H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m5110d2 = {"Lcom/zykj/blackboard/core/execute/EventPlayThread;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/zykj/blackboard/core/execute/PlayThread;", "<init>", "()V", "Ld6/s;", "run", "", "playTime", "initStartPlayTime", "(J)V", "getStartPlayTime", "()J", "seekTo", "", "listIterator", "setListIterator", "(Ljava/util/ListIterator;)V", "info", "handle", "(Ljava/lang/Object;)V", "currentTime", "", "needHandle", "(Ljava/lang/Object;J)Z", "iterator", "Ljava/util/ListIterator;", "J", "startPlayTime", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class EventPlayThread<T> extends PlayThread {
    private long currentTime;

    @Nullable
    private ListIterator<T> iterator;
    private long startPlayTime;

    public final long getStartPlayTime() {
        return this.startPlayTime;
    }

    public abstract void handle(T info);

    public final void initStartPlayTime(long playTime) {
        this.startPlayTime = playTime;
    }

    public abstract boolean needHandle(T info, long currentTime);

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ListIterator<T> listIterator = this.iterator;
        if (listIterator != null) {
            long j7 = 0;
            long j8 = 0;
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
                    if (j7 != 0) {
                        long j9 = (16 - (jCurrentTimeMillis2 - j7)) + j8;
                        j8 = j9 > 0 ? j9 : 0L;
                    } else {
                        j8 = 16;
                    }
                    System.out.println((Object) AbstractC0584a.m913n(j8, "命令执行，sleepTime:"));
                    Thread.sleep(j8);
                    j7 = jCurrentTimeMillis2;
                }
            }
        }
        notifyFinish(true);
        System.out.println((Object) ("命令执行， 总时间花费：" + (System.currentTimeMillis() - jCurrentTimeMillis)));
    }

    public final void seekTo(long seekTo) {
        this.currentTime = seekTo;
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
                if (!needHandle(next, seekTo)) {
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

    public final void setListIterator(@NotNull ListIterator<T> listIterator) {
        AbstractC5830k.m5330g(listIterator, "listIterator");
        this.iterator = listIterator;
    }
}
