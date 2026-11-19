package p111n0;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C4737a;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import p053f0.C6284c;
import p053f0.C6285d;
import p118o0.C7509t;

/* renamed from: n0.c */
/* loaded from: classes3.dex */
public final class C7446c implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a */
    public final C7509t f9510a = C7509t.m8633b();

    /* renamed from: b */
    public final int f9511b;

    /* renamed from: c */
    public final int f9512c;

    /* renamed from: d */
    public final DecodeFormat f9513d;

    /* renamed from: e */
    public final DownsampleStrategy f9514e;

    /* renamed from: f */
    public final boolean f9515f;

    /* renamed from: g */
    public final PreferredColorSpace f9516g;

    /* renamed from: n0.c$a */
    public class a implements ImageDecoder$OnPartialImageListener {
        public a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C7446c(int i6, int i7, C6285d c6285d) {
        this.f9511b = i6;
        this.f9512c = i7;
        this.f9513d = (DecodeFormat) c6285d.m6420c(C4737a.f2544f);
        this.f9514e = (DownsampleStrategy) c6285d.m6420c(DownsampleStrategy.f2522h);
        C6284c c6284c = C4737a.f2548j;
        this.f9515f = c6285d.m6420c(c6284c) != null && ((Boolean) c6285d.m6420c(c6284c)).booleanValue();
        this.f9516g = (PreferredColorSpace) c6285d.m6420c(C4737a.f2545g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f9510a.m8638f(this.f9511b, this.f9512c, this.f9515f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f9513d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f9511b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f9512c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fMo2781b = this.f9514e.mo2781b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fMo2781b);
        int iRound2 = Math.round(fMo2781b * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.f9516g;
        if (preferredColorSpace != null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i6 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
