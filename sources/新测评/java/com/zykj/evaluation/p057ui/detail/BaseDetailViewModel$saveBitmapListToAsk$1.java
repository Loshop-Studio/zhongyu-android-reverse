package com.zykj.evaluation.p057ui.detail;

import android.graphics.Bitmap;
import android.os.Environment;
import com.blankj.utilcode.util.ImageUtils;
import io.microshow.rxffmpeg.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel$saveBitmapListToAsk$1", m13596f = "BaseDetailViewModel.kt", m13597i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m13598l = {441, BuildConfig.VERSION_CODE, 498}, m13599m = "invokeSuspend", m13600n = {"stemPath", "answerPath", "stemPath", "answerPath", "urlList", "noAnswerBitmap", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "imageLoader", "request", "$i$f$map", "$i$f$mapTo", "$i$a$-map-BaseDetailViewModel$saveBitmapListToAsk$1$bitmapList$1", "stemPath", "answerPath", "urlList", "noAnswerBitmap", "bitmapList", "answerBitmap"}, m13601s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$8", "L$9", "L$10", "L$11", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
@SourceDebugExtension({"SMAP\nBaseDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapListToAsk$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,684:1\n774#2:685\n865#2,2:686\n1193#2,2:688\n1267#2,4:690\n1193#2,2:694\n1267#2,4:696\n1869#2,2:700\n1563#2:702\n1634#2,3:703\n37#3:706\n36#3,3:707\n*S KotlinDebug\n*F\n+ 1 BaseDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapListToAsk$1\n*L\n463#1:685\n463#1:686,2\n465#1:688,2\n465#1:690,4\n468#1:694,2\n468#1:696,4\n470#1:700,2\n482#1:702\n482#1:703,3\n497#1:706\n497#1:707,3\n*E\n"})
/* loaded from: classes4.dex */
public final class BaseDetailViewModel$saveBitmapListToAsk$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9134a;

    /* renamed from: b */
    public Object f9135b;

    /* renamed from: c */
    public Object f9136c;

    /* renamed from: d */
    public Object f9137d;

    /* renamed from: e */
    public Object f9138e;

    /* renamed from: f */
    public Object f9139f;

    /* renamed from: g */
    public Object f9140g;

    /* renamed from: h */
    public Object f9141h;

    /* renamed from: i */
    public Object f9142i;

    /* renamed from: j */
    public Object f9143j;

    /* renamed from: k */
    public Object f9144k;

    /* renamed from: l */
    public Object f9145l;

    /* renamed from: m */
    public Object f9146m;

    /* renamed from: n */
    public int f9147n;

    /* renamed from: o */
    public int f9148o;

    /* renamed from: p */
    public int f9149p;

    /* renamed from: q */
    public int f9150q;

    /* renamed from: r */
    public final /* synthetic */ Bitmap f9151r;

    /* renamed from: s */
    public final /* synthetic */ BaseDetailViewModel f9152s;

    /* renamed from: t */
    public final /* synthetic */ Function1 f9153t;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel$saveBitmapListToAsk$1$1", m13596f = "BaseDetailViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.evaluation.ui.detail.BaseDetailViewModel$saveBitmapListToAsk$1$1 */
    public static final class C68901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* renamed from: a */
        public int f9154a;

        /* renamed from: b */
        public final /* synthetic */ Bitmap f9155b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C68901(Bitmap bitmap, Continuation continuation) {
            super(2, continuation);
            this.f9155b = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C68901(this.f9155b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9154a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath() + "/" + System.currentTimeMillis() + ".jpg";
            if (ImageUtils.save(this.f9155b, str, Bitmap.CompressFormat.JPEG, true)) {
                return str;
            }
            return null;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C68901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel$saveBitmapListToAsk$1$4", m13596f = "BaseDetailViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.evaluation.ui.detail.BaseDetailViewModel$saveBitmapListToAsk$1$4 */
    public static final class C68914 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* renamed from: a */
        public int f9156a;

        /* renamed from: b */
        public final /* synthetic */ Bitmap f9157b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C68914(Bitmap bitmap, Continuation continuation) {
            super(2, continuation);
            this.f9157b = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C68914(this.f9157b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9156a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath() + "/" + System.currentTimeMillis() + ".jpg";
            if (ImageUtils.save(this.f9157b, str, Bitmap.CompressFormat.JPEG, true)) {
                return str;
            }
            return null;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C68914) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDetailViewModel$saveBitmapListToAsk$1(Bitmap bitmap, BaseDetailViewModel baseDetailViewModel, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f9151r = bitmap;
        this.f9152s = baseDetailViewModel;
        this.f9153t = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseDetailViewModel$saveBitmapListToAsk$1(this.f9151r, this.f9152s, this.f9153t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b3, code lost:
    
        if (r5 == r1) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:79:0x02a6, B:85:0x02bd], limit reached: 112 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0348  */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r4v33, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v38, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0296 -> B:77:0x029c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x02c4 -> B:87:0x02cf). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.BaseDetailViewModel$saveBitmapListToAsk$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapListToAsk$1.smali:252
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseDetailViewModel$saveBitmapListToAsk$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
