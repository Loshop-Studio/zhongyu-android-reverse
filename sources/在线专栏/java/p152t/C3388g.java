package p152t;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.C0251e;
import p148s.C3365c;
import p148s.C3368f;
import p176z.C3504f;

@SuppressLint({"NewApi"})
/* renamed from: t.g */
/* loaded from: classes.dex */
public class C3388g {

    /* renamed from: a */
    private static final C3394m f11908a;

    /* renamed from: b */
    private static final C0251e<String, Typeface> f11909b;

    /* renamed from: t.g$a */
    public static class a extends C3504f.c {

        /* renamed from: a */
        private C3368f.c f11910a;

        public a(C3368f.c cVar) {
            this.f11910a = cVar;
        }

        @Override // p176z.C3504f.c
        /* renamed from: a */
        public void mo10331a(int i4) {
            C3368f.c cVar = this.f11910a;
            if (cVar != null) {
                cVar.onFontRetrievalFailed(i4);
            }
        }

        @Override // p176z.C3504f.c
        /* renamed from: b */
        public void mo10332b(Typeface typeface) {
            C3368f.c cVar = this.f11910a;
            if (cVar != null) {
                cVar.onFontRetrieved(typeface);
            }
        }
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            f11908a = new C3393l();
        } else if (i4 >= 28) {
            f11908a = new C3392k();
        } else if (i4 >= 26) {
            f11908a = new C3391j();
        } else if (i4 < 24 || !C3390i.m10342i()) {
            f11908a = new C3389h();
        } else {
            f11908a = new C3390i();
        }
        f11909b = new C0251e<>(16);
    }

    /* renamed from: a */
    public static Typeface m10324a(Context context, Typeface typeface, int i4) {
        if (context != null) {
            return Typeface.create(typeface, i4);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m10325b(Context context, CancellationSignal cancellationSignal, C3504f.b[] bVarArr, int i4) {
        return f11908a.mo10339b(context, cancellationSignal, bVarArr, i4);
    }

    /* renamed from: c */
    public static Typeface m10326c(Context context, C3365c.a aVar, Resources resources, int i4, int i5, C3368f.c cVar, Handler handler, boolean z3) {
        Typeface typefaceMo10338a;
        if (aVar instanceof C3365c.d) {
            C3365c.d dVar = (C3365c.d) aVar;
            Typeface typefaceM10330g = m10330g(dVar.m10221c());
            if (typefaceM10330g != null) {
                if (cVar != null) {
                    cVar.callbackSuccessAsync(typefaceM10330g, handler);
                }
                return typefaceM10330g;
            }
            typefaceMo10338a = C3504f.m10667a(context, dVar.m10220b(), i5, !z3 ? cVar != null : dVar.m10219a() != 0, z3 ? dVar.m10222d() : -1, C3368f.c.getHandler(handler), new a(cVar));
        } else {
            typefaceMo10338a = f11908a.mo10338a(context, (C3365c.b) aVar, resources, i5);
            if (cVar != null) {
                if (typefaceMo10338a != null) {
                    cVar.callbackSuccessAsync(typefaceMo10338a, handler);
                } else {
                    cVar.callbackFailAsync(-3, handler);
                }
            }
        }
        if (typefaceMo10338a != null) {
            f11909b.m1126d(m10328e(resources, i4, i5), typefaceMo10338a);
        }
        return typefaceMo10338a;
    }

    /* renamed from: d */
    public static Typeface m10327d(Context context, Resources resources, int i4, String str, int i5) {
        Typeface typefaceMo10350d = f11908a.mo10350d(context, resources, i4, str, i5);
        if (typefaceMo10350d != null) {
            f11909b.m1126d(m10328e(resources, i4, i5), typefaceMo10350d);
        }
        return typefaceMo10350d;
    }

    /* renamed from: e */
    private static String m10328e(Resources resources, int i4, int i5) {
        return resources.getResourcePackageName(i4) + "-" + i4 + "-" + i5;
    }

    /* renamed from: f */
    public static Typeface m10329f(Resources resources, int i4, int i5) {
        return f11909b.m1125c(m10328e(resources, i4, i5));
    }

    /* renamed from: g */
    private static Typeface m10330g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
