package com.friday.common.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.friday.common.R$styleable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
@SuppressLint({"Recycle"})
/* loaded from: classes3.dex */
public final class FridayDrawableTextView extends AppCompatTextView {

    /* renamed from: d */
    public Drawable f6180d;

    /* renamed from: e */
    public Drawable f6181e;

    /* renamed from: f */
    public Drawable f6182f;

    /* renamed from: g */
    public Drawable f6183g;

    /* renamed from: h */
    public int f6184h;

    /* renamed from: i */
    public int f6185i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FridayDrawableTextView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9979u.m20294g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FridayDrawableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9979u.m20294g(context, "context");
    }

    public /* synthetic */ FridayDrawableTextView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FridayDrawableTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9979u.m20294g(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FridayDrawableTextView);
        AbstractC9979u.m20293f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == R$styleable.FridayDrawableTextView_drawableTop) {
                this.f6180d = typedArrayObtainStyledAttributes.getDrawable(index);
            } else if (index == R$styleable.FridayDrawableTextView_drawableLeft) {
                this.f6181e = typedArrayObtainStyledAttributes.getDrawable(index);
            } else if (index == R$styleable.FridayDrawableTextView_drawableBottom) {
                this.f6182f = typedArrayObtainStyledAttributes.getDrawable(index);
            } else if (index == R$styleable.FridayDrawableTextView_drawableRight) {
                this.f6183g = typedArrayObtainStyledAttributes.getDrawable(index);
            } else if (index == R$styleable.FridayDrawableTextView_drawableWidth) {
                this.f6184h = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == R$styleable.FridayDrawableTextView_drawableHeight) {
                this.f6185i = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            }
        }
        Drawable drawable = this.f6180d;
        if (drawable != null) {
            drawable.setBounds(0, 0, this.f6184h, this.f6185i);
        }
        Drawable drawable2 = this.f6181e;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, this.f6184h, this.f6185i);
        }
        Drawable drawable3 = this.f6182f;
        if (drawable3 != null) {
            drawable3.setBounds(0, 0, this.f6184h, this.f6185i);
        }
        Drawable drawable4 = this.f6183g;
        if (drawable4 != null) {
            drawable4.setBounds(0, 0, this.f6184h, this.f6185i);
        }
        setCompoundDrawables(this.f6181e, this.f6180d, this.f6183g, this.f6182f);
        setGravity(17);
    }
}
