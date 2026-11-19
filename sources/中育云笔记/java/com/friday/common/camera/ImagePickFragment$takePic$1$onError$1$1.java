package com.friday.common.camera;

import androidx.camera.core.ImageCaptureException;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.PausingDispatcherKt;
import com.alibaba.fastjson.asm.Opcodes;
import com.blankj.utilcode.util.ToastUtils;
import com.friday.common.databinding.FragmentImagePickBinding;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.camera.ImagePickFragment$takePic$1$onError$1$1", m26211f = "ImagePickFragment.kt", m26212l = {Opcodes.CHECKCAST}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImagePickFragment$takePic$1$onError$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f5737c;

    /* renamed from: d */
    public final /* synthetic */ ImagePickFragment f5738d;

    /* renamed from: e */
    public final /* synthetic */ ImageCaptureException f5739e;

    @InterfaceC11829d(m26210c = "com.friday.common.camera.ImagePickFragment$takePic$1$onError$1$1$1", m26211f = "ImagePickFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.common.camera.ImagePickFragment$takePic$1$onError$1$1$1 */
    public static final class C59401 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f5740c;

        /* renamed from: d */
        public final /* synthetic */ ImageCaptureException f5741d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59401(ImageCaptureException imageCaptureException, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f5741d = imageCaptureException;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C59401(this.f5741d, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f5740c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            int imageCaptureError = this.f5741d.getImageCaptureError();
            if (imageCaptureError == 0) {
                ToastUtils.showShort("拍照，图片处理未知异常", new Object[0]);
            } else if (imageCaptureError == 1) {
                ToastUtils.showShort("拍照写入文件失败", new Object[0]);
            } else if (imageCaptureError == 2) {
                ToastUtils.showShort("相机框架报告的错误，指示捕获请求失败", new Object[0]);
            } else if (imageCaptureError == 3) {
                ToastUtils.showShort("错误消息，表明由于相机关闭，无法完成请求", new Object[0]);
            } else if (imageCaptureError == 4) {
                ToastUtils.showShort("指示此ImageCapture未绑定到有效相机的错误", new Object[0]);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C59401) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickFragment$takePic$1$onError$1$1(ImagePickFragment imagePickFragment, ImageCaptureException imageCaptureException, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f5738d = imagePickFragment;
        this.f5739e = imageCaptureException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ImagePickFragment$takePic$1$onError$1$1(this.f5738d, this.f5739e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f5737c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            FragmentImagePickBinding fragmentImagePickBinding = this.f5738d.f5706m;
            if (fragmentImagePickBinding == null) {
                AbstractC9979u.m20312y("mBindView");
                fragmentImagePickBinding = null;
            }
            fragmentImagePickBinding.f5996d.setEnabled(true);
            LifecycleOwner viewLifecycleOwner = this.f5738d.getViewLifecycleOwner();
            AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C59401 c59401 = new C59401(this.f5739e, null);
            this.f5737c = 1;
            if (PausingDispatcherKt.whenResumed(viewLifecycleOwner, c59401, this) == objM25952f) {
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

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ImagePickFragment$takePic$1$onError$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
