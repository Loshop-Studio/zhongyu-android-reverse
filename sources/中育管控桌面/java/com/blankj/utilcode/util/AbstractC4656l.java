package com.blankj.utilcode.util;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.blankj.utilcode.util.l */
/* loaded from: classes3.dex */
public abstract class AbstractC4656l {

    /* renamed from: a */
    public static final String f2088a = System.getProperty("line.separator");

    /* renamed from: com.blankj.utilcode.util.l$a */
    public interface a {
        /* renamed from: a */
        boolean m2249a(File file, File file2);
    }

    /* renamed from: a */
    public static boolean m2223a(File file, File file2, a aVar) {
        if (file == null) {
            return false;
        }
        return file.isDirectory() ? m2225c(file, file2, aVar) : m2226d(file, file2, aVar);
    }

    /* renamed from: b */
    public static boolean m2224b(String str, String str2) {
        return m2223a(m2239q(str), m2239q(str2), null);
    }

    /* renamed from: c */
    public static boolean m2225c(File file, File file2, a aVar) {
        return m2227e(file, file2, aVar, false);
    }

    /* renamed from: d */
    public static boolean m2226d(File file, File file2, a aVar) {
        return m2228f(file, file2, aVar, false);
    }

    /* renamed from: e */
    public static boolean m2227e(File file, File file2, a aVar, boolean z6) {
        if (file != null && file2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            String str = File.separator;
            sb.append(str);
            String string = sb.toString();
            String str2 = file2.getPath() + str;
            if (str2.contains(string) || !file.exists() || !file.isDirectory() || !m2230h(file2)) {
                return false;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file3 : fileArrListFiles) {
                    File file4 = new File(str2 + file3.getName());
                    if (file3.isFile()) {
                        if (!m2228f(file3, file4, aVar, z6)) {
                            return false;
                        }
                    } else if (file3.isDirectory() && !m2227e(file3, file4, aVar, z6)) {
                        return false;
                    }
                }
            }
            return !z6 || m2235m(file);
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m2228f(File file, File file2, a aVar, boolean z6) {
        if (file != null && file2 != null && !file.equals(file2) && file.exists() && file.isFile()) {
            if (file2.exists()) {
                if (aVar != null && !aVar.m2249a(file, file2)) {
                    return true;
                }
                if (!file2.delete()) {
                    return false;
                }
            }
            if (!m2230h(file2.getParentFile())) {
                return false;
            }
            try {
                if (AbstractC4663o0.m2314Q(file2.getAbsolutePath(), new FileInputStream(file))) {
                    if (z6) {
                        if (m2236n(file)) {
                        }
                    }
                    return true;
                }
                return false;
            } catch (FileNotFoundException e6) {
                e6.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m2229g(File file) {
        if (file == null) {
            return false;
        }
        if ((file.exists() && !file.delete()) || !m2230h(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e6) {
            e6.printStackTrace();
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m2230h(File file) {
        if (file != null) {
            return file.exists() ? file.isDirectory() : file.mkdirs();
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m2231i(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!m2230h(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e6) {
            e6.printStackTrace();
            return false;
        }
    }

    /* renamed from: j */
    public static boolean m2232j(String str) {
        return m2231i(m2239q(str));
    }

    /* renamed from: k */
    public static boolean m2233k(File file) {
        if (file == null) {
            return false;
        }
        return file.isDirectory() ? m2235m(file) : m2236n(file);
    }

    /* renamed from: l */
    public static boolean m2234l(String str) {
        return m2233k(m2239q(str));
    }

    /* renamed from: m */
    public static boolean m2235m(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !m2235m(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* renamed from: n */
    public static boolean m2236n(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile() && file.delete();
        }
        return true;
    }

    /* renamed from: o */
    public static long m2237o(File file) {
        long jM2237o = 0;
        if (!m2244v(file)) {
            return 0L;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                jM2237o += file2.isDirectory() ? m2237o(file2) : file2.length();
            }
        }
        return jM2237o;
    }

    /* renamed from: p */
    public static String m2238p(File file) {
        long jM2237o = m2237o(file);
        return jM2237o == -1 ? "" : AbstractC4663o0.m2317b(jM2237o);
    }

    /* renamed from: q */
    public static File m2239q(String str) {
        if (AbstractC4663o0.m2304G(str)) {
            return null;
        }
        return new File(str);
    }

    /* renamed from: r */
    public static long m2240r(File file) {
        if (m2245w(file)) {
            return file.length();
        }
        return -1L;
    }

    /* renamed from: s */
    public static String m2241s(File file) {
        long jM2240r = m2240r(file);
        return jM2240r == -1 ? "" : AbstractC4663o0.m2317b(jM2240r);
    }

    /* renamed from: t */
    public static String m2242t(File file) {
        return file == null ? "" : file.isDirectory() ? m2238p(file) : m2241s(file);
    }

    /* renamed from: u */
    public static String m2243u(String str) {
        return m2242t(m2239q(str));
    }

    /* renamed from: v */
    public static boolean m2244v(File file) {
        return file != null && file.exists() && file.isDirectory();
    }

    /* renamed from: w */
    public static boolean m2245w(File file) {
        return file != null && file.exists() && file.isFile();
    }

    /* renamed from: x */
    public static boolean m2246x(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        return m2247y(file.getAbsolutePath());
    }

    /* renamed from: y */
    public static boolean m2247y(String str) {
        File fileM2239q = m2239q(str);
        if (fileM2239q == null) {
            return false;
        }
        if (fileM2239q.exists()) {
            return true;
        }
        return m2248z(str);
    }

    /* renamed from: z */
    public static boolean m2248z(String str) throws IOException {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = AbstractC4657l0.m2250a().getContentResolver().openAssetFileDescriptor(Uri.parse(str), "r");
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    return false;
                }
                try {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (FileNotFoundException unused2) {
            }
        }
        return false;
    }
}
