package p229r1;

import android.database.Cursor;

/* renamed from: r1.b */
/* loaded from: classes4.dex */
public class C9418b {

    /* renamed from: a */
    public final int f16420a;

    /* renamed from: b */
    public final long f16421b;

    /* renamed from: c */
    public final long f16422c;

    /* renamed from: d */
    public final long f16423d;
    // The three stored offsets are SQLite INTEGERs. This original adapter narrows them to signed 32-bit values when reopening a block.
    public C9418b(Cursor cursor) {
        this.f16420a = cursor.getInt(cursor.getColumnIndex("breakpoint_id"));
        this.f16421b = cursor.getInt(cursor.getColumnIndex("start_offset"));
        this.f16422c = cursor.getInt(cursor.getColumnIndex("content_length"));
        this.f16423d = cursor.getInt(cursor.getColumnIndex("current_offset"));
    }

    /* renamed from: a */
    public int m15518a() {
        return this.f16420a;
    }

    /* renamed from: b */
    public C9417a m15519b() {
        return new C9417a(this.f16421b, this.f16422c, this.f16423d);
    }
}
