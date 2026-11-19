package com.zykj.view.p106ui.camera;

import androidx.camera.core.ImageCaptureException;
import com.zykj.sketch.utils.ToastUtils;
import com.zykj.view.databinding.ViewFragmentImagePickBinding;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.ui.camera.ImagePickFragment$takePic$1$onError$1", m26211f = "ImagePickFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ImagePickFragment$takePic$1$onError$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20761c;

    /* renamed from: d */
    public /* synthetic */ Object f20762d;

    /* renamed from: e */
    public final /* synthetic */ ImagePickFragment f20763e;

    /* renamed from: f */
    public final /* synthetic */ ImageCaptureException f20764f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickFragment$takePic$1$onError$1(ImagePickFragment imagePickFragment, ImageCaptureException imageCaptureException, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20763e = imagePickFragment;
        this.f20764f = imageCaptureException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        ImagePickFragment$takePic$1$onError$1 imagePickFragment$takePic$1$onError$1 = new ImagePickFragment$takePic$1$onError$1(this.f20763e, this.f20764f, interfaceC11588c);
        imagePickFragment$takePic$1$onError$1.f20762d = obj;
        return imagePickFragment$takePic$1$onError$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f20761c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        ImagePickFragment imagePickFragment = this.f20763e;
        ImageCaptureException imageCaptureException = this.f20764f;
        try {
            Result.C9921a c9921a = Result.f23263d;
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = imagePickFragment.f20753g;
            if (viewFragmentImagePickBinding == null) {
                AbstractC9979u.m20312y("mBindView");
                viewFragmentImagePickBinding = null;
            }
            viewFragmentImagePickBinding.f20598d.setEnabled(true);
            int imageCaptureError = imageCaptureException.getImageCaptureError();
            if (imageCaptureError == 0) {
                ToastUtils.showShort(imagePickFragment.requireContext(), "拍照，图片处理未知异常");
            } else if (imageCaptureError == 1) {
                ToastUtils.showShort(imagePickFragment.requireContext(), "拍照写入文件失败");
            } else if (imageCaptureError == 2) {
                ToastUtils.showShort(imagePickFragment.requireContext(), "相机框架报告的错误，指示捕获请求失败");
            } else if (imageCaptureError == 3) {
                ToastUtils.showShort(imagePickFragment.requireContext(), "错误消息，表明由于相机关闭，无法完成请求");
            } else if (imageCaptureError == 4) {
                ToastUtils.showShort(imagePickFragment.requireContext(), "指示此ImageCapture未绑定到有效相机的错误");
            }
            Result.m20054c(C10786q.f26013a);
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            Result.m20054c(AbstractC9924b.m20070a(th));
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ImagePickFragment$takePic$1$onError$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
