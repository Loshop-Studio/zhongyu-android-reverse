package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import p181hd.InterfaceC9545q;

/* loaded from: classes2.dex */
public final class ImageDecoderKt {
    @RequiresApi(28)
    public static final Bitmap decodeBitmap(ImageDecoder.Source source, final InterfaceC9545q interfaceC9545q) {
        return ImageDecoder.decodeBitmap(source, AbstractC3423r.m1538a(new ImageDecoder$OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt.decodeBitmap.1
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                interfaceC9545q.invoke(imageDecoder, imageInfo, source2);
            }
        }));
    }

    @RequiresApi(28)
    public static final Drawable decodeDrawable(ImageDecoder.Source source, final InterfaceC9545q interfaceC9545q) {
        return ImageDecoder.decodeDrawable(source, AbstractC3423r.m1538a(new ImageDecoder$OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt.decodeDrawable.1
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                interfaceC9545q.invoke(imageDecoder, imageInfo, source2);
            }
        }));
    }
}
