package android.view.viewmodel.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "lock", "Lkotlin/Function0;", "action", "synchronizedImpl", "(Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;Lr6/a;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SynchronizedObject_jvmKt {
    public static final <T> T synchronizedImpl(@NotNull SynchronizedObject lock, @NotNull InterfaceC6469a action) {
        T t8;
        AbstractC5830k.m5330g(lock, "lock");
        AbstractC5830k.m5330g(action, "action");
        synchronized (lock) {
            t8 = (T) action.invoke();
        }
        return t8;
    }
}
