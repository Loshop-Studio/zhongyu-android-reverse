package com.zykj.mistake.feature.notebook.detail;

import java.io.File;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.p102io.AbstractC5818a;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "", "<anonymous>", "(Lkotlinx/coroutines/v;)Z"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$downloadDraftStroke$4", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {0}, m5305l = {673}, m5306m = "invokeSuspend", m5307n = {"$this$withContext"}, m5308s = {"L$0"})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$downloadDraftStroke$4 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ File $draftDir;
    final /* synthetic */ String $localPath;
    final /* synthetic */ File $tempFile;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$downloadDraftStroke$4(MistakeDetailNewViewModel mistakeDetailNewViewModel, String str, File file, File file2, InterfaceC5631c<? super MistakeDetailNewViewModel$downloadDraftStroke$4> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeDetailNewViewModel;
        this.$localPath = str;
        this.$tempFile = file;
        this.$draftDir = file2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        MistakeDetailNewViewModel$downloadDraftStroke$4 mistakeDetailNewViewModel$downloadDraftStroke$4 = new MistakeDetailNewViewModel$downloadDraftStroke$4(this.this$0, this.$localPath, this.$tempFile, this.$draftDir, interfaceC5631c);
        mistakeDetailNewViewModel$downloadDraftStroke$4.L$0 = obj;
        return mistakeDetailNewViewModel$downloadDraftStroke$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM13956constructorimpl;
        InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean zBooleanValue = true;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            MistakeDetailNewViewModel mistakeDetailNewViewModel = this.this$0;
            String str = this.$localPath;
            this.L$0 = interfaceC6009v;
            this.label = 1;
            mistakeDetailNewViewModel.getClass();
            obj = MistakeDetailNewViewModel.m4129x(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        if (obj != null) {
            this.$tempFile.delete();
            return Boolean.TRUE;
        }
        File file = new File(this.$draftDir, "remote_draft.bin");
        file.delete();
        if (!this.$tempFile.renameTo(file)) {
            File file2 = this.$tempFile;
            try {
                AbstractC5818a.m5312v(file2, file);
                file2.delete();
                objM13956constructorimpl = Result.m13956constructorimpl(Boolean.TRUE);
            } catch (Throwable th) {
                objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
            }
            Boolean bool = Boolean.FALSE;
            if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
                objM13956constructorimpl = bool;
            }
            zBooleanValue = ((Boolean) objM13956constructorimpl).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super Boolean> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$downloadDraftStroke$4) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
