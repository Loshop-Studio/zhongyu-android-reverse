package p259u1;

import android.net.ConnectivityManager;
import android.support.v4.media.session.PlaybackStateCompat;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import com.liulishuo.okdownload.core.exception.NetworkPolicyException;
import com.liulishuo.okdownload.core.exception.ResumeFailedException;
import com.liulishuo.okdownload.core.exception.ServerCanceledException;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p209p1.C9315d;
import p219q1.AbstractC9353c;
import p229r1.C9417a;
import p229r1.C9419c;
import p229r1.InterfaceC9422f;
import p229r1.InterfaceC9425i;
import p239s1.InterfaceC9465a;

/* renamed from: u1.g */
/* loaded from: classes4.dex */
public class C9665g {

    /* renamed from: c */
    public static final Pattern f17061c = Pattern.compile(".*\\\\|/([^\\\\|/|?]*)\\??");

    /* renamed from: a */
    public Boolean f17062a = null;

    /* renamed from: b */
    public ConnectivityManager f17063b = null;

    /* renamed from: u1.g$b */
    public static class b {

        /* renamed from: a */
        public InterfaceC9465a.a f17066a;

        /* renamed from: b */
        public C9419c f17067b;

        /* renamed from: c */
        public int f17068c;

        public b(InterfaceC9465a.a aVar, int i9, C9419c c9419c) {
            this.f17066a = aVar;
            this.f17067b = c9419c;
            this.f17068c = i9;
        }

        /* renamed from: a */
        public void m16113a() throws ResumeFailedException, ServerCanceledException {
            C9417a c9417aM15522c = this.f17067b.m15522c(this.f17068c);
            int iMo15642h = this.f17066a.mo15642h();
            ResumeFailedCause resumeFailedCauseM16100c = C9315d.m15182k().m15188f().m16100c(iMo15642h, c9417aM15522c.m15512c() != 0, this.f17067b, this.f17066a.mo15639c("Etag"));
            if (resumeFailedCauseM16100c != null) {
                throw new ResumeFailedException(resumeFailedCauseM16100c);
            }
            if (C9315d.m15182k().m15188f().m16104g(iMo15642h, c9417aM15522c.m15512c() != 0)) {
                throw new ServerCanceledException(iMo15642h, c9417aM15522c.m15512c());
            }
        }
    }

    /* renamed from: a */
    public int m16098a(C6593a c6593a, long j9) {
        if (c6593a.m4607w() != null) {
            return c6593a.m4607w().intValue();
        }
        if (j9 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return 1;
        }
        if (j9 < 5242880) {
            return 2;
        }
        if (j9 < 52428800) {
            return 3;
        }
        return j9 < 104857600 ? 4 : 5;
    }

    /* renamed from: b */
    public String m16099b(String str, C6593a c6593a) throws IOException {
        if (!AbstractC9353c.m15313p(str)) {
            return str;
        }
        String strMo4592f = c6593a.mo4592f();
        Matcher matcher = f17061c.matcher(strMo4592f);
        String strM15318u = null;
        while (matcher.find()) {
            strM15318u = matcher.group(1);
        }
        if (AbstractC9353c.m15313p(strM15318u)) {
            strM15318u = AbstractC9353c.m15318u(strMo4592f);
        }
        if (strM15318u != null) {
            return strM15318u;
        }
        throw new IOException("Can't find valid filename.");
    }

    /* renamed from: c */
    public ResumeFailedCause m16100c(int i9, boolean z9, C9419c c9419c, String str) {
        String strM15524e = c9419c.m15524e();
        if (i9 == 412) {
            return ResumeFailedCause.RESPONSE_PRECONDITION_FAILED;
        }
        if (!AbstractC9353c.m15313p(strM15524e) && !AbstractC9353c.m15313p(str) && !str.equals(strM15524e)) {
            return ResumeFailedCause.RESPONSE_ETAG_CHANGED;
        }
        if (i9 == 201 && z9) {
            return ResumeFailedCause.RESPONSE_CREATED_RANGE_NOT_FROM_0;
        }
        if (i9 == 205 && z9) {
            return ResumeFailedCause.RESPONSE_RESET_RANGE_NOT_FROM_0;
        }
        return null;
    }

    /* renamed from: d */
    public boolean m16101d(C6593a c6593a, C9419c c9419c, long j9) {
        InterfaceC9422f interfaceC9422fM15183a;
        C9419c c9419cMo15556e;
        if (!c6593a.m4581C() || (c9419cMo15556e = (interfaceC9422fM15183a = C9315d.m15182k().m15183a()).mo15556e(c6593a, c9419c)) == null) {
            return false;
        }
        interfaceC9422fM15183a.remove(c9419cMo15556e.m15528i());
        if (c9419cMo15556e.m15530k() <= C9315d.m15182k().m15188f().m16107j()) {
            return false;
        }
        if ((c9419cMo15556e.m15524e() != null && !c9419cMo15556e.m15524e().equals(c9419c.m15524e())) || c9419cMo15556e.m15529j() != j9 || c9419cMo15556e.m15525f() == null || !c9419cMo15556e.m15525f().exists()) {
            return false;
        }
        c9419c.m15536q(c9419cMo15556e);
        AbstractC9353c.m15306i("DownloadStrategy", "Reuse another same info: " + c9419c);
        return true;
    }

    /* renamed from: e */
    public void m16102e() throws UnknownHostException {
        if (this.f17062a == null) {
            this.f17062a = Boolean.valueOf(AbstractC9353c.m15302e("android.permission.ACCESS_NETWORK_STATE"));
        }
        if (this.f17062a.booleanValue()) {
            if (this.f17063b == null) {
                this.f17063b = (ConnectivityManager) C9315d.m15182k().m15186d().getSystemService("connectivity");
            }
            if (!AbstractC9353c.m15314q(this.f17063b)) {
                throw new UnknownHostException("network is not available!");
            }
        }
    }

    /* renamed from: f */
    public void m16103f(C6593a c6593a) throws IOException {
        if (this.f17062a == null) {
            this.f17062a = Boolean.valueOf(AbstractC9353c.m15302e("android.permission.ACCESS_NETWORK_STATE"));
        }
        if (c6593a.m4583E()) {
            if (!this.f17062a.booleanValue()) {
                throw new IOException("required for access network state but don't have the permission of Manifest.permission.ACCESS_NETWORK_STATE, please declare this permission first on your AndroidManifest, so we can handle the case of downloading required wifi state.");
            }
            if (this.f17063b == null) {
                this.f17063b = (ConnectivityManager) C9315d.m15182k().m15186d().getSystemService("connectivity");
            }
            if (AbstractC9353c.m15315r(this.f17063b)) {
                throw new NetworkPolicyException();
            }
        }
    }

    /* renamed from: g */
    public boolean m16104g(int i9, boolean z9) {
        if (i9 == 206 || i9 == 200) {
            return i9 == 200 && z9;
        }
        return true;
    }

    /* renamed from: h */
    public boolean m16105h(boolean z9) {
        if (C9315d.m15182k().m15190h().mo16297b()) {
            return z9;
        }
        return false;
    }

    /* renamed from: i */
    public b m16106i(InterfaceC9465a.a aVar, int i9, C9419c c9419c) {
        return new b(aVar, i9, c9419c);
    }

    /* renamed from: j */
    public long m16107j() {
        return 10240L;
    }

    /* renamed from: k */
    public void m16108k(String str, C6593a c6593a, C9419c c9419c) throws IOException {
        if (AbstractC9353c.m15313p(c6593a.mo4588b())) {
            String strM16099b = m16099b(str, c6593a);
            if (AbstractC9353c.m15313p(c6593a.mo4588b())) {
                synchronized (c6593a) {
                    try {
                        if (AbstractC9353c.m15313p(c6593a.mo4588b())) {
                            c6593a.m4597m().m16112b(strM16099b);
                            c9419c.m15527h().m16112b(strM16099b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public boolean m16109l(C6593a c6593a) {
        String strMo15557g = C9315d.m15182k().m15183a().mo15557g(c6593a.mo4592f());
        if (strMo15557g == null) {
            return false;
        }
        c6593a.m4597m().m16112b(strMo15557g);
        return true;
    }

    /* renamed from: m */
    public void m16110m(C6593a c6593a, InterfaceC9425i interfaceC9425i) {
        long length;
        C9419c c9419cMo15563i = interfaceC9425i.mo15563i(c6593a.mo4589c());
        if (c9419cMo15563i == null) {
            c9419cMo15563i = new C9419c(c6593a.mo4589c(), c6593a.mo4592f(), c6593a.mo4590d(), c6593a.mo4588b());
            if (AbstractC9353c.m15316s(c6593a.m4579A())) {
                length = AbstractC9353c.m15310m(c6593a.m4579A());
            } else {
                File fileM4596l = c6593a.m4596l();
                if (fileM4596l == null) {
                    AbstractC9353c.m15323z("DownloadStrategy", "file is not ready on valid info for task on complete state " + c6593a);
                    length = 0;
                } else {
                    length = fileM4596l.length();
                }
            }
            long j9 = length;
            c9419cMo15563i.m15520a(new C9417a(0L, j9, j9));
        }
        C6593a.c.m4616b(c6593a, c9419cMo15563i);
    }

    /* renamed from: u1.g$a */
    public static class a {

        /* renamed from: a */
        public volatile String f17064a;

        /* renamed from: b */
        public final boolean f17065b = false;

        public a() {
        }

        /* renamed from: a */
        public String m16111a() {
            return this.f17064a;
        }

        /* renamed from: b */
        public void m16112b(String str) {
            this.f17064a = str;
        }

        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return true;
            }
            if (obj instanceof a) {
                return this.f17064a == null ? ((a) obj).f17064a == null : this.f17064a.equals(((a) obj).f17064a);
            }
            return false;
        }

        public int hashCode() {
            if (this.f17064a == null) {
                return 0;
            }
            return this.f17064a.hashCode();
        }

        public a(String str) {
            this.f17064a = str;
        }
    }
}
