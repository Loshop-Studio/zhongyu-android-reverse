package androidx.compose.p006ui.input.pointer;

import androidx.compose.p006ui.ComposedModifierKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.platform.CompositionLocalsKt;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m5175d2 = {"pointerHoverIcon", "Landroidx/compose/ui/Modifier;", "icon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "overrideDescendants", "", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,101:1\n135#2:102\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n*L\n74#1:102\n*E\n"})
/* loaded from: classes.dex */
public final class PointerIconKt {
    @Stable
    public static final Modifier pointerHoverIcon(Modifier modifier, final PointerIcon icon, final boolean z3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("pointerHoverIcon");
                inspectorInfo.getProperties().set("icon", icon);
                inspectorInfo.getProperties().set("overrideDescendants", Boolean.valueOf(z3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon.2

            @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m5191c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", m5192f = "PointerIcon.kt", m5193i = {}, m5194l = {85}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
            /* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PointerIcon $icon;
                final /* synthetic */ boolean $overrideDescendants;
                final /* synthetic */ PointerIconService $pointerIconService;
                private /* synthetic */ Object L$0;
                int label;

                @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m5191c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1", m5192f = "PointerIcon.kt", m5193i = {0}, m5194l = {91}, m5195m = "invokeSuspend", m5196n = {"$this$awaitPointerEventScope"}, m5197s = {"L$0"})
                /* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C47471 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ PointerIcon $icon;
                    final /* synthetic */ boolean $overrideDescendants;
                    final /* synthetic */ PointerIconService $pointerIconService;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C47471(boolean z3, PointerIconService pointerIconService, PointerIcon pointerIcon, Continuation<? super C47471> continuation) {
                        super(2, continuation);
                        this.$overrideDescendants = z3;
                        this.$pointerIconService = pointerIconService;
                        this.$icon = pointerIcon;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C47471 c47471 = new C47471(this.$overrideDescendants, this.$pointerIconService, this.$icon, continuation);
                        c47471.L$0 = obj;
                        return c47471;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                        return ((C47471) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
                    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:17:0x0040). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                        /*
                            r12 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r12.label
                            r2 = 1
                            if (r1 == 0) goto L1e
                            if (r1 != r2) goto L16
                            java.lang.Object r1 = r12.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r1
                            kotlin.ResultKt.throwOnFailure(r13)
                            r3 = r1
                            r1 = r0
                            r0 = r12
                            goto L40
                        L16:
                            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r13.<init>(r0)
                            throw r13
                        L1e:
                            kotlin.ResultKt.throwOnFailure(r13)
                            java.lang.Object r13 = r12.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r13
                            r1 = r13
                            r13 = r12
                        L27:
                            boolean r3 = r13.$overrideDescendants
                            if (r3 == 0) goto L2e
                            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.p006ui.input.pointer.PointerEventPass.Main
                            goto L30
                        L2e:
                            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.p006ui.input.pointer.PointerEventPass.Initial
                        L30:
                            r13.L$0 = r1
                            r13.label = r2
                            java.lang.Object r3 = r1.awaitPointerEvent(r3, r13)
                            if (r3 != r0) goto L3b
                            return r0
                        L3b:
                            r11 = r0
                            r0 = r13
                            r13 = r3
                            r3 = r1
                            r1 = r11
                        L40:
                            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.p006ui.input.pointer.PointerEvent) r13
                            int r4 = r13.getType()
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.p006ui.input.pointer.PointerEventType.INSTANCE
                            int r6 = r5.m10440getRelease7fucELk()
                            boolean r4 = androidx.compose.p006ui.input.pointer.PointerEventType.m10432equalsimpl0(r4, r6)
                            r6 = 0
                            if (r4 == 0) goto L6e
                            java.util.List r4 = r13.getChanges()
                            java.lang.Object r4 = r4.get(r6)
                            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p006ui.input.pointer.PointerInputChange) r4
                            long r7 = r3.mo10396getSizeYbymL2g()
                            androidx.compose.ui.geometry.Size$Companion r9 = androidx.compose.p006ui.geometry.Size.INSTANCE
                            long r9 = r9.m9023getZeroNHjbRc()
                            boolean r4 = androidx.compose.p006ui.input.pointer.PointerEventKt.m10428isOutOfBoundsjwHxaWs(r4, r7, r9)
                            if (r4 == 0) goto L6e
                            r6 = r2
                        L6e:
                            int r13 = r13.getType()
                            int r4 = r5.m10437getExit7fucELk()
                            boolean r13 = androidx.compose.p006ui.input.pointer.PointerEventType.m10432equalsimpl0(r13, r4)
                            if (r13 != 0) goto L85
                            if (r6 != 0) goto L85
                            androidx.compose.ui.input.pointer.PointerIconService r13 = r0.$pointerIconService
                            androidx.compose.ui.input.pointer.PointerIcon r4 = r0.$icon
                            r13.setCurrent(r4)
                        L85:
                            r13 = r0
                            r0 = r1
                            r1 = r3
                            goto L27
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.input.pointer.PointerIconKt.C13792.AnonymousClass1.C47471.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(boolean z3, PointerIconService pointerIconService, PointerIcon pointerIcon, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$overrideDescendants = z3;
                    this.$pointerIconService = pointerIconService;
                    this.$icon = pointerIcon;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$overrideDescendants, this.$pointerIconService, this.$icon, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i4 = this.label;
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C47471 c47471 = new C47471(this.$overrideDescendants, this.$pointerIconService, this.$icon, null);
                        this.label = 1;
                        if (pointerInputScope.awaitPointerEventScope(c47471, this) == coroutine_suspended) {
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
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier composed, Composer composer, int i4) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(811087536);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(811087536, i4, -1, "androidx.compose.ui.input.pointer.pointerHoverIcon.<anonymous> (PointerIcon.kt:78)");
                }
                PointerIconService pointerIconService = (PointerIconService) composer.consume(CompositionLocalsKt.getLocalPointerIconService());
                Modifier modifierPointerInput = pointerIconService == null ? Modifier.INSTANCE : SuspendingPointerInputFilterKt.pointerInput(composed, icon, Boolean.valueOf(z3), new AnonymousClass1(z3, pointerIconService, icon, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierPointerInput;
            }
        });
    }

    public static /* synthetic */ Modifier pointerHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return pointerHoverIcon(modifier, pointerIcon, z3);
    }
}
