package p170v3;

import androidx.datastore.core.DataStore;
import com.zykj.huiwei.launcher.receiver.LogoutReceiver;

/* renamed from: v3.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7794c {
    /* renamed from: a */
    public static void m9364a(LogoutReceiver logoutReceiver, DataStore dataStore) {
        logoutReceiver.serverDataStore = dataStore;
    }

    /* renamed from: b */
    public static void m9365b(LogoutReceiver logoutReceiver, DataStore dataStore) {
        logoutReceiver.settingDataStore = dataStore;
    }

    /* renamed from: c */
    public static void m9366c(LogoutReceiver logoutReceiver, DataStore dataStore) {
        logoutReceiver.studentDataStore = dataStore;
    }

    /* renamed from: d */
    public static void m9367d(LogoutReceiver logoutReceiver, DataStore dataStore) {
        logoutReceiver.userDataStore = dataStore;
    }
}
