package coil3.size;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Scale {

    /* renamed from: c */
    public static final Scale f3910c = new Scale("FILL", 0);

    /* renamed from: d */
    public static final Scale f3911d = new Scale("FIT", 1);

    /* renamed from: e */
    public static final /* synthetic */ Scale[] f3912e;

    /* renamed from: f */
    public static final /* synthetic */ InterfaceC11943a f3913f;

    static {
        Scale[] scaleArrM3278a = m3278a();
        f3912e = scaleArrM3278a;
        f3913f = AbstractC9953a.m20230a(scaleArrM3278a);
    }

    public Scale(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ Scale[] m3278a() {
        return new Scale[]{f3910c, f3911d};
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) f3912e.clone();
    }
}
