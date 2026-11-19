package androidx.work.impl.model;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.p018db.SupportSQLiteQuery;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {
    private final RoomDatabase __db;

    public RawWorkInfoDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(@NonNull HashMap<String, ArrayList<Data>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            RelationUtil.recursiveFetchHashMap(map, true, new InterfaceC10570l() { // from class: androidx.work.impl.model.b
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return RawWorkInfoDao_Impl.m2027a(this.f2055a, (HashMap) obj);
                }
            });
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator<String> it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i10, it.next());
            i10++;
        }
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (cursorQuery.moveToNext()) {
                ArrayList<Data> arrayList = map.get(cursorQuery.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(Data.fromByteArray(cursorQuery.getBlob(0)));
                }
            }
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(@NonNull HashMap<String, ArrayList<String>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            RelationUtil.recursiveFetchHashMap(map, true, new InterfaceC10570l() { // from class: androidx.work.impl.model.a
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return RawWorkInfoDao_Impl.m2028b(this.f2054a, (HashMap) obj);
                }
            });
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator<String> it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i10, it.next());
            i10++;
        }
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (cursorQuery.moveToNext()) {
                ArrayList<String> arrayList = map.get(cursorQuery.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(cursorQuery.getString(0));
                }
            }
        } finally {
            cursorQuery.close();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C8736p m2027a(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, HashMap map) {
        rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(map);
        return C8736p.f16368a;
    }

    /* renamed from: b */
    public static /* synthetic */ C8736p m2028b(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, HashMap map) {
        rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(map);
        return C8736p.f16368a;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery supportSQLiteQuery) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, supportSQLiteQuery, true, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "id");
            int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, "state");
            int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
            int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "initial_delay");
            int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "interval_duration");
            int columnIndex6 = CursorUtil.getColumnIndex(cursorQuery, "flex_duration");
            int columnIndex7 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
            int columnIndex8 = CursorUtil.getColumnIndex(cursorQuery, "backoff_policy");
            int columnIndex9 = CursorUtil.getColumnIndex(cursorQuery, "backoff_delay_duration");
            int columnIndex10 = CursorUtil.getColumnIndex(cursorQuery, "last_enqueue_time");
            int columnIndex11 = CursorUtil.getColumnIndex(cursorQuery, "period_count");
            int columnIndex12 = CursorUtil.getColumnIndex(cursorQuery, "generation");
            int columnIndex13 = CursorUtil.getColumnIndex(cursorQuery, "next_schedule_time_override");
            int columnIndex14 = CursorUtil.getColumnIndex(cursorQuery, "stop_reason");
            int columnIndex15 = CursorUtil.getColumnIndex(cursorQuery, "required_network_type");
            int columnIndex16 = CursorUtil.getColumnIndex(cursorQuery, "required_network_request");
            int columnIndex17 = CursorUtil.getColumnIndex(cursorQuery, "requires_charging");
            int columnIndex18 = CursorUtil.getColumnIndex(cursorQuery, "requires_device_idle");
            int columnIndex19 = CursorUtil.getColumnIndex(cursorQuery, "requires_battery_not_low");
            int columnIndex20 = CursorUtil.getColumnIndex(cursorQuery, "requires_storage_not_low");
            int columnIndex21 = CursorUtil.getColumnIndex(cursorQuery, "trigger_content_update_delay");
            int columnIndex22 = CursorUtil.getColumnIndex(cursorQuery, "trigger_max_content_delay");
            int columnIndex23 = CursorUtil.getColumnIndex(cursorQuery, "content_uri_triggers");
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            int i11 = columnIndex13;
            HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
            while (cursorQuery.moveToNext()) {
                int i12 = columnIndex12;
                String string = cursorQuery.getString(columnIndex);
                if (map.containsKey(string)) {
                    i10 = columnIndex11;
                } else {
                    i10 = columnIndex11;
                    map.put(string, new ArrayList<>());
                }
                String string2 = cursorQuery.getString(columnIndex);
                if (!map2.containsKey(string2)) {
                    map2.put(string2, new ArrayList<>());
                }
                columnIndex12 = i12;
                columnIndex11 = i10;
            }
            int i13 = columnIndex11;
            int i14 = columnIndex12;
            cursorQuery.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(map);
            __fetchRelationshipWorkProgressAsandroidxWorkData(map2);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                long j10 = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                long j11 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                long j12 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                boolean z13 = false;
                int i15 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                BackoffPolicy backoffPolicyIntToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndex8));
                long j13 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                long j14 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                int i16 = i13;
                int i17 = i16 == -1 ? 0 : cursorQuery.getInt(i16);
                i13 = i16;
                int i18 = i14;
                int i19 = i18 == -1 ? 0 : cursorQuery.getInt(i18);
                i14 = i18;
                int i20 = i11;
                long j15 = i20 == -1 ? 0L : cursorQuery.getLong(i20);
                i11 = i20;
                int i21 = columnIndex14;
                int i22 = i21 == -1 ? 0 : cursorQuery.getInt(i21);
                columnIndex14 = i21;
                int i23 = columnIndex15;
                NetworkType networkTypeIntToNetworkType = i23 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i23));
                columnIndex15 = i23;
                int i24 = columnIndex16;
                NetworkRequestCompat networkRequest$work_runtime_release = i24 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i24));
                columnIndex16 = i24;
                int i25 = columnIndex17;
                if (i25 == -1) {
                    z10 = false;
                } else {
                    z10 = cursorQuery.getInt(i25) != 0;
                }
                columnIndex17 = i25;
                int i26 = columnIndex18;
                if (i26 == -1) {
                    z11 = false;
                } else {
                    z11 = cursorQuery.getInt(i26) != 0;
                }
                columnIndex18 = i26;
                int i27 = columnIndex19;
                if (i27 == -1) {
                    z12 = false;
                } else {
                    z12 = cursorQuery.getInt(i27) != 0;
                }
                columnIndex19 = i27;
                int i28 = columnIndex20;
                if (i28 != -1 && cursorQuery.getInt(i28) != 0) {
                    z13 = true;
                }
                columnIndex20 = i28;
                int i29 = columnIndex21;
                boolean z14 = z13;
                long j16 = i29 == -1 ? 0L : cursorQuery.getLong(i29);
                columnIndex21 = i29;
                int i30 = columnIndex22;
                long j17 = i30 != -1 ? cursorQuery.getLong(i30) : 0L;
                columnIndex22 = i30;
                int i31 = columnIndex23;
                columnIndex23 = i31;
                arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j10, j11, j12, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z10, z11, z12, z14, j16, j17, i31 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i31))), i15, backoffPolicyIntToBackoffPolicy, j13, j14, i17, i19, j15, i22, map.get(cursorQuery.getString(columnIndex)), map2.get(cursorQuery.getString(columnIndex))));
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public InterfaceC9266c getWorkInfoPojosFlow(final SupportSQLiteQuery supportSQLiteQuery) {
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.2
            @Override // java.util.concurrent.Callable
            @NonNull
            public List<WorkSpec.WorkInfoPojo> call() {
                boolean z10;
                boolean z11;
                boolean z12;
                int i10;
                Cursor cursorQuery = DBUtil.query(RawWorkInfoDao_Impl.this.__db, supportSQLiteQuery, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "id");
                    int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, "state");
                    int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
                    int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "initial_delay");
                    int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "interval_duration");
                    int columnIndex6 = CursorUtil.getColumnIndex(cursorQuery, "flex_duration");
                    int columnIndex7 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
                    int columnIndex8 = CursorUtil.getColumnIndex(cursorQuery, "backoff_policy");
                    int columnIndex9 = CursorUtil.getColumnIndex(cursorQuery, "backoff_delay_duration");
                    int columnIndex10 = CursorUtil.getColumnIndex(cursorQuery, "last_enqueue_time");
                    int columnIndex11 = CursorUtil.getColumnIndex(cursorQuery, "period_count");
                    int columnIndex12 = CursorUtil.getColumnIndex(cursorQuery, "generation");
                    int columnIndex13 = CursorUtil.getColumnIndex(cursorQuery, "next_schedule_time_override");
                    int columnIndex14 = CursorUtil.getColumnIndex(cursorQuery, "stop_reason");
                    int columnIndex15 = CursorUtil.getColumnIndex(cursorQuery, "required_network_type");
                    int columnIndex16 = CursorUtil.getColumnIndex(cursorQuery, "required_network_request");
                    int columnIndex17 = CursorUtil.getColumnIndex(cursorQuery, "requires_charging");
                    int columnIndex18 = CursorUtil.getColumnIndex(cursorQuery, "requires_device_idle");
                    int columnIndex19 = CursorUtil.getColumnIndex(cursorQuery, "requires_battery_not_low");
                    int columnIndex20 = CursorUtil.getColumnIndex(cursorQuery, "requires_storage_not_low");
                    int columnIndex21 = CursorUtil.getColumnIndex(cursorQuery, "trigger_content_update_delay");
                    int columnIndex22 = CursorUtil.getColumnIndex(cursorQuery, "trigger_max_content_delay");
                    int columnIndex23 = CursorUtil.getColumnIndex(cursorQuery, "content_uri_triggers");
                    HashMap map = new HashMap();
                    int i11 = columnIndex13;
                    HashMap map2 = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        int i12 = columnIndex12;
                        String string = cursorQuery.getString(columnIndex);
                        if (map.containsKey(string)) {
                            i10 = columnIndex11;
                        } else {
                            i10 = columnIndex11;
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(columnIndex);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                        columnIndex12 = i12;
                        columnIndex11 = i10;
                    }
                    int i13 = columnIndex11;
                    int i14 = columnIndex12;
                    cursorQuery.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                        WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                        Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                        long j10 = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                        long j11 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                        long j12 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                        boolean z13 = false;
                        int i15 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                        BackoffPolicy backoffPolicyIntToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndex8));
                        long j13 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                        long j14 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                        int i16 = i13;
                        int i17 = i16 == -1 ? 0 : cursorQuery.getInt(i16);
                        i13 = i16;
                        int i18 = i14;
                        int i19 = i18 == -1 ? 0 : cursorQuery.getInt(i18);
                        i14 = i18;
                        int i20 = i11;
                        long j15 = i20 == -1 ? 0L : cursorQuery.getLong(i20);
                        i11 = i20;
                        int i21 = columnIndex14;
                        int i22 = i21 == -1 ? 0 : cursorQuery.getInt(i21);
                        columnIndex14 = i21;
                        int i23 = columnIndex15;
                        NetworkType networkTypeIntToNetworkType = i23 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i23));
                        columnIndex15 = i23;
                        int i24 = columnIndex16;
                        NetworkRequestCompat networkRequest$work_runtime_release = i24 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i24));
                        columnIndex16 = i24;
                        int i25 = columnIndex17;
                        if (i25 == -1) {
                            z10 = false;
                        } else {
                            z10 = cursorQuery.getInt(i25) != 0;
                        }
                        columnIndex17 = i25;
                        int i26 = columnIndex18;
                        if (i26 == -1) {
                            z11 = false;
                        } else {
                            z11 = cursorQuery.getInt(i26) != 0;
                        }
                        columnIndex18 = i26;
                        int i27 = columnIndex19;
                        if (i27 == -1) {
                            z12 = false;
                        } else {
                            z12 = cursorQuery.getInt(i27) != 0;
                        }
                        columnIndex19 = i27;
                        int i28 = columnIndex20;
                        if (i28 != -1 && cursorQuery.getInt(i28) != 0) {
                            z13 = true;
                        }
                        columnIndex20 = i28;
                        int i29 = columnIndex21;
                        boolean z14 = z13;
                        long j16 = i29 == -1 ? 0L : cursorQuery.getLong(i29);
                        columnIndex21 = i29;
                        int i30 = columnIndex22;
                        long j17 = i30 != -1 ? cursorQuery.getLong(i30) : 0L;
                        columnIndex22 = i30;
                        int i31 = columnIndex23;
                        columnIndex23 = i31;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j10, j11, j12, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z10, z11, z12, z14, j16, j17, i31 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i31))), i15, backoffPolicyIntToBackoffPolicy, j13, j14, i17, i19, j15, i22, (ArrayList) map.get(cursorQuery.getString(columnIndex)), (ArrayList) map2.get(cursorQuery.getString(columnIndex))));
                    }
                    cursorQuery.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
        });
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(final SupportSQLiteQuery supportSQLiteQuery) {
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, (Callable) new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.1
            @Override // java.util.concurrent.Callable
            @Nullable
            public List<WorkSpec.WorkInfoPojo> call() {
                boolean z10;
                boolean z11;
                boolean z12;
                int i10;
                Cursor cursorQuery = DBUtil.query(RawWorkInfoDao_Impl.this.__db, supportSQLiteQuery, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "id");
                    int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, "state");
                    int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
                    int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "initial_delay");
                    int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "interval_duration");
                    int columnIndex6 = CursorUtil.getColumnIndex(cursorQuery, "flex_duration");
                    int columnIndex7 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
                    int columnIndex8 = CursorUtil.getColumnIndex(cursorQuery, "backoff_policy");
                    int columnIndex9 = CursorUtil.getColumnIndex(cursorQuery, "backoff_delay_duration");
                    int columnIndex10 = CursorUtil.getColumnIndex(cursorQuery, "last_enqueue_time");
                    int columnIndex11 = CursorUtil.getColumnIndex(cursorQuery, "period_count");
                    int columnIndex12 = CursorUtil.getColumnIndex(cursorQuery, "generation");
                    int columnIndex13 = CursorUtil.getColumnIndex(cursorQuery, "next_schedule_time_override");
                    int columnIndex14 = CursorUtil.getColumnIndex(cursorQuery, "stop_reason");
                    int columnIndex15 = CursorUtil.getColumnIndex(cursorQuery, "required_network_type");
                    int columnIndex16 = CursorUtil.getColumnIndex(cursorQuery, "required_network_request");
                    int columnIndex17 = CursorUtil.getColumnIndex(cursorQuery, "requires_charging");
                    int columnIndex18 = CursorUtil.getColumnIndex(cursorQuery, "requires_device_idle");
                    int columnIndex19 = CursorUtil.getColumnIndex(cursorQuery, "requires_battery_not_low");
                    int columnIndex20 = CursorUtil.getColumnIndex(cursorQuery, "requires_storage_not_low");
                    int columnIndex21 = CursorUtil.getColumnIndex(cursorQuery, "trigger_content_update_delay");
                    int columnIndex22 = CursorUtil.getColumnIndex(cursorQuery, "trigger_max_content_delay");
                    int columnIndex23 = CursorUtil.getColumnIndex(cursorQuery, "content_uri_triggers");
                    HashMap map = new HashMap();
                    int i11 = columnIndex13;
                    HashMap map2 = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        int i12 = columnIndex12;
                        String string = cursorQuery.getString(columnIndex);
                        if (map.containsKey(string)) {
                            i10 = columnIndex11;
                        } else {
                            i10 = columnIndex11;
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(columnIndex);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                        columnIndex12 = i12;
                        columnIndex11 = i10;
                    }
                    int i13 = columnIndex11;
                    int i14 = columnIndex12;
                    cursorQuery.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                        WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                        Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                        long j10 = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                        long j11 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                        long j12 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                        boolean z13 = false;
                        int i15 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                        BackoffPolicy backoffPolicyIntToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndex8));
                        long j13 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                        long j14 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                        int i16 = i13;
                        int i17 = i16 == -1 ? 0 : cursorQuery.getInt(i16);
                        i13 = i16;
                        int i18 = i14;
                        int i19 = i18 == -1 ? 0 : cursorQuery.getInt(i18);
                        i14 = i18;
                        int i20 = i11;
                        long j15 = i20 == -1 ? 0L : cursorQuery.getLong(i20);
                        i11 = i20;
                        int i21 = columnIndex14;
                        int i22 = i21 == -1 ? 0 : cursorQuery.getInt(i21);
                        columnIndex14 = i21;
                        int i23 = columnIndex15;
                        NetworkType networkTypeIntToNetworkType = i23 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i23));
                        columnIndex15 = i23;
                        int i24 = columnIndex16;
                        NetworkRequestCompat networkRequest$work_runtime_release = i24 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i24));
                        columnIndex16 = i24;
                        int i25 = columnIndex17;
                        if (i25 == -1) {
                            z10 = false;
                        } else {
                            z10 = cursorQuery.getInt(i25) != 0;
                        }
                        columnIndex17 = i25;
                        int i26 = columnIndex18;
                        if (i26 == -1) {
                            z11 = false;
                        } else {
                            z11 = cursorQuery.getInt(i26) != 0;
                        }
                        columnIndex18 = i26;
                        int i27 = columnIndex19;
                        if (i27 == -1) {
                            z12 = false;
                        } else {
                            z12 = cursorQuery.getInt(i27) != 0;
                        }
                        columnIndex19 = i27;
                        int i28 = columnIndex20;
                        if (i28 != -1 && cursorQuery.getInt(i28) != 0) {
                            z13 = true;
                        }
                        columnIndex20 = i28;
                        int i29 = columnIndex21;
                        boolean z14 = z13;
                        long j16 = i29 == -1 ? 0L : cursorQuery.getLong(i29);
                        columnIndex21 = i29;
                        int i30 = columnIndex22;
                        long j17 = i30 != -1 ? cursorQuery.getLong(i30) : 0L;
                        columnIndex22 = i30;
                        int i31 = columnIndex23;
                        columnIndex23 = i31;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j10, j11, j12, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z10, z11, z12, z14, j16, j17, i31 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i31))), i15, backoffPolicyIntToBackoffPolicy, j13, j14, i17, i19, j15, i22, (ArrayList) map.get(cursorQuery.getString(columnIndex)), (ArrayList) map2.get(cursorQuery.getString(columnIndex))));
                    }
                    cursorQuery.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
        });
    }
}
