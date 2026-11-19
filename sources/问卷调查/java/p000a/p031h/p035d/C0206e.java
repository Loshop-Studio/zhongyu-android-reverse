package p000a.p031h.p035d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p033c.p034b.C0196d;
import p000a.p031h.p033c.p034b.C0197e;
import p000a.p031h.p040g.C0230l;

/* renamed from: a.h.d.e */
/* loaded from: classes.dex */
public class C0206e extends C0212k {

    /* renamed from: b */
    public static Class<?> f1463b = null;

    /* renamed from: c */
    public static Constructor<?> f1464c = null;

    /* renamed from: d */
    public static Method f1465d = null;

    /* renamed from: e */
    public static Method f1466e = null;

    /* renamed from: f */
    public static boolean f1467f = false;

    /* renamed from: f */
    public static boolean m766f(Object obj, String str, int i, boolean z) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        m767g();
        try {
            return ((Boolean) f1465d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: g */
    public static void m767g() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1467f) {
            return;
        }
        f1467f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f1464c = constructor;
        f1463b = cls;
        f1465d = method2;
        f1466e = method;
    }

    @Override // p000a.p031h.p035d.C0212k
    /* renamed from: a */
    public Typeface mo768a(Context context, C0196d c0196d, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        m767g();
        try {
            Object objNewInstance = f1464c.newInstance(new Object[0]);
            for (C0197e c0197e : c0196d.f1430a) {
                File fileM728w = C0190e.m728w(context);
                if (fileM728w == null) {
                    return null;
                }
                try {
                    if (!C0190e.m718m(fileM728w, resources, c0197e.f1436f)) {
                        return null;
                    }
                    if (!m766f(objNewInstance, fileM728w.getPath(), c0197e.f1432b, c0197e.f1433c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM728w.delete();
                }
            }
            m767g();
            try {
                Object objNewInstance2 = Array.newInstance(f1463b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f1466e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // p000a.p031h.p035d.C0212k
    /* renamed from: b */
    public Typeface mo769b(Context context, CancellationSignal cancellationSignal, C0230l[] c0230lArr, int i) throws IOException {
        String str;
        if (c0230lArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(((C0230l) C0212k.m785e(c0230lArr, i, new C0211j(this))).f1514a, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                } finally {
                }
            } catch (ErrnoException unused) {
            }
            File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
            if (file != null && file.canRead()) {
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceCreateFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                Typeface typefaceMo782c = mo782c(context, fileInputStream);
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceMo782c;
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
