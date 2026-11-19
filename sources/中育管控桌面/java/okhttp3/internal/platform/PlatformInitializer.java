package okhttp3.internal.platform;

import android.content.Context;
import androidx.startup.Initializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m7880d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Landroidx/startup/Initializer;", "Lokhttp3/internal/platform/c;", "<init>", "()V", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)Lokhttp3/internal/platform/c;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "okhttp"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class PlatformInitializer implements Initializer<AbstractC7536c> {
    @Override // androidx.startup.Initializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC7536c create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C7537d.f9997a.m8936d(context);
        return AbstractC7536c.f9994a.m8931e();
    }

    @Override // androidx.startup.Initializer
    public List dependencies() {
        return CollectionsKt.emptyList();
    }
}
