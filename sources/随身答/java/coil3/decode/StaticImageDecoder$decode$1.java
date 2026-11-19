package coil3.decode;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.decode.StaticImageDecoder", m13451f = "StaticImageDecoder.kt", m13452i = {0}, m13453l = {168}, m13454m = "decode", m13455n = {"$this$withPermit$iv"}, m13456s = {"L$0"})
/* loaded from: classes3.dex */
public final class StaticImageDecoder$decode$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f2877a;

    /* renamed from: b */
    public /* synthetic */ Object f2878b;

    /* renamed from: c */
    public final /* synthetic */ StaticImageDecoder f2879c;

    /* renamed from: d */
    public int f2880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticImageDecoder$decode$1(StaticImageDecoder staticImageDecoder, Continuation continuation) {
        super(continuation);
        this.f2879c = staticImageDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2878b = obj;
        this.f2880d |= Integer.MIN_VALUE;
        return this.f2879c.mo9a(this);
    }
}
