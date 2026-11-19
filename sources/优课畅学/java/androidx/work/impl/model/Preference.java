package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.AbstractC9133u;

@Entity
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class Preference {

    @PrimaryKey
    @ColumnInfo(name = "key")
    private final String key;

    @ColumnInfo(name = "long_value")
    private final Long value;

    public Preference(String key, Long l10) {
        AbstractC9133u.m16133g(key, "key");
        this.key = key;
        this.value = l10;
    }

    public static /* synthetic */ Preference copy$default(Preference preference, String str, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = preference.key;
        }
        if ((i10 & 2) != 0) {
            l10 = preference.value;
        }
        return preference.copy(str, l10);
    }

    public final String component1() {
        return this.key;
    }

    public final Long component2() {
        return this.value;
    }

    public final Preference copy(String key, Long l10) {
        AbstractC9133u.m16133g(key, "key");
        return new Preference(key, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        return AbstractC9133u.m16128b(this.key, preference.key) && AbstractC9133u.m16128b(this.value, preference.value);
    }

    public final String getKey() {
        return this.key;
    }

    public final Long getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        Long l10 = this.value;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.key + ", value=" + this.value + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Preference(String key, boolean z10) {
        this(key, Long.valueOf(z10 ? 1L : 0L));
        AbstractC9133u.m16133g(key, "key");
    }
}
