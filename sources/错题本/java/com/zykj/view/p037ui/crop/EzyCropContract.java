package com.zykj.view.p037ui.crop;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.result.contract.ActivityResultContract;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.canhub.cropper.CropImageOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m5110d2 = {"Lcom/zykj/view/ui/crop/EzyCropContract;", "", "<init>", "()V", "CropRequestOptions", "StartCropForResult", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class EzyCropContract {

    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m5110d2 = {"Lcom/zykj/view/ui/crop/EzyCropContract$CropRequestOptions;", "", "uri", "Landroid/net/Uri;", "cropImageOptions", "Lcom/canhub/cropper/CropImageOptions;", "<init>", "(Landroid/net/Uri;Lcom/canhub/cropper/CropImageOptions;)V", "getUri", "()Landroid/net/Uri;", "getCropImageOptions", "()Lcom/canhub/cropper/CropImageOptions;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class CropRequestOptions {

        @NotNull
        private final CropImageOptions cropImageOptions;

        @NotNull
        private final Uri uri;

        public CropRequestOptions(@NotNull Uri uri, @NotNull CropImageOptions cropImageOptions) {
            AbstractC5830k.m5330g(uri, "uri");
            AbstractC5830k.m5330g(cropImageOptions, "cropImageOptions");
            this.uri = uri;
            this.cropImageOptions = cropImageOptions;
        }

        public static /* synthetic */ CropRequestOptions copy$default(CropRequestOptions cropRequestOptions, Uri uri, CropImageOptions cropImageOptions, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = cropRequestOptions.uri;
            }
            if ((i & 2) != 0) {
                cropImageOptions = cropRequestOptions.cropImageOptions;
            }
            return cropRequestOptions.copy(uri, cropImageOptions);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CropImageOptions getCropImageOptions() {
            return this.cropImageOptions;
        }

        @NotNull
        public final CropRequestOptions copy(@NotNull Uri uri, @NotNull CropImageOptions cropImageOptions) {
            AbstractC5830k.m5330g(uri, "uri");
            AbstractC5830k.m5330g(cropImageOptions, "cropImageOptions");
            return new CropRequestOptions(uri, cropImageOptions);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CropRequestOptions)) {
                return false;
            }
            CropRequestOptions cropRequestOptions = (CropRequestOptions) other;
            return AbstractC5830k.m5325b(this.uri, cropRequestOptions.uri) && AbstractC5830k.m5325b(this.cropImageOptions, cropRequestOptions.cropImageOptions);
        }

        @NotNull
        public final CropImageOptions getCropImageOptions() {
            return this.cropImageOptions;
        }

        @NotNull
        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.cropImageOptions.hashCode() + (this.uri.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CropRequestOptions(uri=" + this.uri + ", cropImageOptions=" + this.cropImageOptions + ")";
        }
    }

    @Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, m5110d2 = {"Lcom/zykj/view/ui/crop/EzyCropContract$StartCropForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/zykj/view/ui/crop/EzyCropContract$CropRequestOptions;", "Landroid/net/Uri;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class StartCropForResult extends ActivityResultContract<CropRequestOptions, Uri> {
        @Override // android.view.result.contract.ActivityResultContract
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull CropRequestOptions input) {
            AbstractC5830k.m5330g(context, "context");
            AbstractC5830k.m5330g(input, "input");
            Intent intent = new Intent(context, (Class<?>) EzyCropActivity.class);
            intent.putExtra("Uri", input.getUri());
            intent.putExtra("CropImageOptions", input.getCropImageOptions());
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.view.result.contract.ActivityResultContract
        @Nullable
        public Uri parseResult(int resultCode, @Nullable Intent intent) {
            if (resultCode == -1 && intent != null) {
                return (Uri) intent.getParcelableExtra("ResultUri");
            }
            return null;
        }
    }
}
