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
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.DpSize;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a:\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0011*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "textFieldMagnifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "contextMenuState", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text/MenuItemsAvailability;", "itemsAvailability", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "contextMenuBuilder", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/foundation/contextmenu/ContextMenuState;Landroidx/compose/runtime/State;)Lr6/c;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "", "isShiftPressed", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "Landroidx/compose/ui/unit/IntSize;", "magnifierSize", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt {

    @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nTextFieldSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,115:1\n75#2:116\n1247#3,6:117\n1247#3,6:123\n1247#3,6:129\n85#4:135\n113#4,2:136\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n*L\n51#1:116\n52#1:117,6\n54#1:123,6\n55#1:129,6\n52#1:135\n52#1:136,2\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1 */
    public static final class C14981 extends Lambda implements InterfaceC6474f {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14981(TextFieldSelectionManager textFieldSelectionManager) {
            super(3);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$1(MutableState<IntSize> mutableState) {
            return mutableState.getValue().m13480unboximpl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(MutableState<IntSize> mutableState, long j7) {
            mutableState.setValue(IntSize.m13468boximpl(j7));
        }

        @Override // p152r6.InterfaceC6474f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        }

        @Composable
        public final Modifier invoke(Modifier modifier, Composer composer, int i) {
            composer.startReplaceGroup(1980580247);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1980580247, i, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:50)");
            }
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m13468boximpl(IntSize.INSTANCE.m13481getZeroYbymL2g()), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            boolean zChangedInstance = composer.changedInstance(this.$manager);
            final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC6469a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        return Offset.m10430boximpl(m8109invokeF1C5BW0());
                    }

                    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m8109invokeF1C5BW0() {
                        return TextFieldSelectionManagerKt.m8103calculateSelectionMagnifierCenterAndroidO0kMr_c(textFieldSelectionManager, TextFieldSelectionManager_androidKt.C14981.invoke$lambda$1(mutableState));
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue2;
            boolean zChanged = composer.changed(density);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public final Modifier invoke(final InterfaceC6469a interfaceC6469a2) {
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.1
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return Offset.m10430boximpl(m8110invoketuRUvjQ((Density) obj));
                            }

                            /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
                            public final long m8110invoketuRUvjQ(Density density2) {
                                return ((Offset) interfaceC6469a2.invoke()).m10451unboximpl();
                            }
                        };
                        final Density density2 = density;
                        final MutableState<IntSize> mutableState2 = mutableState;
                        return Magnifier_androidKt.m6829magnifierjPUL71Q$default(companion2, interfaceC6471c, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m8111invokeEaSLcWc(((DpSize) obj).getPackedValue());
                                return C5443s.f8405a;
                            }

                            /* renamed from: invoke-EaSLcWc, reason: not valid java name */
                            public final void m8111invokeEaSLcWc(long j7) {
                                TextFieldSelectionManager_androidKt.C14981.invoke$lambda$2(mutableState2, IntSize.m13471constructorimpl((r1.mo6897roundToPx0680j_4(DpSize.m13401getHeightD9Ej5fM(j7)) & 4294967295L) | (density2.mo6897roundToPx0680j_4(DpSize.m13403getWidthD9Ej5fM(j7)) << 32)));
                            }
                        }, 0.0f, true, 0L, 0.0f, 0.0f, false, PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform(), 490, null);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierAnimatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(modifier, interfaceC6469a, (InterfaceC6471c) objRememberedValue3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierAnimatedSelectionMagnifier;
        }
    }

    @NotNull
    public static final InterfaceC6471c contextMenuBuilder(@NotNull final TextFieldSelectionManager textFieldSelectionManager, @NotNull final ContextMenuState contextMenuState, @NotNull final State<MenuItemsAvailability> state) {
        return new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.contextMenuBuilder.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContextMenuScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(ContextMenuScope contextMenuScope) {
                int iM7679unboximpl = state.getValue().m7679unboximpl();
                final ContextMenuState contextMenuState2 = contextMenuState;
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
                boolean zM7674getCanCutimpl = MenuItemsAvailability.m7674getCanCutimpl(iM7679unboximpl);
                final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                if (zM7674getCanCutimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C12441(textContextMenuItems), null, false, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m8104invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m8104invoke() {
                            textFieldSelectionManager2.cut$foundation_release();
                            ContextMenuState_androidKt.close(contextMenuState2);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState3 = contextMenuState;
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean zM7673getCanCopyimpl = MenuItemsAvailability.m7673getCanCopyimpl(iM7679unboximpl);
                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                if (zM7673getCanCopyimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C12441(textContextMenuItems2), null, false, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m8105invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m8105invoke() {
                            textFieldSelectionManager3.copy$foundation_release(false);
                            ContextMenuState_androidKt.close(contextMenuState3);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState4 = contextMenuState;
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                boolean zM7675getCanPasteimpl = MenuItemsAvailability.m7675getCanPasteimpl(iM7679unboximpl);
                final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                if (zM7675getCanPasteimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C12441(textContextMenuItems3), null, false, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m8106invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m8106invoke() {
                            textFieldSelectionManager4.paste$foundation_release();
                            ContextMenuState_androidKt.close(contextMenuState4);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState5 = contextMenuState;
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                boolean zM7676getCanSelectAllimpl = MenuItemsAvailability.m7676getCanSelectAllimpl(iM7679unboximpl);
                final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                if (zM7676getCanSelectAllimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C12441(textContextMenuItems4), null, false, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m8107invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m8107invoke() {
                            textFieldSelectionManager5.selectAll$foundation_release();
                            ContextMenuState_androidKt.close(contextMenuState5);
                        }
                    }, 14, null);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    final ContextMenuState contextMenuState6 = contextMenuState;
                    TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                    boolean z8 = textFieldSelectionManager.getEditable() && TextRange.m12764getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection());
                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                    if (z8) {
                        ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C12441(textContextMenuItems5), null, false, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p152r6.InterfaceC6469a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m8108invoke();
                                return C5443s.f8405a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m8108invoke() {
                                textFieldSelectionManager6.autofill$foundation_release();
                                ContextMenuState_androidKt.close(contextMenuState6);
                            }
                        }, 14, null);
                    }
                }
            }
        };
    }

    public static final boolean isShiftPressed(@NotNull PointerEvent pointerEvent) {
        return false;
    }

    @NotNull
    public static final Modifier textFieldMagnifier(@NotNull Modifier modifier, @NotNull TextFieldSelectionManager textFieldSelectionManager) {
        return !Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null) ? modifier : ComposedModifierKt.composed$default(modifier, null, new C14981(textFieldSelectionManager), 1, null);
    }
}
