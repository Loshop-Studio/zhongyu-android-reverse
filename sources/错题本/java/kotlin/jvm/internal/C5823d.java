package kotlin.jvm.internal;

import androidx.compose.runtime.internal.ComposableLambda;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5806u;
import kotlin.text.AbstractC5855p;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6470b;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6472d;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p152r6.InterfaceC6475g;
import p152r6.InterfaceC6476h;
import p152r6.InterfaceC6477i;
import p152r6.InterfaceC6478j;
import p185v7.AbstractC6675d;
import p207y6.InterfaceC6779c;

/* renamed from: kotlin.jvm.internal.d */
/* loaded from: classes2.dex */
public final class C5823d implements InterfaceC6779c, InterfaceC5822c {

    /* renamed from: b */
    public static final Map f9217b;

    /* renamed from: a */
    public final Class f9218a;

    static {
        List listM5287z = AbstractC5806u.m5287z(InterfaceC6469a.class, InterfaceC6471c.class, InterfaceC6473e.class, InterfaceC6474f.class, InterfaceC6475g.class, InterfaceC6476h.class, InterfaceC6477i.class, InterfaceC6478j.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, InterfaceC6470b.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, InterfaceC6472d.class);
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(listM5287z, 10));
        int i = 0;
        for (Object obj : listM5287z) {
            int i8 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i8;
        }
        f9217b = AbstractC5785e0.m5155I(arrayList);
    }

    public C5823d(Class jClass) {
        AbstractC5830k.m5330g(jClass, "jClass");
        this.f9218a = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC5822c
    /* renamed from: c */
    public final Class mo5318c() {
        return this.f9218a;
    }

    /* renamed from: d */
    public final String m5319d() {
        String strM5355d;
        Class jClass = this.f9218a;
        AbstractC5830k.m5330g(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String strM5355d2 = AbstractC5835p.m5355d(jClass.getName());
            return strM5355d2 == null ? jClass.getCanonicalName() : strM5355d2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (strM5355d = AbstractC5835p.m5355d(componentType.getName())) != null) {
            strConcat = strM5355d.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    /* renamed from: e */
    public final String m5320e() {
        String strM5358g;
        Class jClass = this.f9218a;
        AbstractC5830k.m5330g(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String strM5358g2 = AbstractC5835p.m5358g(jClass.getName());
                return strM5358g2 == null ? jClass.getSimpleName() : strM5358g2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (strM5358g = AbstractC5835p.m5358g(componentType.getName())) != null) {
                strConcat = strM5358g.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC5855p.m5396d0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return AbstractC5855p.m5395c0('$', simpleName, simpleName);
        }
        return AbstractC5855p.m5396d0(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5823d) && AbstractC6675d.m6350n(this).equals(AbstractC6675d.m6350n((InterfaceC6779c) obj));
    }

    /* renamed from: f */
    public final boolean m5321f(Object obj) {
        Class jClass = this.f9218a;
        AbstractC5830k.m5330g(jClass, "jClass");
        Map map = f9217b;
        AbstractC5830k.m5328e(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return AbstractC5835p.m5356e(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = AbstractC6675d.m6350n(AbstractC5832m.m5340a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final int hashCode() {
        return AbstractC6675d.m6350n(this).hashCode();
    }

    public final String toString() {
        return this.f9218a + " (Kotlin reflection is not available)";
    }
}
