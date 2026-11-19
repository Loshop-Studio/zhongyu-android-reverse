package p136p0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p149s0.InterfaceC3373d;
import p149s0.InterfaceC3374e;

/* renamed from: p0.k */
/* loaded from: classes.dex */
public class C2994k implements InterfaceC3374e, InterfaceC3373d {

    /* renamed from: i */
    static final TreeMap<Integer, C2994k> f11566i = new TreeMap<>();

    /* renamed from: a */
    private volatile String f11567a;

    /* renamed from: b */
    final long[] f11568b;

    /* renamed from: c */
    final double[] f11569c;

    /* renamed from: d */
    final String[] f11570d;

    /* renamed from: e */
    final byte[][] f11571e;

    /* renamed from: f */
    private final int[] f11572f;

    /* renamed from: g */
    final int f11573g;

    /* renamed from: h */
    int f11574h;

    private C2994k(int i4) {
        this.f11573g = i4;
        int i5 = i4 + 1;
        this.f11572f = new int[i5];
        this.f11568b = new long[i5];
        this.f11569c = new double[i5];
        this.f11570d = new String[i5];
        this.f11571e = new byte[i5][];
    }

    /* renamed from: d */
    public static C2994k m10086d(String str, int i4) {
        TreeMap<Integer, C2994k> treeMap = f11566i;
        synchronized (treeMap) {
            Map.Entry<Integer, C2994k> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i4));
            if (entryCeilingEntry == null) {
                C2994k c2994k = new C2994k(i4);
                c2994k.m10090m(str, i4);
                return c2994k;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            C2994k value = entryCeilingEntry.getValue();
            value.m10090m(str, i4);
            return value;
        }
    }

    /* renamed from: n */
    private static void m10087n() {
        TreeMap<Integer, C2994k> treeMap = f11566i;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i4 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i4;
        }
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: C */
    public void mo3486C(int i4, byte[] bArr) {
        this.f11572f[i4] = 5;
        this.f11571e[i4] = bArr;
    }

    @Override // p149s0.InterfaceC3374e
    /* renamed from: a */
    public String mo10088a() {
        return this.f11567a;
    }

    @Override // p149s0.InterfaceC3374e
    /* renamed from: b */
    public void mo10089b(InterfaceC3373d interfaceC3373d) {
        for (int i4 = 1; i4 <= this.f11574h; i4++) {
            int i5 = this.f11572f[i4];
            if (i5 == 1) {
                interfaceC3373d.mo3489k(i4);
            } else if (i5 == 2) {
                interfaceC3373d.mo3491w(i4, this.f11568b[i4]);
            } else if (i5 == 3) {
                interfaceC3373d.mo3490l(i4, this.f11569c[i4]);
            } else if (i5 == 4) {
                interfaceC3373d.mo3488c(i4, this.f11570d[i4]);
            } else if (i5 == 5) {
                interfaceC3373d.mo3486C(i4, this.f11571e[i4]);
            }
        }
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: c */
    public void mo3488c(int i4, String str) {
        this.f11572f[i4] = 4;
        this.f11570d[i4] = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: k */
    public void mo3489k(int i4) {
        this.f11572f[i4] = 1;
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: l */
    public void mo3490l(int i4, double d4) {
        this.f11572f[i4] = 3;
        this.f11569c[i4] = d4;
    }

    /* renamed from: m */
    void m10090m(String str, int i4) {
        this.f11567a = str;
        this.f11574h = i4;
    }

    /* renamed from: o */
    public void m10091o() {
        TreeMap<Integer, C2994k> treeMap = f11566i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f11573g), this);
            m10087n();
        }
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: w */
    public void mo3491w(int i4, long j4) {
        this.f11572f[i4] = 2;
        this.f11568b[i4] = j4;
    }
}
