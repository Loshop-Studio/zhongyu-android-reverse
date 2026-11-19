package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5844e;
import kotlin.uuid.Uuid;
import p022b7.C3199a;
import p084i7.InterfaceC5686b;
import p101k7.C5763e;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;
import p185v7.AbstractC6683l;

/* renamed from: m7.b2 */
/* loaded from: classes4.dex */
public final class C6123b2 implements InterfaceC5686b {

    /* renamed from: a */
    public static final C6123b2 f9779a = new C6123b2();

    /* renamed from: b */
    public static final C6132e1 f9780b = new C6132e1("kotlin.uuid.Uuid", C5763e.f9129j);

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        String strConcat;
        AbstractC5830k.m5330g(decoder, "decoder");
        C3199a c3199a = Uuid.Companion;
        String uuidString = decoder.decodeString();
        c3199a.getClass();
        AbstractC5830k.m5330g(uuidString, "uuidString");
        int length = uuidString.length();
        if (length == 32) {
            return C3199a.m2136a(AbstractC5844e.m5365b(0, 16, uuidString), AbstractC5844e.m5365b(16, 32, uuidString));
        }
        if (length == 36) {
            long jM5365b = AbstractC5844e.m5365b(0, 8, uuidString);
            AbstractC6683l.m6364d(8, uuidString);
            long jM5365b2 = AbstractC5844e.m5365b(9, 13, uuidString);
            AbstractC6683l.m6364d(13, uuidString);
            long jM5365b3 = AbstractC5844e.m5365b(14, 18, uuidString);
            AbstractC6683l.m6364d(18, uuidString);
            long jM5365b4 = AbstractC5844e.m5365b(19, 23, uuidString);
            AbstractC6683l.m6364d(23, uuidString);
            return C3199a.m2136a((jM5365b << 32) | (jM5365b2 << 16) | jM5365b3, AbstractC5844e.m5365b(24, 36, uuidString) | (jM5365b4 << 48));
        }
        StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
        if (uuidString.length() <= 64) {
            strConcat = uuidString;
        } else {
            String strSubstring = uuidString.substring(0, 64);
            AbstractC5830k.m5329f(strSubstring, "substring(...)");
            strConcat = strSubstring.concat("...");
        }
        sb.append(strConcat);
        sb.append("\" of length ");
        sb.append(uuidString.length());
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return f9780b;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        Uuid value = (Uuid) obj;
        AbstractC5830k.m5330g(value, "value");
        interfaceC6072f.encodeString(value.toString());
    }
}
