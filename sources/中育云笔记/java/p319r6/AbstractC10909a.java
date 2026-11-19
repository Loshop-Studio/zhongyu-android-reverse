package p319r6;

import java.util.Locale;

/* renamed from: r6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10909a {
    /* renamed from: a */
    public static Locale m23747a(int i10) {
        switch (i10) {
            case 1:
                return Locale.TRADITIONAL_CHINESE;
            case 2:
                return Locale.ENGLISH;
            case 3:
                return Locale.KOREA;
            case 4:
                return Locale.GERMANY;
            case 5:
                return Locale.FRANCE;
            case 6:
                return Locale.JAPAN;
            case 7:
                return new Locale("vi");
            case 8:
                return new Locale("es", "ES");
            case 9:
                return new Locale("pt", "PT");
            case 10:
                return new Locale("ar", "AE");
            case 11:
                return new Locale("ru", "rRU");
            default:
                return Locale.CHINESE;
        }
    }
}
