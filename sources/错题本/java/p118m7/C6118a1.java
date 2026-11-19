package p118m7;

import coil3.network.AbstractC3315g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5686b;
import p101k7.C5770l;
import p101k7.InterfaceC5765g;
import p152r6.InterfaceC6469a;

/* renamed from: m7.a1 */
/* loaded from: classes4.dex */
public class C6118a1 implements InterfaceC5765g, InterfaceC6151l {

    /* renamed from: a */
    public final String f9764a;

    /* renamed from: b */
    public final InterfaceC6125c0 f9765b;

    /* renamed from: c */
    public final int f9766c;

    /* renamed from: d */
    public int f9767d = -1;

    /* renamed from: e */
    public final String[] f9768e;

    /* renamed from: f */
    public final List[] f9769f;

    /* renamed from: g */
    public final boolean[] f9770g;

    /* renamed from: h */
    public Object f9771h;

    /* renamed from: i */
    public final Object f9772i;

    /* renamed from: j */
    public final Object f9773j;

    /* renamed from: k */
    public final Object f9774k;

    public C6118a1(String str, InterfaceC6125c0 interfaceC6125c0, int i) {
        this.f9764a = str;
        this.f9765b = interfaceC6125c0;
        this.f9766c = i;
        String[] strArr = new String[i];
        for (int i8 = 0; i8 < i; i8++) {
            strArr[i8] = "[UNINITIALIZED]";
        }
        this.f9768e = strArr;
        int i9 = this.f9766c;
        this.f9769f = new List[i9];
        this.f9770g = new boolean[i9];
        this.f9771h = AbstractC5785e0.m5147A();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final int i10 = 0;
        this.f9772i = AbstractC5773a.m5116a(lazyThreadSafetyMode, new InterfaceC6469a(this) { // from class: m7.z0

            /* renamed from: b */
            public final /* synthetic */ C6118a1 f9903b;

            {
                this.f9903b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [d6.e, java.lang.Object] */
            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                InterfaceC5686b[] interfaceC5686bArrChildSerializers;
                ArrayList arrayList;
                InterfaceC5686b[] interfaceC5686bArrTypeParametersSerializers;
                switch (i10) {
                    case 0:
                        InterfaceC6125c0 interfaceC6125c02 = this.f9903b.f9765b;
                        return (interfaceC6125c02 == null || (interfaceC5686bArrChildSerializers = interfaceC6125c02.childSerializers()) == null) ? AbstractC6191y0.f9897b : interfaceC5686bArrChildSerializers;
                    case 1:
                        InterfaceC6125c0 interfaceC6125c03 = this.f9903b.f9765b;
                        if (interfaceC6125c03 == null || (interfaceC5686bArrTypeParametersSerializers = interfaceC6125c03.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC5686bArrTypeParametersSerializers.length);
                            for (InterfaceC5686b interfaceC5686b : interfaceC5686bArrTypeParametersSerializers) {
                                arrayList.add(interfaceC5686b.getDescriptor());
                            }
                        }
                        return AbstractC6191y0.m5833c(arrayList);
                    default:
                        C6118a1 c6118a1 = this.f9903b;
                        return Integer.valueOf(AbstractC6191y0.m5836f(c6118a1, (InterfaceC5765g[]) c6118a1.f9773j.getValue()));
                }
            }
        });
        final int i11 = 1;
        this.f9773j = AbstractC5773a.m5116a(lazyThreadSafetyMode, new InterfaceC6469a(this) { // from class: m7.z0

            /* renamed from: b */
            public final /* synthetic */ C6118a1 f9903b;

            {
                this.f9903b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [d6.e, java.lang.Object] */
            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                InterfaceC5686b[] interfaceC5686bArrChildSerializers;
                ArrayList arrayList;
                InterfaceC5686b[] interfaceC5686bArrTypeParametersSerializers;
                switch (i11) {
                    case 0:
                        InterfaceC6125c0 interfaceC6125c02 = this.f9903b.f9765b;
                        return (interfaceC6125c02 == null || (interfaceC5686bArrChildSerializers = interfaceC6125c02.childSerializers()) == null) ? AbstractC6191y0.f9897b : interfaceC5686bArrChildSerializers;
                    case 1:
                        InterfaceC6125c0 interfaceC6125c03 = this.f9903b.f9765b;
                        if (interfaceC6125c03 == null || (interfaceC5686bArrTypeParametersSerializers = interfaceC6125c03.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC5686bArrTypeParametersSerializers.length);
                            for (InterfaceC5686b interfaceC5686b : interfaceC5686bArrTypeParametersSerializers) {
                                arrayList.add(interfaceC5686b.getDescriptor());
                            }
                        }
                        return AbstractC6191y0.m5833c(arrayList);
                    default:
                        C6118a1 c6118a1 = this.f9903b;
                        return Integer.valueOf(AbstractC6191y0.m5836f(c6118a1, (InterfaceC5765g[]) c6118a1.f9773j.getValue()));
                }
            }
        });
        final int i12 = 2;
        this.f9774k = AbstractC5773a.m5116a(lazyThreadSafetyMode, new InterfaceC6469a(this) { // from class: m7.z0

            /* renamed from: b */
            public final /* synthetic */ C6118a1 f9903b;

            {
                this.f9903b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [d6.e, java.lang.Object] */
            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                InterfaceC5686b[] interfaceC5686bArrChildSerializers;
                ArrayList arrayList;
                InterfaceC5686b[] interfaceC5686bArrTypeParametersSerializers;
                switch (i12) {
                    case 0:
                        InterfaceC6125c0 interfaceC6125c02 = this.f9903b.f9765b;
                        return (interfaceC6125c02 == null || (interfaceC5686bArrChildSerializers = interfaceC6125c02.childSerializers()) == null) ? AbstractC6191y0.f9897b : interfaceC5686bArrChildSerializers;
                    case 1:
                        InterfaceC6125c0 interfaceC6125c03 = this.f9903b.f9765b;
                        if (interfaceC6125c03 == null || (interfaceC5686bArrTypeParametersSerializers = interfaceC6125c03.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC5686bArrTypeParametersSerializers.length);
                            for (InterfaceC5686b interfaceC5686b : interfaceC5686bArrTypeParametersSerializers) {
                                arrayList.add(interfaceC5686b.getDescriptor());
                            }
                        }
                        return AbstractC6191y0.m5833c(arrayList);
                    default:
                        C6118a1 c6118a1 = this.f9903b;
                        return Integer.valueOf(AbstractC6191y0.m5836f(c6118a1, (InterfaceC5765g[]) c6118a1.f9773j.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p118m7.InterfaceC6151l
    /* renamed from: a */
    public final Set mo5107a() {
        return this.f9771h.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // p101k7.InterfaceC5765g
    /* renamed from: c */
    public final int mo5100c(String name) {
        AbstractC5830k.m5330g(name, "name");
        Integer num = (Integer) this.f9771h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: d */
    public final int mo5101d() {
        return this.f9766c;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: e */
    public final String mo5102e(int i) {
        return this.f9768e[i];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [d6.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [d6.e, java.lang.Object] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6118a1) {
            InterfaceC5765g interfaceC5765g = (InterfaceC5765g) obj;
            if (this.f9764a.equals(interfaceC5765g.mo5105h()) && Arrays.equals((InterfaceC5765g[]) this.f9773j.getValue(), (InterfaceC5765g[]) ((C6118a1) obj).f9773j.getValue())) {
                int iMo5101d = interfaceC5765g.mo5101d();
                int i = this.f9766c;
                if (i == iMo5101d) {
                    for (int i8 = 0; i8 < i; i8++) {
                        if (AbstractC5830k.m5325b(mo5104g(i8).mo5105h(), interfaceC5765g.mo5104g(i8).mo5105h()) && AbstractC5830k.m5325b(mo5104g(i8).getKind(), interfaceC5765g.mo5104g(i8).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: f */
    public final List mo5103f(int i) {
        List list = this.f9769f[i];
        return list == null ? EmptyList.INSTANCE : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.e, java.lang.Object] */
    @Override // p101k7.InterfaceC5765g
    /* renamed from: g */
    public InterfaceC5765g mo5104g(int i) {
        return ((InterfaceC5686b[]) this.f9772i.getValue())[i].getDescriptor();
    }

    @Override // p101k7.InterfaceC5765g
    public final List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    @Override // p101k7.InterfaceC5765g
    public AbstractC3315g getKind() {
        return C5770l.f9146b;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: h */
    public final String mo5105h() {
        return this.f9764a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.e, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f9774k.getValue()).intValue();
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: i */
    public final boolean mo5106i(int i) {
        return this.f9770g[i];
    }

    /* renamed from: j */
    public final void m5821j(String name, boolean z8) {
        AbstractC5830k.m5330g(name, "name");
        int i = this.f9767d + 1;
        this.f9767d = i;
        String[] strArr = this.f9768e;
        strArr[i] = name;
        this.f9770g[i] = z8;
        this.f9769f[i] = null;
        if (i == this.f9766c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                map.put(strArr[i8], Integer.valueOf(i8));
            }
            this.f9771h = map;
        }
    }

    public String toString() {
        return AbstractC6191y0.m5843m(this);
    }
}
