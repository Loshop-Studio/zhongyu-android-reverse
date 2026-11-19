package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import p011b0.C1025h;

/* renamed from: androidx.core.view.c */
/* loaded from: classes.dex */
public final class C0339c {

    /* renamed from: a */
    final ClipData f2689a;

    /* renamed from: b */
    final int f2690b;

    /* renamed from: c */
    final int f2691c;

    /* renamed from: d */
    final Uri f2692d;

    /* renamed from: e */
    final Bundle f2693e;

    /* renamed from: androidx.core.view.c$a */
    public static final class a {

        /* renamed from: a */
        ClipData f2694a;

        /* renamed from: b */
        int f2695b;

        /* renamed from: c */
        int f2696c;

        /* renamed from: d */
        Uri f2697d;

        /* renamed from: e */
        Bundle f2698e;

        public a(ClipData clipData, int i4) {
            this.f2694a = clipData;
            this.f2695b = i4;
        }

        /* renamed from: a */
        public C0339c m1856a() {
            return new C0339c(this);
        }

        /* renamed from: b */
        public a m1857b(Bundle bundle) {
            this.f2698e = bundle;
            return this;
        }

        /* renamed from: c */
        public a m1858c(int i4) {
            this.f2696c = i4;
            return this;
        }

        /* renamed from: d */
        public a m1859d(Uri uri) {
            this.f2697d = uri;
            return this;
        }
    }

    C0339c(a aVar) {
        this.f2689a = (ClipData) C1025h.m4782f(aVar.f2694a);
        this.f2690b = C1025h.m4779c(aVar.f2695b, 0, 3, "source");
        this.f2691c = C1025h.m4781e(aVar.f2696c, 1);
        this.f2692d = aVar.f2697d;
        this.f2693e = aVar.f2698e;
    }

    /* renamed from: a */
    static String m1851a(int i4) {
        return (i4 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i4);
    }

    /* renamed from: e */
    static String m1852e(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? String.valueOf(i4) : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: b */
    public ClipData m1853b() {
        return this.f2689a;
    }

    /* renamed from: c */
    public int m1854c() {
        return this.f2691c;
    }

    /* renamed from: d */
    public int m1855d() {
        return this.f2690b;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ContentInfoCompat{clip=");
        sb.append(this.f2689a.getDescription());
        sb.append(", source=");
        sb.append(m1852e(this.f2690b));
        sb.append(", flags=");
        sb.append(m1851a(this.f2691c));
        if (this.f2692d == null) {
            str = "";
        } else {
            str = ", hasLinkUri(" + this.f2692d.toString().length() + ")";
        }
        sb.append(str);
        sb.append(this.f2693e != null ? ", hasExtras" : "");
        sb.append("}");
        return sb.toString();
    }
}
