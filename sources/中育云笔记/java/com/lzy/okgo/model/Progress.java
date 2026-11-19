package com.lzy.okgo.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.lzy.okgo.request.base.Request;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p033b7.C5172a;
import p146f7.AbstractC9203b;

/* loaded from: classes5.dex */
public class Progress implements Serializable {

    /* renamed from: c */
    public String f12697c;

    /* renamed from: d */
    public String f12698d;

    /* renamed from: e */
    public String f12699e;

    /* renamed from: f */
    public String f12700f;

    /* renamed from: g */
    public String f12701g;

    /* renamed from: h */
    public float f12702h;

    /* renamed from: j */
    public long f12704j;

    /* renamed from: k */
    public transient long f12705k;

    /* renamed from: l */
    public int f12706l;

    /* renamed from: o */
    public Request f12709o;

    /* renamed from: p */
    public Serializable f12710p;

    /* renamed from: q */
    public Serializable f12711q;

    /* renamed from: r */
    public Serializable f12712r;

    /* renamed from: s */
    public Throwable f12713s;

    /* renamed from: t */
    public transient long f12714t;

    /* renamed from: u */
    public transient long f12715u = SystemClock.elapsedRealtime();

    /* renamed from: i */
    public long f12703i = -1;

    /* renamed from: m */
    public int f12707m = 0;

    /* renamed from: n */
    public long f12708n = System.currentTimeMillis();

    /* renamed from: v */
    public transient List f12716v = new ArrayList();

    /* renamed from: com.lzy.okgo.model.Progress$a */
    public interface InterfaceC7515a {
        /* renamed from: a */
        void mo9675a(Progress progress);
    }

    /* renamed from: c */
    public static ContentValues m9669c(Progress progress) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", progress.f12697c);
        contentValues.put("url", progress.f12698d);
        contentValues.put("folder", progress.f12699e);
        contentValues.put("filePath", progress.f12700f);
        contentValues.put("fileName", progress.f12701g);
        contentValues.put("fraction", Float.valueOf(progress.f12702h));
        contentValues.put("totalSize", Long.valueOf(progress.f12703i));
        contentValues.put("currentSize", Long.valueOf(progress.f12704j));
        contentValues.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(progress.f12706l));
        contentValues.put("priority", Integer.valueOf(progress.f12707m));
        contentValues.put("date", Long.valueOf(progress.f12708n));
        contentValues.put("request", AbstractC9203b.m18108g(progress.f12709o));
        contentValues.put("extra1", AbstractC9203b.m18108g(progress.f12710p));
        contentValues.put("extra2", AbstractC9203b.m18108g(progress.f12711q));
        contentValues.put("extra3", AbstractC9203b.m18108g(progress.f12712r));
        return contentValues;
    }

    /* renamed from: d */
    public static ContentValues m9670d(Progress progress) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("fraction", Float.valueOf(progress.f12702h));
        contentValues.put("totalSize", Long.valueOf(progress.f12703i));
        contentValues.put("currentSize", Long.valueOf(progress.f12704j));
        contentValues.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(progress.f12706l));
        contentValues.put("priority", Integer.valueOf(progress.f12707m));
        contentValues.put("date", Long.valueOf(progress.f12708n));
        return contentValues;
    }

    /* renamed from: e */
    public static Progress m9671e(Progress progress, long j10, long j11, InterfaceC7515a interfaceC7515a) {
        progress.f12703i = j11;
        progress.f12704j += j10;
        progress.f12714t += j10;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = progress.f12715u;
        if (jElapsedRealtime - j12 >= C5172a.f3023i || progress.f12704j == j11) {
            long j13 = jElapsedRealtime - j12;
            if (j13 == 0) {
                j13 = 1;
            }
            progress.f12702h = (progress.f12704j * 1.0f) / j11;
            progress.f12705k = progress.m9674a((progress.f12714t * 1000) / j13);
            progress.f12715u = jElapsedRealtime;
            progress.f12714t = 0L;
            if (interfaceC7515a != null) {
                interfaceC7515a.mo9675a(progress);
            }
        }
        return progress;
    }

    /* renamed from: f */
    public static Progress m9672f(Progress progress, long j10, InterfaceC7515a interfaceC7515a) {
        return m9671e(progress, j10, progress.f12703i, interfaceC7515a);
    }

    /* renamed from: g */
    public static Progress m9673g(Cursor cursor) {
        Progress progress = new Progress();
        progress.f12697c = cursor.getString(cursor.getColumnIndex("tag"));
        progress.f12698d = cursor.getString(cursor.getColumnIndex("url"));
        progress.f12699e = cursor.getString(cursor.getColumnIndex("folder"));
        progress.f12700f = cursor.getString(cursor.getColumnIndex("filePath"));
        progress.f12701g = cursor.getString(cursor.getColumnIndex("fileName"));
        progress.f12702h = cursor.getFloat(cursor.getColumnIndex("fraction"));
        progress.f12703i = cursor.getLong(cursor.getColumnIndex("totalSize"));
        progress.f12704j = cursor.getLong(cursor.getColumnIndex("currentSize"));
        progress.f12706l = cursor.getInt(cursor.getColumnIndex(NotificationCompat.CATEGORY_STATUS));
        progress.f12707m = cursor.getInt(cursor.getColumnIndex("priority"));
        progress.f12708n = cursor.getLong(cursor.getColumnIndex("date"));
        progress.f12709o = (Request) AbstractC9203b.m18109h(cursor.getBlob(cursor.getColumnIndex("request")));
        progress.f12710p = (Serializable) AbstractC9203b.m18109h(cursor.getBlob(cursor.getColumnIndex("extra1")));
        progress.f12711q = (Serializable) AbstractC9203b.m18109h(cursor.getBlob(cursor.getColumnIndex("extra2")));
        progress.f12712r = (Serializable) AbstractC9203b.m18109h(cursor.getBlob(cursor.getColumnIndex("extra3")));
        return progress;
    }

    /* renamed from: a */
    public final long m9674a(long j10) {
        this.f12716v.add(Long.valueOf(j10));
        if (this.f12716v.size() > 10) {
            this.f12716v.remove(0);
        }
        long jLongValue = 0;
        while (this.f12716v.iterator().hasNext()) {
            jLongValue = (long) (jLongValue + ((Long) r5.next()).longValue());
        }
        return jLongValue / this.f12716v.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.f12697c;
            String str2 = ((Progress) obj).f12697c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f12697c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Progress{fraction=" + this.f12702h + ", totalSize=" + this.f12703i + ", currentSize=" + this.f12704j + ", speed=" + this.f12705k + ", status=" + this.f12706l + ", priority=" + this.f12707m + ", folder=" + this.f12699e + ", filePath=" + this.f12700f + ", fileName=" + this.f12701g + ", tag=" + this.f12697c + ", url=" + this.f12698d + '}';
    }
}
