package androidx.compose.foundation.text;

import androidx.compose.p009ui.input.key.Key;
import androidx.compose.p009ui.input.key.KeyEvent;
import androidx.compose.p009ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(m7879d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, m7880d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m14982isCtrlPressedZmokQxo(((KeyEvent) obj).m14967unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo10930mapZmokQxo(android.view.KeyEvent event) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m14984isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m14982isCtrlPressedZmokQxo(event)) {
                    long jM14978getKeyZmokQxo = KeyEvent_androidKt.m14978getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10969getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10970getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10971getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10968getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m14982isCtrlPressedZmokQxo(event)) {
                    long jM14978getKeyZmokQxo2 = KeyEvent_androidKt.m14978getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10969getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10970getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10971getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10968getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10973getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10967getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10963getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10962getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m14984isShiftPressedZmokQxo(event)) {
                    long jM14978getKeyZmokQxo3 = KeyEvent_androidKt.m14978getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10976getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_START;
                    } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10975getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_END;
                    }
                } else if (KeyEvent_androidKt.m14981isAltPressedZmokQxo(event)) {
                    long jM14978getKeyZmokQxo4 = KeyEvent_androidKt.m14978getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo4, mappedKeys4.m10963getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo4, mappedKeys4.m10967getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo10930mapZmokQxo(event) : keyCommand;
            }
        };
    }

    public static final KeyMapping commonKeyMapping(final Function1<? super KeyEvent, Boolean> function1) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo10930mapZmokQxo(android.view.KeyEvent event) {
                if (function1.invoke(KeyEvent.m14961boximpl(event)).booleanValue() && KeyEvent_androidKt.m14984isShiftPressedZmokQxo(event)) {
                    if (Key.m14670equalsimpl0(KeyEvent_androidKt.m14978getKeyZmokQxo(event), MappedKeys.INSTANCE.m10985getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (function1.invoke(KeyEvent.m14961boximpl(event)).booleanValue()) {
                    long jM14978getKeyZmokQxo = KeyEvent_androidKt.m14978getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10964getCEK5gGoQ()) ? true : Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10974getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10982getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10983getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10961getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10984getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10985getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m14982isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m14984isShiftPressedZmokQxo(event)) {
                    long jM14978getKeyZmokQxo2 = KeyEvent_androidKt.m14978getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10969getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10970getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10971getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10968getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10979getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10978getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10976getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10975getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10974getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM14978getKeyZmokQxo3 = KeyEvent_androidKt.m14978getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10969getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10970getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10971getDirectionUpEK5gGoQ())) {
                    return KeyCommand.f126UP;
                }
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10968getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10979getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10978getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10976getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10975getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10972getEnterEK5gGoQ()) ? true : Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10977getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10963getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10967getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10980getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10966getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10965getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo3, mappedKeys3.m10981getTabEK5gGoQ())) {
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
