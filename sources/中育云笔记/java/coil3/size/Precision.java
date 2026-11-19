package coil3.size;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Precision {

    /* renamed from: c */
    public static final Precision f3906c = new Precision("EXACT", 0);

    /* renamed from: d */
    public static final Precision f3907d = new Precision("INEXACT", 1);

    /* renamed from: e */
    public static final /* synthetic */ Precision[] f3908e;

    /* renamed from: f */
    public static final /* synthetic */ InterfaceC11943a f3909f;

    static {
        Precision[] precisionArrM3277a = m3277a();
        f3908e = precisionArrM3277a;
        f3909f = AbstractC9953a.m20230a(precisionArrM3277a);
    }

    public Precision(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ Precision[] m3277a() {
        return new Precision[]{f3906c, f3907d};
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) f3908e.clone();
    }
}
