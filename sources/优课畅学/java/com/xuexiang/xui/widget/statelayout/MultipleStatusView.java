package com.xuexiang.xui.widget.statelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
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

/* loaded from: classes4.dex */
public class MultipleStatusView extends FrameLayout {

    /* renamed from: o */
    public static final FrameLayout.LayoutParams f8174o = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: a */
    public View f8175a;

    /* renamed from: b */
    public View f8176b;

    /* renamed from: c */
    public View f8177c;

    /* renamed from: d */
    public View f8178d;

    /* renamed from: e */
    public View f8179e;

    /* renamed from: f */
    public int f8180f;

    /* renamed from: g */
    public int f8181g;

    /* renamed from: h */
    public int f8182h;

    /* renamed from: i */
    public int f8183i;

    /* renamed from: j */
    public int f8184j;

    /* renamed from: k */
    public int f8185k;

    /* renamed from: l */
    public LayoutInflater f8186l;

    /* renamed from: m */
    public View.OnClickListener f8187m;

    /* renamed from: n */
    public final List f8188n;

    public MultipleStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MultipleStatusViewStyle);
    }

    /* renamed from: a */
    public final void m7154a(View... viewArr) {
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
            e10.printStackTrace();
        }
    }

    /* renamed from: b */
    public final View m7155b(int i10) {
        return this.f8186l.inflate(i10, (ViewGroup) null);
    }

    /* renamed from: c */
    public final void m7156c(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MultipleStatusView, i10, 0);
        this.f8180f = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_emptyView, this.f8180f);
        this.f8181g = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_errorView, this.f8181g);
        this.f8182h = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_loadingView, this.f8182h);
        this.f8183i = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_noNetworkView, this.f8183i);
        this.f8184j = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_contentView, -1);
        typedArrayObtainStyledAttributes.recycle();
        this.f8186l = LayoutInflater.from(getContext());
    }

    /* renamed from: d */
    public final void m7157d() {
        int i10;
        this.f8185k = 0;
        if (this.f8179e == null && (i10 = this.f8184j) != -1) {
            View viewInflate = this.f8186l.inflate(i10, (ViewGroup) null);
            this.f8179e = viewInflate;
            addView(viewInflate, 0, f8174o);
        }
        m7158e();
    }

    /* renamed from: e */
    public final void m7158e() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            childAt.setVisibility(this.f8188n.contains(Integer.valueOf(childAt.getId())) ? 8 : 0);
        }
    }

    /* renamed from: f */
    public final void m7159f() {
        m7160g(this.f8180f, f8174o);
    }

    /* renamed from: g */
    public final void m7160g(int i10, ViewGroup.LayoutParams layoutParams) {
        m7161h(m7155b(i10), layoutParams);
    }

    public View getContentView() {
        return this.f8179e;
    }

    public View getEmptyView() {
        return this.f8175a;
    }

    public View getErrorView() {
        return this.f8176b;
    }

    public View getLoadingView() {
        return this.f8177c;
    }

    public View getNoNetworkView() {
        return this.f8178d;
    }

    public int getViewStatus() {
        return this.f8185k;
    }

    /* renamed from: h */
    public final void m7161h(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC6878h.m6491b(view, "Empty view is null!");
        this.f8185k = 2;
        if (this.f8175a == null) {
            this.f8175a = view;
            View.OnClickListener onClickListener = this.f8187m;
            if (onClickListener != null) {
                view.setOnClickListener(onClickListener);
            }
            this.f8188n.add(Integer.valueOf(this.f8175a.getId()));
            addView(this.f8175a, 0, layoutParams);
        }
        m7171r(this.f8175a.getId());
    }

    /* renamed from: i */
    public final void m7162i() {
        m7163j(this.f8181g, f8174o);
    }

    /* renamed from: j */
    public final void m7163j(int i10, ViewGroup.LayoutParams layoutParams) {
        m7164k(m7155b(i10), layoutParams);
    }

    /* renamed from: k */
    public final void m7164k(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC6878h.m6491b(view, "Error view is null!");
        this.f8185k = 3;
        if (this.f8176b == null) {
            this.f8176b = view;
            View.OnClickListener onClickListener = this.f8187m;
            if (onClickListener != null) {
                view.setOnClickListener(onClickListener);
            }
            this.f8188n.add(Integer.valueOf(this.f8176b.getId()));
            addView(this.f8176b, 0, layoutParams);
        }
        m7171r(this.f8176b.getId());
    }

    /* renamed from: l */
    public final void m7165l() {
        m7166m(this.f8182h, f8174o);
    }

    /* renamed from: m */
    public final void m7166m(int i10, ViewGroup.LayoutParams layoutParams) {
        m7167n(m7155b(i10), layoutParams);
    }

    /* renamed from: n */
    public final void m7167n(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC6878h.m6491b(view, "Loading view is null!");
        this.f8185k = 1;
        if (this.f8177c == null) {
            this.f8177c = view;
            this.f8188n.add(Integer.valueOf(view.getId()));
            addView(this.f8177c, 0, layoutParams);
        }
        m7171r(this.f8177c.getId());
    }

    /* renamed from: o */
    public final void m7168o() {
        m7169p(this.f8183i, f8174o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7154a(this.f8175a, this.f8177c, this.f8176b, this.f8178d);
        this.f8188n.clear();
        this.f8187m = null;
        this.f8186l = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7157d();
    }

    /* renamed from: p */
    public final void m7169p(int i10, ViewGroup.LayoutParams layoutParams) {
        m7170q(m7155b(i10), layoutParams);
    }

    /* renamed from: q */
    public final void m7170q(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC6878h.m6491b(view, "No network view is null!");
        this.f8185k = 4;
        if (this.f8178d == null) {
            this.f8178d = view;
            View.OnClickListener onClickListener = this.f8187m;
            if (onClickListener != null) {
                view.setOnClickListener(onClickListener);
            }
            this.f8188n.add(Integer.valueOf(this.f8178d.getId()));
            addView(this.f8178d, 0, layoutParams);
        }
        m7171r(this.f8178d.getId());
    }

    /* renamed from: r */
    public final void m7171r(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            childAt.setVisibility(childAt.getId() == i10 ? 0 : 8);
        }
    }

    public void setOnRetryClickListener(View.OnClickListener onClickListener) {
        this.f8187m = onClickListener;
    }

    public MultipleStatusView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8180f = R$layout.msv_layout_empty_view;
        this.f8181g = R$layout.msv_layout_error_view;
        this.f8182h = R$layout.msv_layout_loading_view;
        this.f8183i = R$layout.msv_layout_no_network_view;
        this.f8188n = new ArrayList();
        m7156c(context, attributeSet, i10);
    }
}
