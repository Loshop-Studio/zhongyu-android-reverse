package p411xe;

import anet.channel.request.Request;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ftp.FTPCmd;
import p441ze.AbstractC12056f;
import p441ze.C12051a;
import p441ze.C12052b;
import p441ze.C12055e;
import p441ze.InterfaceC12053c;
import ye.C11946a;
import ye.InterfaceC11947b;

/* renamed from: xe.b */
/* loaded from: classes6.dex */
public class C11877b extends AbstractC11876a {

    /* renamed from: d0 */
    public static final Pattern f28146d0 = Pattern.compile("(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})");

    /* renamed from: A */
    public int f28147A;

    /* renamed from: B */
    public String f28148B;

    /* renamed from: C */
    public final Random f28149C;

    /* renamed from: D */
    public int f28150D;

    /* renamed from: E */
    public int f28151E;

    /* renamed from: F */
    public InetAddress f28152F;

    /* renamed from: G */
    public InetAddress f28153G;

    /* renamed from: H */
    public InetAddress f28154H;

    /* renamed from: I */
    public int f28155I;

    /* renamed from: J */
    public int f28156J;

    /* renamed from: K */
    public int f28157K;

    /* renamed from: L */
    public int f28158L;

    /* renamed from: M */
    public boolean f28159M;

    /* renamed from: N */
    public long f28160N;

    /* renamed from: O */
    public InterfaceC11947b f28161O;

    /* renamed from: P */
    public int f28162P;

    /* renamed from: Q */
    public int f28163Q;

    /* renamed from: R */
    public int f28164R;

    /* renamed from: S */
    public boolean f28165S;

    /* renamed from: T */
    public boolean f28166T;

    /* renamed from: U */
    public String f28167U;

    /* renamed from: V */
    public String f28168V;

    /* renamed from: W */
    public InterfaceC12053c f28169W;

    /* renamed from: X */
    public long f28170X;

    /* renamed from: Z */
    public int[] f28172Z;

    /* renamed from: c0 */
    public HashMap f28175c0;

    /* renamed from: y */
    public int f28176y;

    /* renamed from: z */
    public int f28177z;

    /* renamed from: Y */
    public int f28171Y = 1000;

    /* renamed from: a0 */
    public b f28173a0 = new c(this);

    /* renamed from: b0 */
    public boolean f28174b0 = false;

    /* renamed from: xe.b$a */
    public static class a implements InterfaceC12053c {

        /* renamed from: a */
        public final C11877b f28178a;

        /* renamed from: b */
        public final long f28179b;

        /* renamed from: c */
        public final int f28180c;

        /* renamed from: d */
        public long f28181d = System.currentTimeMillis();

        /* renamed from: e */
        public int f28182e;

        /* renamed from: f */
        public int f28183f;

        /* renamed from: g */
        public int f28184g;

        public a(C11877b c11877b, long j10, int i10) throws SocketException {
            this.f28179b = j10;
            this.f28178a = c11877b;
            this.f28180c = c11877b.m25984m();
            c11877b.m25988q(i10);
        }

        @Override // p441ze.InterfaceC12053c
        /* renamed from: a */
        public void mo26412a(long j10, int i10, long j11) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f28181d > this.f28179b) {
                try {
                    this.f28178a.m26380t();
                    this.f28183f++;
                } catch (SocketTimeoutException unused) {
                    this.f28182e++;
                } catch (IOException unused2) {
                    this.f28184g++;
                }
                this.f28181d = jCurrentTimeMillis;
            }
        }

        /* renamed from: b */
        public int[] m26413b() throws SocketException {
            int i10 = this.f28182e;
            while (this.f28182e > 0) {
                try {
                    this.f28178a.m26359A();
                    this.f28182e--;
                } catch (SocketTimeoutException unused) {
                } catch (Throwable th) {
                    this.f28178a.m25988q(this.f28180c);
                    throw th;
                }
            }
            this.f28178a.m25988q(this.f28180c);
            return new int[]{this.f28183f, i10, this.f28182e, this.f28184g};
        }
    }

    /* renamed from: xe.b$b */
    public interface b {
        String resolve(String str);
    }

    /* renamed from: xe.b$c */
    public static class c implements b {

        /* renamed from: a */
        public final C11877b f28185a;

        public c(C11877b c11877b) {
            this.f28185a = c11877b;
        }

        @Override // p411xe.C11877b.b
        public String resolve(String str) {
            if (!InetAddress.getByName(str).isSiteLocalAddress()) {
                return str;
            }
            InetAddress inetAddressM25983l = this.f28185a.m25983l();
            return !inetAddressM25983l.isSiteLocalAddress() ? inetAddressM25983l.getHostAddress() : str;
        }
    }

    public C11877b() {
        m26401i0();
        this.f28177z = -1;
        this.f28159M = true;
        this.f28161O = new C11946a();
        this.f28165S = false;
        this.f28166T = false;
        this.f28149C = new Random();
        this.f28154H = null;
    }

    /* renamed from: U */
    public Socket m26387U(String str, String str2) throws IOException, NumberFormatException {
        Socket socketAccept;
        int i10 = this.f28176y;
        if (i10 != 0 && i10 != 2) {
            return null;
        }
        boolean z10 = m25983l() instanceof Inet6Address;
        if (this.f28176y == 0) {
            ServerSocket serverSocketCreateServerSocket = this.f27912h.createServerSocket(m26394b0(), 1, m26398f0());
            try {
                if (z10) {
                    if (!AbstractC11878c.m26414a(m26383w(m26399g0(), serverSocketCreateServerSocket.getLocalPort()))) {
                        serverSocketCreateServerSocket.close();
                        return null;
                    }
                } else if (!AbstractC11878c.m26414a(m26368J(m26399g0(), serverSocketCreateServerSocket.getLocalPort()))) {
                    serverSocketCreateServerSocket.close();
                    return null;
                }
                long j10 = this.f28160N;
                if (j10 > 0 && !m26407o0(j10)) {
                    if (serverSocketCreateServerSocket != null) {
                        serverSocketCreateServerSocket.close();
                    }
                    return null;
                }
                if (!AbstractC11878c.m26416c(m26372N(str, str2))) {
                    if (serverSocketCreateServerSocket != null) {
                        serverSocketCreateServerSocket.close();
                    }
                    return null;
                }
                int i11 = this.f28177z;
                if (i11 >= 0) {
                    serverSocketCreateServerSocket.setSoTimeout(i11);
                }
                socketAccept = serverSocketCreateServerSocket.accept();
                int i12 = this.f28177z;
                if (i12 >= 0) {
                    socketAccept.setSoTimeout(i12);
                }
                int i13 = this.f28164R;
                if (i13 > 0) {
                    socketAccept.setReceiveBufferSize(i13);
                }
                int i14 = this.f28163Q;
                if (i14 > 0) {
                    socketAccept.setSendBufferSize(i14);
                }
                serverSocketCreateServerSocket.close();
            } finally {
            }
        } else {
            if ((m26403k0() || z10) && m26384x() == 229) {
                m26388V((String) this.f28137p.get(0));
            } else {
                if (z10 || m26367I() != 227) {
                    return null;
                }
                m26389W((String) this.f28137p.get(0));
            }
            Socket socketCreateSocket = this.f27911g.createSocket();
            int i15 = this.f28164R;
            if (i15 > 0) {
                socketCreateSocket.setReceiveBufferSize(i15);
            }
            int i16 = this.f28163Q;
            if (i16 > 0) {
                socketCreateSocket.setSendBufferSize(i16);
            }
            if (this.f28154H != null) {
                socketCreateSocket.bind(new InetSocketAddress(this.f28154H, 0));
            }
            int i17 = this.f28177z;
            if (i17 >= 0) {
                socketCreateSocket.setSoTimeout(i17);
            }
            socketCreateSocket.connect(new InetSocketAddress(this.f28148B, this.f28147A), this.f27913i);
            long j11 = this.f28160N;
            if (j11 > 0 && !m26407o0(j11)) {
                socketCreateSocket.close();
                return null;
            }
            if (!AbstractC11878c.m26416c(m26372N(str, str2))) {
                socketCreateSocket.close();
                return null;
            }
            socketAccept = socketCreateSocket;
        }
        if (!this.f28159M || m25989r(socketAccept)) {
            return socketAccept;
        }
        InetAddress inetAddress = socketAccept.getInetAddress();
        socketAccept.close();
        throw new IOException("Host attempting data connection " + inetAddress.getHostAddress() + " is not same as server " + m25983l().getHostAddress());
    }

    /* renamed from: V */
    public void m26388V(String str) throws MalformedServerReplyException, NumberFormatException {
        String strTrim = str.substring(str.indexOf(40) + 1, str.indexOf(41)).trim();
        char cCharAt = strTrim.charAt(0);
        char cCharAt2 = strTrim.charAt(1);
        char cCharAt3 = strTrim.charAt(2);
        char cCharAt4 = strTrim.charAt(strTrim.length() - 1);
        if (cCharAt != cCharAt2 || cCharAt2 != cCharAt3 || cCharAt3 != cCharAt4) {
            throw new MalformedServerReplyException("Could not parse extended passive host information.\nServer Reply: " + strTrim);
        }
        try {
            int i10 = Integer.parseInt(strTrim.substring(3, strTrim.length() - 1));
            this.f28148B = m25983l().getHostAddress();
            this.f28147A = i10;
        } catch (NumberFormatException unused) {
            throw new MalformedServerReplyException("Could not parse extended passive host information.\nServer Reply: " + strTrim);
        }
    }

    /* renamed from: W */
    public void m26389W(String str) throws MalformedServerReplyException {
        Matcher matcher = f28146d0.matcher(str);
        if (!matcher.find()) {
            throw new MalformedServerReplyException("Could not parse passive host information.\nServer Reply: " + str);
        }
        this.f28148B = "0,0,0,0".equals(matcher.group(1)) ? this.f27906b.getInetAddress().getHostAddress() : matcher.group(1).replace(',', '.');
        try {
            this.f28147A = Integer.parseInt(matcher.group(3)) | (Integer.parseInt(matcher.group(2)) << 8);
            b bVar = this.f28173a0;
            if (bVar != null) {
                try {
                    String strResolve = bVar.resolve(this.f28148B);
                    if (this.f28148B.equals(strResolve)) {
                        return;
                    }
                    m25980i(0, "[Replacing PASV mode reply address " + this.f28148B + " with " + strResolve + "]\n");
                    this.f28148B = strResolve;
                } catch (UnknownHostException unused) {
                    throw new MalformedServerReplyException("Could not parse passive host information.\nServer Reply: " + str);
                }
            }
        } catch (NumberFormatException unused2) {
            throw new MalformedServerReplyException("Could not parse passive port information.\nServer Reply: " + str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m26390X(java.lang.String r10, java.lang.String r11, java.io.OutputStream r12) throws java.lang.Throwable {
        /*
            r9 = this;
            java.net.Socket r10 = r9.m26387U(r10, r11)
            if (r10 != 0) goto L8
            r10 = 0
            return r10
        L8:
            r11 = 0
            int r0 = r9.f28155I     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L20
            ze.d r0 = new ze.d     // Catch: java.lang.Throwable -> L1c
            java.io.InputStream r1 = r10.getInputStream()     // Catch: java.lang.Throwable -> L1c
            java.io.InputStream r1 = r9.m26396d0(r1)     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
        L1a:
            r1 = r0
            goto L29
        L1c:
            r0 = move-exception
            r12 = r0
            r12 = r11
            goto L64
        L20:
            java.io.InputStream r0 = r10.getInputStream()     // Catch: java.lang.Throwable -> L1c
            java.io.InputStream r0 = r9.m26396d0(r0)     // Catch: java.lang.Throwable -> L1c
            goto L1a
        L29:
            long r2 = r9.f28170X     // Catch: java.lang.Throwable -> L3a
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L3f
            xe.b$a r0 = new xe.b$a     // Catch: java.lang.Throwable -> L3a
            int r4 = r9.f28171Y     // Catch: java.lang.Throwable -> L3a
            r0.<init>(r9, r2, r4)     // Catch: java.lang.Throwable -> L3a
            r11 = r0
            goto L3f
        L3a:
            r0 = move-exception
            r12 = r0
            r12 = r11
            r11 = r1
            goto L64
        L3f:
            int r3 = r9.m26395c0()     // Catch: java.lang.Throwable -> L3a
            ze.c r6 = r9.m26406n0(r11)     // Catch: java.lang.Throwable -> L3a
            r7 = 0
            r4 = -1
            r2 = r12
            p441ze.AbstractC12056f.m26697c(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L3a
            p441ze.AbstractC12056f.m26695a(r1)     // Catch: java.lang.Throwable -> L61
            boolean r12 = r9.m26392Z()     // Catch: java.lang.Throwable -> L61
            p441ze.AbstractC12056f.m26696b(r10)
            if (r11 == 0) goto L60
            int[] r10 = r11.m26413b()
            r9.f28172Z = r10
        L60:
            return r12
        L61:
            r0 = move-exception
            r12 = r0
            goto L6d
        L64:
            p441ze.AbstractC12056f.m26695a(r11)     // Catch: java.lang.Throwable -> L68
            throw r0     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            r11 = r0
            r8 = r12
            r12 = r11
            r11 = r8
        L6d:
            p441ze.AbstractC12056f.m26696b(r10)
            if (r11 == 0) goto L78
            int[] r10 = r11.m26413b()
            r9.f28172Z = r10
        L78:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p411xe.C11877b.m26390X(java.lang.String, java.lang.String, java.io.OutputStream):boolean");
    }

    /* renamed from: Y */
    public boolean m26391Y(String str, String str2, InputStream inputStream) throws IOException, NumberFormatException {
        Socket socketM26387U = m26387U(str, str2);
        if (socketM26387U == null) {
            return false;
        }
        OutputStream c12055e = this.f28155I == 0 ? new C12055e(m26397e0(socketM26387U.getOutputStream())) : m26397e0(socketM26387U.getOutputStream());
        long j10 = this.f28170X;
        a aVar = j10 > 0 ? new a(this, j10, this.f28171Y) : null;
        try {
            try {
                AbstractC12056f.m26697c(inputStream, c12055e, m26395c0(), -1L, m26406n0(aVar), false);
                c12055e.close();
                socketM26387U.close();
                boolean zM26392Z = m26392Z();
                if (aVar != null) {
                    this.f28172Z = aVar.m26413b();
                }
                return zM26392Z;
            } catch (IOException e10) {
                AbstractC12056f.m26695a(c12055e);
                AbstractC12056f.m26696b(socketM26387U);
                throw e10;
            }
        } finally {
        }
    }

    /* renamed from: Z */
    public boolean m26392Z() {
        return AbstractC11878c.m26414a(m26359A());
    }

    /* renamed from: a0 */
    public void m26393a0() {
        this.f28176y = 2;
        this.f28148B = null;
        this.f28147A = -1;
    }

    @Override // p395we.AbstractC11744a
    /* renamed from: b */
    public void mo25973b() throws SocketException {
        mo26381u(null);
    }

    /* renamed from: b0 */
    public final int m26394b0() {
        int i10;
        int i11 = this.f28150D;
        if (i11 <= 0 || (i10 = this.f28151E) < i11) {
            return 0;
        }
        return i10 == i11 ? i10 : this.f28149C.nextInt((i10 - i11) + 1) + this.f28150D;
    }

    /* renamed from: c0 */
    public int m26395c0() {
        return this.f28162P;
    }

    /* renamed from: d0 */
    public final InputStream m26396d0(InputStream inputStream) {
        return this.f28162P > 0 ? new BufferedInputStream(inputStream, this.f28162P) : new BufferedInputStream(inputStream);
    }

    /* renamed from: e0 */
    public final OutputStream m26397e0(OutputStream outputStream) {
        return this.f28162P > 0 ? new BufferedOutputStream(outputStream, this.f28162P) : new BufferedOutputStream(outputStream);
    }

    /* renamed from: f0 */
    public final InetAddress m26398f0() {
        InetAddress inetAddress = this.f28152F;
        return inetAddress != null ? inetAddress : m25982k();
    }

    @Override // p411xe.AbstractC11876a, p395we.AbstractC11744a
    /* renamed from: g */
    public void mo25978g() throws IOException {
        super.mo25978g();
        m26401i0();
    }

    /* renamed from: g0 */
    public final InetAddress m26399g0() {
        InetAddress inetAddress = this.f28153G;
        return inetAddress != null ? inetAddress : m26398f0();
    }

    /* renamed from: h0 */
    public boolean m26400h0(String str) {
        if (m26402j0()) {
            return this.f28175c0.containsKey(str.toUpperCase(Locale.ENGLISH));
        }
        return false;
    }

    /* renamed from: i0 */
    public final void m26401i0() {
        this.f28176y = 0;
        this.f28148B = null;
        this.f28147A = -1;
        this.f28152F = null;
        this.f28153G = null;
        this.f28150D = 0;
        this.f28151E = 0;
        this.f28155I = 0;
        this.f28157K = 7;
        this.f28156J = 4;
        this.f28158L = 10;
        this.f28160N = 0L;
        this.f28167U = null;
        this.f28168V = "";
        this.f28175c0 = null;
    }

    /* renamed from: j0 */
    public final boolean m26402j0() {
        String strSubstring;
        String strSubstring2;
        if (this.f28175c0 == null) {
            int iM26385y = m26385y();
            int i10 = 0;
            if (iM26385y == 530) {
                return false;
            }
            boolean zM26414a = AbstractC11878c.m26414a(iM26385y);
            this.f28175c0 = new HashMap();
            if (!zM26414a) {
                return false;
            }
            ArrayList arrayList = this.f28137p;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str = (String) obj;
                if (str.startsWith(" ")) {
                    int iIndexOf = str.indexOf(32, 1);
                    if (iIndexOf > 0) {
                        strSubstring = str.substring(1, iIndexOf);
                        strSubstring2 = str.substring(iIndexOf + 1);
                    } else {
                        strSubstring = str.substring(1);
                        strSubstring2 = "";
                    }
                    String upperCase = strSubstring.toUpperCase(Locale.ENGLISH);
                    Set hashSet = (Set) this.f28175c0.get(upperCase);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        this.f28175c0.put(upperCase, hashSet);
                    }
                    hashSet.add(strSubstring2);
                }
            }
        }
        return true;
    }

    /* renamed from: k0 */
    public boolean m26403k0() {
        return this.f28166T;
    }

    /* renamed from: l0 */
    public boolean m26404l0(String str, String str2) {
        m26378T(str);
        if (AbstractC11878c.m26414a(this.f28136o)) {
            return true;
        }
        if (AbstractC11878c.m26415b(this.f28136o)) {
            return AbstractC11878c.m26414a(m26366H(str2));
        }
        return false;
    }

    /* renamed from: m0 */
    public boolean m26405m0() {
        return AbstractC11878c.m26414a(m26369K());
    }

    /* renamed from: n0 */
    public final InterfaceC12053c m26406n0(InterfaceC12053c interfaceC12053c) {
        if (interfaceC12053c == null) {
            return this.f28169W;
        }
        if (this.f28169W == null) {
            return interfaceC12053c;
        }
        C12052b c12052b = new C12052b();
        c12052b.m26694b(interfaceC12053c);
        c12052b.m26694b(this.f28169W);
        return c12052b;
    }

    /* renamed from: o0 */
    public boolean m26407o0(long j10) {
        this.f28160N = 0L;
        return AbstractC11878c.m26415b(m26370L(Long.toString(j10)));
    }

    /* renamed from: p0 */
    public boolean m26408p0(String str, OutputStream outputStream) {
        return m26390X(FTPCmd.RETR.m22266a(), str, outputStream);
    }

    /* renamed from: q0 */
    public boolean m26409q0(int i10) {
        if (!AbstractC11878c.m26414a(m26377S(i10))) {
            return false;
        }
        this.f28155I = i10;
        this.f28156J = 4;
        return true;
    }

    /* renamed from: r0 */
    public boolean m26410r0(String str, InputStream inputStream) {
        return m26411s0(FTPCmd.STOR, str, inputStream);
    }

    /* renamed from: s0 */
    public final boolean m26411s0(FTPCmd fTPCmd, String str, InputStream inputStream) {
        return m26391Y(fTPCmd.m22266a(), str, inputStream);
    }

    @Override // p411xe.AbstractC11876a
    /* renamed from: u */
    public void mo26381u(Reader reader) throws SocketException {
        super.mo26381u(reader);
        m26401i0();
        if (this.f28174b0) {
            ArrayList arrayList = new ArrayList(this.f28137p);
            int i10 = this.f28136o;
            if (m26400h0("UTF8") || m26400h0(Request.DEFAULT_CHARSET)) {
                m26375Q(Request.DEFAULT_CHARSET);
                this.f28144w = new C12051a(new InputStreamReader(this.f27909e, m26386z()));
                this.f28145x = new BufferedWriter(new OutputStreamWriter(this.f27910f, m26386z()));
            }
            this.f28137p.clear();
            this.f28137p.addAll(arrayList);
            this.f28136o = i10;
            this.f28138q = true;
        }
    }
}
