package com.xuexiang.xui.widget.banner.recycler;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.xuexiang.xui.R$styleable;
import java.util.ArrayList;
import p016b0.C3078j0;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public abstract class RecyclerViewBannerBase<L extends RecyclerView.LayoutManager, A extends RecyclerView.Adapter> extends FrameLayout {

    public class IndicatorAdapter extends RecyclerView.Adapter {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            throw null;
        }
    }

    public RecyclerViewBannerBase(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            setPlaying(false);
        } else if (action == 1 || action == 3) {
            setPlaying(true);
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPlaying(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setPlaying(false);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            setPlaying(true);
        } else {
            setPlaying(false);
        }
    }

    public void setAutoPlaying(boolean z8) {
        setPlaying(z8);
    }

    public void setIndicatorInterval(int i) {
    }

    public synchronized void setPlaying(boolean z8) {
    }

    public void setShowIndicator(boolean z8) {
        throw null;
    }

    public RecyclerViewBannerBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerViewBannerBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new ArrayList();
        new Handler(new C3078j0(this, 2));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecyclerViewBannerBase);
        typedArrayObtainStyledAttributes.getBoolean(R$styleable.RecyclerViewBannerBase_rvbb_showIndicator, true);
        typedArrayObtainStyledAttributes.getInt(R$styleable.RecyclerViewBannerBase_rvbb_interval, 4000);
        typedArrayObtainStyledAttributes.getBoolean(R$styleable.RecyclerViewBannerBase_rvbb_autoPlaying, true);
        getContext();
        typedArrayObtainStyledAttributes.getDrawable(R$styleable.RecyclerViewBannerBase_rvbb_indicatorSelectedSrc);
        getContext();
        typedArrayObtainStyledAttributes.getDrawable(R$styleable.RecyclerViewBannerBase_rvbb_indicatorUnselectedSrc);
        AbstractC6582a.m6217a();
        throw null;
    }
}
