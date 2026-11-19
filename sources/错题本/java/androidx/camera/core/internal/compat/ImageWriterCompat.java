package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.support.v4.media.AbstractC0037f;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.selection.SingleSelectionLayout;

@RequiresApi(23)
/* loaded from: classes.dex */
public final class ImageWriterCompat {
    private ImageWriterCompat() {
    }

    public static void close(@NonNull ImageWriter imageWriter) {
        ImageWriterCompatApi23Impl.close(imageWriter);
    }

    @NonNull
    public static Image dequeueInputImage(@NonNull ImageWriter imageWriter) {
        return ImageWriterCompatApi23Impl.dequeueInputImage(imageWriter);
    }

    @NonNull
    public static ImageWriter newInstance(@NonNull Surface surface, @IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID) int i, int i8) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            return ImageWriterCompatApi29Impl.newInstance(surface, i, i8);
        }
        if (i9 >= 26) {
            return ImageWriterCompatApi26Impl.newInstance(surface, i, i8);
        }
        throw new RuntimeException(AbstractC0037f.m82g(i9, "Unable to call newInstance(Surface, int, int) on API ", ". Version 26 or higher required."));
    }

    public static void queueInputImage(@NonNull ImageWriter imageWriter, @NonNull Image image) {
        ImageWriterCompatApi23Impl.queueInputImage(imageWriter, image);
    }

    @NonNull
    public static ImageWriter newInstance(@NonNull Surface surface, @IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID) int i) {
        return ImageWriterCompatApi23Impl.newInstance(surface, i);
    }
}
