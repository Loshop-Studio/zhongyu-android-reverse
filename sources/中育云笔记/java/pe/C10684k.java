package pe;

import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okhttp3.Protocol;
import p310qd.AbstractC10819z;

/* renamed from: pe.k */
/* loaded from: classes6.dex */
public final class C10684k {

    /* renamed from: d */
    public static final a f25749d = new a(null);

    /* renamed from: a */
    public final Protocol f25750a;

    /* renamed from: b */
    public final int f25751b;

    /* renamed from: c */
    public final String f25752c;

    /* renamed from: pe.k$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C10684k m22644a(String statusLine) throws ProtocolException, NumberFormatException {
            Protocol protocol;
            int i10;
            String strSubstring;
            AbstractC9979u.m20294g(statusLine, "statusLine");
            if (AbstractC10819z.m23242O(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
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
                if (!AbstractC10819z.m23242O(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                protocol = Protocol.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String strSubstring2 = statusLine.substring(i10, i11);
                AbstractC9979u.m20293f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i12 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i11) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i11) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i10 + 4);
                    AbstractC9979u.m20293f(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new C10684k(protocol, i12, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }

        public a() {
        }
    }

    public C10684k(Protocol protocol, int i10, String message) {
        AbstractC9979u.m20294g(protocol, "protocol");
        AbstractC9979u.m20294g(message, "message");
        this.f25750a = protocol;
        this.f25751b = i10;
        this.f25752c = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f25750a == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f25751b);
        sb2.append(' ');
        sb2.append(this.f25752c);
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
