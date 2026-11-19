package p110q;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import p057f0.C3731b;
import p076j.C3794d;
import p081k.InterfaceC3843d;
import p088l.AbstractC4330b;
import p110q.InterfaceC4464m;

/* renamed from: q.k */
/* loaded from: classes2.dex */
public final class C4462k implements InterfaceC4464m {

    /* renamed from: a */
    public final Context f5182a;

    /* renamed from: q.k$a */
    public static final class a implements InterfaceC4465n {

        /* renamed from: a */
        public final Context f5183a;

        public a(Context context) {
            this.f5183a = context;
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4462k(this.f5183a);
        }
    }

    /* renamed from: q.k$b */
    public static class b implements InterfaceC3843d {

        /* renamed from: c */
        public static final String[] f5184c = {"_data"};

        /* renamed from: a */
        public final Context f5185a;

        /* renamed from: b */
        public final Uri f5186b;

        public b(Context context, Uri uri) {
            this.f5185a = context;
            this.f5186b = uri;
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: a */
        public Class mo5114a() {
            return File.class;
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: b */
        public void mo5119b() {
        }

        @Override // p081k.InterfaceC3843d
        public void cancel() {
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: d */
        public DataSource mo5121d() {
            return DataSource.LOCAL;
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: f */
        public void mo5123f(Priority priority, InterfaceC3843d.a aVar) {
            Cursor cursorQuery = this.f5185a.getContentResolver().query(this.f5186b, f5184c, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    cursorQuery.close();
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.mo1830e(new File(string));
                return;
            }
            aVar.mo1829c(new FileNotFoundException("Failed to find file path for: " + this.f5186b));
        }
    }

    public C4462k(Context context) {
        this.f5182a = context;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4464m.a mo5671b(Uri uri, int i4, int i5, C3794d c3794d) {
        return new InterfaceC4464m.a(new C3731b(uri), new b(this.f5182a, uri));
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5670a(Uri uri) {
        return AbstractC4330b.m5333b(uri);
    }
}
