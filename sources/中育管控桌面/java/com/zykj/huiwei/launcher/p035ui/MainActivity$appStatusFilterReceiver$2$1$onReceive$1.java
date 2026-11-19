package com.zykj.huiwei.launcher.p035ui;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.MainActivity$appStatusFilterReceiver$2$1$onReceive$1", m7918f = "MainActivity.kt", m7919i = {0, 0}, m7920l = {225}, m7921m = "invokeSuspend", m7922n = {"list", "$i$a$-runCatching-MainActivity$appStatusFilterReceiver$2$1$onReceive$1$1"}, m7923s = {"L$1", "I$0"})
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,456:1\n1563#2:457\n1634#2,3:458\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1\n*L\n230#1:457\n230#1:458,3\n*E\n"})
/* loaded from: classes4.dex */
public final class MainActivity$appStatusFilterReceiver$2$1$onReceive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f6311a;

    /* renamed from: b */
    public Object f6312b;

    /* renamed from: c */
    public int f6313c;

    /* renamed from: d */
    public int f6314d;

    /* renamed from: e */
    public final /* synthetic */ Intent f6315e;

    /* renamed from: f */
    public final /* synthetic */ MainActivity f6316f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$appStatusFilterReceiver$2$1$onReceive$1(Intent intent, MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.f6315e = intent;
        this.f6316f = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainActivity$appStatusFilterReceiver$2$1$onReceive$1(this.f6315e, this.f6316f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:6:0x0014, B:34:0x007c, B:36:0x0088, B:37:0x00a1, B:39:0x00a7, B:46:0x00c1, B:42:0x00b8, B:48:0x00cc, B:47:0x00c8, B:13:0x002a, B:17:0x0037, B:29:0x0056, B:30:0x005a, B:23:0x0048, B:25:0x004e, B:27:0x0052), top: B:56:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.p035ui.MainActivity$appStatusFilterReceiver$2$1$onReceive$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1.smali:159
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainActivity$appStatusFilterReceiver$2$1$onReceive$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
