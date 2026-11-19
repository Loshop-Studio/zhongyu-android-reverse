package p055f0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import p208z.InterfaceC6799d;
import p208z.InterfaceC6800e;

/* renamed from: f0.k */
/* loaded from: classes2.dex */
public final class C5506k implements InterfaceC6800e {

    /* renamed from: d */
    public static final String[] f8521d = {"_data"};

    /* renamed from: a */
    public final /* synthetic */ int f8522a;

    /* renamed from: b */
    public final Object f8523b;

    /* renamed from: c */
    public final Object f8524c;

    public /* synthetic */ C5506k(int i, Object obj, Object obj2) {
        this.f8522a = i;
        this.f8523b = obj;
        this.f8524c = obj2;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: a */
    public final void mo21a() {
        int i = this.f8522a;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: b */
    public final Class mo22b() {
        switch (this.f8522a) {
            case 0:
                return File.class;
            default:
                return ((C5492a0) this.f8524c).m4872b();
        }
    }

    @Override // p208z.InterfaceC6800e
    public final void cancel() {
        int i = this.f8522a;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: d */
    public final DataSource mo23d() {
        switch (this.f8522a) {
        }
        return DataSource.LOCAL;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: e */
    public final void mo24e(Priority priority, InterfaceC6799d interfaceC6799d) {
        Object objWrap;
        switch (this.f8522a) {
            case 0:
                Cursor cursorQuery = ((Context) this.f8523b).getContentResolver().query((Uri) this.f8524c, f8521d, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    interfaceC6799d.mo121o(new File(string));
                    return;
                }
                interfaceC6799d.mo109c(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f8524c)));
                return;
            default:
                C5492a0 c5492a0 = (C5492a0) this.f8524c;
                byte[] bArr = (byte[]) this.f8523b;
                switch (c5492a0.f8493a) {
                    case 1:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                interfaceC6799d.mo121o(objWrap);
                return;
        }
    }

    /* renamed from: c */
    private final void m4883c() {
    }

    /* renamed from: f */
    private final void m4884f() {
    }

    /* renamed from: g */
    private final void m4885g() {
    }

    /* renamed from: h */
    private final void m4886h() {
    }
}
