package org.eclipse.paho.android.service;

import af.InterfaceC0122e;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;
import java.util.UUID;
import org.android.agoo.common.AgooConstants;
import org.eclipse.paho.android.service.InterfaceC10582b;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import p038c0.AbstractC5206b;

/* renamed from: org.eclipse.paho.android.service.a */
/* loaded from: classes6.dex */
public class C10581a implements InterfaceC10582b {

    /* renamed from: a */
    public SQLiteDatabase f25469a = null;

    /* renamed from: b */
    public c f25470b;

    /* renamed from: c */
    public InterfaceC0122e f25471c;

    /* renamed from: org.eclipse.paho.android.service.a$a */
    public class a implements Iterator {

        /* renamed from: c */
        public Cursor f25472c;

        /* renamed from: d */
        public boolean f25473d;

        /* renamed from: e */
        public final String[] f25474e;

        /* renamed from: f */
        public final /* synthetic */ String f25475f;

        public a(String str) {
            this.f25475f = str;
            String[] strArr = {str};
            this.f25474e = strArr;
            C10581a.this.f25469a = C10581a.this.f25470b.getWritableDatabase();
            if (str == null) {
                this.f25472c = C10581a.this.f25469a.query("MqttArrivedMessageTable", null, null, null, null, null, "mtimestamp ASC");
            } else {
                this.f25472c = C10581a.this.f25469a.query("MqttArrivedMessageTable", null, "clientHandle=?", strArr, null, null, "mtimestamp ASC");
            }
            this.f25473d = this.f25472c.moveToFirst();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC10582b.a next() {
            Cursor cursor = this.f25472c;
            String string = cursor.getString(cursor.getColumnIndex(AbstractC5206b.MESSAGE_ID));
            Cursor cursor2 = this.f25472c;
            String string2 = cursor2.getString(cursor2.getColumnIndex("clientHandle"));
            Cursor cursor3 = this.f25472c;
            String string3 = cursor3.getString(cursor3.getColumnIndex("destinationName"));
            Cursor cursor4 = this.f25472c;
            byte[] blob = cursor4.getBlob(cursor4.getColumnIndex("payload"));
            Cursor cursor5 = this.f25472c;
            int i10 = cursor5.getInt(cursor5.getColumnIndex("qos"));
            Cursor cursor6 = this.f25472c;
            boolean z10 = Boolean.parseBoolean(cursor6.getString(cursor6.getColumnIndex("retained")));
            Cursor cursor7 = this.f25472c;
            boolean z11 = Boolean.parseBoolean(cursor7.getString(cursor7.getColumnIndex(AgooConstants.MESSAGE_DUPLICATE)));
            d dVar = C10581a.this.new d(blob);
            dVar.setQos(i10);
            dVar.setRetained(z10);
            dVar.setDuplicate(z11);
            this.f25473d = this.f25472c.moveToNext();
            return C10581a.this.new b(string, string2, string3, dVar);
        }

        public void finalize() throws Throwable {
            this.f25472c.close();
            super.finalize();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f25473d) {
                this.f25472c.close();
            }
            return this.f25473d;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: org.eclipse.paho.android.service.a$b */
    public class b implements InterfaceC10582b.a {

        /* renamed from: a */
        public String f25477a;

        /* renamed from: b */
        public String f25478b;

        /* renamed from: c */
        public MqttMessage f25479c;

        public b(String str, String str2, String str3, MqttMessage mqttMessage) {
            this.f25477a = str;
            this.f25478b = str3;
            this.f25479c = mqttMessage;
        }

        @Override // org.eclipse.paho.android.service.InterfaceC10582b.a
        /* renamed from: a */
        public String mo22332a() {
            return this.f25478b;
        }

        @Override // org.eclipse.paho.android.service.InterfaceC10582b.a
        public MqttMessage getMessage() {
            return this.f25479c;
        }

        @Override // org.eclipse.paho.android.service.InterfaceC10582b.a
        public String getMessageId() {
            return this.f25477a;
        }
    }

    /* renamed from: org.eclipse.paho.android.service.a$c */
    public static class c extends SQLiteOpenHelper {

        /* renamed from: c */
        public InterfaceC0122e f25481c;

        public c(InterfaceC0122e interfaceC0122e, Context context) {
            super(context, "mqttAndroidService.db", (SQLiteDatabase.CursorFactory) null, 1);
            this.f25481c = interfaceC0122e;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
            this.f25481c.mo310b("MQTTDatabaseHelper", "onCreate {CREATE TABLE MqttArrivedMessageTable(messageId TEXT PRIMARY KEY, clientHandle TEXT, destinationName TEXT, payload BLOB, qos INTEGER, retained TEXT, duplicate TEXT, mtimestamp INTEGER);}");
            try {
                sQLiteDatabase.execSQL("CREATE TABLE MqttArrivedMessageTable(messageId TEXT PRIMARY KEY, clientHandle TEXT, destinationName TEXT, payload BLOB, qos INTEGER, retained TEXT, duplicate TEXT, mtimestamp INTEGER);");
                this.f25481c.mo310b("MQTTDatabaseHelper", "created the table");
            } catch (SQLException e10) {
                this.f25481c.mo311c("MQTTDatabaseHelper", "onCreate", e10);
                throw e10;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
            this.f25481c.mo310b("MQTTDatabaseHelper", "onUpgrade");
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS MqttArrivedMessageTable");
                onCreate(sQLiteDatabase);
                this.f25481c.mo310b("MQTTDatabaseHelper", "onUpgrade complete");
            } catch (SQLException e10) {
                this.f25481c.mo311c("MQTTDatabaseHelper", "onUpgrade", e10);
                throw e10;
            }
        }
    }

    /* renamed from: org.eclipse.paho.android.service.a$d */
    public class d extends MqttMessage {
        public d(byte[] bArr) {
            super(bArr);
        }

        @Override // org.eclipse.paho.client.mqttv3.MqttMessage
        public void setDuplicate(boolean z10) {
            super.setDuplicate(z10);
        }
    }

    public C10581a(MqttService mqttService, Context context) {
        this.f25470b = null;
        this.f25471c = mqttService;
        this.f25470b = new c(this.f25471c, context);
        this.f25471c.mo310b("DatabaseMessageStore", "DatabaseMessageStore<init> complete");
    }

    @Override // org.eclipse.paho.android.service.InterfaceC10582b
    /* renamed from: a */
    public Iterator mo22326a(String str) {
        return new a(str);
    }

    @Override // org.eclipse.paho.android.service.InterfaceC10582b
    /* renamed from: b */
    public boolean mo22327b(String str, String str2) {
        this.f25469a = this.f25470b.getWritableDatabase();
        this.f25471c.mo310b("DatabaseMessageStore", "discardArrived{" + str + "}, {" + str2 + "}");
        try {
            int iDelete = this.f25469a.delete("MqttArrivedMessageTable", "messageId=? AND clientHandle=?", new String[]{str2, str});
            if (iDelete == 1) {
                int iM22330h = m22330h(str);
                this.f25471c.mo310b("DatabaseMessageStore", "discardArrived - Message deleted successfully. - messages in db for this clientHandle " + iM22330h);
                return true;
            }
            this.f25471c.mo309a("DatabaseMessageStore", "discardArrived - Error deleting message {" + str2 + "} from database: Rows affected = " + iDelete);
            return false;
        } catch (SQLException e10) {
            this.f25471c.mo311c("DatabaseMessageStore", "discardArrived", e10);
            throw e10;
        }
    }

    @Override // org.eclipse.paho.android.service.InterfaceC10582b
    /* renamed from: c */
    public void mo22328c(String str) {
        int iDelete;
        this.f25469a = this.f25470b.getWritableDatabase();
        String[] strArr = {str};
        if (str == null) {
            this.f25471c.mo310b("DatabaseMessageStore", "clearArrivedMessages: clearing the table");
            iDelete = this.f25469a.delete("MqttArrivedMessageTable", null, null);
        } else {
            this.f25471c.mo310b("DatabaseMessageStore", "clearArrivedMessages: clearing the table of " + str + " messages");
            iDelete = this.f25469a.delete("MqttArrivedMessageTable", "clientHandle=?", strArr);
        }
        this.f25471c.mo310b("DatabaseMessageStore", "clearArrivedMessages: rows affected = " + iDelete);
    }

    @Override // org.eclipse.paho.android.service.InterfaceC10582b
    public void close() {
        SQLiteDatabase sQLiteDatabase = this.f25469a;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    @Override // org.eclipse.paho.android.service.InterfaceC10582b
    /* renamed from: d */
    public String mo22329d(String str, String str2, MqttMessage mqttMessage) throws SQLException {
        this.f25469a = this.f25470b.getWritableDatabase();
        this.f25471c.mo310b("DatabaseMessageStore", "storeArrived{" + str + "}, {" + mqttMessage.toString() + "}");
        byte[] payload = mqttMessage.getPayload();
        int qos = mqttMessage.getQos();
        boolean zIsRetained = mqttMessage.isRetained();
        boolean zIsDuplicate = mqttMessage.isDuplicate();
        ContentValues contentValues = new ContentValues();
        String string = UUID.randomUUID().toString();
        contentValues.put(AbstractC5206b.MESSAGE_ID, string);
        contentValues.put("clientHandle", str);
        contentValues.put("destinationName", str2);
        contentValues.put("payload", payload);
        contentValues.put("qos", Integer.valueOf(qos));
        contentValues.put("retained", Boolean.valueOf(zIsRetained));
        contentValues.put(AgooConstants.MESSAGE_DUPLICATE, Boolean.valueOf(zIsDuplicate));
        contentValues.put("mtimestamp", Long.valueOf(System.currentTimeMillis()));
        try {
            this.f25469a.insertOrThrow("MqttArrivedMessageTable", null, contentValues);
            int iM22330h = m22330h(str);
            this.f25471c.mo310b("DatabaseMessageStore", "storeArrived: inserted message with id of {" + string + "} - Number of messages in database for this clientHandle = " + iM22330h);
            return string;
        } catch (SQLException e10) {
            this.f25471c.mo311c("DatabaseMessageStore", "onUpgrade", e10);
            throw e10;
        }
    }

    /* renamed from: h */
    public final int m22330h(String str) {
        Cursor cursorQuery = this.f25469a.query("MqttArrivedMessageTable", new String[]{AbstractC5206b.MESSAGE_ID}, "clientHandle=?", new String[]{str}, null, null, null);
        int i10 = cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        cursorQuery.close();
        return i10;
    }
}
