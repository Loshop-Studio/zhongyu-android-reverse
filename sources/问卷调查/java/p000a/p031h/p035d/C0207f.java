package p000a.p031h.p035d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p000a.p021e.C0136h;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p033c.p034b.C0196d;
import p000a.p031h.p033c.p034b.C0197e;
import p000a.p031h.p040g.C0230l;

/* renamed from: a.h.d.f */
/* loaded from: classes.dex */
public class C0207f extends C0212k {

    /* renamed from: b */
    public static final Class<?> f1468b;

    /* renamed from: c */
    public static final Constructor<?> f1469c;

    /* renamed from: d */
    public static final Method f1470d;

    /* renamed from: e */
    public static final Method f1471e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f1469c = constructor;
        f1468b = cls;
        f1470d = method2;
        f1471e = method;
    }

    /* renamed from: f */
    public static boolean m770f(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f1470d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static Typeface m771g(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(f1468b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f1471e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p000a.p031h.p035d.C0212k
    /* renamed from: a */
    public Typeface mo768a(Context context, C0196d c0196d, Resources resources, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = f1469c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (C0197e c0197e : c0196d.f1430a) {
            int i2 = c0197e.f1436f;
            File fileM728w = C0190e.m728w(context);
            if (fileM728w == null) {
                map = null;
            } else {
                try {
                    if (C0190e.m718m(fileM728w, resources, i2)) {
                        try {
                            fileInputStream = new FileInputStream(fileM728w);
                        } catch (IOException unused2) {
                            map = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                        } finally {
                        }
                    } else {
                        map = null;
                    }
                } finally {
                    fileM728w.delete();
                }
            }
            if (map == null || !m770f(objNewInstance, map, c0197e.f1435e, c0197e.f1432b, c0197e.f1433c)) {
                return null;
            }
        }
        return m771g(objNewInstance);
    }

    @Override // p000a.p031h.p035d.C0212k
    /* renamed from: b */
    public Typeface mo769b(Context context, CancellationSignal cancellationSignal, C0230l[] c0230lArr, int i) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f1469c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        C0136h c0136h = new C0136h();
        for (C0230l c0230l : c0230lArr) {
            Uri uri = c0230l.f1514a;
            ByteBuffer byteBufferM692E = (ByteBuffer) c0136h.get(uri);
            if (byteBufferM692E == null) {
                byteBufferM692E = C0190e.m692E(context, cancellationSignal, uri);
                c0136h.put(uri, byteBufferM692E);
            }
            if (byteBufferM692E == null || !m770f(objNewInstance, byteBufferM692E, c0230l.f1515b, c0230l.f1516c, c0230l.f1517d)) {
                return null;
            }
        }
        Typeface typefaceM771g = m771g(objNewInstance);
        if (typefaceM771g == null) {
            return null;
        }
        return Typeface.create(typefaceM771g, i);
    }
}
