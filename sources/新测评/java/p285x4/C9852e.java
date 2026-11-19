package p285x4;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import p035c5.InterfaceC5126i;

/* renamed from: x4.e */
/* loaded from: classes4.dex */
public final class C9852e implements InterfaceC9849b {

    /* renamed from: a */
    public long f17410a;

    /* renamed from: b */
    public long f17411b;

    /* renamed from: c */
    public long f17412c;

    /* renamed from: d */
    public long f17413d;

    /* renamed from: e */
    public boolean f17414e;

    /* renamed from: f */
    public InterfaceC5126i f17415f;

    /* renamed from: j */
    public static final void m16501j(C9852e this$0) throws InterruptedException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long j10 = this$0.f17411b;
        while (this$0.f17414e) {
            InterfaceC5126i interfaceC5126i = this$0.f17415f;
            if (interfaceC5126i != null) {
                interfaceC5126i.progress(this$0.m16502c(j10));
            }
            j10 += 24;
            Thread.sleep(24L);
        }
    }

    @Override // p285x4.InterfaceC9849b
    /* renamed from: a */
    public long mo16492a(long j10, boolean z9) {
        if (!this.f17414e) {
            return 0L;
        }
        long j11 = j10 - (z9 ? this.f17413d : this.f17412c);
        if (z9) {
            this.f17413d = j10;
            return j11;
        }
        Log.i("prevTimeForCommand1", String.valueOf(this.f17412c));
        this.f17412c = j10;
        Log.i("prevTimeForCommand2", String.valueOf(j10));
        return j11;
    }

    /* renamed from: c */
    public long m16502c(long j10) {
        if (this.f17414e) {
            this.f17410a += j10 - this.f17411b;
            this.f17411b = j10;
        }
        return this.f17410a;
    }

    /* renamed from: d */
    public void m16503d(long j10) {
        this.f17410a = j10;
        this.f17414e = false;
    }

    /* renamed from: e */
    public boolean m16504e() {
        return this.f17414e;
    }

    /* renamed from: f */
    public void m16505f(InterfaceC5126i recordListener) {
        Intrinsics.checkNotNullParameter(recordListener, "recordListener");
        this.f17415f = recordListener;
    }

    /* renamed from: g */
    public final void m16506g(long j10) {
        this.f17413d += j10;
    }

    /* renamed from: h */
    public final void m16507h(long j10) {
        this.f17412c += j10;
    }

    /* renamed from: i */
    public void m16508i(long j10) {
        if (this.f17414e) {
            return;
        }
        this.f17414e = true;
        this.f17411b = j10;
        this.f17412c = j10 - this.f17412c;
        this.f17413d = j10 - this.f17413d;
        InterfaceC5126i interfaceC5126i = this.f17415f;
        if (interfaceC5126i != null) {
            interfaceC5126i.startRecord();
        }
        new Thread(new Runnable() { // from class: x4.d
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                C9852e.m16501j(this.f17409a);
            }
        }).start();
    }

    /* renamed from: k */
    public void m16509k(long j10) {
        if (this.f17414e) {
            this.f17410a += j10 - this.f17411b;
            this.f17414e = false;
            this.f17411b = 0L;
            this.f17412c = 0L;
            this.f17413d = j10 - this.f17413d;
            InterfaceC5126i interfaceC5126i = this.f17415f;
            if (interfaceC5126i != null) {
                interfaceC5126i.progress(m16502c(j10));
            }
            InterfaceC5126i interfaceC5126i2 = this.f17415f;
            if (interfaceC5126i2 != null) {
                interfaceC5126i2.stopRecord();
            }
        }
    }
}
