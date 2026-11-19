package com.xuexiang.xui.widget.tabbar;

import android.animation.ValueAnimator;
import coil3.network.AbstractC3315g;
import com.xuexiang.xui.widget.tabbar.TabSegment;
import p136p3.C6370h;

/* renamed from: com.xuexiang.xui.widget.tabbar.a */
/* loaded from: classes3.dex */
public final class C4223a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C6370h f4975a;

    /* renamed from: b */
    public final /* synthetic */ C6370h f4976b;

    /* renamed from: c */
    public final /* synthetic */ TabSegment.TabItemView f4977c;

    /* renamed from: d */
    public final /* synthetic */ TabSegment.TabItemView f4978d;

    /* renamed from: e */
    public final /* synthetic */ TabSegment f4979e;

    public C4223a(TabSegment tabSegment, C6370h c6370h, C6370h c6370h2, TabSegment.TabItemView tabItemView, TabSegment.TabItemView tabItemView2) {
        this.f4979e = tabSegment;
        this.f4975a = c6370h;
        this.f4976b = c6370h2;
        this.f4977c = tabItemView;
        this.f4978d = tabItemView2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = TabSegment.f4927B;
        C6370h c6370h = this.f4975a;
        c6370h.getClass();
        TabSegment tabSegment = this.f4979e;
        int iM2238f = AbstractC3315g.m2238f(fFloatValue, tabSegment.f4942n, tabSegment.f4941m);
        C6370h c6370h2 = this.f4976b;
        c6370h2.getClass();
        int iM2238f2 = AbstractC3315g.m2238f(fFloatValue, tabSegment.f4941m, tabSegment.f4942n);
        this.f4977c.m3598a(c6370h, iM2238f);
        this.f4978d.m3598a(c6370h2, iM2238f2);
        tabSegment.m3592f(c6370h, c6370h2, fFloatValue);
    }
}
