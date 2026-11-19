package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
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

@Metadata(m13412d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0000\u001a:\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¨\u0006\u0013"}, m13413d2 = {"isMigrationRequired", "", "Landroidx/room/DatabaseConfiguration;", "fromVersion", "", "toVersion", "contains", "Landroidx/room/RoomDatabase$MigrationContainer;", "startVersion", "endVersion", "findMigrationPath", "", "Landroidx/room/migration/Migration;", "start", "end", "findUpMigrationPath", "result", "", "upgrade", "room-runtime_release"}, m13414k = 2, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@JvmName(name = "MigrationUtil")
/* loaded from: classes3.dex */
public final class MigrationUtil {
    public static final boolean contains(RoomDatabase.MigrationContainer migrationContainer, int i9, int i10) {
        Intrinsics.checkNotNullParameter(migrationContainer, "<this>");
        Map<Integer, Map<Integer, Migration>> migrations = migrationContainer.getMigrations();
        if (!migrations.containsKey(Integer.valueOf(i9))) {
            return false;
        }
        Map<Integer, Migration> mapEmptyMap = migrations.get(Integer.valueOf(i9));
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return mapEmptyMap.containsKey(Integer.valueOf(i10));
    }

    public static final List<Migration> findMigrationPath(RoomDatabase.MigrationContainer migrationContainer, int i9, int i10) {
        Intrinsics.checkNotNullParameter(migrationContainer, "<this>");
        if (i9 == i10) {
            return CollectionsKt.emptyList();
        }
        return findUpMigrationPath(migrationContainer, new ArrayList(), i10 > i9, i9, i10);
    }

    private static final List<Migration> findUpMigrationPath(RoomDatabase.MigrationContainer migrationContainer, List<Migration> list, boolean z9, int i9, int i10) {
        int iIntValue;
        boolean z10;
        while (true) {
            if (z9) {
                if (i9 >= i10) {
                    return list;
                }
            } else if (i9 <= i10) {
                return list;
            }
            Pair<Map<Integer, Migration>, Iterable<Integer>> sortedDescendingNodes$room_runtime_release = z9 ? migrationContainer.getSortedDescendingNodes$room_runtime_release(i9) : migrationContainer.getSortedNodes$room_runtime_release(i9);
            if (sortedDescendingNodes$room_runtime_release == null) {
                return null;
            }
            Map<Integer, Migration> mapComponent1 = sortedDescendingNodes$room_runtime_release.component1();
            Iterator<Integer> it = sortedDescendingNodes$room_runtime_release.component2().iterator();
            while (it.hasNext()) {
                iIntValue = it.next().intValue();
                if (!z9) {
                    if (i10 <= iIntValue && iIntValue < i9) {
                        Migration migration = mapComponent1.get(Integer.valueOf(iIntValue));
                        Intrinsics.checkNotNull(migration);
                        list.add(migration);
                        z10 = true;
                        break;
                    }
                } else if (i9 + 1 <= iIntValue && iIntValue <= i10) {
                    Migration migration2 = mapComponent1.get(Integer.valueOf(iIntValue));
                    Intrinsics.checkNotNull(migration2);
                    list.add(migration2);
                    z10 = true;
                    break;
                }
            }
            iIntValue = i9;
            z10 = false;
            if (!z10) {
                return null;
            }
            i9 = iIntValue;
        }
    }

    public static final boolean isMigrationRequired(DatabaseConfiguration databaseConfiguration, int i9, int i10) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "<this>");
        if (i9 > i10 && databaseConfiguration.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set<Integer> migrationNotRequiredFrom$room_runtime_release = databaseConfiguration.getMigrationNotRequiredFrom$room_runtime_release();
        return databaseConfiguration.requireMigration && (migrationNotRequiredFrom$room_runtime_release == null || !migrationNotRequiredFrom$room_runtime_release.contains(Integer.valueOf(i9)));
    }
}
