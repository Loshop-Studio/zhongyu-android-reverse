package p138i6;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i6.d */
/* loaded from: classes5.dex */
public final class C8138d {

    /* renamed from: a */
    public static final C8138d f13911a = new C8138d();

    /* renamed from: a */
    public final Preferences.Key m13044a(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return PreferencesKeys.booleanKey("no_show_understand_dialog_" + userId);
    }
}
