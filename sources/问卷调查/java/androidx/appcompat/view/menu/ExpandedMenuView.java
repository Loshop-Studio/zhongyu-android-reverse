package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p005b.p012g.p013i.C0054g;
import p000a.p005b.p012g.p013i.C0056i;
import p000a.p005b.p012g.p013i.InterfaceC0061n;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0054g.b, InterfaceC0061n, AdapterView.OnItemClickListener {

    /* renamed from: c */
    public static final int[] f2750c = {R.attr.background, R.attr.divider};

    /* renamed from: b */
    public C0054g f2751b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet);
        setOnItemClickListener(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2750c, R.attr.listViewStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : C0034a.m129a(context, resourceId2));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            setDivider((!typedArrayObtainStyledAttributes.hasValue(1) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(1) : C0034a.m129a(context, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p000a.p005b.p012g.p013i.C0054g.b
    /* renamed from: b */
    public boolean mo222b(C0056i c0056i) {
        return this.f2751b.m214s(c0056i, null, 0);
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0061n
    /* renamed from: c */
    public void mo250c(C0054g c0054g) {
        this.f2751b = c0054g;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo222b((C0056i) getAdapter().getItem(i));
    }
}
