package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.h */
/* loaded from: classes.dex */
public class C0374h extends AbstractViewOnTouchListenerC0367a {

    /* renamed from: s */
    private final ListView f2822s;

    public C0374h(ListView listView) {
        super(listView);
        this.f2822s = listView;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0367a
    /* renamed from: a */
    public boolean mo2145a(int i4) {
        return false;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0367a
    /* renamed from: b */
    public boolean mo2146b(int i4) {
        ListView listView = this.f2822s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i5 = firstVisiblePosition + childCount;
        if (i4 > 0) {
            if (i5 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i4 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0367a
    /* renamed from: j */
    public void mo2148j(int i4, int i5) {
        C0375i.m2183b(this.f2822s, i5);
    }
}
