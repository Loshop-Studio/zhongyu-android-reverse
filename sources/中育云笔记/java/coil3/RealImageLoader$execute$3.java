package coil3;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.RealImageLoader", m26211f = "RealImageLoader.kt", m26212l = {117, 129, PatchStatus.CODE_LOAD_LIB_JSON}, m26213m = "execute")
/* loaded from: classes3.dex */
public final class RealImageLoader$execute$3 extends ContinuationImpl {

    /* renamed from: c */
    public Object f3556c;

    /* renamed from: d */
    public Object f3557d;

    /* renamed from: e */
    public Object f3558e;

    /* renamed from: f */
    public Object f3559f;

    /* renamed from: g */
    public Object f3560g;

    /* renamed from: h */
    public Object f3561h;

    /* renamed from: i */
    public Object f3562i;

    /* renamed from: j */
    public int f3563j;

    /* renamed from: k */
    public /* synthetic */ Object f3564k;

    /* renamed from: l */
    public final /* synthetic */ RealImageLoader f3565l;

    /* renamed from: m */
    public int f3566m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$3(RealImageLoader realImageLoader, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f3565l = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3564k = obj;
        this.f3566m |= Integer.MIN_VALUE;
        return this.f3565l.m2981g(null, 0, this);
    }
}
