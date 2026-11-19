package ge;

import java.lang.ref.SoftReference;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* renamed from: ge.j1 */
/* loaded from: classes6.dex */
public final class C9341j1 {

    /* renamed from: a */
    public volatile SoftReference f21748a = new SoftReference(null);

    /* renamed from: a */
    public final synchronized Object m18469a(InterfaceC9529a factory) {
        AbstractC9979u.m20294g(factory, "factory");
        Object obj = this.f21748a.get();
        if (obj != null) {
            return obj;
        }
        Object objInvoke = factory.invoke();
        this.f21748a = new SoftReference(objInvoke);
        return objInvoke;
    }
}
