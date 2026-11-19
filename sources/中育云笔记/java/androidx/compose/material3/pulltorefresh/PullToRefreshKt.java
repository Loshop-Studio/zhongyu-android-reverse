package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.DrawModifierKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.OffsetKt;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RectKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.AndroidPath_androidKt;
import androidx.compose.p014ui.graphics.ClipOp;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p014ui.graphics.GraphicsLayerScope;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.PathFillType;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.drawscope.Stroke;
import androidx.compose.p014ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.google.android.material.internal.ViewUtils;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10409n;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class PullToRefreshKt {
    private static final int CrossfadeDurationMs = 100;
    private static final float DragMultiplier = 0.5f;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float StrokeWidth = C3186Dp.m33501constructorimpl((float) 2.5d);
    private static final float ArcRadius = C3186Dp.m33501constructorimpl((float) 5.5d);
    private static final float SpinnerSize = C3186Dp.m33501constructorimpl(16);
    private static final float SpinnerContainerSize = C3186Dp.m33501constructorimpl(40);
    private static final float ArrowWidth = C3186Dp.m33501constructorimpl(10);
    private static final float ArrowHeight = C3186Dp.m33501constructorimpl(5);
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrowValues ArrowValues(float f10) {
        float fMax = (Math.max(Math.min(1.0f, f10) - 0.4f, 0.0f) * 5) / 3;
        float fM21760m = AbstractC10410o.m21760m(Math.abs(f10) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fM21760m - (((float) Math.pow(fM21760m, 2)) / 4))) * 0.5f;
        float f11 = 360;
        return new ArrowValues(fPow, fPow * f11, ((0.8f * fMax) + fPow) * f11, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CircularArrowProgressIndicator-RPmYEkk, reason: not valid java name */
    public static final void m29605CircularArrowProgressIndicatorRPmYEkk(final InterfaceC9529a interfaceC9529a, final long j10, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-569718810);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(interfaceC9529a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-569718810, i11, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:561)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            Object obj = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                Path Path = AndroidPath_androidKt.Path();
                Path.mo30771setFillTypeoQ8Xj4U(PathFillType.Companion.m31160getEvenOddRgk1Os());
                composerStartRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            final Path path = (Path) obj;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new InterfaceC9529a() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final Float invoke() {
                        return Float.valueOf(((Number) interfaceC9529a.invoke()).floatValue() < 1.0f ? 0.3f : 1.0f);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(CircularArrowProgressIndicator_RPmYEkk$lambda$4((State) objRememberedValue2), AlphaTween, 0.0f, null, null, composerStartRestartGroup, 48, 28);
            Modifier.Companion companion2 = Modifier.Companion;
            int i12 = i11 & 14;
            boolean z10 = i12 == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$1$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((SemanticsPropertyReceiver) obj2);
                        return C10786q.f26013a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) interfaceC9529a.invoke()).floatValue(), AbstractC10409n.m21749b(0.0f, 1.0f), 0));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierM27505size3ABfNKs = SizeKt.m27505size3ABfNKs(SemanticsModifierKt.semantics(companion2, true, (InterfaceC9540l) objRememberedValue3), SpinnerSize);
            boolean zChanged = (i12 == 4) | composerStartRestartGroup.changed(stateAnimateFloatAsState) | ((i11 & 112) == 32) | composerStartRestartGroup.changedInstance(path);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DrawScope) obj2);
                        return C10786q.f26013a;
                    }

                    public final void invoke(DrawScope drawScope) {
                        ArrowValues ArrowValues = PullToRefreshKt.ArrowValues(((Number) interfaceC9529a.invoke()).floatValue());
                        float fFloatValue = stateAnimateFloatAsState.getValue().floatValue();
                        float rotation = ArrowValues.getRotation();
                        long j11 = j10;
                        Path path2 = path;
                        long jMo31428getCenterF1C5BW0 = drawScope.mo31428getCenterF1C5BW0();
                        DrawContext drawContext = drawScope.getDrawContext();
                        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            drawContext.getTransform().mo31356rotateUv8p0NA(rotation, jMo31428getCenterF1C5BW0);
                            Rect rectM30676Rect3MmeM6k = RectKt.m30676Rect3MmeM6k(androidx.compose.p014ui.geometry.SizeKt.m30716getCenteruvyYCjk(drawScope.mo31429getSizeNHjbRc()), drawScope.mo27099toPx0680j_4(PullToRefreshKt.ArcRadius) + (drawScope.mo27099toPx0680j_4(PullToRefreshKt.StrokeWidth) / 2.0f));
                            PullToRefreshKt.m29610drawCircularIndicatorKzyDr3Q(drawScope, j11, fFloatValue, ArrowValues, rectM30676Rect3MmeM6k, PullToRefreshKt.StrokeWidth);
                            PullToRefreshKt.m29609drawArrowuDrxG_w(drawScope, path2, rectM30676Rect3MmeM6k, j11, fFloatValue, ArrowValues, PullToRefreshKt.StrokeWidth);
                        } finally {
                            drawContext.getCanvas().restore();
                            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(interfaceC9540l);
                objRememberedValue4 = interfaceC9540l;
            }
            CanvasKt.Canvas(modifierM27505size3ABfNKs, (InterfaceC9540l) objRememberedValue4, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i13) {
                    PullToRefreshKt.m29605CircularArrowProgressIndicatorRPmYEkk(interfaceC9529a, j10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    private static final float CircularArrowProgressIndicator_RPmYEkk$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0104  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PullToRefreshBox(final boolean r16, final p181hd.InterfaceC9529a r17, androidx.compose.p014ui.Modifier r18, androidx.compose.material3.pulltorefresh.PullToRefreshState r19, androidx.compose.p014ui.Alignment r20, p181hd.InterfaceC9545q r21, final p181hd.InterfaceC9545q r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshKt.PullToRefreshBox(boolean, hd.a, androidx.compose.ui.Modifier, androidx.compose.material3.pulltorefresh.PullToRefreshState, androidx.compose.ui.Alignment, hd.q, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalMaterial3Api
    public static final PullToRefreshState PullToRefreshState() {
        return new PullToRefreshStateImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawArrow-uDrxG_w, reason: not valid java name */
    public static final void m29609drawArrowuDrxG_w(DrawScope drawScope, Path path, Rect rect, long j10, float f10, ArrowValues arrowValues, float f11) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f12 = ArrowWidth;
        path.lineTo((drawScope.mo27099toPx0680j_4(f12) * arrowValues.getScale()) / 2, drawScope.mo27099toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.lineTo(drawScope.mo27099toPx0680j_4(f12) * arrowValues.getScale(), 0.0f);
        path.mo30773translatek4lQ0M(OffsetKt.Offset(((Math.min(rect.getWidth(), rect.getHeight()) / 2.0f) + Offset.m30637getXimpl(rect.m30667getCenterF1C5BW0())) - ((drawScope.mo27099toPx0680j_4(f12) * arrowValues.getScale()) / 2.0f), Offset.m30638getYimpl(rect.m30667getCenterF1C5BW0()) - drawScope.mo27099toPx0680j_4(f11)));
        float endAngle = arrowValues.getEndAngle() - drawScope.mo27099toPx0680j_4(f11);
        long jMo31428getCenterF1C5BW0 = drawScope.mo31428getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31356rotateUv8p0NA(endAngle, jMo31428getCenterF1C5BW0);
            DrawScope.m31419drawPathLG529CI$default(drawScope, path, j10, f10, new Stroke(drawScope.mo27099toPx0680j_4(f11), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicator-KzyDr3Q, reason: not valid java name */
    public static final void m29610drawCircularIndicatorKzyDr3Q(DrawScope drawScope, long j10, float f10, ArrowValues arrowValues, Rect rect, float f11) {
        DrawScope.m31408drawArcyD3GUKo$default(drawScope, j10, arrowValues.getStartAngle(), arrowValues.getEndAngle() - arrowValues.getStartAngle(), false, rect.m30672getTopLeftF1C5BW0(), rect.m30670getSizeNHjbRc(), f10, new Stroke(drawScope.mo27099toPx0680j_4(f11), 0.0f, StrokeCap.Companion.m31231getButtKaPHkGw(), 0, null, 26, null), null, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
    }

    public static final float getSpinnerContainerSize() {
        return SpinnerContainerSize;
    }

    public static final float getSpinnerSize() {
        return SpinnerSize;
    }

    @ExperimentalMaterial3Api
    /* renamed from: pullToRefresh-Z4HSEVQ, reason: not valid java name */
    public static final Modifier m29611pullToRefreshZ4HSEVQ(Modifier modifier, boolean z10, PullToRefreshState pullToRefreshState, boolean z11, float f10, InterfaceC9529a interfaceC9529a) {
        return modifier.then(new PullToRefreshElement(z10, interfaceC9529a, z11, pullToRefreshState, f10, null));
    }

    /* renamed from: pullToRefresh-Z4HSEVQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m29612pullToRefreshZ4HSEVQ$default(Modifier modifier, boolean z10, PullToRefreshState pullToRefreshState, boolean z11, float f10, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 8) != 0) {
            f10 = PullToRefreshDefaults.INSTANCE.m29600getPositionalThresholdD9Ej5fM();
        }
        return m29611pullToRefreshZ4HSEVQ(modifier, z10, pullToRefreshState, z12, f10, interfaceC9529a);
    }

    @ExperimentalMaterial3Api
    /* renamed from: pullToRefreshIndicator-wUdLESc, reason: not valid java name */
    public static final Modifier m29613pullToRefreshIndicatorwUdLESc(Modifier modifier, final PullToRefreshState pullToRefreshState, final boolean z10, final float f10, final Shape shape, long j10, final float f11) {
        return BackgroundKt.m26949backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(SizeKt.m27505size3ABfNKs(modifier, SpinnerContainerSize), new InterfaceC9540l() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                int iM30867getIntersectrtfAjoo = ClipOp.Companion.m30867getIntersectrtfAjoo();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo31353clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iM30867getIntersectrtfAjoo);
                    contentDrawScope.drawContent();
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                }
            }
        }), new InterfaceC9540l() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$2
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
                boolean z11 = pullToRefreshState.getDistanceFraction() > 0.0f || z10;
                graphicsLayerScope.setTranslationY((pullToRefreshState.getDistanceFraction() * graphicsLayerScope.mo27093roundToPx0680j_4(f10)) - Size.m30703getHeightimpl(graphicsLayerScope.mo31064getSizeNHjbRc()));
                graphicsLayerScope.setShadowElevation(z11 ? graphicsLayerScope.mo27099toPx0680j_4(f11) : 0.0f);
                graphicsLayerScope.setShape(shape);
                graphicsLayerScope.setClip(true);
            }
        }), j10, shape);
    }

    /* renamed from: pullToRefreshIndicator-wUdLESc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m29614pullToRefreshIndicatorwUdLESc$default(Modifier modifier, PullToRefreshState pullToRefreshState, boolean z10, float f10, Shape shape, long j10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = PullToRefreshDefaults.INSTANCE.m29600getPositionalThresholdD9Ej5fM();
        }
        float f12 = f10;
        if ((i10 & 8) != 0) {
            shape = PullToRefreshDefaults.INSTANCE.getShape();
        }
        Shape shape2 = shape;
        if ((i10 & 16) != 0) {
            j10 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        return m29613pullToRefreshIndicatorwUdLESc(modifier, pullToRefreshState, z10, f12, shape2, j10, (i10 & 32) != 0 ? PullToRefreshDefaults.INSTANCE.m29599getElevationD9Ej5fM() : f11);
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final PullToRefreshState rememberPullToRefreshState(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(318623070, i10, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:512)");
        }
        PullToRefreshStateImpl pullToRefreshStateImpl = (PullToRefreshStateImpl) RememberSaveableKt.m30420rememberSaveable(new Object[0], (Saver) PullToRefreshStateImpl.Companion.getSaver(), (String) null, (InterfaceC9529a) new InterfaceC9529a() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt.rememberPullToRefreshState.1
            @Override // p181hd.InterfaceC9529a
            public final PullToRefreshStateImpl invoke() {
                return new PullToRefreshStateImpl();
            }
        }, composer, 3072, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pullToRefreshStateImpl;
    }
}
