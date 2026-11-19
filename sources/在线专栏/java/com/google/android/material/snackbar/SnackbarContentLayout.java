package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C0358u;
import com.google.android.material.C1371R;
import com.google.android.material.color.MaterialColors;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {
    private Button actionView;
    private int maxInlineActionWidth;
    private int maxWidth;
    private TextView messageView;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    private static void updateTopBottomPadding(View view, int i4, int i5) {
        if (C0358u.m2015X(view)) {
            C0358u.m1987E0(view, C0358u.m1990G(view), i4, C0358u.m1988F(view), i5);
        } else {
            view.setPadding(view.getPaddingLeft(), i4, view.getPaddingRight(), i5);
        }
    }

    private boolean updateViewsWithinLayout(int i4, int i5, int i6) {
        boolean z3;
        if (i4 != getOrientation()) {
            setOrientation(i4);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.messageView.getPaddingTop() == i5 && this.messageView.getPaddingBottom() == i6) {
            return z3;
        }
        updateTopBottomPadding(this.messageView, i5, i6);
        return true;
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i4, int i5) {
        this.messageView.setAlpha(IGoodView.DEFAULT_TO_ALPHA);
        long j4 = i5;
        long j5 = i4;
        this.messageView.animate().alpha(1.0f).setDuration(j4).setStartDelay(j5).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(IGoodView.DEFAULT_TO_ALPHA);
            this.actionView.animate().alpha(1.0f).setDuration(j4).setStartDelay(j5).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i4, int i5) {
        this.messageView.setAlpha(1.0f);
        long j4 = i5;
        long j5 = i4;
        this.messageView.animate().alpha(IGoodView.DEFAULT_TO_ALPHA).setDuration(j4).setStartDelay(j5).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(1.0f);
            this.actionView.animate().alpha(IGoodView.DEFAULT_TO_ALPHA).setDuration(j4).setStartDelay(j5).start();
        }
    }

    public Button getActionView() {
        return this.actionView;
    }

    public TextView getMessageView() {
        return this.messageView;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.messageView = (TextView) findViewById(C1371R.id.snackbar_text);
        this.actionView = (Button) findViewById(C1371R.id.snackbar_action);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.maxWidth
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.maxWidth
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.google.android.material.C1371R.dimen.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = com.google.android.material.C1371R.dimen.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.messageView
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.maxInlineActionWidth
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.actionView
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.maxInlineActionWidth
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.updateViewsWithinLayout(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.updateViewsWithinLayout(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = 1
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i4) {
        this.maxInlineActionWidth = i4;
    }

    void updateActionTextColorAlphaIfNeeded(float f4) {
        if (f4 != 1.0f) {
            this.actionView.setTextColor(MaterialColors.layer(MaterialColors.getColor(this, C1371R.attr.colorSurface), this.actionView.getCurrentTextColor(), f4));
        }
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1371R.styleable.SnackbarLayout);
        this.maxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1371R.styleable.SnackbarLayout_android_maxWidth, -1);
        this.maxInlineActionWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1371R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
