package androidx.compose.foundation.text;

import androidx.compose.p011ui.input.key.Key;
import androidx.compose.p011ui.input.key.KeyEvent;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u0007\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "shortcutModifier", "Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "(Lr6/c;)Landroidx/compose/foundation/text/KeyMapping;", "defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class KeyMappingKt {

    @NotNull
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m11767isCtrlPressedZmokQxo(((KeyEvent) obj).m11752unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo7607mapZmokQxo(android.view.KeyEvent event) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m11769isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m11767isCtrlPressedZmokQxo(event)) {
                    long jM11763getKeyZmokQxo = KeyEvent_androidKt.m11763getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7650getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7651getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7652getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7649getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m11767isCtrlPressedZmokQxo(event)) {
                    long jM11763getKeyZmokQxo2 = KeyEvent_androidKt.m11763getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7650getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7651getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7652getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7649getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7654getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7648getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7644getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7643getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m11769isShiftPressedZmokQxo(event)) {
                    long jM11763getKeyZmokQxo3 = KeyEvent_androidKt.m11763getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7657getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_START;
                    } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7656getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_END;
                    }
                } else if (KeyEvent_androidKt.m11766isAltPressedZmokQxo(event)) {
                    long jM11763getKeyZmokQxo4 = KeyEvent_androidKt.m11763getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo4, mappedKeys4.m7644getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo4, mappedKeys4.m7648getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo7607mapZmokQxo(event) : keyCommand;
            }
        };
    }

    @NotNull
    public static final KeyMapping commonKeyMapping(@NotNull final InterfaceC6471c interfaceC6471c) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo7607mapZmokQxo(android.view.KeyEvent event) {
                if (((Boolean) interfaceC6471c.invoke(KeyEvent.m11746boximpl(event))).booleanValue() && KeyEvent_androidKt.m11769isShiftPressedZmokQxo(event)) {
                    if (Key.m11455equalsimpl0(KeyEvent_androidKt.m11763getKeyZmokQxo(event), MappedKeys.INSTANCE.m7666getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (((Boolean) interfaceC6471c.invoke(KeyEvent.m11746boximpl(event))).booleanValue()) {
                    long jM11763getKeyZmokQxo = KeyEvent_androidKt.m11763getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7645getCEK5gGoQ()) ? true : Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7655getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7663getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7664getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7642getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7665getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7666getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m11767isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m11769isShiftPressedZmokQxo(event)) {
                    long jM11763getKeyZmokQxo2 = KeyEvent_androidKt.m11763getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7650getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7651getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7652getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7649getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7660getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7659getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7657getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7656getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7655getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM11763getKeyZmokQxo3 = KeyEvent_androidKt.m11763getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7650getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7651getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7652getDirectionUpEK5gGoQ())) {
                    return KeyCommand.f757UP;
                }
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7649getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7660getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7659getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7657getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7656getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7653getEnterEK5gGoQ()) ? true : Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7658getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7644getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7648getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7661getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7647getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7646getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo3, mappedKeys3.m7662getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
