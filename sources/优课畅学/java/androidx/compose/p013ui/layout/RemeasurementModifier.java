package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface RemeasurementModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(RemeasurementModifier remeasurementModifier, InterfaceC10570l interfaceC10570l) {
            return RemeasurementModifier.super.all(interfaceC10570l);
        }

        @Deprecated
        public static boolean any(RemeasurementModifier remeasurementModifier, InterfaceC10570l interfaceC10570l) {
            return RemeasurementModifier.super.any(interfaceC10570l);
        }

        @Deprecated
        public static <R> R foldIn(RemeasurementModifier remeasurementModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) RemeasurementModifier.super.foldIn(r10, interfaceC10574p);
        }

        @Deprecated
        public static <R> R foldOut(RemeasurementModifier remeasurementModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) RemeasurementModifier.super.foldOut(r10, interfaceC10574p);
        }

        @Deprecated
        public static Modifier then(RemeasurementModifier remeasurementModifier, Modifier modifier) {
            return RemeasurementModifier.super.then(modifier);
        }
    }

    void onRemeasurementAvailable(Remeasurement remeasurement);
}
