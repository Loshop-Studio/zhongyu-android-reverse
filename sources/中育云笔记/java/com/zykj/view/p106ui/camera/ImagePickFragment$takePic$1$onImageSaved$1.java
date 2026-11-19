package com.zykj.view.p106ui.camera;

import android.content.Intent;
import androidx.camera.core.ImageCapture;
import androidx.fragment.app.FragmentActivity;
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

@InterfaceC11829d(m26210c = "com.zykj.view.ui.camera.ImagePickFragment$takePic$1$onImageSaved$1", m26211f = "ImagePickFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ImagePickFragment$takePic$1$onImageSaved$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20765c;

    /* renamed from: d */
    public /* synthetic */ Object f20766d;

    /* renamed from: e */
    public final /* synthetic */ ImagePickFragment f20767e;

    /* renamed from: f */
    public final /* synthetic */ ImageCapture.OutputFileResults f20768f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickFragment$takePic$1$onImageSaved$1(ImagePickFragment imagePickFragment, ImageCapture.OutputFileResults outputFileResults, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20767e = imagePickFragment;
        this.f20768f = outputFileResults;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        ImagePickFragment$takePic$1$onImageSaved$1 imagePickFragment$takePic$1$onImageSaved$1 = new ImagePickFragment$takePic$1$onImageSaved$1(this.f20767e, this.f20768f, interfaceC11588c);
        imagePickFragment$takePic$1$onImageSaved$1.f20766d = obj;
        return imagePickFragment$takePic$1$onImageSaved$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f20765c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        ImagePickFragment imagePickFragment = this.f20767e;
        ImageCapture.OutputFileResults outputFileResults = this.f20768f;
        try {
            Result.C9921a c9921a = Result.f23263d;
            FragmentActivity fragmentActivityRequireActivity = imagePickFragment.requireActivity();
            Intent intent = new Intent();
            intent.putExtra("ResultUri", outputFileResults.getSavedUri());
            C10786q c10786q = C10786q.f26013a;
            fragmentActivityRequireActivity.setResult(-1, intent);
            imagePickFragment.requireActivity().finish();
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = imagePickFragment.f20753g;
            if (viewFragmentImagePickBinding == null) {
                AbstractC9979u.m20312y("mBindView");
                viewFragmentImagePickBinding = null;
            }
            viewFragmentImagePickBinding.f20598d.setEnabled(true);
            Result.m20054c(C10786q.f26013a);
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            Result.m20054c(AbstractC9924b.m20070a(th));
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ImagePickFragment$takePic$1$onImageSaved$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
