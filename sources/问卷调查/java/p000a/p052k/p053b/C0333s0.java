package p000a.p052k.p053b;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p021e.AbstractC0135g;
import p000a.p021e.C0129a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.k.b.s0 */
/* loaded from: classes.dex */
public class C0333s0 {

    /* renamed from: a */
    public static final int[] f2073a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    public static final AbstractC0337u0 f2074b = new C0335t0();

    /* renamed from: c */
    public static final AbstractC0337u0 f2075c;

    /* renamed from: a.k.b.s0$a */
    public interface a {
    }

    /* renamed from: a.k.b.s0$b */
    public static class b {

        /* renamed from: a */
        public ComponentCallbacksC0320m f2076a;

        /* renamed from: b */
        public boolean f2077b;

        /* renamed from: c */
        public C0294a f2078c;

        /* renamed from: d */
        public ComponentCallbacksC0320m f2079d;

        /* renamed from: e */
        public boolean f2080e;

        /* renamed from: f */
        public C0294a f2081f;
    }

    static {
        AbstractC0337u0 abstractC0337u0;
        try {
            abstractC0337u0 = (AbstractC0337u0) Class.forName("a.q.d").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC0337u0 = null;
        }
        f2075c = abstractC0337u0;
    }

    /* renamed from: a */
    public static void m1200a(ArrayList<View> arrayList, C0129a<String, View> c0129a, Collection<String> collection) {
        for (int i = c0129a.f950d - 1; i >= 0; i--) {
            View viewM517k = c0129a.m517k(i);
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            if (collection.contains(viewM517k.getTransitionName())) {
                arrayList.add(viewM517k);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0089  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1201b(p000a.p052k.p053b.C0294a r8, p000a.p052k.p053b.AbstractC0319l0.a r9, android.util.SparseArray<p000a.p052k.p053b.C0333s0.b> r10, boolean r11, boolean r12) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p052k.p053b.C0333s0.m1201b(a.k.b.a, a.k.b.l0$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m1202c(ComponentCallbacksC0320m componentCallbacksC0320m, ComponentCallbacksC0320m componentCallbacksC0320m2, boolean z, C0129a<String, View> c0129a, boolean z2) {
        if (z) {
            componentCallbacksC0320m2.m1170n();
        } else {
            componentCallbacksC0320m.m1170n();
        }
    }

    /* renamed from: d */
    public static boolean m1203d(AbstractC0337u0 abstractC0337u0, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC0337u0.mo1220e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static C0129a<String, View> m1204e(AbstractC0337u0 abstractC0337u0, C0129a<String, String> c0129a, Object obj, b bVar) {
        ArrayList<String> arrayList;
        ComponentCallbacksC0320m componentCallbacksC0320m = bVar.f2076a;
        View view = componentCallbacksC0320m.f1963G;
        if (c0129a.isEmpty() || obj == null || view == null) {
            c0129a.clear();
            return null;
        }
        C0129a<String, View> c0129a2 = new C0129a<>();
        abstractC0337u0.m1238i(c0129a2, view);
        C0294a c0294a = bVar.f2078c;
        if (bVar.f2077b) {
            componentCallbacksC0320m.m1176q();
            arrayList = c0294a.f1945m;
        } else {
            componentCallbacksC0320m.m1170n();
            arrayList = c0294a.f1946n;
        }
        if (arrayList != null) {
            AbstractC0135g.m504k(c0129a2, arrayList);
            AbstractC0135g.m504k(c0129a2, c0129a.values());
        }
        m1212m(c0129a, c0129a2);
        return c0129a2;
    }

    /* renamed from: f */
    public static C0129a<String, View> m1205f(AbstractC0337u0 abstractC0337u0, C0129a<String, String> c0129a, Object obj, b bVar) {
        ArrayList<String> arrayList;
        if (c0129a.isEmpty() || obj == null) {
            c0129a.clear();
            return null;
        }
        ComponentCallbacksC0320m componentCallbacksC0320m = bVar.f2079d;
        C0129a<String, View> c0129a2 = new C0129a<>();
        abstractC0337u0.m1238i(c0129a2, componentCallbacksC0320m.m1167l0());
        C0294a c0294a = bVar.f2081f;
        if (bVar.f2080e) {
            componentCallbacksC0320m.m1170n();
            arrayList = c0294a.f1946n;
        } else {
            componentCallbacksC0320m.m1176q();
            arrayList = c0294a.f1945m;
        }
        if (arrayList != null) {
            AbstractC0135g.m504k(c0129a2, arrayList);
        }
        AbstractC0135g.m504k(c0129a, c0129a2.keySet());
        return c0129a2;
    }

    /* renamed from: g */
    public static AbstractC0337u0 m1206g(ComponentCallbacksC0320m componentCallbacksC0320m, ComponentCallbacksC0320m componentCallbacksC0320m2) {
        ArrayList arrayList = new ArrayList();
        if (componentCallbacksC0320m != null) {
            componentCallbacksC0320m.m1174p();
            Object objM1192z = componentCallbacksC0320m.m1192z();
            if (objM1192z != null) {
                arrayList.add(objM1192z);
            }
            Object objM1131B = componentCallbacksC0320m.m1131B();
            if (objM1131B != null) {
                arrayList.add(objM1131B);
            }
        }
        if (componentCallbacksC0320m2 != null) {
            componentCallbacksC0320m2.m1168m();
            Object objM1190x = componentCallbacksC0320m2.m1190x();
            if (objM1190x != null) {
                arrayList.add(objM1190x);
            }
            componentCallbacksC0320m2.m1130A();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0337u0 abstractC0337u0 = f2074b;
        if (m1203d(abstractC0337u0, arrayList)) {
            return abstractC0337u0;
        }
        AbstractC0337u0 abstractC0337u02 = f2075c;
        if (abstractC0337u02 == null || !m1203d(abstractC0337u02, arrayList)) {
            throw new IllegalArgumentException("Invalid Transition types");
        }
        return abstractC0337u02;
    }

    /* renamed from: h */
    public static ArrayList<View> m1207h(AbstractC0337u0 abstractC0337u0, Object obj, ComponentCallbacksC0320m componentCallbacksC0320m, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = componentCallbacksC0320m.f1963G;
        if (view2 != null) {
            abstractC0337u0.m1237f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        abstractC0337u0.mo1218b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: i */
    public static Object m1208i(AbstractC0337u0 abstractC0337u0, ComponentCallbacksC0320m componentCallbacksC0320m, boolean z) {
        Object objM1190x = null;
        if (componentCallbacksC0320m == null) {
            return null;
        }
        if (z) {
            objM1190x = componentCallbacksC0320m.m1190x();
        } else {
            componentCallbacksC0320m.m1168m();
        }
        return abstractC0337u0.mo1221g(objM1190x);
    }

    /* renamed from: j */
    public static Object m1209j(AbstractC0337u0 abstractC0337u0, ComponentCallbacksC0320m componentCallbacksC0320m, boolean z) {
        Object objM1192z = null;
        if (componentCallbacksC0320m == null) {
            return null;
        }
        if (z) {
            objM1192z = componentCallbacksC0320m.m1192z();
        } else {
            componentCallbacksC0320m.m1174p();
        }
        return abstractC0337u0.mo1221g(objM1192z);
    }

    /* renamed from: k */
    public static View m1210k(C0129a<String, View> c0129a, b bVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0294a c0294a = bVar.f2078c;
        if (obj == null || c0129a == null || (arrayList = c0294a.f1945m) == null || arrayList.isEmpty()) {
            return null;
        }
        return c0129a.get((z ? c0294a.f1945m : c0294a.f1946n).get(0));
    }

    /* renamed from: l */
    public static Object m1211l(AbstractC0337u0 abstractC0337u0, ComponentCallbacksC0320m componentCallbacksC0320m, ComponentCallbacksC0320m componentCallbacksC0320m2, boolean z) {
        Object objM1131B;
        if (z) {
            objM1131B = componentCallbacksC0320m2.m1131B();
        } else {
            componentCallbacksC0320m.m1130A();
            objM1131B = null;
        }
        return abstractC0337u0.mo1233y(abstractC0337u0.mo1221g(objM1131B));
    }

    /* renamed from: m */
    public static void m1212m(C0129a<String, String> c0129a, C0129a<String, View> c0129a2) {
        int i = c0129a.f950d;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (!c0129a2.containsKey(c0129a.m517k(i))) {
                c0129a.m515i(i);
            }
        }
    }

    /* renamed from: n */
    public static void m1213n(AbstractC0337u0 abstractC0337u0, Object obj, Object obj2, C0129a<String, View> c0129a, boolean z, C0294a c0294a) {
        ArrayList<String> arrayList = c0294a.f1945m;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c0129a.get((z ? c0294a.f1946n : c0294a.f1945m).get(0));
        abstractC0337u0.mo1229t(obj, view);
        if (obj2 != null) {
            abstractC0337u0.mo1229t(obj2, view);
        }
    }

    /* renamed from: o */
    public static void m1214o(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0230  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1215p(android.content.Context r37, p000a.p052k.p053b.AbstractC0338v r38, java.util.ArrayList<p000a.p052k.p053b.C0294a> r39, java.util.ArrayList<java.lang.Boolean> r40, int r41, int r42, boolean r43, p000a.p052k.p053b.C0333s0.a r44) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p052k.p053b.C0333s0.m1215p(android.content.Context, a.k.b.v, java.util.ArrayList, java.util.ArrayList, int, int, boolean, a.k.b.s0$a):void");
    }
}
