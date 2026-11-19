package androidx.compose.material3.internal;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class MappedInteractionSource implements InteractionSource {
    public static final int $stable = 0;
    private final long delta;
    private final InterfaceC11594c interactions;
    private final Map<PressInteraction.Press, PressInteraction.Press> mappedPresses;

    public /* synthetic */ MappedInteractionSource(InteractionSource interactionSource, long j10, AbstractC9972n abstractC9972n) {
        this(interactionSource, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PressInteraction.Press mapPress(PressInteraction.Press press) {
        return new PressInteraction.Press(Offset.m30641minusMKHz9U(press.m27280getPressPositionF1C5BW0(), this.delta), null);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public InterfaceC11594c getInteractions() {
        return this.interactions;
    }

    private MappedInteractionSource(InteractionSource interactionSource, long j10) {
        this.delta = j10;
        this.mappedPresses = new LinkedHashMap();
        final InterfaceC11594c interactions = interactionSource.getInteractions();
        this.interactions = new InterfaceC11594c() { // from class: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1

            /* renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2 */
            public static final class C24852<T> implements InterfaceC11595d {
                final /* synthetic */ InterfaceC11595d $this_unsafeFlow;
                final /* synthetic */ MappedInteractionSource this$0;

                @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2", m26211f = "MappedInteractionSource.kt", m26212l = {223}, m26213m = "emit")
                /* renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C24852.this.emit(null, this);
                    }
                }

                public C24852(InterfaceC11595d interfaceC11595d, MappedInteractionSource mappedInteractionSource) {
                    this.$this_unsafeFlow = interfaceC11595d;
                    this.this$0 = mappedInteractionSource;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.C24852.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = (androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.C24852.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = new androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.AbstractC9924b.m20071b(r7)
                        goto L97
                    L2a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L32:
                        kotlin.AbstractC9924b.m20071b(r7)
                        vd.d r7 = r5.$this_unsafeFlow
                        androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
                        if (r2 == 0) goto L51
                        androidx.compose.material3.internal.MappedInteractionSource r2 = r5.this$0
                        r4 = r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = (androidx.compose.foundation.interaction.PressInteraction.Press) r4
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = androidx.compose.material3.internal.MappedInteractionSource.access$mapPress(r2, r4)
                        androidx.compose.material3.internal.MappedInteractionSource r4 = r5.this$0
                        java.util.Map r4 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r4)
                        r4.put(r6, r2)
                        r6 = r2
                        goto L8e
                    L51:
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel
                        if (r2 == 0) goto L70
                        androidx.compose.material3.internal.MappedInteractionSource r2 = r5.this$0
                        java.util.Map r2 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r2)
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = (androidx.compose.foundation.interaction.PressInteraction.Cancel) r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = r6.getPress()
                        java.lang.Object r2 = r2.remove(r4)
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = (androidx.compose.foundation.interaction.PressInteraction.Press) r2
                        if (r2 != 0) goto L6a
                        goto L8e
                    L6a:
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                        r6.<init>(r2)
                        goto L8e
                    L70:
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Release
                        if (r2 == 0) goto L8e
                        androidx.compose.material3.internal.MappedInteractionSource r2 = r5.this$0
                        java.util.Map r2 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r2)
                        androidx.compose.foundation.interaction.PressInteraction$Release r6 = (androidx.compose.foundation.interaction.PressInteraction.Release) r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = r6.getPress()
                        java.lang.Object r2 = r2.remove(r4)
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = (androidx.compose.foundation.interaction.PressInteraction.Press) r2
                        if (r2 != 0) goto L89
                        goto L8e
                    L89:
                        androidx.compose.foundation.interaction.PressInteraction$Release r6 = new androidx.compose.foundation.interaction.PressInteraction$Release
                        r6.<init>(r2)
                    L8e:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L97
                        return r1
                    L97:
                        qc.q r6 = p309qc.C10786q.f26013a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.C24852.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = interactions.collect(new C24852(interfaceC11595d, this), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        };
    }
}
