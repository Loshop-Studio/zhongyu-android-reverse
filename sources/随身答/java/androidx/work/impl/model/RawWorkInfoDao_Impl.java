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
import androidx.sqlite.p016db.SupportSQLiteQuery;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

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
            RelationUtil.recursiveFetchHashMap(map, true, new Function1() { // from class: androidx.work.impl.model.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RawWorkInfoDao_Impl.m2088a(this.f2140a, (HashMap) obj);
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
        int i9 = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i9, it.next());
            i9++;
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
            RelationUtil.recursiveFetchHashMap(map, true, new Function1() { // from class: androidx.work.impl.model.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RawWorkInfoDao_Impl.m2089b(this.f2139a, (HashMap) obj);
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
        int i9 = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i9, it.next());
            i9++;
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
    public static /* synthetic */ Unit m2088a(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, HashMap map) {
        rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(map);
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ Unit m2089b(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, HashMap map) {
        rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(map);
        return Unit.INSTANCE;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery supportSQLiteQuery) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i9;
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
            int i10 = columnIndex13;
            HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
            while (cursorQuery.moveToNext()) {
                int i11 = columnIndex12;
                String string = cursorQuery.getString(columnIndex);
                if (map.containsKey(string)) {
                    i9 = columnIndex11;
                } else {
                    i9 = columnIndex11;
                    map.put(string, new ArrayList<>());
                }
                String string2 = cursorQuery.getString(columnIndex);
                if (!map2.containsKey(string2)) {
                    map2.put(string2, new ArrayList<>());
                }
                columnIndex12 = i11;
                columnIndex11 = i9;
            }
            int i12 = columnIndex11;
            int i13 = columnIndex12;
            cursorQuery.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(map);
            __fetchRelationshipWorkProgressAsandroidxWorkData(map2);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                long j9 = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                long j10 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                long j11 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                boolean z12 = false;
                int i14 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                BackoffPolicy backoffPolicyIntToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndex8));
                long j12 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                long j13 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                int i15 = i12;
                int i16 = i15 == -1 ? 0 : cursorQuery.getInt(i15);
                i12 = i15;
                int i17 = i13;
                int i18 = i17 == -1 ? 0 : cursorQuery.getInt(i17);
                i13 = i17;
                int i19 = i10;
                long j14 = i19 == -1 ? 0L : cursorQuery.getLong(i19);
                i10 = i19;
                int i20 = columnIndex14;
                int i21 = i20 == -1 ? 0 : cursorQuery.getInt(i20);
                columnIndex14 = i20;
                int i22 = columnIndex15;
                NetworkType networkTypeIntToNetworkType = i22 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i22));
                columnIndex15 = i22;
                int i23 = columnIndex16;
                NetworkRequestCompat networkRequest$work_runtime_release = i23 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i23));
                columnIndex16 = i23;
                int i24 = columnIndex17;
                if (i24 == -1) {
                    z9 = false;
                } else {
                    z9 = cursorQuery.getInt(i24) != 0;
                }
                columnIndex17 = i24;
                int i25 = columnIndex18;
                if (i25 == -1) {
                    z10 = false;
                } else {
                    z10 = cursorQuery.getInt(i25) != 0;
                }
                columnIndex18 = i25;
                int i26 = columnIndex19;
                if (i26 == -1) {
                    z11 = false;
                } else {
                    z11 = cursorQuery.getInt(i26) != 0;
                }
                columnIndex19 = i26;
                int i27 = columnIndex20;
                if (i27 != -1 && cursorQuery.getInt(i27) != 0) {
                    z12 = true;
                }
                columnIndex20 = i27;
                int i28 = columnIndex21;
                boolean z13 = z12;
                long j15 = i28 == -1 ? 0L : cursorQuery.getLong(i28);
                columnIndex21 = i28;
                int i29 = columnIndex22;
                long j16 = i29 != -1 ? cursorQuery.getLong(i29) : 0L;
                columnIndex22 = i29;
                int i30 = columnIndex23;
                columnIndex23 = i30;
                arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j9, j10, j11, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z9, z10, z11, z13, j15, j16, i30 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i30))), i14, backoffPolicyIntToBackoffPolicy, j12, j13, i16, i18, j14, i21, map.get(cursorQuery.getString(columnIndex)), map2.get(cursorQuery.getString(columnIndex))));
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosFlow(final SupportSQLiteQuery supportSQLiteQuery) {
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.2
            @Override // java.util.concurrent.Callable
            @NonNull
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                boolean z9;
                boolean z10;
                boolean z11;
                int i9;
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
                    int i10 = columnIndex13;
                    HashMap map2 = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        int i11 = columnIndex12;
                        String string = cursorQuery.getString(columnIndex);
                        if (map.containsKey(string)) {
                            i9 = columnIndex11;
                        } else {
                            i9 = columnIndex11;
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(columnIndex);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                        columnIndex12 = i11;
                        columnIndex11 = i9;
                    }
                    int i12 = columnIndex11;
                    int i13 = columnIndex12;
                    cursorQuery.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                        WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                        Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                        long j9 = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                        long j10 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                        long j11 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                        boolean z12 = false;
                        int i14 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                        BackoffPolicy backoffPolicyIntToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndex8));
                        long j12 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                        long j13 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                        int i15 = i12;
                        int i16 = i15 == -1 ? 0 : cursorQuery.getInt(i15);
                        i12 = i15;
                        int i17 = i13;
                        int i18 = i17 == -1 ? 0 : cursorQuery.getInt(i17);
                        i13 = i17;
                        int i19 = i10;
                        long j14 = i19 == -1 ? 0L : cursorQuery.getLong(i19);
                        i10 = i19;
                        int i20 = columnIndex14;
                        int i21 = i20 == -1 ? 0 : cursorQuery.getInt(i20);
                        columnIndex14 = i20;
                        int i22 = columnIndex15;
                        NetworkType networkTypeIntToNetworkType = i22 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i22));
                        columnIndex15 = i22;
                        int i23 = columnIndex16;
                        NetworkRequestCompat networkRequest$work_runtime_release = i23 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i23));
                        columnIndex16 = i23;
                        int i24 = columnIndex17;
                        if (i24 == -1) {
                            z9 = false;
                        } else {
                            z9 = cursorQuery.getInt(i24) != 0;
                        }
                        columnIndex17 = i24;
                        int i25 = columnIndex18;
                        if (i25 == -1) {
                            z10 = false;
                        } else {
                            z10 = cursorQuery.getInt(i25) != 0;
                        }
                        columnIndex18 = i25;
                        int i26 = columnIndex19;
                        if (i26 == -1) {
                            z11 = false;
                        } else {
                            z11 = cursorQuery.getInt(i26) != 0;
                        }
                        columnIndex19 = i26;
                        int i27 = columnIndex20;
                        if (i27 != -1 && cursorQuery.getInt(i27) != 0) {
                            z12 = true;
                        }
                        columnIndex20 = i27;
                        int i28 = columnIndex21;
                        boolean z13 = z12;
                        long j15 = i28 == -1 ? 0L : cursorQuery.getLong(i28);
                        columnIndex21 = i28;
                        int i29 = columnIndex22;
                        long j16 = i29 != -1 ? cursorQuery.getLong(i29) : 0L;
                        columnIndex22 = i29;
                        int i30 = columnIndex23;
                        columnIndex23 = i30;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j9, j10, j11, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z9, z10, z11, z13, j15, j16, i30 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i30))), i14, backoffPolicyIntToBackoffPolicy, j12, j13, i16, i18, j14, i21, (ArrayList) map.get(cursorQuery.getString(columnIndex)), (ArrayList) map2.get(cursorQuery.getString(columnIndex))));
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
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                boolean z9;
                boolean z10;
                boolean z11;
                int i9;
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
                    int i10 = columnIndex13;
                    HashMap map2 = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        int i11 = columnIndex12;
                        String string = cursorQuery.getString(columnIndex);
                        if (map.containsKey(string)) {
                            i9 = columnIndex11;
                        } else {
                            i9 = columnIndex11;
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(columnIndex);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                        columnIndex12 = i11;
                        columnIndex11 = i9;
                    }
                    int i12 = columnIndex11;
                    int i13 = columnIndex12;
                    cursorQuery.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                        WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                        Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                        long j9 = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                        long j10 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                        long j11 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                        boolean z12 = false;
                        int i14 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                        BackoffPolicy backoffPolicyIntToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndex8));
                        long j12 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                        long j13 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                        int i15 = i12;
                        int i16 = i15 == -1 ? 0 : cursorQuery.getInt(i15);
                        i12 = i15;
                        int i17 = i13;
                        int i18 = i17 == -1 ? 0 : cursorQuery.getInt(i17);
                        i13 = i17;
                        int i19 = i10;
                        long j14 = i19 == -1 ? 0L : cursorQuery.getLong(i19);
                        i10 = i19;
                        int i20 = columnIndex14;
                        int i21 = i20 == -1 ? 0 : cursorQuery.getInt(i20);
                        columnIndex14 = i20;
                        int i22 = columnIndex15;
                        NetworkType networkTypeIntToNetworkType = i22 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i22));
                        columnIndex15 = i22;
                        int i23 = columnIndex16;
                        NetworkRequestCompat networkRequest$work_runtime_release = i23 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i23));
                        columnIndex16 = i23;
                        int i24 = columnIndex17;
                        if (i24 == -1) {
                            z9 = false;
                        } else {
                            z9 = cursorQuery.getInt(i24) != 0;
                        }
                        columnIndex17 = i24;
                        int i25 = columnIndex18;
                        if (i25 == -1) {
                            z10 = false;
                        } else {
                            z10 = cursorQuery.getInt(i25) != 0;
                        }
                        columnIndex18 = i25;
                        int i26 = columnIndex19;
                        if (i26 == -1) {
                            z11 = false;
                        } else {
                            z11 = cursorQuery.getInt(i26) != 0;
                        }
                        columnIndex19 = i26;
                        int i27 = columnIndex20;
                        if (i27 != -1 && cursorQuery.getInt(i27) != 0) {
                            z12 = true;
                        }
                        columnIndex20 = i27;
                        int i28 = columnIndex21;
                        boolean z13 = z12;
                        long j15 = i28 == -1 ? 0L : cursorQuery.getLong(i28);
                        columnIndex21 = i28;
                        int i29 = columnIndex22;
                        long j16 = i29 != -1 ? cursorQuery.getLong(i29) : 0L;
                        columnIndex22 = i29;
                        int i30 = columnIndex23;
                        columnIndex23 = i30;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j9, j10, j11, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z9, z10, z11, z13, j15, j16, i30 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i30))), i14, backoffPolicyIntToBackoffPolicy, j12, j13, i16, i18, j14, i21, (ArrayList) map.get(cursorQuery.getString(columnIndex)), (ArrayList) map2.get(cursorQuery.getString(columnIndex))));
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
