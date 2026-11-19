package androidx.compose.material3;

import android.view.View;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RectKt;
import androidx.compose.p011ui.graphics.RectHelper_androidKt;
import androidx.compose.p011ui.input.pointer.C2142xe3d9cdbd;
import androidx.compose.p011ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000p\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001aV\u0010\u001f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a)\u0010%\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&\u001a\u0013\u0010'\u001a\u00020 *\u00020\rH\u0002¢\u0006\u0004\b'\u0010(\u001a\u0015\u0010*\u001a\u00020 *\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b*\u0010+\"\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062²\u0006\u0010\u0010/\u001a\u0004\u0018\u00010)8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020#8\n@\nX\u008a\u008e\u0002"}, m5110d2 = {"", "expanded", "Lkotlin/Function1;", "Ld6/s;", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "ExposedDropdownMenuBox", "(ZLr6/c;Landroidx/compose/ui/Modifier;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "Landroid/view/View;", "view", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function0;", "onKeyboardVisibilityChange", "SoftKeyboardListener", "(Landroid/view/View;Landroidx/compose/ui/unit/Density;Lr6/a;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/MenuAnchorType;", "anchorType", "", "expandedDescription", "collapsedDescription", "toggleDescription", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "expandable-Gq7TBQ4", "(Landroidx/compose/ui/Modifier;ZLr6/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Landroidx/compose/ui/Modifier;", "expandable", "Landroidx/compose/ui/geometry/Rect;", "windowBounds", "anchorBounds", "", "verticalMargin", "calculateMaxHeight", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)I", "getWindowBounds", "(Landroid/view/View;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getAnchorBounds", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/Dp;", "ExposedDropdownMenuItemHorizontalPadding", "F", "anchorCoordinates", "anchorWidth", "menuMaxHeight", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1490:1\n77#2:1491\n77#2:1492\n77#2:1493\n77#2:1519\n1#3:1494\n1223#4,6:1495\n1223#4,6:1501\n1223#4,6:1507\n1223#4,6:1513\n1223#4,6:1523\n1223#4,6:1529\n1223#4,6:1535\n1223#4,6:1581\n1223#4,6:1587\n1223#4,6:1593\n1223#4,6:1599\n66#5:1520\n69#5:1521\n72#5:1522\n71#6:1541\n68#6,6:1542\n74#6:1576\n78#6:1580\n78#7,6:1548\n85#7,4:1563\n89#7,2:1573\n93#7:1579\n368#8,9:1554\n377#8:1575\n378#8,2:1577\n4032#9,6:1567\n81#10:1605\n107#10,2:1606\n75#11:1608\n108#11,2:1609\n75#11:1611\n108#11,2:1612\n148#12:1614\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt\n*L\n141#1:1491\n142#1:1492\n143#1:1493\n152#1:1519\n147#1:1495,6\n148#1:1501,6\n149#1:1507,6\n151#1:1513,6\n156#1:1523,6\n159#1:1529,6\n201#1:1535,6\n216#1:1581,6\n226#1:1587,6\n230#1:1593,6\n241#1:1599,6\n153#1:1520\n154#1:1521\n155#1:1522\n200#1:1541\n200#1:1542,6\n200#1:1576\n200#1:1580\n200#1:1548,6\n200#1:1563,4\n200#1:1573,2\n200#1:1579\n200#1:1554,9\n200#1:1575\n200#1:1577,2\n200#1:1567,6\n147#1:1605\n147#1:1606,2\n148#1:1608\n148#1:1609,2\n149#1:1611\n149#1:1612,2\n1489#1:1614\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt {
    private static final float ExposedDropdownMenuItemHorizontalPadding = C2331Dp.m13305constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0238  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ExposedDropdownMenuBox(final boolean r28, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r29, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r30, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(boolean, r6.c, androidx.compose.ui.Modifier, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates ExposedDropdownMenuBox$lambda$2(MutableState<LayoutCoordinates> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void SoftKeyboardListener(final View view, final Density density, final InterfaceC6469a interfaceC6469a, Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1319522472);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(view) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(density) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1319522472, i8, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:237)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(view) | ((i8 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InterfaceC6471c() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                        final ViewOnAttachStateChangeListenerC1657xa756564b viewOnAttachStateChangeListenerC1657xa756564b = new ViewOnAttachStateChangeListenerC1657xa756564b(view, interfaceC6469a);
                        return new DisposableEffectResult() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                viewOnAttachStateChangeListenerC1657xa756564b.dispose();
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(view, density, (InterfaceC6471c) objRememberedValue, composerStartRestartGroup, i8 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt.SoftKeyboardListener.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    ExposedDropdownMenu_androidKt.SoftKeyboardListener(view, density, interfaceC6469a, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateMaxHeight(Rect rect, Rect rect2, int i) {
        if (rect2 == null) {
            return 0;
        }
        float f = i;
        float top2 = rect.getTop() + f;
        float bottom = rect.getBottom() - f;
        return Math.max((rect2.getTop() > rect.getBottom() || rect2.getBottom() < rect.getTop()) ? AbstractC6600a.m6241q(bottom - top2) : AbstractC6600a.m6241q(Math.max(rect2.getTop() - top2, bottom - rect2.getBottom())), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: expandable-Gq7TBQ4, reason: not valid java name */
    public static final Modifier m8488expandableGq7TBQ4(Modifier modifier, final boolean z8, final InterfaceC6469a interfaceC6469a, final String str, final String str2, final String str3, final String str4, final SoftwareKeyboardController softwareKeyboardController) {
        return SemanticsModifierKt.semantics$default(modifier.then(new SuspendPointerInputElement(interfaceC6469a, null, null, new C2142xe3d9cdbd(new ExposedDropdownMenu_androidKt$expandable$1(str, interfaceC6469a, null)), 6, null)), false, new InterfaceC6471c() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (MenuAnchorType.m8620equalsimpl0(str, MenuAnchorType.INSTANCE.m8626getSecondaryEditableMg6Rgbw())) {
                    SemanticsPropertiesKt.m12551setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12532getButtono7Vup1c());
                    SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, z8 ? str2 : str3);
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str4);
                } else {
                    SemanticsPropertiesKt.m12551setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12535getDropdownListo7Vup1c());
                }
                final InterfaceC6469a interfaceC6469a2 = interfaceC6469a;
                final String str5 = str;
                final SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    @NotNull
                    public final Boolean invoke() {
                        SoftwareKeyboardController softwareKeyboardController3;
                        interfaceC6469a2.invoke();
                        if (MenuAnchorType.m8620equalsimpl0(str5, MenuAnchorType.INSTANCE.m8624getPrimaryEditableMg6Rgbw()) && (softwareKeyboardController3 = softwareKeyboardController2) != null) {
                            softwareKeyboardController3.show();
                        }
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getAnchorBounds(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates == null ? Rect.INSTANCE.getZero() : RectKt.m10481Recttz77jQw(LayoutCoordinatesKt.positionInWindow(layoutCoordinates), IntSizeKt.m13488toSizeozmzZPI(layoutCoordinates.mo12041getSizeYbymL2g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getWindowBounds(View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return RectHelper_androidKt.toComposeRect(rect);
    }
}
