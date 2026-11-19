package com.friday.document.view.viewer;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.C5815g;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.friday.document.R$layout;
import com.friday.document.R$string;
import com.friday.document.databinding.ActivityImagePreviewBinding;
import com.friday.document.view.viewer.ImagePreviewActivity;
import kotlin.jvm.internal.AbstractC9979u;
import p002a1.InterfaceC0037h;
import p141f2.C9166c;
import p198j0.AbstractC9650c;
import p428z0.InterfaceC11954c;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
@Route(path = "/document/IMAGE_PREVIEW_ACTIVITY")
/* loaded from: classes3.dex */
public final class ImagePreviewActivity extends Hilt_ImagePreviewActivity<ActivityImagePreviewBinding> {

    /* renamed from: g */
    public String f7739g = "";

    /* renamed from: h */
    public boolean f7740h;

    /* renamed from: com.friday.document.view.viewer.ImagePreviewActivity$a */
    public static final class C6095a implements InterfaceC11954c {
        public C6095a() {
        }

        @Override // p428z0.InterfaceC11954c
        /* renamed from: a */
        public boolean mo6152a(GlideException glideException, Object obj, InterfaceC0037h target, boolean z10) {
            AbstractC9979u.m20294g(target, "target");
            ImagePreviewActivity.this.isShowLoading(false);
            AbstractC11958b.m26588i("图片下载失败");
            ImagePreviewActivity.m6150O(ImagePreviewActivity.this).f6288e.setVisibility(0);
            return false;
        }

        @Override // p428z0.InterfaceC11954c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo6153b(Drawable resource, Object model, InterfaceC0037h interfaceC0037h, DataSource dataSource, boolean z10) {
            AbstractC9979u.m20294g(resource, "resource");
            AbstractC9979u.m20294g(model, "model");
            AbstractC9979u.m20294g(dataSource, "dataSource");
            ImagePreviewActivity.this.isShowLoading(false);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: O */
    public static final /* synthetic */ ActivityImagePreviewBinding m6150O(ImagePreviewActivity imagePreviewActivity) {
        return (ActivityImagePreviewBinding) imagePreviewActivity.getMBinding();
    }

    /* renamed from: P */
    public static final void m6151P(ImagePreviewActivity imagePreviewActivity, View view) {
        imagePreviewActivity.finish();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.activity_image_preview;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        ARouter.getInstance().inject(this);
        ((ActivityImagePreviewBinding) getMBinding()).f6286c.setOnClickListener(new View.OnClickListener() { // from class: y2.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImagePreviewActivity.m6151P(this.f28205c, view);
            }
        });
        if (this.f7740h) {
            ((C5815g) ComponentCallbacks2C5810b.m3949w(this).m4016t(this.f7739g).m26549h(AbstractC9650c.f22356b)).m3981A0(((ActivityImagePreviewBinding) getMBinding()).f6287d);
            return;
        }
        if (C9166c.f21406a.m18061e()) {
            isShowLoading(true);
            ComponentCallbacks2C5810b.m3949w(this).m4016t(this.f7739g).m3983C0(new C6095a()).m3981A0(((ActivityImagePreviewBinding) getMBinding()).f6287d);
        } else {
            String string = getString(R$string.connect_network_please);
            AbstractC9979u.m20293f(string, "getString(...)");
            AbstractC11958b.m26588i(string);
        }
    }
}
