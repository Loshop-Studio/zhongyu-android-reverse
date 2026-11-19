package com.zykj.huiwei.launcher.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.GsonBuilder;
import com.zykj.gallery.api.PictureService;
import com.zykj.http.annotation.CommonOkHttpClient;
import com.zykj.http.annotation.ResponseOkHttpClient;
import com.zykj.huiwei.launcher.api.AuthService;
import com.zykj.huiwei.launcher.api.DeviceService;
import com.zykj.huiwei.launcher.api.GatewayService;
import com.zykj.huiwei.launcher.api.HomeService;
import com.zykj.huiwei.launcher.api.NotificationService;
import com.zykj.huiwei.launcher.api.UserService;
import com.zykj.huiwei.launcher.api.VersionService;
import com.zykj.huiwei.launcher.api.WhiteUrlService;
import java.util.Date;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p007a6.C0018a;
import p021b6.C4453k;
import p058f5.C6356a0;
import p078i4.C6540j;
import p200z5.C7959d0;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/providers/ApiProvide;", "", "<init>", "()V", "Lf5/a0;", "okHttpClient", "Lcom/zykj/huiwei/launcher/api/AuthService;", "provideAuthService", "(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/AuthService;", "Lcom/zykj/huiwei/launcher/api/DeviceService;", "provideDeviceService", "(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/DeviceService;", "Lcom/zykj/huiwei/launcher/api/GatewayService;", "provideGatewayService", "(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/GatewayService;", "Lcom/zykj/huiwei/launcher/api/HomeService;", "provideHomeService", "(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/HomeService;", "Lcom/zykj/huiwei/launcher/api/NotificationService;", "provideNotification", "(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/NotificationService;", "Lcom/zykj/huiwei/launcher/api/UserService;", "provideUserService", "(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/UserService;", "Lcom/zykj/huiwei/launcher/api/VersionService;", "provideVersionService", "(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/VersionService;", "Lcom/zykj/huiwei/launcher/api/WhiteUrlService;", "provideWhiteUrlService", "(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/WhiteUrlService;", "Lcom/zykj/gallery/api/PictureService;", "provideGalleryService", "(Lf5/a0;)Lcom/zykj/gallery/api/PictureService;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class ApiProvide {
    public static final int $stable = 0;
    public static final ApiProvide INSTANCE = new ApiProvide();

    private ApiProvide() {
    }

    @Singleton
    public final AuthService provideAuthService(@AuthOkHttpClient C6356a0 okHttpClient) throws SecurityException {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objM9793b = new C7959d0.b().m9807f(okHttpClient).m9804c("https://hagateway.zyai.cc").m9802a(C4453k.m1517f()).m9802a(C0018a.m27f(new GsonBuilder().create())).m9805d().m9793b(AuthService.class);
        Intrinsics.checkNotNullExpressionValue(objM9793b, "create(...)");
        return (AuthService) objM9793b;
    }

    @Singleton
    public final DeviceService provideDeviceService(@ResponseOkHttpClient C6356a0 okHttpClient) throws SecurityException {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objM9793b = new C7959d0.b().m9807f(okHttpClient).m9804c("https://hagateway.zyai.cc").m9802a(C4453k.m1517f()).m9802a(C0018a.m27f(new GsonBuilder().registerTypeAdapter(Date.class, new C6540j()).create())).m9805d().m9793b(DeviceService.class);
        Intrinsics.checkNotNullExpressionValue(objM9793b, "create(...)");
        return (DeviceService) objM9793b;
    }

    @Singleton
    public final PictureService provideGalleryService(@ResponseOkHttpClient C6356a0 okHttpClient) throws SecurityException {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objM9793b = new C7959d0.b().m9807f(okHttpClient).m9804c("https://hagateway.zyai.cc").m9802a(C4453k.m1517f()).m9802a(C0018a.m27f(new GsonBuilder().registerTypeAdapter(Date.class, new C6540j()).create())).m9805d().m9793b(PictureService.class);
        Intrinsics.checkNotNullExpressionValue(objM9793b, "create(...)");
        return (PictureService) objM9793b;
    }

    @Singleton
    public final GatewayService provideGatewayService(@CommonOkHttpClient C6356a0 okHttpClient) throws SecurityException {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objM9793b = new C7959d0.b().m9807f(okHttpClient).m9804c("https://hagateway.zykj.org").m9802a(C4453k.m1517f()).m9802a(C0018a.m27f(new GsonBuilder().create())).m9805d().m9793b(GatewayService.class);
        Intrinsics.checkNotNullExpressionValue(objM9793b, "create(...)");
        return (GatewayService) objM9793b;
    }

    @Singleton
    public final HomeService provideHomeService(@ResponseOkHttpClient C6356a0 okHttpClient) throws SecurityException {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objM9793b = new C7959d0.b().m9807f(okHttpClient).m9804c("https://hagateway.zyai.cc").m9802a(C4453k.m1517f()).m9802a(C0018a.m27f(new GsonBuilder().registerTypeAdapter(Date.class, new C6540j()).create())).m9805d().m9793b(HomeService.class);
        Intrinsics.checkNotNullExpressionValue(objM9793b, "create(...)");
        return (HomeService) objM9793b;
    }

    @Singleton
    public final NotificationService provideNotification(@ResponseOkHttpClient C6356a0 okHttpClient) throws SecurityException {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objM9793b = new C7959d0.b().m9807f(okHttpClient).m9804c("https://hagateway.zyai.cc").m9802a(C4453k.m1517f()).m9802a(C0018a.m27f(new GsonBuilder().registerTypeAdapter(Date.class, new C6540j()).create())).m9805d().m9793b(NotificationService.class);
        Intrinsics.checkNotNullExpressionValue(objM9793b, "create(...)");
        return (NotificationService) objM9793b;
    }

    @Singleton
    public final UserService provideUserService(@ResponseOkHttpClient C6356a0 okHttpClient) throws SecurityException {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objM9793b = new C7959d0.b().m9807f(okHttpClient).m9804c("https://hagateway.zyai.cc").m9802a(C4453k.m1517f()).m9802a(C0018a.m27f(new GsonBuilder().registerTypeAdapter(Date.class, new C6540j()).create())).m9805d().m9793b(UserService.class);
        Intrinsics.checkNotNullExpressionValue(objM9793b, "create(...)");
        return (UserService) objM9793b;
    }

    @Singleton
    public final VersionService provideVersionService(@ResponseOkHttpClient C6356a0 okHttpClient) throws SecurityException {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objM9793b = new C7959d0.b().m9807f(okHttpClient).m9804c("https://hagateway.zyai.cc").m9802a(C4453k.m1517f()).m9802a(C0018a.m27f(new GsonBuilder().registerTypeAdapter(Date.class, new C6540j()).create())).m9805d().m9793b(VersionService.class);
        Intrinsics.checkNotNullExpressionValue(objM9793b, "create(...)");
        return (VersionService) objM9793b;
    }

    @Singleton
    public final WhiteUrlService provideWhiteUrlService(@ResponseOkHttpClient C6356a0 okHttpClient) throws SecurityException {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objM9793b = new C7959d0.b().m9807f(okHttpClient).m9804c("https://hagateway.zyai.cc").m9802a(C4453k.m1517f()).m9802a(C0018a.m27f(new GsonBuilder().registerTypeAdapter(Date.class, new C6540j()).create())).m9805d().m9793b(WhiteUrlService.class);
        Intrinsics.checkNotNullExpressionValue(objM9793b, "create(...)");
        return (WhiteUrlService) objM9793b;
    }
}
