package p283w5;

import com.zykj.download.DownloadFlag;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w5.b */
/* loaded from: classes4.dex */
public final class C9827b {

    /* renamed from: a */
    public final int f17531a;

    /* renamed from: b */
    public final String f17532b;

    /* renamed from: c */
    public final String f17533c;

    /* renamed from: d */
    public long f17534d;

    /* renamed from: e */
    public long f17535e;

    /* renamed from: f */
    public String f17536f;

    /* renamed from: g */
    public DownloadFlag f17537g;

    public C9827b(int i9, String downloadUrl, String localPath, long j9, long j10, String str, DownloadFlag flag) {
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(flag, "flag");
        this.f17531a = i9;
        this.f17532b = downloadUrl;
        this.f17533c = localPath;
        this.f17534d = j9;
        this.f17535e = j10;
        this.f17536f = str;
        this.f17537g = flag;
    }

    /* renamed from: b */
    public static /* synthetic */ C9827b m16740b(C9827b c9827b, int i9, String str, String str2, long j9, long j10, String str3, DownloadFlag downloadFlag, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = c9827b.f17531a;
        }
        if ((i10 & 2) != 0) {
            str = c9827b.f17532b;
        }
        if ((i10 & 4) != 0) {
            str2 = c9827b.f17533c;
        }
        if ((i10 & 8) != 0) {
            j9 = c9827b.f17534d;
        }
        if ((i10 & 16) != 0) {
            j10 = c9827b.f17535e;
        }
        if ((i10 & 32) != 0) {
            str3 = c9827b.f17536f;
        }
        if ((i10 & 64) != 0) {
            downloadFlag = c9827b.f17537g;
        }
        long j11 = j10;
        long j12 = j9;
        String str4 = str2;
        return c9827b.m16741a(i9, str, str4, j12, j11, str3, downloadFlag);
    }

    /* renamed from: a */
    public final C9827b m16741a(int i9, String downloadUrl, String localPath, long j9, long j10, String str, DownloadFlag flag) {
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new C9827b(i9, downloadUrl, localPath, j9, j10, str, flag);
    }

    /* renamed from: c */
    public final long m16742c() {
        return this.f17535e;
    }

    /* renamed from: d */
    public final String m16743d() {
        return this.f17532b;
    }

    /* renamed from: e */
    public final DownloadFlag m16744e() {
        return this.f17537g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9827b)) {
            return false;
        }
        C9827b c9827b = (C9827b) obj;
        return this.f17531a == c9827b.f17531a && Intrinsics.areEqual(this.f17532b, c9827b.f17532b) && Intrinsics.areEqual(this.f17533c, c9827b.f17533c) && this.f17534d == c9827b.f17534d && this.f17535e == c9827b.f17535e && Intrinsics.areEqual(this.f17536f, c9827b.f17536f) && this.f17537g == c9827b.f17537g;
    }

    /* renamed from: f */
    public final int m16745f() {
        return this.f17531a;
    }

    /* renamed from: g */
    public final String m16746g() {
        return this.f17533c;
    }

    /* renamed from: h */
    public final long m16747h() {
        return this.f17534d;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.f17531a) * 31) + this.f17532b.hashCode()) * 31) + this.f17533c.hashCode()) * 31) + Long.hashCode(this.f17534d)) * 31) + Long.hashCode(this.f17535e)) * 31;
        String str = this.f17536f;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f17537g.hashCode();
    }

    /* renamed from: i */
    public final String m16748i() {
        return this.f17536f;
    }

    /* renamed from: j */
    public final void m16749j(long j9) {
        this.f17535e = j9;
    }

    /* renamed from: k */
    public final void m16750k(DownloadFlag downloadFlag) {
        Intrinsics.checkNotNullParameter(downloadFlag, "<set-?>");
        this.f17537g = downloadFlag;
    }

    /* renamed from: l */
    public final void m16751l(long j9) {
        this.f17534d = j9;
    }

    /* renamed from: m */
    public final void m16752m(String str) {
        this.f17536f = str;
    }

    public String toString() {
        return "DownloadEntity(id=" + this.f17531a + ", downloadUrl=" + this.f17532b + ", localPath=" + this.f17533c + ", totalSize=" + this.f17534d + ", downloadSize=" + this.f17535e + ", verifyCode=" + ((Object) this.f17536f) + ", flag=" + this.f17537g + ')';
    }
}
