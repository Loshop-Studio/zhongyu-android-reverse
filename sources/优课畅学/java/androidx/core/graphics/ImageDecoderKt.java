package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
public final class ImageDecoderKt {
    @RequiresApi(28)
    public static final Bitmap decodeBitmap(ImageDecoder.Source source, final InterfaceC10575q interfaceC10575q) {
        return ImageDecoder.decodeBitmap(source, AbstractC3393r.m1461a(new ImageDecoder$OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt.decodeBitmap.1
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                interfaceC10575q.invoke(imageDecoder, imageInfo, source2);
            }
        }));
    }

    @RequiresApi(28)
    public static final Drawable decodeDrawable(ImageDecoder.Source source, final InterfaceC10575q interfaceC10575q) {
        return ImageDecoder.decodeDrawable(source, AbstractC3393r.m1461a(new ImageDecoder$OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt.decodeDrawable.1
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                interfaceC10575q.invoke(imageDecoder, imageInfo, source2);
            }
        }));
    }
}
