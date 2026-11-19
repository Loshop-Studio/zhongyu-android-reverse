package p000a.p031h.p035d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import p000a.p021e.C0134f;
import p000a.p031h.p033c.p034b.C0200h;
import p000a.p031h.p040g.C0231m;

@SuppressLint({"NewApi"})
/* renamed from: a.h.d.d */
/* loaded from: classes.dex */
public class C0205d {

    /* renamed from: a */
    public static final C0212k f1460a;

    /* renamed from: b */
    public static final C0134f<String, Typeface> f1461b;

    /* renamed from: a.h.d.d$a */
    public static class a extends C0231m {

        /* renamed from: a */
        public C0200h.a f1462a;

        public a(C0200h.a aVar) {
            this.f1462a = aVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lc
            a.h.d.i r0 = new a.h.d.i
            r0.<init>()
            goto L41
        Lc:
            r1 = 28
            if (r0 < r1) goto L16
            a.h.d.h r0 = new a.h.d.h
            r0.<init>()
            goto L41
        L16:
            r1 = 26
            if (r0 < r1) goto L20
            a.h.d.g r0 = new a.h.d.g
            r0.<init>()
            goto L41
        L20:
            r1 = 24
            if (r0 < r1) goto L3c
            java.lang.reflect.Method r0 = p000a.p031h.p035d.C0207f.f1470d
            if (r0 != 0) goto L2f
            java.lang.String r1 = "TypefaceCompatApi24Impl"
            java.lang.String r2 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        L2f:
            if (r0 == 0) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 == 0) goto L3c
            a.h.d.f r0 = new a.h.d.f
            r0.<init>()
            goto L41
        L3c:
            a.h.d.e r0 = new a.h.d.e
            r0.<init>()
        L41:
            p000a.p031h.p035d.C0205d.f1460a = r0
            a.e.f r0 = new a.e.f
            r1 = 16
            r0.<init>(r1)
            p000a.p031h.p035d.C0205d.f1461b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p035d.C0205d.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m763a(android.content.Context r5, p000a.p031h.p033c.p034b.InterfaceC0195c r6, android.content.res.Resources r7, int r8, int r9, p000a.p031h.p033c.p034b.C0200h.a r10, android.os.Handler r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p035d.C0205d.m763a(android.content.Context, a.h.c.b.c, android.content.res.Resources, int, int, a.h.c.b.h$a, android.os.Handler, boolean):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static Typeface m764b(Context context, Resources resources, int i, String str, int i2) {
        Typeface typefaceMo773d = f1460a.mo773d(context, resources, i, str, i2);
        if (typefaceMo773d != null) {
            f1461b.m501b(m765c(resources, i, i2), typefaceMo773d);
        }
        return typefaceMo773d;
    }

    /* renamed from: c */
    public static String m765c(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
