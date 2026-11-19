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
/* loaded from: classes2.dex */
public final class C3478d {

    /* renamed from: a */
    private static C3478d f2766a = null;

    /* renamed from: b */
    private static Context f2767b = null;

    /* renamed from: c */
    private static String f2768c = null;

    /* renamed from: e */
    private static final String f2769e = "mobclick_agent_user_";

    /* renamed from: f */
    private static final String f2770f = "mobclick_agent_header_";

    /* renamed from: g */
    private static final String f2771g = "mobclick_agent_cached_";

    /* renamed from: d */
    private a f2772d;

    /* renamed from: com.umeng.commonsdk.statistics.common.d$a */
    public static class a {

        /* renamed from: a */
        private final int f2773a;

        /* renamed from: b */
        private File f2774b;

        /* renamed from: c */
        private FilenameFilter f2775c;

        public a(Context context) {
            this(context, ".um");
        }

        /* renamed from: a */
        public boolean m3728a() {
            File[] fileArrListFiles = this.f2774b.listFiles();
            return fileArrListFiles != null && fileArrListFiles.length > 0;
        }

        /* renamed from: b */
        public void m3729b() {
            File[] fileArrListFiles = this.f2774b.listFiles(this.f2775c);
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }

        /* renamed from: c */
        public int m3730c() {
            File[] fileArrListFiles = this.f2774b.listFiles(this.f2775c);
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return 0;
            }
            return fileArrListFiles.length;
        }

        public a(Context context, String str) {
            this.f2773a = 10;
            this.f2775c = new FilenameFilter() { // from class: com.umeng.commonsdk.statistics.common.d.a.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str2) {
                    return str2.startsWith("um");
                }
            };
            File file = new File(context.getFilesDir(), str);
            this.f2774b = file;
            if (file.exists() && this.f2774b.isDirectory()) {
                return;
            }
            this.f2774b.mkdir();
        }

        /* renamed from: a */
        public void m3726a(b bVar) {
            File file;
            File[] fileArrListFiles = this.f2774b.listFiles(this.f2775c);
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
            bVar.m3731a(this.f2774b);
            int length2 = fileArrListFiles.length;
            for (int i5 = 0; i5 < length2; i5++) {
                try {
                } catch (Throwable unused) {
                    file = fileArrListFiles[i5];
                }
                if (bVar.m3732b(fileArrListFiles[i5])) {
                    file = fileArrListFiles[i5];
                    file.delete();
                }
            }
            bVar.m3733c(this.f2774b);
        }

        /* renamed from: a */
        public void m3727a(byte[] bArr) {
            if (bArr == null || bArr.length == 0) {
                return;
            }
            try {
                HelperUtils.writeFile(new File(this.f2774b, String.format(Locale.US, "um_cache_%d.env", Long.valueOf(System.currentTimeMillis()))), bArr);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.common.d$b */
    public interface b {
        /* renamed from: a */
        void m3731a(File file);

        /* renamed from: b */
        boolean m3732b(File file);

        /* renamed from: c */
        void m3733c(File file);
    }

    public C3478d(Context context) {
        this.f2772d = new a(context);
    }

    /* renamed from: a */
    public static synchronized C3478d m3716a(Context context) {
        f2767b = context.getApplicationContext();
        f2768c = context.getPackageName();
        if (f2766a == null) {
            f2766a = new C3478d(context);
        }
        return f2766a;
    }

    /* renamed from: f */
    private SharedPreferences m3717f() {
        return f2767b.getSharedPreferences(f2769e + f2768c, 0);
    }

    /* renamed from: b */
    public String m3722b() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2767b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    /* renamed from: c */
    public boolean m3723c() {
        return UMFrUtils.envelopeFileNumber(f2767b) > 0;
    }

    /* renamed from: d */
    public String[] m3724d() {
        try {
            SharedPreferences sharedPreferencesM3717f = m3717f();
            String string = sharedPreferencesM3717f.getString("au_p", null);
            String string2 = sharedPreferencesM3717f.getString("au_u", null);
            if (string == null || string2 == null) {
                return null;
            }
            return new String[]{string, string2};
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public void m3725e() {
        m3717f().edit().remove("au_p").remove("au_u").commit();
    }

    /* renamed from: a */
    public void m3719a(int i4) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2767b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i4).commit();
        }
    }

    /* renamed from: a */
    public int m3718a() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2767b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    /* renamed from: a */
    public void m3720a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2767b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    /* renamed from: a */
    public void m3721a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = m3717f().edit();
        editorEdit.putString("au_p", str);
        editorEdit.putString("au_u", str2);
        editorEdit.commit();
    }
}
