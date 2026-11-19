package p091k3;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p009ui.Alignment;
import androidx.compose.p009ui.ComposedModifierKt;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.layout.MeasurePolicy;
import androidx.compose.p009ui.node.ComposeUiNode;
import androidx.compose.p009ui.res.StringResources_androidKt;
import androidx.compose.p009ui.text.TextLayoutResult;
import androidx.compose.p009ui.text.TextStyle;
import androidx.compose.p009ui.text.font.FontFamily;
import androidx.compose.p009ui.text.font.FontStyle;
import androidx.compose.p009ui.text.font.FontWeight;
import androidx.compose.p009ui.text.style.TextAlign;
import androidx.compose.p009ui.text.style.TextDecoration;
import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.zykj.gallery.R$drawable;
import com.zykj.gallery.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p114n3.AbstractC7460a;
import p121o3.AbstractC7518a;

/* renamed from: k3.m0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6655m0 {
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7652i(final long r29, final java.lang.String r31, kotlin.jvm.functions.Function0 r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p091k3.AbstractC6655m0.m7652i(long, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: j */
    public static final Unit m7653j() {
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m7654k(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m7655l(long j6, String str, Function0 function0, int i6, int i7, Composer composer, int i8) {
        m7652i(j6, str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1), i7);
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final void m7656m(final AbstractC6667s0 state, final Function0 onDeleteClick, final Function0 onReceiverClick, final Function0 onBackClick, Composer composer, final int i6) {
        int i7;
        int i8;
        Modifier.Companion companion;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Intrinsics.checkNotNullParameter(onReceiverClick, "onReceiverClick");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-443395812);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onDeleteClick) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onReceiverClick) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onBackClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 1171) != 1170, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-443395812, i7, -1, "com.zykj.gallery.ui.gallery.screenList.GalleryTitleBar (GalleryTitleBar.kt:30)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m10637height3ABfNKs(companion2, C2452Dp.m16484constructorimpl((48 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion3.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM13341constructorimpl = Updater.m13341constructorimpl(composerStartRestartGroup);
            Updater.m13348setimpl(composerM13341constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM13341constructorimpl.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM13341constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM13341constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m13348setimpl(composerM13341constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getBottom(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM13341constructorimpl2 = Updater.m13341constructorimpl(composerStartRestartGroup);
            Updater.m13348setimpl(composerM13341constructorimpl2, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM13341constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM13341constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM13341constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m13348setimpl(composerM13341constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            boolean z6 = (i7 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: k3.e0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6655m0.m7658o(onBackClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM10147clickableXHw0xAI$default = ClickableKt.m10147clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue, 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM10147clickableXHw0xAI$default);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM13341constructorimpl3 = Updater.m13341constructorimpl(composerStartRestartGroup);
            Updater.m13348setimpl(composerM13341constructorimpl3, measurePolicyRowMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM13341constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM13341constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM13341constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m13348setimpl(composerM13341constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            if (state.mo7676i()) {
                composerStartRestartGroup.startReplaceGroup(-1129773308);
                m7661r(R$drawable.gallery_icon_back, composerStartRestartGroup, 0, 0);
                float f7 = 10 / f6;
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                i10 = 1;
                companion = companion2;
                i9 = 0;
                i8 = i7;
                TextKt.m12353Text4IGK_g(state.mo7672e(), PaddingKt.m10606paddingVpY3zN4$default(companion2, C2452Dp.m16484constructorimpl(f7 * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null), AbstractC7460a.m8505b(), AbstractC7518a.m8673a(20), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3504, 0, 131056);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                i8 = i7;
                companion = companion2;
                i9 = 0;
                i10 = 1;
                composerStartRestartGroup.startReplaceGroup(-1131443526);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (state.mo7675h()) {
                composerStartRestartGroup.startReplaceGroup(-1998583119);
                Composer composer2 = composerStartRestartGroup;
                TextKt.m12353Text4IGK_g(state.mo7671d(), (Modifier) null, AbstractC7460a.m8506c(), AbstractC7518a.m8673a(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 0, 131058);
                composerStartRestartGroup = composer2;
            } else {
                composerStartRestartGroup.startReplaceGroup(-2000636962);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, i9);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM13341constructorimpl4 = Updater.m13341constructorimpl(composerStartRestartGroup);
            Updater.m13348setimpl(composerM13341constructorimpl4, measurePolicyRowMeasurePolicy4, companion4.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM13341constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM13341constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM13341constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m13348setimpl(composerM13341constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            if (state.mo7674g()) {
                composerStartRestartGroup.startReplaceGroup(-512714738);
                long jMo7669b = state.mo7669b();
                String strStringResource = StringResources_androidKt.stringResource(R$string.receiver, composerStartRestartGroup, i9);
                int i11 = ((i8 & 896) == 256 ? i10 : i9) | ((i8 & 14) == 4 ? i10 : i9);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i11 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: k3.f0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC6655m0.m7659p(state, onReceiverClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                m7652i(jMo7669b, strStringResource, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-515008025);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (state.mo7673f()) {
                composerStartRestartGroup.startReplaceGroup(-512367414);
                long jMo7669b2 = state.mo7669b();
                String strMo7668a = state.mo7668a();
                int i12 = (i8 & 14) == 4 ? i10 : i9;
                if ((i8 & 112) != 32) {
                    i10 = i9;
                }
                int i13 = i12 | i10;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (i13 != 0 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: k3.g0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC6655m0.m7660q(state, onDeleteClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                m7652i(jMo7669b2, strMo7668a, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-515008025);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: k3.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6655m0.m7657n(state, onDeleteClick, onReceiverClick, onBackClick, i6, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: n */
    public static final Unit m7657n(AbstractC6667s0 abstractC6667s0, Function0 function0, Function0 function02, Function0 function03, int i6, Composer composer, int i7) {
        m7656m(abstractC6667s0, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m7658o(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final Unit m7659p(AbstractC6667s0 abstractC6667s0, Function0 function0) {
        if (abstractC6667s0.mo7670c()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final Unit m7660q(AbstractC6667s0 abstractC6667s0, Function0 function0) {
        if (abstractC6667s0.mo7670c()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7661r(final int r11, androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            r0 = 2090725701(0x7c9df145, float:6.560673E36)
            androidx.compose.runtime.Composer r8 = r12.startRestartGroup(r0)
            r12 = r13 & 6
            r1 = 2
            if (r12 != 0) goto L1b
            r12 = r14 & 1
            if (r12 != 0) goto L18
            boolean r12 = r8.changed(r11)
            if (r12 == 0) goto L18
            r12 = 4
            goto L19
        L18:
            r12 = r1
        L19:
            r12 = r12 | r13
            goto L1c
        L1b:
            r12 = r13
        L1c:
            r2 = r12 & 3
            if (r2 == r1) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = 0
        L23:
            r2 = r12 & 1
            boolean r1 = r8.shouldExecute(r1, r2)
            if (r1 == 0) goto La4
            r8.startDefaults()
            r1 = r13 & 1
            if (r1 == 0) goto L43
            boolean r1 = r8.getDefaultsInvalid()
            if (r1 == 0) goto L39
            goto L43
        L39:
            r8.skipToGroupEnd()
            r1 = r14 & 1
            if (r1 == 0) goto L4a
        L40:
            r12 = r12 & (-15)
            goto L4a
        L43:
            r1 = r14 & 1
            if (r1 == 0) goto L4a
            int r11 = com.zykj.gallery.R$drawable.gallery_icon_back
            goto L40
        L4a:
            r8.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L59
            r1 = -1
            java.lang.String r2 = "com.zykj.gallery.ui.gallery.screenList.LeftIcon (GalleryTitleBar.kt:104)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r12, r1, r2)
        L59:
            r12 = r12 & 14
            androidx.compose.ui.graphics.painter.Painter r1 = androidx.compose.p009ui.res.PainterResources_androidKt.painterResource(r11, r8, r12)
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.p009ui.Modifier.INSTANCE
            r0 = 24
            float r0 = (float) r0
            r2 = 1280(0x500, float:1.794E-42)
            float r2 = (float) r2
            float r0 = r0 / r2
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r3 = r2.widthPixels
            int r2 = r2.heightPixels
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast(r3, r2)
            float r2 = (float) r2
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 / r3
            float r0 = r0 * r2
            float r0 = androidx.compose.p009ui.unit.C2452Dp.m16484constructorimpl(r0)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.m10651size3ABfNKs(r12, r0)
            r9 = 432(0x1b0, float:6.05E-43)
            r10 = 120(0x78, float:1.68E-43)
            java.lang.String r2 = "返回"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            androidx.compose.foundation.ImageKt.Image(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto La7
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto La7
        La4:
            r8.skipToGroupEnd()
        La7:
            androidx.compose.runtime.ScopeUpdateScope r12 = r8.endRestartGroup()
            if (r12 == 0) goto Lb5
            k3.l0 r0 = new k3.l0
            r0.<init>()
            r12.updateScope(r0)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p091k3.AbstractC6655m0.m7661r(int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: s */
    public static final Unit m7662s(int i6, int i7, int i8, Composer composer, int i9) {
        m7661r(i6, composer, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i8);
        return Unit.INSTANCE;
    }
}
