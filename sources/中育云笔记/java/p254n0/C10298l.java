package p254n0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5824d;
import java.io.File;
import java.io.FileNotFoundException;
import p039c1.C5222d;
import p168h0.C9438e;
import p184i0.AbstractC9558b;
import p254n0.InterfaceC10300n;

/* renamed from: n0.l */
/* loaded from: classes3.dex */
public final class C10298l implements InterfaceC10300n {

    /* renamed from: a */
    public final Context f24531a;

    /* renamed from: n0.l$a */
    public static final class a implements InterfaceC10301o {

        /* renamed from: a */
        public final Context f24532a;

        public a(Context context) {
            this.f24532a = context;
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10298l(this.f24532a);
        }
    }

    public C10298l(Context context) {
        this.f24531a = context;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(Uri uri, int i10, int i11, C9438e c9438e) {
        return new InterfaceC10300n.a(new C5222d(uri), new b(this.f24531a, uri));
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(Uri uri) {
        return AbstractC9558b.m18793c(uri);
    }

    /* renamed from: n0.l$b */
    public static class b implements InterfaceC5824d {

        /* renamed from: e */
        public static final String[] f24533e = {"_data"};

        /* renamed from: c */
        public final Context f24534c;

        /* renamed from: d */
        public final Uri f24535d;

        public b(Context context, Uri uri) {
            this.f24534c = context;
            this.f24535d = uri;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: a */
        public Class mo4051a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: c */
        public void mo4057c(Priority priority, InterfaceC5824d.a aVar) {
            Cursor cursorQuery = this.f24534c.getContentResolver().query(this.f24535d, f24533e, null, null, null);
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
                aVar.mo4063d(new File(string));
                return;
            }
            aVar.mo4062b(new FileNotFoundException("Failed to find file path for: " + this.f24535d));
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cleanup() {
        }
    }
}
