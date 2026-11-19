package androidx.compose.foundation.text;

import androidx.compose.p013ui.input.key.Key;
import androidx.compose.p013ui.input.key.KeyEvent;
import androidx.compose.p013ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(m13557d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, m13558d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m22059isCtrlPressedZmokQxo(((KeyEvent) obj).m22044unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo18007mapZmokQxo(android.view.KeyEvent event) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m22061isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m22059isCtrlPressedZmokQxo(event)) {
                    long jM22055getKeyZmokQxo = KeyEvent_androidKt.m22055getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo, mappedKeys.m18046getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo, mappedKeys.m18047getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo, mappedKeys.m18048getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo, mappedKeys.m18045getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m22059isCtrlPressedZmokQxo(event)) {
                    long jM22055getKeyZmokQxo2 = KeyEvent_androidKt.m22055getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18046getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18047getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18048getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18045getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18050getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18044getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18040getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18039getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m22061isShiftPressedZmokQxo(event)) {
                    long jM22055getKeyZmokQxo3 = KeyEvent_androidKt.m22055getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18053getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_START;
                    } else if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18052getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_END;
                    }
                } else if (KeyEvent_androidKt.m22058isAltPressedZmokQxo(event)) {
                    long jM22055getKeyZmokQxo4 = KeyEvent_androidKt.m22055getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo4, mappedKeys4.m18040getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo4, mappedKeys4.m18044getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo18007mapZmokQxo(event) : keyCommand;
            }
        };
    }

    public static final KeyMapping commonKeyMapping(final Function1<? super KeyEvent, Boolean> function1) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo18007mapZmokQxo(android.view.KeyEvent event) {
                if (function1.invoke(KeyEvent.m22038boximpl(event)).booleanValue() && KeyEvent_androidKt.m22061isShiftPressedZmokQxo(event)) {
                    if (Key.m21747equalsimpl0(KeyEvent_androidKt.m22055getKeyZmokQxo(event), MappedKeys.INSTANCE.m18062getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (function1.invoke(KeyEvent.m22038boximpl(event)).booleanValue()) {
                    long jM22055getKeyZmokQxo = KeyEvent_androidKt.m22055getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo, mappedKeys.m18041getCEK5gGoQ()) ? true : Key.m21747equalsimpl0(jM22055getKeyZmokQxo, mappedKeys.m18051getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo, mappedKeys.m18059getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo, mappedKeys.m18060getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo, mappedKeys.m18038getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo, mappedKeys.m18061getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo, mappedKeys.m18062getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m22059isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m22061isShiftPressedZmokQxo(event)) {
                    long jM22055getKeyZmokQxo2 = KeyEvent_androidKt.m22055getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18046getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18047getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18048getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18045getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18056getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18055getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18053getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18052getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo2, mappedKeys2.m18051getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM22055getKeyZmokQxo3 = KeyEvent_androidKt.m22055getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18046getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18047getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18048getDirectionUpEK5gGoQ())) {
                    return KeyCommand.f1265UP;
                }
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18045getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18056getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18055getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18053getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18052getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18049getEnterEK5gGoQ()) ? true : Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18054getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18040getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18044getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18057getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18043getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18042getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m21747equalsimpl0(jM22055getKeyZmokQxo3, mappedKeys3.m18058getTabEK5gGoQ())) {
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
