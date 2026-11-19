package com.zykj.evaluation.p057ui.sheet.composition;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.composition.CompositionViewModel$commit$1", m13596f = "CompositionViewModel.kt", m13597i = {}, m13598l = {117}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class CompositionViewModel$commit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9968a;

    /* renamed from: b */
    public final /* synthetic */ Function0 f9969b;

    /* renamed from: c */
    public final /* synthetic */ CompositionViewModel f9970c;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.composition.CompositionViewModel$commit$1$1", m13596f = "CompositionViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    @SourceDebugExtension({"SMAP\nCompositionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionViewModel.kt\ncom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,171:1\n13472#2,2:172\n13472#2,2:174\n13472#2,2:176\n*S KotlinDebug\n*F\n+ 1 CompositionViewModel.kt\ncom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1\n*L\n124#1:172,2\n148#1:174,2\n161#1:176,2\n*E\n"})
    /* renamed from: com.zykj.evaluation.ui.sheet.composition.CompositionViewModel$commit$1$1 */
    public static final class C69361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f9971a;

        /* renamed from: b */
        public final /* synthetic */ CompositionViewModel f9972b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C69361(CompositionViewModel compositionViewModel, Continuation continuation) {
            super(2, continuation);
            this.f9972b = compositionViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C69361(this.f9972b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9971a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            int i10 = 0;
            int i11 = 0;
            for (String str : this.f9972b.getMPicArray()) {
                BitmapFactory.decodeFile(str, options);
                int i12 = options.outWidth;
                if (i12 > i10) {
                    i10 = i12;
                }
                i11 += options.outHeight;
            }
            if (i10 == 0 || i11 == 0) {
                return Unit.INSTANCE;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            options.inJustDecodeBounds = false;
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            int i13 = 0;
            for (String str2 : this.f9972b.getMPicArray()) {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str2, options);
                canvas.drawBitmap(bitmapDecodeFile, 0.0f, i13, paint);
                i13 += options.outHeight;
                bitmapDecodeFile.recycle();
            }
            ImageUtils.save(bitmapCreateBitmap, this.f9972b.m10227c0(), Bitmap.CompressFormat.WEBP);
            for (String str3 : this.f9972b.getMPicArray()) {
                if (str3 != null && str3.length() != 0) {
                    FileUtils.delete(str3);
                }
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C69361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionViewModel$commit$1(Function0 function0, CompositionViewModel compositionViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9969b = function0;
        this.f9970c = compositionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompositionViewModel$commit$1(this.f9969b, this.f9970c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9968a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C69361 c69361 = new C69361(this.f9970c, null);
            this.f9968a = 1;
            if (BuildersKt.withContext(io2, c69361, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f9969b.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CompositionViewModel$commit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
