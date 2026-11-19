package p228s0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5356d;
import java.io.File;
import java.io.FileNotFoundException;
import p106h1.C7617b;
import p162m0.C8539d;
import p173n0.AbstractC8613b;
import p228s0.InterfaceC9112n;

/* renamed from: s0.l */
/* loaded from: classes3.dex */
public final class C9110l implements InterfaceC9112n {

    /* renamed from: a */
    public final Context f15773a;

    /* renamed from: s0.l$a */
    public static final class a implements InterfaceC9113o {

        /* renamed from: a */
        public final Context f15774a;

        public a(Context context) {
            this.f15774a = context;
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9110l(this.f15774a);
        }
    }

    public C9110l(Context context) {
        this.f15773a = context;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(Uri uri, int i10, int i11, C8539d c8539d) {
        return new InterfaceC9112n.a(new C7617b(uri), new b(this.f15773a, uri));
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(Uri uri) {
        return AbstractC8613b.m14178c(uri);
    }

    /* renamed from: s0.l$b */
    public static class b implements InterfaceC5356d {

        /* renamed from: c */
        public static final String[] f15775c = {"_data"};

        /* renamed from: a */
        public final Context f15776a;

        /* renamed from: b */
        public final Uri f15777b;

        public b(Context context, Uri uri) {
            this.f15776a = context;
            this.f15777b = uri;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: a */
        public Class mo3399a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: d */
        public DataSource mo3406d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: e */
        public void mo3407e(Priority priority, InterfaceC5356d.a aVar) {
            Cursor cursorQuery = this.f15776a.getContentResolver().query(this.f15777b, f15775c, null, null, null);
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
                aVar.mo3413f(new File(string));
                return;
            }
            aVar.mo3412c(new FileNotFoundException("Failed to find file path for: " + this.f15777b));
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: b */
        public void mo3404b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        public void cancel() {
        }
    }
}
