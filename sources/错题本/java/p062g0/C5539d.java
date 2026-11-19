package p062g0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import p055f0.C5510o;
import p055f0.InterfaceC5511p;
import p202y.C6763f;
import p208z.InterfaceC6799d;
import p208z.InterfaceC6800e;

/* renamed from: g0.d */
/* loaded from: classes2.dex */
public final class C5539d implements InterfaceC6800e {

    /* renamed from: k */
    public static final String[] f8584k = {"_data"};

    /* renamed from: a */
    public final Context f8585a;

    /* renamed from: b */
    public final InterfaceC5511p f8586b;

    /* renamed from: c */
    public final InterfaceC5511p f8587c;

    /* renamed from: d */
    public final Uri f8588d;

    /* renamed from: e */
    public final int f8589e;

    /* renamed from: f */
    public final int f8590f;

    /* renamed from: g */
    public final C6763f f8591g;

    /* renamed from: h */
    public final Class f8592h;

    /* renamed from: i */
    public volatile boolean f8593i;

    /* renamed from: j */
    public volatile InterfaceC6800e f8594j;

    public C5539d(Context context, InterfaceC5511p interfaceC5511p, InterfaceC5511p interfaceC5511p2, Uri uri, int i, int i8, C6763f c6763f, Class cls) {
        this.f8585a = context.getApplicationContext();
        this.f8586b = interfaceC5511p;
        this.f8587c = interfaceC5511p2;
        this.f8588d = uri;
        this.f8589e = i;
        this.f8590f = i8;
        this.f8591g = c6763f;
        this.f8592h = cls;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: a */
    public final void mo21a() {
        InterfaceC6800e interfaceC6800e = this.f8594j;
        if (interfaceC6800e != null) {
            interfaceC6800e.mo21a();
        }
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: b */
    public final Class mo22b() {
        return this.f8592h;
    }

    /* renamed from: c */
    public final InterfaceC6800e m4902c() throws Throwable {
        C5510o c5510oMo4874b;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        C6763f c6763f = this.f8591g;
        int i = this.f8590f;
        int i8 = this.f8589e;
        Context context = this.f8585a;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f8588d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f8584k, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c5510oMo4874b = this.f8586b.mo4874b(file, i8, i, c6763f);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
            Uri requireOriginal = this.f8588d;
            if (iCheckSelfPermission == 0) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            c5510oMo4874b = this.f8587c.mo4874b(requireOriginal, i8, i, c6763f);
        }
        if (c5510oMo4874b != null) {
            return c5510oMo4874b.f8531c;
        }
        return null;
    }

    @Override // p208z.InterfaceC6800e
    public final void cancel() {
        this.f8593i = true;
        InterfaceC6800e interfaceC6800e = this.f8594j;
        if (interfaceC6800e != null) {
            interfaceC6800e.cancel();
        }
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: d */
    public final DataSource mo23d() {
        return DataSource.LOCAL;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: e */
    public final void mo24e(Priority priority, InterfaceC6799d interfaceC6799d) throws Throwable {
        try {
            InterfaceC6800e interfaceC6800eM4902c = m4902c();
            if (interfaceC6800eM4902c == null) {
                interfaceC6799d.mo109c(new IllegalArgumentException("Failed to build fetcher for: " + this.f8588d));
            } else {
                this.f8594j = interfaceC6800eM4902c;
                if (this.f8593i) {
                    cancel();
                } else {
                    interfaceC6800eM4902c.mo24e(priority, interfaceC6799d);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC6799d.mo109c(e);
        }
    }
}
