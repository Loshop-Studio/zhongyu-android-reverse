package com.xuexiang.xui.widget.textview.label;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p174u3.C6613b;

/* loaded from: classes3.dex */
public class LabelTextView extends AppCompatTextView {

    /* renamed from: b */
    public final C6613b f5053b;

    public LabelTextView(Context context) {
        this(context, null);
    }

    public int getLabelBackgroundColor() {
        return this.f5053b.f11047e;
    }

    public int getLabelDistance() {
        return this.f5053b.m6257c(r0.f11045c);
    }

    public int getLabelHeight() {
        return this.f5053b.m6257c(r0.f11046d);
    }

    public int getLabelOrientation() {
        return this.f5053b.f11056n;
    }

    public String getLabelText() {
        return this.f5053b.f11050h;
    }

    public int getLabelTextColor() {
        return this.f5053b.f11054l;
    }

    public String getLabelTextFont() {
        return this.f5053b.f11053k;
    }

    public int getLabelTextSize() {
        return this.f5053b.m6257c(r0.f11051i);
    }

    public int getLabelTextStyle() {
        return this.f5053b.f11052j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5053b.m6256b(canvas, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setLabelBackgroundColor(int i) {
        C6613b c6613b = this.f5053b;
        if (c6613b.f11047e != i) {
            c6613b.f11047e = i;
            invalidate();
        }
    }

    public void setLabelDistance(int i) {
        this.f5053b.m6258d(this, i);
    }

    public void setLabelEnable(boolean z8) {
        C6613b c6613b = this.f5053b;
        if (c6613b.f11055m != z8) {
            c6613b.f11055m = z8;
            invalidate();
        }
    }

    public void setLabelHeight(int i) {
        this.f5053b.m6259e(this, i);
    }

    public void setLabelOrientation(int i) {
        this.f5053b.m6260f(this, i);
    }

    public void setLabelText(String str) {
        C6613b c6613b = this.f5053b;
        String str2 = c6613b.f11050h;
        if (str2 == null || !str2.equals(str)) {
            c6613b.f11050h = str;
            invalidate();
        }
    }

    public void setLabelTextColor(int i) {
        C6613b c6613b = this.f5053b;
        if (c6613b.f11054l != i) {
            c6613b.f11054l = i;
            invalidate();
        }
    }

    public void setLabelTextFont(String str) {
        this.f5053b.f11053k = str;
        invalidate();
    }

    public void setLabelTextSize(int i) {
        C6613b c6613b = this.f5053b;
        if (c6613b.f11051i != i) {
            c6613b.f11051i = i;
            invalidate();
        }
    }

    public void setLabelTextStyle(int i) {
        C6613b c6613b = this.f5053b;
        if (c6613b.f11052j == i) {
            return;
        }
        c6613b.f11052j = i;
        invalidate();
    }

    public LabelTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LabelTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5053b = new C6613b(context, attributeSet, i);
    }
}
