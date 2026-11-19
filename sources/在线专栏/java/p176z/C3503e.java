package p176z;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.collection.C0251e;
import androidx.collection.C0253g;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p011b0.InterfaceC1018a;
import p152t.C3388g;
import p176z.C3504f;

/* renamed from: z.e */
/* loaded from: classes.dex */
class C3503e {

    /* renamed from: a */
    static final C0251e<String, Typeface> f12256a = new C0251e<>(16);

    /* renamed from: b */
    private static final ExecutorService f12257b = C3505g.m10677a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f12258c = new Object();

    /* renamed from: d */
    static final C0253g<String, ArrayList<InterfaceC1018a<e>>> f12259d = new C0253g<>();

    /* renamed from: z.e$a */
    class a implements Callable<e> {

        /* renamed from: a */
        final /* synthetic */ String f12260a;

        /* renamed from: b */
        final /* synthetic */ Context f12261b;

        /* renamed from: c */
        final /* synthetic */ C3502d f12262c;

        /* renamed from: d */
        final /* synthetic */ int f12263d;

        a(String str, Context context, C3502d c3502d, int i4) {
            this.f12260a = str;
            this.f12261b = context;
            this.f12262c = c3502d;
            this.f12263d = i4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return C3503e.m10659c(this.f12260a, this.f12261b, this.f12262c, this.f12263d);
        }
    }

    /* renamed from: z.e$b */
    class b implements InterfaceC1018a<e> {

        /* renamed from: a */
        final /* synthetic */ C3499a f12264a;

        b(C3499a c3499a) {
            this.f12264a = c3499a;
        }

        @Override // p011b0.InterfaceC1018a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            this.f12264a.m10641b(eVar);
        }
    }

    /* renamed from: z.e$c */
    class c implements Callable<e> {

        /* renamed from: a */
        final /* synthetic */ String f12265a;

        /* renamed from: b */
        final /* synthetic */ Context f12266b;

        /* renamed from: c */
        final /* synthetic */ C3502d f12267c;

        /* renamed from: d */
        final /* synthetic */ int f12268d;

        c(String str, Context context, C3502d c3502d, int i4) {
            this.f12265a = str;
            this.f12266b = context;
            this.f12267c = c3502d;
            this.f12268d = i4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return C3503e.m10659c(this.f12265a, this.f12266b, this.f12267c, this.f12268d);
        }
    }

    /* renamed from: z.e$d */
    class d implements InterfaceC1018a<e> {

        /* renamed from: a */
        final /* synthetic */ String f12269a;

        d(String str) {
            this.f12269a = str;
        }

        @Override // p011b0.InterfaceC1018a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (C3503e.f12258c) {
                C0253g<String, ArrayList<InterfaceC1018a<e>>> c0253g = C3503e.f12259d;
                ArrayList<InterfaceC1018a<e>> arrayList = c0253g.get(this.f12269a);
                if (arrayList == null) {
                    return;
                }
                c0253g.remove(this.f12269a);
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    arrayList.get(i4).accept(eVar);
                }
            }
        }
    }

    /* renamed from: a */
    private static String m10657a(C3502d c3502d, int i4) {
        return c3502d.m10653d() + "-" + i4;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    private static int m10658b(C3504f.a aVar) {
        int i4 = 1;
        if (aVar.m10670c() != 0) {
            return aVar.m10670c() != 1 ? -3 : -2;
        }
        C3504f.b[] bVarArrM10669b = aVar.m10669b();
        if (bVarArrM10669b != null && bVarArrM10669b.length != 0) {
            i4 = 0;
            for (C3504f.b bVar : bVarArrM10669b) {
                int iM10672b = bVar.m10672b();
                if (iM10672b != 0) {
                    if (iM10672b < 0) {
                        return -3;
                    }
                    return iM10672b;
                }
            }
        }
        return i4;
    }

    /* renamed from: c */
    static e m10659c(String str, Context context, C3502d c3502d, int i4) {
        C0251e<String, Typeface> c0251e = f12256a;
        Typeface typefaceM1125c = c0251e.m1125c(str);
        if (typefaceM1125c != null) {
            return new e(typefaceM1125c);
        }
        try {
            C3504f.a aVarM10646d = C3501c.m10646d(context, c3502d, null);
            int iM10658b = m10658b(aVarM10646d);
            if (iM10658b != 0) {
                return new e(iM10658b);
            }
            Typeface typefaceM10325b = C3388g.m10325b(context, null, aVarM10646d.m10669b(), i4);
            if (typefaceM10325b == null) {
                return new e(-3);
            }
            c0251e.m1126d(str, typefaceM10325b);
            return new e(typefaceM10325b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* renamed from: d */
    static Typeface m10660d(Context context, C3502d c3502d, int i4, Executor executor, C3499a c3499a) {
        String strM10657a = m10657a(c3502d, i4);
        Typeface typefaceM1125c = f12256a.m1125c(strM10657a);
        if (typefaceM1125c != null) {
            c3499a.m10641b(new e(typefaceM1125c));
            return typefaceM1125c;
        }
        b bVar = new b(c3499a);
        synchronized (f12258c) {
            C0253g<String, ArrayList<InterfaceC1018a<e>>> c0253g = f12259d;
            ArrayList<InterfaceC1018a<e>> arrayList = c0253g.get(strM10657a);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<InterfaceC1018a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            c0253g.put(strM10657a, arrayList2);
            c cVar = new c(strM10657a, context, c3502d, i4);
            if (executor == null) {
                executor = f12257b;
            }
            C3505g.m10678b(executor, cVar, new d(strM10657a));
            return null;
        }
    }

    /* renamed from: e */
    static Typeface m10661e(Context context, C3502d c3502d, C3499a c3499a, int i4, int i5) {
        String strM10657a = m10657a(c3502d, i4);
        Typeface typefaceM1125c = f12256a.m1125c(strM10657a);
        if (typefaceM1125c != null) {
            c3499a.m10641b(new e(typefaceM1125c));
            return typefaceM1125c;
        }
        if (i5 == -1) {
            e eVarM10659c = m10659c(strM10657a, context, c3502d, i4);
            c3499a.m10641b(eVarM10659c);
            return eVarM10659c.f12270a;
        }
        try {
            e eVar = (e) C3505g.m10679c(f12257b, new a(strM10657a, context, c3502d, i4), i5);
            c3499a.m10641b(eVar);
            return eVar.f12270a;
        } catch (InterruptedException unused) {
            c3499a.m10641b(new e(-3));
            return null;
        }
    }

    /* renamed from: z.e$e */
    static final class e {

        /* renamed from: a */
        final Typeface f12270a;

        /* renamed from: b */
        final int f12271b;

        e(int i4) {
            this.f12270a = null;
            this.f12271b = i4;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        boolean m10666a() {
            return this.f12271b == 0;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f12270a = typeface;
            this.f12271b = 0;
        }
    }
}
