package com.zykj.view.p059ui.crop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blankj.utilcode.util.ToastUtils;
import com.canhub.cropper.CropImageOptions;
import com.canhub.cropper.CropImageView;
import com.zykj.view.R$layout;
import com.zykj.view.databinding.ViewActivityEzyCropBinding;
import com.zykj.view.p059ui.crop.EzyCropActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p027b8.AbstractC5061r;

@Metadata(m13557d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0005R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m13558d2 = {"Lcom/zykj/view/ui/crop/EzyCropActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/canhub/cropper/CropImageView$g;", "Lcom/canhub/cropper/CropImageView$c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/canhub/cropper/CropImageView;", "view", "Landroid/net/Uri;", "uri", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "b", "(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V", "Lcom/canhub/cropper/CropImageView$b;", "result", "a", "(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/CropImageView$b;)V", "r", "v", "", "Z", "isSetImageCompleted", "Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;", "Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;", "mBinding", "Lcom/canhub/cropper/CropImageOptions;", "p", "()Lcom/canhub/cropper/CropImageOptions;", "cropImageOptions", "q", "()Landroid/net/Uri;", "imageUri", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class EzyCropActivity extends AppCompatActivity implements CropImageView.InterfaceC5428g, CropImageView.InterfaceC5424c {

    /* renamed from: a, reason: from kotlin metadata */
    public boolean isSetImageCompleted;

    /* renamed from: b, reason: from kotlin metadata */
    public ViewActivityEzyCropBinding mBinding;

    /* renamed from: s */
    public static final void m11458s(EzyCropActivity ezyCropActivity, View view) {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = ezyCropActivity.mBinding;
        if (viewActivityEzyCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewActivityEzyCropBinding = null;
        }
        CropImageView cropImageView = viewActivityEzyCropBinding.f11313c;
        if (ezyCropActivity.isSetImageCompleted) {
            CropImageView.m3831e(cropImageView, null, 0, 0, 0, null, AbstractC5061r.m2569a(), 31, null);
        } else {
            ToastUtils.showShort("图片尚未加载完成", new Object[0]);
        }
    }

    /* renamed from: t */
    public static final void m11459t(EzyCropActivity ezyCropActivity, View view) {
        ezyCropActivity.setResult(0);
        ezyCropActivity.finish();
    }

    /* renamed from: u */
    public static final void m11460u(EzyCropActivity ezyCropActivity, View view) {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = ezyCropActivity.mBinding;
        if (viewActivityEzyCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewActivityEzyCropBinding = null;
        }
        viewActivityEzyCropBinding.f11313c.m3844n(-90);
    }

    @Override // com.canhub.cropper.CropImageView.InterfaceC5424c
    /* renamed from: a */
    public void mo3815a(CropImageView view, CropImageView.C5423b result) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(result, "result");
        Intent intent = new Intent();
        intent.putExtra("ResultUri", result.m3862h());
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    @Override // com.canhub.cropper.CropImageView.InterfaceC5428g
    /* renamed from: b */
    public void mo3816b(CropImageView view, Uri uri, Exception error) {
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
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R$layout.view_activity_ezy_crop);
        Intrinsics.checkNotNullExpressionValue(contentView, "setContentView(...)");
        this.mBinding = (ViewActivityEzyCropBinding) contentView;
        m11463r();
        m11464v();
    }

    /* renamed from: p */
    public final CropImageOptions m11461p() {
        CropImageOptions cropImageOptions;
        Intent intent = getIntent();
        return (intent == null || (cropImageOptions = (CropImageOptions) intent.getParcelableExtra("CropImageOptions")) == null) ? new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 63, null) : cropImageOptions;
    }

    /* renamed from: q */
    public final Uri m11462q() {
        Intent intent = getIntent();
        if (intent != null) {
            return (Uri) intent.getParcelableExtra("Uri");
        }
        return null;
    }

    /* renamed from: r */
    public final void m11463r() {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = this.mBinding;
        ViewActivityEzyCropBinding viewActivityEzyCropBinding2 = null;
        if (viewActivityEzyCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewActivityEzyCropBinding = null;
        }
        viewActivityEzyCropBinding.f11312b.setOnClickListener(new View.OnClickListener() { // from class: a8.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EzyCropActivity.m11458s(this.f78a, view);
            }
        });
        ViewActivityEzyCropBinding viewActivityEzyCropBinding3 = this.mBinding;
        if (viewActivityEzyCropBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewActivityEzyCropBinding3 = null;
        }
        viewActivityEzyCropBinding3.f11311a.setOnClickListener(new View.OnClickListener() { // from class: a8.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EzyCropActivity.m11459t(this.f79a, view);
            }
        });
        ViewActivityEzyCropBinding viewActivityEzyCropBinding4 = this.mBinding;
        if (viewActivityEzyCropBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewActivityEzyCropBinding2 = viewActivityEzyCropBinding4;
        }
        viewActivityEzyCropBinding2.f11315e.setOnClickListener(new View.OnClickListener() { // from class: a8.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EzyCropActivity.m11460u(this.f80a, view);
            }
        });
    }

    /* renamed from: v */
    public final void m11464v() {
        this.isSetImageCompleted = false;
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = this.mBinding;
        if (viewActivityEzyCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewActivityEzyCropBinding = null;
        }
        CropImageView cropImageView = viewActivityEzyCropBinding.f11313c;
        cropImageView.setImageCropOptions(m11461p());
        cropImageView.setOnSetImageUriCompleteListener(this);
        cropImageView.setOnCropImageCompleteListener(this);
        cropImageView.setImageUriAsync(m11462q());
    }
}
