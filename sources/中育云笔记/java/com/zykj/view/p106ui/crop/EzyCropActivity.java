package com.zykj.view.p106ui.crop;

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
import com.zykj.view.p106ui.crop.EzyCropActivity;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p378vb.AbstractC11583m;

/* loaded from: classes6.dex */
public final class EzyCropActivity extends AppCompatActivity implements CropImageView.InterfaceC5896g, CropImageView.InterfaceC5892c {

    /* renamed from: c */
    public boolean f20769c;

    /* renamed from: d */
    public ViewActivityEzyCropBinding f20770d;

    /* renamed from: P */
    public static final void m17389P(EzyCropActivity ezyCropActivity, View view) {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = ezyCropActivity.f20770d;
        if (viewActivityEzyCropBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewActivityEzyCropBinding = null;
        }
        CropImageView cropImageView = viewActivityEzyCropBinding.f20522e;
        if (ezyCropActivity.f20769c) {
            CropImageView.m4476e(cropImageView, null, 0, 0, 0, null, AbstractC11583m.m25503a(), 31, null);
        } else {
            ToastUtils.showShort("图片尚未加载完成", new Object[0]);
        }
    }

    /* renamed from: Q */
    public static final void m17390Q(EzyCropActivity ezyCropActivity, View view) {
        ezyCropActivity.setResult(0);
        ezyCropActivity.finish();
    }

    /* renamed from: R */
    public static final void m17391R(EzyCropActivity ezyCropActivity, View view) {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = ezyCropActivity.f20770d;
        if (viewActivityEzyCropBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewActivityEzyCropBinding = null;
        }
        viewActivityEzyCropBinding.f20522e.m4489n(-90);
    }

    /* renamed from: M */
    public final CropImageOptions m17392M() {
        CropImageOptions cropImageOptions;
        Intent intent = getIntent();
        return (intent == null || (cropImageOptions = (CropImageOptions) intent.getParcelableExtra("CropImageOptions")) == null) ? new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 63, null) : cropImageOptions;
    }

    /* renamed from: N */
    public final Uri m17393N() {
        Intent intent = getIntent();
        if (intent != null) {
            return (Uri) intent.getParcelableExtra("Uri");
        }
        return null;
    }

    /* renamed from: O */
    public final void m17394O() {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = this.f20770d;
        ViewActivityEzyCropBinding viewActivityEzyCropBinding2 = null;
        if (viewActivityEzyCropBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewActivityEzyCropBinding = null;
        }
        viewActivityEzyCropBinding.f20521d.setOnClickListener(new View.OnClickListener() { // from class: ub.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EzyCropActivity.m17389P(this.f27201c, view);
            }
        });
        ViewActivityEzyCropBinding viewActivityEzyCropBinding3 = this.f20770d;
        if (viewActivityEzyCropBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewActivityEzyCropBinding3 = null;
        }
        viewActivityEzyCropBinding3.f20520c.setOnClickListener(new View.OnClickListener() { // from class: ub.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EzyCropActivity.m17390Q(this.f27202c, view);
            }
        });
        ViewActivityEzyCropBinding viewActivityEzyCropBinding4 = this.f20770d;
        if (viewActivityEzyCropBinding4 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewActivityEzyCropBinding2 = viewActivityEzyCropBinding4;
        }
        viewActivityEzyCropBinding2.f20524g.setOnClickListener(new View.OnClickListener() { // from class: ub.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EzyCropActivity.m17391R(this.f27203c, view);
            }
        });
    }

    /* renamed from: S */
    public final void m17395S() {
        this.f20769c = false;
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = this.f20770d;
        if (viewActivityEzyCropBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewActivityEzyCropBinding = null;
        }
        CropImageView cropImageView = viewActivityEzyCropBinding.f20522e;
        cropImageView.setImageCropOptions(m17392M());
        cropImageView.setOnSetImageUriCompleteListener(this);
        cropImageView.setOnCropImageCompleteListener(this);
        cropImageView.setImageUriAsync(m17393N());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R$layout.view_activity_ezy_crop);
        AbstractC9979u.m20293f(contentView, "setContentView(...)");
        this.f20770d = (ViewActivityEzyCropBinding) contentView;
        m17394O();
        m17395S();
    }

    @Override // com.canhub.cropper.CropImageView.InterfaceC5892c
    /* renamed from: q */
    public void mo4467q(CropImageView view, CropImageView.C5891b result) {
        AbstractC9979u.m20294g(view, "view");
        AbstractC9979u.m20294g(result, "result");
        Intent intent = new Intent();
        intent.putExtra("ResultUri", result.m4508j());
        C10786q c10786q = C10786q.f26013a;
        setResult(-1, intent);
        finish();
    }

    @Override // com.canhub.cropper.CropImageView.InterfaceC5896g
    /* renamed from: v */
    public void mo2667v(CropImageView view, Uri uri, Exception exc) {
        AbstractC9979u.m20294g(view, "view");
        AbstractC9979u.m20294g(uri, "uri");
        if (exc == null) {
            this.f20769c = true;
        } else {
            ToastUtils.showShort("图片加载失败", new Object[0]);
        }
    }
}
