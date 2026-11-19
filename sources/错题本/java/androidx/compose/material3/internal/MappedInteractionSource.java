package androidx.compose.material3.internal;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m5110d2 = {"Landroidx/compose/material3/internal/MappedInteractionSource;", "Landroidx/compose/foundation/interaction/InteractionSource;", "underlyingInteractionSource", "Landroidx/compose/ui/geometry/Offset;", "delta", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;JLkotlin/jvm/internal/e;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "press", "mapPress", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)Landroidx/compose/foundation/interaction/PressInteraction$Press;", "J", "", "mappedPresses", "Ljava/util/Map;", "Lkotlinx/coroutines/flow/f;", "Landroidx/compose/foundation/interaction/Interaction;", "interactions", "Lkotlinx/coroutines/flow/f;", "getInteractions", "()Lkotlinx/coroutines/flow/f;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMappedInteractionSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MappedInteractionSource.kt\nandroidx/compose/material3/internal/MappedInteractionSource\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,65:1\n53#2:66\n55#2:70\n50#3:67\n55#3:69\n107#4:68\n*S KotlinDebug\n*F\n+ 1 MappedInteractionSource.kt\nandroidx/compose/material3/internal/MappedInteractionSource\n*L\n35#1:66\n35#1:70\n35#1:67\n35#1:69\n35#1:68\n*E\n"})
/* loaded from: classes.dex */
public final class MappedInteractionSource implements InteractionSource {
    public static final int $stable = 0;
    private final long delta;

    @NotNull
    private final InterfaceC5910f interactions;

    @NotNull
    private final Map<PressInteraction.Press, PressInteraction.Press> mappedPresses;

    public /* synthetic */ MappedInteractionSource(InteractionSource interactionSource, long j7, AbstractC5824e abstractC5824e) {
        this(interactionSource, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PressInteraction.Press mapPress(PressInteraction.Press press) {
        return new PressInteraction.Press(Offset.m10445minusMKHz9U(press.getPressPosition(), this.delta), null);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    @NotNull
    public InterfaceC5910f getInteractions() {
        return this.interactions;
    }

    private MappedInteractionSource(InteractionSource interactionSource, long j7) {
        this.delta = j7;
        this.mappedPresses = new LinkedHashMap();
        final InterfaceC5910f interactions = interactionSource.getInteractions();
        this.interactions = new InterfaceC5910f() { // from class: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "Ld6/s;", "emit", "(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;", "<anonymous>"}, m5111k = 3, m5112mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MappedInteractionSource.kt\nandroidx/compose/material3/internal/MappedInteractionSource\n*L\n1#1,222:1\n54#2:223\n36#3,23:224\n*E\n"})
            /* renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2 */
            public static final class C19652<T> implements InterfaceC5912g {
                final /* synthetic */ InterfaceC5912g $this_unsafeFlow;
                final /* synthetic */ MappedInteractionSource this$0;

                @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m5302c = "androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2", m5303f = "MappedInteractionSource.kt", m5304i = {}, m5305l = {223}, m5306m = "emit", m5307n = {}, m5308s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC5631c interfaceC5631c) {
                        super(interfaceC5631c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C19652.this.emit(null, this);
                    }
                }

                public C19652(InterfaceC5912g interfaceC5912g, MappedInteractionSource mappedInteractionSource) {
                    this.$this_unsafeFlow = interfaceC5912g;
                    this.this$0 = mappedInteractionSource;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC5912g
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.C19652.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = (androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.C19652.AnonymousClass1) r0
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
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L30
                        if (r2 != r3) goto L28
                        kotlin.AbstractC5774b.m5119b(r7)
                        goto L95
                    L28:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L30:
                        kotlin.AbstractC5774b.m5119b(r7)
                        kotlinx.coroutines.flow.g r7 = r5.$this_unsafeFlow
                        androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
                        if (r2 == 0) goto L4f
                        androidx.compose.material3.internal.MappedInteractionSource r2 = r5.this$0
                        r4 = r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = (androidx.compose.foundation.interaction.PressInteraction.Press) r4
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = androidx.compose.material3.internal.MappedInteractionSource.access$mapPress(r2, r4)
                        androidx.compose.material3.internal.MappedInteractionSource r4 = r5.this$0
                        java.util.Map r4 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r4)
                        r4.put(r6, r2)
                        r6 = r2
                        goto L8c
                    L4f:
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel
                        if (r2 == 0) goto L6e
                        androidx.compose.material3.internal.MappedInteractionSource r2 = r5.this$0
                        java.util.Map r2 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r2)
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = (androidx.compose.foundation.interaction.PressInteraction.Cancel) r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = r6.getPress()
                        java.lang.Object r2 = r2.remove(r4)
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = (androidx.compose.foundation.interaction.PressInteraction.Press) r2
                        if (r2 != 0) goto L68
                        goto L8c
                    L68:
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                        r6.<init>(r2)
                        goto L8c
                    L6e:
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Release
                        if (r2 == 0) goto L8c
                        androidx.compose.material3.internal.MappedInteractionSource r2 = r5.this$0
                        java.util.Map r2 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r2)
                        androidx.compose.foundation.interaction.PressInteraction$Release r6 = (androidx.compose.foundation.interaction.PressInteraction.Release) r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = r6.getPress()
                        java.lang.Object r2 = r2.remove(r4)
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = (androidx.compose.foundation.interaction.PressInteraction.Press) r2
                        if (r2 != 0) goto L87
                        goto L8c
                    L87:
                        androidx.compose.foundation.interaction.PressInteraction$Release r6 = new androidx.compose.foundation.interaction.PressInteraction$Release
                        r6.<init>(r2)
                    L8c:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L95
                        return r1
                    L95:
                        d6.s r6 = p045d6.C5443s.f8405a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.C19652.emit(java.lang.Object, h6.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5910f
            @Nullable
            public Object collect(@NotNull InterfaceC5912g interfaceC5912g, @NotNull InterfaceC5631c interfaceC5631c) {
                Object objCollect = interactions.collect(new C19652(interfaceC5912g, this), interfaceC5631c);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : C5443s.f8405a;
            }
        };
    }
}
