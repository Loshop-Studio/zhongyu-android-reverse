package coil3.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* loaded from: classes3.dex */
public interface Logger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m13413d2 = {"Lcoil3/util/Logger$Level;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "coil-core_release"}, m13414k = 1, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Level {

        /* renamed from: a */
        public static final Level f3146a = new Level("Verbose", 0);

        /* renamed from: b */
        public static final Level f3147b = new Level("Debug", 1);

        /* renamed from: c */
        public static final Level f3148c = new Level("Info", 2);

        /* renamed from: d */
        public static final Level f3149d = new Level("Warn", 3);

        /* renamed from: e */
        public static final Level f3150e = new Level("Error", 4);

        /* renamed from: f */
        public static final /* synthetic */ Level[] f3151f;

        /* renamed from: g */
        public static final /* synthetic */ EnumEntries f3152g;

        static {
            Level[] levelArrM2919a = m2919a();
            f3151f = levelArrM2919a;
            f3152g = EnumEntriesKt.enumEntries(levelArrM2919a);
        }

        public Level(String str, int i9) {
        }

        /* renamed from: a */
        public static final /* synthetic */ Level[] m2919a() {
            return new Level[]{f3146a, f3147b, f3148c, f3149d, f3150e};
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) f3151f.clone();
        }
    }

    /* renamed from: a */
    Level m2917a();

    /* renamed from: b */
    void m2918b(String str, Level level, String str2, Throwable th);
}
