package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p108k.C2702a;
import p108k.C2703b;
import p108k.C2704c;
import p108k.C2705d;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final InterfaceC0244c IMPL;
    private final InterfaceC0243b mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    /* renamed from: androidx.cardview.widget.CardView$a */
    class C0241a implements InterfaceC0243b {

        /* renamed from: a */
        private Drawable f1266a;

        C0241a() {
        }

        @Override // androidx.cardview.widget.InterfaceC0243b
        /* renamed from: a */
        public View mo1054a() {
            return CardView.this;
        }

        @Override // androidx.cardview.widget.InterfaceC0243b
        /* renamed from: b */
        public void mo1055b(Drawable drawable) {
            this.f1266a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.InterfaceC0243b
        /* renamed from: c */
        public boolean mo1056c() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.InterfaceC0243b
        /* renamed from: d */
        public boolean mo1057d() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.InterfaceC0243b
        /* renamed from: e */
        public Drawable mo1058e() {
            return this.f1266a;
        }

        @Override // androidx.cardview.widget.InterfaceC0243b
        public void setShadowPadding(int i4, int i5, int i6, int i7) {
            CardView.this.mShadowBounds.set(i4, i5, i6, i7);
            CardView cardView = CardView.this;
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i4 + rect.left, i5 + rect.top, i6 + rect.right, i7 + rect.bottom);
        }
    }

    static {
        C0242a c0242a = new C0242a();
        IMPL = c0242a;
        c0242a.mo1066g();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return IMPL.mo1061b(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.mo1064e(this.mCardViewDelegate);
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.mo1060a(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.mo1067h(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (IMPL instanceof C0242a) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo1069j(this.mCardViewDelegate)), View.MeasureSpec.getSize(i4)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo1068i(this.mCardViewDelegate)), View.MeasureSpec.getSize(i5)), mode2);
        }
        super.onMeasure(i4, i5);
    }

    public void setCardBackgroundColor(int i4) {
        IMPL.mo1073n(this.mCardViewDelegate, ColorStateList.valueOf(i4));
    }

    public void setCardElevation(float f4) {
        IMPL.mo1071l(this.mCardViewDelegate, f4);
    }

    public void setContentPadding(int i4, int i5, int i6, int i7) {
        this.mContentPadding.set(i4, i5, i6, i7);
        IMPL.mo1065f(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f4) {
        IMPL.mo1074o(this.mCardViewDelegate, f4);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i4) {
        this.mUserSetMinHeight = i4;
        super.setMinimumHeight(i4);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i4) {
        this.mUserSetMinWidth = i4;
        super.setMinimumWidth(i4);
    }

    @Override // android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i4, int i5, int i6, int i7) {
    }

    public void setPreventCornerOverlap(boolean z3) {
        if (z3 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z3;
            IMPL.mo1072m(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f4) {
        IMPL.mo1063d(this.mCardViewDelegate, f4);
    }

    public void setUseCompatPadding(boolean z3) {
        if (this.mCompatPadding != z3) {
            this.mCompatPadding = z3;
            IMPL.mo1070k(this.mCardViewDelegate);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2702a.f10673a);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        IMPL.mo1073n(this.mCardViewDelegate, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i4) throws Resources.NotFoundException {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i4);
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        C0241a c0241a = new C0241a();
        this.mCardViewDelegate = c0241a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2705d.f10677a, i4, C2704c.f10676a);
        int i5 = C2705d.f10680d;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i5);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(C2703b.f10675b);
            } else {
                color = getResources().getColor(C2703b.f10674a);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(C2705d.f10681e, IGoodView.DEFAULT_TO_ALPHA);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C2705d.f10682f, IGoodView.DEFAULT_TO_ALPHA);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(C2705d.f10683g, IGoodView.DEFAULT_TO_ALPHA);
        this.mCompatPadding = typedArrayObtainStyledAttributes.getBoolean(C2705d.f10685i, false);
        this.mPreventCornerOverlap = typedArrayObtainStyledAttributes.getBoolean(C2705d.f10684h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2705d.f10686j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2705d.f10688l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2705d.f10690n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2705d.f10689m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2705d.f10687k, dimensionPixelSize);
        float f4 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2705d.f10678b, 0);
        this.mUserSetMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2705d.f10679c, 0);
        typedArrayObtainStyledAttributes.recycle();
        IMPL.mo1062c(c0241a, context, colorStateList, dimension, dimension2, f4);
    }
}
