package com.friday.document.viewmodel;

import com.friday.document.model.ShareFile;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBaseViewModel$clickTxtCall$1", m26211f = "ShareBaseViewModel.kt", m26212l = {PatchStatus.CODE_PRELOAD_REMOVE_BASEDEX}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareBaseViewModel$clickTxtCall$1 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public int f8225c;

    /* renamed from: d */
    public final /* synthetic */ ShareBaseViewModel f8226d;

    /* renamed from: e */
    public final /* synthetic */ ShareFile f8227e;

    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBaseViewModel$clickTxtCall$1$1", m26211f = "ShareBaseViewModel.kt", m26212l = {PatchStatus.CODE_PRELOAD_OPT_MERGED}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.viewmodel.ShareBaseViewModel$clickTxtCall$1$1 */
    public static final class C61241 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f8228c;

        /* renamed from: d */
        public /* synthetic */ Object f8229d;

        /* renamed from: e */
        public final /* synthetic */ ShareBaseViewModel f8230e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61241(ShareBaseViewModel shareBaseViewModel, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f8230e = shareBaseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C61241 c61241 = new C61241(this.f8230e, interfaceC11588c);
            c61241.f8229d = obj;
            return c61241;
        }

        @Override // p181hd.InterfaceC9544p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
            return ((C61241) create(shareFile, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ShareFile shareFile = (ShareFile) this.f8229d;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f8228c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                ShareBaseViewModel shareBaseViewModel = this.f8230e;
                this.f8229d = AbstractC11833h.m26224a(shareFile);
                this.f8228c = 1;
                if (shareBaseViewModel.m6380x(shareFile, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBaseViewModel$clickTxtCall$1(ShareBaseViewModel shareBaseViewModel, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f8226d = shareBaseViewModel;
        this.f8227e = shareFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new ShareBaseViewModel$clickTxtCall$1(this.f8226d, this.f8227e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8225c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            ShareBaseViewModel shareBaseViewModel = this.f8226d;
            ShareFile shareFile = this.f8227e;
            C61241 c61241 = new C61241(shareBaseViewModel, null);
            this.f8225c = 1;
            if (ShareBaseViewModel.m6362o(shareBaseViewModel, shareFile, c61241, null, null, this, 12, null) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c interfaceC11588c) {
        return ((ShareBaseViewModel$clickTxtCall$1) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
