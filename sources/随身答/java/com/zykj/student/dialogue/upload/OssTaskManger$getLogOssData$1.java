package com.zykj.student.dialogue.upload;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.taobao.sophix.PatchStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.upload.OssTaskManger", m13451f = "OssTaskManger.kt", m13452i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m13453l = {PatchStatus.CODE_LOAD_MFITEM, 101}, m13454m = "getLogOssData", m13455n = {"date", "fileName", "date", "fileName", "modulePath", "resPath", "fo", "fe", "nonce", "reqStr", "sign", "tokenReq", "objectKey", "userId", "fr", "ft", "ts", "$i$a$-runCatching-OssTaskManger$getLogOssData$token$1"}, m13456s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "J$0", "I$0", "I$1", "J$1", "I$2"})
/* loaded from: classes5.dex */
public final class OssTaskManger$getLogOssData$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f11912a;

    /* renamed from: b */
    public Object f11913b;

    /* renamed from: c */
    public Object f11914c;

    /* renamed from: d */
    public Object f11915d;

    /* renamed from: e */
    public Object f11916e;

    /* renamed from: f */
    public Object f11917f;

    /* renamed from: g */
    public Object f11918g;

    /* renamed from: h */
    public Object f11919h;

    /* renamed from: i */
    public Object f11920i;

    /* renamed from: j */
    public Object f11921j;

    /* renamed from: k */
    public Object f11922k;

    /* renamed from: l */
    public long f11923l;

    /* renamed from: m */
    public long f11924m;

    /* renamed from: n */
    public int f11925n;

    /* renamed from: o */
    public int f11926o;

    /* renamed from: p */
    public int f11927p;

    /* renamed from: q */
    public /* synthetic */ Object f11928q;

    /* renamed from: r */
    public final /* synthetic */ OssTaskManger f11929r;

    /* renamed from: s */
    public int f11930s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OssTaskManger$getLogOssData$1(OssTaskManger ossTaskManger, Continuation continuation) {
        super(continuation);
        this.f11929r = ossTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11928q = obj;
        this.f11930s |= Integer.MIN_VALUE;
        return this.f11929r.m11054b(null, null, this);
    }
}
