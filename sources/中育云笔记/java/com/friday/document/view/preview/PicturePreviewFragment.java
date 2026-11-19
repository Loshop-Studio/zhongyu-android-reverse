package com.friday.document.view.preview;

import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import coil3.C5480l;
import coil3.InterfaceC5470e;
import coil3.request.CachePolicy;
import com.friday.common.base.BaseFragment;
import com.friday.document.R$drawable;
import com.friday.document.R$layout;
import com.friday.document.databinding.FragmentPreviewPicBinding;
import com.friday.document.view.viewer.ImagePreviewDialogFragment;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p380w.AbstractC11630j;
import p380w.C11627g;
import p383w2.InterfaceC11671b;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class PicturePreviewFragment extends BaseFragment<FragmentPreviewPicBinding> implements InterfaceC11671b {

    /* renamed from: d */
    public static final C6060a f7484d = new C6060a(null);

    /* renamed from: e */
    public static final int f7485e = BaseFragment.$stable;

    /* renamed from: com.friday.document.view.preview.PicturePreviewFragment$a */
    public static final class C6060a {
        public /* synthetic */ C6060a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final PicturePreviewFragment m5965a(String localPath) {
            AbstractC9979u.m20294g(localPath, "localPath");
            Bundle bundle = new Bundle();
            bundle.putString("localPath", localPath);
            PicturePreviewFragment picturePreviewFragment = new PicturePreviewFragment();
            picturePreviewFragment.setArguments(bundle);
            return picturePreviewFragment;
        }

        public C6060a() {
        }
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_preview_pic;
    }

    @Override // p383w2.InterfaceC11671b
    /* renamed from: i */
    public void mo5940i() {
        ImagePreviewDialogFragment imagePreviewDialogFragment = new ImagePreviewDialogFragment();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        AbstractC9979u.m20293f(parentFragmentManager, "getParentFragmentManager(...)");
        imagePreviewDialogFragment.show(parentFragmentManager, "ImagePreviewDialog");
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        AppCompatImageView imageView = getMBinding().f6403c;
        AbstractC9979u.m20293f(imageView, "imageView");
        String strM5964q = m5964q();
        InterfaceC5470e interfaceC5470eM3194a = C5480l.m3194a(imageView.getContext());
        C11627g.a aVarM25740q = AbstractC11630j.m25740q(new C11627g.a(imageView.getContext()).m25676d(strM5964q), imageView);
        CachePolicy cachePolicy = CachePolicy.f3887h;
        aVarM25740q.m25682k(cachePolicy);
        aVarM25740q.m25678f(cachePolicy);
        aVarM25740q.m25683l(cachePolicy);
        AbstractC11630j.m25725b(aVarM25740q, R$drawable.icon_micor_class_normal);
        interfaceC5470eM3194a.mo2978c(aVarM25740q.m25675c());
    }

    @Override // com.friday.common.base.BaseFragment
    public boolean needHideLoadingOnDestroy() {
        return false;
    }

    /* renamed from: q */
    public final String m5964q() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("localPath")) == null) ? "" : string;
    }
}
