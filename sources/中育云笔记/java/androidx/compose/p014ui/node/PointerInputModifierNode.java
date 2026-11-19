package androidx.compose.p014ui.node;

import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerEventPass;

/* loaded from: classes2.dex */
public interface PointerInputModifierNode extends DelegatableNode {
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    default long mo27932getTouchBoundsExpansionRZrCHBk() {
        return TouchBoundsExpansion.Companion.m32605getNoneRZrCHBk();
    }

    default boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    void onCancelPointerInput();

    default void onDensityChange() {
        onCancelPointerInput();
    }

    /* renamed from: onPointerEvent-H0pRuoY */
    void mo26920onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10);

    default void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    default boolean sharePointerInputWithSiblings() {
        return false;
    }
}
