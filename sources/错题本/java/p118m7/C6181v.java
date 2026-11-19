package p118m7;

import android.support.v4.media.AbstractC0037f;
import androidx.exifinterface.media.ExifInterface;
import coil3.network.AbstractC3315g;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.time.DurationUnit;
import p008a7.C0019a;
import p084i7.InterfaceC5686b;
import p101k7.C5763e;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: m7.v */
/* loaded from: classes4.dex */
public final class C6181v implements InterfaceC5686b {

    /* renamed from: a */
    public static final C6181v f9874a = new C6181v();

    /* renamed from: b */
    public static final C6132e1 f9875b = new C6132e1("kotlin.time.Duration", C5763e.f9129j);

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        int i = C0019a.f57d;
        String value = decoder.decodeString();
        AbstractC5830k.m5330g(value, "value");
        try {
            return new C0019a(AbstractC3315g.m2234b(value));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(AbstractC0037f.m86k("Invalid ISO duration string format: '", value, "'."), e);
        }
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return f9875b;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        long j7 = ((C0019a) obj).f58a;
        int i = C0019a.f57d;
        StringBuilder sb = new StringBuilder();
        if (j7 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jM69h = j7 < 0 ? C0019a.m69h(j7) : j7;
        long jM68g = C0019a.m68g(jM69h, DurationUnit.HOURS);
        boolean z8 = false;
        int iM68g = C0019a.m66e(jM69h) ? 0 : (int) (C0019a.m68g(jM69h, DurationUnit.MINUTES) % 60);
        int iM68g2 = C0019a.m66e(jM69h) ? 0 : (int) (C0019a.m68g(jM69h, DurationUnit.SECONDS) % 60);
        int iM65d = C0019a.m65d(jM69h);
        if (C0019a.m66e(j7)) {
            jM68g = 9999999999999L;
        }
        boolean z9 = jM68g != 0;
        boolean z10 = (iM68g2 == 0 && iM65d == 0) ? false : true;
        if (iM68g != 0 || (z10 && z9)) {
            z8 = true;
        }
        if (z9) {
            sb.append(jM68g);
            sb.append('H');
        }
        if (z8) {
            sb.append(iM68g);
            sb.append('M');
        }
        if (z10 || (!z9 && !z8)) {
            C0019a.m63b(sb, iM68g2, iM65d, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        interfaceC6072f.encodeString(sb.toString());
    }
}
