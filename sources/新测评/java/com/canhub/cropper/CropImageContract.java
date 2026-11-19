package com.canhub.cropper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import com.canhub.cropper.CropImageView;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p137k.AbstractC7846r;
import p139k1.AbstractC7862h;

@Deprecated(message = "\n  This ActivityResultContract is deprecated.\n  Please either roll your own ActivityResultContract with the desired behavior or copy paste this.\n")
@Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m13558d2 = {"Lcom/canhub/cropper/CropImageContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lk1/h;", "Lcom/canhub/cropper/CropImageView$b;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lk1/h;)Landroid/content/Intent;", "", "resultCode", "intent", "b", "(ILandroid/content/Intent;)Lcom/canhub/cropper/CropImageView$b;", "cropper_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCropImageContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageContract.kt\ncom/canhub/cropper/CropImageContract\n+ 2 ParcelableUtils.kt\ncom/canhub/cropper/ParcelableUtilsKt\n*L\n1#1,46:1\n13#2,5:47\n*S KotlinDebug\n*F\n+ 1 CropImageContract.kt\ncom/canhub/cropper/CropImageContract\n*L\n37#1:47,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CropImageContract extends ActivityResultContract<AbstractC7862h, CropImageView.C5423b> {
    /* renamed from: a */
    public Intent m3827a(Context context, AbstractC7862h input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        new Intent(context, (Class<?>) CropImageActivity.class);
        new Bundle(2);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.os.Parcelable] */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CropImageView.C5423b parseResult(int resultCode, Intent intent) {
        if (intent != null) {
            ?? parcelableExtra = intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
            cropImage$ActivityResult = parcelableExtra instanceof CropImage$ActivityResult ? parcelableExtra : null;
        }
        return (cropImage$ActivityResult == null || resultCode == 0) ? C5436b.f4174k : cropImage$ActivityResult;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public /* bridge */ /* synthetic */ Intent createIntent(Context context, AbstractC7862h abstractC7862h) {
        AbstractC7846r.m13306a(abstractC7862h);
        return m3827a(context, null);
    }
}
