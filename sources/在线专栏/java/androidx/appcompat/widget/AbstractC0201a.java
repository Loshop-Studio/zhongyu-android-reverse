package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0358u;
import androidx.core.view.C0362y;
import androidx.core.view.InterfaceC0363z;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p015c.C1038a;
import p015c.C1047j;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
abstract class AbstractC0201a extends ViewGroup {

    /* renamed from: a */
    protected final a f1020a;

    /* renamed from: b */
    protected final Context f1021b;

    /* renamed from: c */
    protected ActionMenuView f1022c;

    /* renamed from: d */
    protected ActionMenuPresenter f1023d;

    /* renamed from: e */
    protected int f1024e;

    /* renamed from: f */
    protected C0362y f1025f;

    /* renamed from: g */
    private boolean f1026g;

    /* renamed from: h */
    private boolean f1027h;

    /* renamed from: androidx.appcompat.widget.a$a */
    protected class a implements InterfaceC0363z {

        /* renamed from: a */
        private boolean f1028a = false;

        /* renamed from: b */
        int f1029b;

        protected a() {
        }

        /* renamed from: a */
        public a m738a(C0362y c0362y, int i4) {
            AbstractC0201a.this.f1025f = c0362y;
            this.f1029b = i4;
            return this;
        }

        @Override // androidx.core.view.InterfaceC0363z
        public void onAnimationCancel(View view) {
            this.f1028a = true;
        }

        @Override // androidx.core.view.InterfaceC0363z
        public void onAnimationEnd(View view) {
            if (this.f1028a) {
                return;
            }
            AbstractC0201a abstractC0201a = AbstractC0201a.this;
            abstractC0201a.f1025f = null;
            AbstractC0201a.super.setVisibility(this.f1029b);
        }

        @Override // androidx.core.view.InterfaceC0363z
        public void onAnimationStart(View view) {
            AbstractC0201a.super.setVisibility(0);
            this.f1028a = false;
        }
    }

    AbstractC0201a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    protected static int m735d(int i4, int i5, boolean z3) {
        return z3 ? i4 - i5 : i4 + i5;
    }

    /* renamed from: c */
    protected int m736c(View view, int i4, int i5, int i6) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i5);
        return Math.max(0, (i4 - view.getMeasuredWidth()) - i6);
    }

    /* renamed from: e */
    protected int m737e(View view, int i4, int i5, int i6, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = i5 + ((i6 - measuredHeight) / 2);
        if (z3) {
            view.layout(i4 - measuredWidth, i7, i4, measuredHeight + i7);
        } else {
            view.layout(i4, i7, i4 + measuredWidth, measuredHeight + i7);
        }
        return z3 ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C0362y mo537f(int i4, long j4) {
        C0362y c0362y = this.f1025f;
        if (c0362y != null) {
            c0362y.m2122b();
        }
        if (i4 != 0) {
            C0362y c0362yM2121a = C0358u.m2022c(this).m2121a(IGoodView.DEFAULT_TO_ALPHA);
            c0362yM2121a.m2124d(j4);
            c0362yM2121a.m2126f(this.f1020a.m738a(c0362yM2121a, i4));
            return c0362yM2121a;
        }
        if (getVisibility() != 0) {
            setAlpha(IGoodView.DEFAULT_TO_ALPHA);
        }
        C0362y c0362yM2121a2 = C0358u.m2022c(this).m2121a(1.0f);
        c0362yM2121a2.m2124d(j4);
        c0362yM2121a2.m2126f(this.f1020a.m738a(c0362yM2121a2, i4));
        return c0362yM2121a2;
    }

    public int getAnimatedVisibility() {
        return this.f1025f != null ? this.f1020a.f1029b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1024e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C1047j.f6052a, C1038a.f5739c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(C1047j.f6098j, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1023d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m584y(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1027h = false;
        }
        if (!this.f1027h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1027h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1027h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1026g = false;
        }
        if (!this.f1026g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1026g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1026g = false;
        }
        return true;
    }

    public void setContentHeight(int i4) {
        this.f1024e = i4;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            C0362y c0362y = this.f1025f;
            if (c0362y != null) {
                c0362y.m2122b();
            }
            super.setVisibility(i4);
        }
    }

    AbstractC0201a(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1020a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C1038a.f5737a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1021b = context;
        } else {
            this.f1021b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
