package androidx.compose.foundation.text.selection;

import android.view.KeyEvent;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DpSize;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
public final class SelectionManager_androidKt {

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1 */
    public static final class C19951 extends Lambda implements InterfaceC9545q {
        final /* synthetic */ SelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19951(SelectionManager selectionManager) {
            super(3);
            this.$manager = selectionManager;
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
            composer.startReplaceGroup(-1914520728);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1914520728, i10, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:49)");
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
            final SelectionManager selectionManager = this.$manager;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        return Offset.m30626boximpl(m28272invokeF1C5BW0());
                    }

                    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m28272invokeF1C5BW0() {
                        return SelectionManagerKt.m28266calculateSelectionMagnifierCenterAndroidO0kMr_c(selectionManager, SelectionManager_androidKt.C19951.invoke$lambda$1(mutableState));
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            InterfaceC9529a interfaceC9529a = (InterfaceC9529a) objRememberedValue2;
            boolean zChanged = composer.changed(density);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public final Modifier invoke(final InterfaceC9529a interfaceC9529a2) {
                        Modifier.Companion companion2 = Modifier.Companion;
                        InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1.1
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return Offset.m30626boximpl(m28273invoketuRUvjQ((Density) obj));
                            }

                            /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
                            public final long m28273invoketuRUvjQ(Density density2) {
                                return ((Offset) interfaceC9529a2.invoke()).m30647unboximpl();
                            }
                        };
                        final Density density2 = density;
                        final MutableState<IntSize> mutableState2 = mutableState;
                        return Magnifier_androidKt.m27025magnifierjPUL71Q$default(companion2, interfaceC9540l, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m28274invokeEaSLcWc(((DpSize) obj).m33607unboximpl());
                                return C10786q.f26013a;
                            }

                            /* renamed from: invoke-EaSLcWc, reason: not valid java name */
                            public final void m28274invokeEaSLcWc(long j10) {
                                SelectionManager_androidKt.C19951.invoke$lambda$2(mutableState2, IntSize.m33667constructorimpl((r1.mo27093roundToPx0680j_4(DpSize.m33597getHeightD9Ej5fM(j10)) & 4294967295L) | (density2.mo27093roundToPx0680j_4(DpSize.m33599getWidthD9Ej5fM(j10)) << 32)));
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

    public static final InterfaceC9540l contextMenuBuilder(final SelectionManager selectionManager, final ContextMenuState contextMenuState) {
        return new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt.contextMenuBuilder.1
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
                final ContextMenuState contextMenuState2 = contextMenuState;
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Copy;
                boolean zIsNonEmptySelection$foundation_release = selectionManager.isNonEmptySelection$foundation_release();
                final SelectionManager selectionManager2 = selectionManager;
                if (zIsNonEmptySelection$foundation_release) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C17041(textContextMenuItems), null, false, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m28270invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m28270invoke() {
                            selectionManager2.copy$foundation_release();
                            ContextMenuState_androidKt.close(contextMenuState2);
                        }
                    }, 14, null);
                }
                C10786q c10786q = C10786q.f26013a;
                final ContextMenuState contextMenuState3 = contextMenuState;
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.SelectAll;
                boolean zIsEntireContainerSelected$foundation_release = selectionManager.isEntireContainerSelected$foundation_release();
                final SelectionManager selectionManager3 = selectionManager;
                if (!zIsEntireContainerSelected$foundation_release) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C17041(textContextMenuItems2), null, false, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m28271invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m28271invoke() {
                            selectionManager3.selectAll$foundation_release();
                            ContextMenuState_androidKt.close(contextMenuState3);
                        }
                    }, 14, null);
                }
                AbstractC10978w.m24139q(c10786q, c10786q);
            }
        };
    }

    /* renamed from: isCopyKeyEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m28269isCopyKeyEventZmokQxo(KeyEvent keyEvent) {
        return KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo27803mapZmokQxo(keyEvent) == KeyCommand.COPY;
    }

    public static final Modifier selectionMagnifier(Modifier modifier, SelectionManager selectionManager) {
        return !Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null) ? modifier : ComposedModifierKt.composed$default(modifier, null, new C19951(selectionManager), 1, null);
    }
}
