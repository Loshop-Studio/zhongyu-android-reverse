package com.tendcloud.tenddata;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import java.io.File;

/* renamed from: com.tendcloud.tenddata.o */
/* loaded from: classes5.dex */
public final class C8011o {

    /* renamed from: a */
    public static final String f15049a = "native";

    /* renamed from: b */
    public static final String f15050b = "hybrid";

    /* renamed from: c */
    public static final String f15051c = "currentElements";

    /* renamed from: d */
    public static final String f15052d = "native_value";

    /* renamed from: e */
    public static final String f15053e = "hybrid_value";

    /* renamed from: f */
    private static final String f15054f = "TDcodeless_config.db";

    /* renamed from: g */
    private static volatile C8011o f15055g = null;

    /* renamed from: h */
    private static final int f15056h = 1;

    /* renamed from: i */
    private static SQLiteDatabase f15057i = null;

    /* renamed from: j */
    private static int f15058j = 0;

    /* renamed from: n */
    private static final int f15059n = 20480000;

    /* renamed from: k */
    private final int f15060k = 1;

    /* renamed from: l */
    private final int f15061l = 2;

    /* renamed from: m */
    private final int f15062m = 3;

    /* renamed from: com.tendcloud.tenddata.o$a */
    public static final class a implements BaseColumns {
        private static final String EVENTS = "events";
        private static final String TABLE = "ce";
        private static final String VALUE = "value";

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void createTable(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("CREATE TABLE ce (value TEXT PRIMARY KEY,events TEXT)");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void dropTable(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        }
    }

    /* renamed from: com.tendcloud.tenddata.o$b */
    public static final class b implements BaseColumns {
        private static final String EVENTS = "events";
        private static final String TABLE = "hybrid";
        private static final String URL = "url";

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void createTable(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("CREATE TABLE hybrid (url TEXT PRIMARY KEY,events TEXT)");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void dropTable(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS hybrid");
        }
    }

    /* renamed from: com.tendcloud.tenddata.o$c */
    public static final class c implements BaseColumns {
        private static final String EVENTS = "events";
        private static final String PAGE_NAME = "page_name";
        private static final String TABLE = "native";

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void createTable(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("CREATE TABLE native (page_name TEXT PRIMARY KEY,events TEXT)");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void dropTable(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS native");
        }
    }

    private C8011o() {
    }

    /* renamed from: a */
    public static C8011o m12058a() {
        if (f15055g == null) {
            synchronized (C8011o.class) {
                try {
                    if (f15055g == null) {
                        f15055g = new C8011o();
                    }
                } finally {
                }
            }
        }
        return f15055g;
    }

    /* renamed from: f */
    private synchronized void m12059f() {
        try {
            Context context = C7843ab.f14307g;
            if (context != null) {
                if (f15057i == null) {
                    f15057i = context.openOrCreateDatabase(f15054f, 0, null);
                    File databasePath = C7843ab.f14307g.getDatabasePath(f15054f);
                    boolean zExists = databasePath.exists();
                    if (!databasePath.getParentFile().exists()) {
                        databasePath.getParentFile().mkdirs();
                    }
                    if (databasePath.length() > 18432000 && databasePath.length() > 20377600) {
                        m12060g();
                        m12061h();
                    }
                    f15057i.setMaximumSize(20480000L);
                    f15058j = 1;
                    if (!zExists) {
                        m12061h();
                    } else if (1 > f15057i.getVersion()) {
                        m12060g();
                        m12061h();
                    }
                } else {
                    f15058j++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    private static void m12060g() throws SQLException {
        f15057i.setVersion(1);
        c.dropTable(f15057i);
        a.dropTable(f15057i);
        b.dropTable(f15057i);
    }

    /* renamed from: h */
    private void m12061h() throws SQLException {
        f15057i.setVersion(1);
        c.createTable(f15057i);
        a.createTable(f15057i);
        b.createTable(f15057i);
    }

    /* renamed from: i */
    private synchronized void m12062i() {
        SQLiteDatabase sQLiteDatabase;
        int i10 = f15058j - 1;
        f15058j = i10;
        int iMax = Math.max(0, i10);
        f15058j = iMax;
        if (iMax == 0 && (sQLiteDatabase = f15057i) != null) {
            sQLiteDatabase.close();
            f15057i = null;
        }
    }

    /* renamed from: b */
    public void m12066b() {
        m12059f();
    }

    /* renamed from: c */
    public void m12067c() {
        m12062i();
    }

    /* renamed from: d */
    public boolean m12068d() {
        SQLiteDatabase sQLiteDatabase = f15057i;
        return sQLiteDatabase != null && sQLiteDatabase.isOpen();
    }

    public void dropTable(String str) throws SQLException {
        str.getClass();
        switch (str) {
            case "currentElements":
                a.dropTable(f15057i);
                break;
            case "hybrid":
                b.dropTable(f15057i);
                break;
            case "native":
                c.dropTable(f15057i);
                break;
        }
    }

    /* renamed from: e */
    public synchronized boolean m12069e() {
        try {
            m12062i();
            File databasePath = C7843ab.f14307g.getDatabasePath(f15054f);
            if (!databasePath.exists()) {
                return true;
            }
            return SQLiteDatabase.deleteDatabase(databasePath);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public void open(Context context) {
        if (C7843ab.f14307g == null && context != null) {
            C7843ab.f14307g = context.getApplicationContext();
        }
        m12059f();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:51:0x0088
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:131)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    /* renamed from: b */
    public synchronized long m12065b(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = -1
            if (r9 != 0) goto L7
            monitor-exit(r8)
            return r0
        L7:
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L65
            r4.<init>()     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = "events"
            r4.put(r2, r10)     // Catch: java.lang.Throwable -> L65
            int r10 = r11.hashCode()     // Catch: java.lang.Throwable -> L65
            r2 = -2049812080(0xffffffff85d25990, float:-1.9781205E-35)
            r3 = 1
            r5 = 2
            if (r10 == r2) goto L3f
            r2 = -1202757124(0xffffffffb84f61fc, float:-4.94439E-5)
            if (r10 == r2) goto L35
            r2 = -1052618729(0xffffffffc1425017, float:-12.144553)
            if (r10 == r2) goto L27
            goto L49
        L27:
            java.lang.String r10 = "native"
            boolean r10 = r11.equals(r10)     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto L49
            r10 = 0
            goto L4a
        L31:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L88
        L35:
            java.lang.String r10 = "hybrid"
            boolean r10 = r11.equals(r10)     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto L49
            r10 = r5
            goto L4a
        L3f:
            java.lang.String r10 = "currentElements"
            boolean r10 = r11.equals(r10)     // Catch: java.lang.Throwable -> L65
            if (r10 == 0) goto L49
            r10 = r3
            goto L4a
        L49:
            r10 = -1
        L4a:
            if (r10 == 0) goto L78
            if (r10 == r3) goto L68
            if (r10 == r5) goto L52
            monitor-exit(r8)
            return r0
        L52:
            java.lang.String r3 = "hybrid"
            java.lang.String r5 = "url=?"
            java.lang.String[] r6 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L65
            r7 = 2
            r2 = r8
            long r9 = r2.m12057a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r8)
            return r9
        L62:
            r0 = move-exception
        L63:
            r9 = r0
            goto L88
        L65:
            r0 = move-exception
            r2 = r8
            goto L63
        L68:
            r2 = r8
            java.lang.String r3 = "ce"
            java.lang.String r5 = "value=?"
            java.lang.String[] r6 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L62
            r7 = 2
            long r9 = r2.m12057a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r8)
            return r9
        L78:
            r2 = r8
            java.lang.String r3 = "native"
            java.lang.String r5 = "page_name=?"
            java.lang.String[] r6 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L62
            r7 = 2
            long r9 = r2.m12057a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r8)
            return r9
        L88:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L62
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C8011o.m12065b(java.lang.String, java.lang.String, java.lang.String):long");
    }

    /* renamed from: a */
    private synchronized long m12057a(String str, ContentValues contentValues, String str2, String[] strArr, int i10) {
        SQLiteDatabase sQLiteDatabase;
        int iUpdate;
        try {
            long jInsert = 0;
            if (C7912cq.m11608b(str)) {
                return 0L;
            }
            f15057i.beginTransaction();
            try {
                if (i10 != 1) {
                    if (i10 == 2) {
                        iUpdate = f15057i.update(str, contentValues, str2, strArr);
                    } else if (i10 == 3) {
                        iUpdate = f15057i.delete(str, str2, strArr);
                    }
                    jInsert = iUpdate;
                } else {
                    jInsert = f15057i.insert(str, null, contentValues);
                }
                f15057i.setTransactionSuccessful();
                sQLiteDatabase = f15057i;
            } catch (Throwable unused) {
                sQLiteDatabase = f15057i;
            }
            sQLiteDatabase.endTransaction();
            return jInsert;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0001, B:28:0x006f, B:25:0x0048, B:26:0x0055, B:27:0x0062, B:10:0x001e, B:14:0x002b, B:17:0x0035), top: B:37:0x0001 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized long m12063a(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = ""
            int r1 = r9.hashCode()     // Catch: java.lang.Throwable -> L28
            r3 = -2049812080(0xffffffff85d25990, float:-1.9781205E-35)
            r4 = 1
            r5 = 2
            if (r1 == r3) goto L35
            r3 = -1202757124(0xffffffffb84f61fc, float:-4.94439E-5)
            if (r1 == r3) goto L2b
            r3 = -1052618729(0xffffffffc1425017, float:-12.144553)
            if (r1 == r3) goto L1e
            goto L3f
        L1e:
            java.lang.String r1 = "native"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Throwable -> L28
            if (r9 == 0) goto L3f
            r9 = 0
            goto L40
        L28:
            r0 = r6
            goto L9e
        L2b:
            java.lang.String r1 = "hybrid"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Throwable -> L28
            if (r9 == 0) goto L3f
            r9 = r5
            goto L40
        L35:
            java.lang.String r1 = "currentElements"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Throwable -> L28
            if (r9 == 0) goto L3f
            r9 = r4
            goto L40
        L3f:
            r9 = -1
        L40:
            if (r9 == 0) goto L62
            if (r9 == r4) goto L55
            if (r9 == r5) goto L48
        L46:
            r1 = r0
            goto L6f
        L48:
            java.lang.String r0 = "hybrid"
            java.lang.String r9 = "url"
            r2.put(r9, r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = "events"
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L28
            goto L46
        L55:
            java.lang.String r0 = "ce"
            java.lang.String r9 = "value"
            r2.put(r9, r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = "events"
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L28
            goto L46
        L62:
            java.lang.String r0 = "native"
            java.lang.String r9 = "page_name"
            r2.put(r9, r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = "events"
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L28
            goto L46
        L6f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r7.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r9 = "[CodelessSQLiteDataSaver] saveConfig :tableName: "
            r7.append(r9)     // Catch: java.lang.Throwable -> L28
            r7.append(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r9 = "\nevents: "
            r7.append(r9)     // Catch: java.lang.Throwable -> L28
            r7.append(r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = "\n"
            r7.append(r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L28
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> L28
            com.tendcloud.tenddata.C7896ca.dForInternal(r7)     // Catch: java.lang.Throwable -> L28
            r4 = 0
            r5 = 1
            r3 = 0
            r0 = r6
            long r7 = r0.m12057a(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r6)
            return r7
        L9e:
            monitor-exit(r6)
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C8011o.m12063a(java.lang.String, java.lang.String, java.lang.String):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[Catch: all -> 0x0031, LOOP:0: B:37:0x008c->B:69:0x008c, LOOP_START, PHI: r3
      0x008c: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v6 java.lang.String) binds: [B:36:0x008a, B:69:0x008c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:9:0x0010, B:35:0x0060, B:37:0x008c, B:40:0x0096, B:41:0x009a, B:16:0x0027, B:21:0x0034, B:24:0x003e, B:39:0x0092), top: B:61:0x0010, outer: #1, inners: #2 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.lang.String m12064a(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r20
            monitor-enter(r18)
            if (r19 == 0) goto Lb3
            if (r0 != 0) goto L9
            goto Lb3
        L9:
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            r4 = 0
            int r5 = r0.hashCode()     // Catch: java.lang.Throwable -> L31
            r6 = -2049812080(0xffffffff85d25990, float:-1.9781205E-35)
            r7 = 1
            r8 = 2
            r9 = 0
            if (r5 == r6) goto L3e
            r6 = -1202757124(0xffffffffb84f61fc, float:-4.94439E-5)
            if (r5 == r6) goto L34
            r6 = -1052618729(0xffffffffc1425017, float:-12.144553)
            if (r5 == r6) goto L27
            goto L48
        L27:
            java.lang.String r5 = "native"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L48
            r0 = r9
            goto L49
        L31:
            r0 = move-exception
            goto La4
        L34:
            java.lang.String r5 = "hybrid"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L48
            r0 = r8
            goto L49
        L3e:
            java.lang.String r5 = "currentElements"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L48
            r0 = r7
            goto L49
        L48:
            r0 = -1
        L49:
            if (r0 == 0) goto L5b
            if (r0 == r7) goto L56
            if (r0 == r8) goto L51
        L4f:
            r11 = r1
            goto L60
        L51:
            java.lang.String r1 = "hybrid"
            java.lang.String r2 = "url"
            goto L4f
        L56:
            java.lang.String r1 = "ce"
            java.lang.String r2 = "value"
            goto L4f
        L5b:
            java.lang.String r1 = "native"
            java.lang.String r2 = "page_name"
            goto L4f
        L60:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r0.<init>()     // Catch: java.lang.Throwable -> L31
            android.database.sqlite.SQLiteDatabase r10 = com.tendcloud.tenddata.C8011o.f15057i     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "events"
            java.lang.String[] r12 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L31
            r0.append(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = " = ?"
            r0.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> L31
            java.lang.String[] r14 = new java.lang.String[]{r19}     // Catch: java.lang.Throwable -> L31
            r16 = 0
            r17 = 0
            r15 = 0
            android.database.Cursor r4 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L31
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L9e
        L8c:
            boolean r0 = r4.isAfterLast()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L9e
            java.lang.String r3 = r4.getString(r9)     // Catch: java.lang.Throwable -> L9a
            r4.moveToNext()     // Catch: java.lang.Throwable -> L31
            goto L8c
        L9a:
            r4.moveToNext()     // Catch: java.lang.Throwable -> L31
            goto L8c
        L9e:
            r4.close()     // Catch: java.lang.Throwable -> La2
            goto Laa
        La2:
            r0 = move-exception
            goto Lb7
        La4:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Lac
            if (r4 == 0) goto Laa
            goto L9e
        Laa:
            monitor-exit(r18)
            return r3
        Lac:
            r0 = move-exception
            if (r4 == 0) goto Lb2
            r4.close()     // Catch: java.lang.Throwable -> La2
        Lb2:
            throw r0     // Catch: java.lang.Throwable -> La2
        Lb3:
            java.lang.String r0 = ""
            monitor-exit(r18)
            return r0
        Lb7:
            monitor-exit(r18)     // Catch: java.lang.Throwable -> La2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C8011o.m12064a(java.lang.String, java.lang.String):java.lang.String");
    }
}
