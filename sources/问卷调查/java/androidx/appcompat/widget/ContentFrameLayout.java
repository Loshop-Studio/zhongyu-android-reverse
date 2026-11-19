package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import java.util.Objects;
import p000a.p005b.p006c.C0026l;
import p000a.p005b.p006c.LayoutInflaterFactory2C0024j;
import p000a.p005b.p012g.p013i.C0054g;
import p000a.p005b.p014h.InterfaceC0119z;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b */
    public TypedValue f2859b;

    /* renamed from: c */
    public TypedValue f2860c;

    /* renamed from: d */
    public TypedValue f2861d;

    /* renamed from: e */
    public TypedValue f2862e;

    /* renamed from: f */
    public TypedValue f2863f;

    /* renamed from: g */
    public TypedValue f2864g;

    /* renamed from: h */
    public final Rect f2865h;

    /* renamed from: i */
    public InterfaceC0473a f2866i;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC0473a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2865h = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2863f == null) {
            this.f2863f = new TypedValue();
        }
        return this.f2863f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2864g == null) {
            this.f2864g = new TypedValue();
        }
        return this.f2864g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2861d == null) {
            this.f2861d = new TypedValue();
        }
        return this.f2861d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2862e == null) {
            this.f2862e = new TypedValue();
        }
        return this.f2862e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2859b == null) {
            this.f2859b = new TypedValue();
        }
        return this.f2859b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2860c == null) {
            this.f2860c = new TypedValue();
        }
        return this.f2860c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0473a interfaceC0473a = this.f2866i;
        if (interfaceC0473a != null) {
            Objects.requireNonNull((C0026l) interfaceC0473a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0473a interfaceC0473a = this.f2866i;
        if (interfaceC0473a != null) {
            LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j = ((C0026l) interfaceC0473a).f150a;
            InterfaceC0119z interfaceC0119z = layoutInflaterFactory2C0024j.f102l;
            if (interfaceC0119z != null) {
                interfaceC0119z.mo459j();
            }
            if (layoutInflaterFactory2C0024j.f107q != null) {
                layoutInflaterFactory2C0024j.f96f.getDecorView().removeCallbacks(layoutInflaterFactory2C0024j.f108r);
                if (layoutInflaterFactory2C0024j.f107q.isShowing()) {
                    try {
                        layoutInflaterFactory2C0024j.f107q.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0024j.f107q = null;
            }
            layoutInflaterFactory2C0024j.m63I();
            C0054g c0054g = layoutInflaterFactory2C0024j.m68N(0).f138h;
            if (c0054g != null) {
                c0054g.m198c(true);
            }
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
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0473a interfaceC0473a) {
        this.f2866i = interfaceC0473a;
    }
}
