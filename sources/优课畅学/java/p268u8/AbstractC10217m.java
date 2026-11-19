package p268u8;

import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p134i7.AbstractC8801r;
import p268u8.AbstractC10219o;
import p290w8.AbstractC10414k2;
import p300x7.InterfaceC10570l;

/* renamed from: u8.m */
/* loaded from: classes5.dex */
public abstract class AbstractC10217m {
    /* renamed from: c */
    public static final InterfaceC10210f m19105c(String serialName, AbstractC10209e kind) {
        AbstractC9133u.m16133g(serialName, "serialName");
        AbstractC9133u.m16133g(kind, "kind");
        if (AbstractC8661c0.m13993h0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return AbstractC10414k2.m19455a(serialName, kind);
    }

    /* renamed from: d */
    public static final InterfaceC10210f m19106d(String serialName, InterfaceC10210f original) {
        AbstractC9133u.m16133g(serialName, "serialName");
        AbstractC9133u.m16133g(original, "original");
        if (AbstractC8661c0.m13993h0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (original.getKind() instanceof AbstractC10209e) {
            throw new IllegalArgumentException("For primitive descriptors please use 'PrimitiveSerialDescriptor' instead");
        }
        if (!AbstractC9133u.m16128b(serialName, original.mo19089f())) {
            return new C10220p(serialName, original);
        }
        throw new IllegalArgumentException(("The name of the wrapped descriptor (" + serialName + ") cannot be the same as the name of the original descriptor (" + original.mo19089f() + ')').toString());
    }

    /* renamed from: e */
    public static final InterfaceC10210f m19107e(String serialName, InterfaceC10210f[] typeParameters, InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(serialName, "serialName");
        AbstractC9133u.m16133g(typeParameters, "typeParameters");
        AbstractC9133u.m16133g(builderAction, "builderAction");
        if (AbstractC8661c0.m13993h0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C10205a c10205a = new C10205a(serialName);
        builderAction.invoke(c10205a);
        return new C10213i(serialName, AbstractC10219o.a.f20393a, c10205a.m19080f().size(), AbstractC8801r.m14736u1(typeParameters), c10205a);
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC10210f m19108f(String str, InterfaceC10210f[] interfaceC10210fArr, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: u8.k
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return AbstractC10217m.m19109g((C10205a) obj2);
                }
            };
        }
        return m19107e(str, interfaceC10210fArr, interfaceC10570l);
    }

    /* renamed from: g */
    public static final C8736p m19109g(C10205a c10205a) {
        AbstractC9133u.m16133g(c10205a, "<this>");
        return C8736p.f16368a;
    }

    /* renamed from: h */
    public static final InterfaceC10210f m19110h(String serialName, AbstractC10218n kind, InterfaceC10210f[] typeParameters, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(serialName, "serialName");
        AbstractC9133u.m16133g(kind, "kind");
        AbstractC9133u.m16133g(typeParameters, "typeParameters");
        AbstractC9133u.m16133g(builder, "builder");
        if (AbstractC8661c0.m13993h0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (AbstractC9133u.m16128b(kind, AbstractC10219o.a.f20393a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C10205a c10205a = new C10205a(serialName);
        builder.invoke(c10205a);
        return new C10213i(serialName, kind, c10205a.m19080f().size(), AbstractC8801r.m14736u1(typeParameters), c10205a);
    }

    /* renamed from: i */
    public static /* synthetic */ InterfaceC10210f m19111i(String str, AbstractC10218n abstractC10218n, InterfaceC10210f[] interfaceC10210fArr, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: u8.l
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return AbstractC10217m.m19112j((C10205a) obj2);
                }
            };
        }
        return m19110h(str, abstractC10218n, interfaceC10210fArr, interfaceC10570l);
    }

    /* renamed from: j */
    public static final C8736p m19112j(C10205a c10205a) {
        AbstractC9133u.m16133g(c10205a, "<this>");
        return C8736p.f16368a;
    }
}
