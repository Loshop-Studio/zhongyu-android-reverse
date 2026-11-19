package com.friday.document.viewmodel;

import com.blankj.utilcode.util.FileUtils;
import com.friday.document.model.ShareFile;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p141f2.C9166c;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBaseViewModel$clickOthersCall$1", m26211f = "ShareBaseViewModel.kt", m26212l = {113}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareBaseViewModel$clickOthersCall$1 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public int f8216c;

    /* renamed from: d */
    public final /* synthetic */ ShareBaseViewModel f8217d;

    /* renamed from: e */
    public final /* synthetic */ ShareFile f8218e;

    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBaseViewModel$clickOthersCall$1$1", m26211f = "ShareBaseViewModel.kt", m26212l = {115}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.viewmodel.ShareBaseViewModel$clickOthersCall$1$1 */
    public static final class C61221 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f8219c;

        /* renamed from: d */
        public /* synthetic */ Object f8220d;

        /* renamed from: e */
        public final /* synthetic */ ShareBaseViewModel f8221e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61221(ShareBaseViewModel shareBaseViewModel, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f8221e = shareBaseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C61221 c61221 = new C61221(this.f8221e, interfaceC11588c);
            c61221.f8220d = obj;
            return c61221;
        }

        @Override // p181hd.InterfaceC9544p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
            return ((C61221) create(shareFile, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ShareFile shareFile = (ShareFile) this.f8220d;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f8219c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                ShareBaseViewModel shareBaseViewModel = this.f8221e;
                this.f8220d = AbstractC11833h.m26224a(shareFile);
                this.f8219c = 1;
                if (shareBaseViewModel.m6379w(shareFile, this) == objM25952f) {
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

    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBaseViewModel$clickOthersCall$1$2", m26211f = "ShareBaseViewModel.kt", m26212l = {PatchStatus.CODE_LOAD_RES_INJECT_PATH}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.viewmodel.ShareBaseViewModel$clickOthersCall$1$2 */
    public static final class C61232 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f8222c;

        /* renamed from: d */
        public /* synthetic */ Object f8223d;

        /* renamed from: e */
        public final /* synthetic */ ShareBaseViewModel f8224e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61232(ShareBaseViewModel shareBaseViewModel, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f8224e = shareBaseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C61232 c61232 = new C61232(this.f8224e, interfaceC11588c);
            c61232.f8223d = obj;
            return c61232;
        }

        @Override // p181hd.InterfaceC9544p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
            return ((C61232) create(shareFile, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ShareFile shareFile = (ShareFile) this.f8223d;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f8222c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                if (AbstractC9979u.m20289b(shareFile.getType(), "11") && !FileUtils.isFileExists(shareFile.getCoverFilePath()) && C9166c.f21406a.m18061e()) {
                    ShareBaseViewModel shareBaseViewModel = this.f8224e;
                    this.f8223d = AbstractC11833h.m26224a(shareFile);
                    this.f8222c = 1;
                    if (shareBaseViewModel.m6377u(shareFile, this) == objM25952f) {
                        return objM25952f;
                    }
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
    public ShareBaseViewModel$clickOthersCall$1(ShareBaseViewModel shareBaseViewModel, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f8217d = shareBaseViewModel;
        this.f8218e = shareFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new ShareBaseViewModel$clickOthersCall$1(this.f8217d, this.f8218e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8216c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            ShareBaseViewModel shareBaseViewModel = this.f8217d;
            ShareFile shareFile = this.f8218e;
            C61221 c61221 = new C61221(shareBaseViewModel, null);
            C61232 c61232 = new C61232(this.f8217d, null);
            this.f8216c = 1;
            if (ShareBaseViewModel.m6362o(shareBaseViewModel, shareFile, c61221, c61232, null, this, 8, null) == objM25952f) {
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
        return ((ShareBaseViewModel$clickOthersCall$1) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
