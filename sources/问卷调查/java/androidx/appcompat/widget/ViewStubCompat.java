package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p000a.p005b.C0014b;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: b */
    public int f2993b;

    /* renamed from: c */
    public int f2994c;

    /* renamed from: d */
    public WeakReference<View> f2995d;

    /* renamed from: e */
    public LayoutInflater f2996e;

    /* renamed from: f */
    public InterfaceC0498a f2997f;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface InterfaceC0498a {
        /* renamed from: a */
        void m1633a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2993b = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0014b.f51z, 0, 0);
        this.f2994c = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f2993b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View m1632a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f2993b == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f2996e;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f2993b, viewGroup, false);
        int i = this.f2994c;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f2995d = new WeakReference<>(viewInflate);
        InterfaceC0498a interfaceC0498a = this.f2997f;
        if (interfaceC0498a != null) {
            interfaceC0498a.m1633a(this, viewInflate);
        }
        return viewInflate;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2994c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2996e;
    }

    public int getLayoutResource() {
        return this.f2993b;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f2994c = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2996e = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f2993b = i;
    }

    public void setOnInflateListener(InterfaceC0498a interfaceC0498a) {
        this.f2997f = interfaceC0498a;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f2995d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m1632a();
        }
    }
}
