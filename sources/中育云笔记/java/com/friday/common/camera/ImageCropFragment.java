package com.friday.common.camera;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.work.WorkRequest;
import com.blankj.utilcode.util.ClickUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.canhub.cropper.CropImageView;
import com.friday.common.R$layout;
import com.friday.common.camera.ImageCropFragment;
import com.friday.common.databinding.FragmentImageCropBinding;
import java.io.File;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p265nd.AbstractC10410o;
import p309qc.InterfaceC10773d;
import p364uc.AbstractC11383c;
import sd.AbstractC11109f;
import sd.AbstractC11117h;
import sd.C11157r0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ImageCropFragment extends Hilt_ImageCropFragment<FragmentImageCropBinding> {

    /* renamed from: m */
    public static final C5934a f5678m = new C5934a(null);

    /* renamed from: n */
    public static final int f5679n = 8;

    /* renamed from: i */
    public FragmentImageCropBinding f5680i;

    /* renamed from: j */
    public CameraBean f5681j;

    /* renamed from: k */
    public boolean f5682k;

    /* renamed from: l */
    public final InterfaceC10773d f5683l;

    /* renamed from: com.friday.common.camera.ImageCropFragment$a */
    public static final class C5934a {
        public /* synthetic */ C5934a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final ImageCropFragment m4854a(CameraBean cameraBean) {
            AbstractC9979u.m20294g(cameraBean, "cameraBean");
            Bundle bundle = new Bundle();
            bundle.putParcelable("CAMERA_BEAN", cameraBean);
            ImageCropFragment imageCropFragment = new ImageCropFragment();
            imageCropFragment.setArguments(bundle);
            return imageCropFragment;
        }

        public C5934a() {
        }
    }

    public ImageCropFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f5683l = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(CameraViewModel.class), new InterfaceC9529a() { // from class: com.friday.common.camera.ImageCropFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.common.camera.ImageCropFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.friday.common.camera.ImageCropFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final CameraViewModel m4837D() {
        return (CameraViewModel) this.f5683l.getValue();
    }

    /* renamed from: E */
    public static final void m4838E(ImageCropFragment imageCropFragment, CropImageView cropImageView, Uri uri, Exception exc) {
        AbstractC9979u.m20294g(cropImageView, "<unused var>");
        AbstractC9979u.m20294g(uri, "<unused var>");
        imageCropFragment.f5682k = exc == null;
        FragmentImageCropBinding fragmentImageCropBinding = imageCropFragment.f5680i;
        FragmentImageCropBinding fragmentImageCropBinding2 = null;
        if (fragmentImageCropBinding == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImageCropBinding = null;
        }
        ProgressBar progressBar = fragmentImageCropBinding.f5989e;
        AbstractC9979u.m20293f(progressBar, "progressBar");
        progressBar.setVisibility(8);
        FragmentImageCropBinding fragmentImageCropBinding3 = imageCropFragment.f5680i;
        if (fragmentImageCropBinding3 == null) {
            AbstractC9979u.m20312y("mBindView");
        } else {
            fragmentImageCropBinding2 = fragmentImageCropBinding3;
        }
        fragmentImageCropBinding2.f5988d.setEnabled(imageCropFragment.f5682k);
        if (exc != null) {
            LogUtils.m3887e("页面ImageCropFragment -> 图片加载失败，异常=" + exc.getMessage());
            ToastUtils.showShort("图片加载失败", new Object[0]);
            imageCropFragment.m4851C();
        }
    }

    /* renamed from: F */
    public static final void m4839F(ImageCropFragment imageCropFragment) {
        if (imageCropFragment.f5682k || !imageCropFragment.isAdded()) {
            return;
        }
        LogUtils.m3887e("页面ImageCropFragment -> 图片加载超时");
        ToastUtils.showShort("图片加载超时", new Object[0]);
        imageCropFragment.m4851C();
    }

    /* renamed from: G */
    public static final void m4840G(ImageCropFragment imageCropFragment, View view) {
        imageCropFragment.m4837D().m4824b();
    }

    /* renamed from: H */
    public static final void m4841H(ImageCropFragment imageCropFragment, View view) {
        LifecycleOwner viewLifecycleOwner = imageCropFragment.getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ImageCropFragment$initData$1$4$1(imageCropFragment, null), 3, null);
    }

    /* renamed from: C */
    public final void m4851C() {
        isShowLoading(false);
        requireActivity().finish();
    }

    /* renamed from: I */
    public final Object m4852I(Bitmap bitmap, boolean z10, InterfaceC11588c interfaceC11588c) {
        return AbstractC11109f.m24709g(C11157r0.m24798a(), new ImageCropFragment$optimizeCroppedBitmap$2(this, bitmap, z10, null), interfaceC11588c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J */
    public final Bitmap m4853J(Bitmap bitmap, boolean z10) {
        Bitmap bitmapM20054c;
        int iM21756i = AbstractC10410o.m21756i((int) (Math.max(ScreenUtils.getScreenWidth(), ScreenUtils.getScreenHeight()) * (z10 ? 2.5f : 2.0f)), 4096);
        int iMax = Math.max(bitmap.getWidth(), bitmap.getHeight());
        double width = bitmap.getWidth() * bitmap.getHeight();
        if (iMax >= iM21756i && iMax <= 4096 && width <= 1.2E7d) {
            return bitmap;
        }
        float fM25337k = AbstractC11383c.m25337k(iM21756i / iMax, 4096.0f / bitmap.getWidth(), 4096.0f / bitmap.getHeight(), (float) Math.sqrt(1.2E7d / width));
        if (fM25337k == 1.0f) {
            return bitmap;
        }
        int iM21752e = AbstractC10410o.m21752e((int) (bitmap.getWidth() * fM25337k), 1);
        int iM21752e2 = AbstractC10410o.m21752e((int) (bitmap.getHeight() * fM25337k), 1);
        try {
            Result.C9921a c9921a = Result.f23263d;
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iM21752e, iM21752e2, true);
            LogUtils.m3888i("页面ImageCropFragment -> 裁剪图片尺寸过大，压缩后插入，原尺寸=" + bitmap.getWidth() + "x" + bitmap.getHeight() + "，新尺寸=" + bitmapCreateScaledBitmap.getWidth() + "x" + bitmapCreateScaledBitmap.getHeight());
            bitmapM20054c = Result.m20054c(bitmapCreateScaledBitmap);
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            bitmapM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        Throwable thM20056e = Result.m20056e(bitmapM20054c);
        if (thM20056e == null) {
            bitmap = bitmapM20054c;
        } else {
            LogUtils.m3887e("页面ImageCropFragment -> 裁剪图片压缩失败，沿用原图，异常=" + thM20056e.getMessage());
        }
        return bitmap;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_image_crop;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        CameraBean cameraBean = this.f5681j;
        if (cameraBean == null) {
            throw new IllegalArgumentException("参数不对");
        }
        this.f5682k = false;
        FragmentImageCropBinding fragmentImageCropBinding = this.f5680i;
        FragmentImageCropBinding fragmentImageCropBinding2 = null;
        if (fragmentImageCropBinding == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImageCropBinding = null;
        }
        ProgressBar progressBar = fragmentImageCropBinding.f5989e;
        AbstractC9979u.m20293f(progressBar, "progressBar");
        progressBar.setVisibility(0);
        FragmentImageCropBinding fragmentImageCropBinding3 = this.f5680i;
        if (fragmentImageCropBinding3 == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImageCropBinding3 = null;
        }
        fragmentImageCropBinding3.f5988d.setEnabled(false);
        FragmentImageCropBinding fragmentImageCropBinding4 = this.f5680i;
        if (fragmentImageCropBinding4 == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImageCropBinding4 = null;
        }
        fragmentImageCropBinding4.f5990f.setOnSetImageUriCompleteListener(new CropImageView.InterfaceC5896g() { // from class: b2.g
            @Override // com.canhub.cropper.CropImageView.InterfaceC5896g
            /* renamed from: v */
            public final void mo2667v(CropImageView cropImageView, Uri uri, Exception exc) {
                ImageCropFragment.m4838E(this.f2982c, cropImageView, uri, exc);
            }
        });
        FragmentImageCropBinding fragmentImageCropBinding5 = this.f5680i;
        if (fragmentImageCropBinding5 == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImageCropBinding5 = null;
        }
        fragmentImageCropBinding5.f5990f.setImageUriAsync(Uri.fromFile(new File(cameraBean.m4817i())));
        FragmentImageCropBinding fragmentImageCropBinding6 = this.f5680i;
        if (fragmentImageCropBinding6 == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImageCropBinding6 = null;
        }
        fragmentImageCropBinding6.f5990f.postDelayed(new Runnable() { // from class: b2.h
            @Override // java.lang.Runnable
            public final void run() {
                ImageCropFragment.m4839F(this.f2983c);
            }
        }, WorkRequest.MIN_BACKOFF_MILLIS);
        FragmentImageCropBinding fragmentImageCropBinding7 = this.f5680i;
        if (fragmentImageCropBinding7 == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImageCropBinding7 = null;
        }
        fragmentImageCropBinding7.f5990f.setFixedAspectRatio(cameraBean.m4815g());
        if (cameraBean.m4815g()) {
            FragmentImageCropBinding fragmentImageCropBinding8 = this.f5680i;
            if (fragmentImageCropBinding8 == null) {
                AbstractC9979u.m20312y("mBindView");
                fragmentImageCropBinding8 = null;
            }
            fragmentImageCropBinding8.f5990f.m4490o(cameraBean.m4818j(), cameraBean.m4819k());
        }
        FragmentImageCropBinding fragmentImageCropBinding9 = this.f5680i;
        if (fragmentImageCropBinding9 == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImageCropBinding9 = null;
        }
        fragmentImageCropBinding9.f5987c.setOnClickListener(new View.OnClickListener() { // from class: b2.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageCropFragment.m4840G(this.f2984c, view);
            }
        });
        FragmentImageCropBinding fragmentImageCropBinding10 = this.f5680i;
        if (fragmentImageCropBinding10 == null) {
            AbstractC9979u.m20312y("mBindView");
        } else {
            fragmentImageCropBinding2 = fragmentImageCropBinding10;
        }
        ClickUtils.applyGlobalDebouncing(fragmentImageCropBinding2.f5988d, 2000L, new View.OnClickListener() { // from class: b2.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageCropFragment.m4841H(this.f2985c, view);
            }
        });
    }

    @Override // com.friday.common.base.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9979u.m20294g(inflater, "inflater");
        FragmentImageCropBinding fragmentImageCropBindingM5234a = FragmentImageCropBinding.m5234a(inflater, viewGroup, false);
        AbstractC9979u.m20293f(fragmentImageCropBindingM5234a, "inflate(...)");
        this.f5680i = fragmentImageCropBindingM5234a;
        if (fragmentImageCropBindingM5234a == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImageCropBindingM5234a = null;
        }
        View root = fragmentImageCropBindingM5234a.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9979u.m20294g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.f5681j = arguments != null ? (CameraBean) arguments.getParcelable("CAMERA_BEAN") : null;
        initView();
    }
}
