package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p309qc.C10786q;
import sd.InterfaceC11125j;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BringIntoViewRequestPriorityQueue {
    public static final int $stable = MutableVector.$stable;
    private final MutableVector<ContentInViewNode.Request> requests = new MutableVector<>(new ContentInViewNode.Request[16], 0);

    public final void cancelAndRemoveAll(Throwable th) {
        MutableVector<ContentInViewNode.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        InterfaceC11125j[] interfaceC11125jArr = new InterfaceC11125j[size];
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC11125jArr[i10] = mutableVector.content[i10].getContinuation();
        }
        for (int i11 = 0; i11 < size; i11++) {
            interfaceC11125jArr[i11].mo20530o(th);
        }
        if (this.requests.getSize() == 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("uncancelled requests present");
    }

    public final boolean enqueue(final ContentInViewNode.Request request) {
        Rect rect = (Rect) request.getCurrentBounds().invoke();
        if (rect == null) {
            InterfaceC11125j continuation = request.getContinuation();
            Result.C9921a c9921a = Result.f23263d;
            continuation.resumeWith(Result.m20054c(C10786q.f26013a));
            return false;
        }
        request.getContinuation().mo20536u(new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.enqueue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Throwable th) {
                BringIntoViewRequestPriorityQueue.this.requests.remove(request);
            }
        });
        C10405j c10405jM21768u = AbstractC10410o.m21768u(0, this.requests.getSize());
        int iM21733b = c10405jM21768u.m21733b();
        int iM21734c = c10405jM21768u.m21734c();
        if (iM21733b <= iM21734c) {
            while (true) {
                Rect rect2 = (Rect) this.requests.content[iM21734c].getCurrentBounds().invoke();
                if (rect2 != null) {
                    Rect rectIntersect = rect.intersect(rect2);
                    if (AbstractC9979u.m20289b(rectIntersect, rect)) {
                        this.requests.add(iM21734c + 1, request);
                        return true;
                    }
                    if (!AbstractC9979u.m20289b(rectIntersect, rect2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= iM21734c) {
                            while (true) {
                                this.requests.content[iM21734c].getContinuation().mo20530o(cancellationException);
                                if (size == iM21734c) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (iM21734c == iM21733b) {
                    break;
                }
                iM21734c--;
            }
        }
        this.requests.add(0, request);
        return true;
    }

    public final void forEachFromSmallest(InterfaceC9540l interfaceC9540l) {
        MutableVector mutableVector = this.requests;
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        if (size < objArr.length) {
            while (size >= 0) {
                interfaceC9540l.invoke(((ContentInViewNode.Request) objArr[size]).getCurrentBounds().invoke());
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
        C10405j c10405jM21768u = AbstractC10410o.m21768u(0, this.requests.getSize());
        int iM21733b = c10405jM21768u.m21733b();
        int iM21734c = c10405jM21768u.m21734c();
        if (iM21733b <= iM21734c) {
            while (true) {
                this.requests.content[iM21733b].getContinuation().resumeWith(Result.m20054c(C10786q.f26013a));
                if (iM21733b == iM21734c) {
                    break;
                } else {
                    iM21733b++;
                }
            }
        }
        this.requests.clear();
    }

    public final void resumeAndRemoveWhile(InterfaceC9540l interfaceC9540l) {
        while (this.requests.getSize() != 0 && ((Boolean) interfaceC9540l.invoke(((ContentInViewNode.Request) this.requests.last()).getCurrentBounds().invoke())).booleanValue()) {
            ((ContentInViewNode.Request) this.requests.removeAt(this.requests.getSize() - 1)).getContinuation().resumeWith(Result.m20054c(C10786q.f26013a));
        }
    }
}
