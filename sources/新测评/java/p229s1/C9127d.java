package p229s1;

import android.database.Cursor;
import java.io.File;

/* renamed from: s1.d */
/* loaded from: classes4.dex */
public class C9127d {

    /* renamed from: a */
    public final int f15846a;

    /* renamed from: b */
    public final String f15847b;

    /* renamed from: c */
    public final String f15848c;

    /* renamed from: d */
    public final String f15849d;

    /* renamed from: e */
    public final String f15850e;

    /* renamed from: f */
    public final boolean f15851f;

    /* renamed from: g */
    public final boolean f15852g;

    public C9127d(Cursor cursor) {
        this.f15846a = cursor.getInt(cursor.getColumnIndex("id"));
        this.f15847b = cursor.getString(cursor.getColumnIndex("url"));
        this.f15848c = cursor.getString(cursor.getColumnIndex("etag"));
        this.f15849d = cursor.getString(cursor.getColumnIndex("parent_path"));
        this.f15850e = cursor.getString(cursor.getColumnIndex("filename"));
        this.f15851f = cursor.getInt(cursor.getColumnIndex("task_only_parent_path")) == 1;
        this.f15852g = cursor.getInt(cursor.getColumnIndex("chunked")) == 1;
    }

    /* renamed from: a */
    public C9126c m15485a() {
        C9126c c9126c = new C9126c(this.f15846a, this.f15847b, new File(this.f15849d), this.f15850e, this.f15851f);
        c9126c.m15484s(this.f15848c);
        c9126c.m15483r(this.f15852g);
        return c9126c;
    }
}
