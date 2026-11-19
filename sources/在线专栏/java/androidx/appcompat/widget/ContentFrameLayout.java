package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.view.C0358u;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    private TypedValue f878a;

    /* renamed from: b */
    private TypedValue f879b;

    /* renamed from: c */
    private TypedValue f880c;

    /* renamed from: d */
    private TypedValue f881d;

    /* renamed from: e */
    private TypedValue f882e;

    /* renamed from: f */
    private TypedValue f883f;

    /* renamed from: g */
    private final Rect f884g;

    /* renamed from: h */
    private InterfaceC0168a f885h;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC0168a {
        /* renamed from: a */
        void mo251a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m641a(int i4, int i5, int i6, int i7) {
        this.f884g.set(i4, i5, i6, i7);
        if (C0358u.m2013V(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f882e == null) {
            this.f882e = new TypedValue();
        }
        return this.f882e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f883f == null) {
            this.f883f = new TypedValue();
        }
        return this.f883f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f880c == null) {
            this.f880c = new TypedValue();
        }
        return this.f880c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f881d == null) {
            this.f881d = new TypedValue();
        }
        return this.f881d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f878a == null) {
            this.f878a = new TypedValue();
        }
        return this.f878a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f879b == null) {
            this.f879b = new TypedValue();
        }
        return this.f879b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0168a interfaceC0168a = this.f885h;
        if (interfaceC0168a != null) {
            interfaceC0168a.mo251a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0168a interfaceC0168a = this.f885h;
        if (interfaceC0168a != null) {
            interfaceC0168a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0168a interfaceC0168a) {
        this.f885h = interfaceC0168a;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f884g = new Rect();
    }
}
