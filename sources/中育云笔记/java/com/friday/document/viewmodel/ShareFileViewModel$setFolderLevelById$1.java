package com.friday.document.viewmodel;

import com.friday.common.property.BaseResponse;
import com.friday.document.model.ShareFile;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p330s2.InterfaceC11052b;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareFileViewModel$setFolderLevelById$1", m26211f = "ShareFileViewModel.kt", m26212l = {43}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareFileViewModel$setFolderLevelById$1 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public int f8315c;

    /* renamed from: d */
    public final /* synthetic */ String f8316d;

    /* renamed from: e */
    public final /* synthetic */ ShareFileViewModel f8317e;

    /* renamed from: f */
    public final /* synthetic */ long f8318f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFileViewModel$setFolderLevelById$1(String str, ShareFileViewModel shareFileViewModel, long j10, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f8316d = str;
        this.f8317e = shareFileViewModel;
        this.f8318f = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new ShareFileViewModel$setFolderLevelById$1(this.f8316d, this.f8317e, this.f8318f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8315c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (AbstractC9979u.m20289b(this.f8316d, "0")) {
                return null;
            }
            InterfaceC11052b interfaceC11052b = this.f8317e.f8284e;
            String str = this.f8316d;
            long j10 = this.f8318f;
            this.f8315c = 1;
            obj = interfaceC11052b.m24504c(str, j10, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse.getCode() == 0) {
            return (ShareFile) baseResponse.getData();
        }
        return null;
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c interfaceC11588c) {
        return ((ShareFileViewModel$setFolderLevelById$1) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
