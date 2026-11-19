package p189n5;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import p243s5.InterfaceC9481i;

/* renamed from: n5.e */
/* loaded from: classes4.dex */
public final class C9099e implements InterfaceC9096b {

    /* renamed from: a */
    public long f15327a;

    /* renamed from: b */
    public long f15328b;

    /* renamed from: c */
    public long f15329c;

    /* renamed from: d */
    public long f15330d;

    /* renamed from: e */
    public boolean f15331e;

    /* renamed from: f */
    public InterfaceC9481i f15332f;

    /* renamed from: j */
    public static final void m14641j(C9099e this$0) throws InterruptedException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long j9 = this$0.f15328b;
        while (this$0.f15331e) {
            InterfaceC9481i interfaceC9481i = this$0.f15332f;
            if (interfaceC9481i != null) {
                interfaceC9481i.progress(this$0.m14642c(j9));
            }
            j9 += 24;
            Thread.sleep(24L);
        }
    }

    @Override // p189n5.InterfaceC9096b
    /* renamed from: a */
    public long mo14631a(long j9, boolean z9) {
        if (!this.f15331e) {
            return 0L;
        }
        long j10 = j9 - (z9 ? this.f15330d : this.f15329c);
        if (z9) {
            this.f15330d = j9;
            return j10;
        }
        Log.i("prevTimeForCommand1", String.valueOf(this.f15329c));
        this.f15329c = j9;
        Log.i("prevTimeForCommand2", String.valueOf(j9));
        return j10;
    }

    /* renamed from: c */
    public long m14642c(long j9) {
        if (this.f15331e) {
            this.f15327a += j9 - this.f15328b;
            this.f15328b = j9;
        }
        return this.f15327a;
    }

    /* renamed from: d */
    public void m14643d(long j9) {
        this.f15327a = j9;
        this.f15331e = false;
    }

    /* renamed from: e */
    public boolean m14644e() {
        return this.f15331e;
    }

    /* renamed from: f */
    public void m14645f(InterfaceC9481i recordListener) {
        Intrinsics.checkNotNullParameter(recordListener, "recordListener");
        this.f15332f = recordListener;
    }

    /* renamed from: g */
    public final void m14646g(long j9) {
        this.f15330d += j9;
    }

    /* renamed from: h */
    public final void m14647h(long j9) {
        this.f15329c += j9;
    }

    /* renamed from: i */
    public void m14648i(long j9) {
        if (this.f15331e) {
            return;
        }
        this.f15331e = true;
        this.f15328b = j9;
        this.f15329c = j9 - this.f15329c;
        this.f15330d = j9 - this.f15330d;
        InterfaceC9481i interfaceC9481i = this.f15332f;
        if (interfaceC9481i != null) {
            interfaceC9481i.startRecord();
        }
        new Thread(new Runnable() { // from class: n5.d
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                C9099e.m14641j(this.f15326a);
            }
        }).start();
    }

    /* renamed from: k */
    public void m14649k(long j9) {
        if (this.f15331e) {
            this.f15327a += j9 - this.f15328b;
            this.f15331e = false;
            this.f15328b = 0L;
            this.f15329c = 0L;
            this.f15330d = j9 - this.f15330d;
            InterfaceC9481i interfaceC9481i = this.f15332f;
            if (interfaceC9481i != null) {
                interfaceC9481i.progress(m14642c(j9));
            }
            InterfaceC9481i interfaceC9481i2 = this.f15332f;
            if (interfaceC9481i2 != null) {
                interfaceC9481i2.stopRecord();
            }
        }
    }
}
