package p262v1;

import android.net.Uri;
import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import java.io.File;
import p207q1.C8879d;
import p218r1.AbstractC8999c;
import p229s1.C9126c;

/* renamed from: v1.a */
/* loaded from: classes4.dex */
public class C9654a {

    /* renamed from: a */
    public boolean f16851a;

    /* renamed from: b */
    public boolean f16852b;

    /* renamed from: c */
    public boolean f16853c;

    /* renamed from: d */
    public boolean f16854d;

    /* renamed from: e */
    public final C6327a f16855e;

    /* renamed from: f */
    public final C9126c f16856f;

    /* renamed from: g */
    public final long f16857g;

    public C9654a(C6327a c6327a, C9126c c9126c, long j10) {
        this.f16855e = c6327a;
        this.f16856f = c9126c;
        this.f16857g = j10;
    }

    /* renamed from: a */
    public void m16051a() {
        this.f16852b = m16054d();
        this.f16853c = m16055e();
        boolean zM16056f = m16056f();
        this.f16854d = zM16056f;
        this.f16851a = (this.f16853c && this.f16852b && zM16056f) ? false : true;
    }

    /* renamed from: b */
    public ResumeFailedCause m16052b() {
        if (!this.f16853c) {
            return ResumeFailedCause.INFO_DIRTY;
        }
        if (!this.f16852b) {
            return ResumeFailedCause.FILE_NOT_EXIST;
        }
        if (!this.f16854d) {
            return ResumeFailedCause.OUTPUT_STREAM_NOT_SUPPORT;
        }
        throw new IllegalStateException("No cause find with dirty: " + this.f16851a);
    }

    /* renamed from: c */
    public boolean m16053c() {
        return this.f16851a;
    }

    /* renamed from: d */
    public boolean m16054d() {
        Uri uriM4375A = this.f16855e.m4375A();
        if (AbstractC8999c.m15135s(uriM4375A)) {
            return AbstractC8999c.m15129m(uriM4375A) > 0;
        }
        File fileM4392l = this.f16855e.m4392l();
        return fileM4392l != null && fileM4392l.exists();
    }

    /* renamed from: e */
    public boolean m16055e() {
        int iM15469d = this.f16856f.m15469d();
        if (iM15469d <= 0 || this.f16856f.m15478m() || this.f16856f.m15471f() == null) {
            return false;
        }
        if (!this.f16856f.m15471f().equals(this.f16855e.m4392l()) || this.f16856f.m15471f().length() > this.f16856f.m15475j()) {
            return false;
        }
        if (this.f16857g > 0 && this.f16856f.m15475j() != this.f16857g) {
            return false;
        }
        for (int i10 = 0; i10 < iM15469d; i10++) {
            if (this.f16856f.m15468c(i10).m15457b() <= 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean m16056f() {
        if (C8879d.m14905k().m14913h().mo16264b()) {
            return true;
        }
        return this.f16856f.m15469d() == 1 && !C8879d.m14905k().m14914i().m16301e(this.f16855e);
    }

    public String toString() {
        return "fileExist[" + this.f16852b + "] infoRight[" + this.f16853c + "] outputStreamSupport[" + this.f16854d + "] " + super.toString();
    }
}
