package com.zykj.view.p037ui.camera;

import android.content.Intent;
import androidx.camera.core.ImageCapture;
import androidx.fragment.app.FragmentActivity;
import com.zykj.view.databinding.ViewFragmentImagePickBinding;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.view.ui.camera.ImagePickFragment$takePic$1$onImageSaved$1", m5303f = "ImagePickFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
public final class ImagePickFragment$takePic$1$onImageSaved$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ ImageCapture.OutputFileResults $outputFileResults;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ImagePickFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickFragment$takePic$1$onImageSaved$1(ImagePickFragment imagePickFragment, ImageCapture.OutputFileResults outputFileResults, InterfaceC5631c<? super ImagePickFragment$takePic$1$onImageSaved$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = imagePickFragment;
        this.$outputFileResults = outputFileResults;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        ImagePickFragment$takePic$1$onImageSaved$1 imagePickFragment$takePic$1$onImageSaved$1 = new ImagePickFragment$takePic$1$onImageSaved$1(this.this$0, this.$outputFileResults, interfaceC5631c);
        imagePickFragment$takePic$1$onImageSaved$1.L$0 = obj;
        return imagePickFragment$takePic$1$onImageSaved$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C5443s c5443s = C5443s.f8405a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        ImagePickFragment imagePickFragment = this.this$0;
        ImageCapture.OutputFileResults outputFileResults = this.$outputFileResults;
        try {
            FragmentActivity fragmentActivityRequireActivity = imagePickFragment.requireActivity();
            Intent intent = new Intent();
            intent.putExtra("ResultUri", outputFileResults.getSavedUri());
            fragmentActivityRequireActivity.setResult(-1, intent);
            imagePickFragment.requireActivity().finish();
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = imagePickFragment.mBindView;
            if (viewFragmentImagePickBinding == null) {
                AbstractC5830k.m5339p("mBindView");
                throw null;
            }
            viewFragmentImagePickBinding.capture.setEnabled(true);
            Result.m13956constructorimpl(c5443s);
            return c5443s;
        } catch (Throwable th) {
            Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
            return c5443s;
        }
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((ImagePickFragment$takePic$1$onImageSaved$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
