package com.zykj.view.p077ui.crop;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blankj.utilcode.util.ToastUtils;
import com.canhub.cropper.CropImageOptions;
import com.canhub.cropper.CropImageView;
import com.zykj.view.R$layout;
import com.zykj.view.databinding.ViewActivityEzyCropBinding;
import com.zykj.view.p077ui.crop.EzyCropActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p181m7.AbstractC9038o;

@Metadata(m13412d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0005R\u0016\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, m13413d2 = {"Lcom/zykj/view/ui/crop/EzyCropActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/canhub/cropper/CropImageView$g;", "Lcom/canhub/cropper/CropImageView$c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "Lcom/canhub/cropper/CropImageView;", "view", "Landroid/net/Uri;", "uri", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "b", "(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V", "Lcom/canhub/cropper/CropImageView$b;", "result", "a", "(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/CropImageView$b;)V", "x", "s", "w", "Z", "isSetImageCompleted", "Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;", "Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;", "mBinding", "Lcom/canhub/cropper/CropImageOptions;", "p", "()Lcom/canhub/cropper/CropImageOptions;", "cropImageOptions", "q", "()Landroid/net/Uri;", "imageUri", "r", "()Z", "lightTheme", "c", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class EzyCropActivity extends AppCompatActivity implements CropImageView.InterfaceC5533g, CropImageView.InterfaceC5529c {

    /* renamed from: a, reason: from kotlin metadata */
    public boolean isSetImageCompleted;

    /* renamed from: b, reason: from kotlin metadata */
    public ViewActivityEzyCropBinding mBinding;

    /* renamed from: t */
    public static final void m12013t(EzyCropActivity ezyCropActivity, View view) {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = ezyCropActivity.mBinding;
        if (viewActivityEzyCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewActivityEzyCropBinding = null;
        }
        CropImageView cropImageView = viewActivityEzyCropBinding.f12552e;
        if (ezyCropActivity.isSetImageCompleted) {
            CropImageView.m3457e(cropImageView, null, 0, 0, 0, null, AbstractC9038o.m14425a(), 31, null);
        } else {
            ToastUtils.showShort("图片尚未加载完成", new Object[0]);
        }
    }

    /* renamed from: u */
    public static final void m12014u(EzyCropActivity ezyCropActivity, View view) {
        ezyCropActivity.setResult(0);
        ezyCropActivity.finish();
    }

    /* renamed from: v */
    public static final void m12015v(EzyCropActivity ezyCropActivity, View view) {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = ezyCropActivity.mBinding;
        if (viewActivityEzyCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewActivityEzyCropBinding = null;
        }
        viewActivityEzyCropBinding.f12552e.m3470n(-90);
    }

    @Override // com.canhub.cropper.CropImageView.InterfaceC5529c
    /* renamed from: a */
    public void mo3441a(CropImageView view, CropImageView.C5528b result) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(result, "result");
        Intent intent = new Intent();
        intent.putExtra("ResultUri", result.m3488h());
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    @Override // com.canhub.cropper.CropImageView.InterfaceC5533g
    /* renamed from: b */
    public void mo3442b(CropImageView view, Uri uri, Exception error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (error == null) {
            this.isSetImageCompleted = true;
        } else {
            ToastUtils.showShort("图片加载失败", new Object[0]);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m12021x();
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R$layout.view_activity_ezy_crop);
        Intrinsics.checkNotNullExpressionValue(contentView, "setContentView(...)");
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = (ViewActivityEzyCropBinding) contentView;
        this.mBinding = viewActivityEzyCropBinding;
        if (viewActivityEzyCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewActivityEzyCropBinding = null;
        }
        viewActivityEzyCropBinding.mo11875a(m12018r());
        m12019s();
        m12020w();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            m12021x();
        }
    }

    /* renamed from: p */
    public final CropImageOptions m12016p() {
        CropImageOptions cropImageOptions;
        Intent intent = getIntent();
        return (intent == null || (cropImageOptions = (CropImageOptions) intent.getParcelableExtra("CropImageOptions")) == null) ? new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 63, null) : cropImageOptions;
    }

    /* renamed from: q */
    public final Uri m12017q() {
        Intent intent = getIntent();
        if (intent != null) {
            return (Uri) intent.getParcelableExtra("Uri");
        }
        return null;
    }

    /* renamed from: r */
    public final boolean m12018r() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("EzyCropLightTheme", false);
        }
        return false;
    }

    /* renamed from: s */
    public final void m12019s() {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = this.mBinding;
        ViewActivityEzyCropBinding viewActivityEzyCropBinding2 = null;
        if (viewActivityEzyCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewActivityEzyCropBinding = null;
        }
        viewActivityEzyCropBinding.f12549b.setOnClickListener(new View.OnClickListener() { // from class: l7.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EzyCropActivity.m12013t(this.f14705a, view);
            }
        });
        ViewActivityEzyCropBinding viewActivityEzyCropBinding3 = this.mBinding;
        if (viewActivityEzyCropBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewActivityEzyCropBinding3 = null;
        }
        viewActivityEzyCropBinding3.f12548a.setOnClickListener(new View.OnClickListener() { // from class: l7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EzyCropActivity.m12014u(this.f14706a, view);
            }
        });
        ViewActivityEzyCropBinding viewActivityEzyCropBinding4 = this.mBinding;
        if (viewActivityEzyCropBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewActivityEzyCropBinding2 = viewActivityEzyCropBinding4;
        }
        viewActivityEzyCropBinding2.f12554g.setOnClickListener(new View.OnClickListener() { // from class: l7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EzyCropActivity.m12015v(this.f14707a, view);
            }
        });
    }

    /* renamed from: w */
    public final void m12020w() {
        this.isSetImageCompleted = false;
        float f10 = getResources().getDisplayMetrics().density;
        m12016p().guidelines = CropImageView.Guidelines.f3856a;
        m12016p().borderLineThickness = f10;
        m12016p().borderCornerThickness = f10;
        m12016p().backgroundColor = m12018r() ? Color.argb(119, 255, 255, 255) : Color.argb(119, 0, 0, 0);
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = this.mBinding;
        if (viewActivityEzyCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewActivityEzyCropBinding = null;
        }
        CropImageView cropImageView = viewActivityEzyCropBinding.f12552e;
        cropImageView.setImageCropOptions(m12016p());
        cropImageView.setOnSetImageUriCompleteListener(this);
        cropImageView.setOnCropImageCompleteListener(this);
        cropImageView.setImageUriAsync(m12017q());
    }

    /* renamed from: x */
    public final void m12021x() {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), true);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(m12018r());
        insetsController.setAppearanceLightNavigationBars(m12018r());
        insetsController.show(WindowInsetsCompat.Type.systemBars());
    }
}
