package com.friday.document.sync;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.sync.SyncStateOne", m26211f = "SyncStateOne.kt", m26212l = {PatchStatus.CODE_LOAD_JIT_CLEAR, 80, PatchStatus.CODE_LOAD_FIND_CLASS}, m26213m = "doesFileExits")
/* loaded from: classes3.dex */
public final class SyncStateOne$doesFileExits$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6930c;

    /* renamed from: d */
    public Object f6931d;

    /* renamed from: e */
    public /* synthetic */ Object f6932e;

    /* renamed from: f */
    public final /* synthetic */ SyncStateOne f6933f;

    /* renamed from: g */
    public int f6934g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncStateOne$doesFileExits$1(SyncStateOne syncStateOne, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6933f = syncStateOne;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6932e = obj;
        this.f6934g |= Integer.MIN_VALUE;
        return this.f6933f.m5643n(null, this);
    }
}
