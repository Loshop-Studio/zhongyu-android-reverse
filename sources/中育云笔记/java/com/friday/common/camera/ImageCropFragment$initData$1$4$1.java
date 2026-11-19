package com.friday.common.camera;

import android.graphics.Bitmap;
import com.blankj.utilcode.util.ToastUtils;
import com.canhub.cropper.CropImageView;
import com.friday.common.databinding.FragmentImageCropBinding;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.camera.ImageCropFragment$initData$1$4$1", m26211f = "ImageCropFragment.kt", m26212l = {104}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageCropFragment$initData$1$4$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f5688c;

    /* renamed from: d */
    public Object f5689d;

    /* renamed from: e */
    public Object f5690e;

    /* renamed from: f */
    public Object f5691f;

    /* renamed from: g */
    public int f5692g;

    /* renamed from: h */
    public int f5693h;

    /* renamed from: i */
    public /* synthetic */ Object f5694i;

    /* renamed from: j */
    public final /* synthetic */ ImageCropFragment f5695j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCropFragment$initData$1$4$1(ImageCropFragment imageCropFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f5695j = imageCropFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        ImageCropFragment$initData$1$4$1 imageCropFragment$initData$1$4$1 = new ImageCropFragment$initData$1$4$1(this.f5695j, interfaceC11588c);
        imageCropFragment$initData$1$4$1.f5694i = obj;
        return imageCropFragment$initData$1$4$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM20054c;
        CameraBean cameraBean;
        ImageCropFragment imageCropFragment;
        InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f5694i;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f5693h;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (!this.f5695j.f5682k) {
                ToastUtils.showShort("图片加载中，请稍后", new Object[0]);
                return C10786q.f26013a;
            }
            this.f5695j.isShowLoading(true);
            ImageCropFragment imageCropFragment2 = this.f5695j;
            try {
                Result.C9921a c9921a = Result.f23263d;
                FragmentImageCropBinding fragmentImageCropBinding = imageCropFragment2.f5680i;
                if (fragmentImageCropBinding == null) {
                    AbstractC9979u.m20312y("mBindView");
                    fragmentImageCropBinding = null;
                }
                objM20054c = Result.m20054c(fragmentImageCropBinding.f5990f.m4484h(4096, 4096, CropImageView.RequestSizeOptions.f5277d));
            } catch (Throwable th) {
                Result.C9921a c9921a2 = Result.f23263d;
                objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
            }
            Bitmap bitmap = (Bitmap) (Result.m20058g(objM20054c) ? null : objM20054c);
            if (bitmap == null) {
                ToastUtils.showShort("图片裁剪失败", new Object[0]);
                this.f5695j.m4851C();
                return C10786q.f26013a;
            }
            CameraBean cameraBean2 = this.f5695j.f5681j;
            if (cameraBean2 != null) {
                ImageCropFragment imageCropFragment3 = this.f5695j;
                boolean z10 = cameraBean2.m4814c() != null;
                this.f5694i = AbstractC11833h.m26224a(interfaceC11122i0);
                this.f5688c = AbstractC11833h.m26224a(bitmap);
                this.f5689d = cameraBean2;
                this.f5690e = imageCropFragment3;
                this.f5691f = cameraBean2;
                this.f5692g = 0;
                this.f5693h = 1;
                Object objM4852I = imageCropFragment3.m4852I(bitmap, z10, this);
                if (objM4852I == objM25952f) {
                    return objM25952f;
                }
                cameraBean = cameraBean2;
                obj = objM4852I;
                imageCropFragment = imageCropFragment3;
            }
            return C10786q.f26013a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cameraBean = (CameraBean) this.f5691f;
        imageCropFragment = (ImageCropFragment) this.f5690e;
        AbstractC9924b.m20071b(obj);
        Bitmap bitmap2 = (Bitmap) obj;
        if (cameraBean.m4814c() != null) {
            LiveEventBus.get("ScreenCaptureImage", Pair.class).post(new Pair(cameraBean.m4814c(), bitmap2));
        } else {
            LiveEventBus.get("addBitmap", Bitmap.class).post(bitmap2);
        }
        imageCropFragment.m4837D().m4828f(bitmap2);
        imageCropFragment.m4851C();
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ImageCropFragment$initData$1$4$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
