package androidx.compose.foundation.text.selection;

import android.os.Build;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.MenuItemsAvailability;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DpSize;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt {

    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1 */
    public static final class C20111 extends Lambda implements InterfaceC9545q {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20111(TextFieldSelectionManager textFieldSelectionManager) {
            super(3);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$1(MutableState<IntSize> mutableState) {
            return mutableState.getValue().m33676unboximpl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(MutableState<IntSize> mutableState, long j10) {
            mutableState.setValue(IntSize.m33664boximpl(j10));
        }

        @Override // p181hd.InterfaceC9545q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        }

        @Composable
        public final Modifier invoke(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(1980580247);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1980580247, i10, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:50)");
            }
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m33664boximpl(IntSize.Companion.m33677getZeroYbymL2g()), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            boolean zChangedInstance = composer.changedInstance(this.$manager);
            final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        return Offset.m30626boximpl(m28305invokeF1C5BW0());
                    }

                    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m28305invokeF1C5BW0() {
                        return TextFieldSelectionManagerKt.m28299calculateSelectionMagnifierCenterAndroidO0kMr_c(textFieldSelectionManager, TextFieldSelectionManager_androidKt.C20111.invoke$lambda$1(mutableState));
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            InterfaceC9529a interfaceC9529a = (InterfaceC9529a) objRememberedValue2;
            boolean zChanged = composer.changed(density);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public final Modifier invoke(final InterfaceC9529a interfaceC9529a2) {
                        Modifier.Companion companion2 = Modifier.Companion;
                        InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.1
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return Offset.m30626boximpl(m28306invoketuRUvjQ((Density) obj));
                            }

                            /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
                            public final long m28306invoketuRUvjQ(Density density2) {
                                return ((Offset) interfaceC9529a2.invoke()).m30647unboximpl();
                            }
                        };
                        final Density density2 = density;
                        final MutableState<IntSize> mutableState2 = mutableState;
                        return Magnifier_androidKt.m27025magnifierjPUL71Q$default(companion2, interfaceC9540l, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m28307invokeEaSLcWc(((DpSize) obj).m33607unboximpl());
                                return C10786q.f26013a;
                            }

                            /* renamed from: invoke-EaSLcWc, reason: not valid java name */
                            public final void m28307invokeEaSLcWc(long j10) {
                                TextFieldSelectionManager_androidKt.C20111.invoke$lambda$2(mutableState2, IntSize.m33667constructorimpl((r1.mo27093roundToPx0680j_4(DpSize.m33597getHeightD9Ej5fM(j10)) & 4294967295L) | (density2.mo27093roundToPx0680j_4(DpSize.m33599getWidthD9Ej5fM(j10)) << 32)));
                            }
                        }, 0.0f, true, 0L, 0.0f, 0.0f, false, PlatformMagnifierFactory.Companion.getForCurrentPlatform(), 490, null);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierAnimatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(modifier, interfaceC9529a, (InterfaceC9540l) objRememberedValue3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierAnimatedSelectionMagnifier;
        }
    }

    public static final InterfaceC9540l contextMenuBuilder(final TextFieldSelectionManager textFieldSelectionManager, final ContextMenuState contextMenuState, final State<MenuItemsAvailability> state) {
        return new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.contextMenuBuilder.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContextMenuScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(ContextMenuScope contextMenuScope) {
                int iM27875unboximpl = state.getValue().m27875unboximpl();
                final ContextMenuState contextMenuState2 = contextMenuState;
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
                boolean zM27870getCanCutimpl = MenuItemsAvailability.m27870getCanCutimpl(iM27875unboximpl);
                final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                if (zM27870getCanCutimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C17041(textContextMenuItems), null, false, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m28300invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m28300invoke() {
                            textFieldSelectionManager2.cut$foundation_release();
                            ContextMenuState_androidKt.close(contextMenuState2);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState3 = contextMenuState;
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean zM27869getCanCopyimpl = MenuItemsAvailability.m27869getCanCopyimpl(iM27875unboximpl);
                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                if (zM27869getCanCopyimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C17041(textContextMenuItems2), null, false, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m28301invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m28301invoke() {
                            textFieldSelectionManager3.copy$foundation_release(false);
                            ContextMenuState_androidKt.close(contextMenuState3);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState4 = contextMenuState;
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                boolean zM27871getCanPasteimpl = MenuItemsAvailability.m27871getCanPasteimpl(iM27875unboximpl);
                final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                if (zM27871getCanPasteimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C17041(textContextMenuItems3), null, false, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m28302invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m28302invoke() {
                            textFieldSelectionManager4.paste$foundation_release();
                            ContextMenuState_androidKt.close(contextMenuState4);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState5 = contextMenuState;
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                boolean zM27872getCanSelectAllimpl = MenuItemsAvailability.m27872getCanSelectAllimpl(iM27875unboximpl);
                final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                if (zM27872getCanSelectAllimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C17041(textContextMenuItems4), null, false, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m28303invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m28303invoke() {
                            textFieldSelectionManager5.selectAll$foundation_release();
                            ContextMenuState_androidKt.close(contextMenuState5);
                        }
                    }, 14, null);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    final ContextMenuState contextMenuState6 = contextMenuState;
                    TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                    boolean z10 = textFieldSelectionManager.getEditable() && TextRange.m32960getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().m33214getSelectiond9O1mEE());
                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                    if (z10) {
                        ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C17041(textContextMenuItems5), null, false, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p181hd.InterfaceC9529a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m28304invoke();
                                return C10786q.f26013a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m28304invoke() {
                                textFieldSelectionManager6.autofill$foundation_release();
                                ContextMenuState_androidKt.close(contextMenuState6);
                            }
                        }, 14, null);
                    }
                }
            }
        };
    }

    public static final boolean isShiftPressed(PointerEvent pointerEvent) {
        return false;
    }

    public static final Modifier textFieldMagnifier(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager) {
        return !Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null) ? modifier : ComposedModifierKt.composed$default(modifier, null, new C20111(textFieldSelectionManager), 1, null);
    }
}
