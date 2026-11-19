package p215k2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: k2.p */
/* loaded from: classes3.dex */
public abstract class AbstractC9798p {
    /* renamed from: a */
    public static final String m19798a(String str) {
        AbstractC9979u.m20294g(str, "<this>");
        Matcher matcher = Pattern.compile("[0-9]{4}_[0-9]{2}_[0-9]{2}").matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String strGroup = matcher.group();
        AbstractC9979u.m20293f(strGroup, "group(...)");
        return strGroup;
    }
}
