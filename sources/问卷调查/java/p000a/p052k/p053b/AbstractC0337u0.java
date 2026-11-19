package p000a.p052k.p053b;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p000a.p021e.C0136h;
import p000a.p031h.p039f.C0217a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.ViewTreeObserverOnPreDrawListenerC0265n;

@SuppressLint({"UnknownNullness"})
/* renamed from: a.k.b.u0 */
/* loaded from: classes.dex */
public abstract class AbstractC0337u0 {

    /* renamed from: a.k.b.u0$a */
    public class a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f2101b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList f2102c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f2103d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f2104e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f2105f;

        public a(AbstractC0337u0 abstractC0337u0, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2101b = i;
            this.f2102c = arrayList;
            this.f2103d = arrayList2;
            this.f2104e = arrayList3;
            this.f2105f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f2101b; i++) {
                View view = (View) this.f2102c.get(i);
                String str = (String) this.f2103d.get(i);
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                view.setTransitionName(str);
                ((View) this.f2104e.get(i)).setTransitionName((String) this.f2105f.get(i));
            }
        }
    }

    /* renamed from: d */
    public static void m1234d(List<View> list, View view) {
        int size = list.size();
        if (m1235h(list, view, size)) {
            return;
        }
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (view.getTransitionName() != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m1235h(list, childAt, size) && childAt.getTransitionName() != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public static boolean m1235h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m1236k(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo1217a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo1218b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo1219c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo1220e(Object obj);

    /* renamed from: f */
    public void m1237f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            View view2 = view;
            if (z) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean zIsTransitionGroup = viewGroup.isTransitionGroup();
                view2 = viewGroup;
                if (!zIsTransitionGroup) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m1237f(arrayList, viewGroup.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    /* renamed from: g */
    public abstract Object mo1221g(Object obj);

    /* renamed from: i */
    public void m1238i(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m1238i(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: j */
    public void m1239j(View view, Rect rect) {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: l */
    public abstract Object mo1222l(Object obj, Object obj2, Object obj3);

    /* renamed from: m */
    public abstract Object mo1223m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public ArrayList<String> m1240n(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            arrayList2.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        return arrayList2;
    }

    /* renamed from: o */
    public abstract void mo1224o(Object obj, View view);

    /* renamed from: p */
    public abstract void mo1225p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: q */
    public abstract void mo1226q(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: r */
    public abstract void mo1227r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: s */
    public abstract void mo1228s(Object obj, Rect rect);

    /* renamed from: t */
    public abstract void mo1229t(Object obj, View view);

    /* renamed from: u */
    public void mo1230u(ComponentCallbacksC0320m componentCallbacksC0320m, Object obj, C0217a c0217a, Runnable runnable) {
        runnable.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public void m1241v(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            String transitionName = view2.getTransitionName();
            arrayList4.add(transitionName);
            if (transitionName != null) {
                view2.setTransitionName(null);
                String str = (String) ((C0136h) map).getOrDefault(transitionName, null);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i2))) {
                        arrayList2.get(i2).setTransitionName(transitionName);
                        break;
                    }
                    i2++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0265n.m860a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: w */
    public abstract void mo1231w(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: x */
    public abstract void mo1232x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: y */
    public abstract Object mo1233y(Object obj);
}
