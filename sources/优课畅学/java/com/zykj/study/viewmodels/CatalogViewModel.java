package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import javax.inject.Inject;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CatalogViewModel extends BaseViewModel {

    /* renamed from: a */
    public final MutableLiveData f13905a = new MutableLiveData(0);

    /* renamed from: b */
    public final MutableLiveData f13906b = new MutableLiveData(0);

    /* renamed from: c */
    public final MutableLiveData f13907c = new MutableLiveData(0);

    @Inject
    public CatalogViewModel() {
    }

    /* renamed from: a */
    public final MutableLiveData m12029a() {
        return this.f13906b;
    }

    /* renamed from: b */
    public final MutableLiveData m12030b() {
        return this.f13905a;
    }

    /* renamed from: c */
    public final MutableLiveData m12031c() {
        return this.f13907c;
    }
}
