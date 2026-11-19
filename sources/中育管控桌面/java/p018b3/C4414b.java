package p018b3;

import com.zykj.download.DownloadFlag;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b3.b */
/* loaded from: classes3.dex */
public final class C4414b {

    /* renamed from: a */
    public final int f1295a;

    /* renamed from: b */
    public final String f1296b;

    /* renamed from: c */
    public final String f1297c;

    /* renamed from: d */
    public long f1298d;

    /* renamed from: e */
    public long f1299e;

    /* renamed from: f */
    public String f1300f;

    /* renamed from: g */
    public DownloadFlag f1301g;

    public C4414b(int i6, String downloadUrl, String localPath, long j6, long j7, String str, DownloadFlag flag) {
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(flag, "flag");
        this.f1295a = i6;
        this.f1296b = downloadUrl;
        this.f1297c = localPath;
        this.f1298d = j6;
        this.f1299e = j7;
        this.f1300f = str;
        this.f1301g = flag;
    }

    /* renamed from: b */
    public static /* synthetic */ C4414b m1475b(C4414b c4414b, int i6, String str, String str2, long j6, long j7, String str3, DownloadFlag downloadFlag, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i6 = c4414b.f1295a;
        }
        if ((i7 & 2) != 0) {
            str = c4414b.f1296b;
        }
        if ((i7 & 4) != 0) {
            str2 = c4414b.f1297c;
        }
        if ((i7 & 8) != 0) {
            j6 = c4414b.f1298d;
        }
        if ((i7 & 16) != 0) {
            j7 = c4414b.f1299e;
        }
        if ((i7 & 32) != 0) {
            str3 = c4414b.f1300f;
        }
        if ((i7 & 64) != 0) {
            downloadFlag = c4414b.f1301g;
        }
        long j8 = j7;
        long j9 = j6;
        String str4 = str2;
        return c4414b.m1476a(i6, str, str4, j9, j8, str3, downloadFlag);
    }

    /* renamed from: a */
    public final C4414b m1476a(int i6, String downloadUrl, String localPath, long j6, long j7, String str, DownloadFlag flag) {
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new C4414b(i6, downloadUrl, localPath, j6, j7, str, flag);
    }

    /* renamed from: c */
    public final long m1477c() {
        return this.f1299e;
    }

    /* renamed from: d */
    public final String m1478d() {
        return this.f1296b;
    }

    /* renamed from: e */
    public final DownloadFlag m1479e() {
        return this.f1301g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4414b)) {
            return false;
        }
        C4414b c4414b = (C4414b) obj;
        return this.f1295a == c4414b.f1295a && Intrinsics.areEqual(this.f1296b, c4414b.f1296b) && Intrinsics.areEqual(this.f1297c, c4414b.f1297c) && this.f1298d == c4414b.f1298d && this.f1299e == c4414b.f1299e && Intrinsics.areEqual(this.f1300f, c4414b.f1300f) && this.f1301g == c4414b.f1301g;
    }

    /* renamed from: f */
    public final int m1480f() {
        return this.f1295a;
    }

    /* renamed from: g */
    public final String m1481g() {
        return this.f1297c;
    }

    /* renamed from: h */
    public final long m1482h() {
        return this.f1298d;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.f1295a) * 31) + this.f1296b.hashCode()) * 31) + this.f1297c.hashCode()) * 31) + Long.hashCode(this.f1298d)) * 31) + Long.hashCode(this.f1299e)) * 31;
        String str = this.f1300f;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f1301g.hashCode();
    }

    /* renamed from: i */
    public final String m1483i() {
        return this.f1300f;
    }

    /* renamed from: j */
    public final void m1484j(long j6) {
        this.f1299e = j6;
    }

    /* renamed from: k */
    public final void m1485k(DownloadFlag downloadFlag) {
        Intrinsics.checkNotNullParameter(downloadFlag, "<set-?>");
        this.f1301g = downloadFlag;
    }

    /* renamed from: l */
    public final void m1486l(long j6) {
        this.f1298d = j6;
    }

    /* renamed from: m */
    public final void m1487m(String str) {
        this.f1300f = str;
    }

    public String toString() {
        return "DownloadEntity(id=" + this.f1295a + ", downloadUrl=" + this.f1296b + ", localPath=" + this.f1297c + ", totalSize=" + this.f1298d + ", downloadSize=" + this.f1299e + ", verifyCode=" + ((Object) this.f1300f) + ", flag=" + this.f1301g + ')';
    }
}
