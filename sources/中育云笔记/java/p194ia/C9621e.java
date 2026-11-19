package p194ia;

import android.util.Log;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10221i;

/* renamed from: ia.e */
/* loaded from: classes5.dex */
public final class C9621e implements InterfaceC9618b {

    /* renamed from: a */
    public long f22156a;

    /* renamed from: b */
    public long f22157b;

    /* renamed from: c */
    public long f22158c;

    /* renamed from: d */
    public long f22159d;

    /* renamed from: e */
    public boolean f22160e;

    /* renamed from: f */
    public InterfaceC10221i f22161f;

    /* renamed from: j */
    public static final void m18866j(C9621e this$0) throws InterruptedException {
        AbstractC9979u.m20294g(this$0, "this$0");
        long j10 = this$0.f22157b;
        while (this$0.f22160e) {
            InterfaceC10221i interfaceC10221i = this$0.f22161f;
            if (interfaceC10221i != null) {
                interfaceC10221i.progress(this$0.m18867c(j10));
            }
            j10 += 24;
            Thread.sleep(24L);
        }
    }

    @Override // p194ia.InterfaceC9618b
    /* renamed from: a */
    public long mo18856a(long j10, boolean z10) {
        if (!this.f22160e) {
            return 0L;
        }
        long j11 = j10 - (z10 ? this.f22159d : this.f22158c);
        if (z10) {
            this.f22159d = j10;
            return j11;
        }
        Log.i("prevTimeForCommand1", String.valueOf(this.f22158c));
        this.f22158c = j10;
        Log.i("prevTimeForCommand2", String.valueOf(j10));
        return j11;
    }

    /* renamed from: c */
    public long m18867c(long j10) {
        if (this.f22160e) {
            this.f22156a += j10 - this.f22157b;
            this.f22157b = j10;
        }
        return this.f22156a;
    }

    /* renamed from: d */
    public void m18868d(long j10) {
        this.f22156a = j10;
        this.f22160e = false;
    }

    /* renamed from: e */
    public boolean m18869e() {
        return this.f22160e;
    }

    /* renamed from: f */
    public void m18870f(InterfaceC10221i recordListener) {
        AbstractC9979u.m20294g(recordListener, "recordListener");
        this.f22161f = recordListener;
    }

    /* renamed from: g */
    public final void m18871g(long j10) {
        this.f22159d += j10;
    }

    /* renamed from: h */
    public final void m18872h(long j10) {
        this.f22158c += j10;
    }

    /* renamed from: i */
    public void m18873i(long j10) {
        if (this.f22160e) {
            return;
        }
        this.f22160e = true;
        this.f22157b = j10;
        this.f22158c = j10 - this.f22158c;
        this.f22159d = j10 - this.f22159d;
        InterfaceC10221i interfaceC10221i = this.f22161f;
        if (interfaceC10221i != null) {
            interfaceC10221i.startRecord();
        }
        new Thread(new Runnable() { // from class: ia.d
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                C9621e.m18866j(this.f22155c);
            }
        }).start();
    }

    /* renamed from: k */
    public void m18874k(long j10) {
        if (this.f22160e) {
            this.f22156a += j10 - this.f22157b;
            this.f22160e = false;
            this.f22157b = 0L;
            this.f22158c = 0L;
            this.f22159d = j10 - this.f22159d;
            InterfaceC10221i interfaceC10221i = this.f22161f;
            if (interfaceC10221i != null) {
                interfaceC10221i.progress(m18867c(j10));
            }
            InterfaceC10221i interfaceC10221i2 = this.f22161f;
            if (interfaceC10221i2 != null) {
                interfaceC10221i2.stopRecord();
            }
        }
    }
}
