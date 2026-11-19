package androidx.compose.p014ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p014ui.node.WeakReference;
import androidx.compose.p014ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.p014ui.text.input.NullableInputConnectionWrapper_androidKt;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final class InputMethodSession {
    private boolean disposed;
    private final InterfaceC9529a onAllConnectionsClosed;
    private final PlatformTextInputMethodRequest request;
    private final Object lock = new Object();
    private MutableVector<WeakReference<NullableInputConnectionWrapper>> connections = new MutableVector<>(new WeakReference[16], 0);

    public InputMethodSession(PlatformTextInputMethodRequest platformTextInputMethodRequest, InterfaceC9529a interfaceC9529a) {
        this.request = platformTextInputMethodRequest;
        this.onAllConnectionsClosed = interfaceC9529a;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            NullableInputConnectionWrapper NullableInputConnectionWrapper = NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(this.request.createInputConnection(editorInfo), new InterfaceC9540l() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((NullableInputConnectionWrapper) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(NullableInputConnectionWrapper nullableInputConnectionWrapper) {
                    nullableInputConnectionWrapper.disposeDelegate();
                    MutableVector mutableVector = this.this$0.connections;
                    Object[] objArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            i10 = -1;
                            break;
                        } else if (AbstractC9979u.m20289b((WeakReference) objArr[i10], nullableInputConnectionWrapper)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 >= 0) {
                        this.this$0.connections.removeAt(i10);
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
                for (int i10 = 0; i10 < size; i10++) {
                    NullableInputConnectionWrapper nullableInputConnectionWrapper = weakReferenceArr[i10].get();
                    if (nullableInputConnectionWrapper != null) {
                        nullableInputConnectionWrapper.disposeDelegate();
                    }
                }
                this.connections.clear();
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isActive() {
        return !this.disposed;
    }
}
