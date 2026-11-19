package com.blankj.utilcode.util;

import android.os.Environment;
import android.support.v4.media.AbstractC0037f;
import android.support.v4.media.C0039h;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Formatter;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p016b0.C3071g;

/* renamed from: com.blankj.utilcode.util.g */
/* loaded from: classes2.dex */
public abstract class AbstractC3387g {

    /* renamed from: a */
    public static final char[] f2157a = {'V', 'D', 'I', 'W', 'E', 'A'};

    /* renamed from: b */
    public static final String f2158b;

    /* renamed from: c */
    public static final C3071g f2159c;

    /* renamed from: d */
    public static final ExecutorService f2160d;

    /* renamed from: e */
    public static final SimpleArrayMap f2161e;

    static {
        String property = System.getProperty("file.separator");
        f2158b = System.getProperty("line.separator");
        C3071g c3071g = new C3071g(4);
        c3071g.f1421c = AbstractC3383c0.m2325d();
        C3071g c3071g2 = new C3071g(5);
        c3071g2.f1421c = new LinkedHashMap();
        c3071g2.f1422d = new LinkedHashMap();
        c3071g2.f1420b = "Log";
        c3071g.f1422d = c3071g2;
        if (!"mounted".equals(Environment.getExternalStorageState()) || AbstractC3382c.m2303d().getExternalFilesDir(null) == null) {
            c3071g.f1420b = AbstractC3382c.m2303d().getFilesDir() + property + "log" + property;
        } else {
            c3071g.f1420b = AbstractC3382c.m2303d().getExternalFilesDir(null) + property + "log" + property;
        }
        f2159c = c3071g;
        f2160d = Executors.newSingleThreadExecutor();
        f2161e = new SimpleArrayMap();
    }

    /* renamed from: a */
    public static void m2338a(Object... objArr) {
        f2159c.m2021e();
        m2343f(3, "", objArr);
    }

    /* renamed from: b */
    public static void m2339b(Object... objArr) {
        f2159c.m2021e();
        m2343f(6, "", objArr);
    }

    /* renamed from: c */
    public static String m2340c(Object obj) throws ClassNotFoundException {
        String string;
        if (obj == null) {
            return "null";
        }
        SimpleArrayMap simpleArrayMap = f2161e;
        if (!simpleArrayMap.isEmpty()) {
            Class<?> cls = obj.getClass();
            if (cls.isAnonymousClass() || cls.isSynthetic()) {
                Type[] genericInterfaces = cls.getGenericInterfaces();
                if (genericInterfaces.length == 1) {
                    Type rawType = genericInterfaces[0];
                    while (rawType instanceof ParameterizedType) {
                        rawType = ((ParameterizedType) rawType).getRawType();
                    }
                    string = rawType.toString();
                } else {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    while (genericSuperclass instanceof ParameterizedType) {
                        genericSuperclass = ((ParameterizedType) genericSuperclass).getRawType();
                    }
                    string = genericSuperclass.toString();
                }
                if (string.startsWith("class ")) {
                    string = string.substring(6);
                } else if (string.startsWith("interface ")) {
                    string = string.substring(10);
                }
                try {
                    cls = Class.forName(string);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            if (simpleArrayMap.get(cls) != null) {
                throw new ClassCastException();
            }
        }
        return AbstractC3382c.m2311l(-1, obj);
    }

    /* renamed from: d */
    public static String m2341d(StackTraceElement stackTraceElement) {
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            return fileName;
        }
        String className = stackTraceElement.getClassName();
        String[] strArrSplit = className.split("\\.");
        if (strArrSplit.length > 0) {
            className = strArrSplit[strArrSplit.length - 1];
        }
        int iIndexOf = className.indexOf(36);
        if (iIndexOf != -1) {
            className = className.substring(0, iIndexOf);
        }
        return AbstractC0037f.m74C(className, ".java");
    }

    /* renamed from: e */
    public static void m2342e(Object... objArr) {
        f2159c.m2021e();
        m2343f(4, "", objArr);
    }

    /* renamed from: f */
    public static void m2343f(int i, String str, Object... objArr) {
        C0039h c0039h;
        String string;
        f2159c.getClass();
        int i8 = i & 15;
        if (i8 >= 2 || i8 >= 2) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (3 >= stackTrace.length) {
                String strM2341d = m2341d(stackTrace[3]);
                if (AbstractC3383c0.m2327f(str)) {
                    int iIndexOf = strM2341d.indexOf(46);
                    str = iIndexOf == -1 ? strM2341d : strM2341d.substring(0, iIndexOf);
                }
                c0039h = new C0039h(str, (String[]) null, ": ");
            } else {
                StackTraceElement stackTraceElement = stackTrace[3];
                String strM2341d2 = m2341d(stackTraceElement);
                if (AbstractC3383c0.m2327f(str)) {
                    int iIndexOf2 = strM2341d2.indexOf(46);
                    str = iIndexOf2 == -1 ? strM2341d2 : strM2341d2.substring(0, iIndexOf2);
                }
                String string2 = new Formatter().format("%s, %s.%s(%s:%d)", Thread.currentThread().getName(), stackTraceElement.getClassName(), stackTraceElement.getMethodName(), strM2341d2, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
                c0039h = new C0039h(str, new String[]{string2}, AbstractC0037f.m86k(" [", string2, "]: "));
            }
            int length = objArr.length;
            String str2 = f2158b;
            int i9 = 1;
            if (length == 1) {
                Object obj = objArr[0];
                string = obj == null ? "null" : m2340c(obj);
            } else {
                StringBuilder sb = new StringBuilder();
                int length2 = objArr.length;
                for (int i10 = 0; i10 < length2; i10++) {
                    Object obj2 = objArr[i10];
                    sb.append("args[");
                    sb.append(i10);
                    sb.append("] = ");
                    sb.append(m2340c(obj2));
                    sb.append(str2);
                }
                string = sb.toString();
            }
            if (string.length() == 0) {
                string = "log nothing";
            }
            if (i8 >= 2) {
                String str3 = (String) c0039h.f96b;
                String[] strArr = (String[]) c0039h.f97c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" ");
                sb2.append(str2);
                sb2.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                sb2.append(str2);
                if (strArr != null) {
                    for (String str4 : strArr) {
                        sb2.append("│ ");
                        sb2.append(str4);
                        sb2.append(str2);
                    }
                    sb2.append("├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
                    sb2.append(str2);
                }
                for (String str5 : string.split(str2)) {
                    sb2.append("│ ");
                    sb2.append(str5);
                    sb2.append(str2);
                }
                sb2.append("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                String string3 = sb2.toString();
                int length3 = string3.length();
                int i11 = 1100;
                int i12 = (length3 - 113) / 1100;
                if (i12 <= 0) {
                    m2344g(i8, str3, string3);
                    return;
                }
                m2344g(i8, str3, string3.substring(0, 1100) + str2 + "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                while (i9 < i12) {
                    StringBuilder sbM101z = AbstractC0037f.m101z(" ", str2, "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────", str2, "│ ");
                    int i13 = i11 + 1100;
                    sbM101z.append(string3.substring(i11, i13));
                    sbM101z.append(str2);
                    sbM101z.append("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                    m2344g(i8, str3, sbM101z.toString());
                    i9++;
                    i11 = i13;
                }
                if (i11 != length3 - 113) {
                    StringBuilder sbM101z2 = AbstractC0037f.m101z(" ", str2, "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────", str2, "│ ");
                    sbM101z2.append(string3.substring(i11, length3));
                    m2344g(i8, str3, sbM101z2.toString());
                }
            }
        }
    }

    /* renamed from: g */
    public static void m2344g(int i, String str, String str2) {
        Log.println(i, str, str2);
        f2159c.getClass();
    }
}
