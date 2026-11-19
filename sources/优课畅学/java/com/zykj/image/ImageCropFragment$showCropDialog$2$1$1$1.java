package com.zykj.image;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p282w0.AbstractC10271a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.image.ImageCropFragment$showCropDialog$2$1$1$1", m17801f = "ImageCropFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ImageCropFragment$showCropDialog$2$1$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f9737a;

    /* renamed from: b */
    public final /* synthetic */ ImageCropFragment f9738b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f9739c;

    /* renamed from: d */
    public final /* synthetic */ Ref$ObjectRef f9740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCropFragment$showCropDialog$2$1$1$1(ImageCropFragment imageCropFragment, Bitmap bitmap, Ref$ObjectRef ref$ObjectRef, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9738b = imageCropFragment;
        this.f9739c = bitmap;
        this.f9740d = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ImageCropFragment$showCropDialog$2$1$1$1(this.f9738b, this.f9739c, this.f9740d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ImageCropFragment$showCropDialog$2$1$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f9737a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        this.f9738b.saveToLocal(this.f9739c, (File) this.f9740d.f17473a);
        AbstractC10271a.m19248a(AbstractC9133u.m16142p("Bitmap保存到本地", ((File) this.f9740d.f17473a).getAbsolutePath()));
        return C8736p.f16368a;
    }
}
