package coil3.decode;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import coil3.AbstractC3330o;
import coil3.size.Precision;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.Ref$BooleanRef;
import okio.AbstractC6349a;
import p129o2.C6268a;
import p154s.AbstractC6533g;
import p154s.AbstractC6534h;
import p154s.C6538l;
import p162t.C6576f;
import p169t6.AbstractC6600a;
import p204y1.AbstractC6768a;

/* renamed from: coil3.decode.v */
/* loaded from: classes2.dex */
public final class C3281v implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a */
    public final /* synthetic */ C3282w f1927a;

    /* renamed from: b */
    public final /* synthetic */ Ref$BooleanRef f1928b;

    public C3281v(C3282w c3282w, Ref$BooleanRef ref$BooleanRef) {
        this.f1927a = c3282w;
        this.f1928b = ref$BooleanRef;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        C6538l c6538l = this.f1927a.f1931c;
        long jM6442g = AbstractC6768a.m6442g(width, height, c6538l.f10895b, c6538l.f10896c, (C6576f) AbstractC3330o.m2268f(c6538l, AbstractC6533g.f10882b));
        int i = (int) (jM6442g >> 32);
        int i8 = (int) (jM6442g & 4294967295L);
        if (width > 0 && height > 0 && (width != i || height != i8)) {
            double dM6443h = AbstractC6768a.m6443h(width, height, i, i8, this.f1927a.f1931c.f10896c);
            boolean z8 = dM6443h < 1.0d;
            this.f1928b.element = z8;
            if (z8 || this.f1927a.f1931c.f10897d == Precision.EXACT) {
                imageDecoder.setTargetSize(AbstractC6600a.m6240p(width * dM6443h), AbstractC6600a.m6240p(dM6443h * height));
            }
        }
        imageDecoder.setOnPartialImageListener(new C3279t());
        C6538l c6538l2 = this.f1927a.f1931c;
        imageDecoder.setAllocator(AbstractC5806u.m5285x(AbstractC6534h.m6186b(c6538l2)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) AbstractC3330o.m2268f(c6538l2, AbstractC6534h.f10891g)).booleanValue() ? 1 : 0);
        C6268a c6268a = AbstractC6534h.f10887c;
        if (AbstractC6349a.m5996b(AbstractC3330o.m2268f(c6538l2, c6268a)) != null) {
            imageDecoder.setTargetColorSpace(AbstractC6349a.m5996b(AbstractC3330o.m2268f(c6538l2, c6268a)));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) AbstractC3330o.m2268f(c6538l2, AbstractC6534h.f10888d)).booleanValue());
    }
}
