package com.zykj.evaluation.p057ui.sketch;

import com.blankj.utilcode.util.ZipUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p148io.FilesKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sketch.SketchPlayViewModel$downloadSketch$1$taskEnd$3$file$1", m13596f = "SketchPlayViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class SketchPlayViewModel$downloadSketch$1$taskEnd$3$file$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {

    /* renamed from: a */
    public int f10183a;

    /* renamed from: b */
    public final /* synthetic */ File f10184b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayViewModel$downloadSketch$1$taskEnd$3$file$1(File file, Continuation continuation) {
        super(2, continuation);
        this.f10184b = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SketchPlayViewModel$downloadSketch$1$taskEnd$3$file$1(this.f10184b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM24299constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10183a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        File file = this.f10184b;
        try {
            Result.Companion companion = Result.INSTANCE;
            String parent = file.getParent();
            Intrinsics.checkNotNull(parent);
            File file2 = new File(parent, FilesKt.getNameWithoutExtension(file));
            ZipUtils.unzipFile(file, file2);
            objM24299constructorimpl = Result.m24299constructorimpl(file2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m24305isFailureimpl(objM24299constructorimpl)) {
            return null;
        }
        return objM24299constructorimpl;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SketchPlayViewModel$downloadSketch$1$taskEnd$3$file$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
