package ge;

import ee.AbstractC9137n;
import ee.AbstractC9138o;
import ee.InterfaceC9129f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10947g0;

/* renamed from: ge.d2 */
/* loaded from: classes6.dex */
public class C9312d2 implements InterfaceC9129f, InterfaceC9356n {

    /* renamed from: a */
    public final String f21690a;

    /* renamed from: b */
    public final InterfaceC9349l0 f21691b;

    /* renamed from: c */
    public final int f21692c;

    /* renamed from: d */
    public int f21693d;

    /* renamed from: e */
    public final String[] f21694e;

    /* renamed from: f */
    public final List[] f21695f;

    /* renamed from: g */
    public final boolean[] f21696g;

    /* renamed from: h */
    public Map f21697h;

    /* renamed from: i */
    public final InterfaceC10773d f21698i;

    /* renamed from: j */
    public final InterfaceC10773d f21699j;

    /* renamed from: k */
    public final InterfaceC10773d f21700k;

    public C9312d2(String serialName, InterfaceC9349l0 interfaceC9349l0, int i10) {
        AbstractC9979u.m20294g(serialName, "serialName");
        this.f21690a = serialName;
        this.f21691b = interfaceC9349l0;
        this.f21692c = i10;
        this.f21693d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f21694e = strArr;
        int i12 = this.f21692c;
        this.f21695f = new List[i12];
        this.f21696g = new boolean[i12];
        this.f21697h = AbstractC9925a.m20088h();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f23257d;
        this.f21698i = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: ge.a2
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return C9312d2.m18390p(this.f21672c);
            }
        });
        this.f21699j = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: ge.b2
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return C9312d2.m18393u(this.f21677c);
            }
        });
        this.f21700k = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: ge.c2
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return Integer.valueOf(C9312d2.m18388l(this.f21684c));
            }
        });
    }

    /* renamed from: l */
    public static final int m18388l(C9312d2 c9312d2) {
        return AbstractC9317e2.m18405a(c9312d2, c9312d2.m18397r());
    }

    /* renamed from: n */
    public static /* synthetic */ void m18389n(C9312d2 c9312d2, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        c9312d2.m18394m(str, z10);
    }

    /* renamed from: p */
    public static final InterfaceC5432b[] m18390p(C9312d2 c9312d2) {
        InterfaceC5432b[] interfaceC5432bArrChildSerializers;
        InterfaceC9349l0 interfaceC9349l0 = c9312d2.f21691b;
        return (interfaceC9349l0 == null || (interfaceC5432bArrChildSerializers = interfaceC9349l0.childSerializers()) == null) ? AbstractC9322f2.f21714a : interfaceC5432bArrChildSerializers;
    }

    /* renamed from: s */
    private final int m18391s() {
        return ((Number) this.f21700k.getValue()).intValue();
    }

    /* renamed from: t */
    public static final CharSequence m18392t(C9312d2 c9312d2, int i10) {
        return c9312d2.mo17959d(i10) + ": " + c9312d2.mo17960e(i10).mo17961f();
    }

    /* renamed from: u */
    public static final InterfaceC9129f[] m18393u(C9312d2 c9312d2) {
        ArrayList arrayList;
        InterfaceC5432b[] interfaceC5432bArrTypeParametersSerializers;
        InterfaceC9349l0 interfaceC9349l0 = c9312d2.f21691b;
        if (interfaceC9349l0 == null || (interfaceC5432bArrTypeParametersSerializers = interfaceC9349l0.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(interfaceC5432bArrTypeParametersSerializers.length);
            for (InterfaceC5432b interfaceC5432b : interfaceC5432bArrTypeParametersSerializers) {
                arrayList.add(interfaceC5432b.getDescriptor());
            }
        }
        return AbstractC9398x1.m18593b(arrayList);
    }

    @Override // ge.InterfaceC9356n
    /* renamed from: a */
    public Set mo17969a() {
        return this.f21697h.keySet();
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: b */
    public boolean mo17957b() {
        return InterfaceC9129f.a.m17964b(this);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: c */
    public final int mo17958c() {
        return this.f21692c;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: d */
    public String mo17959d(int i10) {
        return this.f21694e[i10];
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: e */
    public InterfaceC9129f mo17960e(int i10) {
        return m18396q()[i10].getDescriptor();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9312d2)) {
            return false;
        }
        InterfaceC9129f interfaceC9129f = (InterfaceC9129f) obj;
        if (!AbstractC9979u.m20289b(mo17961f(), interfaceC9129f.mo17961f()) || !Arrays.equals(m18397r(), ((C9312d2) obj).m18397r()) || mo17958c() != interfaceC9129f.mo17958c()) {
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
        return this.f21690a;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: g */
    public boolean mo17962g(int i10) {
        return this.f21696g[i10];
    }

    @Override // ee.InterfaceC9129f
    public AbstractC9137n getKind() {
        return AbstractC9138o.a.f21332a;
    }

    public int hashCode() {
        return m18391s();
    }

    @Override // ee.InterfaceC9129f
    public boolean isInline() {
        return InterfaceC9129f.a.m17963a(this);
    }

    /* renamed from: m */
    public final void m18394m(String name, boolean z10) {
        AbstractC9979u.m20294g(name, "name");
        String[] strArr = this.f21694e;
        int i10 = this.f21693d + 1;
        this.f21693d = i10;
        strArr[i10] = name;
        this.f21696g[i10] = z10;
        this.f21695f[i10] = null;
        if (i10 == this.f21692c - 1) {
            this.f21697h = m18395o();
        }
    }

    /* renamed from: o */
    public final Map m18395o() {
        HashMap map = new HashMap();
        int length = this.f21694e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f21694e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    /* renamed from: q */
    public final InterfaceC5432b[] m18396q() {
        return (InterfaceC5432b[]) this.f21698i.getValue();
    }

    /* renamed from: r */
    public final InterfaceC9129f[] m18397r() {
        return (InterfaceC9129f[]) this.f21699j.getValue();
    }

    public String toString() {
        return AbstractC10947g0.m23954w0(AbstractC10410o.m21768u(0, this.f21692c), ", ", mo17961f() + '(', ")", 0, null, new InterfaceC9540l() { // from class: ge.z1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C9312d2.m18392t(this.f21833c, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public /* synthetic */ C9312d2(String str, InterfaceC9349l0 interfaceC9349l0, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(str, (i11 & 2) != 0 ? null : interfaceC9349l0, i10);
    }
}
