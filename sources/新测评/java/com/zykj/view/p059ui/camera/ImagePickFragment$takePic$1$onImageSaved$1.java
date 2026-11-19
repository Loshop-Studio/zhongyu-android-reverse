package com.zykj.view.p059ui.camera;

import android.content.Intent;
import androidx.camera.core.ImageCapture;
import androidx.fragment.app.FragmentActivity;
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
@DebugMetadata(m13595c = "com.zykj.view.ui.camera.ImagePickFragment$takePic$1$onImageSaved$1", m13596f = "ImagePickFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes5.dex */
public final class ImagePickFragment$takePic$1$onImageSaved$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11598a;

    /* renamed from: b */
    public /* synthetic */ Object f11599b;

    /* renamed from: c */
    public final /* synthetic */ ImagePickFragment f11600c;

    /* renamed from: d */
    public final /* synthetic */ ImageCapture.OutputFileResults f11601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickFragment$takePic$1$onImageSaved$1(ImagePickFragment imagePickFragment, ImageCapture.OutputFileResults outputFileResults, Continuation continuation) {
        super(2, continuation);
        this.f11600c = imagePickFragment;
        this.f11601d = outputFileResults;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ImagePickFragment$takePic$1$onImageSaved$1 imagePickFragment$takePic$1$onImageSaved$1 = new ImagePickFragment$takePic$1$onImageSaved$1(this.f11600c, this.f11601d, continuation);
        imagePickFragment$takePic$1$onImageSaved$1.f11599b = obj;
        return imagePickFragment$takePic$1$onImageSaved$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11598a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ImagePickFragment imagePickFragment = this.f11600c;
        ImageCapture.OutputFileResults outputFileResults = this.f11601d;
        try {
            Result.Companion companion = Result.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = imagePickFragment.requireActivity();
            Intent intent = new Intent();
            intent.putExtra("ResultUri", outputFileResults.getSavedUri());
            Unit unit = Unit.INSTANCE;
            fragmentActivityRequireActivity.setResult(-1, intent);
            imagePickFragment.requireActivity().finish();
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = imagePickFragment.mBindView;
            if (viewFragmentImagePickBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBindView");
                viewFragmentImagePickBinding = null;
            }
            viewFragmentImagePickBinding.f11398b.setEnabled(true);
            Result.m24299constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ImagePickFragment$takePic$1$onImageSaved$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
