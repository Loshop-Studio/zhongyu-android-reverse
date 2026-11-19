package p118s;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C2892a;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import p076j.C3793c;
import p076j.C3794d;
import p076j.InterfaceC3795e;
import p093m.InterfaceC4361j;
import p122t.C4576v;

/* renamed from: s.j */
/* loaded from: classes2.dex */
public abstract class AbstractC4540j implements InterfaceC3795e {

    /* renamed from: a */
    public final C4576v f5677a = C4576v.m6297a();

    /* renamed from: s.j$a */
    public class a implements ImageDecoder$OnHeaderDecodedListener {

        /* renamed from: a */
        public final /* synthetic */ int f5678a;

        /* renamed from: b */
        public final /* synthetic */ int f5679b;

        /* renamed from: c */
        public final /* synthetic */ boolean f5680c;

        /* renamed from: d */
        public final /* synthetic */ DecodeFormat f5681d;

        /* renamed from: e */
        public final /* synthetic */ DownsampleStrategy f5682e;

        /* renamed from: f */
        public final /* synthetic */ PreferredColorSpace f5683f;

        /* renamed from: s.j$a$a, reason: collision with other inner class name */
        public class C4771a implements ImageDecoder$OnPartialImageListener {
            public C4771a() {
            }

            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public a(int i4, int i5, boolean z3, DecodeFormat decodeFormat, DownsampleStrategy downsampleStrategy, PreferredColorSpace preferredColorSpace) {
            this.f5678a = i4;
            this.f5679b = i5;
            this.f5680c = z3;
            this.f5681d = decodeFormat;
            this.f5682e = downsampleStrategy;
            this.f5683f = preferredColorSpace;
        }

        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z3 = false;
            if (AbstractC4540j.this.f5677a.m6300c(this.f5678a, this.f5679b, this.f5680c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f5681d == DecodeFormat.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C4771a());
            Size size = imageInfo.getSize();
            int width = this.f5678a;
            if (width == Integer.MIN_VALUE) {
                width = size.getWidth();
            }
            int height = this.f5679b;
            if (height == Integer.MIN_VALUE) {
                height = size.getHeight();
            }
            float fMo1928b = this.f5682e.mo1928b(size.getWidth(), size.getHeight(), width, height);
            int iRound = Math.round(size.getWidth() * fMo1928b);
            int iRound2 = Math.round(size.getHeight() * fMo1928b);
            if (Log.isLoggable("ImageDecoder", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Resizing from [");
                sb.append(size.getWidth());
                sb.append("x");
                sb.append(size.getHeight());
                sb.append("] to [");
                sb.append(iRound);
                sb.append("x");
                sb.append(iRound2);
                sb.append("] scaleFactor: ");
                sb.append(fMo1928b);
            }
            imageDecoder.setTargetSize(iRound, iRound2);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 28) {
                if (i4 >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                }
            } else {
                if (this.f5683f == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z3 = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z3 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            }
        }
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1965a(Object obj, C3794d c3794d) {
        return m6178e(AbstractC4531a.m6167a(obj), c3794d);
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC4361j mo1966b(Object obj, int i4, int i5, C3794d c3794d) {
        return m6177d(AbstractC4531a.m6167a(obj), i4, i5, c3794d);
    }

    /* renamed from: c */
    public abstract InterfaceC4361j mo6176c(ImageDecoder.Source source, int i4, int i5, ImageDecoder$OnHeaderDecodedListener imageDecoder$OnHeaderDecodedListener);

    /* renamed from: d */
    public final InterfaceC4361j m6177d(ImageDecoder.Source source, int i4, int i5, C3794d c3794d) {
        DecodeFormat decodeFormat = (DecodeFormat) c3794d.m4951c(C2892a.f884f);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c3794d.m4951c(DownsampleStrategy.f873h);
        C3793c c3793c = C2892a.f888j;
        return mo6176c(source, i4, i5, new a(i4, i5, c3794d.m4951c(c3793c) != null && ((Boolean) c3794d.m4951c(c3793c)).booleanValue(), decodeFormat, downsampleStrategy, (PreferredColorSpace) c3794d.m4951c(C2892a.f885g)));
    }

    /* renamed from: e */
    public final boolean m6178e(ImageDecoder.Source source, C3794d c3794d) {
        return true;
    }
}
