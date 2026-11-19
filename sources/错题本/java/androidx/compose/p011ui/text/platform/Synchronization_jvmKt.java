package androidx.compose.p011ui.text.platform;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0081\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"", "ref", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "makeSynchronizedObject", "(Ljava/lang/Object;)Landroidx/compose/ui/text/platform/SynchronizedObject;", "R", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Landroidx/compose/ui/text/platform/SynchronizedObject;Lr6/a;)Ljava/lang/Object;", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "Synchronization_jvmKt")
/* loaded from: classes2.dex */
public final class Synchronization_jvmKt {
    @NotNull
    public static final SynchronizedObject makeSynchronizedObject(@Nullable Object obj) {
        return new SynchronizedObject();
    }

    public static /* synthetic */ SynchronizedObject makeSynchronizedObject$default(Object obj, int i, Object obj2) {
        return new SynchronizedObject();
    }

    @PublishedApi
    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m13039synchronized(@NotNull SynchronizedObject synchronizedObject, @NotNull InterfaceC6469a interfaceC6469a) {
        R r;
        synchronized (synchronizedObject) {
            r = (R) interfaceC6469a.invoke();
        }
        return r;
    }
}
