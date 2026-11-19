package p162v1;

import com.zykj.download.DownloadFlag;
import kotlin.jvm.internal.C2769l;
import okhttp3.C2931a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: v1.b */
/* loaded from: classes.dex */
public final class C3419b {

    /* renamed from: a */
    private final int f11988a;

    /* renamed from: b */
    @NotNull
    private final String f11989b;

    /* renamed from: c */
    @NotNull
    private final String f11990c;

    /* renamed from: d */
    private long f11991d;

    /* renamed from: e */
    private long f11992e;

    /* renamed from: f */
    @Nullable
    private String f11993f;

    /* renamed from: g */
    @NotNull
    private DownloadFlag f11994g;

    public C3419b(int i4, @NotNull String downloadUrl, @NotNull String localPath, long j4, long j5, @Nullable String str, @NotNull DownloadFlag flag) {
        C2769l.m9241e(downloadUrl, "downloadUrl");
        C2769l.m9241e(localPath, "localPath");
        C2769l.m9241e(flag, "flag");
        this.f11988a = i4;
        this.f11989b = downloadUrl;
        this.f11990c = localPath;
        this.f11991d = j4;
        this.f11992e = j5;
        this.f11993f = str;
        this.f11994g = flag;
    }

    @NotNull
    /* renamed from: a */
    public final C3419b m10420a(int i4, @NotNull String downloadUrl, @NotNull String localPath, long j4, long j5, @Nullable String str, @NotNull DownloadFlag flag) {
        C2769l.m9241e(downloadUrl, "downloadUrl");
        C2769l.m9241e(localPath, "localPath");
        C2769l.m9241e(flag, "flag");
        return new C3419b(i4, downloadUrl, localPath, j4, j5, str, flag);
    }

    /* renamed from: c */
    public final long m10421c() {
        return this.f11992e;
    }

    @NotNull
    /* renamed from: d */
    public final String m10422d() {
        return this.f11989b;
    }

    @NotNull
    /* renamed from: e */
    public final DownloadFlag m10423e() {
        return this.f11994g;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3419b)) {
            return false;
        }
        C3419b c3419b = (C3419b) obj;
        return this.f11988a == c3419b.f11988a && C2769l.m9237a(this.f11989b, c3419b.f11989b) && C2769l.m9237a(this.f11990c, c3419b.f11990c) && this.f11991d == c3419b.f11991d && this.f11992e == c3419b.f11992e && C2769l.m9237a(this.f11993f, c3419b.f11993f) && this.f11994g == c3419b.f11994g;
    }

    /* renamed from: f */
    public final int m10424f() {
        return this.f11988a;
    }

    @NotNull
    /* renamed from: g */
    public final String m10425g() {
        return this.f11990c;
    }

    /* renamed from: h */
    public final long m10426h() {
        return this.f11991d;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f11988a * 31) + this.f11989b.hashCode()) * 31) + this.f11990c.hashCode()) * 31) + C2931a.m10001a(this.f11991d)) * 31) + C2931a.m10001a(this.f11992e)) * 31;
        String str = this.f11993f;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f11994g.hashCode();
    }

    @Nullable
    /* renamed from: i */
    public final String m10427i() {
        return this.f11993f;
    }

    /* renamed from: j */
    public final void m10428j(long j4) {
        this.f11992e = j4;
    }

    /* renamed from: k */
    public final void m10429k(@NotNull DownloadFlag downloadFlag) {
        C2769l.m9241e(downloadFlag, "<set-?>");
        this.f11994g = downloadFlag;
    }

    /* renamed from: l */
    public final void m10430l(long j4) {
        this.f11991d = j4;
    }

    /* renamed from: m */
    public final void m10431m(@Nullable String str) {
        this.f11993f = str;
    }

    @NotNull
    public String toString() {
        return "DownloadEntity(id=" + this.f11988a + ", downloadUrl=" + this.f11989b + ", localPath=" + this.f11990c + ", totalSize=" + this.f11991d + ", downloadSize=" + this.f11992e + ", verifyCode=" + ((Object) this.f11993f) + ", flag=" + this.f11994g + ')';
    }
}
