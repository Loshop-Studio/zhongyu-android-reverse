package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.DrawModifierKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.ColorProducer;
import androidx.compose.p014ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.painter.Painter;
import androidx.compose.p014ui.layout.LayoutModifierKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.Constraints;
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

/* loaded from: classes2.dex */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m27505size3ABfNKs(Modifier.Companion, IconButtonTokens.INSTANCE.m29904getIconSizeD9Ej5fM());

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    public static final void Icon(final Painter painter, final ColorProducer colorProducer, final String str, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Modifier modifierSemantics$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(1755070997);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(painter) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(colorProducer) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        int i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1755070997, i12, -1, "androidx.compose.material3.Icon (Icon.kt:191)");
            }
            composerStartRestartGroup.startReplaceGroup(-2144829472);
            if (str != null) {
                Modifier.Companion companion = Modifier.Companion;
                boolean z10 = (i12 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.material3.IconKt$Icon$semantics$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C10786q.f26013a;
                        }

                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                            SemanticsPropertiesKt.m32747setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m32732getImageo7Vup1c());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (InterfaceC9540l) objRememberedValue, 1, null);
            } else {
                modifierSemantics$default = Modifier.Companion;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierDefaultSizeForColorProducer = defaultSizeForColorProducer(GraphicsLayerModifierKt.toolingGraphicsLayer(modifier), painter);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(painter) | composerStartRestartGroup.changedInstance(colorProducer);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.material3.IconKt$Icon$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DrawScope) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(DrawScope drawScope) {
                        ColorFilter colorFilterM30919tintxETnrds$default;
                        Painter painter2 = painter;
                        ColorProducer colorProducer2 = colorProducer;
                        long jMo31429getSizeNHjbRc = drawScope.mo31429getSizeNHjbRc();
                        if (colorProducer2 != null) {
                            colorFilterM30919tintxETnrds$default = ColorFilter.Companion.m30919tintxETnrds$default(ColorFilter.Companion, colorProducer2.mo28650invoke0d7_KjU(), 0, 2, null);
                        } else {
                            colorFilterM30919tintxETnrds$default = null;
                        }
                        Painter.m31554drawx_KDEd0$default(painter2, drawScope, jMo31429getSizeNHjbRc, 0.0f, colorFilterM30919tintxETnrds$default, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BoxKt.Box(DrawModifierKt.drawBehind(modifierDefaultSizeForColorProducer, (InterfaceC9540l) objRememberedValue2).then(modifierSemantics$default), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.IconKt.Icon.5
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
                    IconKt.Icon(painter, colorProducer, str, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28746Iconww6aTOc(final androidx.compose.p014ui.graphics.vector.ImageVector r15, final java.lang.String r16, androidx.compose.p014ui.Modifier r17, long r18, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconKt.m28746Iconww6aTOc(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        return modifier.then((Size.m30702equalsimpl0(painter.mo31549getIntrinsicSizeNHjbRc(), Size.Companion.m30714getUnspecifiedNHjbRc()) || m28747isInfiniteuvyYCjk(painter.mo31549getIntrinsicSizeNHjbRc())) ? DefaultIconSizeModifier : Modifier.Companion);
    }

    private static final Modifier defaultSizeForColorProducer(Modifier modifier, Painter painter) {
        Modifier modifierLayout;
        if (Size.m30702equalsimpl0(painter.mo31549getIntrinsicSizeNHjbRc(), Size.Companion.m30714getUnspecifiedNHjbRc()) || m28747isInfiniteuvyYCjk(painter.mo31549getIntrinsicSizeNHjbRc())) {
            modifierLayout = DefaultIconSizeModifier;
        } else {
            long jMo31549getIntrinsicSizeNHjbRc = painter.mo31549getIntrinsicSizeNHjbRc();
            final float fM30706getWidthimpl = Size.m30706getWidthimpl(jMo31549getIntrinsicSizeNHjbRc);
            final float fM30703getHeightimpl = Size.m30703getHeightimpl(jMo31549getIntrinsicSizeNHjbRc);
            modifierLayout = LayoutModifierKt.layout(Modifier.Companion, new InterfaceC9545q() { // from class: androidx.compose.material3.IconKt.defaultSizeForColorProducer.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return m28748invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m33460unboximpl());
                }

                /* renamed from: invoke-3p2s80s, reason: not valid java name */
                public final MeasureResult m28748invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
                    final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.Companion.m33464fixedJhjzzOo((int) fM30706getWidthimpl, (int) fM30703getHeightimpl));
                    return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.material3.IconKt.defaultSizeForColorProducer.1.1
                        {
                            super(1);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return C10786q.f26013a;
                        }

                        public final void invoke(Placeable.PlacementScope placementScope) {
                            Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
                        }
                    }, 4, null);
                }
            });
        }
        return modifier.then(modifierLayout);
    }

    /* renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m28747isInfiniteuvyYCjk(long j10) {
        return Float.isInfinite(Size.m30706getWidthimpl(j10)) && Float.isInfinite(Size.m30703getHeightimpl(j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28744Iconww6aTOc(final androidx.compose.p014ui.graphics.ImageBitmap r17, final java.lang.String r18, androidx.compose.p014ui.Modifier r19, long r20, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconKt.m28744Iconww6aTOc(androidx.compose.ui.graphics.ImageBitmap, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0142  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28745Iconww6aTOc(final androidx.compose.p014ui.graphics.painter.Painter r19, final java.lang.String r20, androidx.compose.p014ui.Modifier r21, long r22, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconKt.m28745Iconww6aTOc(androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }
}
