package p268u8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC9078a;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p123h7.AbstractC8726f;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8811w;
import p134i7.C8786j0;
import p268u8.InterfaceC10210f;
import p290w8.AbstractC10384e2;
import p290w8.AbstractC10465x1;
import p290w8.InterfaceC10423n;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* renamed from: u8.i */
/* loaded from: classes5.dex */
public final class C10213i implements InterfaceC10210f, InterfaceC10423n {

    /* renamed from: a */
    public final String f20373a;

    /* renamed from: b */
    public final AbstractC10218n f20374b;

    /* renamed from: c */
    public final int f20375c;

    /* renamed from: d */
    public final List f20376d;

    /* renamed from: e */
    public final Set f20377e;

    /* renamed from: f */
    public final String[] f20378f;

    /* renamed from: g */
    public final InterfaceC10210f[] f20379g;

    /* renamed from: h */
    public final List[] f20380h;

    /* renamed from: i */
    public final boolean[] f20381i;

    /* renamed from: j */
    public final Map f20382j;

    /* renamed from: k */
    public final InterfaceC10210f[] f20383k;

    /* renamed from: l */
    public final InterfaceC8724d f20384l;

    public C10213i(String serialName, AbstractC10218n kind, int i10, List typeParameters, C10205a builder) {
        AbstractC9133u.m16133g(serialName, "serialName");
        AbstractC9133u.m16133g(kind, "kind");
        AbstractC9133u.m16133g(typeParameters, "typeParameters");
        AbstractC9133u.m16133g(builder, "builder");
        this.f20373a = serialName;
        this.f20374b = kind;
        this.f20375c = i10;
        this.f20376d = builder.m19077c();
        this.f20377e = AbstractC8778f0.m14542S0(builder.m19080f());
        String[] strArr = (String[]) builder.m19080f().toArray(new String[0]);
        this.f20378f = strArr;
        this.f20379g = AbstractC10465x1.m19565b(builder.m19079e());
        this.f20380h = (List[]) builder.m19078d().toArray(new List[0]);
        this.f20381i = AbstractC8778f0.m14538O0(builder.m19081g());
        Iterable<C8786j0> iterableM14675E1 = AbstractC8801r.m14675E1(strArr);
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(iterableM14675E1, 10));
        for (C8786j0 c8786j0 : iterableM14675E1) {
            arrayList.add(AbstractC8726f.m14230a(c8786j0.m14585b(), Integer.valueOf(c8786j0.m14584a())));
        }
        this.f20382j = AbstractC9080a.m15954s(arrayList);
        this.f20383k = AbstractC10465x1.m19565b(typeParameters);
        this.f20384l = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: u8.g
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return Integer.valueOf(C10213i.m19095j(this.f20371a));
            }
        });
    }

    /* renamed from: j */
    public static final int m19095j(C10213i c10213i) {
        return AbstractC10384e2.m19379a(c10213i, c10213i.f20383k);
    }

    /* renamed from: l */
    public static final CharSequence m19096l(C10213i c10213i, int i10) {
        return c10213i.mo19087d(i10) + ": " + c10213i.mo19088e(i10).mo19089f();
    }

    @Override // p290w8.InterfaceC10423n
    /* renamed from: a */
    public Set mo19097a() {
        return this.f20377e;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: b */
    public boolean mo19085b() {
        return InterfaceC10210f.a.m19092b(this);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: c */
    public int mo19086c() {
        return this.f20375c;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: d */
    public String mo19087d(int i10) {
        return this.f20378f[i10];
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: e */
    public InterfaceC10210f mo19088e(int i10) {
        return this.f20379g[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10213i)) {
            return false;
        }
        InterfaceC10210f interfaceC10210f = (InterfaceC10210f) obj;
        if (!AbstractC9133u.m16128b(mo19089f(), interfaceC10210f.mo19089f()) || !Arrays.equals(this.f20383k, ((C10213i) obj).f20383k) || mo19086c() != interfaceC10210f.mo19086c()) {
            return false;
        }
        int iMo19086c = mo19086c();
        for (int i10 = 0; i10 < iMo19086c; i10++) {
            if (!AbstractC9133u.m16128b(mo19088e(i10).mo19089f(), interfaceC10210f.mo19088e(i10).mo19089f()) || !AbstractC9133u.m16128b(mo19088e(i10).getKind(), interfaceC10210f.mo19088e(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: f */
    public String mo19089f() {
        return this.f20373a;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: g */
    public boolean mo19090g(int i10) {
        return this.f20381i[i10];
    }

    @Override // p268u8.InterfaceC10210f
    public AbstractC10218n getKind() {
        return this.f20374b;
    }

    public int hashCode() {
        return m19098k();
    }

    @Override // p268u8.InterfaceC10210f
    public boolean isInline() {
        return InterfaceC10210f.a.m19091a(this);
    }

    /* renamed from: k */
    public final int m19098k() {
        return ((Number) this.f20384l.getValue()).intValue();
    }

    public String toString() {
        return AbstractC8778f0.m14576v0(AbstractC8323h.m13525t(0, mo19086c()), ", ", mo19089f() + '(', ")", 0, null, new InterfaceC10570l() { // from class: u8.h
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return C10213i.m19096l(this.f20372a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }
}
