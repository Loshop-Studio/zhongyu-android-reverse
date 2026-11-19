package com.xuexiang.xui.widget.tabbar;

import android.animation.Animator;
import com.xuexiang.xui.widget.tabbar.TabSegment;
import java.util.ArrayList;
import p136p3.C6370h;
import p136p3.C6372j;

/* renamed from: com.xuexiang.xui.widget.tabbar.b */
/* loaded from: classes3.dex */
public final class C4224b implements Animator.AnimatorListener {

    /* renamed from: a */
    public final /* synthetic */ TabSegment.TabItemView f4980a;

    /* renamed from: b */
    public final /* synthetic */ C6370h f4981b;

    /* renamed from: c */
    public final /* synthetic */ TabSegment.TabItemView f4982c;

    /* renamed from: d */
    public final /* synthetic */ C6370h f4983d;

    /* renamed from: e */
    public final /* synthetic */ int f4984e;

    /* renamed from: f */
    public final /* synthetic */ TabSegment f4985f;

    public C4224b(TabSegment tabSegment, TabSegment.TabItemView tabItemView, C6370h c6370h, TabSegment.TabItemView tabItemView2, C6370h c6370h2, int i, int i8) {
        this.f4985f = tabSegment;
        this.f4980a = tabItemView;
        this.f4981b = c6370h;
        this.f4982c = tabItemView2;
        this.f4983d = c6370h2;
        this.f4984e = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        TabSegment tabSegment = this.f4985f;
        tabSegment.f4947s = null;
        TabSegment.TabItemView tabItemView = this.f4980a;
        C6370h c6370h = this.f4981b;
        tabItemView.m3599b(c6370h, true);
        this.f4982c.m3599b(this.f4983d, false);
        tabSegment.m3591e(c6370h, true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TabSegment tabSegment = this.f4985f;
        tabSegment.f4947s = null;
        TabSegment.TabItemView tabItemView = this.f4980a;
        tabItemView.m3599b(this.f4981b, false);
        TabSegment.TabItemView tabItemView2 = this.f4982c;
        tabItemView2.m3599b(this.f4983d, true);
        int i = this.f4984e;
        tabSegment.m3590d(i);
        ArrayList arrayList = tabSegment.f4929a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C6372j) arrayList.get(size)).getClass();
        }
        tabItemView.getTextView();
        tabItemView2.getTextView();
        tabSegment.f4931c = i;
        int i8 = tabSegment.f4932d;
        if (i8 == -1 || tabSegment.f4946r != 0) {
            return;
        }
        tabSegment.m3595i(i8, true, false);
        tabSegment.f4932d = -1;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4985f.f4947s = animator;
    }
}
