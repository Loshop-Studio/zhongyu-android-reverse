package p070b.p074b.p105b.p106a0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p070b.p071a.p072a.p073a.C0561a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: b.b.b.a0.h */
/* loaded from: classes.dex */
public class C0718h<T> implements InterfaceC0730t<T> {

    /* renamed from: a */
    public final /* synthetic */ Constructor f4221a;

    public C0718h(C0717g c0717g, Constructor constructor) {
        this.f4221a = constructor;
    }

    @Override // p070b.p074b.p105b.p106a0.InterfaceC0730t
    /* renamed from: a */
    public T mo2365a() {
        try {
            return (T) this.f4221a.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InstantiationException e3) {
            StringBuilder sbM2079g = C0561a.m2079g("Failed to invoke ");
            sbM2079g.append(this.f4221a);
            sbM2079g.append(" with no args");
            throw new RuntimeException(sbM2079g.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sbM2079g2 = C0561a.m2079g("Failed to invoke ");
            sbM2079g2.append(this.f4221a);
            sbM2079g2.append(" with no args");
            throw new RuntimeException(sbM2079g2.toString(), e4.getTargetException());
        }
    }
}
