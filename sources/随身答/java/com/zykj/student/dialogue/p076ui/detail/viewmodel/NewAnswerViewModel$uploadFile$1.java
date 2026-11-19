package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.taobao.sophix.PatchStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel", m13451f = "NewAnswerViewModel.kt", m13452i = {0, 0, 0, 0, 0, 0}, m13453l = {PatchStatus.CODE_LOAD_LIB_CPUABIS}, m13454m = "uploadFile", m13455n = {"imagePathList", "$this$uploadFile_u24lambda_u245", "v6File", "thumbnailPath", "$i$a$-apply-NewAnswerViewModel$uploadFile$requestList$1", "$i$a$-runCatching-NewAnswerViewModel$uploadFile$requestList$1$2"}, m13456s = {"L$0", "L$2", "L$3", "L$4", "I$0", "I$1"})
/* loaded from: classes5.dex */
public final class NewAnswerViewModel$uploadFile$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f11229a;

    /* renamed from: b */
    public Object f11230b;

    /* renamed from: c */
    public Object f11231c;

    /* renamed from: d */
    public Object f11232d;

    /* renamed from: e */
    public Object f11233e;

    /* renamed from: f */
    public int f11234f;

    /* renamed from: g */
    public int f11235g;

    /* renamed from: h */
    public /* synthetic */ Object f11236h;

    /* renamed from: i */
    public final /* synthetic */ NewAnswerViewModel f11237i;

    /* renamed from: j */
    public int f11238j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewAnswerViewModel$uploadFile$1(NewAnswerViewModel newAnswerViewModel, Continuation continuation) {
        super(continuation);
        this.f11237i = newAnswerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11236h = obj;
        this.f11238j |= Integer.MIN_VALUE;
        return this.f11237i.m10496v(null, this);
    }
}
