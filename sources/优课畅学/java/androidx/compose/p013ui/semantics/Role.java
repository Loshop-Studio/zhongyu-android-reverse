package androidx.compose.p013ui.semantics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class Role {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Button = m26120constructorimpl(0);
    private static final int Checkbox = m26120constructorimpl(1);
    private static final int Switch = m26120constructorimpl(2);
    private static final int RadioButton = m26120constructorimpl(3);
    private static final int Tab = m26120constructorimpl(4);
    private static final int Image = m26120constructorimpl(5);
    private static final int DropdownList = m26120constructorimpl(6);
    private static final int ValuePicker = m26120constructorimpl(7);
    private static final int Carousel = m26120constructorimpl(8);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m26126getButtono7Vup1c() {
            return Role.Button;
        }

        /* renamed from: getCarousel-o7Vup1c, reason: not valid java name */
        public final int m26127getCarouselo7Vup1c() {
            return Role.Carousel;
        }

        /* renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m26128getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m26129getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }

        /* renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m26130getImageo7Vup1c() {
            return Role.Image;
        }

        /* renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m26131getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m26132getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m26133getTabo7Vup1c() {
            return Role.Tab;
        }

        /* renamed from: getValuePicker-o7Vup1c, reason: not valid java name */
        public final int m26134getValuePickero7Vup1c() {
            return Role.ValuePicker;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Role(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Role m26119boximpl(int i10) {
        return new Role(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m26120constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26121equalsimpl(int i10, Object obj) {
        return (obj instanceof Role) && i10 == ((Role) obj).m26125unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26122equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26123hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26124toStringimpl(int i10) {
        return m26122equalsimpl0(i10, Button) ? "Button" : m26122equalsimpl0(i10, Checkbox) ? "Checkbox" : m26122equalsimpl0(i10, Switch) ? "Switch" : m26122equalsimpl0(i10, RadioButton) ? "RadioButton" : m26122equalsimpl0(i10, Tab) ? "Tab" : m26122equalsimpl0(i10, Image) ? "Image" : m26122equalsimpl0(i10, DropdownList) ? "DropdownList" : m26122equalsimpl0(i10, ValuePicker) ? "Picker" : m26122equalsimpl0(i10, Carousel) ? "Carousel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m26121equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26123hashCodeimpl(this.value);
    }

    public String toString() {
        return m26124toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26125unboximpl() {
        return this.value;
    }
}
