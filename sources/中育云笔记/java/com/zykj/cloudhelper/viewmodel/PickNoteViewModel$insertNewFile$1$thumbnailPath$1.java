package com.zykj.cloudhelper.viewmodel;

import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ZipUtils;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p181hd.InterfaceC9544p;
import p215k2.C9802t;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.cloudhelper.viewmodel.PickNoteViewModel$insertNewFile$1$thumbnailPath$1", m26211f = "PickNoteViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PickNoteViewModel$insertNewFile$1$thumbnailPath$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f19574c;

    /* renamed from: d */
    public /* synthetic */ Object f19575d;

    /* renamed from: e */
    public final /* synthetic */ String f19576e;

    /* renamed from: f */
    public final /* synthetic */ String f19577f;

    /* renamed from: g */
    public final /* synthetic */ String f19578g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickNoteViewModel$insertNewFile$1$thumbnailPath$1(String str, String str2, String str3, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f19576e = str;
        this.f19577f = str2;
        this.f19578g = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        PickNoteViewModel$insertNewFile$1$thumbnailPath$1 pickNoteViewModel$insertNewFile$1$thumbnailPath$1 = new PickNoteViewModel$insertNewFile$1$thumbnailPath$1(this.f19576e, this.f19577f, this.f19578g, interfaceC11588c);
        pickNoteViewModel$insertNewFile$1$thumbnailPath$1.f19575d = obj;
        return pickNoteViewModel$insertNewFile$1$thumbnailPath$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f19574c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        String str = this.f19576e;
        String str2 = this.f19577f;
        String str3 = this.f19578g;
        try {
            Result.C9921a c9921a = Result.f23263d;
            String str4 = str + str2 + MqttTopic.TOPIC_LEVEL_SEPARATOR + str2;
            String str5 = str + str2 + MqttTopic.TOPIC_LEVEL_SEPARATOR + str2 + ".jpg";
            ZipUtils.unzipFile(str3, str4);
            FileUtils.copy(new C9802t(str + str2 + MqttTopic.TOPIC_LEVEL_SEPARATOR + str2, null).m19812d(), str5);
            if (FileUtils.isFileExists(str5)) {
                return str5;
            }
            FileUtils.delete(str4);
            return null;
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            Object objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
            if (Result.m20058g(objM20054c)) {
                return null;
            }
            return objM20054c;
        }
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((PickNoteViewModel$insertNewFile$1$thumbnailPath$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
