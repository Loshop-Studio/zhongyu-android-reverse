package p132q0;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.AbstractC4687a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p016b1.AbstractC4399a;
import p016b1.AbstractC4409k;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p067h0.InterfaceC6440j;
import p074i0.InterfaceC6497b;
import p111n0.C7446c;

/* renamed from: q0.g */
/* loaded from: classes3.dex */
public final class C7612g {

    /* renamed from: a */
    public final List f10067a;

    /* renamed from: b */
    public final InterfaceC6497b f10068b;

    /* renamed from: q0.g$a */
    public static final class a implements InterfaceC6440j {

        /* renamed from: a */
        public final AnimatedImageDrawable f10069a;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.f10069a = animatedImageDrawable;
        }

        @Override // p067h0.InterfaceC6440j
        /* renamed from: a */
        public Class mo2749a() {
            return Drawable.class;
        }

        @Override // p067h0.InterfaceC6440j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f10069a;
        }

        @Override // p067h0.InterfaceC6440j
        public int getSize() {
            return this.f10069a.getIntrinsicWidth() * this.f10069a.getIntrinsicHeight() * AbstractC4409k.m1448i(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // p067h0.InterfaceC6440j
        public void recycle() {
            this.f10069a.stop();
            this.f10069a.clearAnimationCallbacks();
        }
    }

    /* renamed from: q0.g$b */
    public static final class b implements InterfaceC6286e {

        /* renamed from: a */
        public final C7612g f10070a;

        public b(C7612g c7612g) {
            this.f10070a = c7612g;
        }

        @Override // p053f0.InterfaceC6286e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC6440j mo2796a(ByteBuffer byteBuffer, int i6, int i7, C6285d c6285d) {
            return this.f10070a.m9031b(ImageDecoder.createSource(byteBuffer), i6, i7, c6285d);
        }

        @Override // p053f0.InterfaceC6286e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo2797b(ByteBuffer byteBuffer, C6285d c6285d) {
            return this.f10070a.m9033d(byteBuffer);
        }
    }

    /* renamed from: q0.g$c */
    public static final class c implements InterfaceC6286e {

        /* renamed from: a */
        public final C7612g f10071a;

        public c(C7612g c7612g) {
            this.f10071a = c7612g;
        }

        @Override // p053f0.InterfaceC6286e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC6440j mo2796a(InputStream inputStream, int i6, int i7, C6285d c6285d) {
            return this.f10071a.m9031b(ImageDecoder.createSource(AbstractC4399a.m1406b(inputStream)), i6, i7, c6285d);
        }

        @Override // p053f0.InterfaceC6286e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo2797b(InputStream inputStream, C6285d c6285d) {
            return this.f10071a.m9032c(inputStream);
        }
    }

    public C7612g(List list, InterfaceC6497b interfaceC6497b) {
        this.f10067a = list;
        this.f10068b = interfaceC6497b;
    }

    /* renamed from: a */
    public static InterfaceC6286e m9029a(List list, InterfaceC6497b interfaceC6497b) {
        return new b(new C7612g(list, interfaceC6497b));
    }

    /* renamed from: f */
    public static InterfaceC6286e m9030f(List list, InterfaceC6497b interfaceC6497b) {
        return new c(new C7612g(list, interfaceC6497b));
    }

    /* renamed from: b */
    public InterfaceC6440j m9031b(ImageDecoder.Source source, int i6, int i7, C6285d c6285d) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C7446c(i6, i7, c6285d));
        if (AbstractC7606a.m9023a(drawableDecodeDrawable)) {
            return new a(AbstractC7607b.m9024a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    /* renamed from: c */
    public boolean m9032c(InputStream inputStream) {
        return m9034e(AbstractC4687a.m2568f(this.f10067a, inputStream, this.f10068b));
    }

    /* renamed from: d */
    public boolean m9033d(ByteBuffer byteBuffer) {
        return m9034e(AbstractC4687a.m2569g(this.f10067a, byteBuffer));
    }

    /* renamed from: e */
    public final boolean m9034e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }
}
