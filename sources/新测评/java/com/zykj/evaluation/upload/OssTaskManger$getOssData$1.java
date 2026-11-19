package com.zykj.evaluation.upload;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.OssTaskManger", m13596f = "OssTaskManger.kt", m13597i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m13598l = {55, 72}, m13599m = "getOssData", m13600n = {"fileType", "fileExt", "fileResource", "date", "uuid", "timeMillis", "fileType", "fileExt", "fileResource", "date", "uuid", "modulePath", "resPath", "reqStr", "sign", "tokenReq", "timeMillis", "userId", "$i$a$-runCatching-OssTaskManger$getOssData$2"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "J$0", "J$1", "I$0"})
/* loaded from: classes4.dex */
public final class OssTaskManger$getOssData$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10313a;

    /* renamed from: b */
    public Object f10314b;

    /* renamed from: c */
    public Object f10315c;

    /* renamed from: d */
    public Object f10316d;

    /* renamed from: e */
    public Object f10317e;

    /* renamed from: f */
    public Object f10318f;

    /* renamed from: g */
    public Object f10319g;

    /* renamed from: h */
    public Object f10320h;

    /* renamed from: i */
    public Object f10321i;

    /* renamed from: j */
    public Object f10322j;

    /* renamed from: k */
    public long f10323k;

    /* renamed from: l */
    public long f10324l;

    /* renamed from: m */
    public int f10325m;

    /* renamed from: n */
    public /* synthetic */ Object f10326n;

    /* renamed from: o */
    public final /* synthetic */ OssTaskManger f10327o;

    /* renamed from: p */
    public int f10328p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OssTaskManger$getOssData$1(OssTaskManger ossTaskManger, Continuation continuation) {
        super(continuation);
        this.f10327o = ossTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10326n = obj;
        this.f10328p |= Integer.MIN_VALUE;
        return this.f10327o.m10474e(null, null, null, null, null, 0L, this);
    }
}
