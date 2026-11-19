package androidx.compose.p011ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p011ui.node.WeakReference;
import androidx.compose.p011ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.p011ui.text.input.NullableInputConnectionWrapper_androidKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/ui/platform/InputMethodSession;", "", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "request", "Lkotlin/Function0;", "Ld6/s;", "onAllConnectionsClosed", "<init>", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lr6/a;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "dispose", "()V", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "Lr6/a;", "lock", "Ljava/lang/Object;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/WeakReference;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "connections", "Landroidx/compose/runtime/collection/MutableVector;", "", "disposed", "Z", "isActive", "()Z", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,183:1\n1101#2:184\n1083#2,2:185\n32#3,2:187\n32#3,2:190\n1#4:189\n423#5,9:192\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n*L\n122#1:184\n122#1:185,2\n136#1:187,2\n175#1:190,2\n178#1:192,9\n*E\n"})
/* loaded from: classes2.dex */
final class InputMethodSession {
    private boolean disposed;

    @NotNull
    private final InterfaceC6469a onAllConnectionsClosed;

    @NotNull
    private final PlatformTextInputMethodRequest request;

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private MutableVector<WeakReference<NullableInputConnectionWrapper>> connections = new MutableVector<>(new WeakReference[16], 0);

    public InputMethodSession(@NotNull PlatformTextInputMethodRequest platformTextInputMethodRequest, @NotNull InterfaceC6469a interfaceC6469a) {
        this.request = platformTextInputMethodRequest;
        this.onAllConnectionsClosed = interfaceC6469a;
    }

    @Nullable
    public final InputConnection createInputConnection(@NotNull EditorInfo outAttrs) {
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            NullableInputConnectionWrapper NullableInputConnectionWrapper = NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(this.request.createInputConnection(outAttrs), new InterfaceC6471c() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((NullableInputConnectionWrapper) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(NullableInputConnectionWrapper nullableInputConnectionWrapper) {
                    nullableInputConnectionWrapper.disposeDelegate();
                    MutableVector mutableVector = this.this$0.connections;
                    Object[] objArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            i = -1;
                            break;
                        } else if (AbstractC5830k.m5325b((WeakReference) objArr[i], nullableInputConnectionWrapper)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        this.this$0.connections.removeAt(i);
                    }
                    if (this.this$0.connections.getSize() == 0) {
                        this.this$0.onAllConnectionsClosed.invoke();
                    }
                }
            });
            this.connections.add(new WeakReference<>(NullableInputConnectionWrapper));
            return NullableInputConnectionWrapper;
        }
    }

    public final void dispose() {
        synchronized (this.lock) {
            try {
                this.disposed = true;
                MutableVector<WeakReference<NullableInputConnectionWrapper>> mutableVector = this.connections;
                WeakReference<NullableInputConnectionWrapper>[] weakReferenceArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    NullableInputConnectionWrapper nullableInputConnectionWrapper = weakReferenceArr[i].get();
                    if (nullableInputConnectionWrapper != null) {
                        nullableInputConnectionWrapper.disposeDelegate();
                    }
                }
                this.connections.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isActive() {
        return !this.disposed;
    }
}
