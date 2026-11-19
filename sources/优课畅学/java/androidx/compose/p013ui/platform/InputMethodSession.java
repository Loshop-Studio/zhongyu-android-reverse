package androidx.compose.p013ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p013ui.node.WeakReference;
import androidx.compose.p013ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.p013ui.text.input.NullableInputConnectionWrapper_androidKt;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class InputMethodSession {
    private boolean disposed;
    private final InterfaceC10559a onAllConnectionsClosed;
    private final PlatformTextInputMethodRequest request;
    private final Object lock = new Object();
    private MutableVector<WeakReference<NullableInputConnectionWrapper>> connections = new MutableVector<>(new WeakReference[16], 0);

    public InputMethodSession(PlatformTextInputMethodRequest platformTextInputMethodRequest, InterfaceC10559a interfaceC10559a) {
        this.request = platformTextInputMethodRequest;
        this.onAllConnectionsClosed = interfaceC10559a;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            NullableInputConnectionWrapper NullableInputConnectionWrapper = NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(this.request.createInputConnection(editorInfo), new InterfaceC10570l() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((NullableInputConnectionWrapper) obj);
                    return C8736p.f16368a;
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
                        } else if (AbstractC9133u.m16128b((WeakReference) objArr[i10], nullableInputConnectionWrapper)) {
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
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isActive() {
        return !this.disposed;
    }
}
