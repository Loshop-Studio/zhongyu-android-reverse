package android.view.viewmodel.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "lock", "Lkotlin/Function0;", "action", "synchronized", "(Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;Lr6/a;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSynchronizedObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 2 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,58:1\n23#2:59\n*S KotlinDebug\n*F\n+ 1 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n*L\n38#1:59\n*E\n"})
/* loaded from: classes2.dex */
public final class SynchronizedObjectKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m13591synchronized(@NotNull SynchronizedObject lock, @NotNull InterfaceC6469a action) {
        T t8;
        AbstractC5830k.m5330g(lock, "lock");
        AbstractC5830k.m5330g(action, "action");
        synchronized (lock) {
            t8 = (T) action.invoke();
        }
        return t8;
    }
}
