package com.zykj.view.p059ui.camera;

import androidx.camera.core.ImageCaptureException;
import com.zykj.sketch.utils.ToastUtils;
import com.zykj.view.databinding.ViewFragmentImagePickBinding;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.view.ui.camera.ImagePickFragment$takePic$1$onError$1", m13596f = "ImagePickFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes5.dex */
public final class ImagePickFragment$takePic$1$onError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11594a;

    /* renamed from: b */
    public /* synthetic */ Object f11595b;

    /* renamed from: c */
    public final /* synthetic */ ImagePickFragment f11596c;

    /* renamed from: d */
    public final /* synthetic */ ImageCaptureException f11597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickFragment$takePic$1$onError$1(ImagePickFragment imagePickFragment, ImageCaptureException imageCaptureException, Continuation continuation) {
        super(2, continuation);
        this.f11596c = imagePickFragment;
        this.f11597d = imageCaptureException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ImagePickFragment$takePic$1$onError$1 imagePickFragment$takePic$1$onError$1 = new ImagePickFragment$takePic$1$onError$1(this.f11596c, this.f11597d, continuation);
        imagePickFragment$takePic$1$onError$1.f11595b = obj;
        return imagePickFragment$takePic$1$onError$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11594a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ImagePickFragment imagePickFragment = this.f11596c;
        ImageCaptureException imageCaptureException = this.f11597d;
        try {
            Result.Companion companion = Result.INSTANCE;
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = imagePickFragment.mBindView;
            if (viewFragmentImagePickBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBindView");
                viewFragmentImagePickBinding = null;
            }
            viewFragmentImagePickBinding.f11398b.setEnabled(true);
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
            Result.m24299constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ImagePickFragment$takePic$1$onError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
