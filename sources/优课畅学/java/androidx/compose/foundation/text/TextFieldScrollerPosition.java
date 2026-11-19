package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@Stable
/* loaded from: classes.dex */
public final class TextFieldScrollerPosition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldScrollerPosition, Object> Saver = ListSaverKt.listSaver(new InterfaceC10574p() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$1
        @Override // p300x7.InterfaceC10574p
        public final List<Object> invoke(SaverScope saverScope, TextFieldScrollerPosition textFieldScrollerPosition) {
            return AbstractC8809v.m14774q(Float.valueOf(textFieldScrollerPosition.getOffset()), Boolean.valueOf(textFieldScrollerPosition.getOrientation() == Orientation.Vertical));
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$2
        @Override // p300x7.InterfaceC10570l
        public final TextFieldScrollerPosition invoke(List<? extends Object> list) {
            Object obj = list.get(1);
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
            Object obj2 = list.get(0);
            AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
        }
    });
    private final MutableFloatState maximum$delegate;
    private final MutableFloatState offset$delegate;
    private final MutableState orientation$delegate;
    private Rect previousCursorRect;
    private long previousSelection;
    private final MutableIntState viewportSize$delegate;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.Saver;
        }

        private Companion() {
        }
    }

    public TextFieldScrollerPosition(Orientation orientation, float f10) {
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f10);
        this.maximum$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.viewportSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.previousCursorRect = Rect.Companion.getZero();
        this.previousSelection = TextRange.Companion.m26369getZerod9O1mEE();
        this.orientation$delegate = SnapshotStateKt.mutableStateOf(orientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    private final void setMaximum(float f10) {
        this.maximum$delegate.setFloatValue(f10);
    }

    private final void setViewportSize(int i10) {
        this.viewportSize$delegate.setIntValue(i10);
    }

    public final void coerceOffset$foundation_release(float f10, float f11, int i10) {
        float offset = getOffset();
        float f12 = i10;
        float f13 = offset + f12;
        setOffset(getOffset() + ((f11 <= f13 && (f10 >= offset || f11 - f10 <= f12)) ? (f10 >= offset || f11 - f10 > f12) ? 0.0f : f10 - offset : f11 - f13));
    }

    public final float getMaximum() {
        return this.maximum$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    /* renamed from: getOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m21310getOffsetToFollow5zctL8(long j10) {
        return TextRange.m26364getStartimpl(j10) != TextRange.m26364getStartimpl(this.previousSelection) ? TextRange.m26364getStartimpl(j10) : TextRange.m26359getEndimpl(j10) != TextRange.m26359getEndimpl(this.previousSelection) ? TextRange.m26359getEndimpl(j10) : TextRange.m26362getMinimpl(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Orientation getOrientation() {
        return (Orientation) this.orientation$delegate.getValue();
    }

    /* renamed from: getPreviousSelection-d9O1mEE, reason: not valid java name */
    public final long m21311getPreviousSelectiond9O1mEE() {
        return this.previousSelection;
    }

    public final int getViewportSize() {
        return this.viewportSize$delegate.getIntValue();
    }

    public final void setOffset(float f10) {
        this.offset$delegate.setFloatValue(f10);
    }

    public final void setOrientation(Orientation orientation) {
        this.orientation$delegate.setValue(orientation);
    }

    /* renamed from: setPreviousSelection-5zc-tL8, reason: not valid java name */
    public final void m21312setPreviousSelection5zctL8(long j10) {
        this.previousSelection = j10;
    }

    public final void update(Orientation orientation, Rect rect, int i10, int i11) {
        float f10 = i11 - i10;
        setMaximum(f10);
        if (rect.getLeft() != this.previousCursorRect.getLeft() || rect.getTop() != this.previousCursorRect.getTop()) {
            boolean z10 = orientation == Orientation.Vertical;
            coerceOffset$foundation_release(z10 ? rect.getTop() : rect.getLeft(), z10 ? rect.getBottom() : rect.getRight(), i10);
            this.previousCursorRect = rect;
        }
        setOffset(AbstractC8323h.m13517l(getOffset(), 0.0f, f10));
        setViewportSize(i10);
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f10, int i10, AbstractC9126n abstractC9126n) {
        this(orientation, (i10 & 2) != 0 ? 0.0f : f10);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }
}
