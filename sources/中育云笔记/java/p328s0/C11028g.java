package p328s0;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.AbstractC5819a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p109d1.AbstractC8900a;
import p109d1.AbstractC8910k;
import p168h0.C9438e;
import p168h0.InterfaceC9439f;
import p198j0.InterfaceC9657j;
import p213k0.InterfaceC9770b;
import p284p0.C10596c;

/* renamed from: s0.g */
/* loaded from: classes3.dex */
public final class C11028g {

    /* renamed from: a */
    public final List f26599a;

    /* renamed from: b */
    public final InterfaceC9770b f26600b;

    /* renamed from: s0.g$a */
    public static final class a implements InterfaceC9657j {

        /* renamed from: c */
        public final AnimatedImageDrawable f26601c;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.f26601c = animatedImageDrawable;
        }

        @Override // p198j0.InterfaceC9657j
        /* renamed from: a */
        public Class mo4219a() {
            return Drawable.class;
        }

        @Override // p198j0.InterfaceC9657j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f26601c;
        }

        @Override // p198j0.InterfaceC9657j
        public int getSize() {
            return this.f26601c.getIntrinsicWidth() * this.f26601c.getIntrinsicHeight() * AbstractC8910k.m17478i(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // p198j0.InterfaceC9657j
        public void recycle() {
            this.f26601c.stop();
            this.f26601c.clearAnimationCallbacks();
        }
    }

    /* renamed from: s0.g$b */
    public static final class b implements InterfaceC9439f {

        /* renamed from: a */
        public final C11028g f26602a;

        public b(C11028g c11028g) {
            this.f26602a = c11028g;
        }

        @Override // p168h0.InterfaceC9439f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9657j mo4266b(ByteBuffer byteBuffer, int i10, int i11, C9438e c9438e) {
            return this.f26602a.m24363b(ImageDecoder.createSource(byteBuffer), i10, i11, c9438e);
        }

        @Override // p168h0.InterfaceC9439f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo4265a(ByteBuffer byteBuffer, C9438e c9438e) {
            return this.f26602a.m24365d(byteBuffer);
        }
    }

    /* renamed from: s0.g$c */
    public static final class c implements InterfaceC9439f {

        /* renamed from: a */
        public final C11028g f26603a;

        public c(C11028g c11028g) {
            this.f26603a = c11028g;
        }

        @Override // p168h0.InterfaceC9439f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9657j mo4266b(InputStream inputStream, int i10, int i11, C9438e c9438e) {
            return this.f26603a.m24363b(ImageDecoder.createSource(AbstractC8900a.m17436b(inputStream)), i10, i11, c9438e);
        }

        @Override // p168h0.InterfaceC9439f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo4265a(InputStream inputStream, C9438e c9438e) {
            return this.f26603a.m24364c(inputStream);
        }
    }

    public C11028g(List list, InterfaceC9770b interfaceC9770b) {
        this.f26599a = list;
        this.f26600b = interfaceC9770b;
    }

    /* renamed from: a */
    public static InterfaceC9439f m24361a(List list, InterfaceC9770b interfaceC9770b) {
        return new b(new C11028g(list, interfaceC9770b));
    }

    /* renamed from: f */
    public static InterfaceC9439f m24362f(List list, InterfaceC9770b interfaceC9770b) {
        return new c(new C11028g(list, interfaceC9770b));
    }

    /* renamed from: b */
    public InterfaceC9657j m24363b(ImageDecoder.Source source, int i10, int i11, C9438e c9438e) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C10596c(i10, i11, c9438e));
        if (AbstractC11022a.m24355a(drawableDecodeDrawable)) {
            return new a(AbstractC11023b.m24356a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    /* renamed from: c */
    public boolean m24364c(InputStream inputStream) {
        return m24366e(AbstractC5819a.m4040f(this.f26599a, inputStream, this.f26600b));
    }

    /* renamed from: d */
    public boolean m24365d(ByteBuffer byteBuffer) {
        return m24366e(AbstractC5819a.m4041g(this.f26599a, byteBuffer));
    }

    /* renamed from: e */
    public final boolean m24366e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }
}
