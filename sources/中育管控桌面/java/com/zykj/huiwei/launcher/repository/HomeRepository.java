package com.zykj.huiwei.launcher.repository;

import com.blankj.utilcode.util.C4641d0;
import com.zykj.huiwei.launcher.api.HomeService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class HomeRepository {

    /* renamed from: a */
    public final HomeService f6149a;

    public HomeRepository(HomeService homeService) {
        Intrinsics.checkNotNullParameter(homeService, "homeService");
        this.f6149a = homeService;
    }

    /* renamed from: b */
    public final Flow m5415b() {
        return FlowKt.flow(new HomeRepository$getAllProfilesAsync$1(this, null));
    }

    /* renamed from: c */
    public final Flow m5416c(int i6) {
        return FlowKt.flow(new HomeRepository$getStudentTodoCount$1(this, i6, null));
    }

    /* renamed from: d */
    public final Flow m5417d() {
        return FlowKt.flow(new HomeRepository$getTodoTasksList$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5418e(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.huiwei.launcher.repository.HomeRepository$getUserPasswordStrength$1
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.huiwei.launcher.repository.HomeRepository$getUserPasswordStrength$1 r0 = (com.zykj.huiwei.launcher.repository.HomeRepository$getUserPasswordStrength$1) r0
            int r1 = r0.f6165c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6165c = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.repository.HomeRepository$getUserPasswordStrength$1 r0 = new com.zykj.huiwei.launcher.repository.HomeRepository$getUserPasswordStrength$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6163a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6165c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            com.zykj.huiwei.launcher.api.HomeService r5 = r4.f6149a
            r0.f6165c = r3
            java.lang.String r2 = "UserPasswordStrength"
            java.lang.Object r5 = r5.getSystemSettings(r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            com.zykj.http.bean.ApiResp r5 = (com.zykj.http.bean.ApiResp) r5
            java.lang.Object r5 = r5.getResult()
            com.zykj.huiwei.launcher.bean.SystemSettingsBean r5 = (com.zykj.huiwei.launcher.bean.SystemSettingsBean) r5
            if (r5 == 0) goto L4f
            int r3 = r5.getUserPasswordStrength()
        L4f:
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.repository.HomeRepository.m5418e(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/repository/HomeRepository.smali:136
    }

    /* renamed from: f */
    public final String m5419f() {
        String strM2161d = C4641d0.m2158b("sp_id_weather").m2161d("SP_KEY_WEATHER_CITY");
        Intrinsics.checkNotNullExpressionValue(strM2161d, "getString(...)");
        return strM2161d;
    }

    /* renamed from: g */
    public final Flow m5420g(String location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return FlowKt.flow(new HomeRepository$getWeatherInfo$1(this, location, null));
    }

    /* renamed from: h */
    public final void m5421h(String city) {
        Intrinsics.checkNotNullParameter(city, "city");
        C4641d0.m2158b("sp_id_weather").m2163g("SP_KEY_WEATHER_CITY", city);
    }

    /* renamed from: i */
    public final Flow m5422i(long j6) {
        return FlowKt.flow(new HomeRepository$setPictureAsync$1(this, j6, null));
    }
}
