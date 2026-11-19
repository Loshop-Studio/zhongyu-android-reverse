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
import com.xuexiang.xui.utils.AbstractC5860h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class MultipleStatusView extends FrameLayout {

    /* renamed from: o */
    public static final FrameLayout.LayoutParams f5457o = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: a */
    public View f5458a;

    /* renamed from: b */
    public View f5459b;

    /* renamed from: c */
    public View f5460c;

    /* renamed from: d */
    public View f5461d;

    /* renamed from: e */
    public View f5462e;

    /* renamed from: f */
    public int f5463f;

    /* renamed from: g */
    public int f5464g;

    /* renamed from: h */
    public int f5465h;

    /* renamed from: i */
    public int f5466i;

    /* renamed from: j */
    public int f5467j;

    /* renamed from: k */
    public int f5468k;

    /* renamed from: l */
    public LayoutInflater f5469l;

    /* renamed from: m */
    public View.OnClickListener f5470m;

    /* renamed from: n */
    public final List f5471n;

    public MultipleStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MultipleStatusViewStyle);
    }

    /* renamed from: a */
    public final void m4958a(View... viewArr) {
        if (viewArr == null) {
            return;
        }
        try {
            for (View view : viewArr) {
                if (view != null) {
                    removeView(view);
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m4959b(Context context, AttributeSet attributeSet, int i6) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MultipleStatusView, i6, 0);
        this.f5463f = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_emptyView, this.f5463f);
        this.f5464g = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_errorView, this.f5464g);
        this.f5465h = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_loadingView, this.f5465h);
        this.f5466i = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_noNetworkView, this.f5466i);
        this.f5467j = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_contentView, -1);
        typedArrayObtainStyledAttributes.recycle();
        this.f5469l = LayoutInflater.from(getContext());
    }

    /* renamed from: c */
    public final void m4960c() {
        int i6;
        this.f5468k = 0;
        if (this.f5462e == null && (i6 = this.f5467j) != -1) {
            View viewInflate = this.f5469l.inflate(i6, (ViewGroup) null);
            this.f5462e = viewInflate;
            addView(viewInflate, 0, f5457o);
        }
        m4961d();
    }

    /* renamed from: d */
    public final void m4961d() {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            childAt.setVisibility(this.f5471n.contains(Integer.valueOf(childAt.getId())) ? 8 : 0);
        }
    }

    /* renamed from: e */
    public final void m4962e(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC5860h.m4398b(view, "Empty view is null!");
        this.f5468k = 2;
        if (this.f5458a == null) {
            this.f5458a = view;
            View.OnClickListener onClickListener = this.f5470m;
            if (onClickListener != null) {
                view.setOnClickListener(onClickListener);
            }
            this.f5471n.add(Integer.valueOf(this.f5458a.getId()));
            addView(this.f5458a, 0, layoutParams);
        }
        m4963f(this.f5458a.getId());
    }

    /* renamed from: f */
    public final void m4963f(int i6) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            childAt.setVisibility(childAt.getId() == i6 ? 0 : 8);
        }
    }

    public View getContentView() {
        return this.f5462e;
    }

    public View getEmptyView() {
        return this.f5458a;
    }

    public View getErrorView() {
        return this.f5459b;
    }

    public View getLoadingView() {
        return this.f5460c;
    }

    public View getNoNetworkView() {
        return this.f5461d;
    }

    public int getViewStatus() {
        return this.f5468k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4958a(this.f5458a, this.f5460c, this.f5459b, this.f5461d);
        this.f5471n.clear();
        this.f5470m = null;
        this.f5469l = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4960c();
    }

    public void setOnRetryClickListener(View.OnClickListener onClickListener) {
        this.f5470m = onClickListener;
    }

    public MultipleStatusView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f5463f = R$layout.msv_layout_empty_view;
        this.f5464g = R$layout.msv_layout_error_view;
        this.f5465h = R$layout.msv_layout_loading_view;
        this.f5466i = R$layout.msv_layout_no_network_view;
        this.f5471n = new ArrayList();
        m4959b(context, attributeSet, i6);
    }
}
