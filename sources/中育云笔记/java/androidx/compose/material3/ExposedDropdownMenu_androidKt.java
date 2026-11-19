package androidx.compose.material3;

import android.view.View;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RectKt;
import androidx.compose.p014ui.graphics.RectHelper_androidKt;
import androidx.compose.p014ui.input.pointer.C2890xe3d9cdbd;
import androidx.compose.p014ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.platform.SoftwareKeyboardController;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.alibaba.fastjson.asm.Opcodes;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p211jd.AbstractC9719c;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class ExposedDropdownMenu_androidKt {
    private static final float ExposedDropdownMenuItemHorizontalPadding = C3186Dp.m33501constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:104:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
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
    public static final void ExposedDropdownMenuBox(final boolean r28, final p181hd.InterfaceC9540l r29, androidx.compose.p014ui.Modifier r30, final p181hd.InterfaceC9545q r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(boolean, hd.l, androidx.compose.ui.Modifier, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates ExposedDropdownMenuBox$lambda$2(MutableState<LayoutCoordinates> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void SoftKeyboardListener(final View view, final Density density, final InterfaceC9529a interfaceC9529a, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1319522472);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(view) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(density) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1319522472, i11, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:237)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(view) | ((i11 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final ViewOnAttachStateChangeListenerC2177xa756564b viewOnAttachStateChangeListenerC2177xa756564b = new ViewOnAttachStateChangeListenerC2177xa756564b(view, interfaceC9529a);
                        return new DisposableEffectResult() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                viewOnAttachStateChangeListenerC2177xa756564b.dispose();
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(view, density, (InterfaceC9540l) objRememberedValue, composerStartRestartGroup, i11 & Opcodes.IAND);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt.SoftKeyboardListener.2
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
                    ExposedDropdownMenu_androidKt.SoftKeyboardListener(view, density, interfaceC9529a, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateMaxHeight(Rect rect, Rect rect2, int i10) {
        if (rect2 == null) {
            return 0;
        }
        float f10 = i10;
        float top2 = rect.getTop() + f10;
        float bottom = rect.getBottom() - f10;
        return Math.max((rect2.getTop() > rect.getBottom() || rect2.getBottom() < rect.getTop()) ? AbstractC9719c.m19282d(bottom - top2) : AbstractC9719c.m19282d(Math.max(rect2.getTop() - top2, bottom - rect2.getBottom())), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: expandable-Gq7TBQ4, reason: not valid java name */
    public static final Modifier m28684expandableGq7TBQ4(Modifier modifier, final boolean z10, final InterfaceC9529a interfaceC9529a, final String str, final String str2, final String str3, final String str4, final SoftwareKeyboardController softwareKeyboardController) {
        return SemanticsModifierKt.semantics$default(modifier.then(new SuspendPointerInputElement(interfaceC9529a, null, null, new C2890xe3d9cdbd(new ExposedDropdownMenu_androidKt$expandable$1(str, interfaceC9529a, null)), 6, null)), false, new InterfaceC9540l() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$2
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
                if (MenuAnchorType.m28816equalsimpl0(str, MenuAnchorType.Companion.m28822getSecondaryEditableMg6Rgbw())) {
                    SemanticsPropertiesKt.m32747setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m32728getButtono7Vup1c());
                    SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, z10 ? str2 : str3);
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str4);
                } else {
                    SemanticsPropertiesKt.m32747setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m32731getDropdownListo7Vup1c());
                }
                final InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                final String str5 = str;
                final SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new InterfaceC9529a() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final Boolean invoke() {
                        SoftwareKeyboardController softwareKeyboardController3;
                        interfaceC9529a2.invoke();
                        if (MenuAnchorType.m28816equalsimpl0(str5, MenuAnchorType.Companion.m28820getPrimaryEditableMg6Rgbw()) && (softwareKeyboardController3 = softwareKeyboardController2) != null) {
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
        return layoutCoordinates == null ? Rect.Companion.getZero() : RectKt.m30677Recttz77jQw(LayoutCoordinatesKt.positionInWindow(layoutCoordinates), IntSizeKt.m33684toSizeozmzZPI(layoutCoordinates.mo32237getSizeYbymL2g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getWindowBounds(View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return RectHelper_androidKt.toComposeRect(rect);
    }
}
