package p203o9;

import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.Protocol;
import p113g8.AbstractC8686y;
import p113g8.AbstractC8687z;

/* renamed from: o9.k */
/* loaded from: classes5.dex */
public final class C9556k {

    /* renamed from: d */
    public static final a f18933d = new a(null);

    /* renamed from: a */
    public final Protocol f18934a;

    /* renamed from: b */
    public final int f18935b;

    /* renamed from: c */
    public final String f18936c;

    /* renamed from: o9.k$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final C9556k m17866a(String statusLine) throws ProtocolException {
            Protocol protocol;
            int i10;
            String strSubstring;
            AbstractC9133u.m16133g(statusLine, "statusLine");
            if (AbstractC8687z.m14105M(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.f18938c;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    protocol = Protocol.f18939d;
                }
            } else if (AbstractC8687z.m14105M(statusLine, "ICY ", false, 2, null)) {
                protocol = Protocol.f18938c;
                i10 = 4;
            } else {
                if (!AbstractC8687z.m14105M(statusLine, "SOURCETABLE ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                protocol = Protocol.f18939d;
                i10 = 12;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            String strSubstring2 = statusLine.substring(i10, i11);
            AbstractC9133u.m16132f(strSubstring2, "substring(...)");
            Integer numM14089q = AbstractC8686y.m14089q(strSubstring2);
            if (numM14089q == null) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            int iIntValue = numM14089q.intValue();
            if (statusLine.length() <= i11) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                strSubstring = statusLine.substring(i10 + 4);
                AbstractC9133u.m16132f(strSubstring, "substring(...)");
            }
            return new C9556k(protocol, iIntValue, strSubstring);
        }

        public a() {
        }
    }

    public C9556k(Protocol protocol, int i10, String message) {
        AbstractC9133u.m16133g(protocol, "protocol");
        AbstractC9133u.m16133g(message, "message");
        this.f18934a = protocol;
        this.f18935b = i10;
        this.f18936c = message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f18934a == Protocol.f18938c) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f18935b);
        sb.append(' ');
        sb.append(this.f18936c);
        return sb.toString();
    }
}
