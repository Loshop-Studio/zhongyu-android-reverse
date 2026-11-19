package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.p014ui.text.style.ResolvedTextDirection;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.DpKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    private static final TextFieldDecorator DefaultTextFieldDecorator = new TextFieldDecorator() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$DefaultTextFieldDecorator$1
        @Override // androidx.compose.foundation.text.input.TextFieldDecorator
        @Composable
        @ComposableInferredTarget(scheme = "[0[0]]")
        public final void Decoration(InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
            composer.startReplaceGroup(-1669748801);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1669748801, i10, -1, "androidx.compose.foundation.text.DefaultTextFieldDecorator.<no name provided>.Decoration (BasicTextField.kt:582)");
            }
            interfaceC9544p.invoke(composer, Integer.valueOf(i10 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
        }
    };
    private static final long MinTouchTargetSizeForHandles;

    static {
        float f10 = 40;
        MinTouchTargetSizeForHandles = DpKt.m33523DpSizeYgX7TsA(C3186Dp.m33501constructorimpl(f10), C3186Dp.m33501constructorimpl(f10));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final androidx.compose.foundation.text.input.TextFieldState r36, androidx.compose.p014ui.Modifier r37, boolean r38, boolean r39, androidx.compose.foundation.text.input.InputTransformation r40, androidx.compose.p014ui.text.TextStyle r41, androidx.compose.foundation.text.KeyboardOptions r42, androidx.compose.foundation.text.input.KeyboardActionHandler r43, androidx.compose.foundation.text.input.TextFieldLineLimits r44, p181hd.InterfaceC9544p r45, androidx.compose.foundation.interaction.MutableInteractionSource r46, androidx.compose.p014ui.graphics.Brush r47, androidx.compose.foundation.text.input.OutputTransformation r48, androidx.compose.foundation.text.input.TextFieldDecorator r49, androidx.compose.foundation.ScrollState r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, hd.p, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.input.TextFieldDecorator, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$24(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$28(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldCursorHandle(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1991581797);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1991581797, i11, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:501)");
            }
            boolean zChanged = composerStartRestartGroup.changed(textFieldSelectionState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2$1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.getCursorHandleState$foundation_release(false);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            if (TextFieldCursorHandle$lambda$12((State) objRememberedValue).getVisible()) {
                composerStartRestartGroup.startReplaceGroup(-311835217);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0, reason: not valid java name */
                        public final long mo27772provideF1C5BW0() {
                            return textFieldSelectionState.getCursorHandleState$foundation_release(true).m28109getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) objRememberedValue2;
                Modifier.Companion companion = Modifier.Companion;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$2$1
                        @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            Object objCursorHandleGestures = textFieldSelectionState.cursorHandleGestures(pointerInputScope, interfaceC11588c);
                            return objCursorHandleGestures == AbstractC11725a.m25952f() ? objCursorHandleGestures : C10786q.f26013a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                AndroidCursorHandle_androidKt.m27758CursorHandleUSBMPiE(offsetProvider, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (PointerInputEventHandler) objRememberedValue3), MinTouchTargetSizeForHandles, composerStartRestartGroup, 384, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-311451778);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.TextFieldCursorHandle.3
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
                    BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    private static final TextFieldHandleState TextFieldCursorHandle$lambda$12(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldSelectionHandles(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(2025287684);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025287684, i11, -1, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:522)");
            }
            boolean zChanged = composerStartRestartGroup.changed(textFieldSelectionState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.getSelectionHandleState$foundation_release(true, false);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            State state = (State) objRememberedValue;
            if (TextFieldSelectionHandles$lambda$16(state).getVisible()) {
                composerStartRestartGroup.startReplaceGroup(-1348660553);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo27772provideF1C5BW0() {
                            return textFieldSelectionState.getSelectionHandleState$foundation_release(true, true).m28109getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) objRememberedValue2;
                ResolvedTextDirection direction = TextFieldSelectionHandles$lambda$16(state).getDirection();
                boolean handlesCrossed = TextFieldSelectionHandles$lambda$16(state).getHandlesCrossed();
                Modifier.Companion companion = Modifier.Companion;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$2$1
                        @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            Object objSelectionHandleGestures = textFieldSelectionState.selectionHandleGestures(pointerInputScope, true, interfaceC11588c);
                            return objSelectionHandleGestures == AbstractC11725a.m25952f() ? objSelectionHandleGestures : C10786q.f26013a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                AndroidSelectionHandles_androidKt.m28208SelectionHandlewLIcFTc(offsetProvider, true, direction, handlesCrossed, MinTouchTargetSizeForHandles, TextFieldSelectionHandles$lambda$16(state).getLineHeight(), SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (PointerInputEventHandler) objRememberedValue3), composerStartRestartGroup, 24624, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1348008995);
                composerStartRestartGroup.endReplaceGroup();
            }
            boolean zChanged2 = composerStartRestartGroup.changed(textFieldSelectionState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.derivedStateOf(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.getSelectionHandleState$foundation_release(false, false);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            State state2 = (State) objRememberedValue4;
            if (TextFieldSelectionHandles$lambda$20(state2).getVisible()) {
                composerStartRestartGroup.startReplaceGroup(-1347616070);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo27772provideF1C5BW0() {
                            return textFieldSelectionState.getSelectionHandleState$foundation_release(false, true).m28109getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                OffsetProvider offsetProvider2 = (OffsetProvider) objRememberedValue5;
                ResolvedTextDirection direction2 = TextFieldSelectionHandles$lambda$20(state2).getDirection();
                boolean handlesCrossed2 = TextFieldSelectionHandles$lambda$20(state2).getHandlesCrossed();
                Modifier.Companion companion2 = Modifier.Companion;
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                    objRememberedValue6 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$4$1
                        @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            Object objSelectionHandleGestures = textFieldSelectionState.selectionHandleGestures(pointerInputScope, false, interfaceC11588c);
                            return objSelectionHandleGestures == AbstractC11725a.m25952f() ? objSelectionHandleGestures : C10786q.f26013a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                AndroidSelectionHandles_androidKt.m28208SelectionHandlewLIcFTc(offsetProvider2, false, direction2, handlesCrossed2, MinTouchTargetSizeForHandles, TextFieldSelectionHandles$lambda$20(state2).getLineHeight(), SuspendingPointerInputFilterKt.pointerInput(companion2, textFieldSelectionState, (PointerInputEventHandler) objRememberedValue6), composerStartRestartGroup, 24624, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1346967395);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.TextFieldSelectionHandles.5
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
                    BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$16(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$20(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:390:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final androidx.compose.foundation.text.input.TextFieldState r52, androidx.compose.p014ui.Modifier r53, boolean r54, boolean r55, androidx.compose.foundation.text.input.InputTransformation r56, androidx.compose.p014ui.text.TextStyle r57, androidx.compose.foundation.text.KeyboardOptions r58, androidx.compose.foundation.text.input.KeyboardActionHandler r59, androidx.compose.foundation.text.input.TextFieldLineLimits r60, p181hd.InterfaceC9544p r61, androidx.compose.foundation.interaction.MutableInteractionSource r62, androidx.compose.p014ui.graphics.Brush r63, androidx.compose.foundation.text.input.internal.CodepointTransformation r64, androidx.compose.foundation.text.input.OutputTransformation r65, androidx.compose.foundation.text.input.TextFieldDecorator r66, androidx.compose.foundation.ScrollState r67, boolean r68, androidx.compose.runtime.Composer r69, final int r70, final int r71, final int r72) {
        /*
            Method dump skipped, instructions count: 1849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, hd.p, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.internal.CodepointTransformation, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.input.TextFieldDecorator, androidx.compose.foundation.ScrollState, boolean, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final java.lang.String r37, final p181hd.InterfaceC9540l r38, androidx.compose.p014ui.Modifier r39, boolean r40, boolean r41, androidx.compose.p014ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, int r47, androidx.compose.p014ui.text.input.VisualTransformation r48, p181hd.InterfaceC9540l r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.p014ui.graphics.Brush r51, p181hd.InterfaceC9545q r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, hd.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, hd.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, hd.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final androidx.compose.p014ui.text.input.TextFieldValue r38, final p181hd.InterfaceC9540l r39, androidx.compose.p014ui.Modifier r40, boolean r41, boolean r42, androidx.compose.p014ui.text.TextStyle r43, androidx.compose.foundation.text.KeyboardOptions r44, androidx.compose.foundation.text.KeyboardActions r45, boolean r46, int r47, int r48, androidx.compose.p014ui.text.input.VisualTransformation r49, p181hd.InterfaceC9540l r50, androidx.compose.foundation.interaction.MutableInteractionSource r51, androidx.compose.p014ui.graphics.Brush r52, p181hd.InterfaceC9545q r53, androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, hd.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, hd.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, hd.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTextField(final java.lang.String r36, final p181hd.InterfaceC9540l r37, androidx.compose.p014ui.Modifier r38, boolean r39, boolean r40, androidx.compose.p014ui.text.TextStyle r41, androidx.compose.foundation.text.KeyboardOptions r42, androidx.compose.foundation.text.KeyboardActions r43, boolean r44, int r45, androidx.compose.p014ui.text.input.VisualTransformation r46, p181hd.InterfaceC9540l r47, androidx.compose.foundation.interaction.MutableInteractionSource r48, androidx.compose.p014ui.graphics.Brush r49, p181hd.InterfaceC9545q r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, hd.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, hd.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, hd.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTextField(final androidx.compose.p014ui.text.input.TextFieldValue r36, final p181hd.InterfaceC9540l r37, androidx.compose.p014ui.Modifier r38, boolean r39, boolean r40, androidx.compose.p014ui.text.TextStyle r41, androidx.compose.foundation.text.KeyboardOptions r42, androidx.compose.foundation.text.KeyboardActions r43, boolean r44, int r45, androidx.compose.p014ui.text.input.VisualTransformation r46, p181hd.InterfaceC9540l r47, androidx.compose.foundation.interaction.MutableInteractionSource r48, androidx.compose.p014ui.graphics.Brush r49, p181hd.InterfaceC9545q r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, hd.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, hd.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, hd.q, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
