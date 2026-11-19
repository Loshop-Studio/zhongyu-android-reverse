package androidx.compose.p012ui.semantics;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, m13413d2 = {"Landroidx/compose/ui/semantics/Role;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes2.dex */
public final class Role {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Button = m23218constructorimpl(0);
    private static final int Checkbox = m23218constructorimpl(1);
    private static final int Switch = m23218constructorimpl(2);
    private static final int RadioButton = m23218constructorimpl(3);
    private static final int Tab = m23218constructorimpl(4);
    private static final int Image = m23218constructorimpl(5);
    private static final int DropdownList = m23218constructorimpl(6);
    private static final int ValuePicker = m23218constructorimpl(7);
    private static final int Carousel = m23218constructorimpl(8);

    @Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, m13413d2 = {"Landroidx/compose/ui/semantics/Role$Companion;", "", "()V", "Button", "Landroidx/compose/ui/semantics/Role;", "getButton-o7Vup1c", "()I", "I", "Carousel", "getCarousel-o7Vup1c", "Checkbox", "getCheckbox-o7Vup1c", "DropdownList", "getDropdownList-o7Vup1c", "Image", "getImage-o7Vup1c", "RadioButton", "getRadioButton-o7Vup1c", "Switch", "getSwitch-o7Vup1c", "Tab", "getTab-o7Vup1c", "ValuePicker", "getValuePicker-o7Vup1c", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m23224getButtono7Vup1c() {
            return Role.Button;
        }

        /* renamed from: getCarousel-o7Vup1c, reason: not valid java name */
        public final int m23225getCarouselo7Vup1c() {
            return Role.Carousel;
        }

        /* renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m23226getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m23227getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }

        /* renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m23228getImageo7Vup1c() {
            return Role.Image;
        }

        /* renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m23229getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m23230getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m23231getTabo7Vup1c() {
            return Role.Tab;
        }

        /* renamed from: getValuePicker-o7Vup1c, reason: not valid java name */
        public final int m23232getValuePickero7Vup1c() {
            return Role.ValuePicker;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Role(int i9) {
        this.value = i9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Role m23217boximpl(int i9) {
        return new Role(i9);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m23218constructorimpl(int i9) {
        return i9;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23219equalsimpl(int i9, Object obj) {
        return (obj instanceof Role) && i9 == ((Role) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23220equalsimpl0(int i9, int i10) {
        return i9 == i10;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23221hashCodeimpl(int i9) {
        return Integer.hashCode(i9);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23222toStringimpl(int i9) {
        return m23220equalsimpl0(i9, Button) ? "Button" : m23220equalsimpl0(i9, Checkbox) ? "Checkbox" : m23220equalsimpl0(i9, Switch) ? "Switch" : m23220equalsimpl0(i9, RadioButton) ? "RadioButton" : m23220equalsimpl0(i9, Tab) ? "Tab" : m23220equalsimpl0(i9, Image) ? "Image" : m23220equalsimpl0(i9, DropdownList) ? "DropdownList" : m23220equalsimpl0(i9, ValuePicker) ? "Picker" : m23220equalsimpl0(i9, Carousel) ? "Carousel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m23219equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m23221hashCodeimpl(this.value);
    }

    public String toString() {
        return m23222toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
