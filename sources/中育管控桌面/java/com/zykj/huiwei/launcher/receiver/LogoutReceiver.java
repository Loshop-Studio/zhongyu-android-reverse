package com.zykj.huiwei.launcher.receiver;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import com.google.protobuf.GeneratedMessageLite;
import com.zykj.huiwei.launcher.proto.C6063a;
import com.zykj.huiwei.launcher.proto.C6066d;
import com.zykj.huiwei.launcher.proto.C6069g;
import com.zykj.huiwei.launcher.proto.C6075m;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p170v3.AbstractC7792a;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\r\u0010\u0010\"\u0004\b\u001a\u0010\u0012R(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u001e\u0010\u0012¨\u0006 "}, m7880d2 = {"Lcom/zykj/huiwei/launcher/receiver/LogoutReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Landroidx/datastore/core/DataStore;", "Lcom/zykj/huiwei/launcher/proto/a;", "c", "Landroidx/datastore/core/DataStore;", "b", "()Landroidx/datastore/core/DataStore;", "setServerDataStore", "(Landroidx/datastore/core/DataStore;)V", "serverDataStore", "Lcom/zykj/huiwei/launcher/proto/m;", "d", "e", "setUserDataStore", "userDataStore", "Lcom/zykj/huiwei/launcher/proto/d;", "setSettingDataStore", "settingDataStore", "Lcom/zykj/huiwei/launcher/proto/g;", "f", "setStudentDataStore", "studentDataStore", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class LogoutReceiver extends AbstractC7792a {

    /* renamed from: c, reason: from kotlin metadata */
    public DataStore serverDataStore;

    /* renamed from: d, reason: from kotlin metadata */
    public DataStore userDataStore;

    /* renamed from: e, reason: from kotlin metadata */
    public DataStore settingDataStore;

    /* renamed from: f, reason: from kotlin metadata */
    public DataStore studentDataStore;

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1", m7918f = "LogoutReceiver.kt", m7919i = {}, m7920l = {46, 54, 63, 73}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1 */
    public static final class C60781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6131a;

        /* renamed from: c */
        public final /* synthetic */ Intent f6133c;

        /* renamed from: d */
        public final /* synthetic */ Context f6134d;

        @Metadata(m7879d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/proto/d;", "it", "<anonymous>", "(Lcom/zykj/huiwei/launcher/proto/d;)Lcom/zykj/huiwei/launcher/proto/d;"}, m7881k = 3, m7882mv = {2, 2, 0})
        @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$1", m7918f = "LogoutReceiver.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6066d, Continuation<? super C6066d>, Object> {

            /* renamed from: a */
            public int f6135a;

            /* renamed from: b */
            public /* synthetic */ Object f6136b;

            public AnonymousClass1(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C6066d c6066d, Continuation continuation) {
                return ((AnonymousClass1) create(c6066d, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.f6136b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C6066d c6066d = (C6066d) this.f6136b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f6135a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                GeneratedMessageLite generatedMessageLiteBuild = ((C6066d.b) c6066d.toBuilder()).clearIsFirstInstall().clearIsLoginSuccess().clearNeedCheckCrack().build();
                Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
                return generatedMessageLiteBuild;
            }
        }

        @Metadata(m7879d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/proto/a;", "it", "<anonymous>", "(Lcom/zykj/huiwei/launcher/proto/a;)Lcom/zykj/huiwei/launcher/proto/a;"}, m7881k = 3, m7882mv = {2, 2, 0})
        @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$2", m7918f = "LogoutReceiver.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<C6063a, Continuation<? super C6063a>, Object> {

            /* renamed from: a */
            public int f6137a;

            /* renamed from: b */
            public /* synthetic */ Object f6138b;

            public AnonymousClass2(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C6063a c6063a, Continuation continuation) {
                return ((AnonymousClass2) create(c6063a, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.f6138b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C6063a c6063a = (C6063a) this.f6138b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f6137a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                GeneratedMessageLite generatedMessageLiteBuild = ((C6063a.b) c6063a.toBuilder()).clearServerUrl().clearAccessToken().clearImAccessToken().clearRefreshToken().build();
                Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
                return generatedMessageLiteBuild;
            }
        }

        @Metadata(m7879d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/proto/m;", "it", "<anonymous>", "(Lcom/zykj/huiwei/launcher/proto/m;)Lcom/zykj/huiwei/launcher/proto/m;"}, m7881k = 3, m7882mv = {2, 2, 0})
        @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$3", m7918f = "LogoutReceiver.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<C6075m, Continuation<? super C6075m>, Object> {

            /* renamed from: a */
            public int f6139a;

            /* renamed from: b */
            public /* synthetic */ Object f6140b;

            public AnonymousClass3(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C6075m c6075m, Continuation continuation) {
                return ((AnonymousClass3) create(c6075m, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.f6140b = obj;
                return anonymousClass3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C6075m c6075m = (C6075m) this.f6140b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f6139a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                GeneratedMessageLite generatedMessageLiteBuild = ((C6075m.b) c6075m.toBuilder()).clearId().clearAvatar().clearPassword().clearRealName().clearRole().build();
                Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
                return generatedMessageLiteBuild;
            }
        }

        @Metadata(m7879d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/proto/g;", "it", "<anonymous>", "(Lcom/zykj/huiwei/launcher/proto/g;)Lcom/zykj/huiwei/launcher/proto/g;"}, m7881k = 3, m7882mv = {2, 2, 0})
        @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$4", m7918f = "LogoutReceiver.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<C6069g, Continuation<? super C6069g>, Object> {

            /* renamed from: a */
            public int f6141a;

            /* renamed from: b */
            public /* synthetic */ Object f6142b;

            public AnonymousClass4(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C6069g c6069g, Continuation continuation) {
                return ((AnonymousClass4) create(c6069g, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.f6142b = obj;
                return anonymousClass4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C6069g c6069g = (C6069g) this.f6142b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f6141a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                GeneratedMessageLite generatedMessageLiteBuild = ((C6069g.b) ((C6069g.b) c6069g.toBuilder()).clear()).build();
                Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
                return generatedMessageLiteBuild;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60781(Intent intent, Context context, Continuation continuation) {
            super(2, continuation);
            this.f6133c = intent;
            this.f6134d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return LogoutReceiver.this.new C60781(this.f6133c, this.f6134d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
        
            if (r8.updateData(r1, r7) != r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f6131a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 0
                r6 = 1
                if (r1 == 0) goto L2e
                if (r1 == r6) goto L2a
                if (r1 == r4) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                kotlin.ResultKt.throwOnFailure(r8)
                goto L8a
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L76
            L26:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L62
            L2a:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L4e
            L2e:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.String r8 = "onReceive--->清理信息"
                java.lang.Object[] r8 = new java.lang.Object[]{r8}
                com.blankj.utilcode.util.AbstractC4668s.m2377i(r8)
                com.zykj.huiwei.launcher.receiver.LogoutReceiver r8 = com.zykj.huiwei.launcher.receiver.LogoutReceiver.this
                androidx.datastore.core.DataStore r8 = r8.m5406c()
                com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$1 r1 = new com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$1
                r1.<init>(r5)
                r7.f6131a = r6
                java.lang.Object r8 = r8.updateData(r1, r7)
                if (r8 != r0) goto L4e
                goto L89
            L4e:
                com.zykj.huiwei.launcher.receiver.LogoutReceiver r8 = com.zykj.huiwei.launcher.receiver.LogoutReceiver.this
                androidx.datastore.core.DataStore r8 = r8.m5405b()
                com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$2 r1 = new com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$2
                r1.<init>(r5)
                r7.f6131a = r4
                java.lang.Object r8 = r8.updateData(r1, r7)
                if (r8 != r0) goto L62
                goto L89
            L62:
                com.zykj.huiwei.launcher.receiver.LogoutReceiver r8 = com.zykj.huiwei.launcher.receiver.LogoutReceiver.this
                androidx.datastore.core.DataStore r8 = r8.m5408e()
                com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$3 r1 = new com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$3
                r1.<init>(r5)
                r7.f6131a = r3
                java.lang.Object r8 = r8.updateData(r1, r7)
                if (r8 != r0) goto L76
                goto L89
            L76:
                com.zykj.huiwei.launcher.receiver.LogoutReceiver r8 = com.zykj.huiwei.launcher.receiver.LogoutReceiver.this
                androidx.datastore.core.DataStore r8 = r8.m5407d()
                com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$4 r1 = new com.zykj.huiwei.launcher.receiver.LogoutReceiver$onReceive$1$4
                r1.<init>(r5)
                r7.f6131a = r2
                java.lang.Object r8 = r8.updateData(r1, r7)
                if (r8 != r0) goto L8a
            L89:
                return r0
            L8a:
                com.zykj.message.server.MessageManage r8 = com.zykj.message.server.MessageManage.f7396a
                com.zykj.message.server.bean.ServerInfo r0 = new com.zykj.message.server.bean.ServerInfo
                r0.<init>()
                r8.mo6208c(r0)
                i4.g$a r8 = p078i4.AbstractC6537g.f8372a
                boolean r8 = r8.m7316g()
                java.lang.Class<com.zykj.huiwei.launcher.ui.MainActivity> r0 = com.zykj.huiwei.launcher.p035ui.MainActivity.class
                if (r8 == 0) goto Lc4
                android.content.Intent r8 = new android.content.Intent
                r8.<init>()
                android.content.Context r1 = r7.f6134d
                java.lang.String r2 = "com.linspirer.edu.logout"
                r8.setAction(r2)
                java.lang.String r2 = "com.android.launcher3"
                r8.setPackage(r2)
                if (r1 == 0) goto Lb4
                r1.sendBroadcast(r8)
            Lb4:
                android.content.Intent r8 = r7.f6133c
                if (r8 == 0) goto Ldb
                java.lang.String r1 = "exitActivity"
                boolean r8 = r8.getBooleanExtra(r1, r6)
                if (r8 != r6) goto Ldb
                com.blankj.utilcode.util.AbstractC4634a.m2112a(r0)
                goto Ldb
            Lc4:
                android.content.Context r8 = r7.f6134d
                if (r8 == 0) goto Ldb
                android.content.Intent r1 = new android.content.Intent
                r1.<init>(r8, r0)
                r0 = 32768(0x8000, float:4.5918E-41)
                r1.addFlags(r0)
                r0 = 268435456(0x10000000, float:2.524355E-29)
                r1.addFlags(r0)
                r8.startActivity(r1)
            Ldb:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.receiver.LogoutReceiver.C60781.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/receiver/LogoutReceiver$onReceive$1.smali:147
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C60781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: b */
    public final DataStore m5405b() {
        DataStore dataStore = this.serverDataStore;
        if (dataStore != null) {
            return dataStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("serverDataStore");
        return null;
    }

    /* renamed from: c */
    public final DataStore m5406c() {
        DataStore dataStore = this.settingDataStore;
        if (dataStore != null) {
            return dataStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("settingDataStore");
        return null;
    }

    /* renamed from: d */
    public final DataStore m5407d() {
        DataStore dataStore = this.studentDataStore;
        if (dataStore != null) {
            return dataStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("studentDataStore");
        return null;
    }

    /* renamed from: e */
    public final DataStore m5408e() {
        DataStore dataStore = this.userDataStore;
        if (dataStore != null) {
            return dataStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userDataStore");
        return null;
    }

    @Override // p170v3.AbstractC7792a, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C60781(intent, context, null), 3, null);
    }
}
