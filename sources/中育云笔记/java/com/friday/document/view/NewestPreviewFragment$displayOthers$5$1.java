package com.friday.document.view;

import com.friday.common.entity.FileEntity;
import com.friday.common.entity.FileType;
import com.friday.common.helper.C5963c;
import com.friday.document.viewmodel.NewestViewModel;
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

@InterfaceC11829d(m26210c = "com.friday.document.view.NewestPreviewFragment$displayOthers$5$1", m26211f = "NewestPreviewFragment.kt", m26212l = {426}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NewestPreviewFragment$displayOthers$5$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f7191c;

    /* renamed from: d */
    public int f7192d;

    /* renamed from: e */
    public final /* synthetic */ boolean f7193e;

    /* renamed from: f */
    public final /* synthetic */ FileEntity f7194f;

    /* renamed from: g */
    public final /* synthetic */ NewestPreviewFragment f7195g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewestPreviewFragment$displayOthers$5$1(boolean z10, FileEntity fileEntity, NewestPreviewFragment newestPreviewFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7193e = z10;
        this.f7194f = fileEntity;
        this.f7195g = newestPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewestPreviewFragment$displayOthers$5$1(this.f7193e, this.f7194f, this.f7195g, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7192d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (this.f7193e) {
                C5963c.m5306s(C5963c.f6084a, this.f7194f.getFileName(), this.f7194f.getRealOssUrl(), false, null, 0L, 28, null);
                return C10786q.f26013a;
            }
            String realOssUrl = this.f7194f.getRealOssUrl();
            if (AbstractC9979u.m20289b(FileType.PICTURE, this.f7194f.getFileType())) {
                C5963c.m5301e(C5963c.f6084a, realOssUrl, false, 2, null);
                return C10786q.f26013a;
            }
            NewestViewModel newestViewModelM5749R = this.f7195g.m5749R();
            FileEntity fileEntity = this.f7194f;
            this.f7191c = AbstractC11833h.m26224a(realOssUrl);
            this.f7192d = 1;
            obj = newestViewModelM5749R.m6265u(fileEntity, this);
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
            this.f7195g.m5749R().m6226J().setValue(this.f7194f);
        } else {
            this.f7195g.isShowLoading(true);
            this.f7195g.m5749R().m6216A(this.f7194f);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewestPreviewFragment$displayOthers$5$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
