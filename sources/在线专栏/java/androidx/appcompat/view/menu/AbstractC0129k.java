package androidx.appcompat.view.menu;

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

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: classes.dex */
public abstract class AbstractC0129k implements InterfaceC0134p, InterfaceC0131m, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private Rect f658a;

    AbstractC0129k() {
    }

    /* renamed from: e */
    protected static int m514e(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = listAdapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i7, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i4) {
                return i4;
            }
            if (measuredWidth > i5) {
                i5 = measuredWidth;
            }
        }
        return i5;
    }

    /* renamed from: o */
    protected static boolean m515o(C0125g c0125g) {
        int size = c0125g.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = c0125g.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    protected static C0124f m516p(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0124f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0124f) listAdapter;
    }

    /* renamed from: b */
    public abstract void mo451b(C0125g c0125g);

    /* renamed from: c */
    protected boolean mo452c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean collapseItemActionView(C0125g c0125g, C0127i c0127i) {
        return false;
    }

    /* renamed from: d */
    public Rect m517d() {
        return this.f658a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean expandItemActionView(C0125g c0125g, C0127i c0127i) {
        return false;
    }

    /* renamed from: g */
    public abstract void mo454g(View view);

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public int getId() {
        return 0;
    }

    /* renamed from: h */
    public void m518h(Rect rect) {
        this.f658a = rect;
    }

    /* renamed from: i */
    public abstract void mo455i(boolean z3);

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void initForMenu(Context context, C0125g c0125g) {
    }

    /* renamed from: j */
    public abstract void mo456j(int i4);

    /* renamed from: k */
    public abstract void mo457k(int i4);

    /* renamed from: l */
    public abstract void mo458l(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: m */
    public abstract void mo459m(boolean z3);

    /* renamed from: n */
    public abstract void mo460n(int i4);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m516p(listAdapter).f605a.performItemAction((MenuItem) listAdapter.getItem(i4), this, mo452c() ? 0 : 4);
    }
}
