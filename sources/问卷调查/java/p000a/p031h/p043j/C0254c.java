package p000a.p031h.p043j;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import io.github.inflationx.calligraphy3.BuildConfig;
import java.util.Locale;
import java.util.Objects;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.h.j.c */
/* loaded from: classes.dex */
public final class C0254c {

    /* renamed from: a */
    public final ClipData f1591a;

    /* renamed from: b */
    public final int f1592b;

    /* renamed from: c */
    public final int f1593c;

    /* renamed from: d */
    public final Uri f1594d;

    /* renamed from: e */
    public final Bundle f1595e;

    /* renamed from: a.h.j.c$a */
    public static final class a {

        /* renamed from: a */
        public ClipData f1596a;

        /* renamed from: b */
        public int f1597b;

        /* renamed from: c */
        public int f1598c;

        /* renamed from: d */
        public Uri f1599d;

        /* renamed from: e */
        public Bundle f1600e;

        public a(ClipData clipData, int i) {
            this.f1596a = clipData;
            this.f1597b = i;
        }
    }

    public C0254c(a aVar) {
        ClipData clipData = aVar.f1596a;
        Objects.requireNonNull(clipData);
        this.f1591a = clipData;
        int i = aVar.f1597b;
        if (i < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 3));
        }
        if (i > 3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 3));
        }
        this.f1592b = i;
        int i2 = aVar.f1598c;
        if ((i2 & 1) == i2) {
            this.f1593c = i2;
            this.f1594d = aVar.f1599d;
            this.f1595e = aVar.f1600e;
        } else {
            StringBuilder sbM2079g = C0561a.m2079g("Requested flags 0x");
            sbM2079g.append(Integer.toHexString(i2));
            sbM2079g.append(", but only 0x");
            sbM2079g.append(Integer.toHexString(1));
            sbM2079g.append(" are allowed");
            throw new IllegalArgumentException(sbM2079g.toString());
        }
    }

    public String toString() {
        String string;
        StringBuilder sbM2079g = C0561a.m2079g("ContentInfoCompat{clip=");
        sbM2079g.append(this.f1591a.getDescription());
        sbM2079g.append(", source=");
        int i = this.f1592b;
        sbM2079g.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? String.valueOf(i) : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
        sbM2079g.append(", flags=");
        int i2 = this.f1593c;
        sbM2079g.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
        Uri uri = this.f1594d;
        String str = BuildConfig.FLAVOR;
        if (uri == null) {
            string = BuildConfig.FLAVOR;
        } else {
            StringBuilder sbM2079g2 = C0561a.m2079g(", hasLinkUri(");
            sbM2079g2.append(this.f1594d.toString().length());
            sbM2079g2.append(")");
            string = sbM2079g2.toString();
        }
        sbM2079g.append(string);
        if (this.f1595e != null) {
            str = ", hasExtras";
        }
        sbM2079g.append(str);
        sbM2079g.append("}");
        return sbM2079g.toString();
    }
}
