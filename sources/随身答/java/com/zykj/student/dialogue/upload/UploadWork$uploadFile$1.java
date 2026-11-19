package com.zykj.student.dialogue.upload;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.upload.UploadWork", m13451f = "UploadWork.kt", m13452i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, m13453l = {219, 227, 235, 239}, m13454m = "uploadFile", m13455n = {"file", "fileRelativePath", "credential", "type", "file", "fileRelativePath", "credential", "uploadFile", "type", "file", "fileRelativePath", "credential", "uploadFile", "type", "file", "fileRelativePath", "credential", "uploadFile", "type"}, m13456s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
/* loaded from: classes5.dex */
public final class UploadWork$uploadFile$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f11972a;

    /* renamed from: b */
    public Object f11973b;

    /* renamed from: c */
    public Object f11974c;

    /* renamed from: d */
    public Object f11975d;

    /* renamed from: e */
    public Object f11976e;

    /* renamed from: f */
    public /* synthetic */ Object f11977f;

    /* renamed from: g */
    public final /* synthetic */ UploadWork f11978g;

    /* renamed from: h */
    public int f11979h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWork$uploadFile$1(UploadWork uploadWork, Continuation continuation) {
        super(continuation);
        this.f11978g = uploadWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11977f = obj;
        this.f11979h |= Integer.MIN_VALUE;
        return this.f11978g.m11061e(0, null, null, null, this);
    }
}
