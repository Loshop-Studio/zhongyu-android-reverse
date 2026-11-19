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
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LinkStateInteractionSourceObserver {
    public static final int $stable = 0;
    private final InteractionSource interactionSource;
    private final int Focused = 1;
    private final int Hovered = 2;
    private final int Pressed = 4;
    private final MutableIntState interactionState = SnapshotIntStateKt.mutableIntStateOf(0);

    public LinkStateInteractionSourceObserver(InteractionSource interactionSource) {
        this.interactionSource = interactionSource;
    }

    public final Object collectInteractionsForLinks(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
        Object objCollect = this.interactionSource.getInteractions().collect(new InterfaceC9267d() { // from class: androidx.compose.foundation.text.LinkStateInteractionSourceObserver.collectInteractionsForLinks.2
            @Override // p169l8.InterfaceC9267d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c2) {
                return emit((Interaction) obj, (InterfaceC9324c<? super C8736p>) interfaceC9324c2);
            }

            public final Object emit(Interaction interaction, InterfaceC9324c<? super C8736p> interfaceC9324c2) {
                int i10;
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
                int i11 = mutableObjectList2._size;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Interaction interaction2 = (Interaction) objArr[i13];
                    if (interaction2 instanceof HoverInteraction.Enter) {
                        i10 = linkStateInteractionSourceObserver.Hovered;
                    } else if (interaction2 instanceof FocusInteraction.Focus) {
                        i10 = linkStateInteractionSourceObserver.Focused;
                    } else if (interaction2 instanceof PressInteraction.Press) {
                        i10 = linkStateInteractionSourceObserver.Pressed;
                    }
                    i12 |= i10;
                }
                this.interactionState.setIntValue(i12);
                return C8736p.f16368a;
            }
        }, interfaceC9324c);
        return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
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
