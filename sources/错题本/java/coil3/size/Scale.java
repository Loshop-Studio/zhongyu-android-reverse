package coil3.size;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m5110d2 = {"Lcoil3/size/Scale;", "", "FILL", "FIT", "coil-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class Scale {
    public static final Scale FILL;
    public static final Scale FIT;

    /* renamed from: a */
    public static final /* synthetic */ Scale[] f2061a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f2062b;

    static {
        Scale scale = new Scale("FILL", 0);
        FILL = scale;
        Scale scale2 = new Scale("FIT", 1);
        FIT = scale2;
        Scale[] scaleArr = {scale, scale2};
        f2061a = scaleArr;
        f2062b = AbstractC5817a.m5310a(scaleArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f2062b;
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) f2061a.clone();
    }
}
