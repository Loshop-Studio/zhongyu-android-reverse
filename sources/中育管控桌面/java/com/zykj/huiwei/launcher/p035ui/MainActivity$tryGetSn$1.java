package com.zykj.huiwei.launcher.p035ui;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.MainActivity$tryGetSn$1", m7918f = "MainActivity.kt", m7919i = {0, 0, 1, 1}, m7920l = {406, TypedValues.CycleType.TYPE_PATH_ROTATE}, m7921m = "invokeSuspend", m7922n = {"it", "$i$a$-repeat-MainActivity$tryGetSn$1$1", "it", "$i$a$-repeat-MainActivity$tryGetSn$1$1"}, m7923s = {"I$2", "I$3", "I$2", "I$3"})
/* loaded from: classes4.dex */
public final class MainActivity$tryGetSn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6356a;

    /* renamed from: b */
    public int f6357b;

    /* renamed from: c */
    public int f6358c;

    /* renamed from: d */
    public int f6359d;

    /* renamed from: e */
    public Object f6360e;

    /* renamed from: f */
    public int f6361f;

    /* renamed from: g */
    public final /* synthetic */ MainActivity f6362g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$tryGetSn$1(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.f6362g = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainActivity$tryGetSn$1(this.f6362g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b1 -> B:30:0x00b3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f6361f
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L39
            if (r1 == r4) goto L25
            if (r1 != r3) goto L1d
            int r1 = r11.f6357b
            int r5 = r11.f6356a
            java.lang.Object r6 = r11.f6360e
            com.zykj.huiwei.launcher.ui.MainActivity r6 = (com.zykj.huiwei.launcher.p035ui.MainActivity) r6
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r6
            goto Lb3
        L1d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L25:
            int r1 = r11.f6359d
            int r5 = r11.f6358c
            int r6 = r11.f6357b
            int r7 = r11.f6356a
            java.lang.Object r8 = r11.f6360e
            com.zykj.huiwei.launcher.ui.MainActivity r8 = (com.zykj.huiwei.launcher.p035ui.MainActivity) r8
            kotlin.ResultKt.throwOnFailure(r12)
            r10 = r5
            r5 = r1
            r1 = r6
            r6 = r10
            goto L6c
        L39:
            kotlin.ResultKt.throwOnFailure(r12)
            com.zykj.huiwei.launcher.ui.MainActivity r12 = r11.f6362g
            r1 = 5
            r5 = r2
        L40:
            if (r5 >= r1) goto Lb8
            android.content.Context r6 = r12.getBaseContext()
            java.lang.String r7 = "getBaseContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            androidx.datastore.core.DataStore r6 = com.zykj.huiwei.launcher.ext.CommonExtKt.m5311d(r6)
            kotlinx.coroutines.flow.Flow r6 = r6.getData()
            r11.f6360e = r12
            r11.f6356a = r1
            r11.f6357b = r5
            r11.f6358c = r5
            r11.f6359d = r2
            r11.f6361f = r4
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r6, r11)
            if (r6 != r0) goto L66
            goto Lb0
        L66:
            r8 = r12
            r7 = r1
            r1 = r5
            r12 = r6
            r5 = r2
            r6 = r1
        L6c:
            androidx.datastore.preferences.core.Preferences r12 = (androidx.datastore.preferences.core.Preferences) r12
            if (r12 == 0) goto L7d
            java.lang.String r9 = "deviceId"
            androidx.datastore.preferences.core.Preferences$Key r9 = androidx.datastore.preferences.core.PreferencesKeys.stringKey(r9)
            java.lang.Object r12 = r12.get(r9)
            java.lang.String r12 = (java.lang.String) r12
            goto L7e
        L7d:
            r12 = 0
        L7e:
            if (r12 == 0) goto L8a
            int r12 = r12.length()
            if (r12 != 0) goto L87
            goto L8a
        L87:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L8a:
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            java.lang.String r9 = "com.linspirer.edu.getdevicesn"
            r12.setAction(r9)
            java.lang.String r9 = "com.android.launcher3"
            r12.setPackage(r9)
            r8.sendBroadcast(r12)
            r11.f6360e = r8
            r11.f6356a = r7
            r11.f6357b = r1
            r11.f6358c = r6
            r11.f6359d = r5
            r11.f6361f = r3
            r5 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.delay(r5, r11)
            if (r12 != r0) goto Lb1
        Lb0:
            return r0
        Lb1:
            r5 = r7
            r12 = r8
        Lb3:
            int r1 = r1 + r4
            r10 = r5
            r5 = r1
            r1 = r10
            goto L40
        Lb8:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.p035ui.MainActivity$tryGetSn$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1.smali:158
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainActivity$tryGetSn$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
