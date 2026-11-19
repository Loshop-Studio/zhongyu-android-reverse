package p152t;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import p148s.C3365c;
import p176z.C3504f;

/* renamed from: t.m */
/* loaded from: classes.dex */
class C3394m {

    /* renamed from: a */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, C3365c.b> f11927a = new ConcurrentHashMap<>();

    /* renamed from: t.m$a */
    class a implements b<C3504f.b> {
        a() {
        }

        @Override // p152t.C3394m.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo10362a(C3504f.b bVar) {
            return bVar.m10675e();
        }

        @Override // p152t.C3394m.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo10363b(C3504f.b bVar) {
            return bVar.m10676f();
        }
    }

    /* renamed from: t.m$b */
    private interface b<T> {
        /* renamed from: a */
        int mo10362a(T t3);

        /* renamed from: b */
        boolean mo10363b(T t3);
    }

    C3394m() {
    }

    /* renamed from: e */
    private static <T> T m10360e(T[] tArr, int i4, b<T> bVar) {
        int i5 = (i4 & 1) == 0 ? 400 : 700;
        boolean z3 = (i4 & 2) != 0;
        T t3 = null;
        int i6 = Integer.MAX_VALUE;
        for (T t4 : tArr) {
            int iAbs = (Math.abs(bVar.mo10362a(t4) - i5) * 2) + (bVar.mo10363b(t4) == z3 ? 0 : 1);
            if (t3 == null || i6 > iAbs) {
                t3 = t4;
                i6 = iAbs;
            }
        }
        return t3;
    }

    /* renamed from: a */
    public Typeface mo10338a(Context context, C3365c.b bVar, Resources resources, int i4) {
        throw null;
    }

    /* renamed from: b */
    public Typeface mo10339b(Context context, CancellationSignal cancellationSignal, C3504f.b[] bVarArr, int i4) {
        throw null;
    }

    /* renamed from: c */
    protected Typeface m10361c(Context context, InputStream inputStream) {
        File fileM10370e = C3395n.m10370e(context);
        if (fileM10370e == null) {
            return null;
        }
        try {
            if (C3395n.m10369d(fileM10370e, inputStream)) {
                return Typeface.createFromFile(fileM10370e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM10370e.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo10350d(Context context, Resources resources, int i4, String str, int i5) {
        File fileM10370e = C3395n.m10370e(context);
        if (fileM10370e == null) {
            return null;
        }
        try {
            if (C3395n.m10368c(fileM10370e, resources, i4)) {
                return Typeface.createFromFile(fileM10370e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM10370e.delete();
        }
    }

    /* renamed from: f */
    protected C3504f.b mo10359f(C3504f.b[] bVarArr, int i4) {
        return (C3504f.b) m10360e(bVarArr, i4, new a());
    }
}
