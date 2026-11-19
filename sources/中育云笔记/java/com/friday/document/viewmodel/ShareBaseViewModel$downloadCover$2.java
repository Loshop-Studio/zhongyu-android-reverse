package com.friday.document.viewmodel;

import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5964d;
import com.friday.document.model.ShareFile;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10947g0;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBaseViewModel$downloadCover$2", m26211f = "ShareBaseViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareBaseViewModel$downloadCover$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8237c;

    /* renamed from: d */
    public final /* synthetic */ ShareBaseViewModel f8238d;

    /* renamed from: e */
    public final /* synthetic */ ShareFile f8239e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBaseViewModel$downloadCover$2(ShareBaseViewModel shareBaseViewModel, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8238d = shareBaseViewModel;
        this.f8239e = shareFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ShareBaseViewModel$downloadCover$2(this.f8238d, this.f8239e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        AbstractC11725a.m25952f();
        if (this.f8237c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        String str = this.f8238d.f8198l + this.f8239e.getFileId() + ".jpg";
        long ownerId = this.f8239e.getOwnerId();
        String str2 = (String) AbstractC10947g0.m23946o0(AbstractC10793c0.m23091I0(this.f8239e.getCreateTime(), new String[]{" "}, false, 0, 6, null));
        if (str2 != null) {
            AbstractC10819z.m23238K(str2, "-", "", false, 4, null);
        }
        String microClassCoverUrl = this.f8239e.getMicroClassCoverUrl();
        C5962b c5962bM5299a = C5962b.f6082a.m5299a();
        ShareFile shareFile = this.f8239e;
        C5964d.f6085d.m5337a().m5331g(microClassCoverUrl, str, c5962bM5299a.m5276d(c5962bM5299a.m5286n() + MqttTopic.TOPIC_LEVEL_SEPARATOR + c5962bM5299a.m5281i() + MqttTopic.TOPIC_LEVEL_SEPARATOR + ownerId + MqttTopic.TOPIC_LEVEL_SEPARATOR + shareFile.getFileId() + ".jpg"));
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ShareBaseViewModel$downloadCover$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
