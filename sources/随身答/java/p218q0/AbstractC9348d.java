package p218q0;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C5505a;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import p122h0.C8083c;
import p122h0.C8084d;
import p122h0.InterfaceC8085e;
import p152k0.InterfaceC8259j;
import p228r0.C9409s;

/* renamed from: q0.d */
/* loaded from: classes3.dex */
public abstract class AbstractC9348d implements InterfaceC8085e {

    /* renamed from: a */
    public final C9409s f16238a = C9409s.m15478a();

    /* renamed from: q0.d$a */
    public class a implements ImageDecoder$OnHeaderDecodedListener {

        /* renamed from: a */
        public final /* synthetic */ int f16239a;

        /* renamed from: b */
        public final /* synthetic */ int f16240b;

        /* renamed from: c */
        public final /* synthetic */ boolean f16241c;

        /* renamed from: d */
        public final /* synthetic */ DecodeFormat f16242d;

        /* renamed from: e */
        public final /* synthetic */ DownsampleStrategy f16243e;

        /* renamed from: f */
        public final /* synthetic */ PreferredColorSpace f16244f;

        /* renamed from: q0.d$a$a, reason: collision with other inner class name */
        public class C10086a implements ImageDecoder$OnPartialImageListener {
            public C10086a() {
            }

            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public a(int i9, int i10, boolean z9, DecodeFormat decodeFormat, DownsampleStrategy downsampleStrategy, PreferredColorSpace preferredColorSpace) {
            this.f16239a = i9;
            this.f16240b = i10;
            this.f16241c = z9;
            this.f16242d = decodeFormat;
            this.f16243e = downsampleStrategy;
            this.f16244f = preferredColorSpace;
        }

        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            if (AbstractC9348d.this.f16238a.m15481c(this.f16239a, this.f16240b, this.f16241c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f16242d == DecodeFormat.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C10086a());
            Size size = imageInfo.getSize();
            int width = this.f16239a;
            if (width == Integer.MIN_VALUE) {
                width = size.getWidth();
            }
            int height = this.f16240b;
            if (height == Integer.MIN_VALUE) {
                height = size.getHeight();
            }
            float fMo3252b = this.f16243e.mo3252b(size.getWidth(), size.getHeight(), width, height);
            int iRound = Math.round(size.getWidth() * fMo3252b);
            int iRound2 = Math.round(fMo3252b * size.getHeight());
            if (Log.isLoggable("ImageDecoder", 2)) {
                size.getWidth();
                size.getHeight();
            }
            imageDecoder.setTargetSize(iRound, iRound2);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((this.f16244f == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i9 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo3289a(Object obj, C8084d c8084d) {
        return m15292e(AbstractC9345a.m15287a(obj), c8084d);
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC8259j mo3290b(Object obj, int i9, int i10, C8084d c8084d) {
        return m15291d(AbstractC9345a.m15287a(obj), i9, i10, c8084d);
    }

    /* renamed from: c */
    public abstract InterfaceC8259j mo15290c(ImageDecoder.Source source, int i9, int i10, ImageDecoder$OnHeaderDecodedListener imageDecoder$OnHeaderDecodedListener);

    /* renamed from: d */
    public final InterfaceC8259j m15291d(ImageDecoder.Source source, int i9, int i10, C8084d c8084d) {
        DecodeFormat decodeFormat = (DecodeFormat) c8084d.m12908c(C5505a.f3538f);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c8084d.m12908c(DownsampleStrategy.f3527h);
        C8083c c8083c = C5505a.f3542j;
        return mo15290c(source, i9, i10, new a(i9, i10, c8084d.m12908c(c8083c) != null && ((Boolean) c8084d.m12908c(c8083c)).booleanValue(), decodeFormat, downsampleStrategy, (PreferredColorSpace) c8084d.m12908c(C5505a.f3539g)));
    }

    /* renamed from: e */
    public final boolean m15292e(ImageDecoder.Source source, C8084d c8084d) {
        return true;
    }
}
