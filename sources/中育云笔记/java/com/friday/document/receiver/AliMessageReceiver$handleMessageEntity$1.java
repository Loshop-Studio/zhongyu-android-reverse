package com.friday.document.receiver;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.receiver.AliMessageReceiver", m26211f = "AliMessageReceiver.kt", m26212l = {124, PatchStatus.CODE_LOAD_LIB_LOST}, m26213m = "handleMessageEntity")
/* loaded from: classes3.dex */
public final class AliMessageReceiver$handleMessageEntity$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6645c;

    /* renamed from: d */
    public Object f6646d;

    /* renamed from: e */
    public Object f6647e;

    /* renamed from: f */
    public Object f6648f;

    /* renamed from: g */
    public Object f6649g;

    /* renamed from: h */
    public Object f6650h;

    /* renamed from: i */
    public /* synthetic */ Object f6651i;

    /* renamed from: j */
    public final /* synthetic */ AliMessageReceiver f6652j;

    /* renamed from: k */
    public int f6653k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AliMessageReceiver$handleMessageEntity$1(AliMessageReceiver aliMessageReceiver, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6652j = aliMessageReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6651i = obj;
        this.f6653k |= Integer.MIN_VALUE;
        return this.f6652j.m5562f(null, this);
    }
}
