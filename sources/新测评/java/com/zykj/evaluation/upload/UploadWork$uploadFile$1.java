package com.zykj.evaluation.upload;

import androidx.compose.runtime.ComposerKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.UploadWork", m13596f = "UploadWork.kt", m13597i = {0, 0, 0, 0}, m13598l = {ComposerKt.providerMapsKey}, m13599m = "uploadFile", m13600n = {"file", "fileRelativePath", "credential", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY}, m13601s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes4.dex */
public final class UploadWork$uploadFile$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f10521a;

    /* renamed from: b */
    public Object f10522b;

    /* renamed from: c */
    public Object f10523c;

    /* renamed from: d */
    public Object f10524d;

    /* renamed from: e */
    public /* synthetic */ Object f10525e;

    /* renamed from: f */
    public final /* synthetic */ UploadWork f10526f;

    /* renamed from: g */
    public int f10527g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWork$uploadFile$1(UploadWork uploadWork, Continuation continuation) {
        super(continuation);
        this.f10526f = uploadWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10525e = obj;
        this.f10527g |= Integer.MIN_VALUE;
        return this.f10526f.m10517k(0, null, null, null, this);
    }
}
