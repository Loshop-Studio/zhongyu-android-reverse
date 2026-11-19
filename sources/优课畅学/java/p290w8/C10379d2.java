package p290w8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10218n;
import p268u8.AbstractC10219o;
import p268u8.InterfaceC10210f;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* renamed from: w8.d2 */
/* loaded from: classes5.dex */
public class C10379d2 implements InterfaceC10210f, InterfaceC10423n {

    /* renamed from: a */
    public final String f20663a;

    /* renamed from: b */
    public final InterfaceC10416l0 f20664b;

    /* renamed from: c */
    public final int f20665c;

    /* renamed from: d */
    public int f20666d;

    /* renamed from: e */
    public final String[] f20667e;

    /* renamed from: f */
    public final List[] f20668f;

    /* renamed from: g */
    public final boolean[] f20669g;

    /* renamed from: h */
    public Map f20670h;

    /* renamed from: i */
    public final InterfaceC8724d f20671i;

    /* renamed from: j */
    public final InterfaceC8724d f20672j;

    /* renamed from: k */
    public final InterfaceC8724d f20673k;

    public C10379d2(String serialName, InterfaceC10416l0 interfaceC10416l0, int i10) {
        AbstractC9133u.m16133g(serialName, "serialName");
        this.f20663a = serialName;
        this.f20664b = interfaceC10416l0;
        this.f20665c = i10;
        this.f20666d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f20667e = strArr;
        int i12 = this.f20665c;
        this.f20668f = new List[i12];
        this.f20669g = new boolean[i12];
        this.f20670h = AbstractC9080a.m15943h();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f17344b;
        this.f20671i = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: w8.a2
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C10379d2.m19364p(this.f20645a);
            }
        });
        this.f20672j = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: w8.b2
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C10379d2.m19367u(this.f20650a);
            }
        });
        this.f20673k = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: w8.c2
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return Integer.valueOf(C10379d2.m19362l(this.f20657a));
            }
        });
    }

    /* renamed from: l */
    public static final int m19362l(C10379d2 c10379d2) {
        return AbstractC10384e2.m19379a(c10379d2, c10379d2.m19371r());
    }

    /* renamed from: n */
    public static /* synthetic */ void m19363n(C10379d2 c10379d2, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        c10379d2.m19368m(str, z10);
    }

    /* renamed from: p */
    public static final InterfaceC10052b[] m19364p(C10379d2 c10379d2) {
        InterfaceC10052b[] interfaceC10052bArrChildSerializers;
        InterfaceC10416l0 interfaceC10416l0 = c10379d2.f20664b;
        return (interfaceC10416l0 == null || (interfaceC10052bArrChildSerializers = interfaceC10416l0.childSerializers()) == null) ? AbstractC10389f2.f20687a : interfaceC10052bArrChildSerializers;
    }

    /* renamed from: s */
    private final int m19365s() {
        return ((Number) this.f20673k.getValue()).intValue();
    }

    /* renamed from: t */
    public static final CharSequence m19366t(C10379d2 c10379d2, int i10) {
        return c10379d2.mo19087d(i10) + ": " + c10379d2.mo19088e(i10).mo19089f();
    }

    /* renamed from: u */
    public static final InterfaceC10210f[] m19367u(C10379d2 c10379d2) {
        ArrayList arrayList;
        InterfaceC10052b[] interfaceC10052bArrTypeParametersSerializers;
        InterfaceC10416l0 interfaceC10416l0 = c10379d2.f20664b;
        if (interfaceC10416l0 == null || (interfaceC10052bArrTypeParametersSerializers = interfaceC10416l0.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(interfaceC10052bArrTypeParametersSerializers.length);
            for (InterfaceC10052b interfaceC10052b : interfaceC10052bArrTypeParametersSerializers) {
                arrayList.add(interfaceC10052b.getDescriptor());
            }
        }
        return AbstractC10465x1.m19565b(arrayList);
    }

    @Override // p290w8.InterfaceC10423n
    /* renamed from: a */
    public Set mo19097a() {
        return this.f20670h.keySet();
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: b */
    public boolean mo19085b() {
        return InterfaceC10210f.a.m19092b(this);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: c */
    public final int mo19086c() {
        return this.f20665c;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: d */
    public String mo19087d(int i10) {
        return this.f20667e[i10];
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: e */
    public InterfaceC10210f mo19088e(int i10) {
        return m19370q()[i10].getDescriptor();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10379d2)) {
            return false;
        }
        InterfaceC10210f interfaceC10210f = (InterfaceC10210f) obj;
        if (!AbstractC9133u.m16128b(mo19089f(), interfaceC10210f.mo19089f()) || !Arrays.equals(m19371r(), ((C10379d2) obj).m19371r()) || mo19086c() != interfaceC10210f.mo19086c()) {
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
        return this.f20663a;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: g */
    public boolean mo19090g(int i10) {
        return this.f20669g[i10];
    }

    @Override // p268u8.InterfaceC10210f
    public AbstractC10218n getKind() {
        return AbstractC10219o.a.f20393a;
    }

    public int hashCode() {
        return m19365s();
    }

    @Override // p268u8.InterfaceC10210f
    public boolean isInline() {
        return InterfaceC10210f.a.m19091a(this);
    }

    /* renamed from: m */
    public final void m19368m(String name, boolean z10) {
        AbstractC9133u.m16133g(name, "name");
        String[] strArr = this.f20667e;
        int i10 = this.f20666d + 1;
        this.f20666d = i10;
        strArr[i10] = name;
        this.f20669g[i10] = z10;
        this.f20668f[i10] = null;
        if (i10 == this.f20665c - 1) {
            this.f20670h = m19369o();
        }
    }

    /* renamed from: o */
    public final Map m19369o() {
        HashMap map = new HashMap();
        int length = this.f20667e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f20667e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    /* renamed from: q */
    public final InterfaceC10052b[] m19370q() {
        return (InterfaceC10052b[]) this.f20671i.getValue();
    }

    /* renamed from: r */
    public final InterfaceC10210f[] m19371r() {
        return (InterfaceC10210f[]) this.f20672j.getValue();
    }

    public String toString() {
        return AbstractC8778f0.m14576v0(AbstractC8323h.m13525t(0, this.f20665c), ", ", mo19089f() + '(', ")", 0, null, new InterfaceC10570l() { // from class: w8.z1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return C10379d2.m19366t(this.f20806a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public /* synthetic */ C10379d2(String str, InterfaceC10416l0 interfaceC10416l0, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(str, (i11 & 2) != 0 ? null : interfaceC10416l0, i10);
    }
}
