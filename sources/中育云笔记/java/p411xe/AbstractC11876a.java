package p411xe;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.ftp.FTPCmd;
import org.apache.commons.net.ftp.FTPConnectionClosedException;
import p395we.AbstractC11744a;
import p441ze.C12051a;

/* renamed from: xe.a */
/* loaded from: classes6.dex */
public abstract class AbstractC11876a extends AbstractC11744a {

    /* renamed from: o */
    public int f28136o;

    /* renamed from: p */
    public ArrayList f28137p;

    /* renamed from: q */
    public boolean f28138q;

    /* renamed from: r */
    public String f28139r;

    /* renamed from: s */
    public String f28140s;

    /* renamed from: t */
    public ProtocolCommandSupport f28141t;

    /* renamed from: u */
    public boolean f28142u;

    /* renamed from: v */
    public boolean f28143v = true;

    /* renamed from: w */
    public BufferedReader f28144w;

    /* renamed from: x */
    public BufferedWriter f28145x;

    public AbstractC11876a() {
        m25987p(21);
        this.f28137p = new ArrayList();
        this.f28138q = false;
        this.f28139r = null;
        this.f28140s = "ISO-8859-1";
        this.f28141t = new ProtocolCommandSupport(this);
    }

    /* renamed from: A */
    public int m26359A() {
        return m26360B(true);
    }

    /* renamed from: B */
    public final int m26360B(boolean z10) throws IOException {
        this.f28138q = true;
        this.f28137p.clear();
        String line = this.f28144w.readLine();
        if (line == null) {
            throw new FTPConnectionClosedException("Connection closed without indication.");
        }
        int length = line.length();
        if (length < 3) {
            throw new MalformedServerReplyException("Truncated server reply: " + line);
        }
        try {
            String strSubstring = line.substring(0, 3);
            this.f28136o = Integer.parseInt(strSubstring);
            this.f28137p.add(line);
            if (length > 3) {
                char cCharAt = line.charAt(3);
                if (cCharAt == '-') {
                    while (true) {
                        String line2 = this.f28144w.readLine();
                        if (line2 == null) {
                            throw new FTPConnectionClosedException("Connection closed without indication.");
                        }
                        this.f28137p.add(line2);
                        if (m26363E()) {
                            if (!m26376R(line2, strSubstring)) {
                                break;
                            }
                        } else if (!m26365G(line2)) {
                            break;
                        }
                    }
                } else if (m26364F()) {
                    if (length == 4) {
                        throw new MalformedServerReplyException("Truncated server reply: '" + line + "'");
                    }
                    if (cCharAt != ' ') {
                        throw new MalformedServerReplyException("Invalid server reply: '" + line + "'");
                    }
                }
            } else if (m26364F()) {
                throw new MalformedServerReplyException("Truncated server reply: '" + line + "'");
            }
            if (z10) {
                m25980i(this.f28136o, m26362D());
            }
            int i10 = this.f28136o;
            if (i10 != 421) {
                return i10;
            }
            throw new FTPConnectionClosedException("FTP response 421 received.  Server closed connection.");
        } catch (NumberFormatException unused) {
            throw new MalformedServerReplyException("Could not parse response code.\nServer Reply: " + line);
        }
    }

    /* renamed from: C */
    public int m26361C() {
        return this.f28136o;
    }

    /* renamed from: D */
    public String m26362D() {
        if (!this.f28138q) {
            return this.f28139r;
        }
        StringBuilder sb2 = new StringBuilder(256);
        ArrayList arrayList = this.f28137p;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            sb2.append((String) obj);
            sb2.append("\r\n");
        }
        this.f28138q = false;
        String string = sb2.toString();
        this.f28139r = string;
        return string;
    }

    /* renamed from: E */
    public boolean m26363E() {
        return this.f28142u;
    }

    /* renamed from: F */
    public boolean m26364F() {
        return this.f28143v;
    }

    /* renamed from: G */
    public final boolean m26365G(String str) {
        return str.length() <= 3 || str.charAt(3) == '-' || !Character.isDigit(str.charAt(0));
    }

    /* renamed from: H */
    public int m26366H(String str) {
        return m26374P(FTPCmd.PASS, str);
    }

    /* renamed from: I */
    public int m26367I() {
        return m26373O(FTPCmd.PASV);
    }

    /* renamed from: J */
    public int m26368J(InetAddress inetAddress, int i10) {
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append(inetAddress.getHostAddress().replace('.', ','));
        sb2.append(',');
        sb2.append(i10 >>> 8);
        sb2.append(',');
        sb2.append(i10 & 255);
        return m26374P(FTPCmd.PORT, sb2.toString());
    }

    /* renamed from: K */
    public int m26369K() {
        return m26373O(FTPCmd.QUIT);
    }

    /* renamed from: L */
    public int m26370L(String str) {
        return m26374P(FTPCmd.REST, str);
    }

    /* renamed from: M */
    public final void m26371M(String str) throws IOException {
        try {
            this.f28145x.write(str);
            this.f28145x.flush();
        } catch (SocketException e10) {
            if (!m25985n()) {
                throw new FTPConnectionClosedException("Connection unexpectedly closed.");
            }
            throw e10;
        }
    }

    /* renamed from: N */
    public int m26372N(String str, String str2) throws IOException {
        if (this.f28145x == null) {
            throw new IOException("Connection is not open");
        }
        String strM26382v = m26382v(str, str2);
        m26371M(strM26382v);
        m25979h(str, strM26382v);
        return m26359A();
    }

    /* renamed from: O */
    public int m26373O(FTPCmd fTPCmd) {
        return m26374P(fTPCmd, null);
    }

    /* renamed from: P */
    public int m26374P(FTPCmd fTPCmd, String str) {
        return m26372N(fTPCmd.m22266a(), str);
    }

    /* renamed from: Q */
    public void m26375Q(String str) {
        this.f28140s = str;
    }

    /* renamed from: R */
    public final boolean m26376R(String str, String str2) {
        return (str.startsWith(str2) && str.charAt(3) == ' ') ? false : true;
    }

    /* renamed from: S */
    public int m26377S(int i10) {
        return m26374P(FTPCmd.TYPE, "AEILNTCFRPSBC".substring(i10, i10 + 1));
    }

    /* renamed from: T */
    public int m26378T(String str) {
        return m26374P(FTPCmd.USER, str);
    }

    @Override // p395we.AbstractC11744a
    /* renamed from: g */
    public void mo25978g() throws IOException {
        super.mo25978g();
        this.f28144w = null;
        this.f28145x = null;
        this.f28138q = false;
        this.f28139r = null;
    }

    @Override // p395we.AbstractC11744a
    /* renamed from: j */
    public ProtocolCommandSupport mo25981j() {
        return this.f28141t;
    }

    /* renamed from: s */
    public void m26379s() throws IOException {
        m26360B(false);
    }

    /* renamed from: t */
    public void m26380t() throws IOException {
        m26371M(m26382v(FTPCmd.NOOP.m22266a(), null));
        m26379s();
    }

    /* renamed from: u */
    public void mo26381u(Reader reader) throws SocketException {
        super.mo25973b();
        if (reader == null) {
            this.f28144w = new C12051a(new InputStreamReader(this.f27909e, m26386z()));
        } else {
            this.f28144w = new C12051a(reader);
        }
        this.f28145x = new BufferedWriter(new OutputStreamWriter(this.f27910f, m26386z()));
        if (this.f27913i <= 0) {
            m26359A();
            if (AbstractC11878c.m26416c(this.f28136o)) {
                m26359A();
                return;
            }
            return;
        }
        int soTimeout = this.f27906b.getSoTimeout();
        this.f27906b.setSoTimeout(this.f27913i);
        try {
            try {
                m26359A();
                if (AbstractC11878c.m26416c(this.f28136o)) {
                    m26359A();
                }
            } catch (SocketTimeoutException e10) {
                IOException iOException = new IOException("Timed out waiting for initial connect reply");
                iOException.initCause(e10);
                throw iOException;
            }
        } finally {
            this.f27906b.setSoTimeout(soTimeout);
        }
    }

    /* renamed from: v */
    public final String m26382v(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (str2 != null) {
            sb2.append(' ');
            sb2.append(str2);
        }
        sb2.append("\r\n");
        return sb2.toString();
    }

    /* renamed from: w */
    public int m26383w(InetAddress inetAddress, int i10) {
        StringBuilder sb2 = new StringBuilder();
        String hostAddress = inetAddress.getHostAddress();
        int iIndexOf = hostAddress.indexOf(37);
        if (iIndexOf > 0) {
            hostAddress = hostAddress.substring(0, iIndexOf);
        }
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        if (inetAddress instanceof Inet4Address) {
            sb2.append("1");
        } else if (inetAddress instanceof Inet6Address) {
            sb2.append("2");
        }
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append(hostAddress);
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append(i10);
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        return m26374P(FTPCmd.EPRT, sb2.toString());
    }

    /* renamed from: x */
    public int m26384x() {
        return m26373O(FTPCmd.EPSV);
    }

    /* renamed from: y */
    public int m26385y() {
        return m26373O(FTPCmd.FEAT);
    }

    /* renamed from: z */
    public String m26386z() {
        return this.f28140s;
    }
}
