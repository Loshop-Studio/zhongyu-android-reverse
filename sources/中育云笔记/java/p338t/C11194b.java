package p338t;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* renamed from: t.b */
/* loaded from: classes3.dex */
public final class C11194b {

    /* renamed from: a */
    public InterfaceC9540l f26885a;

    /* renamed from: b */
    public Object f26886b = C11196d.f26887a;

    public C11194b(InterfaceC9540l interfaceC9540l) {
        this.f26885a = interfaceC9540l;
    }

    /* renamed from: a */
    public final Object m24904a(Object obj) {
        Object objInvoke;
        Object obj2 = this.f26886b;
        C11196d c11196d = C11196d.f26887a;
        if (obj2 != c11196d) {
            return obj2;
        }
        synchronized (this) {
            objInvoke = this.f26886b;
            if (objInvoke == c11196d) {
                InterfaceC9540l interfaceC9540l = this.f26885a;
                AbstractC9979u.m20291d(interfaceC9540l);
                objInvoke = interfaceC9540l.invoke(obj);
                this.f26886b = objInvoke;
                this.f26885a = null;
            }
        }
        return objInvoke;
    }
}
