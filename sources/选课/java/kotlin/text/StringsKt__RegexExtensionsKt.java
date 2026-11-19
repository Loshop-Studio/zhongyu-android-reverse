package kotlin.text;

import com.zykj.message.client.BuildConfig;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: RegexExtensions.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b¨\u0006\u0007"}, m18d2 = {"toRegex", "Lkotlin/text/Regex;", BuildConfig.FLAVOR, "options", BuildConfig.FLAVOR, "Lkotlin/text/RegexOption;", "option", "kotlin-stdlib"}, m19k = 5, m20mv = {1, 4, 0}, m22xi = 1, m23xs = "kotlin/text/StringsKt")
/* loaded from: classes.dex */
class StringsKt__RegexExtensionsKt extends StringsKt__RegexExtensionsJVMKt {
    private static final Regex toRegex(String str) {
        return new Regex(str);
    }

    private static final Regex toRegex(String str, RegexOption regexOption) {
        return new Regex(str, regexOption);
    }

    private static final Regex toRegex(String str, Set<? extends RegexOption> set) {
        return new Regex(str, set);
    }
}
