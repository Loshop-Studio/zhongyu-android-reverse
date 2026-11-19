package coil3.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* loaded from: classes3.dex */
public interface Logger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m13558d2 = {"Lcoil3/util/Logger$Level;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "coil-core_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class Level {

        /* renamed from: a */
        public static final Level f3259a = new Level("Verbose", 0);

        /* renamed from: b */
        public static final Level f3260b = new Level("Debug", 1);

        /* renamed from: c */
        public static final Level f3261c = new Level("Info", 2);

        /* renamed from: d */
        public static final Level f3262d = new Level("Warn", 3);

        /* renamed from: e */
        public static final Level f3263e = new Level("Error", 4);

        /* renamed from: f */
        public static final /* synthetic */ Level[] f3264f;

        /* renamed from: g */
        public static final /* synthetic */ EnumEntries f3265g;

        static {
            Level[] levelArrM3199a = m3199a();
            f3264f = levelArrM3199a;
            f3265g = EnumEntriesKt.enumEntries(levelArrM3199a);
        }

        public Level(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ Level[] m3199a() {
            return new Level[]{f3259a, f3260b, f3261c, f3262d, f3263e};
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) f3264f.clone();
        }
    }

    /* renamed from: a */
    Level m3197a();

    /* renamed from: b */
    void m3198b(String str, Level level, String str2, Throwable th);
}
