package p260v;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v.b */
/* loaded from: classes3.dex */
public final class C9623b {

    /* renamed from: a */
    public Function1 f16809a;

    /* renamed from: b */
    public Object f16810b = C9625d.f16811a;

    public C9623b(Function1 function1) {
        this.f16809a = function1;
    }

    /* renamed from: a */
    public final Object m15991a(Object obj) {
        Object objInvoke;
        Object obj2 = this.f16810b;
        C9625d c9625d = C9625d.f16811a;
        if (obj2 != c9625d) {
            return obj2;
        }
        synchronized (this) {
            objInvoke = this.f16810b;
            if (objInvoke == c9625d) {
                Function1 function1 = this.f16809a;
                Intrinsics.checkNotNull(function1);
                objInvoke = function1.invoke(obj);
                this.f16810b = objInvoke;
                this.f16809a = null;
            }
        }
        return objInvoke;
    }
}
