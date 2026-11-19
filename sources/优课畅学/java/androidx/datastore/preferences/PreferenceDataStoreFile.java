package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import java.io.File;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class PreferenceDataStoreFile {
    public static final File preferencesDataStoreFile(Context context, String name) {
        AbstractC9133u.m16133g(context, "<this>");
        AbstractC9133u.m16133g(name, "name");
        return DataStoreFile.dataStoreFile(context, name + ".preferences_pb");
    }
}
