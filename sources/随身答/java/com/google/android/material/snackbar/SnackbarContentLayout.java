package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.C5733R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {
    private Button actionView;
    private final TimeInterpolator contentInterpolator;
    private int maxInlineActionWidth;
    private TextView messageView;

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }

    private static void updateTopBottomPadding(@NonNull View view, int i9, int i10) {
        if (ViewCompat.isPaddingRelative(view)) {
            ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), i9, ViewCompat.getPaddingEnd(view), i10);
        } else {
            view.setPadding(view.getPaddingLeft(), i9, view.getPaddingRight(), i10);
        }
    }

    private boolean updateViewsWithinLayout(int i9, int i10, int i11) {
        boolean z9;
        if (i9 != getOrientation()) {
            setOrientation(i9);
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.messageView.getPaddingTop() == i10 && this.messageView.getPaddingBottom() == i11) {
            return z9;
        }
        updateTopBottomPadding(this.messageView, i10, i11);
        return true;
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i9, int i10) {
        this.messageView.setAlpha(0.0f);
        long j9 = i10;
        long j10 = i9;
        this.messageView.animate().alpha(1.0f).setDuration(j9).setInterpolator(this.contentInterpolator).setStartDelay(j10).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(0.0f);
            this.actionView.animate().alpha(1.0f).setDuration(j9).setInterpolator(this.contentInterpolator).setStartDelay(j10).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i9, int i10) {
        this.messageView.setAlpha(1.0f);
        long j9 = i10;
        long j10 = i9;
        this.messageView.animate().alpha(0.0f).setDuration(j9).setInterpolator(this.contentInterpolator).setStartDelay(j10).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(1.0f);
            this.actionView.animate().alpha(0.0f).setDuration(j9).setInterpolator(this.contentInterpolator).setStartDelay(j10).start();
        }
    }

    public Button getActionView() {
        return this.actionView;
    }

    public TextView getMessageView() {
        return this.messageView;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.messageView = (TextView) findViewById(C5733R.id.snackbar_text);
        this.actionView = (Button) findViewById(C5733R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) throws Resources.NotFoundException {
        super.onMeasure(i9, i10);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C5733R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C5733R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.messageView.getLayout();
        boolean z9 = layout != null && layout.getLineCount() > 1;
        if (!z9 || this.maxInlineActionWidth <= 0 || this.actionView.getMeasuredWidth() <= this.maxInlineActionWidth) {
            if (!z9) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!updateViewsWithinLayout(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!updateViewsWithinLayout(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i9, i10);
    }

    public void setMaxInlineActionWidth(int i9) {
        this.maxInlineActionWidth = i9;
    }

    public void updateActionTextColorAlphaIfNeeded(float f10) {
        if (f10 != 1.0f) {
            this.actionView.setTextColor(MaterialColors.layer(MaterialColors.getColor(this, C5733R.attr.colorSurface), this.actionView.getCurrentTextColor(), f10));
        }
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.contentInterpolator = MotionUtils.resolveThemeInterpolator(context, C5733R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }
}
