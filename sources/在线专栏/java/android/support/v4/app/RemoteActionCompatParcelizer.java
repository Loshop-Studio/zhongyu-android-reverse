package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import androidx.versionedparcelable.AbstractC0764a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0764a abstractC0764a) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(abstractC0764a);
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0764a abstractC0764a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, abstractC0764a);
    }
}
