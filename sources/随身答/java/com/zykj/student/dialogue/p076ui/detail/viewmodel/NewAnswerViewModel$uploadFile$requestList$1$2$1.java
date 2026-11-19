package com.zykj.student.dialogue.p076ui.detail.viewmodel;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.board.EzyPageRouter;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p161io.CloseableKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel$uploadFile$requestList$1$2$1", m13451f = "NewAnswerViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class NewAnswerViewModel$uploadFile$requestList$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11239a;

    /* renamed from: b */
    public final /* synthetic */ File f11240b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef f11241c;

    /* renamed from: d */
    public final /* synthetic */ NewAnswerViewModel f11242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewAnswerViewModel$uploadFile$requestList$1$2$1(File file, Ref.ObjectRef objectRef, NewAnswerViewModel newAnswerViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11240b = file;
        this.f11241c = objectRef;
        this.f11242d = newAnswerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NewAnswerViewModel$uploadFile$requestList$1$2$1(this.f11240b, this.f11241c, this.f11242d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11239a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FileInputStream fileInputStream = new FileInputStream(this.f11240b);
        Ref.ObjectRef objectRef = this.f11241c;
        NewAnswerViewModel newAnswerViewModel = this.f11242d;
        try {
            EzyPageRouter.PageRouter pageRouterM8903w = EzyPageRouter.PageRouter.m8903w(fileInputStream);
            String filePath = newAnswerViewModel.getFilePath();
            List listM8906q = pageRouterM8903w.m8906q();
            Intrinsics.checkNotNullExpressionValue(listM8906q, "getPageInfoList(...)");
            objectRef.element = filePath + "/" + ((EzyPageRouter.PageRouter.PageInfo) CollectionsKt.first(listM8906q)).getName() + "/screenshot.png";
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileInputStream, null);
            return Unit.INSTANCE;
        } finally {
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NewAnswerViewModel$uploadFile$requestList$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
