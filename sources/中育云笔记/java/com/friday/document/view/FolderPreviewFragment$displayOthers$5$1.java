package com.friday.document.view;

import com.friday.common.entity.FileEntity;
import com.friday.common.entity.FileType;
import com.friday.common.helper.C5963c;
import com.friday.document.viewmodel.FolderViewModel;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.FolderPreviewFragment$displayOthers$5$1", m26211f = "FolderPreviewFragment.kt", m26212l = {419}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FolderPreviewFragment$displayOthers$5$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f7099c;

    /* renamed from: d */
    public int f7100d;

    /* renamed from: e */
    public final /* synthetic */ boolean f7101e;

    /* renamed from: f */
    public final /* synthetic */ FileEntity f7102f;

    /* renamed from: g */
    public final /* synthetic */ FolderPreviewFragment f7103g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderPreviewFragment$displayOthers$5$1(boolean z10, FileEntity fileEntity, FolderPreviewFragment folderPreviewFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7101e = z10;
        this.f7102f = fileEntity;
        this.f7103g = folderPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderPreviewFragment$displayOthers$5$1(this.f7101e, this.f7102f, this.f7103g, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7100d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (this.f7101e) {
                C5963c.m5306s(C5963c.f6084a, this.f7102f.getFileName(), this.f7102f.getRealOssUrl(), false, null, 0L, 28, null);
                return C10786q.f26013a;
            }
            String realOssUrl = this.f7102f.getRealOssUrl();
            if (AbstractC9979u.m20289b(FileType.PICTURE, this.f7102f.getFileType())) {
                C5963c.m5301e(C5963c.f6084a, realOssUrl, false, 2, null);
                return C10786q.f26013a;
            }
            FolderViewModel folderViewModelM5692R = this.f7103g.m5692R();
            FileEntity fileEntity = this.f7102f;
            this.f7099c = AbstractC11833h.m26224a(realOssUrl);
            this.f7100d = 1;
            obj = folderViewModelM5692R.m6265u(fileEntity, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.f7103g.m5692R().m6226J().setValue(this.f7102f);
        } else {
            this.f7103g.isShowLoading(true);
            this.f7103g.m5692R().m6216A(this.f7102f);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderPreviewFragment$displayOthers$5$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
