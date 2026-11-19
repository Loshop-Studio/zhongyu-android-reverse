package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;
import com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout;
import p019b3.InterfaceC3105a;
import p019b3.InterfaceC3106b;
import p019b3.InterfaceC3107c;
import p129o2.C6268a;

/* loaded from: classes3.dex */
public class LinkageScrollView extends NestedScrollView implements InterfaceC3106b {

    /* renamed from: a */
    public InterfaceC3105a f4542a;

    public LinkageScrollView(Context context) {
        this(context, null);
    }

    @Override // p019b3.InterfaceC3106b
    /* renamed from: a */
    public final InterfaceC3107c mo2061a() {
        return new C6268a(this, 3);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i, int i8, int i9, int i10) {
        InterfaceC3105a interfaceC3105a;
        InterfaceC3105a interfaceC3105a2;
        super.onScrollChanged(i, i8, i9, i10);
        setVerticalScrollBarEnabled(false);
        if (!canScrollVertically(-1) && (interfaceC3105a2 = this.f4542a) != null) {
            ((C6268a) interfaceC3105a2).m5866A(this);
        }
        if (!canScrollVertically(1) && (interfaceC3105a = this.f4542a) != null) {
            ((C6268a) interfaceC3105a).m5870z(this);
        }
        InterfaceC3105a interfaceC3105a3 = this.f4542a;
        if (interfaceC3105a3 != null) {
            ((LinkageScrollLayout) ((C6268a) interfaceC3105a3).f10022b).awakenScrollBars();
        }
    }

    @Override // p019b3.InterfaceC3106b
    public void setChildLinkageEvent(InterfaceC3105a interfaceC3105a) {
        this.f4542a = interfaceC3105a;
        if (interfaceC3105a != null) {
            ((LinkageScrollLayout) ((C6268a) interfaceC3105a).f10022b).awakenScrollBars();
        }
    }

    public LinkageScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinkageScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
