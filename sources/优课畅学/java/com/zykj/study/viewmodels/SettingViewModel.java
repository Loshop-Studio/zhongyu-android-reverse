package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ObservableField;
import com.zykj.base.BaseViewModel;
import javax.inject.Inject;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class SettingViewModel extends BaseViewModel {

    /* renamed from: a */
    public final ObservableField f14371a;

    /* renamed from: b */
    public final ObservableField f14372b;

    @Inject
    public SettingViewModel() {
        ObservableField observableField = new ObservableField();
        observableField.set("V1.1.3");
        this.f14371a = observableField;
        this.f14372b = new ObservableField("");
    }

    /* renamed from: a */
    public final ObservableField m12254a() {
        return this.f14372b;
    }

    /* renamed from: b */
    public final ObservableField m12255b() {
        return this.f14371a;
    }
}
