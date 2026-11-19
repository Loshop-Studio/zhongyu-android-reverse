package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p014ui.graphics.GraphicsLayerScope;
import androidx.compose.p014ui.graphics.TransformOrigin;
import androidx.compose.p014ui.graphics.TransformOriginKt;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p325rc.AbstractC10967q0;

/* loaded from: classes.dex */
public final class EnterExitTransitionKt {
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m26788invoke__ExYCQ(((TransformOrigin) obj).m31268unboximpl());
        }

        /* renamed from: invoke-__ExYCQ, reason: not valid java name */
        public final AnimationVector2D m26788invoke__ExYCQ(long j10) {
            return new AnimationVector2D(TransformOrigin.m31264getPivotFractionXimpl(j10), TransformOrigin.m31265getPivotFractionYimpl(j10));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return TransformOrigin.m31256boximpl(m26789invokeLIALnN8((AnimationVector2D) obj));
        }

        /* renamed from: invoke-LIALnN8, reason: not valid java name */
        public final long m26789invokeLIALnN8(AnimationVector2D animationVector2D) {
            return TransformOriginKt.TransformOrigin(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m33620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m33664boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);

    /* JADX WARN: Removed duplicated region for block: B:43:0x011e A[PHI: r1
      0x011e: PHI (r1v11 androidx.compose.animation.EnterTransition) = (r1v9 androidx.compose.animation.EnterTransition), (r1v12 androidx.compose.animation.EnterTransition) binds: [B:42:0x011c, B:38:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139 A[PHI: r2
      0x0139: PHI (r2v10 androidx.compose.animation.ExitTransition) = (r2v8 androidx.compose.animation.ExitTransition), (r2v11 androidx.compose.animation.ExitTransition) binds: [B:52:0x0137, B:48:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.animation.GraphicsLayerBlockForEnterExit createGraphicsLayerBlock(final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r19, androidx.compose.animation.EnterTransition r20, androidx.compose.animation.ExitTransition r21, java.lang.String r22, androidx.compose.runtime.Composer r23, int r24) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createGraphicsLayerBlock(androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.animation.GraphicsLayerBlockForEnterExit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p181hd.InterfaceC9540l createGraphicsLayerBlock$lambda$13$lambda$12(androidx.compose.animation.core.Transition.DeferredAnimation r3, androidx.compose.animation.core.Transition.DeferredAnimation r4, androidx.compose.animation.core.Transition r5, final androidx.compose.animation.EnterTransition r6, final androidx.compose.animation.ExitTransition r7, androidx.compose.animation.core.Transition.DeferredAnimation r8) {
        /*
            r0 = 0
            if (r3 == 0) goto L12
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
            r1.<init>()
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2 r2 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2
            r2.<init>()
            androidx.compose.runtime.State r3 = r3.animate(r1, r2)
            goto L13
        L12:
            r3 = r0
        L13:
            if (r4 == 0) goto L24
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
            r1.<init>()
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2 r2 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2
            r2.<init>()
            androidx.compose.runtime.State r4 = r4.animate(r1, r2)
            goto L25
        L24:
            r4 = r0
        L25:
            java.lang.Object r5 = r5.getCurrentState()
            androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter
            if (r5 != r1) goto L4d
            androidx.compose.animation.TransitionData r5 = r6.getData$animation_release()
            androidx.compose.animation.Scale r5 = r5.getScale()
            if (r5 == 0) goto L40
        L37:
            long r1 = r5.m26812getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r5 = androidx.compose.p014ui.graphics.TransformOrigin.m31256boximpl(r1)
            goto L6b
        L40:
            androidx.compose.animation.TransitionData r5 = r7.getData$animation_release()
            androidx.compose.animation.Scale r5 = r5.getScale()
            if (r5 == 0) goto L4b
            goto L37
        L4b:
            r5 = r0
            goto L6b
        L4d:
            androidx.compose.animation.TransitionData r5 = r7.getData$animation_release()
            androidx.compose.animation.Scale r5 = r5.getScale()
            if (r5 == 0) goto L60
        L57:
            long r1 = r5.m26812getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r5 = androidx.compose.p014ui.graphics.TransformOrigin.m31256boximpl(r1)
            goto L6b
        L60:
            androidx.compose.animation.TransitionData r5 = r6.getData$animation_release()
            androidx.compose.animation.Scale r5 = r5.getScale()
            if (r5 == 0) goto L4b
            goto L57
        L6b:
            if (r8 == 0) goto L78
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 r0 = new p181hd.InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
                static {
                    /*
                        androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 r0 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1) androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1.INSTANCE androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.C1061x3f929be8.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.C1061x3f929be8.<init>():void");
                }

                @Override // p181hd.InterfaceC9540l
                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.p014ui.graphics.TransformOrigin> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> r3) {
                    /*
                        r2 = this;
                        r3 = 0
                        r0 = 7
                        r1 = 0
                        androidx.compose.animation.core.SpringSpec r3 = androidx.compose.animation.core.AnimationSpecKt.spring$default(r1, r1, r3, r0, r3)
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.C1061x3f929be8.invoke(androidx.compose.animation.core.Transition$Segment):androidx.compose.animation.core.FiniteAnimationSpec");
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    /*
                        r0 = this;
                        androidx.compose.animation.core.Transition$Segment r1 = (androidx.compose.animation.core.Transition.Segment) r1
                        androidx.compose.animation.core.FiniteAnimationSpec r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.C1061x3f929be8.invoke(java.lang.Object):java.lang.Object");
                }
            }
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2
            r1.<init>()
            androidx.compose.runtime.State r0 = r8.animate(r0, r1)
        L78:
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1 r5 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createGraphicsLayerBlock$lambda$13$lambda$12(androidx.compose.animation.core.Transition$DeferredAnimation, androidx.compose.animation.core.Transition$DeferredAnimation, androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, androidx.compose.animation.core.Transition$DeferredAnimation):hd.l");
    }

    @Composable
    public static final Modifier createModifier(Transition<EnterExitState> transition, EnterTransition enterTransition, ExitTransition exitTransition, InterfaceC9529a interfaceC9529a, String str, Composer composer, int i10, int i11) {
        Transition.DeferredAnimation deferredAnimation;
        Transition.DeferredAnimation deferredAnimation2;
        ChangeSize changeSize;
        final InterfaceC9529a interfaceC9529a2 = (i11 & 4) != 0 ? new InterfaceC9529a() { // from class: androidx.compose.animation.EnterExitTransitionKt.createModifier.1
            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        } : interfaceC9529a;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(28261782, i10, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:860)");
        }
        int i12 = i10 & 14;
        EnterTransition enterTransitionTrackActiveEnter = trackActiveEnter(transition, enterTransition, composer, i10 & Opcodes.IAND);
        int i13 = i10 >> 3;
        ExitTransition exitTransitionTrackActiveExit = trackActiveExit(transition, exitTransition, composer, (i13 & 112) | i12);
        boolean z10 = true;
        boolean z11 = (enterTransitionTrackActiveEnter.getData$animation_release().getSlide() == null && exitTransitionTrackActiveExit.getData$animation_release().getSlide() == null) ? false : true;
        boolean z12 = (enterTransitionTrackActiveEnter.getData$animation_release().getChangeSize() == null && exitTransitionTrackActiveExit.getData$animation_release().getChangeSize() == null) ? false : true;
        Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = null;
        if (z11) {
            composer.startReplaceGroup(-821159459);
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = str + " slide";
                composer.updateRememberedValue(objRememberedValue);
            }
            Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter, (String) objRememberedValue, composer, i12 | 384, 0);
            composer.endReplaceGroup();
            deferredAnimation = deferredAnimationCreateDeferredAnimation2;
        } else {
            composer.startReplaceGroup(-821053656);
            composer.endReplaceGroup();
            deferredAnimation = null;
        }
        if (z12) {
            composer.startReplaceGroup(-820961865);
            TwoWayConverter<IntSize, AnimationVector2D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntSize.Companion);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = str + " shrink/expand";
                composer.updateRememberedValue(objRememberedValue2);
            }
            Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation3 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter2, (String) objRememberedValue2, composer, i12 | 384, 0);
            composer.endReplaceGroup();
            deferredAnimation2 = deferredAnimationCreateDeferredAnimation3;
        } else {
            composer.startReplaceGroup(-820851041);
            composer.endReplaceGroup();
            deferredAnimation2 = null;
        }
        if (z12) {
            composer.startReplaceGroup(-820777446);
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter3 = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = str + " InterruptionHandlingOffset";
                composer.updateRememberedValue(objRememberedValue3);
            }
            deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter3, (String) objRememberedValue3, composer, i12 | 384, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-820608001);
            composer.endReplaceGroup();
        }
        ChangeSize changeSize2 = enterTransitionTrackActiveEnter.getData$animation_release().getChangeSize();
        final boolean z13 = ((changeSize2 == null || changeSize2.getClip()) && ((changeSize = exitTransitionTrackActiveExit.getData$animation_release().getChangeSize()) == null || changeSize.getClip()) && z12) ? false : true;
        GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExitCreateGraphicsLayerBlock = createGraphicsLayerBlock(transition, enterTransitionTrackActiveEnter, exitTransitionTrackActiveExit, str, composer, i12 | (i13 & 7168));
        Modifier.Companion companion = Modifier.Companion;
        boolean zChanged = composer.changed(z13);
        if ((((i10 & 7168) ^ 3072) <= 2048 || !composer.changed(interfaceC9529a2)) && (i10 & 3072) != 2048) {
            z10 = false;
        }
        boolean z14 = zChanged | z10;
        Object objRememberedValue4 = composer.rememberedValue();
        if (z14 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((GraphicsLayerScope) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                    graphicsLayerScope.setClip(!z13 && ((Boolean) interfaceC9529a2.invoke()).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Modifier modifierThen = GraphicsLayerModifierKt.graphicsLayer(companion, (InterfaceC9540l) objRememberedValue4).then(new EnterExitTransitionElement(transition, deferredAnimation2, deferredAnimationCreateDeferredAnimation, deferredAnimation, enterTransitionTrackActiveEnter, exitTransitionTrackActiveExit, interfaceC9529a2, graphicsLayerBlockForEnterExitCreateGraphicsLayerBlock));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifierThen;
    }

    @Stable
    public static final EnterTransition expandHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z10, final InterfaceC9540l interfaceC9540l) {
        return expandIn(finiteAnimationSpec, toAlignment(horizontal), z10, new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m33664boximpl(m26791invokemzRDjE0(((IntSize) obj).m33676unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m26791invokemzRDjE0(long j10) {
                return IntSize.m33667constructorimpl((((int) (j10 & 4294967295L)) & 4294967295L) | (((Number) interfaceC9540l.invoke(Integer.valueOf((int) (j10 >> 32)))).intValue() << 32));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m33664boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i10 & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.1
                public final Integer invoke(int i11) {
                    return 0;
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z10, interfaceC9540l);
    }

    @Stable
    public static final EnterTransition expandIn(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z10, InterfaceC9540l interfaceC9540l) {
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, interfaceC9540l, finiteAnimationSpec, z10), null, false, null, 59, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m33664boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i10 & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandIn.1
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return IntSize.m33664boximpl(m26792invokemzRDjE0(((IntSize) obj2).m33676unboximpl()));
                }

                /* renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m26792invokemzRDjE0(long j10) {
                    long j11 = 0;
                    return IntSize.m33667constructorimpl((j11 & 4294967295L) | (j11 << 32));
                }
            };
        }
        return expandIn(finiteAnimationSpec, alignment, z10, interfaceC9540l);
    }

    @Stable
    public static final EnterTransition expandVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z10, final InterfaceC9540l interfaceC9540l) {
        return expandIn(finiteAnimationSpec, toAlignment(vertical), z10, new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m33664boximpl(m26793invokemzRDjE0(((IntSize) obj).m33676unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m26793invokemzRDjE0(long j10) {
                return IntSize.m33667constructorimpl((((Number) interfaceC9540l.invoke(Integer.valueOf((int) (j10 & 4294967295L)))).intValue() & 4294967295L) | (((int) (j10 >> 32)) << 32));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m33664boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i10 & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.1
                public final Integer invoke(int i11) {
                    return 0;
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return expandVertically(finiteAnimationSpec, vertical, z10, interfaceC9540l);
    }

    @Stable
    public static final EnterTransition fadeIn(FiniteAnimationSpec<Float> finiteAnimationSpec, float f10) {
        return new EnterTransitionImpl(new TransitionData(new Fade(f10, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f10);
    }

    @Stable
    public static final ExitTransition fadeOut(FiniteAnimationSpec<Float> finiteAnimationSpec, float f10) {
        return new ExitTransitionImpl(new TransitionData(new Fade(f10, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f10);
    }

    public static final <T extends TransitionEffect> T get(EnterTransition enterTransition, TransitionEffectKey<T> transitionEffectKey) {
        TransitionEffect transitionEffect = enterTransition.getData$animation_release().getEffectsMap().get(transitionEffectKey);
        if (transitionEffect instanceof TransitionEffect) {
            return (T) transitionEffect;
        }
        return null;
    }

    @Stable
    /* renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final EnterTransition m26784scaleInL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f10, long j10) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f10, j10, finiteAnimationSpec, null), false, null, 55, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m26785scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = TransformOrigin.Companion.m31269getCenterSzJe1aQ();
        }
        return m26784scaleInL8ZKhE(finiteAnimationSpec, f10, j10);
    }

    @Stable
    /* renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final ExitTransition m26786scaleOutL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f10, long j10) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f10, j10, finiteAnimationSpec, null), false, null, 55, null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m26787scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = TransformOrigin.Companion.m31269getCenterSzJe1aQ();
        }
        return m26786scaleOutL8ZKhE(finiteAnimationSpec, f10, j10);
    }

    @Stable
    public static final ExitTransition shrinkHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z10, final InterfaceC9540l interfaceC9540l) {
        return shrinkOut(finiteAnimationSpec, toAlignment(horizontal), z10, new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m33664boximpl(m26794invokemzRDjE0(((IntSize) obj).m33676unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m26794invokemzRDjE0(long j10) {
                return IntSize.m33667constructorimpl((((int) (j10 & 4294967295L)) & 4294967295L) | (((Number) interfaceC9540l.invoke(Integer.valueOf((int) (j10 >> 32)))).intValue() << 32));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m33664boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i10 & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.1
                public final Integer invoke(int i11) {
                    return 0;
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z10, interfaceC9540l);
    }

    @Stable
    public static final ExitTransition shrinkOut(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z10, InterfaceC9540l interfaceC9540l) {
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, interfaceC9540l, finiteAnimationSpec, z10), null, false, null, 59, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m33664boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i10 & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkOut.1
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return IntSize.m33664boximpl(m26795invokemzRDjE0(((IntSize) obj2).m33676unboximpl()));
                }

                /* renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m26795invokemzRDjE0(long j10) {
                    long j11 = 0;
                    return IntSize.m33667constructorimpl((j11 & 4294967295L) | (j11 << 32));
                }
            };
        }
        return shrinkOut(finiteAnimationSpec, alignment, z10, interfaceC9540l);
    }

    @Stable
    public static final ExitTransition shrinkVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z10, final InterfaceC9540l interfaceC9540l) {
        return shrinkOut(finiteAnimationSpec, toAlignment(vertical), z10, new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m33664boximpl(m26796invokemzRDjE0(((IntSize) obj).m33676unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m26796invokemzRDjE0(long j10) {
                return IntSize.m33667constructorimpl((((Number) interfaceC9540l.invoke(Integer.valueOf((int) (j10 & 4294967295L)))).intValue() & 4294967295L) | (((int) (j10 >> 32)) << 32));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m33664boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i10 & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.1
                public final Integer invoke(int i11) {
                    return 0;
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z10, interfaceC9540l);
    }

    @Stable
    public static final EnterTransition slideIn(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, InterfaceC9540l interfaceC9540l) {
        return new EnterTransitionImpl(new TransitionData(null, new Slide(interfaceC9540l, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m33620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideIn(finiteAnimationSpec, interfaceC9540l);
    }

    @Stable
    public static final EnterTransition slideInHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final InterfaceC9540l interfaceC9540l) {
        return slideIn(finiteAnimationSpec, new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m33620boximpl(m26797invokemHKZG7I(((IntSize) obj).m33676unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m26797invokemHKZG7I(long j10) {
                return IntOffset.m33623constructorimpl((((Number) interfaceC9540l.invoke(Integer.valueOf((int) (j10 >> 32)))).intValue() << 32) | (0 & 4294967295L));
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m33620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.1
                public final Integer invoke(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return slideInHorizontally(finiteAnimationSpec, interfaceC9540l);
    }

    @Stable
    public static final EnterTransition slideInVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final InterfaceC9540l interfaceC9540l) {
        return slideIn(finiteAnimationSpec, new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m33620boximpl(m26798invokemHKZG7I(((IntSize) obj).m33676unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m26798invokemHKZG7I(long j10) {
                return IntOffset.m33623constructorimpl((((Number) interfaceC9540l.invoke(Integer.valueOf((int) (j10 & 4294967295L)))).intValue() & 4294967295L) | (0 << 32));
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m33620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.1
                public final Integer invoke(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return slideInVertically(finiteAnimationSpec, interfaceC9540l);
    }

    @Stable
    public static final ExitTransition slideOut(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, InterfaceC9540l interfaceC9540l) {
        return new ExitTransitionImpl(new TransitionData(null, new Slide(interfaceC9540l, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m33620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideOut(finiteAnimationSpec, interfaceC9540l);
    }

    @Stable
    public static final ExitTransition slideOutHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final InterfaceC9540l interfaceC9540l) {
        return slideOut(finiteAnimationSpec, new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m33620boximpl(m26799invokemHKZG7I(((IntSize) obj).m33676unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m26799invokemHKZG7I(long j10) {
                return IntOffset.m33623constructorimpl((((Number) interfaceC9540l.invoke(Integer.valueOf((int) (j10 >> 32)))).intValue() << 32) | (0 & 4294967295L));
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m33620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.1
                public final Integer invoke(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return slideOutHorizontally(finiteAnimationSpec, interfaceC9540l);
    }

    @Stable
    public static final ExitTransition slideOutVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final InterfaceC9540l interfaceC9540l) {
        return slideOut(finiteAnimationSpec, new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m33620boximpl(m26800invokemHKZG7I(((IntSize) obj).m33676unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m26800invokemHKZG7I(long j10) {
                return IntOffset.m33623constructorimpl((((Number) interfaceC9540l.invoke(Integer.valueOf((int) (j10 & 4294967295L)))).intValue() & 4294967295L) | (0 << 32));
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m33620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.1
                public final Integer invoke(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return slideOutVertically(finiteAnimationSpec, interfaceC9540l);
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.Companion;
        return AbstractC9979u.m20289b(horizontal, companion.getStart()) ? companion.getCenterStart() : AbstractC9979u.m20289b(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    @Composable
    public static final EnterTransition trackActiveEnter(Transition<EnterExitState> transition, EnterTransition enterTransition, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21614502, i10, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:908)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && composer.changed(transition)) || (i10 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(enterTransition, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(enterTransition);
            } else {
                mutableState.setValue(EnterTransition.Companion.getNone());
            }
        } else if (transition.getTargetState() == EnterExitState.Visible) {
            mutableState.setValue(trackActiveEnter$lambda$5(mutableState).plus(enterTransition));
        }
        EnterTransition enterTransitionTrackActiveEnter$lambda$5 = trackActiveEnter$lambda$5(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterTransitionTrackActiveEnter$lambda$5;
    }

    private static final EnterTransition trackActiveEnter$lambda$5(MutableState<EnterTransition> mutableState) {
        return mutableState.getValue();
    }

    @Composable
    public static final ExitTransition trackActiveExit(Transition<EnterExitState> transition, ExitTransition exitTransition, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1363864804, i10, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:928)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && composer.changed(transition)) || (i10 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(exitTransition, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(exitTransition);
            } else {
                mutableState.setValue(ExitTransition.Companion.getNone());
            }
        } else if (transition.getTargetState() != EnterExitState.Visible) {
            mutableState.setValue(trackActiveExit$lambda$8(mutableState).plus(exitTransition));
        }
        ExitTransition exitTransitionTrackActiveExit$lambda$8 = trackActiveExit$lambda$8(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return exitTransitionTrackActiveExit$lambda$8;
    }

    private static final ExitTransition trackActiveExit$lambda$8(MutableState<ExitTransition> mutableState) {
        return mutableState.getValue();
    }

    public static final EnterTransition withEffect(EnterTransition enterTransition, TransitionEffect transitionEffect) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, null, false, AbstractC10967q0.m24039f(AbstractC10776g.m22975a(transitionEffect.getKey$animation_release(), transitionEffect)), 31, null));
    }

    public static final <T extends TransitionEffect> T get(ExitTransition exitTransition, TransitionEffectKey<T> transitionEffectKey) {
        TransitionEffect transitionEffect = exitTransition.getData$animation_release().getEffectsMap().get(transitionEffectKey);
        if (transitionEffect instanceof TransitionEffect) {
            return (T) transitionEffect;
        }
        return null;
    }

    public static final ExitTransition withEffect(ExitTransition exitTransition, TransitionEffect transitionEffect) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, null, false, AbstractC10967q0.m24039f(AbstractC10776g.m22975a(transitionEffect.getKey$animation_release(), transitionEffect)), 31, null));
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.Companion;
        return AbstractC9979u.m20289b(vertical, companion.getTop()) ? companion.getTopCenter() : AbstractC9979u.m20289b(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }
}
