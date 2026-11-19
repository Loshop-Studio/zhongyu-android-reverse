package p070b.p074b.p105b.p106a0;

import java.lang.reflect.Method;

/* renamed from: b.b.b.a0.u */
/* loaded from: classes.dex */
public class C0731u extends AbstractC0735y {

    /* renamed from: a */
    public final /* synthetic */ Method f4257a;

    /* renamed from: b */
    public final /* synthetic */ Object f4258b;

    public C0731u(Method method, Object obj) {
        this.f4257a = method;
        this.f4258b = obj;
    }

    @Override // p070b.p074b.p105b.p106a0.AbstractC0735y
    /* renamed from: b */
    public <T> T mo2381b(Class<T> cls) {
        AbstractC0735y.m2382a(cls);
        return (T) this.f4257a.invoke(this.f4258b, cls);
    }
}
