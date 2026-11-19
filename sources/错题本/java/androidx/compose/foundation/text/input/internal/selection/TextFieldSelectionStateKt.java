package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u0016\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a<\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0080\b¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, m5110d2 = {"Landroidx/compose/ui/text/TextRange;", "reverse-5zc-tL8", "(J)J", "reverse", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "", "enabled", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "desiredState", "Lkotlin/Function0;", "Ld6/s;", "operation", "menuItem", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZLandroidx/compose/foundation/text/input/internal/selection/TextToolbarState;Lr6/a;)Lr6/a;", "", "text", "logDebug", "(Lr6/a;)V", "DEBUG", "Z", "DEBUG_TAG", "Ljava/lang/String;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldSelectionStateKt {
    private static final boolean DEBUG = false;

    @NotNull
    private static final String DEBUG_TAG = "TextFieldSelectionState";

    @Nullable
    public static final InterfaceC6469a menuItem(@NotNull final TextFieldSelectionState textFieldSelectionState, boolean z8, @NotNull final TextToolbarState textToolbarState, @NotNull final InterfaceC6469a interfaceC6469a) {
        if (z8) {
            return new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.menuItem.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m7959invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m7959invoke() {
                    interfaceC6469a.invoke();
                    textFieldSelectionState.updateTextToolbarState(textToolbarState);
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverse-5zc-tL8, reason: not valid java name */
    public static final long m7958reverse5zctL8(long j7) {
        return TextRangeKt.TextRange(TextRange.m12765getEndimpl(j7), TextRange.m12770getStartimpl(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logDebug(InterfaceC6469a interfaceC6469a) {
    }
}
