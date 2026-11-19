package com.friday.document.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ManualSyncViewModel", m26211f = "ManualSyncViewModel.kt", m26212l = {Opcodes.DSTORE}, m26213m = "manualSyncFile")
/* loaded from: classes3.dex */
public final class ManualSyncViewModel$manualSyncFile$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f8051c;

    /* renamed from: d */
    public Object f8052d;

    /* renamed from: e */
    public Object f8053e;

    /* renamed from: f */
    public Object f8054f;

    /* renamed from: g */
    public int f8055g;

    /* renamed from: h */
    public int f8056h;

    /* renamed from: i */
    public /* synthetic */ Object f8057i;

    /* renamed from: j */
    public final /* synthetic */ ManualSyncViewModel f8058j;

    /* renamed from: k */
    public int f8059k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualSyncViewModel$manualSyncFile$1(ManualSyncViewModel manualSyncViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f8058j = manualSyncViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8057i = obj;
        this.f8059k |= Integer.MIN_VALUE;
        return this.f8058j.m6310n(this);
    }
}
