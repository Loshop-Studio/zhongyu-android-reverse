package p262v1;

import android.net.ConnectivityManager;
import android.support.v4.media.session.PlaybackStateCompat;
import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import com.liulishuo.okdownload.core.exception.NetworkPolicyException;
import com.liulishuo.okdownload.core.exception.ResumeFailedException;
import com.liulishuo.okdownload.core.exception.ServerCanceledException;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p207q1.C8879d;
import p218r1.AbstractC8999c;
import p229s1.C9124a;
import p229s1.C9126c;
import p229s1.InterfaceC9129f;
import p229s1.InterfaceC9132i;
import p240t1.InterfaceC9377a;

/* renamed from: v1.g */
/* loaded from: classes4.dex */
public class C9660g {

    /* renamed from: c */
    public static final Pattern f16909c = Pattern.compile(".*\\\\|/([^\\\\|/|?]*)\\??");

    /* renamed from: a */
    public Boolean f16910a = null;

    /* renamed from: b */
    public ConnectivityManager f16911b = null;

    /* renamed from: v1.g$b */
    public static class b {

        /* renamed from: a */
        public InterfaceC9377a.a f16914a;

        /* renamed from: b */
        public C9126c f16915b;

        /* renamed from: c */
        public int f16916c;

        public b(InterfaceC9377a.a aVar, int i10, C9126c c9126c) {
            this.f16914a = aVar;
            this.f16915b = c9126c;
            this.f16916c = i10;
        }

        /* renamed from: a */
        public void m16152a() throws ResumeFailedException, ServerCanceledException {
            C9124a c9124aM15468c = this.f16915b.m15468c(this.f16916c);
            int iMo15678h = this.f16914a.mo15678h();
            ResumeFailedCause resumeFailedCauseM16139c = C8879d.m14905k().m14911f().m16139c(iMo15678h, c9124aM15468c.m15458c() != 0, this.f16915b, this.f16914a.mo15675c("Etag"));
            if (resumeFailedCauseM16139c != null) {
                throw new ResumeFailedException(resumeFailedCauseM16139c);
            }
            if (C8879d.m14905k().m14911f().m16143g(iMo15678h, c9124aM15468c.m15458c() != 0)) {
                throw new ServerCanceledException(iMo15678h, c9124aM15468c.m15458c());
            }
        }
    }

    /* renamed from: a */
    public int m16137a(C6327a c6327a, long j10) {
        if (c6327a.m4403w() != null) {
            return c6327a.m4403w().intValue();
        }
        if (j10 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return 1;
        }
        if (j10 < 5242880) {
            return 2;
        }
        if (j10 < 52428800) {
            return 3;
        }
        return j10 < 104857600 ? 4 : 5;
    }

    /* renamed from: b */
    public String m16138b(String str, C6327a c6327a) throws IOException {
        if (!AbstractC8999c.m15132p(str)) {
            return str;
        }
        String strMo4388f = c6327a.mo4388f();
        Matcher matcher = f16909c.matcher(strMo4388f);
        String strM15137u = null;
        while (matcher.find()) {
            strM15137u = matcher.group(1);
        }
        if (AbstractC8999c.m15132p(strM15137u)) {
            strM15137u = AbstractC8999c.m15137u(strMo4388f);
        }
        if (strM15137u != null) {
            return strM15137u;
        }
        throw new IOException("Can't find valid filename.");
    }

    /* renamed from: c */
    public ResumeFailedCause m16139c(int i10, boolean z9, C9126c c9126c, String str) {
        String strM15470e = c9126c.m15470e();
        if (i10 == 412) {
            return ResumeFailedCause.RESPONSE_PRECONDITION_FAILED;
        }
        if (!AbstractC8999c.m15132p(strM15470e) && !AbstractC8999c.m15132p(str) && !str.equals(strM15470e)) {
            return ResumeFailedCause.RESPONSE_ETAG_CHANGED;
        }
        if (i10 == 201 && z9) {
            return ResumeFailedCause.RESPONSE_CREATED_RANGE_NOT_FROM_0;
        }
        if (i10 == 205 && z9) {
            return ResumeFailedCause.RESPONSE_RESET_RANGE_NOT_FROM_0;
        }
        return null;
    }

    /* renamed from: d */
    public boolean m16140d(C6327a c6327a, C9126c c9126c, long j10) {
        InterfaceC9129f interfaceC9129fM14906a;
        C9126c c9126cMo15501d;
        if (!c6327a.m4377C() || (c9126cMo15501d = (interfaceC9129fM14906a = C8879d.m14905k().m14906a()).mo15501d(c6327a, c9126c)) == null) {
            return false;
        }
        interfaceC9129fM14906a.remove(c9126cMo15501d.m15474i());
        if (c9126cMo15501d.m15476k() <= C8879d.m14905k().m14911f().m16146j()) {
            return false;
        }
        if ((c9126cMo15501d.m15470e() != null && !c9126cMo15501d.m15470e().equals(c9126c.m15470e())) || c9126cMo15501d.m15475j() != j10 || c9126cMo15501d.m15471f() == null || !c9126cMo15501d.m15471f().exists()) {
            return false;
        }
        c9126c.m15482q(c9126cMo15501d);
        AbstractC8999c.m15125i("DownloadStrategy", "Reuse another same info: " + c9126c);
        return true;
    }

    /* renamed from: e */
    public void m16141e() throws UnknownHostException {
        if (this.f16910a == null) {
            this.f16910a = Boolean.valueOf(AbstractC8999c.m15121e("android.permission.ACCESS_NETWORK_STATE"));
        }
        if (this.f16910a.booleanValue()) {
            if (this.f16911b == null) {
                this.f16911b = (ConnectivityManager) C8879d.m14905k().m14909d().getSystemService("connectivity");
            }
            if (!AbstractC8999c.m15133q(this.f16911b)) {
                throw new UnknownHostException("network is not available!");
            }
        }
    }

    /* renamed from: f */
    public void m16142f(C6327a c6327a) throws IOException {
        if (this.f16910a == null) {
            this.f16910a = Boolean.valueOf(AbstractC8999c.m15121e("android.permission.ACCESS_NETWORK_STATE"));
        }
        if (c6327a.m4379E()) {
            if (!this.f16910a.booleanValue()) {
                throw new IOException("required for access network state but don't have the permission of Manifest.permission.ACCESS_NETWORK_STATE, please declare this permission first on your AndroidManifest, so we can handle the case of downloading required wifi state.");
            }
            if (this.f16911b == null) {
                this.f16911b = (ConnectivityManager) C8879d.m14905k().m14909d().getSystemService("connectivity");
            }
            if (AbstractC8999c.m15134r(this.f16911b)) {
                throw new NetworkPolicyException();
            }
        }
    }

    /* renamed from: g */
    public boolean m16143g(int i10, boolean z9) {
        if (i10 == 206 || i10 == 200) {
            return i10 == 200 && z9;
        }
        return true;
    }

    /* renamed from: h */
    public boolean m16144h(boolean z9) {
        if (C8879d.m14905k().m14913h().mo16264b()) {
            return z9;
        }
        return false;
    }

    /* renamed from: i */
    public b m16145i(InterfaceC9377a.a aVar, int i10, C9126c c9126c) {
        return new b(aVar, i10, c9126c);
    }

    /* renamed from: j */
    public long m16146j() {
        return 10240L;
    }

    /* renamed from: k */
    public void m16147k(String str, C6327a c6327a, C9126c c9126c) throws IOException {
        if (AbstractC8999c.m15132p(c6327a.mo4384b())) {
            String strM16138b = m16138b(str, c6327a);
            if (AbstractC8999c.m15132p(c6327a.mo4384b())) {
                synchronized (c6327a) {
                    try {
                        if (AbstractC8999c.m15132p(c6327a.mo4384b())) {
                            c6327a.m4393m().m16151b(strM16138b);
                            c9126c.m15473h().m16151b(strM16138b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public boolean m16148l(C6327a c6327a) {
        String strMo15504i = C8879d.m14905k().m14906a().mo15504i(c6327a.mo4388f());
        if (strMo15504i == null) {
            return false;
        }
        c6327a.m4393m().m16151b(strMo15504i);
        return true;
    }

    /* renamed from: m */
    public void m16149m(C6327a c6327a, InterfaceC9132i interfaceC9132i) {
        long length;
        C9126c c9126cMo15510k = interfaceC9132i.mo15510k(c6327a.mo4385c());
        if (c9126cMo15510k == null) {
            c9126cMo15510k = new C9126c(c6327a.mo4385c(), c6327a.mo4388f(), c6327a.mo4386d(), c6327a.mo4384b());
            if (AbstractC8999c.m15135s(c6327a.m4375A())) {
                length = AbstractC8999c.m15129m(c6327a.m4375A());
            } else {
                File fileM4392l = c6327a.m4392l();
                if (fileM4392l == null) {
                    AbstractC8999c.m15142z("DownloadStrategy", "file is not ready on valid info for task on complete state " + c6327a);
                    length = 0;
                } else {
                    length = fileM4392l.length();
                }
            }
            long j10 = length;
            c9126cMo15510k.m15466a(new C9124a(0L, j10, j10));
        }
        C6327a.c.m4411b(c6327a, c9126cMo15510k);
    }

    /* renamed from: v1.g$a */
    public static class a {

        /* renamed from: a */
        public volatile String f16912a;

        /* renamed from: b */
        public final boolean f16913b = false;

        public a() {
        }

        /* renamed from: a */
        public String m16150a() {
            return this.f16912a;
        }

        /* renamed from: b */
        public void m16151b(String str) {
            this.f16912a = str;
        }

        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return true;
            }
            if (obj instanceof a) {
                return this.f16912a == null ? ((a) obj).f16912a == null : this.f16912a.equals(((a) obj).f16912a);
            }
            return false;
        }

        public int hashCode() {
            if (this.f16912a == null) {
                return 0;
            }
            return this.f16912a.hashCode();
        }

        public a(String str) {
            this.f16912a = str;
        }
    }
}
