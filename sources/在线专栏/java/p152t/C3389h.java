package p152t;

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
import p148s.C3365c;
import p176z.C3504f;

/* renamed from: t.h */
/* loaded from: classes.dex */
class C3389h extends C3394m {

    /* renamed from: b */
    private static Class<?> f11911b = null;

    /* renamed from: c */
    private static Constructor<?> f11912c = null;

    /* renamed from: d */
    private static Method f11913d = null;

    /* renamed from: e */
    private static Method f11914e = null;

    /* renamed from: f */
    private static boolean f11915f = false;

    C3389h() {
    }

    /* renamed from: g */
    private static boolean m10333g(Object obj, String str, int i4, boolean z3) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        m10336j();
        try {
            return ((Boolean) f11913d.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: h */
    private static Typeface m10334h(Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        m10336j();
        try {
            Object objNewInstance = Array.newInstance(f11911b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f11914e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: i */
    private File m10335i(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: j */
    private static void m10336j() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f11915f) {
            return;
        }
        f11915f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
            method = null;
            cls = null;
            method2 = null;
        }
        f11912c = constructor;
        f11911b = cls;
        f11913d = method2;
        f11914e = method;
    }

    /* renamed from: k */
    private static Object m10337k() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        m10336j();
        try {
            return f11912c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // p152t.C3394m
    /* renamed from: a */
    public Typeface mo10338a(Context context, C3365c.b bVar, Resources resources, int i4) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Object objM10337k = m10337k();
        for (C3365c.c cVar : bVar.m10212a()) {
            File fileM10370e = C3395n.m10370e(context);
            if (fileM10370e == null) {
                return null;
            }
            try {
                if (!C3395n.m10368c(fileM10370e, resources, cVar.m10214b())) {
                    return null;
                }
                if (!m10333g(objM10337k, fileM10370e.getPath(), cVar.m10217e(), cVar.m10218f())) {
                    return null;
                }
                fileM10370e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileM10370e.delete();
            }
        }
        return m10334h(objM10337k);
    }

    @Override // p152t.C3394m
    /* renamed from: b */
    public Typeface mo10339b(Context context, CancellationSignal cancellationSignal, C3504f.b[] bVarArr, int i4) throws IOException {
        if (bVarArr.length < 1) {
            return null;
        }
        C3504f.b bVarMo10359f = mo10359f(bVarArr, i4);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarMo10359f.m10674d(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileM10335i = m10335i(parcelFileDescriptorOpenFileDescriptor);
                if (fileM10335i != null && fileM10335i.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM10335i);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceM10361c = super.m10361c(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceM10361c;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
