package p281w;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.AbstractC5400a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p116h0.AbstractC8697a;
import p116h0.AbstractC8707k;
import p160l.C9230d;
import p160l.InterfaceC9231e;
import p182n.InterfaceC9357j;
import p193o.InterfaceC9498b;
import p248t.C10082i;

/* renamed from: w.g */
/* loaded from: classes3.dex */
public final class C10265g {

    /* renamed from: a */
    public final List f20491a;

    /* renamed from: b */
    public final InterfaceC9498b f20492b;

    /* renamed from: w.g$a */
    public static final class a implements InterfaceC9357j {

        /* renamed from: a */
        public final AnimatedImageDrawable f20493a;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.f20493a = animatedImageDrawable;
        }

        @Override // p182n.InterfaceC9357j
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f20493a;
        }

        @Override // p182n.InterfaceC9357j
        /* renamed from: b */
        public Class mo3016b() {
            return Drawable.class;
        }

        @Override // p182n.InterfaceC9357j
        public int getSize() {
            return this.f20493a.getIntrinsicWidth() * this.f20493a.getIntrinsicHeight() * AbstractC8707k.m14191i(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // p182n.InterfaceC9357j
        public void recycle() {
            this.f20493a.stop();
            this.f20493a.clearAnimationCallbacks();
        }
    }

    /* renamed from: w.g$b */
    public static final class b implements InterfaceC9231e {

        /* renamed from: a */
        public final C10265g f20494a;

        public b(C10265g c10265g) {
            this.f20494a = c10265g;
        }

        @Override // p160l.InterfaceC9231e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9357j mo3061a(ByteBuffer byteBuffer, int i10, int i11, C9230d c9230d) {
            return this.f20494a.m19224b(ImageDecoder.createSource(byteBuffer), i10, i11, c9230d);
        }

        @Override // p160l.InterfaceC9231e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo3062b(ByteBuffer byteBuffer, C9230d c9230d) {
            return this.f20494a.m19226d(byteBuffer);
        }
    }

    /* renamed from: w.g$c */
    public static final class c implements InterfaceC9231e {

        /* renamed from: a */
        public final C10265g f20495a;

        public c(C10265g c10265g) {
            this.f20495a = c10265g;
        }

        @Override // p160l.InterfaceC9231e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9357j mo3061a(InputStream inputStream, int i10, int i11, C9230d c9230d) {
            return this.f20495a.m19224b(ImageDecoder.createSource(AbstractC8697a.m14149b(inputStream)), i10, i11, c9230d);
        }

        @Override // p160l.InterfaceC9231e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo3062b(InputStream inputStream, C9230d c9230d) {
            return this.f20495a.m19225c(inputStream);
        }
    }

    public C10265g(List list, InterfaceC9498b interfaceC9498b) {
        this.f20491a = list;
        this.f20492b = interfaceC9498b;
    }

    /* renamed from: a */
    public static InterfaceC9231e m19222a(List list, InterfaceC9498b interfaceC9498b) {
        return new b(new C10265g(list, interfaceC9498b));
    }

    /* renamed from: f */
    public static InterfaceC9231e m19223f(List list, InterfaceC9498b interfaceC9498b) {
        return new c(new C10265g(list, interfaceC9498b));
    }

    /* renamed from: b */
    public InterfaceC9357j m19224b(ImageDecoder.Source source, int i10, int i11, C9230d c9230d) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C10082i(i10, i11, c9230d));
        if (AbstractC10259a.m19216a(drawableDecodeDrawable)) {
            return new a(AbstractC10260b.m19217a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    /* renamed from: c */
    public boolean m19225c(InputStream inputStream) {
        return m19227e(AbstractC5400a.m2834f(this.f20491a, inputStream, this.f20492b));
    }

    /* renamed from: d */
    public boolean m19226d(ByteBuffer byteBuffer) {
        return m19227e(AbstractC5400a.m2835g(this.f20491a, byteBuffer));
    }

    /* renamed from: e */
    public final boolean m19227e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }
}
