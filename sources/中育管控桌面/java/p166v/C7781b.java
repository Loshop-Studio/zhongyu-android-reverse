package p166v;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v.b */
/* loaded from: classes3.dex */
public final class C7781b {

    /* renamed from: a */
    public Function1 f10304a;

    /* renamed from: b */
    public Object f10305b = C7783d.f10306a;

    public C7781b(Function1 function1) {
        this.f10304a = function1;
    }

    /* renamed from: a */
    public final Object m9317a(Object obj) {
        Object objInvoke;
        Object obj2 = this.f10305b;
        C7783d c7783d = C7783d.f10306a;
        if (obj2 != c7783d) {
            return obj2;
        }
        synchronized (this) {
            objInvoke = this.f10305b;
            if (objInvoke == c7783d) {
                Function1 function1 = this.f10304a;
                Intrinsics.checkNotNull(function1);
                objInvoke = function1.invoke(obj);
                this.f10305b = objInvoke;
                this.f10304a = null;
            }
        }
        return objInvoke;
    }
}
