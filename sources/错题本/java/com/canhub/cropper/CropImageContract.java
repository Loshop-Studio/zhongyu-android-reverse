package com.canhub.cropper;

import android.content.Context;
import android.content.Intent;
import android.view.result.contract.ActivityResultContract;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;

@Deprecated(message = "\n  This ActivityResultContract is deprecated.\n  Please either roll your own ActivityResultContract with the desired behavior or copy paste this.\n")
@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/canhub/cropper/CropImageContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Lcom/canhub/cropper/u;", "<init>", "()V", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCropImageContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageContract.kt\ncom/canhub/cropper/CropImageContract\n+ 2 ParcelableUtils.kt\ncom/canhub/cropper/ParcelableUtilsKt\n*L\n1#1,46:1\n13#2,5:47\n*S KotlinDebug\n*F\n+ 1 CropImageContract.kt\ncom/canhub/cropper/CropImageContract\n*L\n37#1:47,5\n*E\n"})
/* loaded from: classes2.dex */
public final class CropImageContract extends ActivityResultContract<Object, C3450u> {
    @Override // android.view.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(null, "input");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.os.Parcelable] */
    @Override // android.view.result.contract.ActivityResultContract
    public final C3450u parseResult(int i, Intent intent) {
        if (intent != null) {
            ?? parcelableExtra = intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
            cropImage$ActivityResult = parcelableExtra instanceof CropImage$ActivityResult ? parcelableExtra : null;
        }
        return (cropImage$ActivityResult == null || i == 0) ? C3442m.f2610i : cropImage$ActivityResult;
    }
}
