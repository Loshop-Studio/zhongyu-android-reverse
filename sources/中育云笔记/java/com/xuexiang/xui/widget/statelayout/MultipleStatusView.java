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
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class MultipleStatusView extends FrameLayout {

    /* renamed from: q */
    public static final FrameLayout.LayoutParams f17005q = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: c */
    public View f17006c;

    /* renamed from: d */
    public View f17007d;

    /* renamed from: e */
    public View f17008e;

    /* renamed from: f */
    public View f17009f;

    /* renamed from: g */
    public View f17010g;

    /* renamed from: h */
    public int f17011h;

    /* renamed from: i */
    public int f17012i;

    /* renamed from: j */
    public int f17013j;

    /* renamed from: k */
    public int f17014k;

    /* renamed from: l */
    public int f17015l;

    /* renamed from: m */
    public int f17016m;

    /* renamed from: n */
    public LayoutInflater f17017n;

    /* renamed from: o */
    public View.OnClickListener f17018o;

    /* renamed from: p */
    public final List f17019p;

    public MultipleStatusView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m13261a(View... viewArr) {
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
    public final void m13262b(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MultipleStatusView, i10, 0);
        this.f17011h = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_emptyView, this.f17011h);
        this.f17012i = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_errorView, this.f17012i);
        this.f17013j = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_loadingView, this.f17013j);
        this.f17014k = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_noNetworkView, this.f17014k);
        this.f17015l = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_contentView, -1);
        typedArrayObtainStyledAttributes.recycle();
        this.f17017n = LayoutInflater.from(getContext());
    }

    /* renamed from: c */
    public final void m13263c() {
        int i10;
        this.f17016m = 0;
        if (this.f17010g == null && (i10 = this.f17015l) != -1) {
            View viewInflate = this.f17017n.inflate(i10, (ViewGroup) null);
            this.f17010g = viewInflate;
            addView(viewInflate, 0, f17005q);
        }
        m13264d();
    }

    /* renamed from: d */
    public final void m13264d() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            childAt.setVisibility(this.f17019p.contains(Integer.valueOf(childAt.getId())) ? 8 : 0);
        }
    }

    public View getContentView() {
        return this.f17010g;
    }

    public View getEmptyView() {
        return this.f17006c;
    }

    public View getErrorView() {
        return this.f17007d;
    }

    public View getLoadingView() {
        return this.f17008e;
    }

    public View getNoNetworkView() {
        return this.f17009f;
    }

    public int getViewStatus() {
        return this.f17016m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m13261a(this.f17006c, this.f17008e, this.f17007d, this.f17009f);
        this.f17019p.clear();
        this.f17018o = null;
        this.f17017n = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m13263c();
    }

    public void setOnRetryClickListener(View.OnClickListener onClickListener) {
        this.f17018o = onClickListener;
    }

    public MultipleStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MultipleStatusViewStyle);
    }

    public MultipleStatusView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17011h = R$layout.msv_layout_empty_view;
        this.f17012i = R$layout.msv_layout_error_view;
        this.f17013j = R$layout.msv_layout_loading_view;
        this.f17014k = R$layout.msv_layout_no_network_view;
        this.f17019p = new ArrayList();
        m13262b(context, attributeSet, i10);
    }
}
