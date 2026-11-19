package p259u1;

import android.net.Uri;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import java.io.File;
import p209p1.C9315d;
import p219q1.AbstractC9353c;
import p229r1.C9419c;

/* renamed from: u1.a */
/* loaded from: classes4.dex */
public class C9659a {

    /* renamed from: a */
    public boolean f17003a;

    /* renamed from: b */
    public boolean f17004b;

    /* renamed from: c */
    public boolean f17005c;

    /* renamed from: d */
    public boolean f17006d;

    /* renamed from: e */
    public final C6593a f17007e;

    /* renamed from: f */
    public final C9419c f17008f;

    /* renamed from: g */
    public final long f17009g;

    public C9659a(C6593a c6593a, C9419c c9419c, long j9) {
        this.f17007e = c6593a;
        this.f17008f = c9419c;
        this.f17009g = j9;
    }

    /* renamed from: a */
    public void m16012a() {
        this.f17004b = m16015d();
        this.f17005c = m16016e();
        boolean zM16017f = m16017f();
        this.f17006d = zM16017f;
        this.f17003a = (this.f17005c && this.f17004b && zM16017f) ? false : true;
    }

    /* renamed from: b */
    public ResumeFailedCause m16013b() {
        if (!this.f17005c) {
            return ResumeFailedCause.INFO_DIRTY;
        }
        if (!this.f17004b) {
            return ResumeFailedCause.FILE_NOT_EXIST;
        }
        if (!this.f17006d) {
            return ResumeFailedCause.OUTPUT_STREAM_NOT_SUPPORT;
        }
        throw new IllegalStateException("No cause find with dirty: " + this.f17003a);
    }

    /* renamed from: c */
    public boolean m16014c() {
        return this.f17003a;
    }

    /* renamed from: d */
    public boolean m16015d() {
        Uri uriM4579A = this.f17007e.m4579A();
        if (AbstractC9353c.m15316s(uriM4579A)) {
            return AbstractC9353c.m15310m(uriM4579A) > 0;
        }
        File fileM4596l = this.f17007e.m4596l();
        return fileM4596l != null && fileM4596l.exists();
    }

    /* renamed from: e */
    public boolean m16016e() {
        int iM15523d = this.f17008f.m15523d();
        if (iM15523d <= 0 || this.f17008f.m15532m() || this.f17008f.m15525f() == null) {
            return false;
        }
        if (!this.f17008f.m15525f().equals(this.f17007e.m4596l()) || this.f17008f.m15525f().length() > this.f17008f.m15529j()) {
            return false;
        }
        if (this.f17009g > 0 && this.f17008f.m15529j() != this.f17009g) {
            return false;
        }
        for (int i9 = 0; i9 < iM15523d; i9++) {
            if (this.f17008f.m15522c(i9).m15511b() <= 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean m16017f() {
        if (C9315d.m15182k().m15190h().mo16297b()) {
            return true;
        }
        return this.f17008f.m15523d() == 1 && !C9315d.m15182k().m15191i().m16334e(this.f17007e);
    }

    public String toString() {
        return "fileExist[" + this.f17004b + "] infoRight[" + this.f17005c + "] outputStreamSupport[" + this.f17006d + "] " + super.toString();
    }
}
