package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.focus.FocusRequester;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.input.key.KeyEvent;
import androidx.compose.p014ui.input.key.KeyInputModifierKt;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.platform.SoftwareKeyboardController;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.input.ImeOptions;
import androidx.compose.p014ui.text.input.OffsetMapping;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.p014ui.text.input.TextInputService;
import androidx.compose.p014ui.text.input.TextInputSession;
import androidx.compose.p014ui.text.style.ResolvedTextDirection;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.CoroutineStart;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:497:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CoreTextField(final androidx.compose.p014ui.text.input.TextFieldValue r48, final p181hd.InterfaceC9540l r49, androidx.compose.p014ui.Modifier r50, androidx.compose.p014ui.text.TextStyle r51, androidx.compose.p014ui.text.input.VisualTransformation r52, p181hd.InterfaceC9540l r53, androidx.compose.foundation.interaction.MutableInteractionSource r54, androidx.compose.p014ui.graphics.Brush r55, boolean r56, int r57, int r58, androidx.compose.p014ui.text.input.ImeOptions r59, androidx.compose.foundation.text.KeyboardActions r60, boolean r61, boolean r62, p181hd.InterfaceC9545q r63, androidx.compose.foundation.text.TextFieldScrollerPosition r64, androidx.compose.runtime.Composer r65, final int r66, final int r67, final int r68) {
        /*
            Method dump skipped, instructions count: 2728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(androidx.compose.ui.text.input.TextFieldValue, hd.l, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, hd.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, hd.q, androidx.compose.foundation.text.TextFieldScrollerPosition, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$11(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-20551815);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-20551815, i11, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:668)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, interfaceC9544p, composerStartRestartGroup, (i11 >> 3) & Opcodes.IAND);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextFieldRootBox.2
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
                    CoreTextFieldKt.CoreTextFieldRootBox(modifier, textFieldSelectionManager, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SelectionToolbarAndHandles(final TextFieldSelectionManager textFieldSelectionManager, final boolean z10, Composer composer, final int i10) {
        int i11;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        Composer composerStartRestartGroup = composer.startRestartGroup(626339208);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626339208, i11, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1018)");
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(-1290924834);
                LegacyTextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
                TextLayoutResult textLayoutResult = null;
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    LegacyTextFieldState state$foundation_release2 = textFieldSelectionManager.getState$foundation_release();
                    if (!(state$foundation_release2 != null ? state$foundation_release2.isLayoutResultStale() : true)) {
                        textLayoutResult = value;
                    }
                }
                if (textLayoutResult == null) {
                    composerStartRestartGroup.startReplaceGroup(-1290601288);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1290601287);
                    if (TextRange.m32960getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().m33214getSelectiond9O1mEE())) {
                        composerStartRestartGroup.startReplaceGroup(-1684179174);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1685230508);
                        int iOriginalToTransformed = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m32966getStartimpl(textFieldSelectionManager.getValue$foundation_release().m33214getSelectiond9O1mEE()));
                        int iOriginalToTransformed2 = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m32961getEndimpl(textFieldSelectionManager.getValue$foundation_release().m33214getSelectiond9O1mEE()));
                        ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(iOriginalToTransformed);
                        ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(iOriginalToTransformed2 - 1, 0));
                        LegacyTextFieldState state$foundation_release3 = textFieldSelectionManager.getState$foundation_release();
                        if (state$foundation_release3 == null || !state$foundation_release3.getShowSelectionHandleStart()) {
                            composerStartRestartGroup.startReplaceGroup(-1684548198);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1684812473);
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, composerStartRestartGroup, ((i11 << 6) & 896) | 6);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        LegacyTextFieldState state$foundation_release4 = textFieldSelectionManager.getState$foundation_release();
                        if (state$foundation_release4 == null || !state$foundation_release4.getShowSelectionHandleEnd()) {
                            composerStartRestartGroup.startReplaceGroup(-1684200998);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1684464312);
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, composerStartRestartGroup, ((i11 << 6) & 896) | 6);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    LegacyTextFieldState state$foundation_release5 = textFieldSelectionManager.getState$foundation_release();
                    if (state$foundation_release5 != null) {
                        if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                            state$foundation_release5.setShowFloatingToolbar(false);
                        }
                        if (state$foundation_release5.getHasFocus()) {
                            if (state$foundation_release5.getShowFloatingToolbar()) {
                                textFieldSelectionManager.showSelectionToolbar$foundation_release();
                            } else {
                                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                            }
                        }
                        C10786q c10786q = C10786q.f26013a;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(651160447);
                composerStartRestartGroup.endReplaceGroup();
                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.SelectionToolbarAndHandles.2
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
                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager, z10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldCursorHandle(final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i10) {
        int i11;
        AnnotatedString transformedText$foundation_release;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1436003720);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436003720, i11, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1065)");
            }
            LegacyTextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
            if (state$foundation_release == null || !state$foundation_release.getShowCursorHandle() || (transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release()) == null || transformedText$foundation_release.length() <= 0) {
                composerStartRestartGroup.startReplaceGroup(-288632802);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-289940723);
                boolean zChanged = composerStartRestartGroup.changed(textFieldSelectionManager);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = textFieldSelectionManager.cursorDragObserver$foundation_release();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue;
                final long jM28289getCursorPositiontuRUvjQ$foundation_release = textFieldSelectionManager.m28289getCursorPositiontuRUvjQ$foundation_release((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
                boolean zChanged2 = composerStartRestartGroup.changed(jM28289getCursorPositiontuRUvjQ$foundation_release);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo27772provideF1C5BW0() {
                            return jM28289getCursorPositiontuRUvjQ$foundation_release;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) objRememberedValue2;
                Modifier.Companion companion = Modifier.Companion;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textDragObserver) | composerStartRestartGroup.changedInstance(textFieldSelectionManager);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1

                        @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", m26211f = "CoreTextField.kt", m26212l = {}, m26213m = "invokeSuspend")
                        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1 */
                        public static final class C17151 extends SuspendLambda implements InterfaceC9544p {
                            final /* synthetic */ TextFieldSelectionManager $manager;
                            final /* synthetic */ TextDragObserver $observer;
                            final /* synthetic */ PointerInputScope $this_pointerInput;
                            private /* synthetic */ Object L$0;
                            int label;

                            @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", m26211f = "CoreTextField.kt", m26212l = {1078}, m26213m = "invokeSuspend")
                            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                                final /* synthetic */ TextDragObserver $observer;
                                final /* synthetic */ PointerInputScope $this_pointerInput;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                                    super(2, interfaceC11588c);
                                    this.$this_pointerInput = pointerInputScope;
                                    this.$observer = textDragObserver;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                                    return new AnonymousClass1(this.$this_pointerInput, this.$observer, interfaceC11588c);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) throws Throwable {
                                    Object objM25952f = AbstractC11725a.m25952f();
                                    int i10 = this.label;
                                    if (i10 == 0) {
                                        AbstractC9924b.m20071b(obj);
                                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                                        TextDragObserver textDragObserver = this.$observer;
                                        this.label = 1;
                                        if (LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == objM25952f) {
                                            return objM25952f;
                                        }
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        AbstractC9924b.m20071b(obj);
                                    }
                                    return C10786q.f26013a;
                                }

                                @Override // p181hd.InterfaceC9544p
                                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                                    return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                                }
                            }

                            @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", m26211f = "CoreTextField.kt", m26212l = {1081}, m26213m = "invokeSuspend")
                            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2, reason: invalid class name */
                            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
                                final /* synthetic */ TextFieldSelectionManager $manager;
                                final /* synthetic */ PointerInputScope $this_pointerInput;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionManager textFieldSelectionManager, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                                    super(2, interfaceC11588c);
                                    this.$this_pointerInput = pointerInputScope;
                                    this.$manager = textFieldSelectionManager;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                                    return new AnonymousClass2(this.$this_pointerInput, this.$manager, interfaceC11588c);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) throws Throwable {
                                    Object objM25952f = AbstractC11725a.m25952f();
                                    int i10 = this.label;
                                    if (i10 == 0) {
                                        AbstractC9924b.m20071b(obj);
                                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                                        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                                        InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.2.1.1.2.1
                                            {
                                                super(1);
                                            }

                                            @Override // p181hd.InterfaceC9540l
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                m27799invokek4lQ0M(((Offset) obj2).m30647unboximpl());
                                                return C10786q.f26013a;
                                            }

                                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                            public final void m27799invokek4lQ0M(long j10) {
                                                textFieldSelectionManager.showSelectionToolbar$foundation_release();
                                            }
                                        };
                                        this.label = 1;
                                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, interfaceC9540l, this, 7, null) == objM25952f) {
                                            return objM25952f;
                                        }
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        AbstractC9924b.m20071b(obj);
                                    }
                                    return C10786q.f26013a;
                                }

                                @Override // p181hd.InterfaceC9544p
                                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                                    return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C17151(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager, InterfaceC11588c<? super C17151> interfaceC11588c) {
                                super(2, interfaceC11588c);
                                this.$this_pointerInput = pointerInputScope;
                                this.$observer = textDragObserver;
                                this.$manager = textFieldSelectionManager;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                                C17151 c17151 = new C17151(this.$this_pointerInput, this.$observer, this.$manager, interfaceC11588c);
                                c17151.L$0 = obj;
                                return c17151;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) throws Throwable {
                                AbstractC11725a.m25952f();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC9924b.m20071b(obj);
                                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                                CoroutineStart coroutineStart = CoroutineStart.f23479f;
                                AbstractC11117h.m24726d(interfaceC11122i0, null, coroutineStart, new AnonymousClass1(this.$this_pointerInput, this.$observer, null), 1, null);
                                AbstractC11117h.m24726d(interfaceC11122i0, null, coroutineStart, new AnonymousClass2(this.$this_pointerInput, this.$manager, null), 1, null);
                                return C10786q.f26013a;
                            }

                            @Override // p181hd.InterfaceC9544p
                            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                                return ((C17151) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                            }
                        }

                        @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            Object objM20748e = AbstractC10006d.m20748e(new C17151(pointerInputScope, textDragObserver, textFieldSelectionManager, null), interfaceC11588c);
                            return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (PointerInputEventHandler) objRememberedValue3);
                boolean zChanged3 = composerStartRestartGroup.changed(jM28289getCursorPositiontuRUvjQ$foundation_release);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3$1
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
                            semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, jM28289getCursorPositiontuRUvjQ$foundation_release, SelectionHandleAnchor.Middle, true, null));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                AndroidCursorHandle_androidKt.m27758CursorHandleUSBMPiE(offsetProvider, SemanticsModifierKt.semantics$default(modifierPointerInput, false, (InterfaceC9540l) objRememberedValue4, 1, null), 0L, composerStartRestartGroup, 0, 4);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.4
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
                    CoreTextFieldKt.TextFieldCursorHandle(textFieldSelectionManager, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m32963getMaximpl(textFieldValue.m33214getSelectiond9O1mEE()));
        Object objBringIntoView = bringIntoViewRequester.bringIntoView(iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.getBoundingBox(iOriginalToTransformed) : iOriginalToTransformed != 0 ? textLayoutResult.getBoundingBox(iOriginalToTransformed - 1) : new Rect(0.0f, 0.0f, 1.0f, (int) (TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null) & 4294967295L)), interfaceC11588c);
        return objBringIntoView == AbstractC11725a.m25952f() ? objBringIntoView : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(LegacyTextFieldState legacyTextFieldState) {
        TextInputSession inputSession = legacyTextFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onBlur$foundation_release(inputSession, legacyTextFieldState.getProcessor(), legacyTextFieldState.getOnValueChange());
        }
        legacyTextFieldState.setInputSession(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            TextInputSession inputSession = legacyTextFieldState.getInputSession();
            if (inputSession == null) {
                return;
            }
            LayoutCoordinates layoutCoordinates = legacyTextFieldState.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return;
            }
            TextFieldDelegate.Companion.notifyFocusedRect$foundation_release(textFieldValue, legacyTextFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, legacyTextFieldState.getHasFocus(), offsetMapping);
            C10786q c10786q = C10786q.f26013a;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.previewKeyEventToDeselectOnBack.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m27800invokeZmokQxo(((KeyEvent) obj).m31948unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m27800invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z10;
                if (legacyTextFieldState.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m27802cancelsTextSelectionZmokQxo(keyEvent)) {
                    z10 = true;
                    TextFieldSelectionManager.m28284deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(TextInputService textInputService, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        legacyTextFieldState.setInputSession(TextFieldDelegate.Companion.onFocus$foundation_release(textInputService, textFieldValue, legacyTextFieldState.getProcessor(), imeOptions, legacyTextFieldState.getOnValueChange(), legacyTextFieldState.getOnImeActionPerformed()));
        notifyFocusedRect(legacyTextFieldState, textFieldValue, offsetMapping);
    }

    public static final void tapToFocus(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z10) {
        SoftwareKeyboardController keyboardController;
        if (!legacyTextFieldState.getHasFocus()) {
            FocusRequester.m30545requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        } else {
            if (!z10 || (keyboardController = legacyTextFieldState.getKeyboardController()) == null) {
                return;
            }
            keyboardController.show();
        }
    }
}
