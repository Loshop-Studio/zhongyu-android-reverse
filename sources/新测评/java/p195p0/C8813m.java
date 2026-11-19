package p195p0;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p117i1.AbstractC7652k;

/* renamed from: p0.m */
/* loaded from: classes3.dex */
public class C8813m implements InterfaceC8811k {

    /* renamed from: d */
    public static final Bitmap.Config[] f14973d;

    /* renamed from: e */
    public static final Bitmap.Config[] f14974e;

    /* renamed from: f */
    public static final Bitmap.Config[] f14975f;

    /* renamed from: g */
    public static final Bitmap.Config[] f14976g;

    /* renamed from: h */
    public static final Bitmap.Config[] f14977h;

    /* renamed from: a */
    public final c f14978a = new c();

    /* renamed from: b */
    public final C8807g f14979b = new C8807g();

    /* renamed from: c */
    public final Map f14980c = new HashMap();

    /* renamed from: p0.m$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14981a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f14981a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14981a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14981a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14981a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: p0.m$b */
    public static final class b implements InterfaceC8812l {

        /* renamed from: a */
        public final c f14982a;

        /* renamed from: b */
        public int f14983b;

        /* renamed from: c */
        public Bitmap.Config f14984c;

        public b(c cVar) {
            this.f14982a = cVar;
        }

        @Override // p195p0.InterfaceC8812l
        /* renamed from: a */
        public void mo14740a() {
            this.f14982a.m14709c(this);
        }

        /* renamed from: b */
        public void m14768b(int i10, Bitmap.Config config) {
            this.f14983b = i10;
            this.f14984c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f14983b == bVar.f14983b && AbstractC7652k.m12688d(this.f14984c, bVar.f14984c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f14983b * 31;
            Bitmap.Config config = this.f14984c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C8813m.m14763h(this.f14983b, this.f14984c);
        }
    }

    /* renamed from: p0.m$c */
    public static class c extends AbstractC8803c {
        @Override // p195p0.AbstractC8803c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b mo14707a() {
            return new b(this);
        }

        /* renamed from: e */
        public b m14770e(int i10, Bitmap.Config config) {
            b bVar = (b) m14708b();
            bVar.m14768b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f14973d = configArr;
        f14974e = configArr;
        f14975f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f14976g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f14977h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: h */
    public static String m14763h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    /* renamed from: i */
    public static Bitmap.Config[] m14764i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f14974e;
        }
        int i10 = a.f14981a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f14977h : f14976g : f14975f : f14973d;
    }

    @Override // p195p0.InterfaceC8811k
    /* renamed from: a */
    public String mo14758a(Bitmap bitmap) {
        return m14763h(AbstractC7652k.m12692h(bitmap), bitmap.getConfig());
    }

    @Override // p195p0.InterfaceC8811k
    /* renamed from: b */
    public String mo14759b(int i10, int i11, Bitmap.Config config) {
        return m14763h(AbstractC7652k.m12691g(i10, i11, config), config);
    }

    @Override // p195p0.InterfaceC8811k
    /* renamed from: c */
    public void mo14760c(Bitmap bitmap) {
        b bVarM14770e = this.f14978a.m14770e(AbstractC7652k.m12692h(bitmap), bitmap.getConfig());
        this.f14979b.m14722d(bVarM14770e, bitmap);
        NavigableMap navigableMapM14767j = m14767j(bitmap.getConfig());
        Integer num = (Integer) navigableMapM14767j.get(Integer.valueOf(bVarM14770e.f14983b));
        navigableMapM14767j.put(Integer.valueOf(bVarM14770e.f14983b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p195p0.InterfaceC8811k
    /* renamed from: d */
    public Bitmap mo14761d(int i10, int i11, Bitmap.Config config) {
        b bVarM14766g = m14766g(AbstractC7652k.m12691g(i10, i11, config), config);
        Bitmap bitmap = (Bitmap) this.f14979b.m14719a(bVarM14766g);
        if (bitmap != null) {
            m14765f(Integer.valueOf(bVarM14766g.f14983b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // p195p0.InterfaceC8811k
    /* renamed from: e */
    public int mo14762e(Bitmap bitmap) {
        return AbstractC7652k.m12692h(bitmap);
    }

    /* renamed from: f */
    public final void m14765f(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM14767j = m14767j(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM14767j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM14767j.remove(num);
                return;
            } else {
                navigableMapM14767j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo14758a(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p195p0.C8813m.b m14766g(int r9, android.graphics.Bitmap.Config r10) {
        /*
            r8 = this;
            p0.m$c r0 = r8.f14978a
            p0.m$b r0 = r0.m14770e(r9, r10)
            android.graphics.Bitmap$Config[] r1 = m14764i(r10)
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L4c
            r4 = r1[r3]
            java.util.NavigableMap r5 = r8.m14767j(r4)
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
            p0.m$c r9 = r8.f14978a
            r9.m14709c(r0)
            p0.m$c r9 = r8.f14978a
            int r10 = r5.intValue()
            p0.m$b r9 = r9.m14770e(r10, r4)
            return r9
        L49:
            int r3 = r3 + 1
            goto Lc
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p195p0.C8813m.m14766g(int, android.graphics.Bitmap$Config):p0.m$b");
    }

    /* renamed from: j */
    public final NavigableMap m14767j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f14980c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f14980c.put(config, treeMap);
        return treeMap;
    }

    @Override // p195p0.InterfaceC8811k
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f14979b.m14723f();
        if (bitmap != null) {
            m14765f(Integer.valueOf(AbstractC7652k.m12692h(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f14979b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f14980c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f14980c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
