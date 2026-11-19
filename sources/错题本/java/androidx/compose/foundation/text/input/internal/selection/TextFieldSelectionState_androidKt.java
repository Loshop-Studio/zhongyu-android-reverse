package androidx.compose.foundation.text.input.internal.selection;

import android.os.Build;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.MenuItemsAvailability;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "state", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text/MenuItemsAvailability;", "itemsAvailability", "Lkotlin/Function2;", "Landroidx/compose/foundation/text/TextContextMenuItems;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "onMenuItemClicked", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "contextMenuBuilder", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/contextmenu/ContextMenuState;Landroidx/compose/runtime/State;Lr6/e;)Lr6/c;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldSelectionState_androidKt {
    @NotNull
    public static final InterfaceC6471c contextMenuBuilder(@NotNull final TextFieldSelectionState textFieldSelectionState, @NotNull final ContextMenuState contextMenuState, @NotNull final State<MenuItemsAvailability> state, @NotNull final InterfaceC6473e interfaceC6473e) {
        return new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.contextMenuBuilder.1
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
                final InterfaceC6473e interfaceC6473e2 = interfaceC6473e;
                final TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                if (zM7674getCanCutimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C12441(textContextMenuItems), null, false, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m7960invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m7960invoke() {
                            interfaceC6473e2.invoke(textFieldSelectionState2, TextContextMenuItems.Cut);
                            ContextMenuState_androidKt.close(contextMenuState2);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState3 = contextMenuState;
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean zM7673getCanCopyimpl = MenuItemsAvailability.m7673getCanCopyimpl(iM7679unboximpl);
                final InterfaceC6473e interfaceC6473e3 = interfaceC6473e;
                final TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState;
                if (zM7673getCanCopyimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C12441(textContextMenuItems2), null, false, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m7961invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m7961invoke() {
                            interfaceC6473e3.invoke(textFieldSelectionState3, TextContextMenuItems.Copy);
                            ContextMenuState_androidKt.close(contextMenuState3);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState4 = contextMenuState;
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                boolean zM7675getCanPasteimpl = MenuItemsAvailability.m7675getCanPasteimpl(iM7679unboximpl);
                final InterfaceC6473e interfaceC6473e4 = interfaceC6473e;
                final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState;
                if (zM7675getCanPasteimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C12441(textContextMenuItems3), null, false, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m7962invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m7962invoke() {
                            interfaceC6473e4.invoke(textFieldSelectionState4, TextContextMenuItems.Paste);
                            ContextMenuState_androidKt.close(contextMenuState4);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState5 = contextMenuState;
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                boolean zM7676getCanSelectAllimpl = MenuItemsAvailability.m7676getCanSelectAllimpl(iM7679unboximpl);
                final InterfaceC6473e interfaceC6473e5 = interfaceC6473e;
                final TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState;
                if (zM7676getCanSelectAllimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C12441(textContextMenuItems4), null, false, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m7963invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m7963invoke() {
                            interfaceC6473e5.invoke(textFieldSelectionState5, TextContextMenuItems.SelectAll);
                            ContextMenuState_androidKt.close(contextMenuState5);
                        }
                    }, 14, null);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    final ContextMenuState contextMenuState6 = contextMenuState;
                    TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                    boolean zM7672getCanAutofillimpl = MenuItemsAvailability.m7672getCanAutofillimpl(iM7679unboximpl);
                    final InterfaceC6473e interfaceC6473e6 = interfaceC6473e;
                    final TextFieldSelectionState textFieldSelectionState6 = textFieldSelectionState;
                    if (zM7672getCanAutofillimpl) {
                        ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C12441(textContextMenuItems5), null, false, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p152r6.InterfaceC6469a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m7964invoke();
                                return C5443s.f8405a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m7964invoke() {
                                interfaceC6473e6.invoke(textFieldSelectionState6, TextContextMenuItems.Autofill);
                                ContextMenuState_androidKt.close(contextMenuState6);
                            }
                        }, 14, null);
                    }
                }
            }
        };
    }
}
