package p281x0;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.AbstractC5351a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p117i1.AbstractC7642a;
import p117i1.AbstractC7652k;
import p162m0.C8539d;
import p162m0.InterfaceC8540e;
import p184o0.InterfaceC8690j;
import p195p0.InterfaceC8802b;
import p250u0.C9531c;

/* renamed from: x0.g */
/* loaded from: classes3.dex */
public final class C9833g {

    /* renamed from: a */
    public final List f17387a;

    /* renamed from: b */
    public final InterfaceC8802b f17388b;

    /* renamed from: x0.g$a */
    public static final class a implements InterfaceC8690j {

        /* renamed from: a */
        public final AnimatedImageDrawable f17389a;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.f17389a = animatedImageDrawable;
        }

        @Override // p184o0.InterfaceC8690j
        /* renamed from: a */
        public Class mo3569a() {
            return Drawable.class;
        }

        @Override // p184o0.InterfaceC8690j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f17389a;
        }

        @Override // p184o0.InterfaceC8690j
        public int getSize() {
            return this.f17389a.getIntrinsicWidth() * this.f17389a.getIntrinsicHeight() * AbstractC7652k.m12693i(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // p184o0.InterfaceC8690j
        public void recycle() {
            this.f17389a.stop();
            this.f17389a.clearAnimationCallbacks();
        }
    }

    /* renamed from: x0.g$b */
    public static final class b implements InterfaceC8540e {

        /* renamed from: a */
        public final C9833g f17390a;

        public b(C9833g c9833g) {
            this.f17390a = c9833g;
        }

        @Override // p162m0.InterfaceC8540e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC8690j mo3617b(ByteBuffer byteBuffer, int i10, int i11, C8539d c8539d) {
            return this.f17390a.m16457b(ImageDecoder.createSource(byteBuffer), i10, i11, c8539d);
        }

        @Override // p162m0.InterfaceC8540e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo3616a(ByteBuffer byteBuffer, C8539d c8539d) {
            return this.f17390a.m16459d(byteBuffer);
        }
    }

    /* renamed from: x0.g$c */
    public static final class c implements InterfaceC8540e {

        /* renamed from: a */
        public final C9833g f17391a;

        public c(C9833g c9833g) {
            this.f17391a = c9833g;
        }

        @Override // p162m0.InterfaceC8540e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC8690j mo3617b(InputStream inputStream, int i10, int i11, C8539d c8539d) {
            return this.f17391a.m16457b(ImageDecoder.createSource(AbstractC7642a.m12651b(inputStream)), i10, i11, c8539d);
        }

        @Override // p162m0.InterfaceC8540e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo3616a(InputStream inputStream, C8539d c8539d) {
            return this.f17391a.m16458c(inputStream);
        }
    }

    public C9833g(List list, InterfaceC8802b interfaceC8802b) {
        this.f17387a = list;
        this.f17388b = interfaceC8802b;
    }

    /* renamed from: a */
    public static InterfaceC8540e m16455a(List list, InterfaceC8802b interfaceC8802b) {
        return new b(new C9833g(list, interfaceC8802b));
    }

    /* renamed from: f */
    public static InterfaceC8540e m16456f(List list, InterfaceC8802b interfaceC8802b) {
        return new c(new C9833g(list, interfaceC8802b));
    }

    /* renamed from: b */
    public InterfaceC8690j m16457b(ImageDecoder.Source source, int i10, int i11, C8539d c8539d) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C9531c(i10, i11, c8539d));
        if (AbstractC9827a.m16449a(drawableDecodeDrawable)) {
            return new a(AbstractC9828b.m16450a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    /* renamed from: c */
    public boolean m16458c(InputStream inputStream) {
        return m16460e(AbstractC5351a.m3387f(this.f17387a, inputStream, this.f17388b));
    }

    /* renamed from: d */
    public boolean m16459d(ByteBuffer byteBuffer) {
        return m16460e(AbstractC5351a.m3388g(this.f17387a, byteBuffer));
    }

    /* renamed from: e */
    public final boolean m16460e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }
}
