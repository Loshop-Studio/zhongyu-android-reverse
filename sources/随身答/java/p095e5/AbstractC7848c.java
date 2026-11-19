package p095e5;

import com.zykj.blackboard.enums.PlayStatus;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7848c extends AbstractC7850e {

    /* renamed from: h */
    public ListIterator f13184h;

    /* renamed from: i */
    public long f13185i;

    /* renamed from: j */
    public long f13186j;

    /* renamed from: A */
    public final void m12302A(ListIterator listIterator) {
        Intrinsics.checkNotNullParameter(listIterator, "listIterator");
        this.f13184h = listIterator;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ListIterator listIterator = this.f13184h;
        if (listIterator != null) {
            long j9 = 0;
            long j10 = 0;
            while (listIterator.hasNext()) {
                while (m12314f() == PlayStatus.RECORD_PAUSE) {
                    Thread.sleep(16L);
                }
                if (m12314f() == PlayStatus.RECORD_END) {
                    m12317i(false);
                    return;
                }
                Object next = listIterator.next();
                if (mo12306y(next, this.f13185i)) {
                    mo12304w(next);
                } else {
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    this.f13185i = this.f13185i + (m12313e() != null ? r14.m16537a() : 16);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (j9 != 0) {
                        long j11 = (16 - (jCurrentTimeMillis2 - j9)) + j10;
                        j10 = j11 > 0 ? j11 : 0L;
                    } else {
                        j10 = 16;
                    }
                    System.out.println((Object) ("命令执行，sleepTime:" + j10));
                    Thread.sleep(j10);
                    j9 = jCurrentTimeMillis2;
                }
            }
        }
        m12317i(true);
        System.out.println((Object) ("命令执行， 总时间花费：" + (System.currentTimeMillis() - jCurrentTimeMillis)));
    }

    /* renamed from: v */
    public final long m12303v() {
        return this.f13186j;
    }

    /* renamed from: w */
    public abstract void mo12304w(Object obj);

    /* renamed from: x */
    public final void m12305x(long j9) {
        this.f13186j = j9;
    }

    /* renamed from: y */
    public abstract boolean mo12306y(Object obj, long j9);

    /* renamed from: z */
    public final void m12307z(long j9) {
        this.f13185i = j9;
        while (true) {
            ListIterator listIterator = this.f13184h;
            if (listIterator == null || !listIterator.hasPrevious()) {
                break;
            }
            ListIterator listIterator2 = this.f13184h;
            if (listIterator2 != null) {
                listIterator2.previous();
            }
        }
        ListIterator listIterator3 = this.f13184h;
        if (listIterator3 != null) {
            while (listIterator3.hasNext()) {
                Object next = listIterator3.next();
                if (!mo12306y(next, j9)) {
                    if (listIterator3.hasPrevious()) {
                        listIterator3.previous();
                        return;
                    }
                    return;
                }
                mo12304w(next);
            }
        }
    }
}
