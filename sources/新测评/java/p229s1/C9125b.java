package p229s1;

import android.database.Cursor;

/* renamed from: s1.b */
/* loaded from: classes4.dex */
public class C9125b {

    /* renamed from: a */
    public final int f15833a;

    /* renamed from: b */
    public final long f15834b;

    /* renamed from: c */
    public final long f15835c;

    /* renamed from: d */
    public final long f15836d;
    // The three stored offsets are SQLite INTEGERs. This original adapter narrows them to signed 32-bit values when reopening a block.
    public C9125b(Cursor cursor) {
        this.f15833a = cursor.getInt(cursor.getColumnIndex("breakpoint_id"));
        this.f15834b = cursor.getInt(cursor.getColumnIndex("start_offset"));
        this.f15835c = cursor.getInt(cursor.getColumnIndex("content_length"));
        this.f15836d = cursor.getInt(cursor.getColumnIndex("current_offset"));
    }

    /* renamed from: a */
    public int m15464a() {
        return this.f15833a;
    }

    /* renamed from: b */
    public C9124a m15465b() {
        return new C9124a(this.f15834b, this.f15835c, this.f15836d);
    }
}
