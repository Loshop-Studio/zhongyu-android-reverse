package p000a.p019d.p020a;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;

/* renamed from: a.d.a.a */
/* loaded from: classes.dex */
public class C0126a extends FrameLayout {

    /* renamed from: d */
    public static final InterfaceC0128c f898d = new C0127b();

    /* renamed from: b */
    public boolean f899b;

    /* renamed from: c */
    public boolean f900c;

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public float getCardElevation() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getMaxCardElevation() {
        throw null;
    }

    public boolean getPreventCornerOverlap() {
        return this.f900c;
    }

    public float getRadius() {
        throw null;
    }

    public boolean getUseCompatPadding() {
        return this.f899b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCardElevation(float f2) {
        throw null;
    }

    public void setMaxCardElevation(float f2) {
        throw null;
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z == this.f900c) {
            return;
        }
        this.f900c = z;
        throw null;
    }

    public void setRadius(float f2) {
        throw null;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f899b == z) {
            return;
        }
        this.f899b = z;
        throw null;
    }
}
