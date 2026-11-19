package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;

@Stable
/* loaded from: classes2.dex */
public interface LongState extends State<Long> {

    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
        @Deprecated
        public static Long getValue(LongState longState) {
            return Long.valueOf(LongState.access$getValue$jd(longState));
        }
    }

    static /* synthetic */ long access$getValue$jd(LongState longState) {
        return super.getValue().longValue();
    }

    long getLongValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    default Long getValue() {
        return Long.valueOf(getLongValue());
    }
}
