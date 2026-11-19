package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC0764a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0764a abstractC0764a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2632a = (IconCompat) abstractC0764a.m4031v(remoteActionCompat.f2632a, 1);
        remoteActionCompat.f2633b = abstractC0764a.m4021l(remoteActionCompat.f2633b, 2);
        remoteActionCompat.f2634c = abstractC0764a.m4021l(remoteActionCompat.f2634c, 3);
        remoteActionCompat.f2635d = (PendingIntent) abstractC0764a.m4027r(remoteActionCompat.f2635d, 4);
        remoteActionCompat.f2636e = abstractC0764a.m4017h(remoteActionCompat.f2636e, 5);
        remoteActionCompat.f2637f = abstractC0764a.m4017h(remoteActionCompat.f2637f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0764a abstractC0764a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC0764a.m4033x(false, false);
        abstractC0764a.m4012M(remoteActionCompat.f2632a, 1);
        abstractC0764a.m4003D(remoteActionCompat.f2633b, 2);
        abstractC0764a.m4003D(remoteActionCompat.f2634c, 3);
        abstractC0764a.m4007H(remoteActionCompat.f2635d, 4);
        abstractC0764a.m4035z(remoteActionCompat.f2636e, 5);
        abstractC0764a.m4035z(remoteActionCompat.f2637f, 6);
    }
}
