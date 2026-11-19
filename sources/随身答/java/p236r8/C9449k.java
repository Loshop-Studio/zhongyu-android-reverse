package p236r8;

import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;

/* renamed from: r8.k */
/* loaded from: classes5.dex */
public final class C9449k {

    /* renamed from: d */
    public static final a f16476d = new a(null);

    /* renamed from: a */
    public final Protocol f16477a;

    /* renamed from: b */
    public final int f16478b;

    /* renamed from: c */
    public final String f16479c;

    /* renamed from: r8.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9449k m15618a(String statusLine) throws ProtocolException, NumberFormatException {
            Protocol protocol;
            int i9;
            String strSubstring;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (StringsKt.startsWith$default(statusLine, "HTTP/1.", false, 2, (Object) null)) {
                i9 = 9;
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
                if (!StringsKt.startsWith$default(statusLine, "ICY ", false, 2, (Object) null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                protocol = Protocol.HTTP_1_0;
                i9 = 4;
            }
            int i10 = i9 + 3;
            if (statusLine.length() < i10) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String strSubstring2 = statusLine.substring(i9, i10);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i11 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i10) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i10) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i9 + 4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new C9449k(protocol, i11, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }

        public a() {
        }
    }

    public C9449k(Protocol protocol, int i9, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f16477a = protocol;
        this.f16478b = i9;
        this.f16479c = message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f16477a == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f16478b);
        sb.append(' ');
        sb.append(this.f16479c);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
