package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.base.BaseViewModel;
import com.zykj.study.bean.ScanResult;
import com.zykj.study.repository.QuickCodeRepository;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MicroCodeViewModel extends BaseViewModel {

    /* renamed from: a */
    public final QuickCodeRepository f14224a;

    public MicroCodeViewModel(QuickCodeRepository quickCodeRepository) {
        AbstractC9133u.m16133g(quickCodeRepository, "quickCodeRepository");
        this.f14224a = quickCodeRepository;
    }

    /* renamed from: a */
    public final QuickCodeRepository m12196a() {
        return this.f14224a;
    }

    /* renamed from: b */
    public final Object m12197b(String str, String str2, InterfaceC9324c interfaceC9324c) {
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new MicroCodeViewModel$uploadAttachment$2(this, str2, str, null), interfaceC9324c);
    }

    /* renamed from: c */
    public final Object m12198c(ScanResult scanResult, InterfaceC9324c interfaceC9324c) {
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new MicroCodeViewModel$useCode$2(this, scanResult, null), interfaceC9324c);
    }
}
