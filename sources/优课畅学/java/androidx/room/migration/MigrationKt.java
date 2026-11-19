package androidx.room.migration;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class MigrationKt {
    public static final Migration Migration(int i10, int i11, InterfaceC10570l migrate) {
        AbstractC9133u.m16133g(migrate, "migrate");
        return new MigrationImpl(i10, i11, migrate);
    }
}
