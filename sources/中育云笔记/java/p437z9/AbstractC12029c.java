package p437z9;

import com.zykj.blackboard.enums.PlayStatus;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: z9.c */
/* loaded from: classes5.dex */
public abstract class AbstractC12029c extends AbstractC12031e {

    /* renamed from: j */
    public ListIterator f28399j;

    /* renamed from: k */
    public long f28400k;

    /* renamed from: l */
    public long f28401l;

    /* renamed from: A */
    public final void m26638A(ListIterator listIterator) {
        AbstractC9979u.m20294g(listIterator, "listIterator");
        this.f28399j = listIterator;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ListIterator listIterator = this.f28399j;
        if (listIterator != null) {
            long j10 = 0;
            long j11 = 0;
            while (listIterator.hasNext()) {
                while (m26647f() == PlayStatus.RECORD_PAUSE) {
                    Thread.sleep(16L);
                }
                if (m26647f() == PlayStatus.RECORD_END) {
                    m26650i(false);
                    return;
                }
                Object next = listIterator.next();
                if (mo18752y(next, this.f28400k)) {
                    mo18751w(next);
                } else {
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    this.f28400k = this.f28400k + (m26646e() != null ? r14.m22937a() : 16);
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
        m26650i(true);
        System.out.println((Object) ("命令执行， 总时间花费：" + (System.currentTimeMillis() - jCurrentTimeMillis)));
    }

    /* renamed from: v */
    public final long m26639v() {
        return this.f28401l;
    }

    /* renamed from: w */
    public abstract void mo18751w(Object obj);

    /* renamed from: x */
    public final void m26640x(long j10) {
        this.f28401l = j10;
    }

    /* renamed from: y */
    public abstract boolean mo18752y(Object obj, long j10);

    /* renamed from: z */
    public final void m26641z(long j10) {
        this.f28400k = j10;
        while (true) {
            ListIterator listIterator = this.f28399j;
            if (listIterator == null || !listIterator.hasPrevious()) {
                break;
            }
            ListIterator listIterator2 = this.f28399j;
            if (listIterator2 != null) {
                listIterator2.previous();
            }
        }
        ListIterator listIterator3 = this.f28399j;
        if (listIterator3 != null) {
            while (listIterator3.hasNext()) {
                Object next = listIterator3.next();
                if (!mo18752y(next, j10)) {
                    if (listIterator3.hasPrevious()) {
                        listIterator3.previous();
                        return;
                    }
                    return;
                }
                mo18751w(next);
            }
        }
    }
}
