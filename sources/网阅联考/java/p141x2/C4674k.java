package p141x2;

import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Protocol;

/* renamed from: x2.k */
/* loaded from: classes2.dex */
public final class C4674k {

    /* renamed from: d */
    public static final a f5984d = new a(null);

    /* renamed from: a */
    public final Protocol f5985a;

    /* renamed from: b */
    public final int f5986b;

    /* renamed from: c */
    public final String f5987c;

    /* renamed from: x2.k$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C4674k m6604a(String statusLine) throws ProtocolException, NumberFormatException {
            Protocol protocol;
            int i4;
            String strSubstring;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (StringsKt__StringsJVMKt.startsWith$default(statusLine, "HTTP/1.", false, 2, null)) {
                i4 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!StringsKt__StringsJVMKt.startsWith$default(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                protocol = Protocol.HTTP_1_0;
                i4 = 4;
            }
            int i5 = i4 + 3;
            if (statusLine.length() < i5) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String strSubstring2 = statusLine.substring(i4, i5);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int i6 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i5) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i5) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i4 + 4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                }
                return new C4674k(protocol, i6, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }
    }

    public C4674k(Protocol protocol, int i4, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f5985a = protocol;
        this.f5986b = i4;
        this.f5987c = message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f5985a == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f5986b);
        sb.append(' ');
        sb.append(this.f5987c);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
