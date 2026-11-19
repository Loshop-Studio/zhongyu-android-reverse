package androidx.compose.foundation.text.input.internal.selection;

import android.os.Build;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.MenuItemsAvailability;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.runtime.State;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class TextFieldSelectionState_androidKt {
    public static final InterfaceC9540l contextMenuBuilder(final TextFieldSelectionState textFieldSelectionState, final ContextMenuState contextMenuState, final State<MenuItemsAvailability> state, final InterfaceC9544p interfaceC9544p) {
        return new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.contextMenuBuilder.1
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
                final InterfaceC9544p interfaceC9544p2 = interfaceC9544p;
                final TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                if (zM27870getCanCutimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C17041(textContextMenuItems), null, false, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m28156invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m28156invoke() {
                            interfaceC9544p2.invoke(textFieldSelectionState2, TextContextMenuItems.Cut);
                            ContextMenuState_androidKt.close(contextMenuState2);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState3 = contextMenuState;
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean zM27869getCanCopyimpl = MenuItemsAvailability.m27869getCanCopyimpl(iM27875unboximpl);
                final InterfaceC9544p interfaceC9544p3 = interfaceC9544p;
                final TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState;
                if (zM27869getCanCopyimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C17041(textContextMenuItems2), null, false, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m28157invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m28157invoke() {
                            interfaceC9544p3.invoke(textFieldSelectionState3, TextContextMenuItems.Copy);
                            ContextMenuState_androidKt.close(contextMenuState3);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState4 = contextMenuState;
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                boolean zM27871getCanPasteimpl = MenuItemsAvailability.m27871getCanPasteimpl(iM27875unboximpl);
                final InterfaceC9544p interfaceC9544p4 = interfaceC9544p;
                final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState;
                if (zM27871getCanPasteimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C17041(textContextMenuItems3), null, false, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m28158invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m28158invoke() {
                            interfaceC9544p4.invoke(textFieldSelectionState4, TextContextMenuItems.Paste);
                            ContextMenuState_androidKt.close(contextMenuState4);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState5 = contextMenuState;
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                boolean zM27872getCanSelectAllimpl = MenuItemsAvailability.m27872getCanSelectAllimpl(iM27875unboximpl);
                final InterfaceC9544p interfaceC9544p5 = interfaceC9544p;
                final TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState;
                if (zM27872getCanSelectAllimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C17041(textContextMenuItems4), null, false, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m28159invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m28159invoke() {
                            interfaceC9544p5.invoke(textFieldSelectionState5, TextContextMenuItems.SelectAll);
                            ContextMenuState_androidKt.close(contextMenuState5);
                        }
                    }, 14, null);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    final ContextMenuState contextMenuState6 = contextMenuState;
                    TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                    boolean zM27868getCanAutofillimpl = MenuItemsAvailability.m27868getCanAutofillimpl(iM27875unboximpl);
                    final InterfaceC9544p interfaceC9544p6 = interfaceC9544p;
                    final TextFieldSelectionState textFieldSelectionState6 = textFieldSelectionState;
                    if (zM27868getCanAutofillimpl) {
                        ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.C17041(textContextMenuItems5), null, false, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p181hd.InterfaceC9529a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m28160invoke();
                                return C10786q.f26013a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m28160invoke() {
                                interfaceC9544p6.invoke(textFieldSelectionState6, TextContextMenuItems.Autofill);
                                ContextMenuState_androidKt.close(contextMenuState6);
                            }
                        }, 14, null);
                    }
                }
            }
        };
    }
}
