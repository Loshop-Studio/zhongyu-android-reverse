package p184x3;

import androidx.datastore.core.DataStore;
import com.zykj.huiwei.launcher.repository.UserRepository;
import com.zykj.huiwei.launcher.server.MyService;
import kotlinx.coroutines.flow.MutableStateFlow;
import p135q3.AbstractC7624a;
import p177w3.C7811a;

/* renamed from: x3.u */
/* loaded from: classes4.dex */
public abstract class AbstractC7853u {
    /* renamed from: a */
    public static void m9516a(MyService myService, C7811a c7811a) {
        myService.deviceRepository = c7811a;
    }

    /* renamed from: b */
    public static void m9517b(MyService myService, MutableStateFlow mutableStateFlow) {
        myService.headerBeanFlow = mutableStateFlow;
    }

    /* renamed from: c */
    public static void m9518c(MyService myService, AbstractC7624a abstractC7624a) {
        myService.refreshRepository = abstractC7624a;
    }

    /* renamed from: d */
    public static void m9519d(MyService myService, DataStore dataStore) {
        myService.serverDataStore = dataStore;
    }

    /* renamed from: e */
    public static void m9520e(MyService myService, DataStore dataStore) {
        myService.settingDataStore = dataStore;
    }

    /* renamed from: f */
    public static void m9521f(MyService myService, DataStore dataStore) {
        myService.userDataStore = dataStore;
    }

    /* renamed from: g */
    public static void m9522g(MyService myService, UserRepository userRepository) {
        myService.userRepository = userRepository;
    }
}
