package androidx.compose.p013ui.platform;

import p101f8.AbstractC8476n;
import p101f8.InterfaceC8469g;

/* loaded from: classes2.dex */
public interface InspectableValue {

    public static final class DefaultImpls {
        @Deprecated
        public static InterfaceC8469g getInspectableElements(InspectableValue inspectableValue) {
            return InspectableValue.super.getInspectableElements();
        }

        @Deprecated
        public static String getNameFallback(InspectableValue inspectableValue) {
            return InspectableValue.super.getNameFallback();
        }

        @Deprecated
        public static Object getValueOverride(InspectableValue inspectableValue) {
            return InspectableValue.super.getValueOverride();
        }
    }

    default InterfaceC8469g getInspectableElements() {
        return AbstractC8476n.m13832g();
    }

    default String getNameFallback() {
        return null;
    }

    default Object getValueOverride() {
        return null;
    }
}
