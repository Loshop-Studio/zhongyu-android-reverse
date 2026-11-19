package androidx.compose.runtime;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\u0016\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0081\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m7880d2 = {"oldSynchronized", "R", "lock", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "block", "Lkotlin/Function0;", "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runtime_release"}, m7881k = 5, m7882mv = {1, 9, 0}, m7884xi = 48, m7885xs = "androidx/compose/runtime/ActualJvm_jvmKt")
@SourceDebugExtension({"SMAP\nOldSynchronized.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OldSynchronized.android.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__OldSynchronized_androidKt\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,33:1\n33#2,2:34\n*S KotlinDebug\n*F\n+ 1 OldSynchronized.android.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__OldSynchronized_androidKt\n*L\n32#1:34,2\n*E\n"})
/* loaded from: classes2.dex */
final /* synthetic */ class ActualJvm_jvmKt__OldSynchronized_androidKt {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "not expected to be referenced directly as the old version had to be inlined")
    @PublishedApi
    @JvmName(name = "synchronized")
    /* renamed from: synchronized, reason: not valid java name */
    public static final /* synthetic */ <R> R m13276synchronized(Object obj, Function0<? extends R> function0) {
        R rInvoke;
        synchronized (obj) {
            try {
                rInvoke = function0.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return rInvoke;
    }
}
