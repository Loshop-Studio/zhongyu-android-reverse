package p284p0;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C5869a;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import p168h0.C9437d;
import p168h0.C9438e;
import p298q0.C10710s;

/* renamed from: p0.c */
/* loaded from: classes3.dex */
public final class C10596c implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a */
    public final C10710s f25566a = C10710s.m22673b();

    /* renamed from: b */
    public final int f25567b;

    /* renamed from: c */
    public final int f25568c;

    /* renamed from: d */
    public final DecodeFormat f25569d;

    /* renamed from: e */
    public final DownsampleStrategy f25570e;

    /* renamed from: f */
    public final boolean f25571f;

    /* renamed from: g */
    public final PreferredColorSpace f25572g;

    /* renamed from: p0.c$a */
    public class a implements ImageDecoder$OnPartialImageListener {
        public a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C10596c(int i10, int i11, C9438e c9438e) {
        this.f25567b = i10;
        this.f25568c = i11;
        this.f25569d = (DecodeFormat) c9438e.m18626c(C5869a.f4956f);
        this.f25570e = (DownsampleStrategy) c9438e.m18626c(DownsampleStrategy.f4934h);
        C9437d c9437d = C5869a.f4960j;
        this.f25571f = c9438e.m18626c(c9437d) != null && ((Boolean) c9438e.m18626c(c9437d)).booleanValue();
        this.f25572g = (PreferredColorSpace) c9438e.m18626c(C5869a.f4957g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f25566a.m22678f(this.f25567b, this.f25568c, this.f25571f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f25569d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f25567b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f25568c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fMo4250b = this.f25570e.mo4250b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fMo4250b);
        int iRound2 = Math.round(fMo4250b * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.f25572g;
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
