package kotlin.reflect;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin(version = "1.1")
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"Lkotlin/reflect/KVariance;", "", "INVARIANT", "IN", "OUT", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class KVariance {

    /* renamed from: IN */
    public static final KVariance f9228IN;
    public static final KVariance INVARIANT;
    public static final KVariance OUT;

    /* renamed from: a */
    public static final /* synthetic */ KVariance[] f9229a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f9230b;

    static {
        KVariance kVariance = new KVariance("INVARIANT", 0);
        INVARIANT = kVariance;
        KVariance kVariance2 = new KVariance("IN", 1);
        f9228IN = kVariance2;
        KVariance kVariance3 = new KVariance("OUT", 2);
        OUT = kVariance3;
        KVariance[] kVarianceArr = {kVariance, kVariance2, kVariance3};
        f9229a = kVarianceArr;
        f9230b = AbstractC5817a.m5310a(kVarianceArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f9230b;
    }

    public static KVariance valueOf(String str) {
        return (KVariance) Enum.valueOf(KVariance.class, str);
    }

    public static KVariance[] values() {
        return (KVariance[]) f9229a.clone();
    }
}
