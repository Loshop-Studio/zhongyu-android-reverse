package p148s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p011b0.C1020c;
import p011b0.C1025h;

/* renamed from: s.f */
/* loaded from: classes.dex */
public final class C3368f {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f11827a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<b, SparseArray<a>> f11828b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f11829c = new Object();

    /* renamed from: s.f$a */
    private static class a {

        /* renamed from: a */
        final ColorStateList f11830a;

        /* renamed from: b */
        final Configuration f11831b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.f11830a = colorStateList;
            this.f11831b = configuration;
        }
    }

    /* renamed from: s.f$b */
    private static final class b {

        /* renamed from: a */
        final Resources f11832a;

        /* renamed from: b */
        final Resources.Theme f11833b;

        b(Resources resources, Resources.Theme theme) {
            this.f11832a = resources;
            this.f11833b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11832a.equals(bVar.f11832a) && C1020c.m4773a(this.f11833b, bVar.f11833b);
        }

        public int hashCode() {
            return C1020c.m4774b(this.f11832a, this.f11833b);
        }
    }

    /* renamed from: s.f$c */
    public static abstract class c {

        /* renamed from: s.f$c$a */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Typeface f11834a;

            a(Typeface typeface) {
                this.f11834a = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.onFontRetrieved(this.f11834a);
            }
        }

        /* renamed from: s.f$c$b */
        class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f11836a;

            b(int i4) {
                this.f11836a = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.onFontRetrievalFailed(this.f11836a);
            }
        }

        public static Handler getHandler(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void callbackFailAsync(int i4, Handler handler) {
            getHandler(handler).post(new b(i4));
        }

        public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
            getHandler(handler).post(new a(typeface));
        }

        public abstract void onFontRetrievalFailed(int i4);

        public abstract void onFontRetrieved(Typeface typeface);
    }

    /* renamed from: s.f$d */
    public static final class d {

        /* renamed from: s.f$d$a */
        static class a {

            /* renamed from: a */
            private static final Object f11838a = new Object();

            /* renamed from: b */
            private static Method f11839b;

            /* renamed from: c */
            private static boolean f11840c;

            /* JADX WARN: Removed duplicated region for block: B:30:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            static void m10243a(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = p148s.C3368f.d.a.f11838a
                    monitor-enter(r0)
                    boolean r1 = p148s.C3368f.d.a.f11840c     // Catch: java.lang.Throwable -> L3c
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    p148s.C3368f.d.a.f11839b = r3     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    goto L21
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L3c
                L21:
                    p148s.C3368f.d.a.f11840c = r1     // Catch: java.lang.Throwable -> L3c
                L23:
                    java.lang.reflect.Method r1 = p148s.C3368f.d.a.f11839b     // Catch: java.lang.Throwable -> L3c
                    if (r1 == 0) goto L3a
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    goto L3a
                L2d:
                    r6 = move-exception
                    goto L30
                L2f:
                    r6 = move-exception
                L30:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r2 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L3c
                    r6 = 0
                    p148s.C3368f.d.a.f11839b = r6     // Catch: java.lang.Throwable -> L3c
                L3a:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    return
                L3c:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p148s.C3368f.d.a.m10243a(android.content.res.Resources$Theme):void");
            }
        }

        /* renamed from: s.f$d$b */
        static class b {
            /* renamed from: a */
            static void m10244a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m10242a(Resources.Theme theme) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29) {
                b.m10244a(theme);
            } else if (i4 >= 23) {
                a.m10243a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m10230a(b bVar, int i4, ColorStateList colorStateList) {
        synchronized (f11829c) {
            WeakHashMap<b, SparseArray<a>> weakHashMap = f11828b;
            SparseArray<a> sparseArray = weakHashMap.get(bVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(bVar, sparseArray);
            }
            sparseArray.append(i4, new a(colorStateList, bVar.f11832a.getConfiguration()));
        }
    }

    /* renamed from: b */
    private static ColorStateList m10231b(b bVar, int i4) {
        a aVar;
        synchronized (f11829c) {
            SparseArray<a> sparseArray = f11828b.get(bVar);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i4)) != null) {
                if (aVar.f11831b.equals(bVar.f11832a.getConfiguration())) {
                    return aVar.f11830a;
                }
                sparseArray.remove(i4);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m10232c(Resources resources, int i4, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i4, theme);
        }
        b bVar = new b(resources, theme);
        ColorStateList colorStateListM10231b = m10231b(bVar, i4);
        if (colorStateListM10231b != null) {
            return colorStateListM10231b;
        }
        ColorStateList colorStateListM10238i = m10238i(resources, i4, theme);
        if (colorStateListM10238i == null) {
            return resources.getColorStateList(i4);
        }
        m10230a(bVar, i4, colorStateListM10238i);
        return colorStateListM10238i;
    }

    /* renamed from: d */
    public static Drawable m10233d(Resources resources, int i4, Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawable(i4, theme);
    }

    /* renamed from: e */
    public static Typeface m10234e(Context context, int i4) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m10240k(context, i4, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: f */
    public static Typeface m10235f(Context context, int i4, TypedValue typedValue, int i5, c cVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m10240k(context, i4, typedValue, i5, cVar, null, true, false);
    }

    /* renamed from: g */
    public static void m10236g(Context context, int i4, c cVar, Handler handler) throws Resources.NotFoundException {
        C1025h.m4782f(cVar);
        if (context.isRestricted()) {
            cVar.callbackFailAsync(-4, handler);
        } else {
            m10240k(context, i4, new TypedValue(), 0, cVar, handler, false, false);
        }
    }

    /* renamed from: h */
    private static TypedValue m10237h() {
        ThreadLocal<TypedValue> threadLocal = f11827a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: i */
    private static ColorStateList m10238i(Resources resources, int i4, Resources.Theme theme) {
        if (m10239j(resources, i4)) {
            return null;
        }
        try {
            return C3363a.m10184a(resources, resources.getXml(i4), theme);
        } catch (Exception e4) {
            Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e4);
            return null;
        }
    }

    /* renamed from: j */
    private static boolean m10239j(Resources resources, int i4) throws Resources.NotFoundException {
        TypedValue typedValueM10237h = m10237h();
        resources.getValue(i4, typedValueM10237h, true);
        int i5 = typedValueM10237h.type;
        return i5 >= 28 && i5 <= 31;
    }

    /* renamed from: k */
    private static Typeface m10240k(Context context, int i4, TypedValue typedValue, int i5, c cVar, Handler handler, boolean z3, boolean z4) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        Typeface typefaceM10241l = m10241l(context, resources, typedValue, i4, i5, cVar, handler, z3, z4);
        if (typefaceM10241l != null || cVar != null || z4) {
            return typefaceM10241l;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i4) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface m10241l(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, p148s.C3368f.c r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Laa
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L26
            if (r9 == 0) goto L25
            r9.callbackFailAsync(r13, r10)
        L25:
            return r14
        L26:
            android.graphics.Typeface r1 = p152t.C3388g.m10329f(r0, r4, r5)
            if (r1 == 0) goto L32
            if (r9 == 0) goto L31
            r9.callbackSuccessAsync(r1, r10)
        L31:
            return r1
        L32:
            if (r23 == 0) goto L35
            return r14
        L35:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r1 == 0) goto L68
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            s.c$a r2 = p148s.C3365c.m10205b(r1, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r2 != 0) goto L56
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L55
            r9.callbackFailAsync(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L55:
            return r14
        L56:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p152t.C3388g.m10326c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            return r0
        L68:
            r1 = r15
            android.graphics.Typeface r0 = p152t.C3388g.m10327d(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L78
            if (r0 == 0) goto L75
            r9.callbackSuccessAsync(r0, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            goto L78
        L75:
            r9.callbackFailAsync(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L78:
            return r0
        L79:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto La4
        L8f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        La4:
            if (r9 == 0) goto La9
            r9.callbackFailAsync(r13, r10)
        La9:
            return r14
        Laa:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p148s.C3368f.m10241l(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, s.f$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
