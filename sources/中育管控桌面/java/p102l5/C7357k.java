package p102l5;

import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;

/* renamed from: l5.k */
/* loaded from: classes4.dex */
public final class C7357k {

    /* renamed from: d */
    public static final a f9346d = new a(null);

    /* renamed from: a */
    public final Protocol f9347a;

    /* renamed from: b */
    public final int f9348b;

    /* renamed from: c */
    public final String f9349c;

    /* renamed from: l5.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7357k m8361a(String statusLine) throws ProtocolException {
            Protocol protocol;
            int i6;
            String strSubstring;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (StringsKt.startsWith$default(statusLine, "HTTP/1.", false, 2, (Object) null)) {
                i6 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.f9716c;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    protocol = Protocol.f9717d;
                }
            } else if (StringsKt.startsWith$default(statusLine, "ICY ", false, 2, (Object) null)) {
                protocol = Protocol.f9716c;
                i6 = 4;
            } else {
                if (!StringsKt.startsWith$default(statusLine, "SOURCETABLE ", false, 2, (Object) null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                protocol = Protocol.f9717d;
                i6 = 12;
            }
            int i7 = i6 + 3;
            if (statusLine.length() < i7) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            String strSubstring2 = statusLine.substring(i6, i7);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            Integer intOrNull = StringsKt.toIntOrNull(strSubstring2);
            if (intOrNull == null) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            int iIntValue = intOrNull.intValue();
            if (statusLine.length() <= i7) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i7) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                strSubstring = statusLine.substring(i6 + 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
            return new C7357k(protocol, iIntValue, strSubstring);
        }

        public a() {
        }
    }

    public C7357k(Protocol protocol, int i6, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f9347a = protocol;
        this.f9348b = i6;
        this.f9349c = message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f9347a == Protocol.f9716c) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f9348b);
        sb.append(' ');
        sb.append(this.f9349c);
        return sb.toString();
    }
}
