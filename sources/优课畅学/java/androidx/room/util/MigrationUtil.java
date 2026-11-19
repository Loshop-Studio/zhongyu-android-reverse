package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.room.DatabaseConfiguration;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class MigrationUtil {
    public static final boolean contains(RoomDatabase.MigrationContainer migrationContainer, int i10, int i11) {
        AbstractC9133u.m16133g(migrationContainer, "<this>");
        Map<Integer, Map<Integer, Migration>> migrations = migrationContainer.getMigrations();
        if (!migrations.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        Map<Integer, Migration> mapM15943h = migrations.get(Integer.valueOf(i10));
        if (mapM15943h == null) {
            mapM15943h = AbstractC9080a.m15943h();
        }
        return mapM15943h.containsKey(Integer.valueOf(i11));
    }

    public static final List<Migration> findMigrationPath(RoomDatabase.MigrationContainer migrationContainer, int i10, int i11) {
        AbstractC9133u.m16133g(migrationContainer, "<this>");
        if (i10 == i11) {
            return AbstractC8809v.m14771n();
        }
        return findUpMigrationPath(migrationContainer, new ArrayList(), i11 > i10, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List<Migration> findUpMigrationPath(RoomDatabase.MigrationContainer migrationContainer, List<Migration> list, boolean z10, int i10, int i11) {
        int iIntValue;
        boolean z11;
        while (true) {
            if (z10) {
                if (i10 >= i11) {
                    return list;
                }
            } else if (i10 <= i11) {
                return list;
            }
            Pair<Map<Integer, Migration>, Iterable<Integer>> sortedDescendingNodes$room_runtime_release = z10 ? migrationContainer.getSortedDescendingNodes$room_runtime_release(i10) : migrationContainer.getSortedNodes$room_runtime_release(i10);
            if (sortedDescendingNodes$room_runtime_release == null) {
                return null;
            }
            Map map = (Map) sortedDescendingNodes$room_runtime_release.m15903a();
            Iterator it = ((Iterable) sortedDescendingNodes$room_runtime_release.m15904b()).iterator();
            while (it.hasNext()) {
                iIntValue = ((Number) it.next()).intValue();
                if (!z10) {
                    if (i11 <= iIntValue && iIntValue < i10) {
                        Object obj = map.get(Integer.valueOf(iIntValue));
                        AbstractC9133u.m16130d(obj);
                        list.add(obj);
                        z11 = true;
                        break;
                    }
                } else if (i10 + 1 <= iIntValue && iIntValue <= i11) {
                    Object obj2 = map.get(Integer.valueOf(iIntValue));
                    AbstractC9133u.m16130d(obj2);
                    list.add(obj2);
                    z11 = true;
                    break;
                }
            }
            iIntValue = i10;
            z11 = false;
            if (!z11) {
                return null;
            }
            i10 = iIntValue;
        }
    }

    public static final boolean isMigrationRequired(DatabaseConfiguration databaseConfiguration, int i10, int i11) {
        AbstractC9133u.m16133g(databaseConfiguration, "<this>");
        if (i10 > i11 && databaseConfiguration.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set<Integer> migrationNotRequiredFrom$room_runtime_release = databaseConfiguration.getMigrationNotRequiredFrom$room_runtime_release();
        return databaseConfiguration.requireMigration && (migrationNotRequiredFrom$room_runtime_release == null || !migrationNotRequiredFrom$room_runtime_release.contains(Integer.valueOf(i10)));
    }
}
