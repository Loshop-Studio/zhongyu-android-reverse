package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.channels.BufferOverflow;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

/* renamed from: kotlinx.coroutines.flow.internal.a */
/* loaded from: classes4.dex */
public abstract class AbstractC5919a {

    /* renamed from: a */
    public AbstractC5921c[] f9383a;

    /* renamed from: b */
    public int f9384b;

    /* renamed from: c */
    public int f9385c;

    /* renamed from: d */
    public C5935q f9386d;

    /* renamed from: d */
    public final AbstractC5921c m5560d() {
        AbstractC5921c abstractC5921cMo5529e;
        C5935q c5935q;
        synchronized (this) {
            try {
                AbstractC5921c[] abstractC5921cArrMo5530f = this.f9383a;
                if (abstractC5921cArrMo5530f == null) {
                    abstractC5921cArrMo5530f = mo5530f();
                    this.f9383a = abstractC5921cArrMo5530f;
                } else if (this.f9384b >= abstractC5921cArrMo5530f.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC5921cArrMo5530f, abstractC5921cArrMo5530f.length * 2);
                    AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
                    this.f9383a = (AbstractC5921c[]) objArrCopyOf;
                    abstractC5921cArrMo5530f = (AbstractC5921c[]) objArrCopyOf;
                }
                int i = this.f9385c;
                do {
                    abstractC5921cMo5529e = abstractC5921cArrMo5530f[i];
                    if (abstractC5921cMo5529e == null) {
                        abstractC5921cMo5529e = mo5529e();
                        abstractC5921cArrMo5530f[i] = abstractC5921cMo5529e;
                    }
                    i++;
                    if (i >= abstractC5921cArrMo5530f.length) {
                        i = 0;
                    }
                } while (!abstractC5921cMo5529e.mo5543a(this));
                this.f9385c = i;
                this.f9384b++;
                c5935q = this.f9386d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5935q != null) {
            c5935q.m5567v(1);
        }
        return abstractC5921cMo5529e;
    }

    /* renamed from: e */
    public abstract AbstractC5921c mo5529e();

    /* renamed from: f */
    public abstract AbstractC5921c[] mo5530f();

    /* renamed from: g */
    public final void m5561g(AbstractC5921c abstractC5921c) {
        C5935q c5935q;
        int i;
        InterfaceC5631c[] interfaceC5631cArrMo5544b;
        synchronized (this) {
            try {
                int i8 = this.f9384b - 1;
                this.f9384b = i8;
                c5935q = this.f9386d;
                if (i8 == 0) {
                    this.f9385c = 0;
                }
                AbstractC5830k.m5328e(abstractC5921c, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC5631cArrMo5544b = abstractC5921c.mo5544b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC5631c interfaceC5631c : interfaceC5631cArrMo5544b) {
            if (interfaceC5631c != null) {
                interfaceC5631c.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
            }
        }
        if (c5935q != null) {
            c5935q.m5567v(-1);
        }
    }

    /* renamed from: h */
    public final C5935q m5562h() {
        C5935q c5935q;
        synchronized (this) {
            c5935q = this.f9386d;
            if (c5935q == null) {
                int i = this.f9384b;
                c5935q = new C5935q(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
                c5935q.mo5527a(Integer.valueOf(i));
                this.f9386d = c5935q;
            }
        }
        return c5935q;
    }
}
