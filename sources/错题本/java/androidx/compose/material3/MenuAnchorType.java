package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, m5110d2 = {"Landroidx/compose/material3/MenuAnchorType;", "", HintConstants.AUTOFILL_HINT_NAME, "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class MenuAnchorType {

    @NotNull
    private final String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String PrimaryNotEditable = m8618constructorimpl("PrimaryNotEditable");

    @NotNull
    private static final String PrimaryEditable = m8618constructorimpl("PrimaryEditable");

    @NotNull
    private static final String SecondaryEditable = m8618constructorimpl("SecondaryEditable");

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m5110d2 = {"Landroidx/compose/material3/MenuAnchorType$Companion;", "", "()V", "PrimaryEditable", "Landroidx/compose/material3/MenuAnchorType;", "getPrimaryEditable-Mg6Rgbw", "()Ljava/lang/String;", "Ljava/lang/String;", "PrimaryNotEditable", "getPrimaryNotEditable-Mg6Rgbw", "SecondaryEditable", "getSecondaryEditable-Mg6Rgbw", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        /* renamed from: getPrimaryEditable-Mg6Rgbw, reason: not valid java name */
        public final String m8624getPrimaryEditableMg6Rgbw() {
            return MenuAnchorType.PrimaryEditable;
        }

        @NotNull
        /* renamed from: getPrimaryNotEditable-Mg6Rgbw, reason: not valid java name */
        public final String m8625getPrimaryNotEditableMg6Rgbw() {
            return MenuAnchorType.PrimaryNotEditable;
        }

        @NotNull
        /* renamed from: getSecondaryEditable-Mg6Rgbw, reason: not valid java name */
        public final String m8626getSecondaryEditableMg6Rgbw() {
            return MenuAnchorType.SecondaryEditable;
        }

        private Companion() {
        }
    }

    private /* synthetic */ MenuAnchorType(String str) {
        this.name = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MenuAnchorType m8617boximpl(String str) {
        return new MenuAnchorType(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static String m8618constructorimpl(String str) {
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8619equalsimpl(String str, Object obj) {
        return (obj instanceof MenuAnchorType) && AbstractC5830k.m5325b(str, ((MenuAnchorType) obj).getName());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8620equalsimpl0(String str, String str2) {
        return AbstractC5830k.m5325b(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8621hashCodeimpl(String str) {
        return str.hashCode();
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8622toStringimpl(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return m8619equalsimpl(this.name, obj);
    }

    public int hashCode() {
        return m8621hashCodeimpl(this.name);
    }

    @NotNull
    public String toString() {
        return m8622toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ String getName() {
        return this.name;
    }
}
