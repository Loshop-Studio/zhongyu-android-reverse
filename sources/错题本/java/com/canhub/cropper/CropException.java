package com.canhub.cropper;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00060\u0001j\u0002`\u0002:\u0004\u0004\u0005\u0006\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m5110d2 = {"Lcom/canhub/cropper/CropException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Companion", "Cancellation", "FailedToLoadBitmap", "FailedToDecodeImage", "com/canhub/cropper/j", "Lcom/canhub/cropper/CropException$Cancellation;", "Lcom/canhub/cropper/CropException$FailedToDecodeImage;", "Lcom/canhub/cropper/CropException$FailedToLoadBitmap;", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public abstract class CropException extends Exception {

    @NotNull
    public static final C3439j Companion = new C3439j();

    @NotNull
    public static final String EXCEPTION_PREFIX = "crop:";
    private static final long serialVersionUID = 4933890872862969613L;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m5110d2 = {"Lcom/canhub/cropper/CropException$Cancellation;", "Lcom/canhub/cropper/CropException;", "<init>", "()V", "Companion", "com/canhub/cropper/i", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Cancellation extends CropException {

        @NotNull
        public static final C3438i Companion = new C3438i();
        private static final long serialVersionUID = -6896269134508601990L;

        public Cancellation() {
            super("crop: cropping has been cancelled by the user", null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m5110d2 = {"Lcom/canhub/cropper/CropException$FailedToDecodeImage;", "Lcom/canhub/cropper/CropException;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "Companion", "com/canhub/cropper/k", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class FailedToDecodeImage extends CropException {

        @NotNull
        public static final C3440k Companion = new C3440k();
        private static final long serialVersionUID = 3516154387706407275L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToDecodeImage(@NotNull Uri uri) {
            super("crop: Failed to decode image: " + uri, null);
            AbstractC5830k.m5330g(uri, "uri");
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m5110d2 = {"Lcom/canhub/cropper/CropException$FailedToLoadBitmap;", "Lcom/canhub/cropper/CropException;", "Landroid/net/Uri;", "uri", "", "message", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "Companion", "com/canhub/cropper/l", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class FailedToLoadBitmap extends CropException {

        @NotNull
        public static final C3441l Companion = new C3441l();
        private static final long serialVersionUID = 7791142932960927332L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToLoadBitmap(@NotNull Uri uri, @Nullable String str) {
            super("crop: Failed to load sampled bitmap: " + uri + "\r\n" + str, null);
            AbstractC5830k.m5330g(uri, "uri");
        }
    }

    public CropException(String str, AbstractC5824e abstractC5824e) {
        super(str);
    }
}
