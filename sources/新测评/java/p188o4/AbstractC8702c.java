package p188o4;

import com.zykj.blackboard.enums.PlayStatus;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o4.c */
/* loaded from: classes4.dex */
public abstract class AbstractC8702c extends AbstractC8704e {

    /* renamed from: h */
    public ListIterator f14469h;

    /* renamed from: i */
    public long f14470i;

    /* renamed from: j */
    public long f14471j;

    /* renamed from: A */
    public final void m14311A(ListIterator listIterator) {
        Intrinsics.checkNotNullParameter(listIterator, "listIterator");
        this.f14469h = listIterator;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ListIterator listIterator = this.f14469h;
        if (listIterator != null) {
            long j10 = 0;
            long j11 = 0;
            while (listIterator.hasNext()) {
                while (m14323f() == PlayStatus.RECORD_PAUSE) {
                    Thread.sleep(16L);
                }
                if (m14323f() == PlayStatus.RECORD_END) {
                    m14326i(false);
                    return;
                }
                Object next = listIterator.next();
                if (mo14315y(next, this.f14470i)) {
                    mo14313w(next);
                } else {
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    this.f14470i = this.f14470i + (m14322e() != null ? r14.m12008a() : 16);
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
        m14326i(true);
        System.out.println((Object) ("命令执行， 总时间花费：" + (System.currentTimeMillis() - jCurrentTimeMillis)));
    }

    /* renamed from: v */
    public final long m14312v() {
        return this.f14471j;
    }

    /* renamed from: w */
    public abstract void mo14313w(Object obj);

    /* renamed from: x */
    public final void m14314x(long j10) {
        this.f14471j = j10;
    }

    /* renamed from: y */
    public abstract boolean mo14315y(Object obj, long j10);

    /* renamed from: z */
    public final void m14316z(long j10) {
        this.f14470i = j10;
        while (true) {
            ListIterator listIterator = this.f14469h;
            if (listIterator == null || !listIterator.hasPrevious()) {
                break;
            }
            ListIterator listIterator2 = this.f14469h;
            if (listIterator2 != null) {
                listIterator2.previous();
            }
        }
        ListIterator listIterator3 = this.f14469h;
        if (listIterator3 != null) {
            while (listIterator3.hasNext()) {
                Object next = listIterator3.next();
                if (!mo14315y(next, j10)) {
                    if (listIterator3.hasPrevious()) {
                        listIterator3.previous();
                        return;
                    }
                    return;
                }
                mo14313w(next);
            }
        }
    }
}
