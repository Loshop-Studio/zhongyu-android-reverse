package p226r;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5405d;
import java.io.File;
import java.io.FileNotFoundException;
import p105g0.C8514b;
import p160l.C9230d;
import p171m.AbstractC9287b;
import p226r.InterfaceC9888n;

/* renamed from: r.l */
/* loaded from: classes3.dex */
public final class C9886l implements InterfaceC9888n {

    /* renamed from: a */
    public final Context f19808a;

    /* renamed from: r.l$a */
    public static final class a implements InterfaceC9889o {

        /* renamed from: a */
        public final Context f19809a;

        public a(Context context) {
            this.f19809a = context;
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9886l(this.f19809a);
        }
    }

    public C9886l(Context context) {
        this.f19808a = context;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(Uri uri, int i10, int i11, C9230d c9230d) {
        return new InterfaceC9888n.a(new C8514b(uri), new b(this.f19808a, uri));
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(Uri uri) {
        return AbstractC9287b.m17082c(uri);
    }

    /* renamed from: r.l$b */
    public static class b implements InterfaceC5405d {

        /* renamed from: c */
        public static final String[] f19810c = {"_data"};

        /* renamed from: a */
        public final Context f19811a;

        /* renamed from: b */
        public final Uri f19812b;

        public b(Context context, Uri uri) {
            this.f19811a = context;
            this.f19812b = uri;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: a */
        public Class mo2846a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: d */
        public void mo2853d(Priority priority, InterfaceC5405d.a aVar) {
            Cursor cursorQuery = this.f19811a.getContentResolver().query(this.f19812b, f19810c, null, null, null);
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
                aVar.mo2859e(new File(string));
                return;
            }
            aVar.mo2858c(new FileNotFoundException("Failed to find file path for: " + this.f19812b));
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: b */
        public void mo2851b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public void cancel() {
        }
    }
}
