package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p006ui.AbstractC1266a;
import androidx.compose.p006ui.AbstractC1267b;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.draw.DrawModifier;
import androidx.compose.p006ui.focus.FocusEventModifier;
import androidx.compose.p006ui.focus.FocusState;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.graphics.ClipOp;
import androidx.compose.p006ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p006ui.graphics.drawscope.DrawContext;
import androidx.compose.p006ui.layout.AbstractC1419c;
import androidx.compose.p006ui.layout.IntrinsicMeasurable;
import androidx.compose.p006ui.layout.IntrinsicMeasureScope;
import androidx.compose.p006ui.layout.LayoutModifier;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(m5174d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B0\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u0011\u0010;\u001a\u000208H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010<J\f\u0010=\u001a\u000208*\u00020>H\u0016J)\u0010?\u001a\u00020@*\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010GR4\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R+\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\"\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0016\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010,\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0016\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001b\u00102\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b3\u0010\u0012R\u0019\u0010\t\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u00106\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, m5175d2 = {"Landroidx/compose/foundation/MarqueeModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/focus/FocusEventModifier;", "iterations", "", "delayMillis", "initialDelayMillis", "velocity", "Landroidx/compose/ui/unit/Dp;", "density", "Landroidx/compose/ui/unit/Density;", "(IIIFLandroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "Landroidx/compose/foundation/MarqueeAnimationMode;", "animationMode", "getAnimationMode-ZbEOnfQ", "()I", "setAnimationMode-97h66l8", "(I)V", "animationMode$delegate", "Landroidx/compose/runtime/MutableState;", "containerWidth", "getContainerWidth", "setContainerWidth", "containerWidth$delegate", "contentWidth", "getContentWidth", "setContentWidth", "contentWidth$delegate", "direction", "", "", "hasFocus", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus$delegate", "offset", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing", "getSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "setSpacing", "(Landroidx/compose/foundation/MarqueeSpacing;)V", "spacing$delegate", "spacingPx", "getSpacingPx", "spacingPx$delegate", "Landroidx/compose/runtime/State;", "F", "onFocusEvent", "", "focusState", "Landroidx/compose/ui/focus/FocusState;", "runAnimation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,417:1\n76#2:418\n102#2,2:419\n76#2:421\n102#2,2:422\n76#2:424\n102#2,2:425\n76#2:427\n102#2,2:428\n76#2:430\n102#2,2:431\n76#2:433\n214#3,8:434\n261#3,8:442\n115#3,9:450\n269#3,3:459\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifier\n*L\n191#1:418\n191#1:419,2\n192#1:421\n192#1:422,2\n193#1:424\n193#1:425,2\n194#1:427\n194#1:428,2\n195#1:430\n195#1:431,2\n199#1:433\n235#1:434,8\n235#1:442,8\n245#1:450,9\n235#1:459,3\n*E\n"})
/* loaded from: classes.dex */
final class MarqueeModifier implements Modifier.Element, LayoutModifier, DrawModifier, FocusEventModifier {

    /* renamed from: animationMode$delegate, reason: from kotlin metadata */
    private final MutableState animationMode;

    /* renamed from: containerWidth$delegate, reason: from kotlin metadata */
    private final MutableState containerWidth;

    /* renamed from: contentWidth$delegate, reason: from kotlin metadata */
    private final MutableState contentWidth;
    private final int delayMillis;
    private final Density density;
    private final float direction;

    /* renamed from: hasFocus$delegate, reason: from kotlin metadata */
    private final MutableState hasFocus;
    private final int initialDelayMillis;
    private final int iterations;
    private final Animatable<Float, AnimationVector1D> offset;

    /* renamed from: spacing$delegate, reason: from kotlin metadata */
    private final MutableState spacing;

    /* renamed from: spacingPx$delegate, reason: from kotlin metadata */
    private final State spacingPx;
    private final float velocity;

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.foundation.MarqueeModifier$runAnimation$2", m5192f = "BasicMarquee.kt", m5193i = {}, m5194l = {272}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.foundation.MarqueeModifier$runAnimation$2 */
    public static final class C04152 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        @Metadata(m5174d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m5175d2 = {"", "contentWithSpacingWidth", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
        @DebugMetadata(m5191c = "androidx.compose.foundation.MarqueeModifier$runAnimation$2$2", m5192f = "BasicMarquee.kt", m5193i = {0, 0}, m5194l = {285, 287, 289, 289}, m5195m = "invokeSuspend", m5196n = {"contentWithSpacingWidth", "spec"}, m5197s = {"L$0", "L$1"})
        /* renamed from: androidx.compose.foundation.MarqueeModifier$runAnimation$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ MarqueeModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MarqueeModifier marqueeModifier, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = marqueeModifier;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Float f4, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(f4, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
                /*
                    r21 = this;
                    r9 = r21
                    java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r9.label
                    r11 = 4
                    r12 = 3
                    r1 = 2
                    r2 = 1
                    r13 = 0
                    r14 = 0
                    if (r0 == 0) goto L43
                    if (r0 == r2) goto L36
                    if (r0 == r1) goto L2e
                    if (r0 == r12) goto L29
                    if (r0 == r11) goto L20
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L20:
                    java.lang.Object r0 = r9.L$0
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    kotlin.ResultKt.throwOnFailure(r22)
                    goto Ld5
                L29:
                    kotlin.ResultKt.throwOnFailure(r22)
                    goto Lbb
                L2e:
                    kotlin.ResultKt.throwOnFailure(r22)     // Catch: java.lang.Throwable -> L33
                    goto La8
                L33:
                    r0 = move-exception
                    goto Lbe
                L36:
                    java.lang.Object r0 = r9.L$1
                    androidx.compose.animation.core.AnimationSpec r0 = (androidx.compose.animation.core.AnimationSpec) r0
                    java.lang.Object r2 = r9.L$0
                    java.lang.Float r2 = (java.lang.Float) r2
                    kotlin.ResultKt.throwOnFailure(r22)
                    r3 = r0
                    goto L8d
                L43:
                    kotlin.ResultKt.throwOnFailure(r22)
                    java.lang.Object r0 = r9.L$0
                    java.lang.Float r0 = (java.lang.Float) r0
                    if (r0 != 0) goto L4f
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L4f:
                    androidx.compose.foundation.MarqueeModifier r3 = r9.this$0
                    int r15 = androidx.compose.foundation.MarqueeModifier.access$getIterations$p(r3)
                    float r16 = r0.floatValue()
                    androidx.compose.foundation.MarqueeModifier r3 = r9.this$0
                    int r17 = androidx.compose.foundation.MarqueeModifier.access$getInitialDelayMillis$p(r3)
                    androidx.compose.foundation.MarqueeModifier r3 = r9.this$0
                    int r18 = androidx.compose.foundation.MarqueeModifier.access$getDelayMillis$p(r3)
                    androidx.compose.foundation.MarqueeModifier r3 = r9.this$0
                    float r19 = androidx.compose.foundation.MarqueeModifier.access$getVelocity$p(r3)
                    androidx.compose.foundation.MarqueeModifier r3 = r9.this$0
                    androidx.compose.ui.unit.Density r20 = androidx.compose.foundation.MarqueeModifier.access$getDensity$p(r3)
                    androidx.compose.animation.core.AnimationSpec r3 = androidx.compose.foundation.BasicMarqueeKt.m7070access$createMarqueeAnimationSpecZ4HSEVQ(r15, r16, r17, r18, r19, r20)
                    androidx.compose.foundation.MarqueeModifier r4 = r9.this$0
                    androidx.compose.animation.core.Animatable r4 = androidx.compose.foundation.MarqueeModifier.access$getOffset$p(r4)
                    java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r14)
                    r9.L$0 = r0
                    r9.L$1 = r3
                    r9.label = r2
                    java.lang.Object r2 = r4.snapTo(r5, r9)
                    if (r2 != r10) goto L8c
                    return r10
                L8c:
                    r2 = r0
                L8d:
                    androidx.compose.foundation.MarqueeModifier r0 = r9.this$0     // Catch: java.lang.Throwable -> L33
                    androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.MarqueeModifier.access$getOffset$p(r0)     // Catch: java.lang.Throwable -> L33
                    r4 = 0
                    r5 = 0
                    r7 = 12
                    r8 = 0
                    r9.L$0 = r13     // Catch: java.lang.Throwable -> L33
                    r9.L$1 = r13     // Catch: java.lang.Throwable -> L33
                    r9.label = r1     // Catch: java.lang.Throwable -> L33
                    r1 = r0
                    r6 = r21
                    java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L33
                    if (r0 != r10) goto La8
                    return r10
                La8:
                    androidx.compose.foundation.MarqueeModifier r0 = r9.this$0
                    androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.MarqueeModifier.access$getOffset$p(r0)
                    java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r14)
                    r9.label = r12
                    java.lang.Object r0 = r0.snapTo(r1, r9)
                    if (r0 != r10) goto Lbb
                    return r10
                Lbb:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                Lbe:
                    androidx.compose.foundation.MarqueeModifier r1 = r9.this$0
                    androidx.compose.animation.core.Animatable r1 = androidx.compose.foundation.MarqueeModifier.access$getOffset$p(r1)
                    java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r14)
                    r9.L$0 = r0
                    r9.L$1 = r13
                    r9.label = r11
                    java.lang.Object r1 = r1.snapTo(r2, r9)
                    if (r1 != r10) goto Ld5
                    return r10
                Ld5:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifier.C04152.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C04152(Continuation<? super C04152> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarqueeModifier.this.new C04152(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                final MarqueeModifier marqueeModifier = MarqueeModifier.this;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<Float>() { // from class: androidx.compose.foundation.MarqueeModifier.runAnimation.2.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        if (marqueeModifier.getContentWidth() <= marqueeModifier.getContainerWidth()) {
                            return null;
                        }
                        if (!MarqueeAnimationMode.m7121equalsimpl0(marqueeModifier.m7129getAnimationModeZbEOnfQ(), MarqueeAnimationMode.INSTANCE.m7128getWhileFocusedZbEOnfQ()) || marqueeModifier.getHasFocus()) {
                            return Float.valueOf(marqueeModifier.getContentWidth() + marqueeModifier.getSpacingPx());
                        }
                        return null;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(MarqueeModifier.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowSnapshotFlow, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C04152) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ MarqueeModifier(int i4, int i5, int i6, float f4, Density density, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, i5, i6, f4, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getContainerWidth() {
        return ((Number) this.containerWidth.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getContentWidth() {
        return ((Number) this.contentWidth.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSpacingPx() {
        return ((Number) this.spacingPx.getValue()).intValue();
    }

    private final void setContainerWidth(int i4) {
        this.containerWidth.setValue(Integer.valueOf(i4));
    }

    private final void setContentWidth(int i4) {
        this.contentWidth.setValue(Integer.valueOf(i4));
    }

    private final void setHasFocus(boolean z3) {
        this.hasFocus.setValue(Boolean.valueOf(z3));
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC1267b.m309a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC1267b.m310b(this, function1);
    }

    @Override // androidx.compose.p006ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        float fFloatValue = this.offset.getValue().floatValue();
        float f4 = this.direction;
        float f5 = fFloatValue * f4;
        boolean z3 = !((f4 > 1.0f ? 1 : (f4 == 1.0f ? 0 : -1)) == 0) ? this.offset.getValue().floatValue() >= ((float) getContainerWidth()) : this.offset.getValue().floatValue() >= ((float) getContentWidth());
        boolean z4 = !((this.direction > 1.0f ? 1 : (this.direction == 1.0f ? 0 : -1)) == 0) ? this.offset.getValue().floatValue() <= ((float) getSpacingPx()) : this.offset.getValue().floatValue() <= ((float) ((getContentWidth() + getSpacingPx()) - getContainerWidth()));
        float contentWidth = this.direction == 1.0f ? getContentWidth() + getSpacingPx() : (-getContentWidth()) - getSpacingPx();
        float fM9011getHeightimpl = Size.m9011getHeightimpl(contentDrawScope.mo9614getSizeNHjbRc());
        int iM9167getIntersectrtfAjoo = ClipOp.INSTANCE.m9167getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long jMo9620getSizeNHjbRc = drawContext.mo9620getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo9623clipRectN_I0leg(f5, 0.0f, f5 + getContainerWidth(), fM9011getHeightimpl, iM9167getIntersectrtfAjoo);
        if (z3) {
            contentDrawScope.drawContent();
        }
        if (z4) {
            contentDrawScope.getDrawContext().getTransform().translate(contentWidth, 0.0f);
            contentDrawScope.drawContent();
            contentDrawScope.getDrawContext().getTransform().translate(-contentWidth, -0.0f);
        }
        drawContext.getCanvas().restore();
        drawContext.mo9621setSizeuvyYCjk(jMo9620getSizeNHjbRc);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC1267b.m311c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC1267b.m312d(this, obj, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getAnimationMode-ZbEOnfQ, reason: not valid java name */
    public final int m7129getAnimationModeZbEOnfQ() {
        return ((MarqueeAnimationMode) this.animationMode.getValue()).getValue();
    }

    public final MarqueeSpacing getSpacing() {
        return (MarqueeSpacing) this.spacing.getValue();
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return AbstractC1419c.m640a(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return AbstractC1419c.m641b(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6941measure3p2s80s(MeasureScope measure, Measurable measurable, long j4) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(Constraints.m11484copyZbe2FdA$default(j4, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        setContainerWidth(ConstraintsKt.m11507constrainWidthK40F9xA(j4, placeableMo10585measureBRTryo0.getWidth()));
        setContentWidth(placeableMo10585measureBRTryo0.getWidth());
        return MeasureScope.CC.m634p(measure, getContainerWidth(), placeableMo10585measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.MarqueeModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeWithLayer$default(layout, placeableMo10585measureBRTryo0, MathKt__MathJVMKt.roundToInt((-((Number) this.offset.getValue()).floatValue()) * this.direction), 0, 0.0f, null, 12, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return AbstractC1419c.m642c(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return AbstractC1419c.m643d(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    @Override // androidx.compose.p006ui.focus.FocusEventModifier
    public void onFocusEvent(FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        setHasFocus(focusState.getHasFocus());
    }

    public final Object runAnimation(Continuation<? super Unit> continuation) throws Throwable {
        if (this.iterations <= 0) {
            return Unit.INSTANCE;
        }
        Object objWithContext = BuildersKt.withContext(FixedMotionDurationScale.INSTANCE, new C04152(null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* renamed from: setAnimationMode-97h66l8, reason: not valid java name */
    public final void m7130setAnimationMode97h66l8(int i4) {
        this.animationMode.setValue(MarqueeAnimationMode.m7118boximpl(i4));
    }

    public final void setSpacing(MarqueeSpacing marqueeSpacing) {
        Intrinsics.checkNotNullParameter(marqueeSpacing, "<set-?>");
        this.spacing.setValue(marqueeSpacing);
    }

    @Override // androidx.compose.p006ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC1266a.m307a(this, modifier);
    }

    private MarqueeModifier(int i4, int i5, int i6, float f4, Density density) {
        this.iterations = i4;
        this.delayMillis = i5;
        this.initialDelayMillis = i6;
        this.velocity = f4;
        this.density = density;
        this.contentWidth = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.containerWidth = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.hasFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.spacing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(BasicMarqueeKt.getDefaultMarqueeSpacing(), null, 2, null);
        this.animationMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.m7118boximpl(MarqueeAnimationMode.INSTANCE.m7127getImmediatelyZbEOnfQ()), null, 2, null);
        this.offset = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.direction = Math.signum(f4);
        this.spacingPx = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: androidx.compose.foundation.MarqueeModifier$spacingPx$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                MarqueeSpacing spacing = this.this$0.getSpacing();
                MarqueeModifier marqueeModifier = this.this$0;
                return Integer.valueOf(spacing.calculateSpacing(marqueeModifier.density, marqueeModifier.getContentWidth(), marqueeModifier.getContainerWidth()));
            }
        });
    }
}
