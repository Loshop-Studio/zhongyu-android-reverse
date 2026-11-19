package p266u6;

import android.os.Handler;
import android.os.Message;
import io.reactivex.disposables.AbstractC8965a;
import java.util.concurrent.TimeUnit;
import p100f7.AbstractC8462a;
import p244s6.AbstractC10049f;
import p277v6.InterfaceC10250b;

/* renamed from: u6.b */
/* loaded from: classes5.dex */
public final class C10199b extends AbstractC10049f {

    /* renamed from: b */
    public final Handler f20343b;

    /* renamed from: c */
    public final boolean f20344c;

    /* renamed from: u6.b$a */
    public static final class a extends AbstractC10049f.c {

        /* renamed from: a */
        public final Handler f20345a;

        /* renamed from: b */
        public final boolean f20346b;

        /* renamed from: c */
        public volatile boolean f20347c;

        public a(Handler handler, boolean z10) {
            this.f20345a = handler;
            this.f20346b = z10;
        }

        @Override // p244s6.AbstractC10049f.c
        /* renamed from: c */
        public InterfaceC10250b mo13467c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f20347c) {
                return AbstractC8965a.m15521a();
            }
            b bVar = new b(this.f20345a, AbstractC8462a.m13803m(runnable));
            Message messageObtain = Message.obtain(this.f20345a, bVar);
            messageObtain.obj = this;
            if (this.f20346b) {
                messageObtain.setAsynchronous(true);
            }
            this.f20345a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f20347c) {
                return bVar;
            }
            this.f20345a.removeCallbacks(bVar);
            return AbstractC8965a.m15521a();
        }

        @Override // p277v6.InterfaceC10250b
        public void dispose() {
            this.f20347c = true;
            this.f20345a.removeCallbacksAndMessages(this);
        }

        @Override // p277v6.InterfaceC10250b
        public boolean isDisposed() {
            return this.f20347c;
        }
    }

    /* renamed from: u6.b$b */
    public static final class b implements Runnable, InterfaceC10250b {

        /* renamed from: a */
        public final Handler f20348a;

        /* renamed from: b */
        public final Runnable f20349b;

        /* renamed from: c */
        public volatile boolean f20350c;

        public b(Handler handler, Runnable runnable) {
            this.f20348a = handler;
            this.f20349b = runnable;
        }

        @Override // p277v6.InterfaceC10250b
        public void dispose() {
            this.f20348a.removeCallbacks(this);
            this.f20350c = true;
        }

        @Override // p277v6.InterfaceC10250b
        public boolean isDisposed() {
            return this.f20350c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f20349b.run();
            } catch (Throwable th) {
                AbstractC8462a.m13801k(th);
            }
        }
    }

    public C10199b(Handler handler, boolean z10) {
        this.f20343b = handler;
        this.f20344c = z10;
    }

    @Override // p244s6.AbstractC10049f
    /* renamed from: a */
    public AbstractC10049f.c mo13462a() {
        return new a(this.f20343b, this.f20344c);
    }

    @Override // p244s6.AbstractC10049f
    /* renamed from: b */
    public InterfaceC10250b mo13463b(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        b bVar = new b(this.f20343b, AbstractC8462a.m13803m(runnable));
        this.f20343b.postDelayed(bVar, timeUnit.toMillis(j10));
        return bVar;
    }
}
