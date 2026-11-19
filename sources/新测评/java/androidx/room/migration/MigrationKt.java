package androidx.room.migration;

import androidx.sqlite.p017db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¨\u0006\t"}, m13558d2 = {"Migration", "Landroidx/room/migration/Migration;", "startVersion", "", "endVersion", "migrate", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "room-runtime_release"}, m13559k = 2, m13560mv = {2, 0, 0}, m13562xi = 48)
@JvmName(name = "MigrationKt")
/* loaded from: classes3.dex */
public final class MigrationKt {
    public static final Migration Migration(int i10, int i11, Function1<? super SupportSQLiteDatabase, Unit> migrate) {
        Intrinsics.checkNotNullParameter(migrate, "migrate");
        return new MigrationImpl(i10, i11, migrate);
    }
}
