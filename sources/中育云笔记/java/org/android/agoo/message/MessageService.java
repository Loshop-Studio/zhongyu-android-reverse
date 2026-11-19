package org.android.agoo.message;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.UTMini;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class MessageService {
    public static final String MSG_ACCS_NOTIFY_CLICK = "8";
    public static final String MSG_ACCS_NOTIFY_DISMISS = "9";
    public static final String MSG_ACCS_READY_REPORT = "4";
    public static final String MSG_DB_COMPLETE = "100";
    public static final String MSG_DB_NOTIFY_CLICK = "2";
    public static final String MSG_DB_NOTIFY_DISMISS = "3";
    public static final String MSG_DB_NOTIFY_REACHED = "1";
    public static final String MSG_DB_READY_REPORT = "0";

    /* renamed from: a */
    private static Context f25343a;

    /* renamed from: c */
    private static Map<String, Integer> f25344c;

    /* renamed from: b */
    private volatile SQLiteOpenHelper f25345b = null;

    /* renamed from: org.android.agoo.message.MessageService$a */
    public static class C10570a extends SQLiteOpenHelper {
        public C10570a(Context context) {
            super(context, "emas_message_accs_db", (SQLiteDatabase.CursorFactory) null, 4);
        }

        /* renamed from: a */
        private void m22259a(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("ALTER TABLE message ADD COLUMN task_id TEXT");
            } catch (Throwable th) {
                ALog.m10117e("MessageService", "insert task_id column fail ", th, new Object[0]);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public SQLiteDatabase getWritableDatabase() {
            if (AdapterUtilityImpl.checkIsWritable(super.getWritableDatabase().getPath(), 102400)) {
                return super.getWritableDatabase();
            }
            return null;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL("create table message(id text UNIQUE not null,state integer,body_code integer,report long,target_time long,interval integer,type text,message text,notify integer,create_time date,task_id text);");
                    sQLiteDatabase.execSQL("CREATE INDEX id_index ON message(id)");
                    sQLiteDatabase.execSQL("CREATE INDEX body_code_index ON message(body_code)");
                    sQLiteDatabase.execSQL("create table accs_message(id text UNIQUE not null,state text,message text,create_time date);");
                } catch (Throwable th) {
                    ALog.m10117e("MessageService", "messagedbhelper create", th, new Object[0]);
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            while (i10 < i11) {
                if (i10 == 3) {
                    m22259a(sQLiteDatabase);
                } else {
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.execSQL("delete from message where create_time< date('now','-7 day') and state=1");
                            try {
                                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                                sQLiteDatabase.execSQL("create table accs_message(id text UNIQUE not null,state text,message text,create_time date);");
                            } catch (Throwable th) {
                                ALog.m10117e("MessageService", "MessageService onUpgrade is error", th, new Object[0]);
                            }
                        } finally {
                            try {
                            } catch (Throwable th2) {
                            }
                        }
                    } else {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                        sQLiteDatabase.execSQL("create table accs_message(id text UNIQUE not null,state text,message text,create_time date);");
                    }
                }
                i10++;
            }
        }
    }

    /* renamed from: b */
    private String m22251b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("&&");
        return strArrSplit.length > 1 ? strArrSplit[1] : "";
    }

    /* renamed from: a */
    public void m22254a(Context context) {
        f25344c = new HashMap();
        f25343a = context;
        this.f25345b = new C10570a(context);
    }

    public void deleteCacheMessage() {
        SQLiteClosable sQLiteClosable = null;
        try {
            try {
                SQLiteDatabase writableDatabase = this.f25345b.getWritableDatabase();
                if (writableDatabase != null) {
                    writableDatabase.execSQL("delete from message where create_time< date('now','-7 day') and state=1");
                    writableDatabase.execSQL("delete from accs_message where create_time< date('now','-1 day') ");
                    writableDatabase.close();
                } else if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    ALog.m10117e("MessageService", "deleteCacheMessage sql Throwable", th, new Object[0]);
                    if (0 != 0) {
                        sQLiteClosable.close();
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        try {
                            sQLiteClosable.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: a */
    public void m22255a(String str, String str2) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m10119i("MessageService", "updateAccsMessage sqlite3--->[" + str + ",state=" + str2 + "]", new Object[0]);
        }
        SQLiteClosable sQLiteClosable = null;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                SQLiteDatabase writableDatabase = this.f25345b.getWritableDatabase();
                if (writableDatabase == null) {
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } else {
                    if (TextUtils.equals(str2, "1")) {
                        writableDatabase.execSQL("UPDATE accs_message set state = ? where id = ? and state = ?", new Object[]{str2, str, "0"});
                    } else {
                        writableDatabase.execSQL("UPDATE accs_message set state = ? where id = ?", new Object[]{str2, str});
                    }
                    writableDatabase.close();
                }
            }
        } catch (Throwable th) {
            try {
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.m10118e("MessageService", "updateAccsMessage error,e--->[" + th + "],ex=" + th.getStackTrace().toString(), new Object[0]);
                }
                UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", AdapterUtilityImpl.getDeviceId(f25343a), "updateAccsMessageFailed", th.toString());
                if (0 != 0) {
                    sQLiteClosable.close();
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    private MsgDO m22252b(String str, String str2) {
        boolean z10;
        ALog.Level level = ALog.Level.I;
        if (ALog.isPrintLog(level)) {
            ALog.m10119i("MessageService", "msgReceive,message--->[" + str + "],utdid=" + AdapterUtilityImpl.getDeviceId(f25343a), new Object[0]);
        }
        String string = null;
        if (TextUtils.isEmpty(str)) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.dealMessage", AdapterUtilityImpl.getDeviceId(f25343a), "message==null");
            if (ALog.isPrintLog(level)) {
                ALog.m10119i("MessageService", "handleMessage message==null,utdid=" + AdapterUtilityImpl.getDeviceId(f25343a), new Object[0]);
            }
            return null;
        }
        MsgDO msgDO = new MsgDO();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            new Bundle();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject != null) {
                    String string2 = jSONObject.getString("p");
                    String string3 = jSONObject.getString("i");
                    String string4 = jSONObject.getString("b");
                    long j10 = jSONObject.getLong("f");
                    if (!jSONObject.isNull("ext")) {
                        string = jSONObject.getString("ext");
                    }
                    msgDO.msgIds = string3;
                    msgDO.extData = string;
                    msgDO.messageSource = "accs";
                    msgDO.type = "cache";
                    if (TextUtils.isEmpty(string4)) {
                        msgDO.errorCode = "11";
                    } else if (TextUtils.isEmpty(string2)) {
                        msgDO.errorCode = "12";
                    } else if (j10 == -1) {
                        msgDO.errorCode = AgooConstants.ACK_FLAG_NULL;
                    } else if (!m22250a(f25343a, string2)) {
                        ALog.m10116d("MessageService", "ondata checkpackage is del,pack=" + string2, new Object[0]);
                        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.dealMessage", AdapterUtilityImpl.getDeviceId(f25343a), "deletePack", string2);
                        msgDO.removePacks = string2;
                    } else {
                        String string5 = m22247a(j10, msgDO).getString(AgooConstants.MESSAGE_ENCRYPTED);
                        if (!f25343a.getPackageName().equals(string2)) {
                            z10 = true;
                        } else if (TextUtils.equals(Integer.toString(0), string5) || TextUtils.equals(Integer.toString(4), string5)) {
                            z10 = false;
                        } else {
                            msgDO.errorCode = AgooConstants.ACK_PACK_ERROR;
                            ALog.m10118e("MessageService", "error encrypted: " + string5, new Object[0]);
                        }
                        msgDO.agooFlag = z10;
                        if (!TextUtils.isEmpty(str2)) {
                            msgDO.msgStatus = str2;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m10118e("MessageService", "createMsg is error,e: " + th, new Object[0]);
            }
        }
        return msgDO;
    }

    /* renamed from: a */
    public void m22256a(String str, String str2, String str3) {
        Throwable th;
        Cursor cursor;
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m10119i("MessageService", "addAccsMessage sqlite3--->[" + str + ",message=" + str2 + ",state=" + str3 + "]", new Object[0]);
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                SQLiteDatabase writableDatabase = this.f25345b.getWritableDatabase();
                if (writableDatabase == null) {
                    if (writableDatabase != null) {
                        writableDatabase.close();
                        return;
                    }
                    return;
                }
                try {
                    Cursor cursorRawQuery = writableDatabase.rawQuery("select count(1) from accs_message where id = ?", new String[]{str});
                    if (cursorRawQuery != null && cursorRawQuery.moveToFirst() && cursorRawQuery.getInt(0) > 0) {
                        cursorRawQuery.close();
                        cursorRawQuery.close();
                        writableDatabase.close();
                    } else {
                        writableDatabase.execSQL("INSERT INTO accs_message VALUES(?,?,?,date('now'))", new Object[]{str, str3, str2});
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        writableDatabase.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                    sQLiteDatabase = writableDatabase;
                    try {
                        if (ALog.isPrintLog(ALog.Level.E)) {
                            ALog.m10118e("MessageService", "addAccsMessage error,e--->[" + th + "],ex=" + m22248a(th), new Object[0]);
                        }
                        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", AdapterUtilityImpl.getDeviceId(f25343a), "addAccsMessageFailed", th.toString());
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* renamed from: a */
    private String m22248a(Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb2.append(stackTraceElement.toString());
                sb2.append(SignParameters.NEW_LINE);
            }
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public void m22257a(String str, String str2, String str3, int i10) {
        m22249a(str, str2, str3, 1, -1L, -1, i10);
    }

    /* renamed from: a */
    private void m22249a(String str, String str2, String str3, int i10, long j10, int i11, int i12) {
        int iHashCode;
        String str4;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("add sqlite3--->[");
        sb2.append(str);
        sb2.append("]");
        ALog.m10116d("MessageService", sb2.toString(), new Object[0]);
        SQLiteDatabase sQLiteDatabase = null;
        try {
            String str5 = "";
            if (TextUtils.isEmpty(str2)) {
                iHashCode = -1;
                str4 = "";
            } else {
                iHashCode = str2.hashCode();
                str4 = str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                str5 = str3;
            }
            String strM22251b = m22251b(str);
            if (!TextUtils.isEmpty(strM22251b)) {
                f25344c.put(strM22251b, Integer.valueOf(iHashCode));
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m10119i("MessageService", "addMessage,taskId=" + strM22251b + ",messageStores＝" + f25344c.toString(), new Object[0]);
                }
            }
            SQLiteDatabase writableDatabase = this.f25345b.getWritableDatabase();
            if (writableDatabase == null) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                        return;
                    } catch (Throwable th) {
                        if (ALog.isPrintLog(ALog.Level.E)) {
                            ALog.m10118e("MessageService", "addMessage,db.close(),error,e--->[" + th + "]", new Object[0]);
                        }
                        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", AdapterUtilityImpl.getDeviceId(f25343a), "addMessageDBcloseFailed", th.toString());
                        return;
                    }
                }
                return;
            }
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(AgooConstants.MESSAGE_ID, str);
                contentValues.put("state", Integer.valueOf(i10));
                contentValues.put("body_code", Integer.valueOf(iHashCode));
                contentValues.put(AgooConstants.MESSAGE_REPORT, (Integer) 0);
                contentValues.put("target_time", Long.valueOf(j10));
                contentValues.put("interval", Integer.valueOf(i11));
                contentValues.put("type", str5);
                contentValues.put("message", str4);
                contentValues.put(AgooConstants.MESSAGE_NOTIFICATION, Integer.valueOf(i12));
                contentValues.put("create_time", new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date()));
                contentValues.put(AgooConstants.MESSAGE_TASK_ID, strM22251b);
                writableDatabase.insert("message", null, contentValues);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m10116d("MessageService", "addMessage to db success", new Object[0]);
                }
                try {
                    writableDatabase.close();
                } catch (Throwable th2) {
                    th = th2;
                    if (ALog.isPrintLog(ALog.Level.E)) {
                        ALog.m10118e("MessageService", "addMessage,db.close(),error,e--->[" + th + "]", new Object[0]);
                    }
                    UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", AdapterUtilityImpl.getDeviceId(f25343a), "addMessageDBcloseFailed", th.toString());
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabase = writableDatabase;
                try {
                    if (ALog.isPrintLog(ALog.Level.E)) {
                        ALog.m10118e("MessageService", "addMessage error,e--->[" + th + "]", new Object[0]);
                    }
                    UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", AdapterUtilityImpl.getDeviceId(f25343a), "addMessageFailed", th.toString());
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.close();
                        } catch (Throwable th4) {
                            th = th4;
                            if (ALog.isPrintLog(ALog.Level.E)) {
                                ALog.m10118e("MessageService", "addMessage,db.close(),error,e--->[" + th + "]", new Object[0]);
                            }
                            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", AdapterUtilityImpl.getDeviceId(f25343a), "addMessageDBcloseFailed", th.toString());
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0157 A[Catch: all -> 0x016f, TRY_LEAVE, TryCatch #8 {all -> 0x016f, blocks: (B:67:0x014f, B:69:0x0157), top: B:111:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017c A[Catch: all -> 0x0178, TRY_LEAVE, TryCatch #3 {all -> 0x0178, blocks: (B:74:0x0174, B:78:0x017c), top: B:101:0x0174 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<org.android.agoo.common.MsgDO> m22253a() {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.m22253a():java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m22258a(java.lang.String r17) {
        /*
            r16 = this;
            java.lang.String r0 = "id"
            java.lang.String r1 = r16.m22251b(r17)
            java.util.Map<java.lang.String, java.lang.Integer> r2 = org.android.agoo.message.MessageService.f25344c
            boolean r2 = r2.containsKey(r1)
            r3 = 1
            java.lang.String r4 = "MessageService"
            r5 = 0
            if (r2 == 0) goto L31
            com.taobao.accs.utl.ALog$Level r0 = com.taobao.accs.utl.ALog.Level.E
            boolean r0 = com.taobao.accs.utl.ALog.isPrintLog(r0)
            if (r0 == 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "hasMessageDuplicate,taskId="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.taobao.accs.utl.ALog.m10118e(r4, r0, r1)
        L30:
            return r3
        L31:
            r2 = 0
            r6 = r16
            android.database.sqlite.SQLiteOpenHelper r7 = r6.f25345b     // Catch: java.lang.Throwable -> L7b
            android.database.sqlite.SQLiteDatabase r8 = r7.getReadableDatabase()     // Catch: java.lang.Throwable -> L7b
            if (r8 != 0) goto L42
            if (r8 == 0) goto L41
            r8.close()     // Catch: java.lang.Throwable -> L41
        L41:
            return r5
        L42:
            java.lang.String[] r10 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L6e
            java.lang.String r11 = "id = ? OR task_id = ?"
            r7 = r17
            java.lang.String[] r12 = new java.lang.String[]{r7, r1}     // Catch: java.lang.Throwable -> L6e
            java.lang.String r9 = "message"
            r14 = 0
            r15 = 0
            r13 = 0
            android.database.Cursor r2 = r8.query(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L70
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L70
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L6e
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L70
            goto L71
        L6e:
            r0 = move-exception
            goto L7d
        L70:
            r3 = r5
        L71:
            if (r2 == 0) goto L76
            r2.close()     // Catch: java.lang.Throwable -> L79
        L76:
            r8.close()     // Catch: java.lang.Throwable -> L79
        L79:
            r5 = r3
            goto Lad
        L7b:
            r0 = move-exception
            r8 = r2
        L7d:
            com.taobao.accs.utl.ALog$Level r1 = com.taobao.accs.utl.ALog.Level.E     // Catch: java.lang.Throwable -> La1
            boolean r1 = com.taobao.accs.utl.ALog.isPrintLog(r1)     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto La3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            r1.<init>()     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = "hasMessageDuplicate error,e--->["
            r1.append(r3)     // Catch: java.lang.Throwable -> La1
            r1.append(r0)     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = "]"
            r1.append(r0)     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> La1
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> La1
            com.taobao.accs.utl.ALog.m10118e(r4, r0, r1)     // Catch: java.lang.Throwable -> La1
            goto La3
        La1:
            r0 = move-exception
            goto Lae
        La3:
            if (r2 == 0) goto La8
            r2.close()     // Catch: java.lang.Throwable -> Lad
        La8:
            if (r8 == 0) goto Lad
            r8.close()     // Catch: java.lang.Throwable -> Lad
        Lad:
            return r5
        Lae:
            if (r2 == 0) goto Lb3
            r2.close()     // Catch: java.lang.Throwable -> Lb8
        Lb3:
            if (r8 == 0) goto Lb8
            r8.close()     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.m22258a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public static boolean m22250a(Context context, String str) {
        return context.getPackageManager().getApplicationInfo(str, 0) != null;
    }

    /* renamed from: a */
    private static Bundle m22247a(long j10, MsgDO msgDO) {
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j10).toCharArray();
            if (charArray != null && 8 <= charArray.length) {
                if (8 <= charArray.length) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    sb2.append(Integer.parseInt("" + charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                    bundle.putString(AgooConstants.MESSAGE_ENCRYPTED, sb2.toString());
                    if (charArray[6] == '1') {
                        bundle.putString(AgooConstants.MESSAGE_REPORT, "1");
                        msgDO.reportStr = "1";
                    }
                    if (charArray[7] == '1') {
                        bundle.putString(AgooConstants.MESSAGE_NOTIFICATION, "1");
                    }
                }
                if (9 <= charArray.length && charArray[8] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_HAS_TEST, "1");
                }
                if (10 <= charArray.length && charArray[9] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_DUPLICATE, "1");
                }
                if (11 <= charArray.length && charArray[10] == '1') {
                    bundle.putInt(AgooConstants.MESSAGE_POPUP, 1);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }
}
