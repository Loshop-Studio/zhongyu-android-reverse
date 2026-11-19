package p164l0;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p091e1.AbstractC7838j;

/* renamed from: l0.m */
/* loaded from: classes3.dex */
public class C8876m implements InterfaceC8874k {

    /* renamed from: d */
    public static final Bitmap.Config[] f14663d;

    /* renamed from: e */
    public static final Bitmap.Config[] f14664e;

    /* renamed from: f */
    public static final Bitmap.Config[] f14665f;

    /* renamed from: g */
    public static final Bitmap.Config[] f14666g;

    /* renamed from: h */
    public static final Bitmap.Config[] f14667h;

    /* renamed from: a */
    public final c f14668a = new c();

    /* renamed from: b */
    public final C8870g f14669b = new C8870g();

    /* renamed from: c */
    public final Map f14670c = new HashMap();

    /* renamed from: l0.m$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14671a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f14671a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14671a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14671a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14671a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: l0.m$b */
    public static final class b implements InterfaceC8875l {

        /* renamed from: a */
        public final c f14672a;

        /* renamed from: b */
        public int f14673b;

        /* renamed from: c */
        public Bitmap.Config f14674c;

        public b(c cVar) {
            this.f14672a = cVar;
        }

        @Override // p164l0.InterfaceC8875l
        /* renamed from: a */
        public void mo13760a() {
            this.f14672a.m13729c(this);
        }

        /* renamed from: b */
        public void m13788b(int i9, Bitmap.Config config) {
            this.f14673b = i9;
            this.f14674c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f14673b == bVar.f14673b && AbstractC7838j.m12260c(this.f14674c, bVar.f14674c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i9 = this.f14673b * 31;
            Bitmap.Config config = this.f14674c;
            return i9 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C8876m.m13783h(this.f14673b, this.f14674c);
        }
    }

    /* renamed from: l0.m$c */
    public static class c extends AbstractC8866c {
        @Override // p164l0.AbstractC8866c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b mo13727a() {
            return new b(this);
        }

        /* renamed from: e */
        public b m13790e(int i9, Bitmap.Config config) {
            b bVar = (b) m13728b();
            bVar.m13788b(i9, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f14663d = configArr;
        f14664e = configArr;
        f14665f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f14666g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f14667h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: h */
    public static String m13783h(int i9, Bitmap.Config config) {
        return "[" + i9 + "](" + config + ")";
    }

    /* renamed from: i */
    public static Bitmap.Config[] m13784i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f14664e;
        }
        int i9 = a.f14671a[config.ordinal()];
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? new Bitmap.Config[]{config} : f14667h : f14666g : f14665f : f14663d;
    }

    @Override // p164l0.InterfaceC8874k
    /* renamed from: a */
    public String mo13778a(Bitmap bitmap) {
        return m13783h(AbstractC7838j.m12264g(bitmap), bitmap.getConfig());
    }

    @Override // p164l0.InterfaceC8874k
    /* renamed from: b */
    public String mo13779b(int i9, int i10, Bitmap.Config config) {
        return m13783h(AbstractC7838j.m12263f(i9, i10, config), config);
    }

    @Override // p164l0.InterfaceC8874k
    /* renamed from: c */
    public void mo13780c(Bitmap bitmap) {
        b bVarM13790e = this.f14668a.m13790e(AbstractC7838j.m12264g(bitmap), bitmap.getConfig());
        this.f14669b.m13742d(bVarM13790e, bitmap);
        NavigableMap navigableMapM13787j = m13787j(bitmap.getConfig());
        Integer num = (Integer) navigableMapM13787j.get(Integer.valueOf(bVarM13790e.f14673b));
        navigableMapM13787j.put(Integer.valueOf(bVarM13790e.f14673b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p164l0.InterfaceC8874k
    /* renamed from: d */
    public Bitmap mo13781d(int i9, int i10, Bitmap.Config config) {
        b bVarM13786g = m13786g(AbstractC7838j.m12263f(i9, i10, config), config);
        Bitmap bitmap = (Bitmap) this.f14669b.m13739a(bVarM13786g);
        if (bitmap != null) {
            m13785f(Integer.valueOf(bVarM13786g.f14673b), bitmap);
            bitmap.reconfigure(i9, i10, config);
        }
        return bitmap;
    }

    @Override // p164l0.InterfaceC8874k
    /* renamed from: e */
    public int mo13782e(Bitmap bitmap) {
        return AbstractC7838j.m12264g(bitmap);
    }

    /* renamed from: f */
    public final void m13785f(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM13787j = m13787j(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM13787j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM13787j.remove(num);
                return;
            } else {
                navigableMapM13787j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo13778a(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p164l0.C8876m.b m13786g(int r9, android.graphics.Bitmap.Config r10) {
        /*
            r8 = this;
            l0.m$c r0 = r8.f14668a
            l0.m$b r0 = r0.m13790e(r9, r10)
            android.graphics.Bitmap$Config[] r1 = m13784i(r10)
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L4c
            r4 = r1[r3]
            java.util.NavigableMap r5 = r8.m13787j(r4)
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
            l0.m$c r9 = r8.f14668a
            r9.m13729c(r0)
            l0.m$c r9 = r8.f14668a
            int r10 = r5.intValue()
            l0.m$b r9 = r9.m13790e(r10, r4)
            return r9
        L49:
            int r3 = r3 + 1
            goto Lc
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164l0.C8876m.m13786g(int, android.graphics.Bitmap$Config):l0.m$b");
    }

    /* renamed from: j */
    public final NavigableMap m13787j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f14670c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f14670c.put(config, treeMap);
        return treeMap;
    }

    @Override // p164l0.InterfaceC8874k
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f14669b.m13743f();
        if (bitmap != null) {
            m13785f(Integer.valueOf(AbstractC7838j.m12264g(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f14669b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f14670c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f14670c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
