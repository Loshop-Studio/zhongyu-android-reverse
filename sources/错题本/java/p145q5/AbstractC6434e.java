package p145q5;

import android.support.v4.media.AbstractC0037f;
import io.reactivex.internal.operators.observable.C5710f;
import io.reactivex.internal.operators.observable.C5714j;
import p073h4.AbstractC5625a;
import p151r5.C6468e;
import p183v5.AbstractC6668a;
import p185v7.AbstractC6675d;

/* renamed from: q5.e */
/* loaded from: classes3.dex */
public abstract class AbstractC6434e<T> {
    /* renamed from: a */
    public final C5710f m6077a(C6468e c6468e) {
        int i = AbstractC6431b.f10558a;
        if (i > 0) {
            return new C5710f(this, c6468e, i);
        }
        throw new IllegalArgumentException(AbstractC0037f.m81f(i, "bufferSize > 0 required but it was "));
    }

    /* renamed from: b */
    public final void m6078b(InterfaceC6436g interfaceC6436g) {
        try {
            mo2173c(interfaceC6436g);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            AbstractC5625a.m4956p(th);
            AbstractC6675d.m6351q(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: c */
    public abstract void mo2173c(InterfaceC6436g interfaceC6436g);

    /* renamed from: d */
    public final C5714j m6079d(AbstractC6439j abstractC6439j) {
        AbstractC6668a.m6328a(abstractC6439j, "scheduler is null");
        return new C5714j(this, abstractC6439j, 0);
    }
}
