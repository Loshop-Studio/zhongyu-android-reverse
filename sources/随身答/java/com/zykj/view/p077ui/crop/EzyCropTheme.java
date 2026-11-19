package com.zykj.view.p077ui.crop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13413d2 = {"Lcom/zykj/view/ui/crop/EzyCropTheme;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class EzyCropTheme {

    /* renamed from: a */
    public static final EzyCropTheme f12909a = new EzyCropTheme("DARK", 0);

    /* renamed from: b */
    public static final EzyCropTheme f12910b = new EzyCropTheme("LIGHT", 1);

    /* renamed from: c */
    public static final /* synthetic */ EzyCropTheme[] f12911c;

    /* renamed from: d */
    public static final /* synthetic */ EnumEntries f12912d;

    static {
        EzyCropTheme[] ezyCropThemeArrM12023a = m12023a();
        f12911c = ezyCropThemeArrM12023a;
        f12912d = EnumEntriesKt.enumEntries(ezyCropThemeArrM12023a);
    }

    public EzyCropTheme(String str, int i9) {
    }

    /* renamed from: a */
    public static final /* synthetic */ EzyCropTheme[] m12023a() {
        return new EzyCropTheme[]{f12909a, f12910b};
    }

    public static EzyCropTheme valueOf(String str) {
        return (EzyCropTheme) Enum.valueOf(EzyCropTheme.class, str);
    }

    public static EzyCropTheme[] values() {
        return (EzyCropTheme[]) f12911c.clone();
    }
}
