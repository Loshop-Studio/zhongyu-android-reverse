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
import p117d9.AbstractAnimationAnimationListenerC9006a;

/* loaded from: classes5.dex */
public class StatusView extends FrameLayout {

    /* renamed from: c */
    public Status f16671c;

    /* renamed from: d */
    public boolean f16672d;

    /* renamed from: e */
    public View f16673e;

    /* renamed from: f */
    public View f16674f;

    /* renamed from: g */
    public View f16675g;

    /* renamed from: h */
    public View f16676h;

    /* renamed from: i */
    public Animation f16677i;

    /* renamed from: j */
    public Animation f16678j;

    /* renamed from: k */
    public Handler f16679k;

    /* renamed from: l */
    public Runnable f16680l;

    /* renamed from: com.xuexiang.xui.widget.popupwindow.status.StatusView$a */
    public class RunnableC8199a implements Runnable {
        public RunnableC8199a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StatusView statusView = StatusView.this;
            statusView.m13071j(statusView.m13072k(statusView.f16671c));
            StatusView.this.f16679k.removeCallbacks(StatusView.this.f16680l);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.status.StatusView$b */
    public class C8200b extends AbstractAnimationAnimationListenerC9006a {

        /* renamed from: c */
        public final /* synthetic */ View f16682c;

        /* renamed from: d */
        public final /* synthetic */ View f16683d;

        public C8200b(View view, View view2) {
            this.f16682c = view;
            this.f16683d = view2;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            StatusView.this.f16677i.setAnimationListener(null);
            this.f16682c.setVisibility(4);
            this.f16683d.setVisibility(0);
            this.f16683d.startAnimation(StatusView.this.f16678j);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.status.StatusView$c */
    public class C8201c extends AbstractAnimationAnimationListenerC9006a {

        /* renamed from: c */
        public final /* synthetic */ View f16685c;

        public C8201c(View view) {
            this.f16685c = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            StatusView.this.f16671c = Status.NONE;
            this.f16685c.setVisibility(4);
            StatusView.this.f16677i.setAnimationListener(null);
            StatusView.this.setVisibility(8);
        }
    }

    public StatusView(Context context) {
        this(context, null);
    }

    public View getCompleteView() {
        return this.f16673e;
    }

    public View getCustomView() {
        return this.f16676h;
    }

    public View getErrorView() {
        return this.f16674f;
    }

    public View getLoadingView() {
        return this.f16675g;
    }

    public Status getStatus() {
        return this.f16671c;
    }

    /* renamed from: i */
    public final void m13070i(View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(0);
        view.startAnimation(this.f16678j);
    }

    /* renamed from: j */
    public final void m13071j(View view) {
        if (view == null) {
            return;
        }
        view.startAnimation(this.f16677i);
        this.f16677i.setAnimationListener(new C8201c(view));
    }

    /* renamed from: k */
    public final View m13072k(Status status) {
        if (status == Status.NONE) {
            return null;
        }
        if (status == Status.COMPLETE) {
            return this.f16673e;
        }
        if (status == Status.ERROR) {
            return this.f16674f;
        }
        if (status == Status.LOADING) {
            return this.f16675g;
        }
        if (status == Status.CUSTOM) {
            return this.f16676h;
        }
        return null;
    }

    /* renamed from: l */
    public final void m13073l(Context context, AttributeSet attributeSet, int i10, int i11, int i12, int i13, int i14) {
        this.f16671c = Status.NONE;
        this.f16678j = AnimationUtils.loadAnimation(context, R$anim.sv_slide_in);
        this.f16677i = AnimationUtils.loadAnimation(context, R$anim.sv_slide_out);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f16679k = new Handler();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.StatusView, i10, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.StatusView_sv_complete, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.StatusView_sv_error, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.StatusView_sv_loading, 0);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.StatusView_sv_custom, 0);
        this.f16672d = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StatusView_sv_dismissOnComplete, this.f16672d);
        if (i11 == 0) {
            i11 = resourceId;
        }
        this.f16673e = layoutInflaterFrom.inflate(i11, (ViewGroup) null);
        if (i12 == 0) {
            i12 = resourceId2;
        }
        this.f16674f = layoutInflaterFrom.inflate(i12, (ViewGroup) null);
        if (i13 == 0) {
            i13 = resourceId3;
        }
        this.f16675g = layoutInflaterFrom.inflate(i13, (ViewGroup) null);
        if (i14 == 0) {
            i14 = resourceId4;
        }
        this.f16676h = layoutInflaterFrom.inflate(i14, (ViewGroup) null);
        this.f16673e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f16674f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f16675g.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f16676h.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f16673e);
        addView(this.f16674f);
        addView(this.f16675g);
        addView(this.f16676h);
        this.f16673e.setVisibility(4);
        this.f16674f.setVisibility(4);
        this.f16675g.setVisibility(4);
        this.f16676h.setVisibility(4);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: m */
    public final void m13074m(Context context, AttributeSet attributeSet, int i10) {
        m13073l(context, attributeSet, i10, 0, 0, 0, 0);
    }

    /* renamed from: n */
    public final void m13075n(View view, View view2) {
        clearAnimation();
        view.setVisibility(0);
        view.startAnimation(this.f16677i);
        this.f16677i.setAnimationListener(new C8200b(view, view2));
    }

    public void setOnCompleteClickListener(@NonNull View.OnClickListener onClickListener) {
        this.f16673e.setOnClickListener(onClickListener);
    }

    public void setOnCustomClickListener(@NonNull View.OnClickListener onClickListener) {
        this.f16676h.setOnClickListener(onClickListener);
    }

    public void setOnErrorClickListener(@NonNull View.OnClickListener onClickListener) {
        this.f16674f.setOnClickListener(onClickListener);
    }

    public void setOnLoadingClickListener(@NonNull View.OnClickListener onClickListener) {
        this.f16675g.setOnClickListener(onClickListener);
    }

    public void setStatus(Status status) {
        setVisibility(0);
        Status status2 = this.f16671c;
        Status status3 = Status.NONE;
        if (status2 == status3) {
            this.f16671c = status;
            m13070i(m13072k(status));
        } else if (status != status3) {
            m13075n(m13072k(status2), m13072k(status));
            this.f16671c = status;
        } else {
            m13071j(m13072k(status2));
        }
        this.f16679k.removeCallbacksAndMessages(null);
        if (status == Status.COMPLETE && this.f16672d) {
            this.f16679k.postDelayed(this.f16680l, 1000L);
        }
    }

    public StatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.StatusViewStyle);
    }

    public StatusView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16672d = true;
        this.f16680l = new RunnableC8199a();
        m13074m(context, attributeSet, i10);
    }
}
