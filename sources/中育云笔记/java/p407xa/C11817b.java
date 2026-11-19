package p407xa;

import com.zykj.download.DownloadFlag;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: xa.b */
/* loaded from: classes6.dex */
public final class C11817b {

    /* renamed from: a */
    public final int f28052a;

    /* renamed from: b */
    public final String f28053b;

    /* renamed from: c */
    public final String f28054c;

    /* renamed from: d */
    public long f28055d;

    /* renamed from: e */
    public long f28056e;

    /* renamed from: f */
    public String f28057f;

    /* renamed from: g */
    public DownloadFlag f28058g;

    public C11817b(int i10, String downloadUrl, String localPath, long j10, long j11, String str, DownloadFlag flag) {
        AbstractC9979u.m20294g(downloadUrl, "downloadUrl");
        AbstractC9979u.m20294g(localPath, "localPath");
        AbstractC9979u.m20294g(flag, "flag");
        this.f28052a = i10;
        this.f28053b = downloadUrl;
        this.f28054c = localPath;
        this.f28055d = j10;
        this.f28056e = j11;
        this.f28057f = str;
        this.f28058g = flag;
    }

    /* renamed from: b */
    public static /* synthetic */ C11817b m26183b(C11817b c11817b, int i10, String str, String str2, long j10, long j11, String str3, DownloadFlag downloadFlag, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c11817b.f28052a;
        }
        if ((i11 & 2) != 0) {
            str = c11817b.f28053b;
        }
        if ((i11 & 4) != 0) {
            str2 = c11817b.f28054c;
        }
        if ((i11 & 8) != 0) {
            j10 = c11817b.f28055d;
        }
        if ((i11 & 16) != 0) {
            j11 = c11817b.f28056e;
        }
        if ((i11 & 32) != 0) {
            str3 = c11817b.f28057f;
        }
        if ((i11 & 64) != 0) {
            downloadFlag = c11817b.f28058g;
        }
        long j12 = j11;
        long j13 = j10;
        String str4 = str2;
        return c11817b.m26184a(i10, str, str4, j13, j12, str3, downloadFlag);
    }

    /* renamed from: a */
    public final C11817b m26184a(int i10, String downloadUrl, String localPath, long j10, long j11, String str, DownloadFlag flag) {
        AbstractC9979u.m20294g(downloadUrl, "downloadUrl");
        AbstractC9979u.m20294g(localPath, "localPath");
        AbstractC9979u.m20294g(flag, "flag");
        return new C11817b(i10, downloadUrl, localPath, j10, j11, str, flag);
    }

    /* renamed from: c */
    public final long m26185c() {
        return this.f28056e;
    }

    /* renamed from: d */
    public final String m26186d() {
        return this.f28053b;
    }

    /* renamed from: e */
    public final DownloadFlag m26187e() {
        return this.f28058g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11817b)) {
            return false;
        }
        C11817b c11817b = (C11817b) obj;
        return this.f28052a == c11817b.f28052a && AbstractC9979u.m20289b(this.f28053b, c11817b.f28053b) && AbstractC9979u.m20289b(this.f28054c, c11817b.f28054c) && this.f28055d == c11817b.f28055d && this.f28056e == c11817b.f28056e && AbstractC9979u.m20289b(this.f28057f, c11817b.f28057f) && this.f28058g == c11817b.f28058g;
    }

    /* renamed from: f */
    public final int m26188f() {
        return this.f28052a;
    }

    /* renamed from: g */
    public final String m26189g() {
        return this.f28054c;
    }

    /* renamed from: h */
    public final long m26190h() {
        return this.f28055d;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.f28052a) * 31) + this.f28053b.hashCode()) * 31) + this.f28054c.hashCode()) * 31) + Long.hashCode(this.f28055d)) * 31) + Long.hashCode(this.f28056e)) * 31;
        String str = this.f28057f;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f28058g.hashCode();
    }

    /* renamed from: i */
    public final String m26191i() {
        return this.f28057f;
    }

    /* renamed from: j */
    public final void m26192j(long j10) {
        this.f28056e = j10;
    }

    /* renamed from: k */
    public final void m26193k(DownloadFlag downloadFlag) {
        AbstractC9979u.m20294g(downloadFlag, "<set-?>");
        this.f28058g = downloadFlag;
    }

    /* renamed from: l */
    public final void m26194l(long j10) {
        this.f28055d = j10;
    }

    /* renamed from: m */
    public final void m26195m(String str) {
        this.f28057f = str;
    }

    public String toString() {
        return "DownloadEntity(id=" + this.f28052a + ", downloadUrl=" + this.f28053b + ", localPath=" + this.f28054c + ", totalSize=" + this.f28055d + ", downloadSize=" + this.f28056e + ", verifyCode=" + ((Object) this.f28057f) + ", flag=" + this.f28058g + ')';
    }
}
