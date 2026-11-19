package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

@Target({})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface Index {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Order {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ Order[] $VALUES;
        public static final Order ASC = new Order("ASC", 0);
        public static final Order DESC = new Order("DESC", 1);

        private static final /* synthetic */ Order[] $values() {
            return new Order[]{ASC, DESC};
        }

        static {
            Order[] orderArr$values = $values();
            $VALUES = orderArr$values;
            $ENTRIES = AbstractC9953a.m20230a(orderArr$values);
        }

        private Order(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) $VALUES.clone();
        }
    }

    String name() default "";

    Order[] orders() default {};

    boolean unique() default false;

    String[] value();
}
