package p000a.p005b.p012g.p013i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: a.b.g.i.k */
/* loaded from: classes.dex */
public abstract class AbstractC0058k implements InterfaceC0063p, InterfaceC0060m, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Rect f501b;

    /* renamed from: n */
    public static int m242n(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        C0053f c0053f = (C0053f) listAdapter;
        int count = c0053f.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = c0053f.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = c0053f.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: v */
    public static boolean m243v(C0054g c0054g) {
        int size = c0054g.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0054g.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: d */
    public boolean mo166d(C0054g c0054g, C0056i c0056i) {
        return false;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: j */
    public void mo191j(Context context, C0054g c0054g) {
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: k */
    public boolean mo168k(C0054g c0054g, C0056i c0056i) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo178l(C0054g c0054g);

    /* renamed from: m */
    public boolean mo179m() {
        return true;
    }

    /* renamed from: o */
    public abstract void mo180o(View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0053f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0053f) listAdapter).f426b.m214s((MenuItem) listAdapter.getItem(i), this, mo179m() ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo181p(boolean z);

    /* renamed from: q */
    public abstract void mo182q(int i);

    /* renamed from: r */
    public abstract void mo183r(int i);

    /* renamed from: s */
    public abstract void mo184s(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: t */
    public abstract void mo185t(boolean z);

    /* renamed from: u */
    public abstract void mo186u(int i);
}
