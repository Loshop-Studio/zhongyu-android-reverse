package com.xuexiang.xui.widget.alpha;

import android.view.View;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ThemeUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class XUIAlphaViewHelper implements IAlphaViewHelper {
    private boolean mChangeAlphaWhenDisable;
    private boolean mChangeAlphaWhenPress;
    private float mDisabledAlpha;
    private float mNormalAlpha = 1.0f;
    private float mPressedAlpha;
    private WeakReference<View> mTarget;

    public XUIAlphaViewHelper(View view) {
        this.mTarget = new WeakReference<>(view);
        this.mChangeAlphaWhenPress = ThemeUtils.resolveBoolean(view.getContext(), C2042R.attr.xui_switch_alpha_pressed, true);
        this.mChangeAlphaWhenDisable = ThemeUtils.resolveBoolean(view.getContext(), C2042R.attr.xui_switch_alpha_disabled, true);
        this.mPressedAlpha = ThemeUtils.resolveFloat(view.getContext(), C2042R.attr.xui_alpha_pressed, 0.5f);
        this.mDisabledAlpha = ThemeUtils.resolveFloat(view.getContext(), C2042R.attr.xui_alpha_disabled, 0.5f);
    }

    @Override // com.xuexiang.xui.widget.alpha.IAlphaViewHelper
    public void onEnabledChanged(View view, boolean z3) {
        View view2 = this.mTarget.get();
        if (view2 == null) {
            return;
        }
        float f4 = (!this.mChangeAlphaWhenDisable || z3) ? this.mNormalAlpha : this.mDisabledAlpha;
        if (view != view2 && view2.isEnabled() != z3) {
            view2.setEnabled(z3);
        }
        view2.setAlpha(f4);
    }

    @Override // com.xuexiang.xui.widget.alpha.IAlphaViewHelper
    public void onPressedChanged(View view, boolean z3) {
        View view2 = this.mTarget.get();
        if (view2 == null) {
            return;
        }
        if (view.isEnabled()) {
            view2.setAlpha((this.mChangeAlphaWhenPress && z3 && view.isClickable()) ? this.mPressedAlpha : this.mNormalAlpha);
        } else if (this.mChangeAlphaWhenDisable) {
            view2.setAlpha(this.mDisabledAlpha);
        }
    }

    @Override // com.xuexiang.xui.widget.alpha.IAlphaViewHelper
    public void setChangeAlphaWhenDisable(boolean z3) {
        this.mChangeAlphaWhenDisable = z3;
        View view = this.mTarget.get();
        if (view != null) {
            onEnabledChanged(view, view.isEnabled());
        }
    }

    @Override // com.xuexiang.xui.widget.alpha.IAlphaViewHelper
    public void setChangeAlphaWhenPress(boolean z3) {
        this.mChangeAlphaWhenPress = z3;
    }

    public XUIAlphaViewHelper(View view, float f4, float f5) {
        this.mTarget = new WeakReference<>(view);
        this.mPressedAlpha = f4;
        this.mDisabledAlpha = f5;
    }
}
