package com.zykj.huiwei.launcher.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import javax.inject.Inject;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/viewmodels/UnAuthorViewModel;", "Lcom/zykj/base/BaseViewModel;", "<init>", "()V", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "callback", "b", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class UnAuthorViewModel extends BaseViewModel {

    /* renamed from: c */
    public static final int f7315c = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public final MutableLiveData callback = new MutableLiveData();

    @Inject
    public UnAuthorViewModel() {
    }

    /* renamed from: a, reason: from getter */
    public final MutableLiveData getCallback() {
        return this.callback;
    }
}
