package androidx.compose.p014ui.text.font;

import androidx.collection.LruCache;
import androidx.compose.p014ui.text.font.TypefaceResult;
import androidx.compose.p014ui.text.platform.SynchronizedObject;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TypefaceRequestCache {
    public static final int $stable = 8;
    private final SynchronizedObject lock = new SynchronizedObject();
    private final LruCache<TypefaceRequest, TypefaceResult> resultCache = new LruCache<>(16);

    public final TypefaceResult get$ui_text_release(TypefaceRequest typefaceRequest) {
        TypefaceResult typefaceResult;
        synchronized (this.lock) {
            typefaceResult = this.resultCache.get(typefaceRequest);
        }
        return typefaceResult;
    }

    public final SynchronizedObject getLock$ui_text_release() {
        return this.lock;
    }

    public final int getSize$ui_text_release() {
        int size;
        synchronized (this.lock) {
            size = this.resultCache.size();
        }
        return size;
    }

    public final void preWarmCache(List<TypefaceRequest> list, InterfaceC9540l interfaceC9540l) {
        TypefaceResult typefaceResult;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            TypefaceRequest typefaceRequest = list.get(i10);
            synchronized (this.lock) {
                typefaceResult = this.resultCache.get(typefaceRequest);
            }
            if (typefaceResult == null) {
                try {
                    TypefaceResult typefaceResult2 = (TypefaceResult) interfaceC9540l.invoke(typefaceRequest);
                    if (typefaceResult2 instanceof TypefaceResult.Async) {
                        continue;
                    } else {
                        synchronized (this.lock) {
                            this.resultCache.put(typefaceRequest, typefaceResult2);
                        }
                    }
                } catch (Exception e10) {
                    throw new IllegalStateException("Could not load font", e10);
                }
            }
        }
    }

    public final State<Object> runCached(final TypefaceRequest typefaceRequest, InterfaceC9540l interfaceC9540l) {
        synchronized (this.lock) {
            TypefaceResult typefaceResult = this.resultCache.get(typefaceRequest);
            if (typefaceResult != null) {
                if (typefaceResult.getCacheable()) {
                    return typefaceResult;
                }
                this.resultCache.remove(typefaceRequest);
            }
            try {
                TypefaceResult typefaceResult2 = (TypefaceResult) interfaceC9540l.invoke(new InterfaceC9540l() { // from class: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TypefaceResult) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(TypefaceResult typefaceResult3) {
                        SynchronizedObject lock$ui_text_release = this.this$0.getLock$ui_text_release();
                        TypefaceRequestCache typefaceRequestCache = this.this$0;
                        TypefaceRequest typefaceRequest2 = typefaceRequest;
                        synchronized (lock$ui_text_release) {
                            try {
                                if (typefaceResult3.getCacheable()) {
                                    typefaceRequestCache.resultCache.put(typefaceRequest2, typefaceResult3);
                                } else {
                                    typefaceRequestCache.resultCache.remove(typefaceRequest2);
                                }
                                C10786q c10786q = C10786q.f26013a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                });
                synchronized (this.lock) {
                    try {
                        if (this.resultCache.get(typefaceRequest) == null && typefaceResult2.getCacheable()) {
                            this.resultCache.put(typefaceRequest, typefaceResult2);
                        }
                        C10786q c10786q = C10786q.f26013a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return typefaceResult2;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
