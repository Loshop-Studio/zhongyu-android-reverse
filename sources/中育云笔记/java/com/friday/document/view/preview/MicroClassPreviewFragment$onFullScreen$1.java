package com.friday.document.view.preview;

import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.friday.common.helper.C5963c;
import com.taobao.sophix.PatchStatus;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.preview.MicroClassPreviewFragment$onFullScreen$1", m26211f = "MicroClassPreviewFragment.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_CONSTRUCTOR}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class MicroClassPreviewFragment$onFullScreen$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7450c;

    /* renamed from: d */
    public final /* synthetic */ MicroClassPreviewFragment f7451d;

    @InterfaceC11829d(m26210c = "com.friday.document.view.preview.MicroClassPreviewFragment$onFullScreen$1$1", m26211f = "MicroClassPreviewFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.preview.MicroClassPreviewFragment$onFullScreen$1$1 */
    public static final class C60551 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7452c;

        /* renamed from: d */
        public /* synthetic */ Object f7453d;

        /* renamed from: e */
        public final /* synthetic */ MicroClassPreviewFragment f7454e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60551(MicroClassPreviewFragment microClassPreviewFragment, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f7454e = microClassPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C60551 c60551 = new C60551(this.f7454e, interfaceC11588c);
            c60551.f7453d = obj;
            return c60551;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM20054c;
            AbstractC11725a.m25952f();
            if (this.f7452c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            MicroClassPreviewFragment microClassPreviewFragment = this.f7454e;
            try {
                Result.C9921a c9921a = Result.f23263d;
                objM20054c = Result.m20054c(ZipUtils.unzipFile(microClassPreviewFragment.m5938w() + ".zip", microClassPreviewFragment.m5938w()));
            } catch (Throwable th) {
                Result.C9921a c9921a2 = Result.f23263d;
                objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
            }
            MicroClassPreviewFragment microClassPreviewFragment2 = this.f7454e;
            if (Result.m20056e(objM20054c) != null) {
                FileUtils.delete(microClassPreviewFragment2.m5938w());
            }
            if (Result.m20058g(objM20054c)) {
                return null;
            }
            return objM20054c;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60551) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroClassPreviewFragment$onFullScreen$1(MicroClassPreviewFragment microClassPreviewFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7451d = microClassPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new MicroClassPreviewFragment$onFullScreen$1(this.f7451d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7450c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (FileUtils.isDir(this.f7451d.m5938w())) {
                C5963c.f6084a.m5319t(this.f7451d.m5938w());
                return C10786q.f26013a;
            }
            this.f7451d.isShowLoading(true);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            C60551 c60551 = new C60551(this.f7451d, null);
            this.f7450c = 1;
            obj = AbstractC11109f.m24709g(abstractC11106e0M24799b, c60551, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        MicroClassPreviewFragment microClassPreviewFragment = this.f7451d;
        List list = (List) obj;
        microClassPreviewFragment.isShowLoading(false);
        if (list == null) {
            AbstractC11958b.m26588i("微课文件解压失败，请重试");
        } else {
            C5963c.f6084a.m5319t(microClassPreviewFragment.m5938w());
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((MicroClassPreviewFragment$onFullScreen$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
