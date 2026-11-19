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
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0000\u001a:\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¨\u0006\u0013"}, m7880d2 = {"isMigrationRequired", "", "Landroidx/room/DatabaseConfiguration;", "fromVersion", "", "toVersion", "contains", "Landroidx/room/RoomDatabase$MigrationContainer;", "startVersion", "endVersion", "findMigrationPath", "", "Landroidx/room/migration/Migration;", "start", "end", "findUpMigrationPath", "result", "", "upgrade", "room-runtime_release"}, m7881k = 2, m7882mv = {2, 0, 0}, m7884xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@JvmName(name = "MigrationUtil")
/* loaded from: classes3.dex */
public final class MigrationUtil {
    public static final boolean contains(RoomDatabase.MigrationContainer migrationContainer, int i6, int i7) {
        Intrinsics.checkNotNullParameter(migrationContainer, "<this>");
        Map<Integer, Map<Integer, Migration>> migrations = migrationContainer.getMigrations();
        if (!migrations.containsKey(Integer.valueOf(i6))) {
            return false;
        }
        Map<Integer, Migration> mapEmptyMap = migrations.get(Integer.valueOf(i6));
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return mapEmptyMap.containsKey(Integer.valueOf(i7));
    }

    public static final List<Migration> findMigrationPath(RoomDatabase.MigrationContainer migrationContainer, int i6, int i7) {
        Intrinsics.checkNotNullParameter(migrationContainer, "<this>");
        if (i6 == i7) {
            return CollectionsKt.emptyList();
        }
        return findUpMigrationPath(migrationContainer, new ArrayList(), i7 > i6, i6, i7);
    }

    private static final List<Migration> findUpMigrationPath(RoomDatabase.MigrationContainer migrationContainer, List<Migration> list, boolean z6, int i6, int i7) {
        int iIntValue;
        boolean z7;
        while (true) {
            if (z6) {
                if (i6 >= i7) {
                    return list;
                }
            } else if (i6 <= i7) {
                return list;
            }
            Pair<Map<Integer, Migration>, Iterable<Integer>> sortedDescendingNodes$room_runtime_release = z6 ? migrationContainer.getSortedDescendingNodes$room_runtime_release(i6) : migrationContainer.getSortedNodes$room_runtime_release(i6);
            if (sortedDescendingNodes$room_runtime_release == null) {
                return null;
            }
            Map<Integer, Migration> mapComponent1 = sortedDescendingNodes$room_runtime_release.component1();
            Iterator<Integer> it = sortedDescendingNodes$room_runtime_release.component2().iterator();
            while (it.hasNext()) {
                iIntValue = it.next().intValue();
                if (!z6) {
                    if (i7 <= iIntValue && iIntValue < i6) {
                        Migration migration = mapComponent1.get(Integer.valueOf(iIntValue));
                        Intrinsics.checkNotNull(migration);
                        list.add(migration);
                        z7 = true;
                        break;
                    }
                } else if (i6 + 1 <= iIntValue && iIntValue <= i7) {
                    Migration migration2 = mapComponent1.get(Integer.valueOf(iIntValue));
                    Intrinsics.checkNotNull(migration2);
                    list.add(migration2);
                    z7 = true;
                    break;
                }
            }
            iIntValue = i6;
            z7 = false;
            if (!z7) {
                return null;
            }
            i6 = iIntValue;
        }
    }

    public static final boolean isMigrationRequired(DatabaseConfiguration databaseConfiguration, int i6, int i7) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "<this>");
        if (i6 > i7 && databaseConfiguration.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set<Integer> migrationNotRequiredFrom$room_runtime_release = databaseConfiguration.getMigrationNotRequiredFrom$room_runtime_release();
        return databaseConfiguration.requireMigration && (migrationNotRequiredFrom$room_runtime_release == null || !migrationNotRequiredFrom$room_runtime_release.contains(Integer.valueOf(i6)));
    }
}
