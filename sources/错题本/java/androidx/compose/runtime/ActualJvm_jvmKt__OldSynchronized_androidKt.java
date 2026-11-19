package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081\b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m5110d2 = {"R", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lr6/a;)Ljava/lang/Object;", "oldSynchronized", "runtime_release"}, m5111k = 5, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/compose/runtime/ActualJvm_jvmKt")
@SourceDebugExtension({"SMAP\nOldSynchronized.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OldSynchronized.android.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__OldSynchronized_androidKt\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,33:1\n33#2,2:34\n*S KotlinDebug\n*F\n+ 1 OldSynchronized.android.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__OldSynchronized_androidKt\n*L\n32#1:34,2\n*E\n"})
/* loaded from: classes.dex */
final /* synthetic */ class ActualJvm_jvmKt__OldSynchronized_androidKt {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "not expected to be referenced directly as the old version had to be inlined")
    @PublishedApi
    @JvmName(name = "synchronized")
    /* renamed from: synchronized, reason: not valid java name */
    public static final /* synthetic */ <R> R m10035synchronized(Object obj, InterfaceC6469a interfaceC6469a) {
        R r;
        synchronized (obj) {
            r = (R) interfaceC6469a.invoke();
        }
        return r;
    }
}
