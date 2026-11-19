package com.friday.common.camera;

import android.graphics.Bitmap;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.camera.ImageCropFragment$optimizeCroppedBitmap$2", m26211f = "ImageCropFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageCropFragment$optimizeCroppedBitmap$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f5696c;

    /* renamed from: d */
    public final /* synthetic */ ImageCropFragment f5697d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f5698e;

    /* renamed from: f */
    public final /* synthetic */ boolean f5699f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCropFragment$optimizeCroppedBitmap$2(ImageCropFragment imageCropFragment, Bitmap bitmap, boolean z10, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f5697d = imageCropFragment;
        this.f5698e = bitmap;
        this.f5699f = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ImageCropFragment$optimizeCroppedBitmap$2(this.f5697d, this.f5698e, this.f5699f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f5696c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return this.f5697d.m4853J(this.f5698e, this.f5699f);
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ImageCropFragment$optimizeCroppedBitmap$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
