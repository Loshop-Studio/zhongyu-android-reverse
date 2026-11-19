package com.friday.document.viewmodel;

import com.friday.document.model.ShareFile;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBaseViewModel$clickNoteCall$1", m26211f = "ShareBaseViewModel.kt", m26212l = {97}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareBaseViewModel$clickNoteCall$1 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public int f8210c;

    /* renamed from: d */
    public final /* synthetic */ ShareBaseViewModel f8211d;

    /* renamed from: e */
    public final /* synthetic */ ShareFile f8212e;

    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBaseViewModel$clickNoteCall$1$1", m26211f = "ShareBaseViewModel.kt", m26212l = {99}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.viewmodel.ShareBaseViewModel$clickNoteCall$1$1 */
    public static final class C61211 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f8213c;

        /* renamed from: d */
        public /* synthetic */ Object f8214d;

        /* renamed from: e */
        public final /* synthetic */ ShareBaseViewModel f8215e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61211(ShareBaseViewModel shareBaseViewModel, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f8215e = shareBaseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C61211 c61211 = new C61211(this.f8215e, interfaceC11588c);
            c61211.f8214d = obj;
            return c61211;
        }

        @Override // p181hd.InterfaceC9544p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
            return ((C61211) create(shareFile, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ShareFile shareFile = (ShareFile) this.f8214d;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f8213c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                ShareBaseViewModel shareBaseViewModel = this.f8215e;
                this.f8214d = AbstractC11833h.m26224a(shareFile);
                this.f8213c = 1;
                if (shareBaseViewModel.m6378v(shareFile, this) == objM25952f) {
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
    public ShareBaseViewModel$clickNoteCall$1(ShareBaseViewModel shareBaseViewModel, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f8211d = shareBaseViewModel;
        this.f8212e = shareFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new ShareBaseViewModel$clickNoteCall$1(this.f8211d, this.f8212e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8210c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            ShareBaseViewModel shareBaseViewModel = this.f8211d;
            ShareFile shareFile = this.f8212e;
            C61211 c61211 = new C61211(shareBaseViewModel, null);
            this.f8210c = 1;
            if (ShareBaseViewModel.m6362o(shareBaseViewModel, shareFile, c61211, null, null, this, 12, null) == objM25952f) {
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
        return ((ShareBaseViewModel$clickNoteCall$1) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
