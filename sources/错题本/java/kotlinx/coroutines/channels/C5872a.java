package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.InterfaceC6008u1;
import p054e7.AbstractC5484p;
import p054e7.AbstractC5485q;
import p054e7.C5486r;
import p185v7.AbstractC6683l;

/* renamed from: kotlinx.coroutines.channels.a */
/* loaded from: classes4.dex */
public final class C5872a implements InterfaceC6008u1 {

    /* renamed from: a */
    public Object f9292a = AbstractC5874c.f9320p;

    /* renamed from: b */
    public C5961g f9293b;

    /* renamed from: c */
    public final /* synthetic */ C5873b f9294c;

    public C5872a(C5873b c5873b) {
        this.f9294c = c5873b;
    }

    @Override // kotlinx.coroutines.InterfaceC6008u1
    /* renamed from: a */
    public final void mo4962a(AbstractC5484p abstractC5484p, int i) {
        C5961g c5961g = this.f9293b;
        if (c5961g != null) {
            c5961g.mo4962a(abstractC5484p, i);
        }
    }

    /* renamed from: b */
    public final Object m5466b(ContinuationImpl continuationImpl) throws Throwable {
        C5880i c5880i;
        Boolean bool;
        C5880i c5880i2;
        Object obj = this.f9292a;
        boolean z8 = true;
        if (obj == AbstractC5874c.f9320p || obj == AbstractC5874c.f9316l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5873b.f9300g;
            C5873b c5873b = this.f9294c;
            C5880i c5880i3 = (C5880i) atomicReferenceFieldUpdater.get(c5873b);
            while (!c5873b.m5498v()) {
                long andIncrement = C5873b.f9296c.getAndIncrement(c5873b);
                long j7 = AbstractC5874c.f9306b;
                long j8 = andIncrement / j7;
                int i = (int) (andIncrement % j7);
                if (c5880i3.f8478c != j8) {
                    C5880i c5880iM5490m = c5873b.m5490m(j8, c5880i3);
                    if (c5880iM5490m == null) {
                        continue;
                    } else {
                        c5880i = c5880iM5490m;
                    }
                } else {
                    c5880i = c5880i3;
                }
                Object objM5478G = c5873b.m5478G(c5880i, i, andIncrement, null);
                C5486r c5486r = AbstractC5874c.f9317m;
                if (objM5478G == c5486r) {
                    throw new IllegalStateException("unreachable");
                }
                C5486r c5486r2 = AbstractC5874c.f9319o;
                if (objM5478G == c5486r2) {
                    if (andIncrement < c5873b.m5496s()) {
                        c5880i.m4839a();
                    }
                    c5880i3 = c5880i;
                } else {
                    if (objM5478G == AbstractC5874c.f9318n) {
                        C5961g c5961gM5644o = AbstractC6014x.m5644o(AbstractC6683l.m6374n(continuationImpl));
                        try {
                            this.f9293b = c5961gM5644o;
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            Object objM5478G2 = c5873b.m5478G(c5880i, i, andIncrement, this);
                            if (objM5478G2 == c5486r) {
                                mo4962a(c5880i, i);
                            } else {
                                if (objM5478G2 == c5486r2) {
                                    if (andIncrement < c5873b.m5496s()) {
                                        c5880i.m4839a();
                                    }
                                    C5880i c5880i4 = (C5880i) C5873b.f9300g.get(c5873b);
                                    while (true) {
                                        if (c5873b.m5498v()) {
                                            C5961g c5961g = this.f9293b;
                                            AbstractC5830k.m5327d(c5961g);
                                            this.f9293b = null;
                                            this.f9292a = AbstractC5874c.f9316l;
                                            Throwable thM5491n = c5873b.m5491n();
                                            if (thM5491n == null) {
                                                c5961g.resumeWith(Result.m13956constructorimpl(Boolean.FALSE));
                                            } else {
                                                c5961g.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(thM5491n)));
                                            }
                                        } else {
                                            long andIncrement2 = C5873b.f9296c.getAndIncrement(c5873b);
                                            long j9 = AbstractC5874c.f9306b;
                                            long j10 = andIncrement2 / j9;
                                            int i8 = (int) (andIncrement2 % j9);
                                            if (c5880i4.f8478c != j10) {
                                                C5880i c5880iM5490m2 = c5873b.m5490m(j10, c5880i4);
                                                if (c5880iM5490m2 != null) {
                                                    c5880i2 = c5880iM5490m2;
                                                }
                                            } else {
                                                c5880i2 = c5880i4;
                                            }
                                            Object objM5478G3 = c5873b.m5478G(c5880i2, i8, andIncrement2, this);
                                            C5880i c5880i5 = c5880i2;
                                            if (objM5478G3 == AbstractC5874c.f9317m) {
                                                mo4962a(c5880i5, i8);
                                                break;
                                            }
                                            if (objM5478G3 == AbstractC5874c.f9319o) {
                                                if (andIncrement2 < c5873b.m5496s()) {
                                                    c5880i5.m4839a();
                                                }
                                                c5880i4 = c5880i5;
                                            } else {
                                                if (objM5478G3 == AbstractC5874c.f9318n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                c5880i5.m4839a();
                                                this.f9292a = objM5478G3;
                                                this.f9293b = null;
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                    }
                                } else {
                                    c5880i.m4839a();
                                    this.f9292a = objM5478G2;
                                    this.f9293b = null;
                                    bool = Boolean.TRUE;
                                }
                                c5961gM5644o.mo4963b(bool, null);
                            }
                            Object objM5583t = c5961gM5644o.m5583t();
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            return objM5583t;
                        } catch (Throwable th2) {
                            th = th2;
                            c5961gM5644o.m5574A();
                            throw th;
                        }
                    }
                    c5880i.m4839a();
                    this.f9292a = objM5478G;
                }
            }
            this.f9292a = AbstractC5874c.f9316l;
            Throwable thM5491n2 = c5873b.m5491n();
            if (thM5491n2 != null) {
                int i9 = AbstractC5485q.f8479a;
                throw thM5491n2;
            }
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }

    /* renamed from: c */
    public final Object m5467c() throws Throwable {
        Object obj = this.f9292a;
        C5486r c5486r = AbstractC5874c.f9320p;
        if (obj == c5486r) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f9292a = c5486r;
        if (obj != AbstractC5874c.f9316l) {
            return obj;
        }
        Throwable thM5493p = this.f9294c.m5493p();
        int i = AbstractC5485q.f8479a;
        throw thM5493p;
    }
}
