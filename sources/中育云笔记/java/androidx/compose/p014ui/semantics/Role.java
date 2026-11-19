package androidx.compose.p014ui.semantics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class Role {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Button = m32722constructorimpl(0);
    private static final int Checkbox = m32722constructorimpl(1);
    private static final int Switch = m32722constructorimpl(2);
    private static final int RadioButton = m32722constructorimpl(3);
    private static final int Tab = m32722constructorimpl(4);
    private static final int Image = m32722constructorimpl(5);
    private static final int DropdownList = m32722constructorimpl(6);
    private static final int ValuePicker = m32722constructorimpl(7);
    private static final int Carousel = m32722constructorimpl(8);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m32728getButtono7Vup1c() {
            return Role.Button;
        }

        /* renamed from: getCarousel-o7Vup1c, reason: not valid java name */
        public final int m32729getCarouselo7Vup1c() {
            return Role.Carousel;
        }

        /* renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m32730getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m32731getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }

        /* renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m32732getImageo7Vup1c() {
            return Role.Image;
        }

        /* renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m32733getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m32734getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m32735getTabo7Vup1c() {
            return Role.Tab;
        }

        /* renamed from: getValuePicker-o7Vup1c, reason: not valid java name */
        public final int m32736getValuePickero7Vup1c() {
            return Role.ValuePicker;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Role(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Role m32721boximpl(int i10) {
        return new Role(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m32722constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32723equalsimpl(int i10, Object obj) {
        return (obj instanceof Role) && i10 == ((Role) obj).m32727unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32724equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32725hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32726toStringimpl(int i10) {
        return m32724equalsimpl0(i10, Button) ? "Button" : m32724equalsimpl0(i10, Checkbox) ? "Checkbox" : m32724equalsimpl0(i10, Switch) ? "Switch" : m32724equalsimpl0(i10, RadioButton) ? "RadioButton" : m32724equalsimpl0(i10, Tab) ? "Tab" : m32724equalsimpl0(i10, Image) ? "Image" : m32724equalsimpl0(i10, DropdownList) ? "DropdownList" : m32724equalsimpl0(i10, ValuePicker) ? "Picker" : m32724equalsimpl0(i10, Carousel) ? "Carousel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m32723equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m32725hashCodeimpl(this.value);
    }

    public String toString() {
        return m32726toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32727unboximpl() {
        return this.value;
    }
}
