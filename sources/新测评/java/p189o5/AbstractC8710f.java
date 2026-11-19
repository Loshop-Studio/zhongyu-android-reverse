package p189o5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o5.f */
/* loaded from: classes4.dex */
public abstract class AbstractC8710f {
    /* renamed from: a */
    public static final String m14345a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Matcher matcher = Pattern.compile("[0-9]{4}_[0-9]{2}_[0-9]{2}").matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String strGroup = matcher.group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }
}
