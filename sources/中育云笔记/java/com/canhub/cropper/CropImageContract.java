package com.canhub.cropper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import com.canhub.cropper.CropImageView;
import kotlin.jvm.internal.AbstractC9979u;
import p140f1.AbstractC9156h;
import p212k.AbstractC9764r;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* loaded from: classes3.dex */
public final class CropImageContract extends ActivityResultContract<AbstractC9156h, CropImageView.C5891b> {
    /* renamed from: a */
    public Intent m4472a(Context context, AbstractC9156h input) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(input, "input");
        new Intent(context, (Class<?>) CropImageActivity.class);
        new Bundle(2);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.os.Parcelable] */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CropImageView.C5891b parseResult(int i10, Intent intent) {
        if (intent != null) {
            ?? parcelableExtra = intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
            cropImage$ActivityResult = parcelableExtra instanceof CropImage$ActivityResult ? parcelableExtra : null;
        }
        return (cropImage$ActivityResult == null || i10 == 0) ? C5904b.f5377m : cropImage$ActivityResult;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public /* bridge */ /* synthetic */ Intent createIntent(Context context, AbstractC9156h abstractC9156h) {
        AbstractC9764r.m19682a(abstractC9156h);
        return m4472a(context, null);
    }
}
