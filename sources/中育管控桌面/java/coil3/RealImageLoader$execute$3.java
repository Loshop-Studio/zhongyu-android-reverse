package coil3;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.RealImageLoader", m7918f = "RealImageLoader.kt", m7919i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, m7920l = {117, 129, 133}, m7921m = "execute", m7922n = {"initialRequest", "requestDelegate", "request", "eventListener", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "initialRequest", "requestDelegate", "request", "eventListener", "cachedPlaceholder", "sizeResolver", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "initialRequest", "requestDelegate", "request", "eventListener", "cachedPlaceholder", "sizeResolver", "size", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY}, m7923s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
/* loaded from: classes3.dex */
public final class RealImageLoader$execute$3 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1469a;

    /* renamed from: b */
    public Object f1470b;

    /* renamed from: c */
    public Object f1471c;

    /* renamed from: d */
    public Object f1472d;

    /* renamed from: e */
    public Object f1473e;

    /* renamed from: f */
    public Object f1474f;

    /* renamed from: g */
    public Object f1475g;

    /* renamed from: h */
    public int f1476h;

    /* renamed from: i */
    public /* synthetic */ Object f1477i;

    /* renamed from: j */
    public final /* synthetic */ RealImageLoader f1478j;

    /* renamed from: k */
    public int f1479k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$3(RealImageLoader realImageLoader, Continuation continuation) {
        super(continuation);
        this.f1478j = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1477i = obj;
        this.f1479k |= Integer.MIN_VALUE;
        return this.f1478j.m1656h(null, 0, this);
    }
}
