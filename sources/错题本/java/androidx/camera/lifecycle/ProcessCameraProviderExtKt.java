package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;", "Landroid/content/Context;", "context", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "awaitInstance", "(Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;Landroid/content/Context;Lh6/c;)Ljava/lang/Object;", "camera-lifecycle_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ProcessCameraProviderExtKt {
    @Nullable
    public static final Object awaitInstance(@NotNull ProcessCameraProvider.Companion companion, @NotNull Context context, @NotNull InterfaceC5631c<? super ProcessCameraProvider> interfaceC5631c) {
        return ListenableFutureKt.await(companion.getInstance(context), interfaceC5631c);
    }
}
