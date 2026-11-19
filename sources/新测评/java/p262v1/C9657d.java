package p262v1;

import com.liulishuo.okdownload.core.exception.FileBusyAfterRunException;
import com.liulishuo.okdownload.core.exception.InterruptException;
import com.liulishuo.okdownload.core.exception.PreAllocateException;
import com.liulishuo.okdownload.core.exception.ResumeFailedException;
import com.liulishuo.okdownload.core.exception.ServerCanceledException;
import java.io.IOException;
import java.net.SocketException;
import p218r1.AbstractC8999c;
import p272w1.C9730d;

/* renamed from: v1.d */
/* loaded from: classes4.dex */
public class C9657d {

    /* renamed from: a */
    public String f16873a;

    /* renamed from: b */
    public final C9730d f16874b;

    /* renamed from: c */
    public volatile boolean f16875c;

    /* renamed from: d */
    public volatile boolean f16876d;

    /* renamed from: e */
    public volatile boolean f16877e;

    /* renamed from: f */
    public volatile boolean f16878f;

    /* renamed from: g */
    public volatile boolean f16879g;

    /* renamed from: h */
    public volatile boolean f16880h;

    /* renamed from: i */
    public volatile IOException f16881i;

    /* renamed from: v1.d$a */
    public static class a extends C9657d {
        public a(IOException iOException) {
            super(null);
            m16096q(iOException);
        }
    }

    public C9657d(C9730d c9730d) {
        this.f16874b = c9730d;
    }

    /* renamed from: a */
    public void m16080a(IOException iOException) {
        if (m16090k()) {
            return;
        }
        if (iOException instanceof ResumeFailedException) {
            m16093n(iOException);
            return;
        }
        if (iOException instanceof ServerCanceledException) {
            m16095p(iOException);
            return;
        }
        if (iOException == FileBusyAfterRunException.f4724a) {
            m16091l();
            return;
        }
        if (iOException instanceof PreAllocateException) {
            m16092m(iOException);
            return;
        }
        if (iOException != InterruptException.f4725a) {
            m16096q(iOException);
            if (iOException instanceof SocketException) {
                return;
            }
            AbstractC8999c.m15125i("DownloadCache", "catch unknown error " + iOException);
        }
    }

    /* renamed from: b */
    public C9730d m16081b() {
        C9730d c9730d = this.f16874b;
        if (c9730d != null) {
            return c9730d;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public IOException m16082c() {
        return this.f16881i;
    }

    /* renamed from: d */
    public String m16083d() {
        return this.f16873a;
    }

    /* renamed from: e */
    public boolean m16084e() {
        return this.f16879g;
    }

    /* renamed from: f */
    public boolean m16085f() {
        return this.f16875c || this.f16876d || this.f16877e || this.f16878f || this.f16879g || this.f16880h;
    }

    /* renamed from: g */
    public boolean m16086g() {
        return this.f16880h;
    }

    /* renamed from: h */
    public boolean m16087h() {
        return this.f16875c;
    }

    /* renamed from: i */
    public boolean m16088i() {
        return this.f16877e;
    }

    /* renamed from: j */
    public boolean m16089j() {
        return this.f16878f;
    }

    /* renamed from: k */
    public boolean m16090k() {
        return this.f16876d;
    }

    /* renamed from: l */
    public void m16091l() {
        this.f16879g = true;
    }

    /* renamed from: m */
    public void m16092m(IOException iOException) {
        this.f16880h = true;
        this.f16881i = iOException;
    }

    /* renamed from: n */
    public void m16093n(IOException iOException) {
        this.f16875c = true;
        this.f16881i = iOException;
    }

    /* renamed from: o */
    public void m16094o(String str) {
        this.f16873a = str;
    }

    /* renamed from: p */
    public void m16095p(IOException iOException) {
        this.f16877e = true;
        this.f16881i = iOException;
    }

    /* renamed from: q */
    public void m16096q(IOException iOException) {
        this.f16878f = true;
        this.f16881i = iOException;
    }

    /* renamed from: r */
    public void m16097r() {
        this.f16876d = true;
    }
}
