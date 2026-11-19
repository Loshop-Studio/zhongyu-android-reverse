package p267v;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v.b */
/* loaded from: classes3.dex */
public final class C9736b {

    /* renamed from: a */
    public Function1 f17203a;

    /* renamed from: b */
    public Object f17204b = C9738d.f17205a;

    public C9736b(Function1 function1) {
        this.f17203a = function1;
    }

    /* renamed from: a */
    public final Object m16276a(Object obj) {
        Object objInvoke;
        Object obj2 = this.f17204b;
        C9738d c9738d = C9738d.f17205a;
        if (obj2 != c9738d) {
            return obj2;
        }
        synchronized (this) {
            objInvoke = this.f17204b;
            if (objInvoke == c9738d) {
                Function1 function1 = this.f17203a;
                Intrinsics.checkNotNull(function1);
                objInvoke = function1.invoke(obj);
                this.f17204b = objInvoke;
                this.f17203a = null;
            }
        }
        return objInvoke;
    }
}
