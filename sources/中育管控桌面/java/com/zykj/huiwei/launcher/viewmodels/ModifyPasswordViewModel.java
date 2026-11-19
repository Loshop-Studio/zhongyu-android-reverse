package com.zykj.huiwei.launcher.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import com.zykj.huiwei.launcher.bean.req.UpdatePwdReq;
import com.zykj.huiwei.launcher.ext.ViewModelExtKt;
import com.zykj.huiwei.launcher.repository.UserRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR%\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R%\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R%\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u001b0\u001b0\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R%\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u001b0\u001b0\u000f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\f\u0010\u0015R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\t\u0010\u0015R%\u0010!\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u001b0\u001b0\u000f8\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b\u001d\u0010\u0015¨\u0006\""}, m7880d2 = {"Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;", "Lcom/zykj/base/BaseViewModel;", "Lcom/zykj/huiwei/launcher/repository/UserRepository;", "userRepository", "<init>", "(Lcom/zykj/huiwei/launcher/repository/UserRepository;)V", "", "h", "()V", "a", "Lcom/zykj/huiwei/launcher/repository/UserRepository;", "Lkotlin/text/Regex;", "b", "Lkotlin/text/Regex;", "passwordRegex", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "c", "Landroidx/lifecycle/MutableLiveData;", "f", "()Landroidx/lifecycle/MutableLiveData;", "oldPasswordLiveData", "d", "e", "newPasswordLiveData", "doubleNewPasswordLiveData", "", "newPassTips", "g", "doubleNewPassTips", "changeSuccess", "i", "isBtnEnable", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class ModifyPasswordViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final UserRepository userRepository;

    /* renamed from: b, reason: from kotlin metadata */
    public final Regex passwordRegex;

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableLiveData oldPasswordLiveData;

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableLiveData newPasswordLiveData;

    /* renamed from: e, reason: from kotlin metadata */
    public final MutableLiveData doubleNewPasswordLiveData;

    /* renamed from: f, reason: from kotlin metadata */
    public final MutableLiveData newPassTips;

    /* renamed from: g, reason: from kotlin metadata */
    public final MutableLiveData doubleNewPassTips;

    /* renamed from: h, reason: from kotlin metadata */
    public final MutableLiveData changeSuccess;

    /* renamed from: i, reason: from kotlin metadata */
    public final MutableLiveData isBtnEnable;

    public ModifyPasswordViewModel(UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.userRepository = userRepository;
        this.passwordRegex = new Regex("^(?=.*\\d)(?=.*[a-zA-Z]).{8,16}$");
        this.oldPasswordLiveData = new MutableLiveData("");
        this.newPasswordLiveData = new MutableLiveData("");
        this.doubleNewPasswordLiveData = new MutableLiveData("");
        Boolean bool = Boolean.FALSE;
        this.newPassTips = new MutableLiveData(bool);
        this.doubleNewPassTips = new MutableLiveData(bool);
        this.changeSuccess = new MutableLiveData();
        this.isBtnEnable = new MutableLiveData(bool);
    }

    /* renamed from: a, reason: from getter */
    public final MutableLiveData getChangeSuccess() {
        return this.changeSuccess;
    }

    /* renamed from: b, reason: from getter */
    public final MutableLiveData getDoubleNewPassTips() {
        return this.doubleNewPassTips;
    }

    /* renamed from: c, reason: from getter */
    public final MutableLiveData getDoubleNewPasswordLiveData() {
        return this.doubleNewPasswordLiveData;
    }

    /* renamed from: d, reason: from getter */
    public final MutableLiveData getNewPassTips() {
        return this.newPassTips;
    }

    /* renamed from: e, reason: from getter */
    public final MutableLiveData getNewPasswordLiveData() {
        return this.newPasswordLiveData;
    }

    /* renamed from: f, reason: from getter */
    public final MutableLiveData getOldPasswordLiveData() {
        return this.oldPasswordLiveData;
    }

    /* renamed from: g, reason: from getter */
    public final MutableLiveData getIsBtnEnable() {
        return this.isBtnEnable;
    }

    /* renamed from: h */
    public final void m6171h() {
        String strValueOf = String.valueOf(this.oldPasswordLiveData.getValue());
        String strValueOf2 = String.valueOf(this.newPasswordLiveData.getValue());
        String strValueOf3 = String.valueOf(this.doubleNewPasswordLiveData.getValue());
        if (!this.passwordRegex.matches(strValueOf2)) {
            this.newPassTips.setValue(Boolean.TRUE);
            return;
        }
        MutableLiveData mutableLiveData = this.newPassTips;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        if (StringsKt.isBlank(strValueOf3) || !Intrinsics.areEqual(strValueOf3, strValueOf2)) {
            this.doubleNewPassTips.setValue(Boolean.TRUE);
        } else {
            this.doubleNewPassTips.setValue(bool);
            ViewModelExtKt.m5324g(this, this.userRepository.m5435d(new UpdatePwdReq(strValueOf, strValueOf2)), null, null, null, new ModifyPasswordViewModel$updatePwd$1(this, null), 14, null);
        }
    }
}
