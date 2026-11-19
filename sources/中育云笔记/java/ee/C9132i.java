package ee;

import ee.InterfaceC9129f;
import ge.AbstractC9317e2;
import ge.AbstractC9398x1;
import ge.InterfaceC9356n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC9923a;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.AbstractC10776g;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10980x;
import p325rc.C10955k0;

/* renamed from: ee.i */
/* loaded from: classes6.dex */
public final class C9132i implements InterfaceC9129f, InterfaceC9356n {

    /* renamed from: a */
    public final String f21312a;

    /* renamed from: b */
    public final AbstractC9137n f21313b;

    /* renamed from: c */
    public final int f21314c;

    /* renamed from: d */
    public final List f21315d;

    /* renamed from: e */
    public final Set f21316e;

    /* renamed from: f */
    public final String[] f21317f;

    /* renamed from: g */
    public final InterfaceC9129f[] f21318g;

    /* renamed from: h */
    public final List[] f21319h;

    /* renamed from: i */
    public final boolean[] f21320i;

    /* renamed from: j */
    public final Map f21321j;

    /* renamed from: k */
    public final InterfaceC9129f[] f21322k;

    /* renamed from: l */
    public final InterfaceC10773d f21323l;

    public C9132i(String serialName, AbstractC9137n kind, int i10, List typeParameters, C9124a builder) {
        AbstractC9979u.m20294g(serialName, "serialName");
        AbstractC9979u.m20294g(kind, "kind");
        AbstractC9979u.m20294g(typeParameters, "typeParameters");
        AbstractC9979u.m20294g(builder, "builder");
        this.f21312a = serialName;
        this.f21313b = kind;
        this.f21314c = i10;
        this.f21315d = builder.m17949c();
        this.f21316e = AbstractC10947g0.m23920V0(builder.m17952f());
        String[] strArr = (String[]) builder.m17952f().toArray(new String[0]);
        this.f21317f = strArr;
        this.f21318g = AbstractC9398x1.m18593b(builder.m17951e());
        this.f21319h = (List[]) builder.m17950d().toArray(new List[0]);
        this.f21320i = AbstractC10947g0.m23916R0(builder.m17953g());
        Iterable<C10955k0> iterableM24117z1 = AbstractC10968r.m24117z1(strArr);
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(iterableM24117z1, 10));
        for (C10955k0 c10955k0 : iterableM24117z1) {
            arrayList.add(AbstractC10776g.m22975a(c10955k0.m23963b(), Integer.valueOf(c10955k0.m23962a())));
        }
        this.f21321j = AbstractC9925a.m20099s(arrayList);
        this.f21322k = AbstractC9398x1.m18593b(typeParameters);
        this.f21323l = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: ee.g
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return Integer.valueOf(C9132i.m17967j(this.f21310c));
            }
        });
    }

    /* renamed from: j */
    public static final int m17967j(C9132i c9132i) {
        return AbstractC9317e2.m18405a(c9132i, c9132i.f21322k);
    }

    /* renamed from: l */
    public static final CharSequence m17968l(C9132i c9132i, int i10) {
        return c9132i.mo17959d(i10) + ": " + c9132i.mo17960e(i10).mo17961f();
    }

    @Override // ge.InterfaceC9356n
    /* renamed from: a */
    public Set mo17969a() {
        return this.f21316e;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: b */
    public boolean mo17957b() {
        return InterfaceC9129f.a.m17964b(this);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: c */
    public int mo17958c() {
        return this.f21314c;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: d */
    public String mo17959d(int i10) {
        return this.f21317f[i10];
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: e */
    public InterfaceC9129f mo17960e(int i10) {
        return this.f21318g[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9132i)) {
            return false;
        }
        InterfaceC9129f interfaceC9129f = (InterfaceC9129f) obj;
        if (!AbstractC9979u.m20289b(mo17961f(), interfaceC9129f.mo17961f()) || !Arrays.equals(this.f21322k, ((C9132i) obj).f21322k) || mo17958c() != interfaceC9129f.mo17958c()) {
            return false;
        }
        int iMo17958c = mo17958c();
        for (int i10 = 0; i10 < iMo17958c; i10++) {
            if (!AbstractC9979u.m20289b(mo17960e(i10).mo17961f(), interfaceC9129f.mo17960e(i10).mo17961f()) || !AbstractC9979u.m20289b(mo17960e(i10).getKind(), interfaceC9129f.mo17960e(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: f */
    public String mo17961f() {
        return this.f21312a;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: g */
    public boolean mo17962g(int i10) {
        return this.f21320i[i10];
    }

    @Override // ee.InterfaceC9129f
    public AbstractC9137n getKind() {
        return this.f21313b;
    }

    public int hashCode() {
        return m17970k();
    }

    @Override // ee.InterfaceC9129f
    public boolean isInline() {
        return InterfaceC9129f.a.m17963a(this);
    }

    /* renamed from: k */
    public final int m17970k() {
        return ((Number) this.f21323l.getValue()).intValue();
    }

    public String toString() {
        return AbstractC10947g0.m23954w0(AbstractC10410o.m21768u(0, mo17958c()), ", ", mo17961f() + '(', ")", 0, null, new InterfaceC9540l() { // from class: ee.h
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C9132i.m17968l(this.f21311c, ((Integer) obj).intValue());
            }
        }, 24, null);
    }
}
