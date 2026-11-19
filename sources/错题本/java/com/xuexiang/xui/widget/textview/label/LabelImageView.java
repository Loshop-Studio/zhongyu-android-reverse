package com.xuexiang.xui.widget.textview.label;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import p174u3.C6613b;

/* loaded from: classes3.dex */
public class LabelImageView extends AppCompatImageView {

    /* renamed from: a */
    public final C6613b f5052a;

    public LabelImageView(Context context) {
        this(context, null);
    }

    public int getLabelBackgroundColor() {
        return this.f5052a.f11047e;
    }

    public int getLabelDistance() {
        return this.f5052a.m6257c(r0.f11045c);
    }

    public int getLabelHeight() {
        return this.f5052a.m6257c(r0.f11046d);
    }

    public int getLabelOrientation() {
        return this.f5052a.f11056n;
    }

    public String getLabelText() {
        return this.f5052a.f11050h;
    }

    public int getLabelTextColor() {
        return this.f5052a.f11054l;
    }

    public String getLabelTextFont() {
        return this.f5052a.f11053k;
    }

    public int getLabelTextSize() {
        return this.f5052a.m6257c(r0.f11051i);
    }

    public int getLabelTextStyle() {
        return this.f5052a.f11052j;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5052a.m6256b(canvas, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setLabelBackgroundAlpha(int i) {
        C6613b c6613b = this.f5052a;
        if (c6613b.f11044b != i) {
            c6613b.f11044b = i;
            invalidate();
        }
    }

    public void setLabelBackgroundColor(int i) {
        C6613b c6613b = this.f5052a;
        if (c6613b.f11047e != i) {
            c6613b.f11047e = i;
            invalidate();
        }
    }

    public void setLabelDistance(int i) {
        this.f5052a.m6258d(this, i);
    }

    public void setLabelHeight(int i) {
        this.f5052a.m6259e(this, i);
    }

    public void setLabelOrientation(int i) {
        this.f5052a.m6260f(this, i);
    }

    public void setLabelText(String str) {
        C6613b c6613b = this.f5052a;
        String str2 = c6613b.f11050h;
        if (str2 == null || !str2.equals(str)) {
            c6613b.f11050h = str;
            invalidate();
        }
    }

    public void setLabelTextColor(int i) {
        C6613b c6613b = this.f5052a;
        if (c6613b.f11054l != i) {
            c6613b.f11054l = i;
            invalidate();
        }
    }

    public void setLabelTextFont(String str) {
        this.f5052a.f11053k = str;
        invalidate();
    }

    public void setLabelTextSize(int i) {
        C6613b c6613b = this.f5052a;
        if (c6613b.f11051i != i) {
            c6613b.f11051i = i;
            invalidate();
        }
    }

    public void setLabelTextStyle(int i) {
        C6613b c6613b = this.f5052a;
        if (c6613b.f11052j == i) {
            return;
        }
        c6613b.f11052j = i;
        invalidate();
    }

    public void setLabelVisual(boolean z8) {
        C6613b c6613b = this.f5052a;
        if (c6613b.f11055m != z8) {
            c6613b.f11055m = z8;
            invalidate();
        }
    }

    public LabelImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LabelImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5052a = new C6613b(context, attributeSet, i);
    }
}
