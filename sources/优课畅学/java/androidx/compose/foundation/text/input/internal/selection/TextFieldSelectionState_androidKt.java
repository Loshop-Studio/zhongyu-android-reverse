package androidx.compose.foundation.text.input.internal.selection;

import android.os.Build;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.MenuItemsAvailability;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.runtime.State;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class TextFieldSelectionState_androidKt {
    public static final InterfaceC10570l contextMenuBuilder(final TextFieldSelectionState textFieldSelectionState, final ContextMenuState contextMenuState, final State<MenuItemsAvailability> state, final InterfaceC10574p interfaceC10574p) {
        return new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.contextMenuBuilder.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContextMenuScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(ContextMenuScope contextMenuScope) {
                int iM21273unboximpl = state.getValue().m21273unboximpl();
                final ContextMenuState contextMenuState2 = contextMenuState;
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
                boolean zM21268getCanCutimpl = MenuItemsAvailability.m21268getCanCutimpl(iM21273unboximpl);
                final InterfaceC10574p interfaceC10574p2 = interfaceC10574p;
                final TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                if (zM21268getCanCutimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C16741(textContextMenuItems), null, false, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p300x7.InterfaceC10559a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m21554invoke();
                            return C8736p.f16368a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m21554invoke() {
                            interfaceC10574p2.invoke(textFieldSelectionState2, TextContextMenuItems.Cut);
                            ContextMenuState_androidKt.close(contextMenuState2);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState3 = contextMenuState;
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean zM21267getCanCopyimpl = MenuItemsAvailability.m21267getCanCopyimpl(iM21273unboximpl);
                final InterfaceC10574p interfaceC10574p3 = interfaceC10574p;
                final TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState;
                if (zM21267getCanCopyimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C16741(textContextMenuItems2), null, false, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p300x7.InterfaceC10559a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m21555invoke();
                            return C8736p.f16368a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m21555invoke() {
                            interfaceC10574p3.invoke(textFieldSelectionState3, TextContextMenuItems.Copy);
                            ContextMenuState_androidKt.close(contextMenuState3);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState4 = contextMenuState;
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                boolean zM21269getCanPasteimpl = MenuItemsAvailability.m21269getCanPasteimpl(iM21273unboximpl);
                final InterfaceC10574p interfaceC10574p4 = interfaceC10574p;
                final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState;
                if (zM21269getCanPasteimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C16741(textContextMenuItems3), null, false, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p300x7.InterfaceC10559a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m21556invoke();
                            return C8736p.f16368a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m21556invoke() {
                            interfaceC10574p4.invoke(textFieldSelectionState4, TextContextMenuItems.Paste);
                            ContextMenuState_androidKt.close(contextMenuState4);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState5 = contextMenuState;
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                boolean zM21270getCanSelectAllimpl = MenuItemsAvailability.m21270getCanSelectAllimpl(iM21273unboximpl);
                final InterfaceC10574p interfaceC10574p5 = interfaceC10574p;
                final TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState;
                if (zM21270getCanSelectAllimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C16741(textContextMenuItems4), null, false, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p300x7.InterfaceC10559a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m21557invoke();
                            return C8736p.f16368a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m21557invoke() {
                            interfaceC10574p5.invoke(textFieldSelectionState5, TextContextMenuItems.SelectAll);
                            ContextMenuState_androidKt.close(contextMenuState5);
                        }
                    }, 14, null);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    final ContextMenuState contextMenuState6 = contextMenuState;
                    TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                    boolean zM21266getCanAutofillimpl = MenuItemsAvailability.m21266getCanAutofillimpl(iM21273unboximpl);
                    final InterfaceC10574p interfaceC10574p6 = interfaceC10574p;
                    final TextFieldSelectionState textFieldSelectionState6 = textFieldSelectionState;
                    if (zM21266getCanAutofillimpl) {
                        ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C16741(textContextMenuItems5), null, false, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p300x7.InterfaceC10559a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m21558invoke();
                                return C8736p.f16368a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m21558invoke() {
                                interfaceC10574p6.invoke(textFieldSelectionState6, TextContextMenuItems.Autofill);
                                ContextMenuState_androidKt.close(contextMenuState6);
                            }
                        }, 14, null);
                    }
                }
            }
        };
    }
}
