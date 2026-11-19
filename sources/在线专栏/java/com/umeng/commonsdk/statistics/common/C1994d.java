package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.umeng.commonsdk.statistics.common.d */
/* loaded from: classes.dex */
public final class C1994d {

    /* renamed from: a */
    private static C1994d f9358a = null;

    /* renamed from: b */
    private static Context f9359b = null;

    /* renamed from: c */
    private static String f9360c = null;

    /* renamed from: e */
    private static final String f9361e = "mobclick_agent_user_";

    /* renamed from: f */
    private static final String f9362f = "mobclick_agent_header_";

    /* renamed from: g */
    private static final String f9363g = "mobclick_agent_cached_";

    /* renamed from: d */
    private a f9364d;

    /* renamed from: com.umeng.commonsdk.statistics.common.d$a */
    public static class a {

        /* renamed from: a */
        private final int f9365a;

        /* renamed from: b */
        private File f9366b;

        /* renamed from: c */
        private FilenameFilter f9367c;

        public a(Context context) {
            this(context, ".um");
        }

        /* renamed from: a */
        public boolean m7651a() {
            File[] fileArrListFiles = this.f9366b.listFiles();
            return fileArrListFiles != null && fileArrListFiles.length > 0;
        }

        /* renamed from: b */
        public void m7652b() {
            File[] fileArrListFiles = this.f9366b.listFiles(this.f9367c);
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }

        /* renamed from: c */
        public int m7653c() {
            File[] fileArrListFiles = this.f9366b.listFiles(this.f9367c);
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return 0;
            }
            return fileArrListFiles.length;
        }

        public a(Context context, String str) {
            this.f9365a = 10;
            this.f9367c = new FilenameFilter() { // from class: com.umeng.commonsdk.statistics.common.d.a.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str2) {
                    return str2.startsWith("um");
                }
            };
            File file = new File(context.getFilesDir(), str);
            this.f9366b = file;
            if (file.exists() && this.f9366b.isDirectory()) {
                return;
            }
            this.f9366b.mkdir();
        }

        /* renamed from: a */
        public void m7649a(b bVar) {
            File file;
            File[] fileArrListFiles = this.f9366b.listFiles(this.f9367c);
            if (fileArrListFiles != null && fileArrListFiles.length >= 10) {
                Arrays.sort(fileArrListFiles);
                int length = fileArrListFiles.length - 10;
                for (int i4 = 0; i4 < length; i4++) {
                    fileArrListFiles[i4].delete();
                }
            }
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            bVar.m7654a(this.f9366b);
            int length2 = fileArrListFiles.length;
            for (int i5 = 0; i5 < length2; i5++) {
                try {
                } catch (Throwable unused) {
                    file = fileArrListFiles[i5];
                }
                if (bVar.m7655b(fileArrListFiles[i5])) {
                    file = fileArrListFiles[i5];
                    file.delete();
                }
            }
            bVar.m7656c(this.f9366b);
        }

        /* renamed from: a */
        public void m7650a(byte[] bArr) {
            if (bArr == null || bArr.length == 0) {
                return;
            }
            try {
                HelperUtils.writeFile(new File(this.f9366b, String.format(Locale.US, "um_cache_%d.env", Long.valueOf(System.currentTimeMillis()))), bArr);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.common.d$b */
    public interface b {
        /* renamed from: a */
        void m7654a(File file);

        /* renamed from: b */
        boolean m7655b(File file);

        /* renamed from: c */
        void m7656c(File file);
    }

    public C1994d(Context context) {
        this.f9364d = new a(context);
    }

    /* renamed from: a */
    public static synchronized C1994d m7639a(Context context) {
        f9359b = context.getApplicationContext();
        f9360c = context.getPackageName();
        if (f9358a == null) {
            f9358a = new C1994d(context);
        }
        return f9358a;
    }

    /* renamed from: f */
    private SharedPreferences m7640f() {
        return f9359b.getSharedPreferences(f9361e + f9360c, 0);
    }

    /* renamed from: b */
    public String m7645b() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f9359b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    /* renamed from: c */
    public boolean m7646c() {
        return UMFrUtils.envelopeFileNumber(f9359b) > 0;
    }

    /* renamed from: d */
    public String[] m7647d() {
        try {
            SharedPreferences sharedPreferencesM7640f = m7640f();
            String string = sharedPreferencesM7640f.getString("au_p", null);
            String string2 = sharedPreferencesM7640f.getString("au_u", null);
            if (string != null && string2 != null) {
                return new String[]{string, string2};
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: e */
    public void m7648e() {
        m7640f().edit().remove("au_p").remove("au_u").commit();
    }

    /* renamed from: a */
    public void m7642a(int i4) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f9359b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i4).commit();
        }
    }

    /* renamed from: a */
    public int m7641a() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f9359b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    /* renamed from: a */
    public void m7643a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f9359b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    /* renamed from: a */
    public void m7644a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = m7640f().edit();
        editorEdit.putString("au_p", str);
        editorEdit.putString("au_u", str2);
        editorEdit.commit();
    }
}
