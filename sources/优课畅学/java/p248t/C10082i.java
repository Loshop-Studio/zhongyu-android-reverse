package p248t;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C5450a;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import p160l.C9229c;
import p160l.C9230d;
import p259u.C10159w;

/* renamed from: t.i */
/* loaded from: classes3.dex */
public final class C10082i implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a */
    public final C10159w f20125a = C10159w.m19013b();

    /* renamed from: b */
    public final int f20126b;

    /* renamed from: c */
    public final int f20127c;

    /* renamed from: d */
    public final DecodeFormat f20128d;

    /* renamed from: e */
    public final DownsampleStrategy f20129e;

    /* renamed from: f */
    public final boolean f20130f;

    /* renamed from: g */
    public final PreferredColorSpace f20131g;

    /* renamed from: t.i$a */
    public class a implements ImageDecoder$OnPartialImageListener {
        public a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C10082i(int i10, int i11, C9230d c9230d) {
        this.f20126b = i10;
        this.f20127c = i11;
        this.f20128d = (DecodeFormat) c9230d.m16940c(C5450a.f3186f);
        this.f20129e = (DownsampleStrategy) c9230d.m16940c(DownsampleStrategy.f3164h);
        C9229c c9229c = C5450a.f3190j;
        this.f20130f = c9230d.m16940c(c9229c) != null && ((Boolean) c9230d.m16940c(c9229c)).booleanValue();
        this.f20131g = (PreferredColorSpace) c9230d.m16940c(C5450a.f3187g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f20125a.m19018f(this.f20126b, this.f20127c, this.f20130f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f20128d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f20126b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f20127c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fMo3046b = this.f20129e.mo3046b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fMo3046b);
        int iRound2 = Math.round(fMo3046b * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.f20131g;
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
