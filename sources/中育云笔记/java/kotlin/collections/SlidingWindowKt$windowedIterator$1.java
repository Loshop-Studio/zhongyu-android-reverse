package kotlin.collections;

import com.alibaba.fastjson.asm.Opcodes;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p181hd.InterfaceC9544p;
import p296pd.AbstractC10661i;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m26211f = "SlidingWindow.kt", m26212l = {34, 40, 49, 55, Opcodes.ASTORE}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f23283c;

    /* renamed from: d */
    public Object f23284d;

    /* renamed from: e */
    public Object f23285e;

    /* renamed from: f */
    public int f23286f;

    /* renamed from: g */
    public int f23287g;

    /* renamed from: h */
    public int f23288h;

    /* renamed from: i */
    public int f23289i;

    /* renamed from: j */
    public /* synthetic */ Object f23290j;

    /* renamed from: k */
    public final /* synthetic */ int f23291k;

    /* renamed from: l */
    public final /* synthetic */ int f23292l;

    /* renamed from: m */
    public final /* synthetic */ Iterator f23293m;

    /* renamed from: n */
    public final /* synthetic */ boolean f23294n;

    /* renamed from: o */
    public final /* synthetic */ boolean f23295o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlidingWindowKt$windowedIterator$1(int i10, int i11, Iterator it, boolean z10, boolean z11, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23291k = i10;
        this.f23292l = i11;
        this.f23293m = it;
        this.f23294n = z10;
        this.f23295o = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.f23291k, this.f23292l, this.f23293m, this.f23294n, this.f23295o, interfaceC11588c);
        slidingWindowKt$windowedIterator$1.f23290j = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b1 -> B:17:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0143 -> B:60:0x0146). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0177 -> B:73:0x017a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(AbstractC10661i abstractC10661i, InterfaceC11588c interfaceC11588c) {
        return ((SlidingWindowKt$windowedIterator$1) create(abstractC10661i, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
