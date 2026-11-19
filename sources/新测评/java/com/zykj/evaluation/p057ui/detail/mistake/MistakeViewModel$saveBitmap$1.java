package com.zykj.evaluation.p057ui.detail.mistake;

import android.graphics.Bitmap;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import java.util.ArrayList;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import p101g7.C7589e;
import p306z5.C10013l1;
import p306z5.C9993f;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$saveBitmap$1", m13596f = "MistakeViewModel.kt", m13597i = {}, m13598l = {200}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nMistakeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,585:1\n230#2,3:586\n233#2,2:594\n1573#3:589\n1604#3,4:590\n*S KotlinDebug\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1\n*L\n217#1:586,3\n217#1:594,2\n219#1:589\n219#1:590,4\n*E\n"})
/* loaded from: classes4.dex */
public final class MistakeViewModel$saveBitmap$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9317a;

    /* renamed from: b */
    public final /* synthetic */ MistakeViewModel f9318b;

    /* renamed from: c */
    public final /* synthetic */ int f9319c;

    /* renamed from: d */
    public final /* synthetic */ Bitmap f9320d;

    /* renamed from: e */
    public final /* synthetic */ long f9321e;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$saveBitmap$1$1", m13596f = "MistakeViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$saveBitmap$1$1 */
    public static final class C69031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* renamed from: a */
        public int f9322a;

        /* renamed from: b */
        public final /* synthetic */ MistakeViewModel f9323b;

        /* renamed from: c */
        public final /* synthetic */ int f9324c;

        /* renamed from: d */
        public final /* synthetic */ Bitmap f9325d;

        /* renamed from: e */
        public final /* synthetic */ long f9326e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C69031(MistakeViewModel mistakeViewModel, int i10, Bitmap bitmap, long j10, Continuation continuation) {
            super(2, continuation);
            this.f9323b = mistakeViewModel;
            this.f9324c = i10;
            this.f9325d = bitmap;
            this.f9326e = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C69031(this.f9323b, this.f9324c, this.f9325d, this.f9326e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9322a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C7589e c7589e = this.f9323b.mPathManager;
            if (c7589e == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPathManager");
                c7589e = null;
            }
            String strM12469o = c7589e.m12469o(this.f9323b.m9578E(), this.f9324c);
            boolean zSave = ImageUtils.save(this.f9325d, strM12469o, Bitmap.CompressFormat.JPEG, true);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            LogUtils.m3239i("开始处理图片,ImageTrace", StringsKt.trimIndent("\n                保存环节日志:\n                - 存储路径: " + strM12469o + "\n                - 压缩及写入耗时: " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " ms\n                - 整个流程总耗时: " + (jCurrentTimeMillis2 - this.f9326e) + " ms\n                - 是否保存成功: " + zSave + "\n            "));
            return zSave ? strM12469o : "";
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C69031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeViewModel$saveBitmap$1(MistakeViewModel mistakeViewModel, int i10, Bitmap bitmap, long j10, Continuation continuation) {
        super(2, continuation);
        this.f9318b = mistakeViewModel;
        this.f9319c = i10;
        this.f9320d = bitmap;
        this.f9321e = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MistakeViewModel$saveBitmap$1(this.f9318b, this.f9319c, this.f9320d, this.f9321e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objWithContext;
        Object value;
        C10013l1 c10013l1;
        ArrayList arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9317a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C69031 c69031 = new C69031(this.f9318b, this.f9319c, this.f9320d, this.f9321e, null);
            this.f9317a = 1;
            objWithContext = BuildersKt.withContext(io2, c69031, this);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objWithContext = obj;
        }
        MistakeViewModel mistakeViewModel = this.f9318b;
        int i11 = this.f9319c;
        String str = (String) objWithContext;
        MutableStateFlow mutableStateFlow = mistakeViewModel._mistakeUiState;
        do {
            value = mutableStateFlow.getValue();
            c10013l1 = (C10013l1) value;
            List listM16854j = c10013l1.m16854j();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16854j, 10));
            int i12 = 0;
            for (Object obj2 : listM16854j) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                C9993f c9993fM16801b = (C9993f) obj2;
                if (i12 == i11) {
                    c9993fM16801b = C9993f.m16801b(c9993fM16801b, false, str, null, true, 5, null);
                }
                arrayList.add(c9993fM16801b);
                i12 = i13;
            }
        } while (!mutableStateFlow.compareAndSet(value, C10013l1.m16845b(c10013l1, null, 0L, false, null, arrayList, false, null, null, null, null, null, 2031, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MistakeViewModel$saveBitmap$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
