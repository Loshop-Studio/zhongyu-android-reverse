package p259u1;

import com.liulishuo.okdownload.core.exception.FileBusyAfterRunException;
import com.liulishuo.okdownload.core.exception.InterruptException;
import com.liulishuo.okdownload.core.exception.PreAllocateException;
import com.liulishuo.okdownload.core.exception.ResumeFailedException;
import com.liulishuo.okdownload.core.exception.ServerCanceledException;
import java.io.IOException;
import java.net.SocketException;
import p219q1.AbstractC9353c;
import p269v1.C9751d;

/* renamed from: u1.d */
/* loaded from: classes4.dex */
public class C9662d {

    /* renamed from: a */
    public String f17025a;

    /* renamed from: b */
    public final C9751d f17026b;

    /* renamed from: c */
    public volatile boolean f17027c;

    /* renamed from: d */
    public volatile boolean f17028d;

    /* renamed from: e */
    public volatile boolean f17029e;

    /* renamed from: f */
    public volatile boolean f17030f;

    /* renamed from: g */
    public volatile boolean f17031g;

    /* renamed from: h */
    public volatile boolean f17032h;

    /* renamed from: i */
    public volatile IOException f17033i;

    /* renamed from: u1.d$a */
    public static class a extends C9662d {
        public a(IOException iOException) {
            super(null);
            m16057q(iOException);
        }
    }

    public C9662d(C9751d c9751d) {
        this.f17026b = c9751d;
    }

    /* renamed from: a */
    public void m16041a(IOException iOException) {
        if (m16051k()) {
            return;
        }
        if (iOException instanceof ResumeFailedException) {
            m16054n(iOException);
            return;
        }
        if (iOException instanceof ServerCanceledException) {
            m16056p(iOException);
            return;
        }
        if (iOException == FileBusyAfterRunException.f5332a) {
            m16052l();
            return;
        }
        if (iOException instanceof PreAllocateException) {
            m16053m(iOException);
            return;
        }
        if (iOException != InterruptException.f5333a) {
            m16057q(iOException);
            if (iOException instanceof SocketException) {
                return;
            }
            AbstractC9353c.m15306i("DownloadCache", "catch unknown error " + iOException);
        }
    }

    /* renamed from: b */
    public C9751d m16042b() {
        C9751d c9751d = this.f17026b;
        if (c9751d != null) {
            return c9751d;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public IOException m16043c() {
        return this.f17033i;
    }

    /* renamed from: d */
    public String m16044d() {
        return this.f17025a;
    }

    /* renamed from: e */
    public boolean m16045e() {
        return this.f17031g;
    }

    /* renamed from: f */
    public boolean m16046f() {
        return this.f17027c || this.f17028d || this.f17029e || this.f17030f || this.f17031g || this.f17032h;
    }

    /* renamed from: g */
    public boolean m16047g() {
        return this.f17032h;
    }

    /* renamed from: h */
    public boolean m16048h() {
        return this.f17027c;
    }

    /* renamed from: i */
    public boolean m16049i() {
        return this.f17029e;
    }

    /* renamed from: j */
    public boolean m16050j() {
        return this.f17030f;
    }

    /* renamed from: k */
    public boolean m16051k() {
        return this.f17028d;
    }

    /* renamed from: l */
    public void m16052l() {
        this.f17031g = true;
    }

    /* renamed from: m */
    public void m16053m(IOException iOException) {
        this.f17032h = true;
        this.f17033i = iOException;
    }

    /* renamed from: n */
    public void m16054n(IOException iOException) {
        this.f17027c = true;
        this.f17033i = iOException;
    }

    /* renamed from: o */
    public void m16055o(String str) {
        this.f17025a = str;
    }

    /* renamed from: p */
    public void m16056p(IOException iOException) {
        this.f17029e = true;
        this.f17033i = iOException;
    }

    /* renamed from: q */
    public void m16057q(IOException iOException) {
        this.f17030f = true;
        this.f17033i = iOException;
    }

    /* renamed from: r */
    public void m16058r() {
        this.f17028d = true;
    }
}
