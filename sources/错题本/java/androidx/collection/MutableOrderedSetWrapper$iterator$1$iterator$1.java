package androidx.collection;

import androidx.collection.MutableOrderedSetWrapper;
import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p214z6.AbstractC6832j;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {ExifInterface.LONGITUDE_EAST, "Lz6/j;", "Ld6/s;", "<anonymous>", "(Lz6/j;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", m5303f = "OrderedScatterSet.kt", m5304i = {0, 0, 0}, m5305l = {1489}, m5306m = "invokeSuspend", m5307n = {"$this$iterator", "nodes$iv", "previousNode$iv"}, m5308s = {"L$0", "L$3", "I$0"})
@SourceDebugExtension({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1\n+ 2 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 3 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1511:1\n255#2,6:1512\n261#2,4:1519\n1123#3:1518\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1\n*L\n1487#1:1512,6\n1487#1:1519,4\n1487#1:1518\n*E\n"})
/* loaded from: classes.dex */
public final class MutableOrderedSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements InterfaceC6473e {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableOrderedSetWrapper<E> this$0;
    final /* synthetic */ MutableOrderedSetWrapper.C05701 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper<E> mutableOrderedSetWrapper, MutableOrderedSetWrapper.C05701 c05701, InterfaceC5631c<? super MutableOrderedSetWrapper$iterator$1$iterator$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mutableOrderedSetWrapper;
        this.this$1 = c05701;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, interfaceC5631c);
        mutableOrderedSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableOrderedSetWrapper mutableOrderedSetWrapper;
        int i;
        MutableOrderedSetWrapper.C05701 c05701;
        long[] jArr;
        AbstractC6832j abstractC6832j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.label;
        if (i8 == 0) {
            AbstractC5774b.m5119b(obj);
            AbstractC6832j abstractC6832j2 = (AbstractC6832j) this.L$0;
            MutableOrderedScatterSet mutableOrderedScatterSet = ((MutableOrderedSetWrapper) this.this$0).parent;
            MutableOrderedSetWrapper.C05701 c057012 = this.this$1;
            mutableOrderedSetWrapper = this.this$0;
            long[] jArr2 = mutableOrderedScatterSet.nodes;
            i = mutableOrderedScatterSet.tail;
            c05701 = c057012;
            jArr = jArr2;
            abstractC6832j = abstractC6832j2;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            jArr = (long[]) this.L$3;
            mutableOrderedSetWrapper = (MutableOrderedSetWrapper) this.L$2;
            c05701 = (MutableOrderedSetWrapper.C05701) this.L$1;
            abstractC6832j = (AbstractC6832j) this.L$0;
            AbstractC5774b.m5119b(obj);
        }
        while (i != Integer.MAX_VALUE) {
            int i9 = (int) ((jArr[i] >> 31) & SieveCacheKt.NodeLinkMask);
            c05701.setCurrent(i);
            Object obj2 = mutableOrderedSetWrapper.parent.elements[i];
            this.L$0 = abstractC6832j;
            this.L$1 = c05701;
            this.L$2 = mutableOrderedSetWrapper;
            this.L$3 = jArr;
            this.I$0 = i9;
            this.label = 1;
            if (abstractC6832j.mo6491a(this, obj2) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = i9;
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(AbstractC6832j abstractC6832j, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create(abstractC6832j, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
