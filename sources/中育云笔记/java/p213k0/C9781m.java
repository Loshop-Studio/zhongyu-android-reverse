package p213k0;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p109d1.AbstractC8910k;

/* renamed from: k0.m */
/* loaded from: classes3.dex */
public class C9781m implements InterfaceC9779k {

    /* renamed from: d */
    public static final Bitmap.Config[] f22958d;

    /* renamed from: e */
    public static final Bitmap.Config[] f22959e;

    /* renamed from: f */
    public static final Bitmap.Config[] f22960f;

    /* renamed from: g */
    public static final Bitmap.Config[] f22961g;

    /* renamed from: h */
    public static final Bitmap.Config[] f22962h;

    /* renamed from: a */
    public final c f22963a = new c();

    /* renamed from: b */
    public final C9775g f22964b = new C9775g();

    /* renamed from: c */
    public final Map f22965c = new HashMap();

    /* renamed from: k0.m$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22966a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f22966a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22966a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22966a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22966a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: k0.m$b */
    public static final class b implements InterfaceC9780l {

        /* renamed from: a */
        public final c f22967a;

        /* renamed from: b */
        public int f22968b;

        /* renamed from: c */
        public Bitmap.Config f22969c;

        public b(c cVar) {
            this.f22967a = cVar;
        }

        @Override // p213k0.InterfaceC9780l
        /* renamed from: a */
        public void mo19738a() {
            this.f22967a.m19707c(this);
        }

        /* renamed from: b */
        public void m19766b(int i10, Bitmap.Config config) {
            this.f22968b = i10;
            this.f22969c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f22968b == bVar.f22968b && AbstractC8910k.m17473d(this.f22969c, bVar.f22969c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f22968b * 31;
            Bitmap.Config config = this.f22969c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C9781m.m19761h(this.f22968b, this.f22969c);
        }
    }

    /* renamed from: k0.m$c */
    public static class c extends AbstractC9771c {
        @Override // p213k0.AbstractC9771c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b mo19705a() {
            return new b(this);
        }

        /* renamed from: e */
        public b m19768e(int i10, Bitmap.Config config) {
            b bVar = (b) m19706b();
            bVar.m19766b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f22958d = configArr;
        f22959e = configArr;
        f22960f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f22961g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f22962h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: h */
    public static String m19761h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    /* renamed from: i */
    public static Bitmap.Config[] m19762i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f22959e;
        }
        int i10 = a.f22966a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f22962h : f22961g : f22960f : f22958d;
    }

    @Override // p213k0.InterfaceC9779k
    /* renamed from: a */
    public String mo19756a(Bitmap bitmap) {
        return m19761h(AbstractC8910k.m17477h(bitmap), bitmap.getConfig());
    }

    @Override // p213k0.InterfaceC9779k
    /* renamed from: b */
    public String mo19757b(int i10, int i11, Bitmap.Config config) {
        return m19761h(AbstractC8910k.m17476g(i10, i11, config), config);
    }

    @Override // p213k0.InterfaceC9779k
    /* renamed from: c */
    public void mo19758c(Bitmap bitmap) {
        b bVarM19768e = this.f22963a.m19768e(AbstractC8910k.m17477h(bitmap), bitmap.getConfig());
        this.f22964b.m19720d(bVarM19768e, bitmap);
        NavigableMap navigableMapM19765j = m19765j(bitmap.getConfig());
        Integer num = (Integer) navigableMapM19765j.get(Integer.valueOf(bVarM19768e.f22968b));
        navigableMapM19765j.put(Integer.valueOf(bVarM19768e.f22968b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p213k0.InterfaceC9779k
    /* renamed from: d */
    public Bitmap mo19759d(int i10, int i11, Bitmap.Config config) {
        b bVarM19764g = m19764g(AbstractC8910k.m17476g(i10, i11, config), config);
        Bitmap bitmap = (Bitmap) this.f22964b.m19717a(bVarM19764g);
        if (bitmap != null) {
            m19763f(Integer.valueOf(bVarM19764g.f22968b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // p213k0.InterfaceC9779k
    /* renamed from: e */
    public int mo19760e(Bitmap bitmap) {
        return AbstractC8910k.m17477h(bitmap);
    }

    /* renamed from: f */
    public final void m19763f(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM19765j = m19765j(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM19765j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM19765j.remove(num);
                return;
            } else {
                navigableMapM19765j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo19756a(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p213k0.C9781m.b m19764g(int r9, android.graphics.Bitmap.Config r10) {
        /*
            r8 = this;
            k0.m$c r0 = r8.f22963a
            k0.m$b r0 = r0.m19768e(r9, r10)
            android.graphics.Bitmap$Config[] r1 = m19762i(r10)
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L4c
            r4 = r1[r3]
            java.util.NavigableMap r5 = r8.m19765j(r4)
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
            k0.m$c r9 = r8.f22963a
            r9.m19707c(r0)
            k0.m$c r9 = r8.f22963a
            int r10 = r5.intValue()
            k0.m$b r9 = r9.m19768e(r10, r4)
            return r9
        L49:
            int r3 = r3 + 1
            goto Lc
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213k0.C9781m.m19764g(int, android.graphics.Bitmap$Config):k0.m$b");
    }

    /* renamed from: j */
    public final NavigableMap m19765j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f22965c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f22965c.put(config, treeMap);
        return treeMap;
    }

    @Override // p213k0.InterfaceC9779k
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f22964b.m19721f();
        if (bitmap != null) {
            m19763f(Integer.valueOf(AbstractC8910k.m17477h(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f22964b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry entry : this.f22965c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f22965c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
