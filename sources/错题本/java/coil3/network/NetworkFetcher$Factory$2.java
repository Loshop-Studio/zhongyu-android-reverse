package coil3.network;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p152r6.InterfaceC6471c;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final /* synthetic */ class NetworkFetcher$Factory$2 extends FunctionReferenceImpl implements InterfaceC6471c {
    public static final NetworkFetcher$Factory$2 INSTANCE = new NetworkFetcher$Factory$2();

    public NetworkFetcher$Factory$2() {
        super(1, AbstractC3315g.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
    }

    @Override // p152r6.InterfaceC6471c
    public final InterfaceC3313e invoke(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(applicationContext, ConnectivityManager.class);
        if (connectivityManager != null && ContextCompat.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new C3314f(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return InterfaceC3313e.f2002a;
    }
}
