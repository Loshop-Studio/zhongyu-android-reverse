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
import p015c.C1047j;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f1015a;

    /* renamed from: b */
    private int f1016b;

    /* renamed from: c */
    private WeakReference<View> f1017c;

    /* renamed from: d */
    private LayoutInflater f1018d;

    /* renamed from: e */
    private InterfaceC0200a f1019e;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface InterfaceC0200a {
        /* renamed from: a */
        void m732a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View m731a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1015a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f1018d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f1015a, viewGroup, false);
        int i4 = this.f1016b;
        if (i4 != -1) {
            viewInflate.setId(i4);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f1017c = new WeakReference<>(viewInflate);
        InterfaceC0200a interfaceC0200a = this.f1019e;
        if (interfaceC0200a != null) {
            interfaceC0200a.m732a(this, viewInflate);
        }
        return viewInflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1016b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1018d;
    }

    public int getLayoutResource() {
        return this.f1015a;
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i4) {
        this.f1016b = i4;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1018d = layoutInflater;
    }

    public void setLayoutResource(int i4) {
        this.f1015a = i4;
    }

    public void setOnInflateListener(InterfaceC0200a interfaceC0200a) {
        this.f1019e = interfaceC0200a;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        WeakReference<View> weakReference = this.f1017c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i4);
            return;
        }
        super.setVisibility(i4);
        if (i4 == 0 || i4 == 4) {
            m731a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1015a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1047j.f6041X3, i4, 0);
        this.f1016b = typedArrayObtainStyledAttributes.getResourceId(C1047j.f6057a4, -1);
        this.f1015a = typedArrayObtainStyledAttributes.getResourceId(C1047j.f6051Z3, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(C1047j.f6046Y3, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
