package p074i0;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p016b1.AbstractC4409k;

/* renamed from: i0.m */
/* loaded from: classes3.dex */
public class C6508m implements InterfaceC6506k {

    /* renamed from: d */
    public static final Bitmap.Config[] f8327d;

    /* renamed from: e */
    public static final Bitmap.Config[] f8328e;

    /* renamed from: f */
    public static final Bitmap.Config[] f8329f;

    /* renamed from: g */
    public static final Bitmap.Config[] f8330g;

    /* renamed from: h */
    public static final Bitmap.Config[] f8331h;

    /* renamed from: a */
    public final c f8332a = new c();

    /* renamed from: b */
    public final C6502g f8333b = new C6502g();

    /* renamed from: c */
    public final Map f8334c = new HashMap();

    /* renamed from: i0.m$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8335a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f8335a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8335a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8335a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8335a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: i0.m$b */
    public static final class b implements InterfaceC6507l {

        /* renamed from: a */
        public final c f8336a;

        /* renamed from: b */
        public int f8337b;

        /* renamed from: c */
        public Bitmap.Config f8338c;

        public b(c cVar) {
            this.f8336a = cVar;
        }

        @Override // p074i0.InterfaceC6507l
        /* renamed from: a */
        public void mo7225a() {
            this.f8336a.m7194c(this);
        }

        /* renamed from: b */
        public void m7253b(int i6, Bitmap.Config config) {
            this.f8337b = i6;
            this.f8338c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f8337b == bVar.f8337b && AbstractC4409k.m1443d(this.f8338c, bVar.f8338c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i6 = this.f8337b * 31;
            Bitmap.Config config = this.f8338c;
            return i6 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C6508m.m7248h(this.f8337b, this.f8338c);
        }
    }

    /* renamed from: i0.m$c */
    public static class c extends AbstractC6498c {
        @Override // p074i0.AbstractC6498c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b mo7192a() {
            return new b(this);
        }

        /* renamed from: e */
        public b m7255e(int i6, Bitmap.Config config) {
            b bVar = (b) m7193b();
            bVar.m7253b(i6, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f8327d = configArr;
        f8328e = configArr;
        f8329f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f8330g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f8331h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: h */
    public static String m7248h(int i6, Bitmap.Config config) {
        return "[" + i6 + "](" + config + ")";
    }

    /* renamed from: i */
    public static Bitmap.Config[] m7249i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f8328e;
        }
        int i6 = a.f8335a[config.ordinal()];
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? new Bitmap.Config[]{config} : f8331h : f8330g : f8329f : f8327d;
    }

    @Override // p074i0.InterfaceC6506k
    /* renamed from: a */
    public String mo7243a(Bitmap bitmap) {
        return m7248h(AbstractC4409k.m1447h(bitmap), bitmap.getConfig());
    }

    @Override // p074i0.InterfaceC6506k
    /* renamed from: b */
    public String mo7244b(int i6, int i7, Bitmap.Config config) {
        return m7248h(AbstractC4409k.m1446g(i6, i7, config), config);
    }

    @Override // p074i0.InterfaceC6506k
    /* renamed from: c */
    public void mo7245c(Bitmap bitmap) {
        b bVarM7255e = this.f8332a.m7255e(AbstractC4409k.m1447h(bitmap), bitmap.getConfig());
        this.f8333b.m7207d(bVarM7255e, bitmap);
        NavigableMap navigableMapM7252j = m7252j(bitmap.getConfig());
        Integer num = (Integer) navigableMapM7252j.get(Integer.valueOf(bVarM7255e.f8337b));
        navigableMapM7252j.put(Integer.valueOf(bVarM7255e.f8337b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p074i0.InterfaceC6506k
    /* renamed from: d */
    public Bitmap mo7246d(int i6, int i7, Bitmap.Config config) {
        b bVarM7251g = m7251g(AbstractC4409k.m1446g(i6, i7, config), config);
        Bitmap bitmap = (Bitmap) this.f8333b.m7204a(bVarM7251g);
        if (bitmap != null) {
            m7250f(Integer.valueOf(bVarM7251g.f8337b), bitmap);
            bitmap.reconfigure(i6, i7, config);
        }
        return bitmap;
    }

    @Override // p074i0.InterfaceC6506k
    /* renamed from: e */
    public int mo7247e(Bitmap bitmap) {
        return AbstractC4409k.m1447h(bitmap);
    }

    /* renamed from: f */
    public final void m7250f(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM7252j = m7252j(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM7252j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM7252j.remove(num);
                return;
            } else {
                navigableMapM7252j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo7243a(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p074i0.C6508m.b m7251g(int r9, android.graphics.Bitmap.Config r10) {
        /*
            r8 = this;
            i0.m$c r0 = r8.f8332a
            i0.m$b r0 = r0.m7255e(r9, r10)
            android.graphics.Bitmap$Config[] r1 = m7249i(r10)
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L4c
            r4 = r1[r3]
            java.util.NavigableMap r5 = r8.m7252j(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r5.ceilingKey(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L49
            int r6 = r5.intValue()
            int r7 = r9 * 8
            if (r6 > r7) goto L49
            int r1 = r5.intValue()
            if (r1 != r9) goto L39
            if (r4 != 0) goto L33
            if (r10 == 0) goto L4c
            goto L39
        L33:
            boolean r9 = r4.equals(r10)
            if (r9 != 0) goto L4c
        L39:
            i0.m$c r9 = r8.f8332a
            r9.m7194c(r0)
            i0.m$c r9 = r8.f8332a
            int r10 = r5.intValue()
            i0.m$b r9 = r9.m7255e(r10, r4)
            return r9
        L49:
            int r3 = r3 + 1
            goto Lc
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p074i0.C6508m.m7251g(int, android.graphics.Bitmap$Config):i0.m$b");
    }

    /* renamed from: j */
    public final NavigableMap m7252j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f8334c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f8334c.put(config, treeMap);
        return treeMap;
    }

    @Override // p074i0.InterfaceC6506k
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f8333b.m7208f();
        if (bitmap != null) {
            m7250f(Integer.valueOf(AbstractC4409k.m1447h(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f8333b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f8334c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f8334c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
