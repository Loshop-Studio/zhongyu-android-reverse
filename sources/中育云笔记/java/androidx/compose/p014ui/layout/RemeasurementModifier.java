package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public interface RemeasurementModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(RemeasurementModifier remeasurementModifier, InterfaceC9540l interfaceC9540l) {
            return RemeasurementModifier.super.all(interfaceC9540l);
        }

        @Deprecated
        public static boolean any(RemeasurementModifier remeasurementModifier, InterfaceC9540l interfaceC9540l) {
            return RemeasurementModifier.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <R> R foldIn(RemeasurementModifier remeasurementModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) RemeasurementModifier.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <R> R foldOut(RemeasurementModifier remeasurementModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) RemeasurementModifier.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static Modifier then(RemeasurementModifier remeasurementModifier, Modifier modifier) {
            return RemeasurementModifier.super.then(modifier);
        }
    }

    void onRemeasurementAvailable(Remeasurement remeasurement);
}
