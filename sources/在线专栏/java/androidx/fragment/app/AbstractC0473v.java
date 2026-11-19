package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0358u;
import androidx.core.view.C0360w;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0356s;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p172y.C3483b;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
public abstract class AbstractC0473v {

    /* renamed from: androidx.fragment.app.v$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f3303a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3304b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f3305c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f3306d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f3307e;

        a(int i4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3303a = i4;
            this.f3304b = arrayList;
            this.f3305c = arrayList2;
            this.f3306d = arrayList3;
            this.f3307e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i4 = 0; i4 < this.f3303a; i4++) {
                C0358u.m1995I0((View) this.f3304b.get(i4), (String) this.f3305c.get(i4));
                C0358u.m1995I0((View) this.f3306d.get(i4), (String) this.f3307e.get(i4));
            }
        }
    }

    /* renamed from: androidx.fragment.app.v$b */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3309a;

        /* renamed from: b */
        final /* synthetic */ Map f3310b;

        b(ArrayList arrayList, Map map) {
            this.f3309a = arrayList;
            this.f3310b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3309a.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) this.f3309a.get(i4);
                String strM1998K = C0358u.m1998K(view);
                if (strM1998K != null) {
                    C0358u.m1995I0(view, AbstractC0473v.m2757i(this.f3310b, strM1998K));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.v$c */
    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3312a;

        /* renamed from: b */
        final /* synthetic */ Map f3313b;

        c(ArrayList arrayList, Map map) {
            this.f3312a = arrayList;
            this.f3313b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3312a.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) this.f3312a.get(i4);
                C0358u.m1995I0(view, (String) this.f3313b.get(C0358u.m1998K(view)));
            }
        }
    }

    /* renamed from: d */
    protected static void m2755d(List<View> list, View view) {
        int size = list.size();
        if (m2756h(list, view, size)) {
            return;
        }
        if (C0358u.m1998K(view) != null) {
            list.add(view);
        }
        for (int i4 = size; i4 < list.size(); i4++) {
            View view2 = list.get(i4);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    if (!m2756h(list, childAt, size) && C0358u.m1998K(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m2756h(List<View> list, View view, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (list.get(i5) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m2757i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: l */
    protected static boolean m2758l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo2738A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo2739B(Object obj);

    /* renamed from: a */
    public abstract void mo2740a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo2741b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo2742c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo2743e(Object obj);

    /* renamed from: f */
    void m2759f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0360w.m2111a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                m2759f(arrayList, viewGroup.getChildAt(i4));
            }
        }
    }

    /* renamed from: g */
    public abstract Object mo2744g(Object obj);

    /* renamed from: j */
    void m2760j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String strM1998K = C0358u.m1998K(view);
            if (strM1998K != null) {
                map.put(strM1998K, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    m2760j(map, viewGroup.getChildAt(i4));
                }
            }
        }
    }

    /* renamed from: k */
    protected void m2761k(View view, Rect rect) {
        if (C0358u.m2012U(view)) {
            RectF rectF = new RectF();
            rectF.set(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, view.getWidth(), view.getHeight());
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

    /* renamed from: m */
    public abstract Object mo2745m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo2746n(Object obj, Object obj2, Object obj3);

    /* renamed from: o */
    ArrayList<String> m2762o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = arrayList.get(i4);
            arrayList2.add(C0358u.m1998K(view));
            C0358u.m1995I0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo2747p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo2748q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo2749r(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: s */
    void m2763s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC0356s.m1974a(viewGroup, new c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo2750t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo2751u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo2752v(Object obj, View view);

    /* renamed from: w */
    public void mo2753w(Fragment fragment, Object obj, C3483b c3483b, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: x */
    void m2764x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC0356s.m1974a(view, new b(arrayList, map));
    }

    /* renamed from: y */
    void m2765y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = arrayList.get(i4);
            String strM1998K = C0358u.m1998K(view2);
            arrayList4.add(strM1998K);
            if (strM1998K != null) {
                C0358u.m1995I0(view2, null);
                String str = map.get(strM1998K);
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i5))) {
                        C0358u.m1995I0(arrayList2.get(i5), strM1998K);
                        break;
                    }
                    i5++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0356s.m1974a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo2754z(Object obj, View view, ArrayList<View> arrayList);
}
