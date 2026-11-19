package p202p7;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p7.d */
/* loaded from: classes5.dex */
public final class C8860d {

    /* renamed from: b */
    public static final C8860d f15070b = new C8860d();

    /* renamed from: a */
    public static String f15069a = "preferences";

    /* renamed from: a */
    public final boolean m14860a(Context context, String str, boolean z9) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return context.getSharedPreferences(f15069a, 0).getBoolean(str, z9);
    }

    /* renamed from: b */
    public final int m14861b(Context context, String str, int i10) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return context.getSharedPreferences(f15069a, 0).getInt(str, i10);
    }

    /* renamed from: c */
    public final boolean m14862c(Context context, String str, boolean z9) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f15069a, 0).edit();
        editorEdit.putBoolean(str, z9);
        return editorEdit.commit();
    }
}
