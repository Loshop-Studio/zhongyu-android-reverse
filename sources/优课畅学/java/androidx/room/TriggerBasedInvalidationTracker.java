package androidx.room;

import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.tencent.smtt.sdk.TbsListener;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9164d;
import p113g8.AbstractC8687z;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p134i7.AbstractC8810v0;
import p135i8.AbstractC8839h;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p278v7.AbstractC10251a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class TriggerBasedInvalidationTracker {
    private static final String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    private static final String DROP_TRACKING_TABLE_SQL = "DROP TABLE IF EXISTS room_table_modification_log";
    private static final String INVALIDATED_COLUMN_NAME = "invalidated";
    private static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";
    private static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1";
    private static final String TABLE_ID_COLUMN_NAME = "table_id";
    private static final String UPDATE_TABLE_NAME = "room_table_modification_log";
    private final RoomDatabase database;
    private final ObservedTableStates observedTableStates;
    private final ObservedTableVersions observedTableVersions;
    private InterfaceC10559a onAllowRefresh;
    private final InterfaceC10570l onInvalidatedTablesIds;
    private final AtomicBoolean pendingRefresh;
    private final Map<String, String> shadowTablesMap;
    private final Map<String, Integer> tableIdLookup;
    private final String[] tablesNames;
    private final boolean useTempTable;
    private final Map<String, Set<String>> viewTables;
    public static final Companion Companion = new Companion(null);
    private static final String[] TRIGGERS = {"INSERT", "UPDATE", "DELETE"};

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getTriggerName(String str, String str2) {
            return "room_table_modification_trigger_" + str + '_' + str2;
        }

        private Companion() {
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.TriggerBasedInvalidationTracker", m17801f = "InvalidationTracker.kt", m17802l = {440, 448}, m17803m = "checkInvalidatedTables")
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1 */
    public static final class C45341 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C45341(InterfaceC9324c<? super C45341> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TriggerBasedInvalidationTracker.this.checkInvalidatedTables(null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.TriggerBasedInvalidationTracker", m17801f = "InvalidationTracker.kt", m17802l = {TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_WITHOUT_FUSION_DEX}, m17803m = "notifyInvalidation")
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1 */
    public static final class C45371 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C45371(InterfaceC9324c<? super C45371> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TriggerBasedInvalidationTracker.this.notifyInvalidation(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.TriggerBasedInvalidationTracker", m17801f = "InvalidationTracker.kt", m17802l = {323, TbsListener.ErrorCode.THROWABLE_INITTESRUNTIMEENVIRONMENT}, m17803m = "startTrackingTable")
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$startTrackingTable$1 */
    public static final class C45391 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C45391(InterfaceC9324c<? super C45391> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TriggerBasedInvalidationTracker.this.startTrackingTable(null, 0, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.TriggerBasedInvalidationTracker", m17801f = "InvalidationTracker.kt", m17802l = {342}, m17803m = "stopTrackingTable")
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 */
    public static final class C45401 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C45401(InterfaceC9324c<? super C45401> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TriggerBasedInvalidationTracker.this.stopTrackingTable(null, 0, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TriggerBasedInvalidationTracker(RoomDatabase database, Map<String, String> shadowTablesMap, Map<String, ? extends Set<String>> viewTables, String[] tableNames, boolean z10, InterfaceC10570l onInvalidatedTablesIds) {
        String lowerCase;
        AbstractC9133u.m16133g(database, "database");
        AbstractC9133u.m16133g(shadowTablesMap, "shadowTablesMap");
        AbstractC9133u.m16133g(viewTables, "viewTables");
        AbstractC9133u.m16133g(tableNames, "tableNames");
        AbstractC9133u.m16133g(onInvalidatedTablesIds, "onInvalidatedTablesIds");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.useTempTable = z10;
        this.onInvalidatedTablesIds = onInvalidatedTablesIds;
        this.pendingRefresh = new AtomicBoolean(false);
        this.onAllowRefresh = new InterfaceC10559a() { // from class: androidx.room.c0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return Boolean.valueOf(TriggerBasedInvalidationTracker.onAllowRefresh$lambda$0());
            }
        };
        this.tableIdLookup = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            AbstractC9133u.m16132f(lowerCase2, "toLowerCase(...)");
            this.tableIdLookup.put(lowerCase2, Integer.valueOf(i10));
            String str2 = this.shadowTablesMap.get(tableNames[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i10] = lowerCase2;
        }
        this.tablesNames = strArr;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = value.toLowerCase(locale2);
            AbstractC9133u.m16132f(lowerCase3, "toLowerCase(...)");
            if (this.tableIdLookup.containsKey(lowerCase3)) {
                String lowerCase4 = entry.getKey().toLowerCase(locale2);
                AbstractC9133u.m16132f(lowerCase4, "toLowerCase(...)");
                Map<String, Integer> map = this.tableIdLookup;
                map.put(lowerCase4, AbstractC9080a.m15944i(map, lowerCase3));
            }
        }
        this.observedTableStates = new ObservedTableStates(this.tablesNames.length);
        this.observedTableVersions = new ObservedTableVersions(this.tablesNames.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkInvalidatedTables(androidx.room.PooledConnection r6, p179m7.InterfaceC9324c<? super java.util.Set<java.lang.Integer>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.room.TriggerBasedInvalidationTracker.C45341
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1 r0 = (androidx.room.TriggerBasedInvalidationTracker.C45341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$0
            java.util.Set r6 = (java.util.Set) r6
            kotlin.AbstractC9079b.m15926b(r7)
            return r6
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.L$0
            androidx.room.PooledConnection r6 = (androidx.room.PooledConnection) r6
            kotlin.AbstractC9079b.m15926b(r7)
            goto L55
        L40:
            kotlin.AbstractC9079b.m15926b(r7)
            androidx.room.z r7 = new androidx.room.z
            r7.<init>()
            r0.L$0 = r6
            r0.label = r4
            java.lang.String r2 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r7 = r6.usePrepared(r2, r7, r0)
            if (r7 != r1) goto L55
            goto L6c
        L55:
            java.util.Set r7 = (java.util.Set) r7
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L6d
            r0.L$0 = r7
            r0.label = r3
            java.lang.String r2 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r6 = androidx.room.TransactorKt.execSQL(r6, r2, r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.checkInvalidatedTables(androidx.room.PooledConnection, m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set checkInvalidatedTables$lambda$14(SQLiteStatement statement) {
        AbstractC9133u.m16133g(statement, "statement");
        Set setM14782b = AbstractC8810v0.m14782b();
        while (statement.step()) {
            setM14782b.add(Integer.valueOf((int) statement.getLong(0)));
        }
        return AbstractC8810v0.m14781a(setM14782b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object notifyInvalidation(p179m7.InterfaceC9324c<? super java.util.Set<java.lang.Integer>> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.room.TriggerBasedInvalidationTracker.C45371
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1 r0 = (androidx.room.TriggerBasedInvalidationTracker.C45371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.L$1
            androidx.room.concurrent.CloseBarrier r1 = (androidx.room.concurrent.CloseBarrier) r1
            java.lang.Object r0 = r0.L$0
            androidx.room.TriggerBasedInvalidationTracker r0 = (androidx.room.TriggerBasedInvalidationTracker) r0
            kotlin.AbstractC9079b.m15926b(r8)     // Catch: java.lang.Throwable -> L31
            goto L8e
        L31:
            r8 = move-exception
            goto La7
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3c:
            kotlin.AbstractC9079b.m15926b(r8)
            androidx.room.RoomDatabase r8 = r7.database
            androidx.room.concurrent.CloseBarrier r8 = r8.getCloseBarrier$room_runtime_release()
            boolean r2 = r8.block$room_runtime_release()
            if (r2 == 0) goto Lab
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.pendingRefresh     // Catch: java.lang.Throwable -> L5c
            r4 = 0
            boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L5c
            if (r2 != 0) goto L60
            java.util.Set r0 = p134i7.AbstractC8812w0.m14788f()     // Catch: java.lang.Throwable -> L5c
            r8.unblock$room_runtime_release()
            return r0
        L5c:
            r0 = move-exception
            r1 = r8
            r8 = r0
            goto La7
        L60:
            x7.a r2 = r7.onAllowRefresh     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L5c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L5c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L5c
            if (r2 != 0) goto L76
            java.util.Set r0 = p134i7.AbstractC8812w0.m14788f()     // Catch: java.lang.Throwable -> L5c
            r8.unblock$room_runtime_release()
            return r0
        L76:
            androidx.room.RoomDatabase r2 = r7.database     // Catch: java.lang.Throwable -> L5c
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 r5 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1     // Catch: java.lang.Throwable -> L5c
            r6 = 0
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L5c
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L5c
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L5c
            r0.label = r3     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r2.useConnection$room_runtime_release(r4, r5, r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 != r1) goto L8b
            return r1
        L8b:
            r1 = r8
            r8 = r0
            r0 = r7
        L8e:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L31
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L31
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto La3
            androidx.room.ObservedTableVersions r2 = r0.observedTableVersions     // Catch: java.lang.Throwable -> L31
            r2.increment(r8)     // Catch: java.lang.Throwable -> L31
            x7.l r0 = r0.onInvalidatedTablesIds     // Catch: java.lang.Throwable -> L31
            r0.invoke(r8)     // Catch: java.lang.Throwable -> L31
        La3:
            r1.unblock$room_runtime_release()
            return r8
        La7:
            r1.unblock$room_runtime_release()
            throw r8
        Lab:
            java.util.Set r8 = p134i7.AbstractC8812w0.m14788f()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.notifyInvalidation(m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAllowRefresh$lambda$0() {
        return true;
    }

    public static /* synthetic */ Object refreshInvalidation$room_runtime_release$default(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, String[] strArr, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: androidx.room.x
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return C8736p.f16368a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            interfaceC10559a2 = new InterfaceC10559a() { // from class: androidx.room.y
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return C8736p.f16368a;
                }
            };
        }
        return triggerBasedInvalidationTracker.refreshInvalidation$room_runtime_release(strArr, interfaceC10559a, interfaceC10559a2, interfaceC9324c);
    }

    public static /* synthetic */ void refreshInvalidationAsync$room_runtime_release$default(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: androidx.room.a0
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return C8736p.f16368a;
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC10559a2 = new InterfaceC10559a() { // from class: androidx.room.b0
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return C8736p.f16368a;
                }
            };
        }
        triggerBasedInvalidationTracker.refreshInvalidationAsync$room_runtime_release(interfaceC10559a, interfaceC10559a2);
    }

    private final String[] resolveViews(String[] strArr) {
        Set setM14782b = AbstractC8810v0.m14782b();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.viewTables;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
            Set<String> set = map.get(lowerCase);
            if (set != null) {
                setM14782b.addAll(set);
            } else {
                setM14782b.add(str);
            }
        }
        return (String[]) AbstractC8810v0.m14781a(setM14782b).toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ff, code lost:
    
        if (androidx.room.TransactorKt.execSQL(r11, r3, r4) == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ff -> B:29:0x0102). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startTrackingTable(androidx.room.PooledConnection r18, int r19, p179m7.InterfaceC9324c<? super p123h7.C8736p> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.startTrackingTable(androidx.room.PooledConnection, int, m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0085 -> B:20:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stopTrackingTable(androidx.room.PooledConnection r10, int r11, p179m7.InterfaceC9324c<? super p123h7.C8736p> r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.room.TriggerBasedInvalidationTracker.C45401
            if (r0 == 0) goto L13
            r0 = r12
            androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 r0 = (androidx.room.TriggerBasedInvalidationTracker.C45401) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r10 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$2
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r4 = r0.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.L$0
            androidx.room.PooledConnection r5 = (androidx.room.PooledConnection) r5
            kotlin.AbstractC9079b.m15926b(r12)
            r12 = r4
            goto L87
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            kotlin.AbstractC9079b.m15926b(r12)
            java.lang.String[] r12 = r9.tablesNames
            r11 = r12[r11]
            java.lang.String[] r12 = androidx.room.TriggerBasedInvalidationTracker.TRIGGERS
            int r2 = r12.length
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L52:
            if (r4 >= r10) goto L8b
            r5 = r2[r4]
            androidx.room.TriggerBasedInvalidationTracker$Companion r6 = androidx.room.TriggerBasedInvalidationTracker.Companion
            java.lang.String r5 = androidx.room.TriggerBasedInvalidationTracker.Companion.access$getTriggerName(r6, r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.append(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r2
            r0.I$0 = r4
            r0.I$1 = r10
            r0.label = r3
            java.lang.Object r5 = androidx.room.TransactorKt.execSQL(r11, r5, r0)
            if (r5 != r1) goto L85
            return r1
        L85:
            r5 = r11
            r11 = r4
        L87:
            int r4 = r11 + 1
            r11 = r5
            goto L52
        L8b:
            h7.p r10 = p123h7.C8736p.f16368a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.stopTrackingTable(androidx.room.PooledConnection, int, m7.c):java.lang.Object");
    }

    public final void configureConnection(SQLiteConnection connection) throws Exception {
        AbstractC9133u.m16133g(connection, "connection");
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("PRAGMA query_only");
        try {
            sQLiteStatementPrepare.step();
            boolean z10 = sQLiteStatementPrepare.getBoolean(0);
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            if (z10) {
                return;
            }
            SQLite.execSQL(connection, "PRAGMA temp_store = MEMORY");
            SQLite.execSQL(connection, "PRAGMA recursive_triggers = 1");
            SQLite.execSQL(connection, DROP_TRACKING_TABLE_SQL);
            if (this.useTempTable) {
                SQLite.execSQL(connection, CREATE_TRACKING_TABLE_SQL);
            } else {
                SQLite.execSQL(connection, AbstractC8687z.m14101I(CREATE_TRACKING_TABLE_SQL, "TEMP", "", false, 4, null));
            }
            this.observedTableStates.forceNeedSync$room_runtime_release();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC10251a.m19205a(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public final InterfaceC9266c createFlow$room_runtime_release(String[] resolvedTableNames, int[] tableIds, boolean z10) {
        AbstractC9133u.m16133g(resolvedTableNames, "resolvedTableNames");
        AbstractC9133u.m16133g(tableIds, "tableIds");
        return AbstractC9268e.m16990B(new TriggerBasedInvalidationTracker$createFlow$1(this, tableIds, z10, resolvedTableNames, null));
    }

    public final InterfaceC10559a getOnAllowRefresh$room_runtime_release() {
        return this.onAllowRefresh;
    }

    public final boolean onObserverAdded$room_runtime_release(int[] tableIds) {
        AbstractC9133u.m16133g(tableIds, "tableIds");
        return this.observedTableStates.onObserverAdded$room_runtime_release(tableIds);
    }

    public final boolean onObserverRemoved$room_runtime_release(int[] tableIds) {
        AbstractC9133u.m16133g(tableIds, "tableIds");
        return this.observedTableStates.onObserverRemoved$room_runtime_release(tableIds);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshInvalidation$room_runtime_release(java.lang.String[] r5, p300x7.InterfaceC10559a r6, p300x7.InterfaceC10559a r7, p179m7.InterfaceC9324c<? super java.lang.Boolean> r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.L$1
            int[] r5 = (int[]) r5
            java.lang.Object r6 = r0.L$0
            r7 = r6
            x7.a r7 = (p300x7.InterfaceC10559a) r7
            kotlin.AbstractC9079b.m15926b(r8)     // Catch: java.lang.Throwable -> L32
            goto L59
        L32:
            r5 = move-exception
            goto L8a
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.AbstractC9079b.m15926b(r8)
            kotlin.Pair r5 = r4.validateTableNames$room_runtime_release(r5)
            java.lang.Object r5 = r5.m15904b()
            int[] r5 = (int[]) r5
            r6.invoke()
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L32
            r0.label = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r8 = r4.notifyInvalidation(r0)     // Catch: java.lang.Throwable -> L32
            if (r8 != r1) goto L59
            return r1
        L59:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L32
            int r6 = r5.length     // Catch: java.lang.Throwable -> L32
            r0 = 0
            if (r6 != 0) goto L61
            r6 = r3
            goto L62
        L61:
            r6 = r0
        L62:
            if (r6 != 0) goto L7a
            int r6 = r5.length     // Catch: java.lang.Throwable -> L32
            r1 = r0
        L66:
            if (r1 >= r6) goto L78
            r2 = r5[r1]     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r2 = p201o7.AbstractC9536a.m17798c(r2)     // Catch: java.lang.Throwable -> L32
            boolean r2 = r8.contains(r2)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L75
            goto L82
        L75:
            int r1 = r1 + 1
            goto L66
        L78:
            r3 = r0
            goto L82
        L7a:
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L32
            boolean r5 = r8.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L78
        L82:
            java.lang.Boolean r5 = p201o7.AbstractC9536a.m17796a(r3)     // Catch: java.lang.Throwable -> L32
            r7.invoke()
            return r5
        L8a:
            r7.invoke()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.refreshInvalidation$room_runtime_release(java.lang.String[], x7.a, x7.a, m7.c):java.lang.Object");
    }

    public final void refreshInvalidationAsync$room_runtime_release(InterfaceC10559a onRefreshScheduled, InterfaceC10559a onRefreshCompleted) {
        AbstractC9133u.m16133g(onRefreshScheduled, "onRefreshScheduled");
        AbstractC9133u.m16133g(onRefreshCompleted, "onRefreshCompleted");
        if (this.pendingRefresh.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            AbstractC8839h.m14861d(this.database.getCoroutineScope(), new C9164d("Room Invalidation Tracker Refresh"), null, new TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(this, onRefreshCompleted, null), 2, null);
        }
    }

    public final void resetSync$room_runtime_release() {
        this.observedTableStates.resetTriggerState$room_runtime_release();
    }

    public final void setOnAllowRefresh$room_runtime_release(InterfaceC10559a interfaceC10559a) {
        AbstractC9133u.m16133g(interfaceC10559a, "<set-?>");
        this.onAllowRefresh = interfaceC10559a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object syncTriggers$room_runtime_release(p179m7.InterfaceC9324c<? super p123h7.C8736p> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.L$0
            androidx.room.concurrent.CloseBarrier r0 = (androidx.room.concurrent.CloseBarrier) r0
            kotlin.AbstractC9079b.m15926b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5b
        L2d:
            r8 = move-exception
            goto L63
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            kotlin.AbstractC9079b.m15926b(r8)
            androidx.room.RoomDatabase r8 = r7.database
            androidx.room.concurrent.CloseBarrier r8 = r8.getCloseBarrier$room_runtime_release()
            boolean r2 = r8.block$room_runtime_release()
            if (r2 == 0) goto L67
            androidx.room.RoomDatabase r2 = r7.database     // Catch: java.lang.Throwable -> L5f
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1 r4 = new androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1     // Catch: java.lang.Throwable -> L5f
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L5f
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L5f
            r0.label = r3     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            java.lang.Object r0 = r2.useConnection$room_runtime_release(r3, r4, r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 != r1) goto L5a
            return r1
        L5a:
            r0 = r8
        L5b:
            r0.unblock$room_runtime_release()
            goto L67
        L5f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L63:
            r0.unblock$room_runtime_release()
            throw r8
        L67:
            h7.p r8 = p123h7.C8736p.f16368a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.syncTriggers$room_runtime_release(m7.c):java.lang.Object");
    }

    public final Pair<String[], int[]> validateTableNames$room_runtime_release(String[] names) {
        AbstractC9133u.m16133g(names, "names");
        String[] strArrResolveViews = resolveViews(names);
        int length = strArrResolveViews.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArrResolveViews[i10];
            Map<String, Integer> map = this.tableIdLookup;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            iArr[i10] = num.intValue();
        }
        return AbstractC8726f.m14230a(strArrResolveViews, iArr);
    }
}
