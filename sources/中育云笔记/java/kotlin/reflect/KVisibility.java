package kotlin.reflect;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class KVisibility {

    /* renamed from: c */
    public static final KVisibility f23434c = new KVisibility("PUBLIC", 0);

    /* renamed from: d */
    public static final KVisibility f23435d = new KVisibility("PROTECTED", 1);

    /* renamed from: e */
    public static final KVisibility f23436e = new KVisibility("INTERNAL", 2);

    /* renamed from: f */
    public static final KVisibility f23437f = new KVisibility("PRIVATE", 3);

    /* renamed from: g */
    public static final /* synthetic */ KVisibility[] f23438g;

    /* renamed from: h */
    public static final /* synthetic */ InterfaceC11943a f23439h;

    static {
        KVisibility[] kVisibilityArrM20335a = m20335a();
        f23438g = kVisibilityArrM20335a;
        f23439h = AbstractC9953a.m20230a(kVisibilityArrM20335a);
    }

    public KVisibility(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ KVisibility[] m20335a() {
        return new KVisibility[]{f23434c, f23435d, f23436e, f23437f};
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) f23438g.clone();
    }
}
