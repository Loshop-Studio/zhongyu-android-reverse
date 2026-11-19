package androidx.compose.foundation.text;

import androidx.compose.p013ui.input.key.Key;
import androidx.compose.p013ui.input.key.KeyEvent;
import androidx.compose.p013ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // p089e8.InterfaceC8385m
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m25361isCtrlPressedZmokQxo(((KeyEvent) obj).m25346unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo21201mapZmokQxo(android.view.KeyEvent keyEvent) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m25363isShiftPressedZmokQxo(keyEvent) && KeyEvent_androidKt.m25361isCtrlPressedZmokQxo(keyEvent)) {
                    long jM25357getKeyZmokQxo = KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21244getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21245getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21246getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21243getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m25361isCtrlPressedZmokQxo(keyEvent)) {
                    long jM25357getKeyZmokQxo2 = KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21244getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21245getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21246getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21243getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21248getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21242getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21238getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21237getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m25363isShiftPressedZmokQxo(keyEvent)) {
                    long jM25357getKeyZmokQxo3 = KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21251getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_START;
                    } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21250getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_END;
                    }
                } else if (KeyEvent_androidKt.m25360isAltPressedZmokQxo(keyEvent)) {
                    long jM25357getKeyZmokQxo4 = KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo4, mappedKeys4.m21238getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo4, mappedKeys4.m21242getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo21201mapZmokQxo(keyEvent) : keyCommand;
            }
        };
    }

    public static final KeyMapping commonKeyMapping(final InterfaceC10570l interfaceC10570l) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo21201mapZmokQxo(android.view.KeyEvent keyEvent) {
                if (((Boolean) interfaceC10570l.invoke(KeyEvent.m25340boximpl(keyEvent))).booleanValue() && KeyEvent_androidKt.m25363isShiftPressedZmokQxo(keyEvent)) {
                    if (Key.m25049equalsimpl0(KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent), MappedKeys.INSTANCE.m21260getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (((Boolean) interfaceC10570l.invoke(KeyEvent.m25340boximpl(keyEvent))).booleanValue()) {
                    long jM25357getKeyZmokQxo = KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21239getCEK5gGoQ()) ? true : Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21249getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21257getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21258getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21236getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21259getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21260getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m25361isCtrlPressedZmokQxo(keyEvent)) {
                    return null;
                }
                if (KeyEvent_androidKt.m25363isShiftPressedZmokQxo(keyEvent)) {
                    long jM25357getKeyZmokQxo2 = KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21244getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21245getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21246getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21243getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21254getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21253getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21251getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21250getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21249getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM25357getKeyZmokQxo3 = KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21244getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21245getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21246getDirectionUpEK5gGoQ())) {
                    return KeyCommand.f1162UP;
                }
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21243getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21254getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21253getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21251getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21250getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21247getEnterEK5gGoQ()) ? true : Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21252getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21238getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21242getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21255getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21241getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21240getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo3, mappedKeys3.m21256getTabEK5gGoQ())) {
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
