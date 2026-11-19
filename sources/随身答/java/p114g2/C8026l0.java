package p114g2;

import java.lang.Thread;
import p092e2.AbstractC7839a;

/* renamed from: g2.l0 */
/* loaded from: classes4.dex */
public class C8026l0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public Thread.UncaughtExceptionHandler f13606a;

    /* renamed from: b */
    public InterfaceC8034p0 f13607b;

    public C8026l0() {
        if (Thread.getDefaultUncaughtExceptionHandler() == this) {
            return;
        }
        this.f13606a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: a */
    public void m12680a(InterfaceC8034p0 interfaceC8034p0) {
        this.f13607b = interfaceC8034p0;
    }

    /* renamed from: b */
    public final void m12681b(Throwable th) {
        if (AbstractC7839a.f13168e) {
            this.f13607b.mo6000a(th);
        } else {
            this.f13607b.mo6000a(null);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        m12681b(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13606a;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == Thread.getDefaultUncaughtExceptionHandler()) {
            return;
        }
        this.f13606a.uncaughtException(thread, th);
    }
}
