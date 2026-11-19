package androidx.compose.p014ui.platform;

import p296pd.AbstractC10666n;
import p296pd.InterfaceC10659g;

/* loaded from: classes2.dex */
public interface InspectableValue {

    public static final class DefaultImpls {
        @Deprecated
        public static InterfaceC10659g getInspectableElements(InspectableValue inspectableValue) {
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

    default InterfaceC10659g getInspectableElements() {
        return AbstractC10666n.m22563g();
    }

    default String getNameFallback() {
        return null;
    }

    default Object getValueOverride() {
        return null;
    }
}
