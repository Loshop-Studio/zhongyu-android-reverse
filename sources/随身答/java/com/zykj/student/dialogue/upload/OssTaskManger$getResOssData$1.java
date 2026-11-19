package com.zykj.student.dialogue.upload;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.upload.OssTaskManger", m13451f = "OssTaskManger.kt", m13452i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m13453l = {34, 59}, m13454m = "getResOssData", m13455n = {"fe", "fe", "modulePath", "resPath", "nonce", "reqStr", "sign", "tokenReq", "date", "objectKey", "userId", "ft", "fo", "ts", "$i$a$-runCatching-OssTaskManger$getResOssData$token$1"}, m13456s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0", "I$0", "I$1", "J$1", "I$2"})
/* loaded from: classes5.dex */
public final class OssTaskManger$getResOssData$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f11931a;

    /* renamed from: b */
    public Object f11932b;

    /* renamed from: c */
    public Object f11933c;

    /* renamed from: d */
    public Object f11934d;

    /* renamed from: e */
    public Object f11935e;

    /* renamed from: f */
    public Object f11936f;

    /* renamed from: g */
    public Object f11937g;

    /* renamed from: h */
    public Object f11938h;

    /* renamed from: i */
    public Object f11939i;

    /* renamed from: j */
    public long f11940j;

    /* renamed from: k */
    public long f11941k;

    /* renamed from: l */
    public int f11942l;

    /* renamed from: m */
    public int f11943m;

    /* renamed from: n */
    public int f11944n;

    /* renamed from: o */
    public /* synthetic */ Object f11945o;

    /* renamed from: p */
    public final /* synthetic */ OssTaskManger f11946p;

    /* renamed from: q */
    public int f11947q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OssTaskManger$getResOssData$1(OssTaskManger ossTaskManger, Continuation continuation) {
        super(continuation);
        this.f11946p = ossTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11945o = obj;
        this.f11947q |= Integer.MIN_VALUE;
        return this.f11946p.m11055c(null, this);
    }
}
