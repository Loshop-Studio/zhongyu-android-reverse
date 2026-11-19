package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import com.google.protobuf.GeneratedMessageLite;
import com.zykj.huiwei.launcher.proto.C6063a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$checkLocalServerInfo$1", m7918f = "HomeViewModel.kt", m7919i = {1, 1, 2, 2, 2, 2}, m7920l = {341, 348, 353}, m7921m = "invokeSuspend", m7922n = {"serverBean", "schoolCode", "serverBean", "schoolCode", "loginUrlResp", "responseWebServerUrl"}, m7923s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3"})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$checkLocalServerInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f7081a;

    /* renamed from: b */
    public Object f7082b;

    /* renamed from: c */
    public Object f7083c;

    /* renamed from: d */
    public Object f7084d;

    /* renamed from: e */
    public int f7085e;

    /* renamed from: f */
    public final /* synthetic */ HomeViewModel f7086f;

    @Metadata(m7879d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/proto/a;", "it", "<anonymous>", "(Lcom/zykj/huiwei/launcher/proto/a;)Lcom/zykj/huiwei/launcher/proto/a;"}, m7881k = 3, m7882mv = {2, 2, 0})
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$checkLocalServerInfo$1$1", m7918f = "HomeViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$checkLocalServerInfo$1$1 */
    public static final class C61831 extends SuspendLambda implements Function2<C6063a, Continuation<? super C6063a>, Object> {

        /* renamed from: a */
        public int f7087a;

        /* renamed from: b */
        public /* synthetic */ Object f7088b;

        /* renamed from: c */
        public final /* synthetic */ String f7089c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61831(String str, Continuation continuation) {
            super(2, continuation);
            this.f7089c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C6063a c6063a, Continuation continuation) {
            return ((C61831) create(c6063a, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C61831 c61831 = new C61831(this.f7089c, continuation);
            c61831.f7088b = obj;
            return c61831;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C6063a c6063a = (C6063a) this.f7088b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7087a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GeneratedMessageLite generatedMessageLiteBuild = ((C6063a.b) c6063a.toBuilder()).setWebServerUrl(this.f7089c).build();
            Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
            return generatedMessageLiteBuild;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$checkLocalServerInfo$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7086f = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$checkLocalServerInfo$1(this.f7086f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        if (r5.updateData(r7, r9) == r0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$checkLocalServerInfo$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1.smali:169
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$checkLocalServerInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
