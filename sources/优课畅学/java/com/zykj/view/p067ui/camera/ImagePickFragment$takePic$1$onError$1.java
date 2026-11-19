package com.zykj.view.p067ui.camera;

import androidx.camera.core.ImageCaptureException;
import com.zykj.sketch.utils.ToastUtils;
import com.zykj.view.databinding.ViewFragmentImagePickBinding;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.ui.camera.ImagePickFragment$takePic$1$onError$1", m17801f = "ImagePickFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ImagePickFragment$takePic$1$onError$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f15547a;

    /* renamed from: b */
    public /* synthetic */ Object f15548b;

    /* renamed from: c */
    public final /* synthetic */ ImagePickFragment f15549c;

    /* renamed from: d */
    public final /* synthetic */ ImageCaptureException f15550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickFragment$takePic$1$onError$1(ImagePickFragment imagePickFragment, ImageCaptureException imageCaptureException, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15549c = imagePickFragment;
        this.f15550d = imageCaptureException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        ImagePickFragment$takePic$1$onError$1 imagePickFragment$takePic$1$onError$1 = new ImagePickFragment$takePic$1$onError$1(this.f15549c, this.f15550d, interfaceC9324c);
        imagePickFragment$takePic$1$onError$1.f15548b = obj;
        return imagePickFragment$takePic$1$onError$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ImagePickFragment$takePic$1$onError$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f15547a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        ImagePickFragment imagePickFragment = this.f15549c;
        ImageCaptureException imageCaptureException = this.f15550d;
        try {
            Result.C9076a c9076a = Result.f17350b;
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = imagePickFragment.f15539d;
            if (viewFragmentImagePickBinding == null) {
                AbstractC9133u.m16151y("mBindView");
                viewFragmentImagePickBinding = null;
            }
            viewFragmentImagePickBinding.f15387b.setEnabled(true);
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
            Result.m15909b(C8736p.f16368a);
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            Result.m15909b(AbstractC9079b.m15925a(th));
        }
        return C8736p.f16368a;
    }
}
