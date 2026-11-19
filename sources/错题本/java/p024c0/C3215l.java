package p024c0;

import android.graphics.Bitmap;
import android.os.Build;
import android.support.v4.media.AbstractC0037f;
import android.support.v4.media.C0039h;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p180v0.AbstractC6664k;

/* renamed from: c0.l */
/* loaded from: classes2.dex */
public final class C3215l {

    /* renamed from: d */
    public static final Bitmap.Config[] f1770d;

    /* renamed from: e */
    public static final Bitmap.Config[] f1771e;

    /* renamed from: f */
    public static final Bitmap.Config[] f1772f;

    /* renamed from: g */
    public static final Bitmap.Config[] f1773g;

    /* renamed from: h */
    public static final Bitmap.Config[] f1774h;

    /* renamed from: a */
    public final C3209f f1775a = new C3209f(1);

    /* renamed from: b */
    public final C0039h f1776b = new C0039h(3);

    /* renamed from: c */
    public final HashMap f1777c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f1770d = configArr;
        f1771e = configArr;
        f1772f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f1773g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f1774h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: c */
    public static String m2164c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: a */
    public final void m2165a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM2167d = m2167d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM2167d.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM2167d.remove(num);
                return;
            } else {
                navigableMapM2167d.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m2164c(AbstractC6664k.m6323c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* renamed from: b */
    public final Bitmap m2166b(int i, int i8, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM6322b = AbstractC6664k.m6322b(i, i8, config);
        C3209f c3209f = this.f1775a;
        InterfaceC3212i interfaceC3212iM2150b = (InterfaceC3212i) ((ArrayDeque) c3209f.f1740a).poll();
        if (interfaceC3212iM2150b == null) {
            interfaceC3212iM2150b = c3209f.m2150b();
        }
        C3214k c3214k = (C3214k) interfaceC3212iM2150b;
        c3214k.f1768b = iM6322b;
        c3214k.f1769c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i9 = AbstractC3213j.f1766a[config.ordinal()];
            configArr = i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? new Bitmap.Config[]{config} : f1774h : f1773g : f1772f : f1770d;
        } else {
            configArr = f1771e;
        }
        int length = configArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i10];
            Integer num = (Integer) m2167d(config2).ceilingKey(Integer.valueOf(iM6322b));
            if (num == null || num.intValue() > iM6322b * 8) {
                i10++;
            } else if (num.intValue() != iM6322b || (config2 != null ? !config2.equals(config) : config != null)) {
                c3209f.m2139a(c3214k);
                int iIntValue = num.intValue();
                InterfaceC3212i interfaceC3212iM2150b2 = (InterfaceC3212i) ((ArrayDeque) c3209f.f1740a).poll();
                if (interfaceC3212iM2150b2 == null) {
                    interfaceC3212iM2150b2 = c3209f.m2150b();
                }
                c3214k = (C3214k) interfaceC3212iM2150b2;
                c3214k.f1768b = iIntValue;
                c3214k.f1769c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f1776b.m126u(c3214k);
        if (bitmap != null) {
            m2165a(Integer.valueOf(c3214k.f1768b), bitmap);
            bitmap.reconfigure(i, i8, config);
        }
        return bitmap;
    }

    /* renamed from: d */
    public final NavigableMap m2167d(Bitmap.Config config) {
        HashMap map = this.f1777c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: e */
    public final void m2168e(Bitmap bitmap) {
        int iM6323c = AbstractC6664k.m6323c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C3209f c3209f = this.f1775a;
        InterfaceC3212i interfaceC3212iM2150b = (InterfaceC3212i) ((ArrayDeque) c3209f.f1740a).poll();
        if (interfaceC3212iM2150b == null) {
            interfaceC3212iM2150b = c3209f.m2150b();
        }
        C3214k c3214k = (C3214k) interfaceC3212iM2150b;
        c3214k.f1768b = iM6323c;
        c3214k.f1769c = config;
        this.f1776b.m131z(c3214k, bitmap);
        NavigableMap navigableMapM2167d = m2167d(bitmap.getConfig());
        Integer num = (Integer) navigableMapM2167d.get(Integer.valueOf(c3214k.f1768b));
        navigableMapM2167d.put(Integer.valueOf(c3214k.f1768b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbM97v = AbstractC0037f.m97v("SizeConfigStrategy{groupedMap=");
        sbM97v.append(this.f1776b);
        sbM97v.append(", sortedSizes=(");
        HashMap map = this.f1777c;
        for (Map.Entry entry : map.entrySet()) {
            sbM97v.append(entry.getKey());
            sbM97v.append('[');
            sbM97v.append(entry.getValue());
            sbM97v.append("], ");
        }
        if (!map.isEmpty()) {
            sbM97v.replace(sbM97v.length() - 2, sbM97v.length(), "");
        }
        sbM97v.append(")}");
        return sbM97v.toString();
    }
}
