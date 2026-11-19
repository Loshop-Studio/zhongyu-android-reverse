package androidx.compose.material3;

import androidx.compose.runtime.Stable;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface SelectableDates {
    default boolean isSelectableDate(long j10) {
        return true;
    }

    default boolean isSelectableYear(int i10) {
        return true;
    }
}
