package com.friday.document.viewmodel;

import com.friday.common.helper.C5962b;
import com.friday.common.property.BaseResponse;
import com.friday.document.model.ShareFile;
import com.friday.document.model.StudentShareEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p330s2.InterfaceC11052b;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareFileViewModel$showSubLevelFile$1", m26211f = "ShareFileViewModel.kt", m26212l = {228}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareFileViewModel$showSubLevelFile$1 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public int f8319c;

    /* renamed from: d */
    public final /* synthetic */ ShareFileViewModel f8320d;

    /* renamed from: e */
    public final /* synthetic */ String f8321e;

    /* renamed from: f */
    public final /* synthetic */ long f8322f;

    /* renamed from: g */
    public final /* synthetic */ String f8323g;

    /* renamed from: h */
    public final /* synthetic */ String f8324h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFileViewModel$showSubLevelFile$1(ShareFileViewModel shareFileViewModel, String str, long j10, String str2, String str3, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f8320d = shareFileViewModel;
        this.f8321e = str;
        this.f8322f = j10;
        this.f8323g = str2;
        this.f8324h = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new ShareFileViewModel$showSubLevelFile$1(this.f8320d, this.f8321e, this.f8322f, this.f8323g, this.f8324h, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ShareFileViewModel$showSubLevelFile$1 shareFileViewModel$showSubLevelFile$1;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8319c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            this.f8320d.f8291l.setValue(AbstractC11826a.m26208c(C5962b.f6082a.m5299a().m5288p()));
            InterfaceC11052b interfaceC11052b = this.f8320d.f8284e;
            String str = this.f8321e;
            long j10 = this.f8322f;
            this.f8319c = 1;
            shareFileViewModel$showSubLevelFile$1 = this;
            obj = interfaceC11052b.m24505d(str, j10, false, shareFileViewModel$showSubLevelFile$1);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            shareFileViewModel$showSubLevelFile$1 = this;
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse.getCode() != 0) {
            return new ArrayList();
        }
        List<ShareFile> shareFileList = ((StudentShareEntity) baseResponse.getData()).getShareFileList();
        String str2 = shareFileViewModel$showSubLevelFile$1.f8323g;
        String str3 = shareFileViewModel$showSubLevelFile$1.f8324h;
        for (ShareFile shareFile : shareFileList) {
            shareFile.setShareTime(str2);
            shareFile.setOwnerName(str3);
        }
        return AbstractC10947g0.m23925a1(shareFileList);
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c interfaceC11588c) {
        return ((ShareFileViewModel$showSubLevelFile$1) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
