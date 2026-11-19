package com.zykj.view.p037ui.crop;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blankj.utilcode.util.C3404x;
import com.canhub.cropper.C3450u;
import com.canhub.cropper.CropImageOptions;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.InterfaceC3451v;
import com.canhub.cropper.InterfaceC3455z;
import com.zykj.view.C5280R;
import com.zykj.view.databinding.ViewActivityEzyCropBinding;
import com.zykj.view.p037ui.crop.EzyCropActivity;
import com.zykj.view.utils.ImagePickerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m5110d2 = {"Lcom/zykj/view/ui/crop/EzyCropActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/canhub/cropper/z;", "Lcom/canhub/cropper/v;", "<init>", "()V", "Ld6/s;", "initClickListener", "initCropView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/canhub/cropper/CropImageView;", "view", "Landroid/net/Uri;", "uri", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "onSetImageUriComplete", "(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V", "Lcom/canhub/cropper/u;", "result", "onCropImageComplete", "(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/u;)V", "", "isSetImageCompleted", "Z", "Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;", "mBinding", "Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;", "Lcom/canhub/cropper/CropImageOptions;", "getCropImageOptions", "()Lcom/canhub/cropper/CropImageOptions;", "cropImageOptions", "getImageUri", "()Landroid/net/Uri;", "imageUri", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class EzyCropActivity extends AppCompatActivity implements InterfaceC3455z, InterfaceC3451v {
    private boolean isSetImageCompleted;
    private ViewActivityEzyCropBinding mBinding;

    private final CropImageOptions getCropImageOptions() {
        CropImageOptions cropImageOptions;
        Intent intent = getIntent();
        return (intent == null || (cropImageOptions = (CropImageOptions) intent.getParcelableExtra("CropImageOptions")) == null) ? new CropImageOptions(null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -1, -1, 63) : cropImageOptions;
    }

    private final Uri getImageUri() {
        Intent intent = getIntent();
        if (intent != null) {
            return (Uri) intent.getParcelableExtra("Uri");
        }
        return null;
    }

    private final void initClickListener() {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = this.mBinding;
        if (viewActivityEzyCropBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i = 0;
        viewActivityEzyCropBinding.confirmCrop.setOnClickListener(new View.OnClickListener(this) { // from class: h5.a

            /* renamed from: b */
            public final /* synthetic */ EzyCropActivity f8761b;

            {
                this.f8761b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        EzyCropActivity.initClickListener$lambda$1(this.f8761b, view);
                        break;
                    case 1:
                        EzyCropActivity.initClickListener$lambda$2(this.f8761b, view);
                        break;
                    default:
                        EzyCropActivity.initClickListener$lambda$3(this.f8761b, view);
                        break;
                }
            }
        });
        ViewActivityEzyCropBinding viewActivityEzyCropBinding2 = this.mBinding;
        if (viewActivityEzyCropBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i8 = 1;
        viewActivityEzyCropBinding2.cancel.setOnClickListener(new View.OnClickListener(this) { // from class: h5.a

            /* renamed from: b */
            public final /* synthetic */ EzyCropActivity f8761b;

            {
                this.f8761b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        EzyCropActivity.initClickListener$lambda$1(this.f8761b, view);
                        break;
                    case 1:
                        EzyCropActivity.initClickListener$lambda$2(this.f8761b, view);
                        break;
                    default:
                        EzyCropActivity.initClickListener$lambda$3(this.f8761b, view);
                        break;
                }
            }
        });
        ViewActivityEzyCropBinding viewActivityEzyCropBinding3 = this.mBinding;
        if (viewActivityEzyCropBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i9 = 2;
        viewActivityEzyCropBinding3.rotate.setOnClickListener(new View.OnClickListener(this) { // from class: h5.a

            /* renamed from: b */
            public final /* synthetic */ EzyCropActivity f8761b;

            {
                this.f8761b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        EzyCropActivity.initClickListener$lambda$1(this.f8761b, view);
                        break;
                    case 1:
                        EzyCropActivity.initClickListener$lambda$2(this.f8761b, view);
                        break;
                    default:
                        EzyCropActivity.initClickListener$lambda$3(this.f8761b, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$1(EzyCropActivity ezyCropActivity, View view) {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = ezyCropActivity.mBinding;
        if (viewActivityEzyCropBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        CropImageView cropImageView = viewActivityEzyCropBinding.cropImageView;
        if (!ezyCropActivity.isSetImageCompleted) {
            C3404x.m2356a("图片尚未加载完成", new Object[0]);
            return;
        }
        Uri randomUri = ImagePickerKt.getRandomUri();
        int i = CropImageView.f2441N;
        cropImageView.m2438c(Bitmap.CompressFormat.JPEG, 90, 0, 0, CropImageView.RequestSizeOptions.RESIZE_INSIDE, randomUri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$2(EzyCropActivity ezyCropActivity, View view) {
        ezyCropActivity.setResult(0);
        ezyCropActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$3(EzyCropActivity ezyCropActivity, View view) {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = ezyCropActivity.mBinding;
        if (viewActivityEzyCropBinding != null) {
            viewActivityEzyCropBinding.cropImageView.m2441f(-90);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    private final void initCropView() {
        this.isSetImageCompleted = false;
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = this.mBinding;
        if (viewActivityEzyCropBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        CropImageView cropImageView = viewActivityEzyCropBinding.cropImageView;
        cropImageView.setImageCropOptions(getCropImageOptions());
        cropImageView.setOnSetImageUriCompleteListener(this);
        cropImageView.setOnCropImageCompleteListener(this);
        cropImageView.setImageUriAsync(getImageUri());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, C5280R.layout.view_activity_ezy_crop);
        AbstractC5830k.m5329f(contentView, "setContentView(...)");
        this.mBinding = (ViewActivityEzyCropBinding) contentView;
        initClickListener();
        initCropView();
    }

    @Override // com.canhub.cropper.InterfaceC3451v
    public void onCropImageComplete(@NotNull CropImageView view, @NotNull C3450u result) {
        AbstractC5830k.m5330g(view, "view");
        AbstractC5830k.m5330g(result, "result");
        Intent intent = new Intent();
        intent.putExtra("ResultUri", result.f2631b);
        setResult(-1, intent);
        finish();
    }

    @Override // com.canhub.cropper.InterfaceC3455z
    public void onSetImageUriComplete(@NotNull CropImageView view, @NotNull Uri uri, @Nullable Exception error) {
        AbstractC5830k.m5330g(view, "view");
        AbstractC5830k.m5330g(uri, "uri");
        if (error == null) {
            this.isSetImageCompleted = true;
        } else {
            C3404x.m2356a("图片加载失败", new Object[0]);
        }
    }
}
