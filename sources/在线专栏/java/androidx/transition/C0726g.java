package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.g */
/* loaded from: classes.dex */
class C0726g extends FrameLayout {

    /* renamed from: a */
    private ViewGroup f4418a;

    /* renamed from: b */
    private boolean f4419b;

    C0726g(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f4418a = viewGroup;
        viewGroup.setTag(C0742o.f4447b, this);
        C0719c0.m3849b(this.f4418a).add(this);
        this.f4419b = true;
    }

    /* renamed from: b */
    static C0726g m3870b(ViewGroup viewGroup) {
        return (C0726g) viewGroup.getTag(C0742o.f4447b);
    }

    /* renamed from: c */
    private int m3871c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i4 = 0;
        while (i4 <= childCount) {
            int i5 = (i4 + childCount) / 2;
            m3872d(((C0730i) getChildAt(i5)).f4433c, arrayList2);
            if (m3874f(arrayList, arrayList2)) {
                i4 = i5 + 1;
            } else {
                childCount = i5 - 1;
            }
            arrayList2.clear();
        }
        return i4;
    }

    /* renamed from: d */
    private static void m3872d(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m3872d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: e */
    private static boolean m3873e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(C0719c0.m3848a(viewGroup, i4));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m3874f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        for (int i4 = 1; i4 < iMin; i4++) {
            View view = arrayList.get(i4);
            View view2 = arrayList2.get(i4);
            if (view != view2) {
                return m3873e(view, view2);
            }
        }
        return arrayList2.size() == iMin;
    }

    /* renamed from: a */
    void m3875a(C0730i c0730i) {
        ArrayList<View> arrayList = new ArrayList<>();
        m3872d(c0730i.f4433c, arrayList);
        int iM3871c = m3871c(arrayList);
        if (iM3871c < 0 || iM3871c >= getChildCount()) {
            addView(c0730i);
        } else {
            addView(c0730i, iM3871c);
        }
    }

    /* renamed from: g */
    void m3876g() {
        if (!this.f4419b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        C0719c0.m3849b(this.f4418a).remove(this);
        C0719c0.m3849b(this.f4418a).add(this);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f4419b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f4418a.setTag(C0742o.f4447b, null);
            C0719c0.m3849b(this.f4418a).remove(this);
            this.f4419b = false;
        }
    }
}
