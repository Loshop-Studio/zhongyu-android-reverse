package com.friday.lecture.floatwindow.homework;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.graphics.Bitmap;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.friday.common.classtest.MqttResponse;
import com.friday.common.entity.MqttEntity;
import com.friday.common.entity.MqttType;
import com.friday.lecture.model.ClassTestHelper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p111d3.C8925a;
import p181hd.InterfaceC9544p;
import p215k2.AbstractC9803u;
import p215k2.C9793k;
import p215k2.C9799q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.lecture.floatwindow.homework.HomeworkLayout$arrangeTask$1", m26211f = "HomeworkLayout.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HomeworkLayout$arrangeTask$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8755c;

    /* renamed from: d */
    public final /* synthetic */ HomeworkLayout f8756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeworkLayout$arrangeTask$1(HomeworkLayout homeworkLayout, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8756d = homeworkLayout;
    }

    /* renamed from: m */
    public static final void m6614m(HomeworkLayout homeworkLayout) {
        if (homeworkLayout.f8731c) {
            C8925a.f20887a.m17528l();
        } else {
            C8925a.f20887a.m17524h();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new HomeworkLayout$arrangeTask$1(this.f8756d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f8755c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        try {
            String str = "";
            C9793k.m19779k(this.f8756d.getContext()).m19783o("正在布置随堂测");
            if (this.f8756d.f8737i != null) {
                HomeworkLayout homeworkLayout = this.f8756d;
                String str2 = AbstractC9803u.m19814a() + ".jpg";
                String str3 = PathUtils.getExternalAppCachePath() + MqttTopic.TOPIC_LEVEL_SEPARATOR + str2;
                ImageUtils.save(homeworkLayout.f8737i, str3, Bitmap.CompressFormat.JPEG);
                File file = new File(str3);
                if (C9799q.f22994a.m19801c(file.getName(), new FileInputStream(file))) {
                    str = str2;
                }
            }
            String str4 = str;
            ClassTestHelper classTestHelper = ClassTestHelper.INSTANCE;
            classTestHelper.setRecentlyHomework(new MqttResponse(String.valueOf(System.currentTimeMillis()), 0, new MqttResponse.Data(str4, this.f8756d.f8731c ? 0 : this.f8756d.f8732d ? 1 : 2, this.f8756d.f8731c ? 0 : this.f8756d.f8752x, null, new ArrayList(), true, new MqttResponse.QuestionInfo(this.f8756d.f8731c ? 0 : this.f8756d.f8753y, this.f8756d.f8731c ? 0 : this.f8756d.f8752x))));
            String json = GsonUtils.toJson(classTestHelper.getRecentlyHomework());
            Observable observable = LiveEventBus.get(MqttEntity.class);
            MqttType mqttType = MqttType.ARRANGE_HOMEWORK;
            AbstractC9979u.m20291d(json);
            observable.post(new MqttEntity(mqttType, json, null, 4, null));
            C9793k.m19779k(this.f8756d.getContext()).m19780l();
            final HomeworkLayout homeworkLayout2 = this.f8756d;
            ThreadUtils.runOnUiThread(new Runnable() { // from class: com.friday.lecture.floatwindow.homework.a
                @Override // java.lang.Runnable
                public final void run() {
                    HomeworkLayout$arrangeTask$1.m6614m(homeworkLayout2);
                }
            });
        } catch (Exception e10) {
            e10.printStackTrace();
            C9793k.m19779k(this.f8756d.getContext()).m19782n("布置随堂测失败");
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((HomeworkLayout$arrangeTask$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
