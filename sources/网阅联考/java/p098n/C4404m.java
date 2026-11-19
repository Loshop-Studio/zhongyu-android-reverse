package p098n;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p062g0.AbstractC3750j;

/* renamed from: n.m */
/* loaded from: classes2.dex */
public class C4404m implements InterfaceC4402k {

    /* renamed from: d */
    public static final Bitmap.Config[] f4924d;

    /* renamed from: e */
    public static final Bitmap.Config[] f4925e;

    /* renamed from: f */
    public static final Bitmap.Config[] f4926f;

    /* renamed from: g */
    public static final Bitmap.Config[] f4927g;

    /* renamed from: h */
    public static final Bitmap.Config[] f4928h;

    /* renamed from: a */
    public final c f4929a = new c();

    /* renamed from: b */
    public final C4398g f4930b = new C4398g();

    /* renamed from: c */
    public final Map f4931c = new HashMap();

    /* renamed from: n.m$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4932a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f4932a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4932a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4932a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4932a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: n.m$b */
    public static final class b implements InterfaceC4403l {

        /* renamed from: a */
        public final c f4933a;

        /* renamed from: b */
        public int f4934b;

        /* renamed from: c */
        public Bitmap.Config f4935c;

        public b(c cVar) {
            this.f4933a = cVar;
        }

        @Override // p098n.InterfaceC4403l
        /* renamed from: a */
        public void mo5420a() {
            this.f4933a.m5389c(this);
        }

        /* renamed from: b */
        public void m5449b(int i4, Bitmap.Config config) {
            this.f4934b = i4;
            this.f4935c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4934b == bVar.f4934b && AbstractC3750j.m4772c(this.f4935c, bVar.f4935c);
        }

        public int hashCode() {
            int i4 = this.f4934b * 31;
            Bitmap.Config config = this.f4935c;
            return i4 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C4404m.m5444i(this.f4934b, this.f4935c);
        }
    }

    /* renamed from: n.m$c */
    public static class c extends AbstractC4394c {
        @Override // p098n.AbstractC4394c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b mo5387a() {
            return new b(this);
        }

        /* renamed from: e */
        public b m5451e(int i4, Bitmap.Config config) {
            b bVar = (b) m5388b();
            bVar.m5449b(i4, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f4924d = configArr;
        f4925e = configArr;
        f4926f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f4927g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f4928h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: i */
    public static String m5444i(int i4, Bitmap.Config config) {
        return "[" + i4 + "](" + config + ")";
    }

    /* renamed from: j */
    public static Bitmap.Config[] m5445j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f4925e;
        }
        int i4 = a.f4932a[config.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? new Bitmap.Config[]{config} : f4928h : f4927g : f4926f : f4924d;
    }

    @Override // p098n.InterfaceC4402k
    /* renamed from: a */
    public Bitmap mo5438a() {
        Bitmap bitmap = (Bitmap) this.f4930b.m5403f();
        if (bitmap != null) {
            m5446g(Integer.valueOf(AbstractC3750j.m4776g(bitmap)), bitmap);
        }
        return bitmap;
    }

    @Override // p098n.InterfaceC4402k
    /* renamed from: b */
    public String mo5439b(int i4, int i5, Bitmap.Config config) {
        return m5444i(AbstractC3750j.m4775f(i4, i5, config), config);
    }

    @Override // p098n.InterfaceC4402k
    /* renamed from: c */
    public void mo5440c(Bitmap bitmap) {
        b bVarM5451e = this.f4929a.m5451e(AbstractC3750j.m4776g(bitmap), bitmap.getConfig());
        this.f4930b.m5402d(bVarM5451e, bitmap);
        NavigableMap navigableMapM5448k = m5448k(bitmap.getConfig());
        Integer num = (Integer) navigableMapM5448k.get(Integer.valueOf(bVarM5451e.f4934b));
        navigableMapM5448k.put(Integer.valueOf(bVarM5451e.f4934b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p098n.InterfaceC4402k
    /* renamed from: d */
    public Bitmap mo5441d(int i4, int i5, Bitmap.Config config) {
        b bVarM5447h = m5447h(AbstractC3750j.m4775f(i4, i5, config), config);
        Bitmap bitmap = (Bitmap) this.f4930b.m5399a(bVarM5447h);
        if (bitmap != null) {
            m5446g(Integer.valueOf(bVarM5447h.f4934b), bitmap);
            bitmap.reconfigure(i4, i5, config);
        }
        return bitmap;
    }

    @Override // p098n.InterfaceC4402k
    /* renamed from: e */
    public int mo5442e(Bitmap bitmap) {
        return AbstractC3750j.m4776g(bitmap);
    }

    @Override // p098n.InterfaceC4402k
    /* renamed from: f */
    public String mo5443f(Bitmap bitmap) {
        return m5444i(AbstractC3750j.m4776g(bitmap), bitmap.getConfig());
    }

    /* renamed from: g */
    public final void m5446g(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM5448k = m5448k(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM5448k.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM5448k.remove(num);
                return;
            } else {
                navigableMapM5448k.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo5443f(bitmap) + ", this: " + this);
    }

    /* renamed from: h */
    public final b m5447h(int i4, Bitmap.Config config) {
        b bVarM5451e = this.f4929a.m5451e(i4, config);
        for (Bitmap.Config config2 : m5445j(config)) {
            Integer num = (Integer) m5448k(config2).ceilingKey(Integer.valueOf(i4));
            if (num != null && num.intValue() <= i4 * 8) {
                if (num.intValue() == i4) {
                    if (config2 == null) {
                        if (config == null) {
                            return bVarM5451e;
                        }
                    } else if (config2.equals(config)) {
                        return bVarM5451e;
                    }
                }
                this.f4929a.m5389c(bVarM5451e);
                return this.f4929a.m5451e(num.intValue(), config2);
            }
        }
        return bVarM5451e;
    }

    /* renamed from: k */
    public final NavigableMap m5448k(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f4931c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f4931c.put(config, treeMap);
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f4930b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f4931c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f4931c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
