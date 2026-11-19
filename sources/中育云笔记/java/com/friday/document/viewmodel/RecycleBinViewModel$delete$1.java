package com.friday.document.viewmodel;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.RecycleBinViewModel", m26211f = "RecycleBinViewModel.kt", m26212l = {140, 143}, m26213m = RequestParameters.SUBRESOURCE_DELETE)
/* loaded from: classes3.dex */
public final class RecycleBinViewModel$delete$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f8143c;

    /* renamed from: d */
    public Object f8144d;

    /* renamed from: e */
    public Object f8145e;

    /* renamed from: f */
    public Object f8146f;

    /* renamed from: g */
    public Object f8147g;

    /* renamed from: h */
    public Object f8148h;

    /* renamed from: i */
    public Object f8149i;

    /* renamed from: j */
    public int f8150j;

    /* renamed from: k */
    public int f8151k;

    /* renamed from: l */
    public /* synthetic */ Object f8152l;

    /* renamed from: m */
    public final /* synthetic */ RecycleBinViewModel f8153m;

    /* renamed from: n */
    public int f8154n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecycleBinViewModel$delete$1(RecycleBinViewModel recycleBinViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f8153m = recycleBinViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8152l = obj;
        this.f8154n |= Integer.MIN_VALUE;
        return this.f8153m.m6334J0(null, null, this);
    }
}
