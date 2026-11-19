package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.widget.C0214g0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0125g.b, InterfaceC0132n, AdapterView.OnItemClickListener {

    /* renamed from: c */
    private static final int[] f503c = {R.attr.background, R.attr.divider};

    /* renamed from: a */
    private C0125g f504a;

    /* renamed from: b */
    private int f505b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.C0125g.b
    /* renamed from: a */
    public boolean mo416a(C0127i c0127i) {
        return this.f504a.performItemAction(c0127i, 0);
    }

    public int getWindowAnimations() {
        return this.f505b;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0132n
    public void initialize(C0125g c0125g) {
        this.f504a = c0125g;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        mo416a((C0127i) getAdapter().getItem(i4));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0214g0 c0214g0M815v = C0214g0.m815v(context, attributeSet, f503c, i4, 0);
        if (c0214g0M815v.m834s(0)) {
            setBackgroundDrawable(c0214g0M815v.m822g(0));
        }
        if (c0214g0M815v.m834s(1)) {
            setDivider(c0214g0M815v.m822g(1));
        }
        c0214g0M815v.m835w();
    }
}
