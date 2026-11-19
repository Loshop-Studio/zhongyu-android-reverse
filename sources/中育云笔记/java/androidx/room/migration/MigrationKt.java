package androidx.room.migration;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes3.dex */
public final class MigrationKt {
    public static final Migration Migration(int i10, int i11, InterfaceC9540l migrate) {
        AbstractC9979u.m20294g(migrate, "migrate");
        return new MigrationImpl(i10, i11, migrate);
    }
}
