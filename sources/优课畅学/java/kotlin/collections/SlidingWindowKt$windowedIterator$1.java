package kotlin.collections;

import androidx.databinding.library.baseAdapters.C3721BR;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p101f8.AbstractC8471i;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m17801f = "SlidingWindow.kt", m17802l = {34, 40, 49, 55, C3721BR.versionViewModel}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f17370a;

    /* renamed from: b */
    public Object f17371b;

    /* renamed from: c */
    public Object f17372c;

    /* renamed from: d */
    public int f17373d;

    /* renamed from: e */
    public int f17374e;

    /* renamed from: f */
    public int f17375f;

    /* renamed from: g */
    public int f17376g;

    /* renamed from: h */
    public /* synthetic */ Object f17377h;

    /* renamed from: i */
    public final /* synthetic */ int f17378i;

    /* renamed from: j */
    public final /* synthetic */ int f17379j;

    /* renamed from: k */
    public final /* synthetic */ Iterator f17380k;

    /* renamed from: l */
    public final /* synthetic */ boolean f17381l;

    /* renamed from: m */
    public final /* synthetic */ boolean f17382m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlidingWindowKt$windowedIterator$1(int i10, int i11, Iterator it, boolean z10, boolean z11, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f17378i = i10;
        this.f17379j = i11;
        this.f17380k = it;
        this.f17381l = z10;
        this.f17382m = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.f17378i, this.f17379j, this.f17380k, this.f17381l, this.f17382m, interfaceC9324c);
        slidingWindowKt$windowedIterator$1.f17377h = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(AbstractC8471i abstractC8471i, InterfaceC9324c interfaceC9324c) {
        return ((SlidingWindowKt$windowedIterator$1) create(abstractC8471i, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
}
