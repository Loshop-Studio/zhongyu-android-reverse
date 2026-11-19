package androidx.camera.core;

import com.google.auto.value.AutoValue;

/* loaded from: classes.dex */
final class ImageReaderFormatRecommender {

    @AutoValue
    public static abstract class FormatCombo {
        public static FormatCombo create(int i9, int i10) {
            return new AutoValue_ImageReaderFormatRecommender_FormatCombo(i9, i10);
        }

        public abstract int imageAnalysisFormat();

        public abstract int imageCaptureFormat();
    }

    private ImageReaderFormatRecommender() {
    }

    public static FormatCombo chooseCombo() {
        return FormatCombo.create(256, 35);
    }
}
