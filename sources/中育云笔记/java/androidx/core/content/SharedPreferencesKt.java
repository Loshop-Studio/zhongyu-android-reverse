package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class SharedPreferencesKt {
    @SuppressLint({"ApplySharedPref"})
    public static final void edit(SharedPreferences sharedPreferences, boolean z10, InterfaceC9540l interfaceC9540l) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        interfaceC9540l.invoke(editorEdit);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        interfaceC9540l.invoke(editorEdit);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
