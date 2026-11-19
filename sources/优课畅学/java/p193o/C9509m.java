package p193o;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p116h0.AbstractC8707k;

/* renamed from: o.m */
/* loaded from: classes3.dex */
public class C9509m implements InterfaceC9507k {

    /* renamed from: d */
    public static final Bitmap.Config[] f18875d;

    /* renamed from: e */
    public static final Bitmap.Config[] f18876e;

    /* renamed from: f */
    public static final Bitmap.Config[] f18877f;

    /* renamed from: g */
    public static final Bitmap.Config[] f18878g;

    /* renamed from: h */
    public static final Bitmap.Config[] f18879h;

    /* renamed from: a */
    public final c f18880a = new c();

    /* renamed from: b */
    public final C9503g f18881b = new C9503g();

    /* renamed from: c */
    public final Map f18882c = new HashMap();

    /* renamed from: o.m$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18883a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f18883a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18883a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18883a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18883a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: o.m$b */
    public static final class b implements InterfaceC9508l {

        /* renamed from: a */
        public final c f18884a;

        /* renamed from: b */
        public int f18885b;

        /* renamed from: c */
        public Bitmap.Config f18886c;

        public b(c cVar) {
            this.f18884a = cVar;
        }

        @Override // p193o.InterfaceC9508l
        /* renamed from: a */
        public void mo17648a() {
            this.f18884a.m17618c(this);
        }

        /* renamed from: b */
        public void m17676b(int i10, Bitmap.Config config) {
            this.f18885b = i10;
            this.f18886c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f18885b == bVar.f18885b && AbstractC8707k.m14186d(this.f18886c, bVar.f18886c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f18885b * 31;
            Bitmap.Config config = this.f18886c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C9509m.m17671h(this.f18885b, this.f18886c);
        }
    }

    /* renamed from: o.m$c */
    public static class c extends AbstractC9499c {
        @Override // p193o.AbstractC9499c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b mo17616a() {
            return new b(this);
        }

        /* renamed from: e */
        public b m17678e(int i10, Bitmap.Config config) {
            b bVar = (b) m17617b();
            bVar.m17676b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f18875d = configArr;
        f18876e = configArr;
        f18877f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f18878g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f18879h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: h */
    public static String m17671h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    /* renamed from: i */
    public static Bitmap.Config[] m17672i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f18876e;
        }
        int i10 = a.f18883a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f18879h : f18878g : f18877f : f18875d;
    }

    @Override // p193o.InterfaceC9507k
    /* renamed from: a */
    public String mo17666a(Bitmap bitmap) {
        return m17671h(AbstractC8707k.m14190h(bitmap), bitmap.getConfig());
    }

    @Override // p193o.InterfaceC9507k
    /* renamed from: b */
    public void mo17667b(Bitmap bitmap) {
        b bVarM17678e = this.f18880a.m17678e(AbstractC8707k.m14190h(bitmap), bitmap.getConfig());
        this.f18881b.m17630d(bVarM17678e, bitmap);
        NavigableMap navigableMapM17675j = m17675j(bitmap.getConfig());
        Integer num = (Integer) navigableMapM17675j.get(Integer.valueOf(bVarM17678e.f18885b));
        navigableMapM17675j.put(Integer.valueOf(bVarM17678e.f18885b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p193o.InterfaceC9507k
    /* renamed from: c */
    public Bitmap mo17668c(int i10, int i11, Bitmap.Config config) {
        b bVarM17674g = m17674g(AbstractC8707k.m14189g(i10, i11, config), config);
        Bitmap bitmap = (Bitmap) this.f18881b.m17627a(bVarM17674g);
        if (bitmap != null) {
            m17673f(Integer.valueOf(bVarM17674g.f18885b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // p193o.InterfaceC9507k
    /* renamed from: d */
    public String mo17669d(int i10, int i11, Bitmap.Config config) {
        return m17671h(AbstractC8707k.m14189g(i10, i11, config), config);
    }

    @Override // p193o.InterfaceC9507k
    /* renamed from: e */
    public int mo17670e(Bitmap bitmap) {
        return AbstractC8707k.m14190h(bitmap);
    }

    /* renamed from: f */
    public final void m17673f(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM17675j = m17675j(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM17675j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM17675j.remove(num);
                return;
            } else {
                navigableMapM17675j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo17666a(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p193o.C9509m.b m17674g(int r9, android.graphics.Bitmap.Config r10) {
        /*
            r8 = this;
            o.m$c r0 = r8.f18880a
            o.m$b r0 = r0.m17678e(r9, r10)
            android.graphics.Bitmap$Config[] r1 = m17672i(r10)
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L4c
            r4 = r1[r3]
            java.util.NavigableMap r5 = r8.m17675j(r4)
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
            o.m$c r9 = r8.f18880a
            r9.m17618c(r0)
            o.m$c r9 = r8.f18880a
            int r10 = r5.intValue()
            o.m$b r9 = r9.m17678e(r10, r4)
            return r9
        L49:
            int r3 = r3 + 1
            goto Lc
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p193o.C9509m.m17674g(int, android.graphics.Bitmap$Config):o.m$b");
    }

    /* renamed from: j */
    public final NavigableMap m17675j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f18882c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f18882c.put(config, treeMap);
        return treeMap;
    }

    @Override // p193o.InterfaceC9507k
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f18881b.m17631f();
        if (bitmap != null) {
            m17673f(Integer.valueOf(AbstractC8707k.m14190h(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f18881b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f18882c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f18882c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
