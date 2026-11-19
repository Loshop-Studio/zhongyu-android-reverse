package com.friday.lecture.service;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.lecture.service.MyMqttService$mqttCallback$1$messageArrived$1", m26211f = "MyMqttService.kt", m26212l = {313, 319}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MyMqttService$mqttCallback$1$messageArrived$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f8873c;

    /* renamed from: d */
    public Object f8874d;

    /* renamed from: e */
    public Object f8875e;

    /* renamed from: f */
    public Object f8876f;

    /* renamed from: g */
    public int f8877g;

    /* renamed from: h */
    public int f8878h;

    /* renamed from: i */
    public final /* synthetic */ MyMqttService f8879i;

    /* renamed from: j */
    public final /* synthetic */ String f8880j;

    @InterfaceC11829d(m26210c = "com.friday.lecture.service.MyMqttService$mqttCallback$1$messageArrived$1$2", m26211f = "MyMqttService.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.lecture.service.MyMqttService$mqttCallback$1$messageArrived$1$2 */
    public static final class C61572 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f8882c;

        public C61572(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C61572(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f8882c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            AbstractC11958b.m26588i("课堂助手版本过低，请更新课堂助手");
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61572) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyMqttService$mqttCallback$1$messageArrived$1(MyMqttService myMqttService, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8879i = myMqttService;
        this.f8880j = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new MyMqttService$mqttCallback$1$messageArrived$1(this.f8879i, this.f8880j, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        if (sd.AbstractC11109f.m24709g(r13, r3, r12) != r1) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.lecture.service.MyMqttService$mqttCallback$1$messageArrived$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1.smali:139
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((MyMqttService$mqttCallback$1$messageArrived$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
