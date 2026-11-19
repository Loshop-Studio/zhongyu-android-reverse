package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.CacheDrawScope;
import androidx.compose.p014ui.draw.DrawModifierKt;
import androidx.compose.p014ui.draw.DrawResult;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.BlendMode;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.CanvasKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.ImageBitmap;
import androidx.compose.p014ui.graphics.ImageBitmapConfig;
import androidx.compose.p014ui.graphics.ImageBitmapKt;
import androidx.compose.p014ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.window.AndroidPopup_androidKt;
import androidx.compose.p014ui.window.PopupProperties;
import androidx.compose.p014ui.window.SecureFlagPolicy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void HandlePopup(final OffsetProvider offsetProvider, final Alignment alignment, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(476043083);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.changed(offsetProvider) : composerStartRestartGroup.changedInstance(offsetProvider) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(alignment) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 256 : 128;
        }
        boolean z10 = false;
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(476043083, i11, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)");
            }
            boolean z11 = (i11 & 112) == 32;
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.changed(offsetProvider))) {
                z10 = true;
            }
            boolean z12 = z11 | z10;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z12 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new HandlePositionProvider(alignment, offsetProvider);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidPopup_androidKt.Popup((HandlePositionProvider) objRememberedValue, null, new PopupProperties(false, false, false, (SecureFlagPolicy) null, true, false, 15, (AbstractC9972n) null), interfaceC9544p, composerStartRestartGroup, ((i11 << 3) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.HandlePopup.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) {
                    AndroidSelectionHandles_androidKt.HandlePopup(offsetProvider, alignment, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: SelectionHandle-wLIcFTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28208SelectionHandlewLIcFTc(final androidx.compose.foundation.text.selection.OffsetProvider r19, final boolean r20, androidx.compose.p014ui.text.style.ResolvedTextDirection r21, boolean r22, long r23, final float r25, final androidx.compose.p014ui.Modifier r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.m28208SelectionHandlewLIcFTc(androidx.compose.foundation.text.selection.OffsetProvider, boolean, androidx.compose.ui.text.style.ResolvedTextDirection, boolean, long, float, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SelectionHandleIcon(final Modifier modifier, final InterfaceC9529a interfaceC9529a, final boolean z10, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(2111672474);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2111672474, i11, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:127)");
            }
            SpacerKt.Spacer(drawSelectionHandle(SizeKt.m27507sizeVpY3zN4(modifier, SelectionHandlesKt.getHandleWidth(), SelectionHandlesKt.getHandleHeight()), interfaceC9529a, z10), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandleIcon.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) {
                    AndroidSelectionHandles_androidKt.SelectionHandleIcon(modifier, interfaceC9529a, z10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    public static final ImageBitmap createHandleImage(CacheDrawScope cacheDrawScope, float f10) {
        int iCeil = ((int) Math.ceil(f10)) * 2;
        HandleImageCache handleImageCache = HandleImageCache.INSTANCE;
        ImageBitmap imageBitmap = handleImageCache.getImageBitmap();
        Canvas canvas = handleImageCache.getCanvas();
        CanvasDrawScope canvasDrawScope = handleImageCache.getCanvasDrawScope();
        if (imageBitmap == null || canvas == null || iCeil > imageBitmap.getWidth() || iCeil > imageBitmap.getHeight()) {
            imageBitmap = ImageBitmapKt.m31103ImageBitmapx__hDU$default(iCeil, iCeil, ImageBitmapConfig.Companion.m31097getAlpha8_sVssgQ(), false, null, 24, null);
            handleImageCache.setImageBitmap(imageBitmap);
            canvas = CanvasKt.Canvas(imageBitmap);
            handleImageCache.setCanvas(canvas);
        }
        ImageBitmap imageBitmap2 = imageBitmap;
        Canvas canvas2 = canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            handleImageCache.setCanvasDrawScope(canvasDrawScope);
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        float width = imageBitmap2.getWidth();
        float height = imageBitmap2.getHeight();
        long jM30697constructorimpl = Size.m30697constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        Canvas canvasComponent3 = drawParams.component3();
        long jM31346component4NHjbRc = drawParams.m31346component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas2);
        drawParams2.m31349setSizeuvyYCjk(jM30697constructorimpl);
        canvas2.save();
        DrawScope.m31423drawRectnJ9OG0$default(canvasDrawScope2, Color.Companion.m30904getBlack0d7_KjU(), 0L, canvasDrawScope2.mo31429getSizeNHjbRc(), 0.0f, null, null, BlendMode.Companion.m30793getClear0nO6VwU(), 58, null);
        DrawScope.m31423drawRectnJ9OG0$default(canvasDrawScope2, ColorKt.Color(4278190080L), Offset.Companion.m30653getZeroF1C5BW0(), Size.m30697constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        DrawScope.m31410drawCircleVaOC9Bg$default(canvasDrawScope2, ColorKt.Color(4278190080L), f10, Offset.m30629constructorimpl((Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        canvas2.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m31349setSizeuvyYCjk(jM31346component4NHjbRc);
        return imageBitmap2;
    }

    public static final Modifier drawSelectionHandle(Modifier modifier, final InterfaceC9529a interfaceC9529a, final boolean z10) {
        return ComposedModifierKt.composed$default(modifier, null, new InterfaceC9545q() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.drawSelectionHandle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(-196777734);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-196777734, i10, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:133)");
                }
                final long jM28309getHandleColor0d7_KjU = ((TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m28309getHandleColor0d7_KjU();
                boolean zChanged = composer.changed(jM28309getHandleColor0d7_KjU) | composer.changed(interfaceC9529a) | composer.changed(z10);
                final InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                final boolean z11 = z10;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                            final ImageBitmap imageBitmapCreateHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, Float.intBitsToFloat((int) (cacheDrawScope.m30491getSizeNHjbRc() >> 32)) / 2.0f);
                            final ColorFilter colorFilterM30919tintxETnrds$default = ColorFilter.Companion.m30919tintxETnrds$default(ColorFilter.Companion, jM28309getHandleColor0d7_KjU, 0, 2, null);
                            final InterfaceC9529a interfaceC9529a3 = interfaceC9529a2;
                            final boolean z12 = z11;
                            return cacheDrawScope.onDrawWithContent(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p181hd.InterfaceC9540l
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((ContentDrawScope) obj);
                                    return C10786q.f26013a;
                                }

                                public final void invoke(ContentDrawScope contentDrawScope) {
                                    contentDrawScope.drawContent();
                                    if (((Boolean) interfaceC9529a3.invoke()).booleanValue()) {
                                        if (!z12) {
                                            DrawScope.m31413drawImagegbVJVH8$default(contentDrawScope, imageBitmapCreateHandleImage, 0L, 0.0f, null, colorFilterM30919tintxETnrds$default, 0, 46, null);
                                            return;
                                        }
                                        ImageBitmap imageBitmap = imageBitmapCreateHandleImage;
                                        ColorFilter colorFilter = colorFilterM30919tintxETnrds$default;
                                        long jMo31428getCenterF1C5BW0 = contentDrawScope.mo31428getCenterF1C5BW0();
                                        DrawContext drawContext = contentDrawScope.getDrawContext();
                                        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
                                        drawContext.getCanvas().save();
                                        try {
                                            drawContext.getTransform().mo31357scale0AR0LA0(-1.0f, 1.0f, jMo31428getCenterF1C5BW0);
                                            DrawScope.m31413drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                        } finally {
                                            drawContext.getCanvas().restore();
                                            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                                        }
                                    }
                                }
                            });
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierDrawWithCache = DrawModifierKt.drawWithCache(modifier2, (InterfaceC9540l) objRememberedValue);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierDrawWithCache;
            }
        }, 1, null);
    }
}
