package kotlin;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"Lkotlin/DeprecationLevel;", "", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DeprecationLevel {
    public static final DeprecationLevel ERROR;
    public static final DeprecationLevel HIDDEN;
    public static final DeprecationLevel WARNING;

    /* renamed from: a */
    public static final /* synthetic */ DeprecationLevel[] f9152a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f9153b;

    static {
        DeprecationLevel deprecationLevel = new DeprecationLevel("WARNING", 0);
        WARNING = deprecationLevel;
        DeprecationLevel deprecationLevel2 = new DeprecationLevel("ERROR", 1);
        ERROR = deprecationLevel2;
        DeprecationLevel deprecationLevel3 = new DeprecationLevel("HIDDEN", 2);
        HIDDEN = deprecationLevel3;
        DeprecationLevel[] deprecationLevelArr = {deprecationLevel, deprecationLevel2, deprecationLevel3};
        f9152a = deprecationLevelArr;
        f9153b = AbstractC5817a.m5310a(deprecationLevelArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f9153b;
    }

    public static DeprecationLevel valueOf(String str) {
        return (DeprecationLevel) Enum.valueOf(DeprecationLevel.class, str);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[]) f9152a.clone();
    }
}
