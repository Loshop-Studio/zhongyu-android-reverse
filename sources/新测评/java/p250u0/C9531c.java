package p250u0;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C5401a;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import p162m0.C8538c;
import p162m0.C8539d;
import p261v0.C9647t;

/* renamed from: u0.c */
/* loaded from: classes3.dex */
public final class C9531c implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a */
    public final C9647t f16633a = C9647t.m16016b();

    /* renamed from: b */
    public final int f16634b;

    /* renamed from: c */
    public final int f16635c;

    /* renamed from: d */
    public final DecodeFormat f16636d;

    /* renamed from: e */
    public final DownsampleStrategy f16637e;

    /* renamed from: f */
    public final boolean f16638f;

    /* renamed from: g */
    public final PreferredColorSpace f16639g;

    /* renamed from: u0.c$a */
    public class a implements ImageDecoder$OnPartialImageListener {
        public a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C9531c(int i10, int i11, C8539d c8539d) {
        this.f16634b = i10;
        this.f16635c = i11;
        this.f16636d = (DecodeFormat) c8539d.m14057c(C5401a.f3753f);
        this.f16637e = (DownsampleStrategy) c8539d.m14057c(DownsampleStrategy.f3731h);
        C8538c c8538c = C5401a.f3757j;
        this.f16638f = c8539d.m14057c(c8538c) != null && ((Boolean) c8539d.m14057c(c8538c)).booleanValue();
        this.f16639g = (PreferredColorSpace) c8539d.m14057c(C5401a.f3754g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f16633a.m16021f(this.f16634b, this.f16635c, this.f16638f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f16636d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f16634b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f16635c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fMo3601b = this.f16637e.mo3601b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fMo3601b);
        int iRound2 = Math.round(fMo3601b * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.f16639g;
        if (preferredColorSpace != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i10 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
