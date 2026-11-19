package com.zykj.study.p065ui.home.exercise;

// RE note 本类字节码直接引用的读写或显示接口包括WebView。

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import com.blankj.utilcode.util.AbstractC5375m;
import com.zykj.study.R$layout;
import com.zykj.study.databinding.FragmentMicroCropExtraBinding;
import com.zykj.study.p065ui.home.exercise.MicroCropExtraFragment;
import com.zykj.study.view.CustomX5WebView;
import com.zykj.study.viewmodels.MicroExtraViewModel;
import java.io.File;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9137y;
import p086e5.C8356e;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8807u;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MicroCropExtraFragment extends Hilt_MicroCropExtraFragment<FragmentMicroCropExtraBinding> {

    /* renamed from: i */
    public static final C7828a f12013i = new C7828a(null);

    /* renamed from: j */
    public static final int f12014j = 8;

    /* renamed from: f */
    public final InterfaceC8724d f12015f;

    /* renamed from: g */
    public InterfaceC10570l f12016g;

    /* renamed from: h */
    public InterfaceC10559a f12017h;

    /* renamed from: com.zykj.study.ui.home.exercise.MicroCropExtraFragment$a */
    public static final class C7828a {
        public /* synthetic */ C7828a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7828a() {
        }
    }

    public MicroCropExtraFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f12015f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(MicroExtraViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.MicroCropExtraFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.MicroCropExtraFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a2 = interfaceC10559a;
                return (interfaceC10559a2 == null || (creationExtras = (CreationExtras) interfaceC10559a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.MicroCropExtraFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: k */
    private final MicroExtraViewModel m10717k() {
        return (MicroExtraViewModel) this.f12015f.getValue();
    }

    /* renamed from: l */
    public static final void m10718l(MicroCropExtraFragment microCropExtraFragment, View view) {
        InterfaceC10559a interfaceC10559a = microCropExtraFragment.f12017h;
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        } else {
            FragmentKt.findNavController(microCropExtraFragment).navigateUp();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static final void m10719m(MicroCropExtraFragment microCropExtraFragment, View view) {
        File externalCacheDir;
        String absolutePath;
        Bitmap bitmapM2580d = AbstractC5375m.m2580d(((FragmentMicroCropExtraBinding) microCropExtraFragment.getMBindView()).webView);
        if (bitmapM2580d == null || (externalCacheDir = microCropExtraFragment.requireContext().getExternalCacheDir()) == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
            return;
        }
        File file = new File(absolutePath, "temp.jpg");
        AbstractC5375m.m2578b(bitmapM2580d, file, Bitmap.CompressFormat.JPEG);
        InterfaceC10570l interfaceC10570l = microCropExtraFragment.f12016g;
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(file);
        } else {
            androidx.fragment.app.FragmentKt.setFragmentResult(microCropExtraFragment, "RESULT_IMAGE_PATH_KEY", BundleKt.bundleOf(AbstractC8726f.m14230a("IMAGE_PATH", file.getAbsolutePath())));
            FragmentKt.findNavController(microCropExtraFragment).navigateUp();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static final void m10720n(MicroCropExtraFragment microCropExtraFragment, View view) {
        ((FragmentMicroCropExtraBinding) microCropExtraFragment.getMBindView()).webView.zoomIn();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static final void m10721o(MicroCropExtraFragment microCropExtraFragment, View view) {
        ((FragmentMicroCropExtraBinding) microCropExtraFragment.getMBindView()).webView.zoomOut();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        m10722p();
        ((FragmentMicroCropExtraBinding) getMBindView()).setCloseListener(new View.OnClickListener() { // from class: w4.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MicroCropExtraFragment.m10718l(this.f20513a, view);
            }
        });
        ((FragmentMicroCropExtraBinding) getMBindView()).setTailoringListener(new View.OnClickListener() { // from class: w4.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MicroCropExtraFragment.m10719m(this.f20516a, view);
            }
        });
        ((FragmentMicroCropExtraBinding) getMBindView()).setEnlargeListener(new View.OnClickListener() { // from class: w4.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MicroCropExtraFragment.m10720n(this.f20519a, view);
            }
        });
        ((FragmentMicroCropExtraBinding) getMBindView()).setNarrowListener(new View.OnClickListener() { // from class: w4.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MicroCropExtraFragment.m10721o(this.f20521a, view);
            }
        });
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_micro_crop_extra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public final void m10722p() {
        ((FragmentMicroCropExtraBinding) getMBindView()).webView.setVerticalScrollBarEnabled(false);
        ((FragmentMicroCropExtraBinding) getMBindView()).webView.setHorizontalScrollBarEnabled(false);
        ((FragmentMicroCropExtraBinding) getMBindView()).webView.getSettings().setUseWideViewPort(true);
        CustomX5WebView customX5WebView = ((FragmentMicroCropExtraBinding) getMBindView()).webView;
        C8356e c8356e = C8356e.f15876a;
        customX5WebView.m11897g(c8356e.m13622d());
        customX5WebView.m11897g(c8356e.m13619a());
        customX5WebView.m11897g(AbstractC8807u.m14755e(c8356e.m13620b()));
        String strM12201a = m10717k().m12201a();
        if (strM12201a != null) {
            ((FragmentMicroCropExtraBinding) getMBindView()).webView.loadData(strM12201a, "text/html; charset=UTF-8", null);
        }
    }

    /* renamed from: q */
    public final void m10723q(InterfaceC10559a interfaceC10559a) {
        this.f12017h = interfaceC10559a;
    }

    /* renamed from: r */
    public final void m10724r(InterfaceC10570l interfaceC10570l) {
        this.f12016g = interfaceC10570l;
    }
}
