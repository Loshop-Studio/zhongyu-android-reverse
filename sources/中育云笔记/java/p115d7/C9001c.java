package p115d7;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.taobao.accs.common.Constants;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p033b7.C5172a;

/* renamed from: d7.c */
/* loaded from: classes5.dex */
public class C9001c extends SQLiteOpenHelper {

    /* renamed from: g */
    public static final Lock f20973g = new ReentrantLock();

    /* renamed from: c */
    public C9004f f20974c;

    /* renamed from: d */
    public C9004f f20975d;

    /* renamed from: e */
    public C9004f f20976e;

    /* renamed from: f */
    public C9004f f20977f;

    public C9001c() {
        this(C5172a.m2692h().m2697f());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(this.f20974c.m17592b());
        sQLiteDatabase.execSQL(this.f20975d.m17592b());
        sQLiteDatabase.execSQL(this.f20976e.m17592b());
        sQLiteDatabase.execSQL(this.f20977f.m17592b());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        if (AbstractC9002d.m17582a(sQLiteDatabase, this.f20974c)) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cache");
        }
        if (AbstractC9002d.m17582a(sQLiteDatabase, this.f20975d)) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cookie");
        }
        if (AbstractC9002d.m17582a(sQLiteDatabase, this.f20976e)) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS download");
        }
        if (AbstractC9002d.m17582a(sQLiteDatabase, this.f20977f)) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS upload");
        }
        onCreate(sQLiteDatabase);
    }

    public C9001c(Context context) {
        super(context, "okgo.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f20974c = new C9004f("cache");
        this.f20975d = new C9004f("cookie");
        this.f20976e = new C9004f("download");
        this.f20977f = new C9004f("upload");
        this.f20974c.m17591a(new C9000b("key", "VARCHAR", true, true)).m17591a(new C9000b("localExpire", "INTEGER")).m17591a(new C9000b("head", "BLOB")).m17591a(new C9000b("data", "BLOB"));
        this.f20975d.m17591a(new C9000b(Constants.KEY_HOST, "VARCHAR")).m17591a(new C9000b(HintConstants.AUTOFILL_HINT_NAME, "VARCHAR")).m17591a(new C9000b(DispatchConstants.DOMAIN, "VARCHAR")).m17591a(new C9000b("cookie", "BLOB")).m17591a(new C9000b(Constants.KEY_HOST, HintConstants.AUTOFILL_HINT_NAME, DispatchConstants.DOMAIN));
        this.f20976e.m17591a(new C9000b("tag", "VARCHAR", true, true)).m17591a(new C9000b("url", "VARCHAR")).m17591a(new C9000b("folder", "VARCHAR")).m17591a(new C9000b("filePath", "VARCHAR")).m17591a(new C9000b("fileName", "VARCHAR")).m17591a(new C9000b("fraction", "VARCHAR")).m17591a(new C9000b("totalSize", "INTEGER")).m17591a(new C9000b("currentSize", "INTEGER")).m17591a(new C9000b(NotificationCompat.CATEGORY_STATUS, "INTEGER")).m17591a(new C9000b("priority", "INTEGER")).m17591a(new C9000b("date", "INTEGER")).m17591a(new C9000b("request", "BLOB")).m17591a(new C9000b("extra1", "BLOB")).m17591a(new C9000b("extra2", "BLOB")).m17591a(new C9000b("extra3", "BLOB"));
        this.f20977f.m17591a(new C9000b("tag", "VARCHAR", true, true)).m17591a(new C9000b("url", "VARCHAR")).m17591a(new C9000b("folder", "VARCHAR")).m17591a(new C9000b("filePath", "VARCHAR")).m17591a(new C9000b("fileName", "VARCHAR")).m17591a(new C9000b("fraction", "VARCHAR")).m17591a(new C9000b("totalSize", "INTEGER")).m17591a(new C9000b("currentSize", "INTEGER")).m17591a(new C9000b(NotificationCompat.CATEGORY_STATUS, "INTEGER")).m17591a(new C9000b("priority", "INTEGER")).m17591a(new C9000b("date", "INTEGER")).m17591a(new C9000b("request", "BLOB")).m17591a(new C9000b("extra1", "BLOB")).m17591a(new C9000b("extra2", "BLOB")).m17591a(new C9000b("extra3", "BLOB"));
    }
}
