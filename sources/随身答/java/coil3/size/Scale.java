package coil3.size;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13413d2 = {"Lcoil3/size/Scale;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "coil-core_release"}, m13414k = 1, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class Scale {

    /* renamed from: a */
    public static final Scale f3123a = new Scale("FILL", 0);

    /* renamed from: b */
    public static final Scale f3124b = new Scale("FIT", 1);

    /* renamed from: c */
    public static final /* synthetic */ Scale[] f3125c;

    /* renamed from: d */
    public static final /* synthetic */ EnumEntries f3126d;

    static {
        Scale[] scaleArrM2907a = m2907a();
        f3125c = scaleArrM2907a;
        f3126d = EnumEntriesKt.enumEntries(scaleArrM2907a);
    }

    public Scale(String str, int i9) {
    }

    /* renamed from: a */
    public static final /* synthetic */ Scale[] m2907a() {
        return new Scale[]{f3123a, f3124b};
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) f3125c.clone();
    }
}
