package com.zykj.huiwei.launcher.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import javax.inject.Inject;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\t¨\u0006\u0011"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;", "Lcom/zykj/base/BaseViewModel;", "<init>", "()V", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Landroidx/lifecycle/MutableLiveData;", "c", "()Landroidx/lifecycle/MutableLiveData;", "content", "b", "cancel", "confirm", "", "d", "isShowCancel", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class TipsViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final MutableLiveData content = new MutableLiveData();

    /* renamed from: b, reason: from kotlin metadata */
    public final MutableLiveData cancel = new MutableLiveData();

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableLiveData confirm = new MutableLiveData();

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableLiveData isShowCancel = new MutableLiveData();

    @Inject
    public TipsViewModel() {
    }

    /* renamed from: a, reason: from getter */
    public final MutableLiveData getCancel() {
        return this.cancel;
    }

    /* renamed from: b, reason: from getter */
    public final MutableLiveData getConfirm() {
        return this.confirm;
    }

    /* renamed from: c, reason: from getter */
    public final MutableLiveData getContent() {
        return this.content;
    }

    /* renamed from: d, reason: from getter */
    public final MutableLiveData getIsShowCancel() {
        return this.isShowCancel;
    }
}
