package ee;

import ee.AbstractC9138o;
import ge.AbstractC9347k2;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10968r;

/* renamed from: ee.m */
/* loaded from: classes6.dex */
public abstract class AbstractC9136m {
    /* renamed from: c */
    public static final InterfaceC9129f m17977c(String serialName, AbstractC9128e kind) {
        AbstractC9979u.m20294g(serialName, "serialName");
        AbstractC9979u.m20294g(kind, "kind");
        if (AbstractC10793c0.m23132h0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return AbstractC9347k2.m18481a(serialName, kind);
    }

    /* renamed from: d */
    public static final InterfaceC9129f m17978d(String serialName, InterfaceC9129f original) {
        AbstractC9979u.m20294g(serialName, "serialName");
        AbstractC9979u.m20294g(original, "original");
        if (AbstractC10793c0.m23132h0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (original.getKind() instanceof AbstractC9128e) {
            throw new IllegalArgumentException("For primitive descriptors please use 'PrimitiveSerialDescriptor' instead");
        }
        if (!AbstractC9979u.m20289b(serialName, original.mo17961f())) {
            return new C9139p(serialName, original);
        }
        throw new IllegalArgumentException(("The name of the wrapped descriptor (" + serialName + ") cannot be the same as the name of the original descriptor (" + original.mo17961f() + ')').toString());
    }

    /* renamed from: e */
    public static final InterfaceC9129f m17979e(String serialName, InterfaceC9129f[] typeParameters, InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(serialName, "serialName");
        AbstractC9979u.m20294g(typeParameters, "typeParameters");
        AbstractC9979u.m20294g(builderAction, "builderAction");
        if (AbstractC10793c0.m23132h0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C9124a c9124a = new C9124a(serialName);
        builderAction.invoke(c9124a);
        return new C9132i(serialName, AbstractC9138o.a.f21332a, c9124a.m17952f().size(), AbstractC10968r.m24097p1(typeParameters), c9124a);
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC9129f m17980f(String str, InterfaceC9129f[] interfaceC9129fArr, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: ee.k
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return AbstractC9136m.m17981g((C9124a) obj2);
                }
            };
        }
        return m17979e(str, interfaceC9129fArr, interfaceC9540l);
    }

    /* renamed from: g */
    public static final C10786q m17981g(C9124a c9124a) {
        AbstractC9979u.m20294g(c9124a, "<this>");
        return C10786q.f26013a;
    }

    /* renamed from: h */
    public static final InterfaceC9129f m17982h(String serialName, AbstractC9137n kind, InterfaceC9129f[] typeParameters, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(serialName, "serialName");
        AbstractC9979u.m20294g(kind, "kind");
        AbstractC9979u.m20294g(typeParameters, "typeParameters");
        AbstractC9979u.m20294g(builder, "builder");
        if (AbstractC10793c0.m23132h0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (AbstractC9979u.m20289b(kind, AbstractC9138o.a.f21332a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C9124a c9124a = new C9124a(serialName);
        builder.invoke(c9124a);
        return new C9132i(serialName, kind, c9124a.m17952f().size(), AbstractC10968r.m24097p1(typeParameters), c9124a);
    }

    /* renamed from: i */
    public static /* synthetic */ InterfaceC9129f m17983i(String str, AbstractC9137n abstractC9137n, InterfaceC9129f[] interfaceC9129fArr, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: ee.l
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return AbstractC9136m.m17984j((C9124a) obj2);
                }
            };
        }
        return m17982h(str, abstractC9137n, interfaceC9129fArr, interfaceC9540l);
    }

    /* renamed from: j */
    public static final C10786q m17984j(C9124a c9124a) {
        AbstractC9979u.m20294g(c9124a, "<this>");
        return C10786q.f26013a;
    }
}
