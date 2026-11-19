package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;

@Stable
/* loaded from: classes2.dex */
public interface DoubleState extends State<Double> {

    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
        @Deprecated
        public static Double getValue(DoubleState doubleState) {
            return Double.valueOf(DoubleState.access$getValue$jd(doubleState));
        }
    }

    static /* synthetic */ double access$getValue$jd(DoubleState doubleState) {
        return super.getValue().doubleValue();
    }

    double getDoubleValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    default Double getValue() {
        return Double.valueOf(getDoubleValue());
    }
}
