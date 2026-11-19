package androidx.compose.foundation.text;

import androidx.compose.p014ui.input.key.Key;
import androidx.compose.p014ui.input.key.KeyEvent;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // p280od.InterfaceC10480n
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m31963isCtrlPressedZmokQxo(((KeyEvent) obj).m31948unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo27803mapZmokQxo(android.view.KeyEvent keyEvent) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m31965isShiftPressedZmokQxo(keyEvent) && KeyEvent_androidKt.m31963isCtrlPressedZmokQxo(keyEvent)) {
                    long jM31959getKeyZmokQxo = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27846getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27847getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27848getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27845getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m31963isCtrlPressedZmokQxo(keyEvent)) {
                    long jM31959getKeyZmokQxo2 = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27846getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27847getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27848getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27845getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27850getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27844getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27840getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27839getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m31965isShiftPressedZmokQxo(keyEvent)) {
                    long jM31959getKeyZmokQxo3 = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27853getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_START;
                    } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27852getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_END;
                    }
                } else if (KeyEvent_androidKt.m31962isAltPressedZmokQxo(keyEvent)) {
                    long jM31959getKeyZmokQxo4 = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo4, mappedKeys4.m27840getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo4, mappedKeys4.m27844getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo27803mapZmokQxo(keyEvent) : keyCommand;
            }
        };
    }

    public static final KeyMapping commonKeyMapping(final InterfaceC9540l interfaceC9540l) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo27803mapZmokQxo(android.view.KeyEvent keyEvent) {
                if (((Boolean) interfaceC9540l.invoke(KeyEvent.m31942boximpl(keyEvent))).booleanValue() && KeyEvent_androidKt.m31965isShiftPressedZmokQxo(keyEvent)) {
                    if (Key.m31651equalsimpl0(KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent), MappedKeys.INSTANCE.m27862getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (((Boolean) interfaceC9540l.invoke(KeyEvent.m31942boximpl(keyEvent))).booleanValue()) {
                    long jM31959getKeyZmokQxo = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27841getCEK5gGoQ()) ? true : Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27851getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27859getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27860getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27838getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27861getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27862getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m31963isCtrlPressedZmokQxo(keyEvent)) {
                    return null;
                }
                if (KeyEvent_androidKt.m31965isShiftPressedZmokQxo(keyEvent)) {
                    long jM31959getKeyZmokQxo2 = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27846getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27847getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27848getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27845getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27856getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27855getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27853getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27852getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27851getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM31959getKeyZmokQxo3 = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27846getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27847getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27848getDirectionUpEK5gGoQ())) {
                    return KeyCommand.f1092UP;
                }
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27845getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27856getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27855getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27853getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27852getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27849getEnterEK5gGoQ()) ? true : Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27854getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27840getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27844getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27857getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27843getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27842getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo3, mappedKeys3.m27858getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
