package com.zykj.student.dialogue.upload;

import android.app.Application;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.blankj.utilcode.util.Utils;
import com.zykj.student.dialogue.upload.OssTaskManger;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import p304y6.InterfaceC9961b;

/* loaded from: classes5.dex */
public final class OssTaskManger {

    /* renamed from: a */
    public final InterfaceC9961b f11909a;

    /* renamed from: b */
    public final MutableStateFlow f11910b;

    /* renamed from: c */
    public final Lazy f11911c;

    public OssTaskManger(InterfaceC9961b ossTokenApi, MutableStateFlow userInfoFlow) {
        Intrinsics.checkNotNullParameter(ossTokenApi, "ossTokenApi");
        Intrinsics.checkNotNullParameter(userInfoFlow, "userInfoFlow");
        this.f11909a = ossTokenApi;
        this.f11910b = userInfoFlow;
        this.f11911c = LazyKt.lazy(new Function0() { // from class: y6.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OssTaskManger.m11053g();
            }
        });
    }

    /* renamed from: f */
    public static /* synthetic */ OneTimeWorkRequest m11052f(OssTaskManger ossTaskManger, String str, String str2, int i9, String[] strArr, String[] strArr2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i9 = 0;
        }
        if ((i10 & 8) != 0) {
            strArr = new String[0];
        }
        if ((i10 & 16) != 0) {
            strArr2 = new String[0];
        }
        return ossTaskManger.m11057e(str, str2, i9, strArr, strArr2);
    }

    /* renamed from: g */
    public static final WorkManager m11053g() {
        WorkManager.Companion companion = WorkManager.INSTANCE;
        Application app = Utils.getApp();
        Intrinsics.checkNotNullExpressionValue(app, "getApp(...)");
        return companion.getInstance(app);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11054b(java.lang.String r25, java.lang.String r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.upload.OssTaskManger.m11054b(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/upload/OssTaskManger.smali:185
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11055c(java.lang.String r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.upload.OssTaskManger.m11055c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/upload/OssTaskManger.smali:1163
    }

    /* renamed from: d */
    public final WorkManager m11056d() {
        return (WorkManager) this.f11911c.getValue();
    }

    /* renamed from: e */
    public final OneTimeWorkRequest m11057e(String uniqueWorkName, String fileAbsolutePath, int i9, String[] extras, String... tags) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(fileAbsolutePath, "fileAbsolutePath");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(tags, "tags");
        OneTimeWorkRequest oneTimeWorkRequestBuild = UploadWork.INSTANCE.m11064a(i9, fileAbsolutePath, extras, (String[]) Arrays.copyOf(tags, tags.length)).build();
        m11056d().enqueueUniqueWork(uniqueWorkName, ExistingWorkPolicy.REPLACE, oneTimeWorkRequestBuild);
        return oneTimeWorkRequestBuild;
    }
}
