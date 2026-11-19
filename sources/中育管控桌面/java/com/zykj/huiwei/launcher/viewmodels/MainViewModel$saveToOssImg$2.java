package com.zykj.huiwei.launcher.viewmodels;

import android.net.Uri;
import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.MainViewModel$saveToOssImg$2", m7918f = "MainViewModel.kt", m7919i = {1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3}, m7920l = {140, 152, 165, 175}, m7921m = "invokeSuspend", m7922n = {"ossData", "it", "objectKey", "path", "size", "it", "$i$a$-let-MainViewModel$saveToOssImg$2$1", "$i$a$-let-MainViewModel$saveToOssImg$2$1$1", "ossData", "it", "objectKey", "path", "size", "it", "url", "fileName", HintConstants.AUTOFILL_HINT_NAME, "$i$a$-let-MainViewModel$saveToOssImg$2$1", "$i$a$-let-MainViewModel$saveToOssImg$2$1$1", "$i$a$-let-MainViewModel$saveToOssImg$2$1$1$1", "e", "remoteCodeException"}, m7923s = {"L$0", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2\n+ 2 Logger.kt\ncom/dylanc/longan/LoggerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n98#2,2:191\n57#2,2:193\n98#2,2:196\n57#2,2:198\n1#3:195\n1#3:200\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2\n*L\n159#1:191,2\n159#1:193,2\n162#1:196,2\n162#1:198,2\n159#1:195\n162#1:200\n*E\n"})
/* loaded from: classes4.dex */
public final class MainViewModel$saveToOssImg$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f7233a;

    /* renamed from: b */
    public Object f7234b;

    /* renamed from: c */
    public Object f7235c;

    /* renamed from: d */
    public Object f7236d;

    /* renamed from: e */
    public Object f7237e;

    /* renamed from: f */
    public Object f7238f;

    /* renamed from: g */
    public Object f7239g;

    /* renamed from: h */
    public Object f7240h;

    /* renamed from: i */
    public Object f7241i;

    /* renamed from: j */
    public int f7242j;

    /* renamed from: k */
    public int f7243k;

    /* renamed from: l */
    public int f7244l;

    /* renamed from: m */
    public int f7245m;

    /* renamed from: n */
    public final /* synthetic */ MainViewModel f7246n;

    /* renamed from: o */
    public final /* synthetic */ String f7247o;

    /* renamed from: p */
    public final /* synthetic */ String f7248p;

    /* renamed from: q */
    public final /* synthetic */ Uri f7249q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$saveToOssImg$2(MainViewModel mainViewModel, String str, String str2, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.f7246n = mainViewModel;
        this.f7247o = str;
        this.f7248p = str2;
        this.f7249q = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$saveToOssImg$2(this.f7246n, this.f7247o, this.f7248p, this.f7249q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x027a, code lost:
    
        if (r2.m5509b(r3, r5) == r12) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0202 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:12:0x0051, B:17:0x0079, B:34:0x012b, B:37:0x0135, B:40:0x013e, B:42:0x016a, B:53:0x018a, B:55:0x0195, B:49:0x0180, B:45:0x0178, B:58:0x01ec, B:60:0x0202, B:71:0x0221, B:72:0x022b, B:67:0x0217, B:63:0x020f, B:19:0x0085, B:28:0x00d0, B:30:0x00d5, B:22:0x0090), top: B:84:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0217 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:12:0x0051, B:17:0x0079, B:34:0x012b, B:37:0x0135, B:40:0x013e, B:42:0x016a, B:53:0x018a, B:55:0x0195, B:49:0x0180, B:45:0x0178, B:58:0x01ec, B:60:0x0202, B:71:0x0221, B:72:0x022b, B:67:0x0217, B:63:0x020f, B:19:0x0085, B:28:0x00d0, B:30:0x00d5, B:22:0x0090), top: B:84:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0212 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.MainViewModel$saveToOssImg$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2.smali:253
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainViewModel$saveToOssImg$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
