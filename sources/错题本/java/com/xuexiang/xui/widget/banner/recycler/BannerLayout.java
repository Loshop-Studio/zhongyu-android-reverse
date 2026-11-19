package com.xuexiang.xui.widget.banner.recycler;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import p016b0.C3078j0;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class BannerLayout extends FrameLayout {

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

    public BannerLayout(Context context) {
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
        return super.dispatchTouchEvent(motionEvent);
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

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            setPlaying(true);
        } else {
            setPlaying(false);
        }
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        throw null;
    }

    public synchronized void setPlaying(boolean z8) {
    }

    public BannerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.BannerLayoutStyle);
    }

    public BannerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Handler(new C3078j0(this, 1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BannerLayout, i, 0);
        typedArrayObtainStyledAttributes.getBoolean(R$styleable.BannerLayout_bl_showIndicator, true);
        typedArrayObtainStyledAttributes.getInt(R$styleable.BannerLayout_bl_interval, 4000);
        typedArrayObtainStyledAttributes.getBoolean(R$styleable.BannerLayout_bl_autoPlaying, true);
        AbstractC6582a.m6217a();
        throw null;
    }
}
