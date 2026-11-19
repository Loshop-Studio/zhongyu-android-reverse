package retrofit2;

import com.umeng.commonsdk.statistics.UMErrorCode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m5174d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@"}, m5175d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "suspendAndThrow"}, m5176k = 3, m5177mv = {1, 4, 0})
@DebugMetadata(m5191c = "retrofit2.KotlinExtensions", m5192f = "KotlinExtensions.kt", m5193i = {0}, m5194l = {UMErrorCode.E_UM_BE_RAW_OVERSIZE}, m5195m = "suspendAndThrow", m5196n = {"$this$suspendAndThrow"}, m5197s = {"L$0"})
/* loaded from: classes2.dex */
public final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f5674a;

    /* renamed from: b */
    public int f5675b;

    /* renamed from: c */
    public Object f5676c;

    public KotlinExtensions$suspendAndThrow$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5674a = obj;
        this.f5675b |= Integer.MIN_VALUE;
        return KotlinExtensions.m6166d(null, this);
    }
}
