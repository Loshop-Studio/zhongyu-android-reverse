package p000a.p031h.p035d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p033c.p034b.C0196d;
import p000a.p031h.p040g.C0230l;

/* renamed from: a.h.d.k */
/* loaded from: classes.dex */
public class C0212k {

    /* renamed from: a */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, C0196d> f1479a = new ConcurrentHashMap<>();

    /* renamed from: a.h.d.k$a */
    public interface a<T> {
        /* renamed from: a */
        int mo783a(T t);

        /* renamed from: b */
        boolean mo784b(T t);
    }

    /* renamed from: e */
    public static <T> T m785e(T[] tArr, int i, a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(aVar.mo783a(t2) - i2) * 2) + (aVar.mo784b(t2) == z ? 0 : 1);
            if (t == null || i3 > iAbs) {
                t = t2;
                i3 = iAbs;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo768a(Context context, C0196d c0196d, Resources resources, int i) {
        throw null;
    }

    /* renamed from: b */
    public Typeface mo769b(Context context, CancellationSignal cancellationSignal, C0230l[] c0230lArr, int i) {
        throw null;
    }

    /* renamed from: c */
    public Typeface mo782c(Context context, InputStream inputStream) {
        File fileM728w = C0190e.m728w(context);
        if (fileM728w == null) {
            return null;
        }
        try {
            if (C0190e.m719n(fileM728w, inputStream)) {
                return Typeface.createFromFile(fileM728w.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM728w.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo773d(Context context, Resources resources, int i, String str, int i2) {
        File fileM728w = C0190e.m728w(context);
        if (fileM728w == null) {
            return null;
        }
        try {
            if (C0190e.m718m(fileM728w, resources, i)) {
                return Typeface.createFromFile(fileM728w.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM728w.delete();
        }
    }
}
