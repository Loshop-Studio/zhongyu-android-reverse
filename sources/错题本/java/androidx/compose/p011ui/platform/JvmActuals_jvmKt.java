package androidx.compose.p011ui.platform;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\n\u0010\n\u001a\u00060\u0000j\u0002`\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0081\b¢\u0006\u0004\b\r\u0010\u000e*\f\b\u0000\u0010\u0011\"\u00020\u00102\u00020\u0010¨\u0006\u0012"}, m5110d2 = {"", "obj", "", HintConstants.AUTOFILL_HINT_NAME, "simpleIdentityToString", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "nativeClass", "(Ljava/lang/Object;)Ljava/lang/Object;", "R", "Landroidx/compose/ui/platform/SynchronizedObject;", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lr6/a;)Ljava/lang/Object;", "oldSynchronized", "Ljava/util/concurrent/atomic/AtomicInteger;", "AtomicInt", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class JvmActuals_jvmKt {
    public static /* synthetic */ void AtomicInt$annotations() {
    }

    @NotNull
    public static final Object nativeClass(@NotNull Object obj) {
        return obj.getClass();
    }

    @NotNull
    public static final String simpleIdentityToString(@NotNull Object obj, @Nullable String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        return str + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "not expected to be referenced directly as the old version had to be inlined")
    @PublishedApi
    @JvmName(name = "synchronized")
    /* renamed from: synchronized, reason: not valid java name */
    public static final /* synthetic */ <R> R m12472synchronized(Object obj, InterfaceC6469a interfaceC6469a) {
        R r;
        synchronized (obj) {
            r = (R) interfaceC6469a.invoke();
        }
        return r;
    }
}
