package p070b.p074b.p075a.p076a.p086i;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p019d.p020a.C0126a;
import p070b.p074b.p075a.p076a.p101w.C0678j;
import p070b.p074b.p075a.p076a.p101w.InterfaceC0682n;

/* renamed from: b.b.a.a.i.a */
/* loaded from: classes.dex */
public class C0598a extends C0126a implements Checkable, InterfaceC0682n {

    /* renamed from: g */
    public static final int[] f3622g = {R.attr.state_checkable};

    /* renamed from: h */
    public static final int[] f3623h = {R.attr.state_checked};

    /* renamed from: i */
    public static final int[] f3624i = {C1088R.attr.state_dragged};

    /* renamed from: e */
    public boolean f3625e;

    /* renamed from: f */
    public a f3626f;

    /* renamed from: b.b.a.a.i.a$a */
    public interface a {
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    @Override // p000a.p019d.p020a.C0126a
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // p000a.p019d.p020a.C0126a
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // p000a.p019d.p020a.C0126a
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // p000a.p019d.p020a.C0126a
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // p000a.p019d.p020a.C0126a
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override // p000a.p019d.p020a.C0126a
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public C0678j getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f3623h);
        }
        if (this.f3625e) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f3624i);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // p000a.p019d.p020a.C0126a, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000a.p019d.p020a.C0126a
    public void setCardBackgroundColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    @Override // p000a.p019d.p020a.C0126a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    @Override // p000a.p019d.p020a.C0126a
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconResource(int i) {
        C0034a.m129a(getContext(), i);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
    }

    public void setDragged(boolean z) {
        if (this.f3625e != z) {
            this.f3625e = z;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26) {
                throw null;
            }
            invalidate();
        }
    }

    @Override // p000a.p019d.p020a.C0126a
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        throw null;
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.f3626f = aVar;
    }

    @Override // p000a.p019d.p020a.C0126a
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        throw null;
    }

    public void setProgress(float f2) {
        throw null;
    }

    @Override // p000a.p019d.p020a.C0126a
    public void setRadius(float f2) {
        super.setRadius(f2);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i) {
        Context context = getContext();
        ThreadLocal<TypedValue> threadLocal = C0034a.f211a;
        context.getColorStateList(i);
        throw null;
    }

    @Override // p070b.p074b.p075a.p076a.p101w.InterfaceC0682n
    public void setShapeAppearanceModel(C0678j c0678j) {
        setClipToOutline(c0678j.m2307d(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(int i) {
        throw null;
    }

    @Override // p000a.p019d.p020a.C0126a
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
    }
}
