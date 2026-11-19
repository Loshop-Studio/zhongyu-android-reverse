package com.zykj.download.data;

import androidx.room.Entity;
import com.zykj.download.DownloadFlag;
import kotlin.jvm.internal.AbstractC9133u;

@Entity(tableName = "download")
/* loaded from: classes4.dex */
public final class DownloadEntity {

    /* renamed from: a */
    public final int f9618a;

    /* renamed from: b */
    public final String f9619b;

    /* renamed from: c */
    public final String f9620c;

    /* renamed from: d */
    public long f9621d;

    /* renamed from: e */
    public long f9622e;

    /* renamed from: f */
    public String f9623f;

    /* renamed from: g */
    public DownloadFlag f9624g;

    public DownloadEntity(int i10, String downloadUrl, String localPath, long j10, long j11, String str, DownloadFlag flag) {
        AbstractC9133u.m16133g(downloadUrl, "downloadUrl");
        AbstractC9133u.m16133g(localPath, "localPath");
        AbstractC9133u.m16133g(flag, "flag");
        this.f9618a = i10;
        this.f9619b = downloadUrl;
        this.f9620c = localPath;
        this.f9621d = j10;
        this.f9622e = j11;
        this.f9623f = str;
        this.f9624g = flag;
    }

    /* renamed from: b */
    public static /* synthetic */ DownloadEntity m9186b(DownloadEntity downloadEntity, int i10, String str, String str2, long j10, long j11, String str3, DownloadFlag downloadFlag, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = downloadEntity.f9618a;
        }
        if ((i11 & 2) != 0) {
            str = downloadEntity.f9619b;
        }
        if ((i11 & 4) != 0) {
            str2 = downloadEntity.f9620c;
        }
        if ((i11 & 8) != 0) {
            j10 = downloadEntity.f9621d;
        }
        if ((i11 & 16) != 0) {
            j11 = downloadEntity.f9622e;
        }
        if ((i11 & 32) != 0) {
            str3 = downloadEntity.f9623f;
        }
        if ((i11 & 64) != 0) {
            downloadFlag = downloadEntity.f9624g;
        }
        long j12 = j11;
        long j13 = j10;
        String str4 = str2;
        return downloadEntity.m9187a(i10, str, str4, j13, j12, str3, downloadFlag);
    }

    /* renamed from: a */
    public final DownloadEntity m9187a(int i10, String downloadUrl, String localPath, long j10, long j11, String str, DownloadFlag flag) {
        AbstractC9133u.m16133g(downloadUrl, "downloadUrl");
        AbstractC9133u.m16133g(localPath, "localPath");
        AbstractC9133u.m16133g(flag, "flag");
        return new DownloadEntity(i10, downloadUrl, localPath, j10, j11, str, flag);
    }

    /* renamed from: c */
    public final long m9188c() {
        return this.f9622e;
    }

    /* renamed from: d */
    public final String m9189d() {
        return this.f9619b;
    }

    /* renamed from: e */
    public final DownloadFlag m9190e() {
        return this.f9624g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadEntity)) {
            return false;
        }
        DownloadEntity downloadEntity = (DownloadEntity) obj;
        return this.f9618a == downloadEntity.f9618a && AbstractC9133u.m16128b(this.f9619b, downloadEntity.f9619b) && AbstractC9133u.m16128b(this.f9620c, downloadEntity.f9620c) && this.f9621d == downloadEntity.f9621d && this.f9622e == downloadEntity.f9622e && AbstractC9133u.m16128b(this.f9623f, downloadEntity.f9623f) && this.f9624g == downloadEntity.f9624g;
    }

    /* renamed from: f */
    public final int m9191f() {
        return this.f9618a;
    }

    /* renamed from: g */
    public final String m9192g() {
        return this.f9620c;
    }

    /* renamed from: h */
    public final long m9193h() {
        return this.f9621d;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.f9618a) * 31) + this.f9619b.hashCode()) * 31) + this.f9620c.hashCode()) * 31) + Long.hashCode(this.f9621d)) * 31) + Long.hashCode(this.f9622e)) * 31;
        String str = this.f9623f;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f9624g.hashCode();
    }

    /* renamed from: i */
    public final String m9194i() {
        return this.f9623f;
    }

    /* renamed from: j */
    public final void m9195j(long j10) {
        this.f9622e = j10;
    }

    /* renamed from: k */
    public final void m9196k(DownloadFlag downloadFlag) {
        AbstractC9133u.m16133g(downloadFlag, "<set-?>");
        this.f9624g = downloadFlag;
    }

    /* renamed from: l */
    public final void m9197l(long j10) {
        this.f9621d = j10;
    }

    /* renamed from: m */
    public final void m9198m(String str) {
        this.f9623f = str;
    }

    public String toString() {
        return "DownloadEntity(id=" + this.f9618a + ", downloadUrl=" + this.f9619b + ", localPath=" + this.f9620c + ", totalSize=" + this.f9621d + ", downloadSize=" + this.f9622e + ", verifyCode=" + ((Object) this.f9623f) + ", flag=" + this.f9624g + ')';
    }
}
