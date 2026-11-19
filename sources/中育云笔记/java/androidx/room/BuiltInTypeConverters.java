package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

@Target({})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface BuiltInTypeConverters {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ENABLED = new State("ENABLED", 0);
        public static final State DISABLED = new State("DISABLED", 1);
        public static final State INHERITED = new State("INHERITED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ENABLED, DISABLED, INHERITED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = AbstractC9953a.m20230a(stateArr$values);
        }

        private State(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    State byteBuffer() default State.INHERITED;

    State enums() default State.INHERITED;

    State uuid() default State.INHERITED;
}
