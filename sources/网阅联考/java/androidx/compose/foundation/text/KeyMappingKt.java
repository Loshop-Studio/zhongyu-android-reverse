package androidx.compose.foundation.text;

import androidx.compose.p006ui.input.key.Key;
import androidx.compose.p006ui.input.key.KeyEvent;
import androidx.compose.p006ui.input.key.KeyEvent_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(m5174d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000ø\u0001\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m5175d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m10370isCtrlPressedZmokQxo(((KeyEvent) obj).m10355unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo7616mapZmokQxo(android.view.KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m10372isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m10370isCtrlPressedZmokQxo(event)) {
                    long jM10366getKeyZmokQxo = KeyEvent_androidKt.m10366getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo, mappedKeys.m7636getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo, mappedKeys.m7637getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo, mappedKeys.m7638getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo, mappedKeys.m7635getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m10370isCtrlPressedZmokQxo(event)) {
                    long jM10366getKeyZmokQxo2 = KeyEvent_androidKt.m10366getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7636getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7637getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7638getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7635getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7640getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7634getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7630getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7629getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m10372isShiftPressedZmokQxo(event)) {
                    long jM10366getKeyZmokQxo3 = KeyEvent_androidKt.m10366getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7643getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_HOME;
                    } else if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7642getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_END;
                    }
                } else if (KeyEvent_androidKt.m10369isAltPressedZmokQxo(event)) {
                    long jM10366getKeyZmokQxo4 = KeyEvent_androidKt.m10366getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo4, mappedKeys4.m7630getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo4, mappedKeys4.m7634getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo7616mapZmokQxo(event) : keyCommand;
            }
        };
    }

    public static final KeyMapping commonKeyMapping(final Function1<? super KeyEvent, Boolean> shortcutModifier) {
        Intrinsics.checkNotNullParameter(shortcutModifier, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo7616mapZmokQxo(android.view.KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (shortcutModifier.invoke(KeyEvent.m10349boximpl(event)).booleanValue() && KeyEvent_androidKt.m10372isShiftPressedZmokQxo(event)) {
                    if (Key.m9771equalsimpl0(KeyEvent_androidKt.m10366getKeyZmokQxo(event), MappedKeys.INSTANCE.m7651getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (shortcutModifier.invoke(KeyEvent.m10349boximpl(event)).booleanValue()) {
                    long jM10366getKeyZmokQxo = KeyEvent_androidKt.m10366getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo, mappedKeys.m7631getCEK5gGoQ()) ? true : Key.m9771equalsimpl0(jM10366getKeyZmokQxo, mappedKeys.m7641getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo, mappedKeys.m7648getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo, mappedKeys.m7649getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo, mappedKeys.m7628getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo, mappedKeys.m7650getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo, mappedKeys.m7651getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m10370isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m10372isShiftPressedZmokQxo(event)) {
                    long jM10366getKeyZmokQxo2 = KeyEvent_androidKt.m10366getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7636getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7637getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7638getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7635getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7645getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7644getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7643getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7642getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo2, mappedKeys2.m7641getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM10366getKeyZmokQxo3 = KeyEvent_androidKt.m10366getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7636getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7637getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7638getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7635getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7645getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7644getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7643getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7642getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7639getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7630getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7634getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7646getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7633getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7632getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m9771equalsimpl0(jM10366getKeyZmokQxo3, mappedKeys3.m7647getTabEK5gGoQ())) {
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
