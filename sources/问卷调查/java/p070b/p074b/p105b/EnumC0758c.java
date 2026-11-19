package p070b.p074b.p105b;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b.b.b.c */
/* loaded from: classes.dex */
public abstract class EnumC0758c implements InterfaceC0763d {

    /* renamed from: b */
    public static final EnumC0758c f4389b;

    /* renamed from: c */
    public static final EnumC0758c f4390c;

    /* renamed from: d */
    public static final EnumC0758c f4391d;

    /* renamed from: e */
    public static final EnumC0758c f4392e;

    /* renamed from: f */
    public static final EnumC0758c f4393f;

    /* renamed from: g */
    public static final EnumC0758c f4394g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC0758c[] f4395h;

    /* renamed from: b.b.b.c$a */
    public enum a extends EnumC0758c {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // p070b.p074b.p105b.InterfaceC0763d
        /* renamed from: a */
        public String mo2428a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f4389b = aVar;
        EnumC0758c enumC0758c = new EnumC0758c("UPPER_CAMEL_CASE", 1) { // from class: b.b.b.c.b
            @Override // p070b.p074b.p105b.InterfaceC0763d
            /* renamed from: a */
            public String mo2428a(Field field) {
                return EnumC0758c.m2427c(field.getName());
            }
        };
        f4390c = enumC0758c;
        EnumC0758c enumC0758c2 = new EnumC0758c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: b.b.b.c.c
            @Override // p070b.p074b.p105b.InterfaceC0763d
            /* renamed from: a */
            public String mo2428a(Field field) {
                return EnumC0758c.m2427c(EnumC0758c.m2426b(field.getName(), " "));
            }
        };
        f4391d = enumC0758c2;
        EnumC0758c enumC0758c3 = new EnumC0758c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: b.b.b.c.d
            @Override // p070b.p074b.p105b.InterfaceC0763d
            /* renamed from: a */
            public String mo2428a(Field field) {
                return EnumC0758c.m2426b(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f4392e = enumC0758c3;
        EnumC0758c enumC0758c4 = new EnumC0758c("LOWER_CASE_WITH_DASHES", 4) { // from class: b.b.b.c.e
            @Override // p070b.p074b.p105b.InterfaceC0763d
            /* renamed from: a */
            public String mo2428a(Field field) {
                return EnumC0758c.m2426b(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f4393f = enumC0758c4;
        EnumC0758c enumC0758c5 = new EnumC0758c("LOWER_CASE_WITH_DOTS", 5) { // from class: b.b.b.c.f
            @Override // p070b.p074b.p105b.InterfaceC0763d
            /* renamed from: a */
            public String mo2428a(Field field) {
                return EnumC0758c.m2426b(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f4394g = enumC0758c5;
        f4395h = new EnumC0758c[]{aVar, enumC0758c, enumC0758c2, enumC0758c3, enumC0758c4, enumC0758c5};
    }

    public EnumC0758c(String str, int i, a aVar) {
    }

    /* renamed from: b */
    public static String m2426b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m2427c(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char cCharAt = str.charAt(i);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }

    public static EnumC0758c valueOf(String str) {
        return (EnumC0758c) Enum.valueOf(EnumC0758c.class, str);
    }

    public static EnumC0758c[] values() {
        return (EnumC0758c[]) f4395h.clone();
    }
}
