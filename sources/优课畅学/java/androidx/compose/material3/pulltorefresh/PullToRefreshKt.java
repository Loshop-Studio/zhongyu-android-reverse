package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.DrawModifierKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RectKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.ClipOp;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.PathFillType;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.drawscope.Stroke;
import androidx.compose.p013ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.unit.C3156Dp;
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
import com.tencent.smtt.sdk.TbsListener;
import p077d8.AbstractC8322g;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class PullToRefreshKt {
    private static final int CrossfadeDurationMs = 100;
    private static final float DragMultiplier = 0.5f;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float StrokeWidth = C3156Dp.m26899constructorimpl((float) 2.5d);
    private static final float ArcRadius = C3156Dp.m26899constructorimpl((float) 5.5d);
    private static final float SpinnerSize = C3156Dp.m26899constructorimpl(16);
    private static final float SpinnerContainerSize = C3156Dp.m26899constructorimpl(40);
    private static final float ArrowWidth = C3156Dp.m26899constructorimpl(10);
    private static final float ArrowHeight = C3156Dp.m26899constructorimpl(5);
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrowValues ArrowValues(float f10) {
        float fMax = (Math.max(Math.min(1.0f, f10) - 0.4f, 0.0f) * 5) / 3;
        float fM13517l = AbstractC8323h.m13517l(Math.abs(f10) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fM13517l - (((float) Math.pow(fM13517l, 2)) / 4))) * 0.5f;
        float f11 = 360;
        return new ArrowValues(fPow, fPow * f11, ((0.8f * fMax) + fPow) * f11, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CircularArrowProgressIndicator-RPmYEkk, reason: not valid java name */
    public static final void m23003CircularArrowProgressIndicatorRPmYEkk(final InterfaceC10559a interfaceC10559a, final long j10, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-569718810);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(interfaceC10559a) ? 4 : 2) | i10;
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
                Path.mo24169setFillTypeoQ8Xj4U(PathFillType.Companion.m24558getEvenOddRgk1Os());
                composerStartRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            final Path path = (Path) obj;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new InterfaceC10559a() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public final Float invoke() {
                        return Float.valueOf(((Number) interfaceC10559a.invoke()).floatValue() < 1.0f ? 0.3f : 1.0f);
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
                objRememberedValue3 = new InterfaceC10570l() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$1$1
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((SemanticsPropertyReceiver) obj2);
                        return C8736p.f16368a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) interfaceC10559a.invoke()).floatValue(), AbstractC8322g.m13507b(0.0f, 1.0f), 0));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierM20903size3ABfNKs = SizeKt.m20903size3ABfNKs(SemanticsModifierKt.semantics(companion2, true, (InterfaceC10570l) objRememberedValue3), SpinnerSize);
            boolean zChanged = (i12 == 4) | composerStartRestartGroup.changed(stateAnimateFloatAsState) | ((i11 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) == 32) | composerStartRestartGroup.changedInstance(path);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DrawScope) obj2);
                        return C8736p.f16368a;
                    }

                    public final void invoke(DrawScope drawScope) {
                        ArrowValues ArrowValues = PullToRefreshKt.ArrowValues(((Number) interfaceC10559a.invoke()).floatValue());
                        float fFloatValue = stateAnimateFloatAsState.getValue().floatValue();
                        float rotation = ArrowValues.getRotation();
                        long j11 = j10;
                        Path path2 = path;
                        long jMo24826getCenterF1C5BW0 = drawScope.mo24826getCenterF1C5BW0();
                        DrawContext drawContext = drawScope.getDrawContext();
                        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            drawContext.getTransform().mo24754rotateUv8p0NA(rotation, jMo24826getCenterF1C5BW0);
                            Rect rectM24074Rect3MmeM6k = RectKt.m24074Rect3MmeM6k(androidx.compose.p013ui.geometry.SizeKt.m24114getCenteruvyYCjk(drawScope.mo24827getSizeNHjbRc()), drawScope.mo20497toPx0680j_4(PullToRefreshKt.ArcRadius) + (drawScope.mo20497toPx0680j_4(PullToRefreshKt.StrokeWidth) / 2.0f));
                            PullToRefreshKt.m23008drawCircularIndicatorKzyDr3Q(drawScope, j11, fFloatValue, ArrowValues, rectM24074Rect3MmeM6k, PullToRefreshKt.StrokeWidth);
                            PullToRefreshKt.m23007drawArrowuDrxG_w(drawScope, path2, rectM24074Rect3MmeM6k, j11, fFloatValue, ArrowValues, PullToRefreshKt.StrokeWidth);
                        } finally {
                            drawContext.getCanvas().restore();
                            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(interfaceC10570l);
                objRememberedValue4 = interfaceC10570l;
            }
            CanvasKt.Canvas(modifierM20903size3ABfNKs, (InterfaceC10570l) objRememberedValue4, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer2, int i13) {
                    PullToRefreshKt.m23003CircularArrowProgressIndicatorRPmYEkk(interfaceC10559a, j10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
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
    public static final void PullToRefreshBox(final boolean r16, final p300x7.InterfaceC10559a r17, androidx.compose.p013ui.Modifier r18, androidx.compose.material3.pulltorefresh.PullToRefreshState r19, androidx.compose.p013ui.Alignment r20, p300x7.InterfaceC10575q r21, final p300x7.InterfaceC10575q r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshKt.PullToRefreshBox(boolean, x7.a, androidx.compose.ui.Modifier, androidx.compose.material3.pulltorefresh.PullToRefreshState, androidx.compose.ui.Alignment, x7.q, x7.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalMaterial3Api
    public static final PullToRefreshState PullToRefreshState() {
        return new PullToRefreshStateImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawArrow-uDrxG_w, reason: not valid java name */
    public static final void m23007drawArrowuDrxG_w(DrawScope drawScope, Path path, Rect rect, long j10, float f10, ArrowValues arrowValues, float f11) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f12 = ArrowWidth;
        path.lineTo((drawScope.mo20497toPx0680j_4(f12) * arrowValues.getScale()) / 2, drawScope.mo20497toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.lineTo(drawScope.mo20497toPx0680j_4(f12) * arrowValues.getScale(), 0.0f);
        path.mo24171translatek4lQ0M(OffsetKt.Offset(((Math.min(rect.getWidth(), rect.getHeight()) / 2.0f) + Offset.m24035getXimpl(rect.m24065getCenterF1C5BW0())) - ((drawScope.mo20497toPx0680j_4(f12) * arrowValues.getScale()) / 2.0f), Offset.m24036getYimpl(rect.m24065getCenterF1C5BW0()) - drawScope.mo20497toPx0680j_4(f11)));
        float endAngle = arrowValues.getEndAngle() - drawScope.mo20497toPx0680j_4(f11);
        long jMo24826getCenterF1C5BW0 = drawScope.mo24826getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24754rotateUv8p0NA(endAngle, jMo24826getCenterF1C5BW0);
            DrawScope.m24817drawPathLG529CI$default(drawScope, path, j10, f10, new Stroke(drawScope.mo20497toPx0680j_4(f11), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicator-KzyDr3Q, reason: not valid java name */
    public static final void m23008drawCircularIndicatorKzyDr3Q(DrawScope drawScope, long j10, float f10, ArrowValues arrowValues, Rect rect, float f11) {
        DrawScope.m24806drawArcyD3GUKo$default(drawScope, j10, arrowValues.getStartAngle(), arrowValues.getEndAngle() - arrowValues.getStartAngle(), false, rect.m24070getTopLeftF1C5BW0(), rect.m24068getSizeNHjbRc(), f10, new Stroke(drawScope.mo20497toPx0680j_4(f11), 0.0f, StrokeCap.Companion.m24629getButtKaPHkGw(), 0, null, 26, null), null, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
    }

    public static final float getSpinnerContainerSize() {
        return SpinnerContainerSize;
    }

    public static final float getSpinnerSize() {
        return SpinnerSize;
    }

    @ExperimentalMaterial3Api
    /* renamed from: pullToRefresh-Z4HSEVQ, reason: not valid java name */
    public static final Modifier m23009pullToRefreshZ4HSEVQ(Modifier modifier, boolean z10, PullToRefreshState pullToRefreshState, boolean z11, float f10, InterfaceC10559a interfaceC10559a) {
        return modifier.then(new PullToRefreshElement(z10, interfaceC10559a, z11, pullToRefreshState, f10, null));
    }

    /* renamed from: pullToRefresh-Z4HSEVQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m23010pullToRefreshZ4HSEVQ$default(Modifier modifier, boolean z10, PullToRefreshState pullToRefreshState, boolean z11, float f10, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 8) != 0) {
            f10 = PullToRefreshDefaults.INSTANCE.m22998getPositionalThresholdD9Ej5fM();
        }
        return m23009pullToRefreshZ4HSEVQ(modifier, z10, pullToRefreshState, z12, f10, interfaceC10559a);
    }

    @ExperimentalMaterial3Api
    /* renamed from: pullToRefreshIndicator-wUdLESc, reason: not valid java name */
    public static final Modifier m23011pullToRefreshIndicatorwUdLESc(Modifier modifier, final PullToRefreshState pullToRefreshState, final boolean z10, final float f10, final Shape shape, long j10, final float f11) {
        return BackgroundKt.m20347backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(SizeKt.m20903size3ABfNKs(modifier, SpinnerContainerSize), new InterfaceC10570l() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$1
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                int iM24265getIntersectrtfAjoo = ClipOp.Companion.m24265getIntersectrtfAjoo();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo24751clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iM24265getIntersectrtfAjoo);
                    contentDrawScope.drawContent();
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
                }
            }
        }), new InterfaceC10570l() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                boolean z11 = pullToRefreshState.getDistanceFraction() > 0.0f || z10;
                graphicsLayerScope.setTranslationY((pullToRefreshState.getDistanceFraction() * graphicsLayerScope.mo20491roundToPx0680j_4(f10)) - Size.m24101getHeightimpl(graphicsLayerScope.mo24462getSizeNHjbRc()));
                graphicsLayerScope.setShadowElevation(z11 ? graphicsLayerScope.mo20497toPx0680j_4(f11) : 0.0f);
                graphicsLayerScope.setShape(shape);
                graphicsLayerScope.setClip(true);
            }
        }), j10, shape);
    }

    /* renamed from: pullToRefreshIndicator-wUdLESc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m23012pullToRefreshIndicatorwUdLESc$default(Modifier modifier, PullToRefreshState pullToRefreshState, boolean z10, float f10, Shape shape, long j10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = PullToRefreshDefaults.INSTANCE.m22998getPositionalThresholdD9Ej5fM();
        }
        float f12 = f10;
        if ((i10 & 8) != 0) {
            shape = PullToRefreshDefaults.INSTANCE.getShape();
        }
        Shape shape2 = shape;
        if ((i10 & 16) != 0) {
            j10 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        return m23011pullToRefreshIndicatorwUdLESc(modifier, pullToRefreshState, z10, f12, shape2, j10, (i10 & 32) != 0 ? PullToRefreshDefaults.INSTANCE.m22997getElevationD9Ej5fM() : f11);
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final PullToRefreshState rememberPullToRefreshState(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(318623070, i10, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:512)");
        }
        PullToRefreshStateImpl pullToRefreshStateImpl = (PullToRefreshStateImpl) RememberSaveableKt.m23818rememberSaveable(new Object[0], (Saver) PullToRefreshStateImpl.Companion.getSaver(), (String) null, (InterfaceC10559a) new InterfaceC10559a() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt.rememberPullToRefreshState.1
            @Override // p300x7.InterfaceC10559a
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
