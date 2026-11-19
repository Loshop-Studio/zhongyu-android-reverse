package com.zykj.image;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.base.utils.XToastUtils;
import com.zykj.image.databinding.FragmentImageCropBinding;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8839h;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8831e0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p256t7.AbstractC10123h;
import p282w0.AbstractC10271a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.image.ImageCropFragment$showCropDialog$2$1", m17801f = "ImageCropFragment.kt", m17802l = {TbsListener.ErrorCode.THREAD_INIT_ERROR, 141}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ImageCropFragment$showCropDialog$2$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f9729a;

    /* renamed from: b */
    public Object f9730b;

    /* renamed from: c */
    public Object f9731c;

    /* renamed from: d */
    public Object f9732d;

    /* renamed from: e */
    public int f9733e;

    /* renamed from: f */
    public /* synthetic */ Object f9734f;

    /* renamed from: g */
    public final /* synthetic */ ImageCropFragment f9735g;

    /* renamed from: h */
    public final /* synthetic */ DialogInterface f9736h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCropFragment$showCropDialog$2$1(ImageCropFragment imageCropFragment, DialogInterface dialogInterface, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9735g = imageCropFragment;
        this.f9736h = dialogInterface;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        ImageCropFragment$showCropDialog$2$1 imageCropFragment$showCropDialog$2$1 = new ImageCropFragment$showCropDialog$2$1(this.f9735g, this.f9736h, interfaceC9324c);
        imageCropFragment$showCropDialog$2$1.f9734f = obj;
        return imageCropFragment$showCropDialog$2$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ImageCropFragment$showCropDialog$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC8822b0 interfaceC8822b0;
        Bitmap croppedImage;
        ImageCropFragment imageCropFragment;
        Ref$ObjectRef ref$ObjectRef;
        DialogInterface dialogInterface;
        DialogInterface dialogInterface2;
        ImageCropFragment imageCropFragment2;
        Bitmap bitmap;
        Object objMo14833u;
        Ref$ObjectRef ref$ObjectRef2;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f9733e;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            interfaceC8822b0 = (InterfaceC8822b0) this.f9734f;
            croppedImage = ((FragmentImageCropBinding) this.f9735g.getMBindView()).f9813d.getCroppedImage();
            if (croppedImage == null) {
                XToastUtils xToastUtils = XToastUtils.INSTANCE;
                String string = this.f9735g.getString(R$string.crop_fail);
                AbstractC9133u.m16132f(string, "getString(R.string.crop_fail)");
                xToastUtils.error(string);
                this.f9736h.dismiss();
                return C8736p.f16368a;
            }
            String str = (String) this.f9735g.localFilePath.getValue();
            if (str != null) {
                imageCropFragment = this.f9735g;
                DialogInterface dialogInterface3 = this.f9736h;
                File file = new File(str);
                ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.f17473a = new File(file.getParentFile(), AbstractC10123h.m18879f(file) + "_crop." + AbstractC10123h.m18878e(file));
                CoroutineDispatcher coroutineDispatcherM14867b = C8843i0.m14867b();
                ImageCropFragment$showCropDialog$2$1$1$1 imageCropFragment$showCropDialog$2$1$1$1 = new ImageCropFragment$showCropDialog$2$1$1$1(imageCropFragment, croppedImage, ref$ObjectRef, null);
                this.f9734f = interfaceC8822b0;
                this.f9729a = croppedImage;
                this.f9730b = imageCropFragment;
                this.f9731c = dialogInterface3;
                this.f9732d = ref$ObjectRef;
                this.f9733e = 1;
                if (AbstractC8833f.m14848g(coroutineDispatcherM14867b, imageCropFragment$showCropDialog$2$1$1$1, this) != objM17291f) {
                    dialogInterface = dialogInterface3;
                }
                return objM17291f;
            }
            return C8736p.f16368a;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef2 = (Ref$ObjectRef) this.f9732d;
            ref$ObjectRef = (Ref$ObjectRef) this.f9731c;
            dialogInterface2 = (DialogInterface) this.f9730b;
            imageCropFragment2 = (ImageCropFragment) this.f9729a;
            bitmap = (Bitmap) this.f9734f;
            try {
                AbstractC9079b.m15926b(obj);
                AbstractC9133u.m16132f(obj, "get.await()");
                Object objM14578x0 = AbstractC8778f0.m14578x0((List) obj);
                AbstractC9133u.m16132f(objM14578x0, "get.await().last()");
                ref$ObjectRef2.f17473a = objM14578x0;
                AbstractC10271a.m19248a(AbstractC9133u.m16142p("压缩后成功->", ((File) ref$ObjectRef.f17473a).getAbsolutePath()));
            } catch (IOException e10) {
                e = e10;
                e.printStackTrace();
                AbstractC10271a.m19250c(AbstractC9133u.m16142p("图片压缩失败", ((File) ref$ObjectRef.f17473a).getAbsolutePath()));
                XToastUtils xToastUtils2 = XToastUtils.INSTANCE;
                String string2 = imageCropFragment2.getString(R$string.image_compress_fail);
                AbstractC9133u.m16132f(string2, "getString(R.string.image_compress_fail)");
                xToastUtils2.error(string2);
                imageCropFragment = imageCropFragment2;
                croppedImage = bitmap;
                dialogInterface = dialogInterface2;
                dialogInterface.dismiss();
                croppedImage.recycle();
                FragmentKt.setFragmentResult(imageCropFragment, ImageCropFragment.RESULT_IMAGE_PATH_KEY, BundleKt.bundleOf(AbstractC8726f.m14230a(ImageCropFragment.IMAGE_PATH, ((File) ref$ObjectRef.f17473a).getAbsolutePath())));
                androidx.navigation.fragment.FragmentKt.findNavController(imageCropFragment).navigateUp();
                return C8736p.f16368a;
            }
            imageCropFragment = imageCropFragment2;
            croppedImage = bitmap;
            dialogInterface = dialogInterface2;
            dialogInterface.dismiss();
            croppedImage.recycle();
            FragmentKt.setFragmentResult(imageCropFragment, ImageCropFragment.RESULT_IMAGE_PATH_KEY, BundleKt.bundleOf(AbstractC8726f.m14230a(ImageCropFragment.IMAGE_PATH, ((File) ref$ObjectRef.f17473a).getAbsolutePath())));
            androidx.navigation.fragment.FragmentKt.findNavController(imageCropFragment).navigateUp();
            return C8736p.f16368a;
        }
        ref$ObjectRef = (Ref$ObjectRef) this.f9732d;
        dialogInterface = (DialogInterface) this.f9731c;
        imageCropFragment = (ImageCropFragment) this.f9730b;
        Bitmap bitmap2 = (Bitmap) this.f9729a;
        interfaceC8822b0 = (InterfaceC8822b0) this.f9734f;
        AbstractC9079b.m15926b(obj);
        croppedImage = bitmap2;
        InterfaceC8822b0 interfaceC8822b02 = interfaceC8822b0;
        if (!((File) ref$ObjectRef.f17473a).exists()) {
            XToastUtils xToastUtils3 = XToastUtils.INSTANCE;
            String string3 = imageCropFragment.getString(R$string.image_save_fail);
            AbstractC9133u.m16132f(string3, "getString(R.string.image_save_fail)");
            xToastUtils3.error(string3);
            dialogInterface.dismiss();
            return C8736p.f16368a;
        }
        if (imageCropFragment.getArgs().m9213a()) {
            try {
                InterfaceC8831e0 interfaceC8831e0M14859b = AbstractC8839h.m14859b(interfaceC8822b02, null, null, new ImageCropFragment$showCropDialog$2$1$1$get$1(ref$ObjectRef, imageCropFragment, null), 3, null);
                this.f9734f = croppedImage;
                this.f9729a = imageCropFragment;
                this.f9730b = dialogInterface;
                this.f9731c = ref$ObjectRef;
                this.f9732d = ref$ObjectRef;
                this.f9733e = 2;
                objMo14833u = interfaceC8831e0M14859b.mo14833u(this);
            } catch (IOException e11) {
                e = e11;
                dialogInterface2 = dialogInterface;
                imageCropFragment2 = imageCropFragment;
                bitmap = croppedImage;
                e.printStackTrace();
                AbstractC10271a.m19250c(AbstractC9133u.m16142p("图片压缩失败", ((File) ref$ObjectRef.f17473a).getAbsolutePath()));
                XToastUtils xToastUtils22 = XToastUtils.INSTANCE;
                String string22 = imageCropFragment2.getString(R$string.image_compress_fail);
                AbstractC9133u.m16132f(string22, "getString(R.string.image_compress_fail)");
                xToastUtils22.error(string22);
                imageCropFragment = imageCropFragment2;
                croppedImage = bitmap;
                dialogInterface = dialogInterface2;
                dialogInterface.dismiss();
                croppedImage.recycle();
                FragmentKt.setFragmentResult(imageCropFragment, ImageCropFragment.RESULT_IMAGE_PATH_KEY, BundleKt.bundleOf(AbstractC8726f.m14230a(ImageCropFragment.IMAGE_PATH, ((File) ref$ObjectRef.f17473a).getAbsolutePath())));
                androidx.navigation.fragment.FragmentKt.findNavController(imageCropFragment).navigateUp();
                return C8736p.f16368a;
            }
            if (objMo14833u != objM17291f) {
                DialogInterface dialogInterface4 = dialogInterface;
                bitmap = croppedImage;
                obj = objMo14833u;
                dialogInterface2 = dialogInterface4;
                ref$ObjectRef2 = ref$ObjectRef;
                imageCropFragment2 = imageCropFragment;
                AbstractC9133u.m16132f(obj, "get.await()");
                Object objM14578x02 = AbstractC8778f0.m14578x0((List) obj);
                AbstractC9133u.m16132f(objM14578x02, "get.await().last()");
                ref$ObjectRef2.f17473a = objM14578x02;
                AbstractC10271a.m19248a(AbstractC9133u.m16142p("压缩后成功->", ((File) ref$ObjectRef.f17473a).getAbsolutePath()));
                imageCropFragment = imageCropFragment2;
                croppedImage = bitmap;
                dialogInterface = dialogInterface2;
            }
            return objM17291f;
        }
        dialogInterface.dismiss();
        croppedImage.recycle();
        FragmentKt.setFragmentResult(imageCropFragment, ImageCropFragment.RESULT_IMAGE_PATH_KEY, BundleKt.bundleOf(AbstractC8726f.m14230a(ImageCropFragment.IMAGE_PATH, ((File) ref$ObjectRef.f17473a).getAbsolutePath())));
        androidx.navigation.fragment.FragmentKt.findNavController(imageCropFragment).navigateUp();
        return C8736p.f16368a;
    }
}
