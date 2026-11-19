package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.CacheDrawScope;
import androidx.compose.p014ui.draw.DrawModifierKt;
import androidx.compose.p014ui.draw.DrawResult;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.ImageBitmap;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawTransform;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class AndroidCursorHandle_androidKt {
    private static final float CursorHandleHeight;
    private static final float CursorHandleWidth;
    private static final float Sqrt2 = 1.4142135f;

    static {
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(25);
        CursorHandleHeight = fM33501constructorimpl;
        CursorHandleWidth = C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(fM33501constructorimpl * 2.0f) / 2.4142137f);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e6  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CursorHandle-USBMPiE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27758CursorHandleUSBMPiE(final androidx.compose.foundation.text.selection.OffsetProvider r8, final androidx.compose.p014ui.Modifier r9, final long r10, androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.AndroidCursorHandle_androidKt.m27758CursorHandleUSBMPiE(androidx.compose.foundation.text.selection.OffsetProvider, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DefaultCursorHandle(final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(694251107);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(694251107, i12, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            SpacerKt.Spacer(drawCursorHandle(SizeKt.m27507sizeVpY3zN4(modifier, CursorHandleWidth, CursorHandleHeight)), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt.DefaultCursorHandle.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i14) {
                    AndroidCursorHandle_androidKt.DefaultCursorHandle(modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    private static final Modifier drawCursorHandle(Modifier modifier) {
        return ComposedModifierKt.composed$default(modifier, null, new InterfaceC9545q() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt.drawCursorHandle.1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(-2126899193);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2126899193, i10, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
                }
                final long jM28309getHandleColor0d7_KjU = ((TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m28309getHandleColor0d7_KjU();
                Modifier.Companion companion = Modifier.Companion;
                boolean zChanged = composer.changed(jM28309getHandleColor0d7_KjU);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                            final float fIntBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.m30491getSizeNHjbRc() >> 32)) / 2.0f;
                            final ImageBitmap imageBitmapCreateHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, fIntBitsToFloat);
                            final ColorFilter colorFilterM30919tintxETnrds$default = ColorFilter.Companion.m30919tintxETnrds$default(ColorFilter.Companion, jM28309getHandleColor0d7_KjU, 0, 2, null);
                            return cacheDrawScope.onDrawWithContent(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1.1
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
                                    float f10 = fIntBitsToFloat;
                                    ImageBitmap imageBitmap = imageBitmapCreateHandleImage;
                                    ColorFilter colorFilter = colorFilterM30919tintxETnrds$default;
                                    DrawContext drawContext = contentDrawScope.getDrawContext();
                                    long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
                                    drawContext.getCanvas().save();
                                    try {
                                        DrawTransform transform = drawContext.getTransform();
                                        DrawTransform.translate$default(transform, f10, 0.0f, 2, null);
                                        transform.mo31356rotateUv8p0NA(45.0f, Offset.Companion.m30653getZeroF1C5BW0());
                                        DrawScope.m31413drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                    } finally {
                                        drawContext.getCanvas().restore();
                                        drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                                    }
                                }
                            });
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierThen = modifier2.then(DrawModifierKt.drawWithCache(companion, (InterfaceC9540l) objRememberedValue));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        }, 1, null);
    }

    public static final float getCursorHandleHeight() {
        return CursorHandleHeight;
    }

    public static final float getCursorHandleWidth() {
        return CursorHandleWidth;
    }
}
