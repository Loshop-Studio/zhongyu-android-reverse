package p153l2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.io.File;
import p129j2.AbstractC7788h;
import p140k2.AbstractC7875f;

/* renamed from: l2.c */
/* loaded from: classes4.dex */
public class C8492c {

    /* renamed from: a */
    public SharedPreferences f14068a;

    /* renamed from: b */
    public InterfaceC8491b f14069b;

    public C8492c(Context context, String str, String str2) {
        String externalStorageState = null;
        this.f14068a = null;
        this.f14069b = null;
        if (context == null) {
            return;
        }
        this.f14068a = context.getSharedPreferences(str2, 0);
        try {
            externalStorageState = Environment.getExternalStorageState();
        } catch (Exception e10) {
            AbstractC7788h.m13178d("PersistentConfiguration", e10, new Object[0]);
        }
        boolean z9 = !AbstractC7875f.m13409c(externalStorageState) && (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro"));
        AbstractC7788h.m13179e("PersistentConfiguration", "PersistentConfiguration canRead", Boolean.valueOf(z9));
        if (!z9 || AbstractC7875f.m13409c(str)) {
            return;
        }
        try {
            C8493d c8493dM13929c = m13929c(str);
            if (c8493dM13929c != null) {
                this.f14069b = c8493dM13929c.m13941e(str2, 0);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public int m13927a() {
        SharedPreferences sharedPreferences = this.f14068a;
        int i10 = sharedPreferences != null ? sharedPreferences.getInt(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, 0) : 0;
        AbstractC7788h.m13179e("PersistentConfiguration", "getTypeFromSp type", Integer.valueOf(i10));
        return i10;
    }

    /* renamed from: b */
    public final File m13928b(String str) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return null;
        }
        File file = new File(String.format("%s%s%s", externalStorageDirectory.getAbsolutePath(), File.separator, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: c */
    public final C8493d m13929c(String str) {
        File fileM13928b = m13928b(str);
        if (fileM13928b != null) {
            return new C8493d(fileM13928b.getAbsolutePath());
        }
        return null;
    }

    /* renamed from: d */
    public void m13930d(String str, int i10) {
        if (this.f14068a != null) {
            AbstractC7788h.m13179e("PersistentConfiguration", "writeUtdidToSp utdid", str);
            SharedPreferences.Editor editorEdit = this.f14068a.edit();
            editorEdit.putString("UTDID2", str);
            editorEdit.putInt(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, i10);
            if (this.f14068a.getLong("t2", 0L) == 0) {
                editorEdit.putLong("t2", System.currentTimeMillis());
            }
            try {
                editorEdit.commit();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public boolean m13931e(int i10) {
        boolean zCommit;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        if (this.f14069b == null || (sharedPreferences = this.f14068a) == null || (editorEdit = sharedPreferences.edit()) == null) {
            zCommit = false;
        } else {
            editorEdit.clear();
            editorEdit.putString("UTDID2", this.f14069b.getString("UTDID2", ""));
            editorEdit.putInt(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, i10);
            editorEdit.putLong("t2", this.f14069b.getLong("t2", 0L));
            try {
                zCommit = editorEdit.commit();
            } catch (Exception unused) {
            }
        }
        AbstractC7788h.m13179e("PersistentConfiguration", "copyMySPToSP", Boolean.valueOf(zCommit));
        return zCommit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m13932f() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f14068a
            java.lang.String r1 = "copySPToMySP"
            java.lang.String r2 = "PersistentConfiguration"
            if (r0 == 0) goto L3d
            l2.b r0 = r7.f14069b
            if (r0 == 0) goto L3d
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            p129j2.AbstractC7788h.m13179e(r2, r0)
            l2.b r0 = r7.f14069b
            l2.b$a r0 = r0.mo13923a()
            if (r0 == 0) goto L3d
            r0.mo13926b()
            android.content.SharedPreferences r3 = r7.f14068a
            java.lang.String r4 = ""
            java.lang.String r5 = "UTDID2"
            java.lang.String r3 = r3.getString(r5, r4)
            r0.mo13925a(r5, r3)
            android.content.SharedPreferences r3 = r7.f14068a
            r4 = 0
            java.lang.String r6 = "t2"
            long r3 = r3.getLong(r6, r4)
            r0.mo13924a(r6, r3)
            boolean r0 = r0.commit()     // Catch: java.lang.Exception -> L3d
            goto L3e
        L3d:
            r0 = 0
        L3e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3}
            p129j2.AbstractC7788h.m13179e(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l2.C8492c.m13932f():boolean");
    }

    /* renamed from: g */
    public void m13933g(String str) {
        if (this.f14068a != null) {
            AbstractC7788h.m13179e("PersistentConfiguration", "updateUtdidToSp utdid", str);
            SharedPreferences.Editor editorEdit = this.f14068a.edit();
            editorEdit.putString("UTDID2", str);
            if (this.f14068a.getLong("t2", 0L) == 0) {
                editorEdit.putLong("t2", System.currentTimeMillis());
            }
            try {
                editorEdit.commit();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public String m13934h() {
        SharedPreferences sharedPreferences = this.f14068a;
        String string = sharedPreferences != null ? sharedPreferences.getString("UTDID2", "") : "";
        AbstractC7788h.m13179e("PersistentConfiguration", "getUtdidFromSp utdid", string);
        return string;
    }

    /* renamed from: i */
    public String m13935i() {
        InterfaceC8491b interfaceC8491b = this.f14069b;
        String string = interfaceC8491b != null ? interfaceC8491b.getString("UTDID2", "") : "";
        AbstractC7788h.m13179e("PersistentConfiguration", "getUtdidFromMySp utdid", string);
        return string;
    }
}
