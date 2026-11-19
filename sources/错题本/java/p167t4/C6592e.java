package p167t4;

import android.view.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import p175u4.C6620g;

/* renamed from: t4.e */
/* loaded from: classes3.dex */
public final class C6592e {

    /* renamed from: a */
    public final NavHostController f11003a;

    public C6592e(NavHostController navController) {
        AbstractC5830k.m5330g(navController, "navController");
        this.f11003a = navController;
    }

    /* renamed from: a */
    public final void m6222a(Object obj, String str) {
        SavedStateHandle savedStateHandle;
        NavBackStackEntry previousBackStackEntry = this.f11003a.getPreviousBackStackEntry();
        if (previousBackStackEntry == null || (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) == null) {
            return;
        }
        savedStateHandle.set(str, obj);
    }

    /* renamed from: b */
    public final SavedStateHandle m6223b() {
        Object objM13956constructorimpl;
        try {
            objM13956constructorimpl = Result.m13956constructorimpl(this.f11003a.getBackStackEntry("home").getSavedStateHandle());
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
            objM13956constructorimpl = null;
        }
        return (SavedStateHandle) objM13956constructorimpl;
    }

    /* renamed from: c */
    public final void m6224c(C6620g c6620g, List navItems) {
        LinkedHashMap linkedHashMap;
        String str;
        AbstractC5830k.m5330g(navItems, "navItems");
        synchronized (C6595h.f11010a) {
            if (navItems.isEmpty()) {
                str = "";
            } else {
                while (true) {
                    linkedHashMap = C6595h.f11011b;
                    if (linkedHashMap.size() < 4) {
                        break;
                    }
                    Set setKeySet = linkedHashMap.keySet();
                    AbstractC5830k.m5329f(setKeySet, "<get-keys>(...)");
                    linkedHashMap.remove(AbstractC5805t.m5227g0(setKeySet));
                }
                String string = UUID.randomUUID().toString();
                AbstractC5830k.m5329f(string, "toString(...)");
                linkedHashMap.put(string, AbstractC5805t.m5217D0(navItems));
                str = string;
            }
        }
        try {
            NavController.navigate$default(this.f11003a, C6620g.m6261a(c6620g, str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        } catch (Throwable th) {
            C6595h.f11010a.m6229a(str);
            throw th;
        }
    }
}
