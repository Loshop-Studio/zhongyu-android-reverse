package com.zykj.view.p067ui.camera;

import android.content.Intent;
import androidx.camera.core.ImageCapture;
import androidx.fragment.app.FragmentActivity;
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

@InterfaceC9539d(m17800c = "com.zykj.view.ui.camera.ImagePickFragment$takePic$1$onImageSaved$1", m17801f = "ImagePickFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ImagePickFragment$takePic$1$onImageSaved$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f15551a;

    /* renamed from: b */
    public /* synthetic */ Object f15552b;

    /* renamed from: c */
    public final /* synthetic */ ImagePickFragment f15553c;

    /* renamed from: d */
    public final /* synthetic */ ImageCapture.OutputFileResults f15554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickFragment$takePic$1$onImageSaved$1(ImagePickFragment imagePickFragment, ImageCapture.OutputFileResults outputFileResults, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15553c = imagePickFragment;
        this.f15554d = outputFileResults;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        ImagePickFragment$takePic$1$onImageSaved$1 imagePickFragment$takePic$1$onImageSaved$1 = new ImagePickFragment$takePic$1$onImageSaved$1(this.f15553c, this.f15554d, interfaceC9324c);
        imagePickFragment$takePic$1$onImageSaved$1.f15552b = obj;
        return imagePickFragment$takePic$1$onImageSaved$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ImagePickFragment$takePic$1$onImageSaved$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f15551a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        ImagePickFragment imagePickFragment = this.f15553c;
        ImageCapture.OutputFileResults outputFileResults = this.f15554d;
        try {
            Result.C9076a c9076a = Result.f17350b;
            FragmentActivity fragmentActivityRequireActivity = imagePickFragment.requireActivity();
            Intent intent = new Intent();
            intent.putExtra("ResultUri", outputFileResults.getSavedUri());
            C8736p c8736p = C8736p.f16368a;
            fragmentActivityRequireActivity.setResult(-1, intent);
            imagePickFragment.requireActivity().finish();
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = imagePickFragment.f15539d;
            if (viewFragmentImagePickBinding == null) {
                AbstractC9133u.m16151y("mBindView");
                viewFragmentImagePickBinding = null;
            }
            viewFragmentImagePickBinding.f15387b.setEnabled(true);
            Result.m15909b(C8736p.f16368a);
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            Result.m15909b(AbstractC9079b.m15925a(th));
        }
        return C8736p.f16368a;
    }
}
