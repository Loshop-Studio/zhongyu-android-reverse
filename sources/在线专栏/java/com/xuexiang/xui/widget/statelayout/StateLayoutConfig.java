package com.xuexiang.xui.widget.statelayout;

import android.view.animation.Animation;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;

/* loaded from: classes.dex */
public class StateLayoutConfig {
    private static final boolean DEFAULT_ANIM_ENABLED = true;
    private static final int DEFAULT_IN_ANIM = 17432576;
    private static final int DEFAULT_OUT_ANIM = 17432577;
    public boolean animationEnabled = DEFAULT_ANIM_ENABLED;
    public Animation inAnimation = ResUtils.getAnim(17432576);
    public Animation outAnimation = ResUtils.getAnim(17432577);
    public int emptyImageRes = C2042R.drawable.stf_ic_empty;
    public int emptyMessageRes = C2042R.string.stfEmptyMessage;
    public int errorImageRes = C2042R.drawable.stf_ic_error;
    public int errorMessageRes = C2042R.string.stfErrorMessage;
    public int offlineImageRes = C2042R.drawable.stf_ic_offline;
    public int offlineMessageRes = C2042R.string.stfOfflineMessage;
    public int locationOffImageRes = C2042R.drawable.stf_ic_location_off;
    public int locationOffMessageRes = C2042R.string.stfLocationOffMessage;
    public int retryMessageRes = C2042R.string.stfRetryButtonText;
    public int loadingMessageRes = C2042R.string.stfLoadingMessage;

    public int getEmptyImageRes() {
        return this.emptyImageRes;
    }

    public int getEmptyMessageRes() {
        return this.emptyMessageRes;
    }

    public int getErrorImageRes() {
        return this.errorImageRes;
    }

    public int getErrorMessageRes() {
        return this.errorMessageRes;
    }

    public Animation getInAnimation() {
        return this.inAnimation;
    }

    public int getLoadingMessageRes() {
        return this.loadingMessageRes;
    }

    public int getLocationOffImageRes() {
        return this.locationOffImageRes;
    }

    public int getLocationOffMessageRes() {
        return this.locationOffMessageRes;
    }

    public int getOfflineImageRes() {
        return this.offlineImageRes;
    }

    public int getOfflineMessageRes() {
        return this.offlineMessageRes;
    }

    public Animation getOutAnimation() {
        return this.outAnimation;
    }

    public int getRetryMessageRes() {
        return this.retryMessageRes;
    }

    public boolean isAnimationEnabled() {
        return this.animationEnabled;
    }

    public StateLayoutConfig setAnimationEnabled(boolean z3) {
        this.animationEnabled = z3;
        return this;
    }

    public StateLayoutConfig setEmptyImageRes(int i4) {
        this.emptyImageRes = i4;
        return this;
    }

    public StateLayoutConfig setEmptyMessageRes(int i4) {
        this.emptyMessageRes = i4;
        return this;
    }

    public StateLayoutConfig setErrorImageRes(int i4) {
        this.errorImageRes = i4;
        return this;
    }

    public StateLayoutConfig setErrorMessageRes(int i4) {
        this.errorMessageRes = i4;
        return this;
    }

    public StateLayoutConfig setInAnimation(Animation animation) {
        this.inAnimation = animation;
        return this;
    }

    public StateLayoutConfig setLoadingMessageRes(int i4) {
        this.loadingMessageRes = i4;
        return this;
    }

    public StateLayoutConfig setLocationOffImageRes(int i4) {
        this.locationOffImageRes = i4;
        return this;
    }

    public StateLayoutConfig setLocationOffMessageRes(int i4) {
        this.locationOffMessageRes = i4;
        return this;
    }

    public StateLayoutConfig setOfflineImageRes(int i4) {
        this.offlineImageRes = i4;
        return this;
    }

    public StateLayoutConfig setOfflineMessageRes(int i4) {
        this.offlineMessageRes = i4;
        return this;
    }

    public StateLayoutConfig setOutAnimation(Animation animation) {
        this.outAnimation = animation;
        return this;
    }

    public StateLayoutConfig setRetryMessageRes(int i4) {
        this.retryMessageRes = i4;
        return this;
    }
}
