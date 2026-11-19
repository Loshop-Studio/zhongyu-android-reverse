package coil3.util;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* loaded from: classes3.dex */
public interface Logger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Level {

        /* renamed from: c */
        public static final Level f3934c = new Level("Verbose", 0);

        /* renamed from: d */
        public static final Level f3935d = new Level("Debug", 1);

        /* renamed from: e */
        public static final Level f3936e = new Level("Info", 2);

        /* renamed from: f */
        public static final Level f3937f = new Level("Warn", 3);

        /* renamed from: g */
        public static final Level f3938g = new Level("Error", 4);

        /* renamed from: h */
        public static final /* synthetic */ Level[] f3939h;

        /* renamed from: i */
        public static final /* synthetic */ InterfaceC11943a f3940i;

        static {
            Level[] levelArrM3293a = m3293a();
            f3939h = levelArrM3293a;
            f3940i = AbstractC9953a.m20230a(levelArrM3293a);
        }

        public Level(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ Level[] m3293a() {
            return new Level[]{f3934c, f3935d, f3936e, f3937f, f3938g};
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) f3939h.clone();
        }
    }

    /* renamed from: a */
    Level m3291a();

    /* renamed from: b */
    void m3292b(String str, Level level, String str2, Throwable th);
}
