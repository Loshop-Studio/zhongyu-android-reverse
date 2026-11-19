package androidx.compose.p011ui.text.platform.extensions;

import android.text.style.LocaleSpan;
import androidx.annotation.RequiresApi;
import androidx.compose.p011ui.text.intl.Locale;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.platform.AndroidTextPaint;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m5110d2 = {"Landroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods;", "", "<init>", "()V", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "localeSpan", "(Landroidx/compose/ui/text/intl/LocaleList;)Ljava/lang/Object;", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "textPaint", "Ld6/s;", "setTextLocales", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;Landroidx/compose/ui/text/intl/LocaleList;)V", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@RequiresApi(24)
@SourceDebugExtension({"SMAP\nLocaleExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,41:1\n1549#2:42\n1620#2,3:43\n1549#2:48\n1620#2,3:49\n37#3,2:46\n37#3,2:52\n*S KotlinDebug\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n*L\n33#1:42\n33#1:43,3\n38#1:48\n38#1:49,3\n33#1:46,2\n38#1:52,2\n*E\n"})
/* loaded from: classes2.dex */
public final class LocaleListHelperMethods {
    public static final int $stable = 0;

    @NotNull
    public static final LocaleListHelperMethods INSTANCE = new LocaleListHelperMethods();

    private LocaleListHelperMethods() {
    }

    @RequiresApi(24)
    @NotNull
    public final Object localeSpan(@NotNull LocaleList localeList) {
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(localeList, 10));
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new LocaleSpan(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    @RequiresApi(24)
    public final void setTextLocales(@NotNull AndroidTextPaint textPaint, @NotNull LocaleList localeList) {
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(localeList, 10));
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        textPaint.setTextLocales(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
