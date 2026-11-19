package p290w8;

import java.lang.ref.SoftReference;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* renamed from: w8.j1 */
/* loaded from: classes5.dex */
public final class C10408j1 {

    /* renamed from: a */
    public volatile SoftReference f20721a = new SoftReference(null);

    /* renamed from: a */
    public final synchronized Object m19443a(InterfaceC10559a factory) {
        AbstractC9133u.m16133g(factory, "factory");
        Object obj = this.f20721a.get();
        if (obj != null) {
            return obj;
        }
        Object objInvoke = factory.invoke();
        this.f20721a = new SoftReference(objInvoke);
        return objInvoke;
    }
}
