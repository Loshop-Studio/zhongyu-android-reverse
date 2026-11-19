package androidx.compose.foundation.text;

import androidx.compose.p012ui.input.key.Key;
import androidx.compose.p012ui.input.key.KeyEvent;
import androidx.compose.p012ui.input.key.KeyEvent_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(m13412d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, m13413d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m22492isCtrlPressedZmokQxo(((KeyEvent) obj).m22477unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo18440mapZmokQxo(android.view.KeyEvent event) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m22494isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m22492isCtrlPressedZmokQxo(event)) {
                    long jM22488getKeyZmokQxo = KeyEvent_androidKt.m22488getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, mappedKeys.m18479getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, mappedKeys.m18480getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, mappedKeys.m18481getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, mappedKeys.m18478getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m22492isCtrlPressedZmokQxo(event)) {
                    long jM22488getKeyZmokQxo2 = KeyEvent_androidKt.m22488getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18479getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18480getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18481getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18478getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18483getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18477getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18473getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18472getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m22494isShiftPressedZmokQxo(event)) {
                    long jM22488getKeyZmokQxo3 = KeyEvent_androidKt.m22488getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18486getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_START;
                    } else if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18485getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_END;
                    }
                } else if (KeyEvent_androidKt.m22491isAltPressedZmokQxo(event)) {
                    long jM22488getKeyZmokQxo4 = KeyEvent_androidKt.m22488getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo4, mappedKeys4.m18473getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo4, mappedKeys4.m18477getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo18440mapZmokQxo(event) : keyCommand;
            }
        };
    }

    public static final KeyMapping commonKeyMapping(final Function1<? super KeyEvent, Boolean> function1) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo18440mapZmokQxo(android.view.KeyEvent event) {
                if (function1.invoke(KeyEvent.m22471boximpl(event)).booleanValue() && KeyEvent_androidKt.m22494isShiftPressedZmokQxo(event)) {
                    if (Key.m22180equalsimpl0(KeyEvent_androidKt.m22488getKeyZmokQxo(event), MappedKeys.INSTANCE.m18495getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (function1.invoke(KeyEvent.m22471boximpl(event)).booleanValue()) {
                    long jM22488getKeyZmokQxo = KeyEvent_androidKt.m22488getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, mappedKeys.m18474getCEK5gGoQ()) ? true : Key.m22180equalsimpl0(jM22488getKeyZmokQxo, mappedKeys.m18484getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, mappedKeys.m18492getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, mappedKeys.m18493getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, mappedKeys.m18471getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, mappedKeys.m18494getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, mappedKeys.m18495getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m22492isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m22494isShiftPressedZmokQxo(event)) {
                    long jM22488getKeyZmokQxo2 = KeyEvent_androidKt.m22488getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18479getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18480getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18481getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18478getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18489getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18488getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18486getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18485getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo2, mappedKeys2.m18484getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM22488getKeyZmokQxo3 = KeyEvent_androidKt.m22488getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18479getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18480getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18481getDirectionUpEK5gGoQ())) {
                    return KeyCommand.f1077UP;
                }
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18478getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18489getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18488getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18486getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18485getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18482getEnterEK5gGoQ()) ? true : Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18487getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18473getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18477getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18490getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18476getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18475getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo3, mappedKeys3.m18491getTabEK5gGoQ())) {
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
