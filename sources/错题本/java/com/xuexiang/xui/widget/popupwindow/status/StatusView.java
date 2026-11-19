package com.xuexiang.xui.widget.popupwindow.status;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.xuexiang.xui.R$anim;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import p016b0.RunnableC3059a;
import p080i3.C5676b;
import p080i3.C5677c;

/* loaded from: classes3.dex */
public class StatusView extends FrameLayout {

    /* renamed from: a */
    public Status f4628a;

    /* renamed from: b */
    public final boolean f4629b;

    /* renamed from: c */
    public final View f4630c;

    /* renamed from: d */
    public final View f4631d;

    /* renamed from: e */
    public final View f4632e;

    /* renamed from: f */
    public final View f4633f;

    /* renamed from: g */
    public final Animation f4634g;

    /* renamed from: h */
    public final Animation f4635h;

    /* renamed from: i */
    public final Handler f4636i;

    /* renamed from: j */
    public final RunnableC3059a f4637j;

    public StatusView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final View m3536a(Status status) {
        if (status == Status.NONE) {
            return null;
        }
        if (status == Status.COMPLETE) {
            return this.f4630c;
        }
        if (status == Status.ERROR) {
            return this.f4631d;
        }
        if (status == Status.LOADING) {
            return this.f4632e;
        }
        if (status == Status.CUSTOM) {
            return this.f4633f;
        }
        return null;
    }

    public View getCompleteView() {
        return this.f4630c;
    }

    public View getCustomView() {
        return this.f4633f;
    }

    public View getErrorView() {
        return this.f4631d;
    }

    public View getLoadingView() {
        return this.f4632e;
    }

    public Status getStatus() {
        return this.f4628a;
    }

    public void setOnCompleteClickListener(@NonNull View.OnClickListener onClickListener) {
        this.f4630c.setOnClickListener(onClickListener);
    }

    public void setOnCustomClickListener(@NonNull View.OnClickListener onClickListener) {
        this.f4633f.setOnClickListener(onClickListener);
    }

    public void setOnErrorClickListener(@NonNull View.OnClickListener onClickListener) {
        this.f4631d.setOnClickListener(onClickListener);
    }

    public void setOnLoadingClickListener(@NonNull View.OnClickListener onClickListener) {
        this.f4632e.setOnClickListener(onClickListener);
    }

    public void setStatus(Status status) {
        setVisibility(0);
        Status status2 = this.f4628a;
        Status status3 = Status.NONE;
        if (status2 == status3) {
            this.f4628a = status;
            View viewM3536a = m3536a(status);
            if (viewM3536a != null) {
                viewM3536a.setVisibility(0);
                viewM3536a.startAnimation(this.f4635h);
            }
        } else if (status != status3) {
            View viewM3536a2 = m3536a(status2);
            View viewM3536a3 = m3536a(status);
            clearAnimation();
            viewM3536a2.setVisibility(0);
            viewM3536a2.startAnimation(this.f4634g);
            this.f4634g.setAnimationListener(new C5676b(this, viewM3536a2, viewM3536a3));
            this.f4628a = status;
        } else {
            View viewM3536a4 = m3536a(status2);
            if (viewM3536a4 != null) {
                viewM3536a4.startAnimation(this.f4634g);
                this.f4634g.setAnimationListener(new C5677c(this, viewM3536a4));
            }
        }
        this.f4636i.removeCallbacksAndMessages(null);
        if (status == Status.COMPLETE && this.f4629b) {
            this.f4636i.postDelayed(this.f4637j, 1000L);
        }
    }

    public StatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.StatusViewStyle);
    }

    public StatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4629b = true;
        this.f4637j = new RunnableC3059a(this, 14);
        this.f4628a = Status.NONE;
        this.f4635h = AnimationUtils.loadAnimation(context, R$anim.sv_slide_in);
        this.f4634g = AnimationUtils.loadAnimation(context, R$anim.sv_slide_out);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f4636i = new Handler();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.StatusView, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.StatusView_sv_complete, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.StatusView_sv_error, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.StatusView_sv_loading, 0);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.StatusView_sv_custom, 0);
        this.f4629b = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StatusView_sv_dismissOnComplete, this.f4629b);
        this.f4630c = layoutInflaterFrom.inflate(resourceId, (ViewGroup) null);
        this.f4631d = layoutInflaterFrom.inflate(resourceId2, (ViewGroup) null);
        this.f4632e = layoutInflaterFrom.inflate(resourceId3, (ViewGroup) null);
        this.f4633f = layoutInflaterFrom.inflate(resourceId4, (ViewGroup) null);
        this.f4630c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f4631d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f4632e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f4633f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f4630c);
        addView(this.f4631d);
        addView(this.f4632e);
        addView(this.f4633f);
        this.f4630c.setVisibility(4);
        this.f4631d.setVisibility(4);
        this.f4632e.setVisibility(4);
        this.f4633f.setVisibility(4);
        typedArrayObtainStyledAttributes.recycle();
    }
}
