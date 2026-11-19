package coil3.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* loaded from: classes3.dex */
public interface Logger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m7880d2 = {"Lcoil3/util/Logger$Level;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "coil-core_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
    public static final class Level {

        /* renamed from: a */
        public static final Level f1943a = new Level("Verbose", 0);

        /* renamed from: b */
        public static final Level f1944b = new Level("Debug", 1);

        /* renamed from: c */
        public static final Level f1945c = new Level("Info", 2);

        /* renamed from: d */
        public static final Level f1946d = new Level("Warn", 3);

        /* renamed from: e */
        public static final Level f1947e = new Level("Error", 4);

        /* renamed from: f */
        public static final /* synthetic */ Level[] f1948f;

        /* renamed from: g */
        public static final /* synthetic */ EnumEntries f1949g;

        static {
            Level[] levelArrM2025a = m2025a();
            f1948f = levelArrM2025a;
            f1949g = EnumEntriesKt.enumEntries(levelArrM2025a);
        }

        public Level(String str, int i6) {
        }

        /* renamed from: a */
        public static final /* synthetic */ Level[] m2025a() {
            return new Level[]{f1943a, f1944b, f1945c, f1946d, f1947e};
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) f1948f.clone();
        }
    }

    /* renamed from: a */
    Level m2023a();

    /* renamed from: b */
    void m2024b(String str, Level level, String str2, Throwable th);
}
