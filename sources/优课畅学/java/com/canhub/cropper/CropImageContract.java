package com.canhub.cropper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import com.blankj.utilcode.util.AbstractC5379p;
import com.canhub.cropper.CropImageView;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p138j0.AbstractC8986h;

@InterfaceC8721a
/* loaded from: classes3.dex */
public final class CropImageContract extends ActivityResultContract<AbstractC8986h, CropImageView.C5472b> {
    /* renamed from: a */
    public Intent m3271a(Context context, AbstractC8986h input) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(input, "input");
        new Intent(context, (Class<?>) CropImageActivity.class);
        new Bundle(2);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.os.Parcelable] */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CropImageView.C5472b parseResult(int i10, Intent intent) {
        if (intent != null) {
            ?? parcelableExtra = intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
            cropImage$ActivityResult = parcelableExtra instanceof CropImage$ActivityResult ? parcelableExtra : null;
        }
        return (cropImage$ActivityResult == null || i10 == 0) ? C5485b.f3607k : cropImage$ActivityResult;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public /* bridge */ /* synthetic */ Intent createIntent(Context context, AbstractC8986h abstractC8986h) {
        AbstractC5379p.m2596a(abstractC8986h);
        return m3271a(context, null);
    }
}
