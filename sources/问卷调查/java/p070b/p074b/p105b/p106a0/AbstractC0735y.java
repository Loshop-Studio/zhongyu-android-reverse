package p070b.p074b.p105b.p106a0;

import java.lang.reflect.Modifier;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: b.b.b.a0.y */
/* loaded from: classes.dex */
public abstract class AbstractC0735y {
    /* renamed from: a */
    public static void m2382a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sbM2079g = C0561a.m2079g("Interface can't be instantiated! Interface name: ");
            sbM2079g.append(cls.getName());
            throw new UnsupportedOperationException(sbM2079g.toString());
        }
        if (Modifier.isAbstract(modifiers)) {
            StringBuilder sbM2079g2 = C0561a.m2079g("Abstract class can't be instantiated! Class name: ");
            sbM2079g2.append(cls.getName());
            throw new UnsupportedOperationException(sbM2079g2.toString());
        }
    }

    /* renamed from: b */
    public abstract <T> T mo2381b(Class<T> cls);
}
