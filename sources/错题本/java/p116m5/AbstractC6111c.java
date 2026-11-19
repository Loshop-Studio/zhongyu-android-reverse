package p116m5;

import android.support.v4.media.AbstractC0037f;
import io.objectbox.BoxStore;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: m5.c */
/* loaded from: classes3.dex */
public abstract class AbstractC6111c {

    /* renamed from: a */
    public static final /* synthetic */ int f9754a = 0;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
    static {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p116m5.AbstractC6111c.<clinit>():void");
    }

    /* renamed from: a */
    public static void m5805a(String str) throws IOException {
        String strM85j = AbstractC0037f.m85j("/native/", str);
        URL resource = AbstractC6111c.class.getResource(strM85j);
        if (resource == null) {
            System.err.println("Not available in classpath: " + strM85j);
            return;
        }
        File file = new File(str);
        try {
            URLConnection uRLConnectionOpenConnection = resource.openConnection();
            int contentLength = uRLConnectionOpenConnection.getContentLength();
            long lastModified = uRLConnectionOpenConnection.getLastModified();
            if (file.exists() && file.length() == contentLength && file.lastModified() == lastModified) {
                return;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(uRLConnectionOpenConnection.getInputStream());
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        } else {
                            bufferedOutputStream.write(bArr, 0, i);
                        }
                    }
                    if (lastModified > 0) {
                        file.setLastModified(lastModified);
                    }
                } finally {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
            } finally {
                try {
                    bufferedInputStream.close();
                } catch (IOException unused3) {
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static String m5806b() throws IOException {
        String line = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("uname -m").getInputStream()));
            line = bufferedReader.readLine();
            bufferedReader.close();
            return line;
        } catch (Exception unused) {
            return line;
        }
    }

    /* renamed from: c */
    public static boolean m5807c() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object obj;
        Object obj2;
        Object obj3 = BoxStore.f8894s;
        synchronized (BoxStore.class) {
            obj = BoxStore.f8894s;
        }
        if (obj == null) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("android.content.Context");
            synchronized (BoxStore.class) {
            }
            Method method = Class.forName("com.getkeepsafe.relinker.ReLinker").getMethod("loadLibrary", cls, String.class, String.class);
            synchronized (BoxStore.class) {
                obj2 = BoxStore.f8894s;
            }
            method.invoke(null, obj2, "objectbox-jni", "2.9.1");
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }
}
