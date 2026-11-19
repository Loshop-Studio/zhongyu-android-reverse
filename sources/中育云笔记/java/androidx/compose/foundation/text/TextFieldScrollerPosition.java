package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.text.TextRange;
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
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10978w;

@Stable
/* loaded from: classes.dex */
public final class TextFieldScrollerPosition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldScrollerPosition, Object> Saver = ListSaverKt.listSaver(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$1
        @Override // p181hd.InterfaceC9544p
        public final List<Object> invoke(SaverScope saverScope, TextFieldScrollerPosition textFieldScrollerPosition) {
            return AbstractC10978w.m24139q(Float.valueOf(textFieldScrollerPosition.getOffset()), Boolean.valueOf(textFieldScrollerPosition.getOrientation() == Orientation.Vertical));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$2
        @Override // p181hd.InterfaceC9540l
        public final TextFieldScrollerPosition invoke(List<? extends Object> list) {
            Object obj = list.get(1);
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
            Object obj2 = list.get(0);
            AbstractC9979u.m20292e(obj2, "null cannot be cast to non-null type kotlin.Float");
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
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
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
        this.previousSelection = TextRange.Companion.m32971getZerod9O1mEE();
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
    public final int m27912getOffsetToFollow5zctL8(long j10) {
        return TextRange.m32966getStartimpl(j10) != TextRange.m32966getStartimpl(this.previousSelection) ? TextRange.m32966getStartimpl(j10) : TextRange.m32961getEndimpl(j10) != TextRange.m32961getEndimpl(this.previousSelection) ? TextRange.m32961getEndimpl(j10) : TextRange.m32964getMinimpl(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Orientation getOrientation() {
        return (Orientation) this.orientation$delegate.getValue();
    }

    /* renamed from: getPreviousSelection-d9O1mEE, reason: not valid java name */
    public final long m27913getPreviousSelectiond9O1mEE() {
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
    public final void m27914setPreviousSelection5zctL8(long j10) {
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
        setOffset(AbstractC10410o.m21760m(getOffset(), 0.0f, f10));
        setViewportSize(i10);
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f10, int i10, AbstractC9972n abstractC9972n) {
        this(orientation, (i10 & 2) != 0 ? 0.0f : f10);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }
}
