package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public interface LayoutModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(LayoutModifier layoutModifier, InterfaceC9540l interfaceC9540l) {
            return LayoutModifier.super.all(interfaceC9540l);
        }

        @Deprecated
        public static boolean any(LayoutModifier layoutModifier, InterfaceC9540l interfaceC9540l) {
            return LayoutModifier.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <R> R foldIn(LayoutModifier layoutModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) LayoutModifier.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <R> R foldOut(LayoutModifier layoutModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) LayoutModifier.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static int maxIntrinsicHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return LayoutModifier.super.maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i10);
        }

        @Deprecated
        public static int maxIntrinsicWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return LayoutModifier.super.maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i10);
        }

        @Deprecated
        public static int minIntrinsicHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return LayoutModifier.super.minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i10);
        }

        @Deprecated
        public static int minIntrinsicWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return LayoutModifier.super.minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i10);
        }

        @Deprecated
        public static Modifier then(LayoutModifier layoutModifier, Modifier modifier) {
            return LayoutModifier.super.then(modifier);
        }
    }

    default int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return MeasuringIntrinsics.INSTANCE.maxHeight(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    default int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return MeasuringIntrinsics.INSTANCE.maxWidth(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    /* renamed from: measure-3p2s80s */
    MeasureResult mo27378measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10);

    default int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return MeasuringIntrinsics.INSTANCE.minHeight(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    default int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return MeasuringIntrinsics.INSTANCE.minWidth(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }
}
