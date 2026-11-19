package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;

@Stable
/* loaded from: classes2.dex */
public interface MutableDoubleState extends DoubleState, MutableState<Double> {

    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
        @Deprecated
        public static Double getValue(MutableDoubleState mutableDoubleState) {
            return Double.valueOf(MutableDoubleState.access$getValue$jd(mutableDoubleState));
        }

        @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
        @Deprecated
        public static void setValue(MutableDoubleState mutableDoubleState, double d10) {
            MutableDoubleState.super.setValue(d10);
        }
    }

    static /* synthetic */ double access$getValue$jd(MutableDoubleState mutableDoubleState) {
        return super.getValue().doubleValue();
    }

    @Override // androidx.compose.runtime.DoubleState
    double getDoubleValue();

    void setDoubleValue(double d10);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Double d10) {
        setValue(d10.doubleValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    default Double getValue() {
        return Double.valueOf(getDoubleValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    default void setValue(double d10) {
        setDoubleValue(d10);
    }
}
