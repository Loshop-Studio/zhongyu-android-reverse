package androidx.compose.foundation.text;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.InterfaceC5912g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m5110d2 = {"Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;)V", "Ld6/s;", "collectInteractionsForLinks", "(Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/interaction/InteractionSource;", "", "Focused", "I", "Hovered", "Pressed", "Landroidx/compose/runtime/MutableIntState;", "interactionState", "Landroidx/compose/runtime/MutableIntState;", "", "isFocused", "()Z", "isHovered", "isPressed", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLinkStateInteractionSourceObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkStateInteractionSourceObserver.kt\nandroidx/compose/foundation/text/LinkStateInteractionSourceObserver\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1#1,70:1\n1516#2:71\n*S KotlinDebug\n*F\n+ 1 LinkStateInteractionSourceObserver.kt\nandroidx/compose/foundation/text/LinkStateInteractionSourceObserver\n*L\n36#1:71\n*E\n"})
/* loaded from: classes.dex */
public final class LinkStateInteractionSourceObserver {
    public static final int $stable = 0;

    @NotNull
    private final InteractionSource interactionSource;
    private final int Focused = 1;
    private final int Hovered = 2;
    private final int Pressed = 4;

    @NotNull
    private final MutableIntState interactionState = SnapshotIntStateKt.mutableIntStateOf(0);

    public LinkStateInteractionSourceObserver(@NotNull InteractionSource interactionSource) {
        this.interactionSource = interactionSource;
    }

    @Nullable
    public final Object collectInteractionsForLinks(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        final MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
        Object objCollect = this.interactionSource.getInteractions().collect(new InterfaceC5912g() { // from class: androidx.compose.foundation.text.LinkStateInteractionSourceObserver.collectInteractionsForLinks.2
            @Override // kotlinx.coroutines.flow.InterfaceC5912g
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC5631c interfaceC5631c2) {
                return emit((Interaction) obj, (InterfaceC5631c<? super C5443s>) interfaceC5631c2);
            }

            public final Object emit(Interaction interaction, InterfaceC5631c<? super C5443s> interfaceC5631c2) {
                int i;
                if (interaction instanceof HoverInteraction.Enter ? true : interaction instanceof FocusInteraction.Focus ? true : interaction instanceof PressInteraction.Press) {
                    mutableObjectList.add(interaction);
                } else if (interaction instanceof HoverInteraction.Exit) {
                    mutableObjectList.remove(((HoverInteraction.Exit) interaction).getEnter());
                } else if (interaction instanceof FocusInteraction.Unfocus) {
                    mutableObjectList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                } else if (interaction instanceof PressInteraction.Release) {
                    mutableObjectList.remove(((PressInteraction.Release) interaction).getPress());
                } else if (interaction instanceof PressInteraction.Cancel) {
                    mutableObjectList.remove(((PressInteraction.Cancel) interaction).getPress());
                }
                MutableObjectList<Interaction> mutableObjectList2 = mutableObjectList;
                LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = this;
                Object[] objArr = mutableObjectList2.content;
                int i8 = mutableObjectList2._size;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Interaction interaction2 = (Interaction) objArr[i10];
                    if (interaction2 instanceof HoverInteraction.Enter) {
                        i = linkStateInteractionSourceObserver.Hovered;
                    } else if (interaction2 instanceof FocusInteraction.Focus) {
                        i = linkStateInteractionSourceObserver.Focused;
                    } else if (interaction2 instanceof PressInteraction.Press) {
                        i = linkStateInteractionSourceObserver.Pressed;
                    }
                    i9 |= i;
                }
                this.interactionState.setIntValue(i9);
                return C5443s.f8405a;
            }
        }, interfaceC5631c);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : C5443s.f8405a;
    }

    public final boolean isFocused() {
        return (this.interactionState.getIntValue() & this.Focused) != 0;
    }

    public final boolean isHovered() {
        return (this.interactionState.getIntValue() & this.Hovered) != 0;
    }

    public final boolean isPressed() {
        return (this.interactionState.getIntValue() & this.Pressed) != 0;
    }
}
