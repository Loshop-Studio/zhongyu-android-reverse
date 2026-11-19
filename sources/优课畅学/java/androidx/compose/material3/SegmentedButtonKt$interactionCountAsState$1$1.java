package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableIntState;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.material3.SegmentedButtonKt$interactionCountAsState$1$1", m17801f = "SegmentedButton.kt", m17802l = {TbsListener.ErrorCode.INFO_CODE_BASE}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SegmentedButtonKt$interactionCountAsState$1$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ MutableIntState $interactionCount;
    final /* synthetic */ InteractionSource $this_interactionCountAsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonKt$interactionCountAsState$1$1(InteractionSource interactionSource, MutableIntState mutableIntState, InterfaceC9324c<? super SegmentedButtonKt$interactionCountAsState$1$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$this_interactionCountAsState = interactionSource;
        this.$interactionCount = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new SegmentedButtonKt$interactionCountAsState$1$1(this.$this_interactionCountAsState, this.$interactionCount, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((SegmentedButtonKt$interactionCountAsState$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9266c interactions = this.$this_interactionCountAsState.getInteractions();
            final MutableIntState mutableIntState = this.$interactionCount;
            InterfaceC9267d interfaceC9267d = new InterfaceC9267d() { // from class: androidx.compose.material3.SegmentedButtonKt$interactionCountAsState$1$1.1
                @Override // p169l8.InterfaceC9267d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC9324c interfaceC9324c) {
                    return emit((Interaction) obj2, (InterfaceC9324c<? super C8736p>) interfaceC9324c);
                }

                public final Object emit(Interaction interaction, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    if (interaction instanceof PressInteraction.Press ? true : interaction instanceof FocusInteraction.Focus) {
                        MutableIntState mutableIntState2 = mutableIntState;
                        mutableIntState2.setIntValue(mutableIntState2.getIntValue() + 1);
                    } else {
                        if (interaction instanceof PressInteraction.Release ? true : interaction instanceof FocusInteraction.Unfocus ? true : interaction instanceof PressInteraction.Cancel) {
                            mutableIntState.setIntValue(r2.getIntValue() - 1);
                        }
                    }
                    return C8736p.f16368a;
                }
            };
            this.label = 1;
            if (interactions.collect(interfaceC9267d, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
