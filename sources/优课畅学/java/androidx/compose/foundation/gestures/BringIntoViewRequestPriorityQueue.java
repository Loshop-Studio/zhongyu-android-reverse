package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8321f;
import p123h7.C8736p;
import p135i8.InterfaceC8845j;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BringIntoViewRequestPriorityQueue {
    public static final int $stable = MutableVector.$stable;
    private final MutableVector<ContentInViewNode.Request> requests = new MutableVector<>(new ContentInViewNode.Request[16], 0);

    public final void cancelAndRemoveAll(Throwable th) {
        MutableVector<ContentInViewNode.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        InterfaceC8845j[] interfaceC8845jArr = new InterfaceC8845j[size];
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC8845jArr[i10] = mutableVector.content[i10].getContinuation();
        }
        for (int i11 = 0; i11 < size; i11++) {
            interfaceC8845jArr[i11].mo14871i(th);
        }
        if (this.requests.getSize() == 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("uncancelled requests present");
    }

    public final boolean enqueue(final ContentInViewNode.Request request) {
        Rect rect = (Rect) request.getCurrentBounds().invoke();
        if (rect == null) {
            InterfaceC8845j continuation = request.getContinuation();
            Result.C9076a c9076a = Result.f17350b;
            continuation.resumeWith(Result.m15909b(C8736p.f16368a));
            return false;
        }
        request.getContinuation().mo14873r(new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.enqueue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Throwable th) {
                BringIntoViewRequestPriorityQueue.this.requests.remove(request);
            }
        });
        C8321f c8321fM13525t = AbstractC8323h.m13525t(0, this.requests.getSize());
        int iM13496b = c8321fM13525t.m13496b();
        int iM13497c = c8321fM13525t.m13497c();
        if (iM13496b <= iM13497c) {
            while (true) {
                Rect rect2 = (Rect) this.requests.content[iM13497c].getCurrentBounds().invoke();
                if (rect2 != null) {
                    Rect rectIntersect = rect.intersect(rect2);
                    if (AbstractC9133u.m16128b(rectIntersect, rect)) {
                        this.requests.add(iM13497c + 1, request);
                        return true;
                    }
                    if (!AbstractC9133u.m16128b(rectIntersect, rect2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= iM13497c) {
                            while (true) {
                                this.requests.content[iM13497c].getContinuation().mo14871i(cancellationException);
                                if (size == iM13497c) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (iM13497c == iM13496b) {
                    break;
                }
                iM13497c--;
            }
        }
        this.requests.add(0, request);
        return true;
    }

    public final void forEachFromSmallest(InterfaceC10570l interfaceC10570l) {
        MutableVector mutableVector = this.requests;
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        if (size < objArr.length) {
            while (size >= 0) {
                interfaceC10570l.invoke(((ContentInViewNode.Request) objArr[size]).getCurrentBounds().invoke());
                size--;
            }
        }
    }

    public final int getSize() {
        return this.requests.getSize();
    }

    public final boolean isEmpty() {
        return this.requests.getSize() == 0;
    }

    public final void resumeAndRemoveAll() {
        C8321f c8321fM13525t = AbstractC8323h.m13525t(0, this.requests.getSize());
        int iM13496b = c8321fM13525t.m13496b();
        int iM13497c = c8321fM13525t.m13497c();
        if (iM13496b <= iM13497c) {
            while (true) {
                this.requests.content[iM13496b].getContinuation().resumeWith(Result.m15909b(C8736p.f16368a));
                if (iM13496b == iM13497c) {
                    break;
                } else {
                    iM13496b++;
                }
            }
        }
        this.requests.clear();
    }

    public final void resumeAndRemoveWhile(InterfaceC10570l interfaceC10570l) {
        while (this.requests.getSize() != 0 && ((Boolean) interfaceC10570l.invoke(((ContentInViewNode.Request) this.requests.last()).getCurrentBounds().invoke())).booleanValue()) {
            ((ContentInViewNode.Request) this.requests.removeAt(this.requests.getSize() - 1)).getContinuation().resumeWith(Result.m15909b(C8736p.f16368a));
        }
    }
}
