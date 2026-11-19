package androidx.constraintlayout.compose;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.MotionLayoutScope;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001af\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017H\u0003¢\u0006\u0002\u0010\u001c\u001aP\u0010\u001d\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001e*\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u001f2(\b\u0004\u0010 \u001a\"\u0012\u0013\u0012\u0011H\u001e¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\nH\u0086\b¢\u0006\u0002\u0010$\u001ao\u0010%\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001e*\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u001f2G\b\u0004\u0010 \u001aA\u0012\u0013\u0012\u0011H\u001e¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u001d\u0012\u001b\u0012\b\u0012\u00060'R\u00020(0\u001a¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00010&¢\u0006\u0002\b\nH\u0086\b¢\u0006\u0002\u0010*¨\u0006+²\u0006\n\u0010,\u001a\u00020-X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020/X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\u0003X\u008a\u008e\u0002"}, m13558d2 = {"ItemHolder", "", "i", "", "slotPrefix", "", "showSlot", "", "function", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ILjava/lang/String;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "MotionCarousel", "motionScene", "Landroidx/constraintlayout/compose/MotionScene;", "initialSlotIndex", "numSlots", "backwardTransition", "forwardTransition", "showSlots", "content", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/MotionCarouselScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/constraintlayout/compose/MotionScene;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberStateOfItemsProvider", "Landroidx/compose/runtime/State;", "Landroidx/constraintlayout/compose/MotionItemsProvider;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "items", ExifInterface.GPS_DIRECTION_TRUE, "", "itemContent", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "item", "(Landroidx/constraintlayout/compose/MotionCarouselScope;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V", "itemsWithProperties", "Lkotlin/Function2;", "Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "properties", "(Landroidx/constraintlayout/compose/MotionCarouselScope;Ljava/util/List;Lkotlin/jvm/functions/Function4;)V", "constraintlayout-compose_release", "componentWidth", "", "state", "Landroidx/constraintlayout/compose/CarouselState;", "currentIndex"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMotionCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionCarousel.kt\nandroidx/constraintlayout/compose/MotionCarouselKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,373:1\n1225#2,6:374\n1225#2,6:380\n1225#2,6:386\n1225#2,6:392\n1225#2,6:398\n1225#2,6:404\n1225#2,6:410\n1225#2,6:429\n1225#2,6:492\n249#3:416\n245#3,12:417\n257#3,2:435\n262#3:438\n279#3,10:439\n278#3:449\n290#3:450\n1#4:437\n149#5:451\n149#5:452\n71#6:453\n69#6,5:454\n74#6:487\n78#6:491\n79#7,6:459\n86#7,4:474\n90#7,2:484\n94#7:490\n368#8,9:465\n377#8:486\n378#8,2:488\n4034#9,6:478\n79#10:498\n112#10,2:499\n81#11:501\n107#11,2:502\n78#12:504\n111#12,2:505\n*S KotlinDebug\n*F\n+ 1 MotionCarousel.kt\nandroidx/constraintlayout/compose/MotionCarouselKt\n*L\n156#1:374,6\n160#1:380,6\n163#1:386,6\n178#1:392,6\n194#1:398,6\n205#1:404,6\n231#1:410,6\n216#1:429,6\n310#1:492,6\n216#1:416\n216#1:417,12\n216#1:435,2\n216#1:438\n216#1:439,10\n216#1:449\n216#1:450\n216#1:437\n257#1:451\n258#1:452\n260#1:453\n260#1:454,5\n260#1:487\n260#1:491\n260#1:459,6\n260#1:474,4\n260#1:484,2\n260#1:490\n260#1:465,9\n260#1:486\n260#1:488,2\n260#1:478,6\n156#1:498\n156#1:499,2\n160#1:501\n160#1:502,2\n163#1:504\n163#1:505,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MotionCarouselKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ItemHolder(final int i10, final String str, final boolean z9, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1970516035);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(z9) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1970516035, i12, -1, "androidx.constraintlayout.compose.ItemHolder (MotionCarousel.kt:250)");
            }
            Modifier modifierLayoutId$default = ConstraintLayoutTagKt.layoutId$default(Modifier.INSTANCE, str + i10, null, 2, null);
            if (z9) {
                float f10 = 20;
                modifierLayoutId$default = BorderKt.m17201borderxT4_qwU(ClipKt.clip(modifierLayoutId$default, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f10))), C3127Dp.m23561constructorimpl(2), ColorKt.Color(0, 0, 0, 60), RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f10)));
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 9) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt.ItemHolder.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i13) {
                    MotionCarouselKt.ItemHolder(i10, str, z9, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MotionCarousel(final androidx.constraintlayout.compose.MotionScene r36, final int r37, final int r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, boolean r42, final kotlin.jvm.functions.Function1<? super androidx.constraintlayout.compose.MotionCarouselScope, kotlin.Unit> r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionCarouselKt.MotionCarousel(androidx.constraintlayout.compose.MotionScene, int, int, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CarouselState MotionCarousel$lambda$4(MutableState<CarouselState> mutableState) {
        return mutableState.getValue();
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(MotionCarouselScope motionCarouselScope, final List<? extends T> list, final Function3<? super T, ? super Composer, ? super Integer, Unit> function3) {
        motionCarouselScope.items(list.size(), ComposableLambdaKt.composableLambdaInstance(85623574, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt.items.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer, Integer num2) {
                invoke(num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(int i10, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= composer.changed(i10) ? 4 : 2;
                }
                if ((i11 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(85623574, i11, -1, "androidx.constraintlayout.compose.items.<anonymous> (MotionCarousel.kt:278)");
                }
                function3.invoke(list.get(i10), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsWithProperties(MotionCarouselScope motionCarouselScope, final List<? extends T> list, final Function4<? super T, ? super androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>, ? super Composer, ? super Integer, Unit> function4) {
        motionCarouselScope.itemsWithProperties(list.size(), ComposableLambdaKt.composableLambdaInstance(1304172608, true, new Function4<Integer, androidx.compose.runtime.State<? extends MotionLayoutScope.MotionProperties>, Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt.itemsWithProperties.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, androidx.compose.runtime.State<? extends MotionLayoutScope.MotionProperties> state, Composer composer, Integer num2) {
                invoke(num.intValue(), (androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>) state, composer, num2.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(int i10, androidx.compose.runtime.State<MotionLayoutScope.MotionProperties> state, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.changed(i10) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= composer.changed(state) ? 32 : 16;
                }
                if ((i12 & 147) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1304172608, i12, -1, "androidx.constraintlayout.compose.itemsWithProperties.<anonymous> (MotionCarousel.kt:302)");
                }
                function4.invoke(list.get(i10), state, composer, Integer.valueOf(i12 & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Composable
    private static final androidx.compose.runtime.State<MotionItemsProvider> rememberStateOfItemsProvider(Function1<? super MotionCarouselScope, Unit> function1, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507876322, i10, -1, "androidx.constraintlayout.compose.rememberStateOfItemsProvider (MotionCarousel.kt:307)");
        }
        final androidx.compose.runtime.State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, i10 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<MotionCarouselScopeImpl>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$rememberStateOfItemsProvider$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final MotionCarouselScopeImpl invoke() {
                    MotionCarouselScopeImpl motionCarouselScopeImpl = new MotionCarouselScopeImpl();
                    stateRememberUpdatedState.getValue().invoke(motionCarouselScopeImpl);
                    return motionCarouselScopeImpl;
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        androidx.compose.runtime.State<MotionItemsProvider> state = (androidx.compose.runtime.State) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state;
    }
}
