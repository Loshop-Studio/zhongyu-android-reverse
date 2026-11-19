package p070b.p074b.p105b.p106a0;

import java.lang.reflect.Method;

/* renamed from: b.b.b.a0.v */
/* loaded from: classes.dex */
public class C0732v extends AbstractC0735y {

    /* renamed from: a */
    public final /* synthetic */ Method f4259a;

    /* renamed from: b */
    public final /* synthetic */ int f4260b;

    public C0732v(Method method, int i) {
        this.f4259a = method;
        this.f4260b = i;
    }

    @Override // p070b.p074b.p105b.p106a0.AbstractC0735y
    /* renamed from: b */
    public <T> T mo2381b(Class<T> cls) {
        AbstractC0735y.m2382a(cls);
        return (T) this.f4259a.invoke(null, cls, Integer.valueOf(this.f4260b));
    }
}
