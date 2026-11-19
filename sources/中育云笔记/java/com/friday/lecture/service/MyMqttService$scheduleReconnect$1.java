package com.friday.lecture.service;

import androidx.compose.runtime.ComposerKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.lecture.service.MyMqttService$scheduleReconnect$1", m26211f = "MyMqttService.kt", m26212l = {ComposerKt.reuseKey}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MyMqttService$scheduleReconnect$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8886c;

    /* renamed from: d */
    public final /* synthetic */ long f8887d;

    /* renamed from: e */
    public final /* synthetic */ MyMqttService f8888e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyMqttService$scheduleReconnect$1(long j10, MyMqttService myMqttService, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8887d = j10;
        this.f8888e = myMqttService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new MyMqttService$scheduleReconnect$1(this.f8887d, this.f8888e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8886c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            long j10 = this.f8887d;
            this.f8886c = 1;
            if (DelayKt.m20376b(j10, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f8888e.m6800w();
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((MyMqttService$scheduleReconnect$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
