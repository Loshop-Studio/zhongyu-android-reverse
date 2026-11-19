package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p177w3.C7814d;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\t\u0010\u0015R%\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0015R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00118\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0015R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00118\u0006¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0015R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00118\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0015R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00118\u0006¢\u0006\f\n\u0004\b&\u0010\u0014\u001a\u0004\b'\u0010\u0015R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00118\u0006¢\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b*\u0010\u0015¨\u0006,"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/viewmodels/VersionViewModel;", "Lcom/zykj/base/BaseViewModel;", "Lw3/d;", "versionRepository", "Landroidx/datastore/core/DataStore;", "Lcom/zykj/huiwei/launcher/proto/j;", "settings", "<init>", "(Lw3/d;Landroidx/datastore/core/DataStore;)V", "a", "Lw3/d;", "getVersionRepository", "()Lw3/d;", "b", "Landroidx/datastore/core/DataStore;", "getSettings", "()Landroidx/datastore/core/DataStore;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;", "c", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "versionUpdateInfo", "", "kotlin.jvm.PlatformType", "d", "getProgressLiveData", "progressLiveData", "", "e", "getIgnoreLiveData", "ignoreLiveData", "f", "getExitAppLiveData", "exitAppLiveData", "g", "getUpdateNowLiveData", "updateNowLiveData", "h", "getNotUpdateLiveData", "notUpdateLiveData", "i", "getRetryLiveData", "retryLiveData", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class VersionViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final C7814d versionRepository;

    /* renamed from: b, reason: from kotlin metadata */
    public final DataStore settings;

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableLiveData versionUpdateInfo;

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableLiveData progressLiveData;

    /* renamed from: e, reason: from kotlin metadata */
    public final MutableLiveData ignoreLiveData;

    /* renamed from: f, reason: from kotlin metadata */
    public final MutableLiveData exitAppLiveData;

    /* renamed from: g, reason: from kotlin metadata */
    public final MutableLiveData updateNowLiveData;

    /* renamed from: h, reason: from kotlin metadata */
    public final MutableLiveData notUpdateLiveData;

    /* renamed from: i, reason: from kotlin metadata */
    public final MutableLiveData retryLiveData;

    public VersionViewModel(C7814d versionRepository, DataStore settings) {
        Intrinsics.checkNotNullParameter(versionRepository, "versionRepository");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.versionRepository = versionRepository;
        this.settings = settings;
        this.versionUpdateInfo = new MutableLiveData();
        this.progressLiveData = new MutableLiveData(0);
        this.ignoreLiveData = new MutableLiveData();
        this.exitAppLiveData = new MutableLiveData();
        this.updateNowLiveData = new MutableLiveData();
        this.notUpdateLiveData = new MutableLiveData();
        this.retryLiveData = new MutableLiveData();
    }

    /* renamed from: a, reason: from getter */
    public final MutableLiveData getVersionUpdateInfo() {
        return this.versionUpdateInfo;
    }
}
