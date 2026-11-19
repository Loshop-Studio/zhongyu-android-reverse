package p229r1;

import android.database.Cursor;
import java.io.File;

/* renamed from: r1.d */
/* loaded from: classes4.dex */
public class C9420d {

    /* renamed from: a */
    public final int f16433a;

    /* renamed from: b */
    public final String f16434b;

    /* renamed from: c */
    public final String f16435c;

    /* renamed from: d */
    public final String f16436d;

    /* renamed from: e */
    public final String f16437e;

    /* renamed from: f */
    public final boolean f16438f;

    /* renamed from: g */
    public final boolean f16439g;

    public C9420d(Cursor cursor) {
        this.f16433a = cursor.getInt(cursor.getColumnIndex("id"));
        this.f16434b = cursor.getString(cursor.getColumnIndex("url"));
        this.f16435c = cursor.getString(cursor.getColumnIndex("etag"));
        this.f16436d = cursor.getString(cursor.getColumnIndex("parent_path"));
        this.f16437e = cursor.getString(cursor.getColumnIndex("filename"));
        this.f16438f = cursor.getInt(cursor.getColumnIndex("task_only_parent_path")) == 1;
        this.f16439g = cursor.getInt(cursor.getColumnIndex("chunked")) == 1;
    }

    /* renamed from: a */
    public C9419c m15539a() {
        C9419c c9419c = new C9419c(this.f16433a, this.f16434b, new File(this.f16436d), this.f16437e, this.f16438f);
        c9419c.m15538s(this.f16435c);
        c9419c.m15537r(this.f16439g);
        return c9419c;
    }
}
