package com.friday.lecture.service;

import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.friday.common.entity.IfStudentOnline;
import com.friday.common.helper.C5962b;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.lecture.service.MyMqttService$mqttCallback$1$messageArrived$4", m26211f = "MyMqttService.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MyMqttService$mqttCallback$1$messageArrived$4 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8883c;

    /* renamed from: d */
    public final /* synthetic */ MyMqttService f8884d;

    /* renamed from: e */
    public final /* synthetic */ String f8885e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyMqttService$mqttCallback$1$messageArrived$4(MyMqttService myMqttService, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8884d = myMqttService;
        this.f8885e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new MyMqttService$mqttCallback$1$messageArrived$4(this.f8884d, this.f8885e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f8883c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        String str = !ScreenUtils.isScreenLock() ? "STUDENT_ONLINE_NOW" : "STUDENT_SCREEN_OFF";
        MyMqttService myMqttService = this.f8884d;
        String json = GsonUtils.toJson(new IfStudentOnline(this.f8885e, String.valueOf(C5962b.f6082a.m5299a().m5292t())));
        AbstractC9979u.m20293f(json, "toJson(...)");
        MyMqttService.m6774B(myMqttService, json, this.f8884d.f8859j + MqttTopic.TOPIC_LEVEL_SEPARATOR + str + "/all", false, 4, null);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((MyMqttService$mqttCallback$1$messageArrived$4) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
