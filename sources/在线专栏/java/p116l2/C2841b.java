package p116l2;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: l2.b */
/* loaded from: classes.dex */
public final class C2841b {
    @NotNull
    /* renamed from: a */
    public static final SharedPreferences m9538a(@NotNull Context context) {
        C2769l.m9241e(context, "<this>");
        SharedPreferences sharedPreferences = context.getSharedPreferences("art", 0);
        C2769l.m9240d(sharedPreferences, "getSharedPreferences(\"art\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
