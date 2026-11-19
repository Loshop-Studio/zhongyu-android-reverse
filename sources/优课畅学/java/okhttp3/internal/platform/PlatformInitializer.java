package okhttp3.internal.platform;

import android.content.Context;
import androidx.startup.Initializer;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

/* loaded from: classes5.dex */
public final class PlatformInitializer implements Initializer<AbstractC9570c> {
    @Override // androidx.startup.Initializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC9570c create(Context context) {
        AbstractC9133u.m16133g(context, "context");
        C9571d.f19219a.m18117d(context);
        return AbstractC9570c.f19216a.m18112e();
    }

    @Override // androidx.startup.Initializer
    public List dependencies() {
        return AbstractC8809v.m14771n();
    }
}
