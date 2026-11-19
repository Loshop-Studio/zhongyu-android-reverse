package com.zykj.study.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC6878h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class MultipleStatusView extends FrameLayout {

    /* renamed from: q */
    public static final FrameLayout.LayoutParams f13786q = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: a */
    public View f13787a;

    /* renamed from: b */
    public View f13788b;

    /* renamed from: c */
    public View f13789c;

    /* renamed from: d */
    public View f13790d;

    /* renamed from: e */
    public View f13791e;

    /* renamed from: f */
    public View f13792f;

    /* renamed from: g */
    public int f13793g;

    /* renamed from: h */
    public int f13794h;

    /* renamed from: i */
    public int f13795i;

    /* renamed from: j */
    public int f13796j;

    /* renamed from: k */
    public int f13797k;

    /* renamed from: l */
    public int f13798l;

    /* renamed from: m */
    public int f13799m;

    /* renamed from: n */
    public LayoutInflater f13800n;

    /* renamed from: o */
    public View.OnClickListener f13801o;

    /* renamed from: p */
    public final List f13802p;

    public MultipleStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MultipleStatusViewStyle);
    }

    /* renamed from: a */
    public final void m11956a(View... viewArr) {
        if (viewArr == null) {
            return;
        }
        try {
            for (View view : viewArr) {
                if (view != null) {
                    removeView(view);
                }
            }
        } catch (Exception e10) {
            Log.e("multipleStatusView", "multipleStatusView", e10);
        }
    }

    /* renamed from: b */
    public final View m11957b(int i10) {
        return this.f13800n.inflate(i10, (ViewGroup) null);
    }

    /* renamed from: c */
    public final void m11958c(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MultipleStatusView, i10, 0);
        this.f13794h = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_emptyView, this.f13794h);
        this.f13795i = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_errorView, this.f13795i);
        this.f13796j = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_loadingView, this.f13796j);
        this.f13797k = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_noNetworkView, this.f13797k);
        this.f13798l = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_contentView, -1);
        typedArrayObtainStyledAttributes.recycle();
        this.f13800n = LayoutInflater.from(getContext());
    }

    /* renamed from: d */
    public final void m11959d(int i10) {
        AbstractC6878h.m6491b(Integer.valueOf(i10), "Custom view is null!");
        this.f13799m = 5;
        View viewM11957b = m11957b(i10);
        View view = this.f13787a;
        if (view != null) {
            m11956a(view);
            this.f13787a = null;
        }
        this.f13787a = viewM11957b;
        View.OnClickListener onClickListener = this.f13801o;
        if (onClickListener != null) {
            viewM11957b.setOnClickListener(onClickListener);
        }
        this.f13802p.add(Integer.valueOf(this.f13787a.getId()));
        addView(this.f13787a, 0, f13786q);
        m11972q(this.f13787a.getId());
    }

    /* renamed from: e */
    public final void m11960e(View view) {
        this.f13799m = 5;
        View view2 = this.f13787a;
        if (view2 != null) {
            m11956a(view2);
            this.f13787a = null;
        }
        this.f13787a = view;
        View.OnClickListener onClickListener = this.f13801o;
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
        }
        this.f13802p.add(Integer.valueOf(this.f13787a.getId()));
        addView(this.f13787a, 0, f13786q);
        m11972q(this.f13787a.getId());
    }

    /* renamed from: f */
    public final void m11961f() {
        int i10;
        this.f13799m = 0;
        if (this.f13792f == null && (i10 = this.f13798l) != -1) {
            View viewInflate = this.f13800n.inflate(i10, (ViewGroup) null);
            this.f13792f = viewInflate;
            addView(viewInflate, 0, f13786q);
        }
        m11962g();
    }

    /* renamed from: g */
    public final void m11962g() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            childAt.setVisibility(this.f13802p.contains(Integer.valueOf(childAt.getId())) ? 8 : 0);
        }
    }

    public View getContentView() {
        return this.f13792f;
    }

    public View getEmptyView() {
        return this.f13788b;
    }

    public View getErrorView() {
        return this.f13789c;
    }

    public View getLoadingView() {
        return this.f13790d;
    }

    public View getNoNetworkView() {
        return this.f13791e;
    }

    public int getViewStatus() {
        return this.f13799m;
    }

    /* renamed from: h */
    public final void m11963h() {
        m11964i(this.f13794h, f13786q);
    }

    /* renamed from: i */
    public final void m11964i(int i10, ViewGroup.LayoutParams layoutParams) {
        m11965j(m11957b(i10), layoutParams);
    }

    /* renamed from: j */
    public final void m11965j(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC6878h.m6491b(view, "Empty view is null!");
        this.f13799m = 2;
        if (this.f13788b == null) {
            this.f13788b = view;
            View.OnClickListener onClickListener = this.f13801o;
            if (onClickListener != null) {
                view.setOnClickListener(onClickListener);
            }
            this.f13802p.add(Integer.valueOf(this.f13788b.getId()));
            addView(this.f13788b, 0, layoutParams);
        }
        m11972q(this.f13788b.getId());
    }

    /* renamed from: k */
    public final void m11966k() {
        m11967l(this.f13795i, f13786q);
    }

    /* renamed from: l */
    public final void m11967l(int i10, ViewGroup.LayoutParams layoutParams) {
        m11968m(m11957b(i10), layoutParams);
    }

    /* renamed from: m */
    public final void m11968m(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC6878h.m6491b(view, "Error view is null!");
        this.f13799m = 3;
        if (this.f13789c == null) {
            this.f13789c = view;
            View.OnClickListener onClickListener = this.f13801o;
            if (onClickListener != null) {
                view.setOnClickListener(onClickListener);
            }
            this.f13802p.add(Integer.valueOf(this.f13789c.getId()));
            addView(this.f13789c, 0, layoutParams);
        }
        m11972q(this.f13789c.getId());
    }

    /* renamed from: n */
    public final void m11969n() {
        m11970o(this.f13797k, f13786q);
    }

    /* renamed from: o */
    public final void m11970o(int i10, ViewGroup.LayoutParams layoutParams) {
        m11971p(m11957b(i10), layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11956a(this.f13787a, this.f13788b, this.f13790d, this.f13789c, this.f13791e);
        this.f13802p.clear();
        this.f13801o = null;
        this.f13800n = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11961f();
    }

    /* renamed from: p */
    public final void m11971p(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC6878h.m6491b(view, "No network view is null!");
        this.f13799m = 4;
        if (this.f13791e == null) {
            this.f13791e = view;
            View.OnClickListener onClickListener = this.f13801o;
            if (onClickListener != null) {
                view.setOnClickListener(onClickListener);
            }
            this.f13802p.add(Integer.valueOf(this.f13791e.getId()));
            addView(this.f13791e, 0, layoutParams);
        }
        m11972q(this.f13791e.getId());
    }

    /* renamed from: q */
    public final void m11972q(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            childAt.setVisibility(childAt.getId() == i10 ? 0 : 8);
        }
    }

    public void setOnRetryClickListener(View.OnClickListener onClickListener) {
        this.f13801o = onClickListener;
    }

    public MultipleStatusView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11 = R$layout.msv_layout_empty_view;
        this.f13793g = i11;
        this.f13794h = i11;
        this.f13795i = R$layout.msv_layout_error_view;
        this.f13796j = R$layout.msv_layout_loading_view;
        this.f13797k = R$layout.msv_layout_no_network_view;
        this.f13802p = new ArrayList();
        m11958c(context, attributeSet, i10);
    }
}
