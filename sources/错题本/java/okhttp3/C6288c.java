package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: okhttp3.c */
/* loaded from: classes4.dex */
public final class C6288c {

    /* renamed from: n */
    public static final /* synthetic */ int f10061n = 0;

    /* renamed from: a */
    public final boolean f10062a;

    /* renamed from: b */
    public final boolean f10063b;

    /* renamed from: c */
    public final int f10064c;

    /* renamed from: d */
    public final int f10065d;

    /* renamed from: e */
    public final boolean f10066e;

    /* renamed from: f */
    public final boolean f10067f;

    /* renamed from: g */
    public final boolean f10068g;

    /* renamed from: h */
    public final int f10069h;

    /* renamed from: i */
    public final int f10070i;

    /* renamed from: j */
    public final boolean f10071j;

    /* renamed from: k */
    public final boolean f10072k;

    /* renamed from: l */
    public final boolean f10073l;

    /* renamed from: m */
    public String f10074m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC5830k.m5330g(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public C6288c(boolean z8, boolean z9, int i, int i8, boolean z10, boolean z11, boolean z12, int i9, int i10, boolean z13, boolean z14, boolean z15, String str) {
        this.f10062a = z8;
        this.f10063b = z9;
        this.f10064c = i;
        this.f10065d = i8;
        this.f10066e = z10;
        this.f10067f = z11;
        this.f10068g = z12;
        this.f10069h = i9;
        this.f10070i = i10;
        this.f10071j = z13;
        this.f10072k = z14;
        this.f10073l = z15;
        this.f10074m = str;
    }

    public final String toString() {
        String str = this.f10074m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f10062a) {
            sb.append("no-cache, ");
        }
        if (this.f10063b) {
            sb.append("no-store, ");
        }
        int i = this.f10064c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i8 = this.f10065d;
        if (i8 != -1) {
            sb.append("s-maxage=");
            sb.append(i8);
            sb.append(", ");
        }
        if (this.f10066e) {
            sb.append("private, ");
        }
        if (this.f10067f) {
            sb.append("public, ");
        }
        if (this.f10068g) {
            sb.append("must-revalidate, ");
        }
        int i9 = this.f10069h;
        if (i9 != -1) {
            sb.append("max-stale=");
            sb.append(i9);
            sb.append(", ");
        }
        int i10 = this.f10070i;
        if (i10 != -1) {
            sb.append("min-fresh=");
            sb.append(i10);
            sb.append(", ");
        }
        if (this.f10071j) {
            sb.append("only-if-cached, ");
        }
        if (this.f10072k) {
            sb.append("no-transform, ");
        }
        if (this.f10073l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "StringBuilder().apply(builderAction).toString()");
        this.f10074m = string;
        return string;
    }
}
