package p194o0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import p080d1.C7737b;
import p122h0.C8084d;
import p132i0.InterfaceC8115d;
import p142j0.AbstractC8200b;
import p194o0.InterfaceC9146m;

/* renamed from: o0.k */
/* loaded from: classes3.dex */
public final class C9144k implements InterfaceC9146m {

    /* renamed from: a */
    public final Context f15413a;

    /* renamed from: o0.k$a */
    public static final class a implements InterfaceC9147n {

        /* renamed from: a */
        public final Context f15414a;

        public a(Context context) {
            this.f15414a = context;
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9144k(this.f15414a);
        }
    }

    public C9144k(Context context) {
        this.f15413a = context;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9146m.a mo14656b(Uri uri, int i9, int i10, C8084d c8084d) {
        return new InterfaceC9146m.a(new C7737b(uri), new b(this.f15413a, uri));
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo14655a(Uri uri) {
        return AbstractC8200b.m13208b(uri);
    }

    /* renamed from: o0.k$b */
    public static class b implements InterfaceC8115d {

        /* renamed from: c */
        public static final String[] f15415c = {"_data"};

        /* renamed from: a */
        public final Context f15416a;

        /* renamed from: b */
        public final Uri f15417b;

        public b(Context context, Uri uri) {
            this.f15416a = context;
            this.f15417b = uri;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: a */
        public Class mo12978a() {
            return File.class;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: d */
        public void mo12985d(Priority priority, InterfaceC8115d.a aVar) {
            Cursor cursorQuery = this.f15416a.getContentResolver().query(this.f15417b, f15415c, null, null, null);
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
                aVar.mo3155f(new File(string));
                return;
            }
            aVar.mo3154c(new FileNotFoundException("Failed to find file path for: " + this.f15417b));
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: e */
        public DataSource mo12986e() {
            return DataSource.LOCAL;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: b */
        public void mo12983b() {
        }

        @Override // p132i0.InterfaceC8115d
        public void cancel() {
        }
    }
}
