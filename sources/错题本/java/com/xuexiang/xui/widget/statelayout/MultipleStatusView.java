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

/* loaded from: classes3.dex */
public class MultipleStatusView extends FrameLayout {

    /* renamed from: i */
    public static final FrameLayout.LayoutParams f4891i = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: a */
    public View f4892a;

    /* renamed from: b */
    public final int f4893b;

    /* renamed from: c */
    public final int f4894c;

    /* renamed from: d */
    public final int f4895d;

    /* renamed from: e */
    public final int f4896e;

    /* renamed from: f */
    public final int f4897f;

    /* renamed from: g */
    public LayoutInflater f4898g;

    /* renamed from: h */
    public final ArrayList f4899h;

    public MultipleStatusView(Context context) {
        this(context, null);
    }

    public View getContentView() {
        return this.f4892a;
    }

    public View getEmptyView() {
        return null;
    }

    public View getErrorView() {
        return null;
    }

    public View getLoadingView() {
        return null;
    }

    public View getNoNetworkView() {
        return null;
    }

    public int getViewStatus() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View[] viewArr = {null, null, null, null};
        for (int i = 0; i < 4; i++) {
            try {
                View view = viewArr[i];
                if (view != null) {
                    removeView(view);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f4899h.clear();
        this.f4898g = null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int i;
        super.onFinishInflate();
        if (this.f4892a == null && (i = this.f4897f) != -1) {
            View viewInflate = this.f4898g.inflate(i, (ViewGroup) null);
            this.f4892a = viewInflate;
            addView(viewInflate, 0, f4891i);
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            childAt.setVisibility(this.f4899h.contains(Integer.valueOf(childAt.getId())) ? 8 : 0);
        }
    }

    public void setOnRetryClickListener(View.OnClickListener onClickListener) {
    }

    public MultipleStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MultipleStatusViewStyle);
    }

    public MultipleStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4893b = R$layout.msv_layout_empty_view;
        this.f4894c = R$layout.msv_layout_error_view;
        this.f4895d = R$layout.msv_layout_loading_view;
        this.f4896e = R$layout.msv_layout_no_network_view;
        this.f4899h = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MultipleStatusView, i, 0);
        this.f4893b = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_emptyView, this.f4893b);
        this.f4894c = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_errorView, this.f4894c);
        this.f4895d = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_loadingView, this.f4895d);
        this.f4896e = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_noNetworkView, this.f4896e);
        this.f4897f = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MultipleStatusView_msv_contentView, -1);
        typedArrayObtainStyledAttributes.recycle();
        this.f4898g = LayoutInflater.from(getContext());
    }
}
