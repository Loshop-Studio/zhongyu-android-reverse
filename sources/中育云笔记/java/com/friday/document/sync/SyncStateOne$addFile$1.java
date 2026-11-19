package com.friday.document.sync;

import androidx.compose.runtime.ComposerKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.sync.SyncStateOne", m26211f = "SyncStateOne.kt", m26212l = {ComposerKt.providerValuesKey, ComposerKt.providerMapsKey, 209, 234, 238, 251, 254, 259, 268, 272}, m26213m = "addFile")
/* loaded from: classes3.dex */
public final class SyncStateOne$addFile$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6915c;

    /* renamed from: d */
    public Object f6916d;

    /* renamed from: e */
    public Object f6917e;

    /* renamed from: f */
    public Object f6918f;

    /* renamed from: g */
    public int f6919g;

    /* renamed from: h */
    public int f6920h;

    /* renamed from: i */
    public /* synthetic */ Object f6921i;

    /* renamed from: j */
    public final /* synthetic */ SyncStateOne f6922j;

    /* renamed from: k */
    public int f6923k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncStateOne$addFile$1(SyncStateOne syncStateOne, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6922j = syncStateOne;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6921i = obj;
        this.f6923k |= Integer.MIN_VALUE;
        return this.f6922j.m5641l(null, this);
    }
}
