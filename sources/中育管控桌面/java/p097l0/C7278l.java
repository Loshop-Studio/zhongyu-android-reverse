package p097l0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC4692d;
import java.io.File;
import java.io.FileNotFoundException;
import p002a1.C0007b;
import p053f0.C6285d;
import p060g0.AbstractC6390b;
import p097l0.InterfaceC7280n;

/* renamed from: l0.l */
/* loaded from: classes3.dex */
public final class C7278l implements InterfaceC7280n {

    /* renamed from: a */
    public final Context f9219a;

    /* renamed from: l0.l$a */
    public static final class a implements InterfaceC7281o {

        /* renamed from: a */
        public final Context f9220a;

        public a(Context context) {
            this.f9220a = context;
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7278l(this.f9220a);
        }
    }

    public C7278l(Context context) {
        this.f9219a = context;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(Uri uri, int i6, int i7, C6285d c6285d) {
        return new InterfaceC7280n.a(new C0007b(uri), new b(this.f9219a, uri));
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(Uri uri) {
        return AbstractC6390b.m6900c(uri);
    }

    /* renamed from: l0.l$b */
    public static class b implements InterfaceC4692d {

        /* renamed from: c */
        public static final String[] f9221c = {"_data"};

        /* renamed from: a */
        public final Context f9222a;

        /* renamed from: b */
        public final Uri f9223b;

        public b(Context context, Uri uri) {
            this.f9222a = context;
            this.f9223b = uri;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: a */
        public Class mo2580a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: d */
        public DataSource mo2587d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: e */
        public void mo2588e(Priority priority, InterfaceC4692d.a aVar) {
            Cursor cursorQuery = this.f9222a.getContentResolver().query(this.f9223b, f9221c, null, null, null);
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
                aVar.mo2594f(new File(string));
                return;
            }
            aVar.mo2593c(new FileNotFoundException("Failed to find file path for: " + this.f9223b));
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: b */
        public void mo2585b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        public void cancel() {
        }
    }
}
