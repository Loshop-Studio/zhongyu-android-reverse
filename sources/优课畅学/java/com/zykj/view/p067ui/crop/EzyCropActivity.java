package com.zykj.view.p067ui.crop;

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
import com.zykj.view.p067ui.crop.EzyCropActivity;
import kotlin.jvm.internal.AbstractC9133u;
import p007a6.AbstractC0039m;
import p123h7.C8736p;

/* loaded from: classes5.dex */
public final class EzyCropActivity extends AppCompatActivity implements CropImageView.InterfaceC5477g, CropImageView.InterfaceC5473c {

    /* renamed from: a */
    public boolean f15555a;

    /* renamed from: b */
    public ViewActivityEzyCropBinding f15556b;

    /* renamed from: s */
    public static final void m13314s(EzyCropActivity ezyCropActivity, View view) {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = ezyCropActivity.f15556b;
        if (viewActivityEzyCropBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewActivityEzyCropBinding = null;
        }
        CropImageView cropImageView = viewActivityEzyCropBinding.f15311c;
        if (ezyCropActivity.f15555a) {
            CropImageView.m3275e(cropImageView, null, 0, 0, 0, null, AbstractC0039m.m96a(), 31, null);
        } else {
            ToastUtils.m2403s("图片尚未加载完成", new Object[0]);
        }
    }

    /* renamed from: t */
    public static final void m13315t(EzyCropActivity ezyCropActivity, View view) {
        ezyCropActivity.setResult(0);
        ezyCropActivity.finish();
    }

    /* renamed from: u */
    public static final void m13316u(EzyCropActivity ezyCropActivity, View view) {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = ezyCropActivity.f15556b;
        if (viewActivityEzyCropBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewActivityEzyCropBinding = null;
        }
        viewActivityEzyCropBinding.f15311c.m3288n(-90);
    }

    @Override // com.canhub.cropper.CropImageView.InterfaceC5473c
    /* renamed from: a */
    public void mo3259a(CropImageView view, CropImageView.C5472b result) {
        AbstractC9133u.m16133g(view, "view");
        AbstractC9133u.m16133g(result, "result");
        Intent intent = new Intent();
        intent.putExtra("ResultUri", result.m3306j());
        C8736p c8736p = C8736p.f16368a;
        setResult(-1, intent);
        finish();
    }

    @Override // com.canhub.cropper.CropImageView.InterfaceC5477g
    /* renamed from: b */
    public void mo3260b(CropImageView view, Uri uri, Exception exc) {
        AbstractC9133u.m16133g(view, "view");
        AbstractC9133u.m16133g(uri, "uri");
        if (exc == null) {
            this.f15555a = true;
        } else {
            ToastUtils.m2403s("图片加载失败", new Object[0]);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R$layout.view_activity_ezy_crop);
        AbstractC9133u.m16132f(contentView, "setContentView(...)");
        this.f15556b = (ViewActivityEzyCropBinding) contentView;
        m13319r();
        m13320v();
    }

    /* renamed from: p */
    public final CropImageOptions m13317p() {
        CropImageOptions cropImageOptions;
        Intent intent = getIntent();
        return (intent == null || (cropImageOptions = (CropImageOptions) intent.getParcelableExtra("CropImageOptions")) == null) ? new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 63, null) : cropImageOptions;
    }

    /* renamed from: q */
    public final Uri m13318q() {
        Intent intent = getIntent();
        if (intent != null) {
            return (Uri) intent.getParcelableExtra("Uri");
        }
        return null;
    }

    /* renamed from: r */
    public final void m13319r() {
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = this.f15556b;
        ViewActivityEzyCropBinding viewActivityEzyCropBinding2 = null;
        if (viewActivityEzyCropBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewActivityEzyCropBinding = null;
        }
        viewActivityEzyCropBinding.f15310b.setOnClickListener(new View.OnClickListener() { // from class: z5.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EzyCropActivity.m13314s(this.f21263a, view);
            }
        });
        ViewActivityEzyCropBinding viewActivityEzyCropBinding3 = this.f15556b;
        if (viewActivityEzyCropBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewActivityEzyCropBinding3 = null;
        }
        viewActivityEzyCropBinding3.f15309a.setOnClickListener(new View.OnClickListener() { // from class: z5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EzyCropActivity.m13315t(this.f21264a, view);
            }
        });
        ViewActivityEzyCropBinding viewActivityEzyCropBinding4 = this.f15556b;
        if (viewActivityEzyCropBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewActivityEzyCropBinding2 = viewActivityEzyCropBinding4;
        }
        viewActivityEzyCropBinding2.f15313e.setOnClickListener(new View.OnClickListener() { // from class: z5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EzyCropActivity.m13316u(this.f21265a, view);
            }
        });
    }

    /* renamed from: v */
    public final void m13320v() {
        this.f15555a = false;
        ViewActivityEzyCropBinding viewActivityEzyCropBinding = this.f15556b;
        if (viewActivityEzyCropBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewActivityEzyCropBinding = null;
        }
        CropImageView cropImageView = viewActivityEzyCropBinding.f15311c;
        cropImageView.setImageCropOptions(m13317p());
        cropImageView.setOnSetImageUriCompleteListener(this);
        cropImageView.setOnCropImageCompleteListener(this);
        cropImageView.setImageUriAsync(m13318q());
    }
}
