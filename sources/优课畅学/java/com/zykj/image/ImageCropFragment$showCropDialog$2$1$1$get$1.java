package com.zykj.image;

import com.tencent.smtt.sdk.TbsListener;
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
import top.zibin.luban.C10131b;

@InterfaceC9539d(m17800c = "com.zykj.image.ImageCropFragment$showCropDialog$2$1$1$get$1", m17801f = "ImageCropFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ImageCropFragment$showCropDialog$2$1$1$get$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f9741a;

    /* renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f9742b;

    /* renamed from: c */
    public final /* synthetic */ ImageCropFragment f9743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCropFragment$showCropDialog$2$1$1$get$1(Ref$ObjectRef ref$ObjectRef, ImageCropFragment imageCropFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9742b = ref$ObjectRef;
        this.f9743c = imageCropFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ImageCropFragment$showCropDialog$2$1$1$get$1(this.f9742b, this.f9743c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ImageCropFragment$showCropDialog$2$1$1$get$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f9741a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        AbstractC10271a.m19248a(AbstractC9133u.m16142p("即将进行压缩", ((File) this.f9742b.f17473a).getAbsolutePath()));
        return C10131b.m18932g(this.f9743c.requireContext()).m18946j((File) this.f9742b.f17473a).m18945i(TbsListener.ErrorCode.INFO_CODE_MINIQB).m18944h();
    }
}
