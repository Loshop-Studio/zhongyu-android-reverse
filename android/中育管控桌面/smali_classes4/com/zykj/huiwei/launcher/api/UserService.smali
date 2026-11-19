.class public interface abstract Lcom/zykj/huiwei/launcher/api/UserService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0003H\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0003H\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u0011J2\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00032\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0016H\u00a7@\u00a2\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0002\u0010\u001c\u00a8\u0006\u001d\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/api/UserService;",
        "",
        "getPolicy",
        "Lcom/zykj/http/bean/ApiResp;",
        "Lcom/zykj/huiwei/launcher/bean/PolicyTypeBean;",
        "number",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "userInfo",
        "Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "schoolInfoSettingsAsync",
        "Lcom/zykj/huiwei/launcher/bean/resp/SchoolSettingResp;",
        "updatePwd",
        "Ljava/lang/Void;",
        "updatePwdReq",
        "Lcom/zykj/huiwei/launcher/bean/req/UpdatePwdReq;",
        "(Lcom/zykj/huiwei/launcher/bean/req/UpdatePwdReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "checkUpdateAsync",
        "Lcom/zykj/huiwei/launcher/bean/UpdateInfo;",
        "packageName",
        "version",
        "",
        "type",
        "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "forceChangePsdAsync",
        "forcePsdReq",
        "Lcom/zykj/huiwei/launcher/bean/req/ForcePsdReq;",
        "(Lcom/zykj/huiwei/launcher/bean/req/ForcePsdReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract checkUpdateAsync(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lc6/t;
            value = "packageName"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lc6/t;
            value = "version"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lc6/t;
            value = "appType"
        .end annotation
    .end param
    .annotation runtime Lc6/f;
        value = "api/services/app/AppStore/CheckUpdateAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/UpdateInfo;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract forceChangePsdAsync(Lcom/zykj/huiwei/launcher/bean/req/ForcePsdReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/huiwei/launcher/bean/req/ForcePsdReq;
        .annotation runtime Lc6/a;
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "api/services/app/User/ForceChangePasswordAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/huiwei/launcher/bean/req/ForcePsdReq;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Void;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getPolicy(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lc6/t;
            value = "number"
        .end annotation
    .end param
    .annotation runtime Lc6/f;
        value = "api/services/app/CtrlStrategy/GetControlPolicyByDeviceNumberAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/PolicyTypeBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract schoolInfoSettingsAsync(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation runtime Lc6/f;
        value = "api/services/app/Setting/GetSchoolInfoSettingsAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/resp/SchoolSettingResp;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract updatePwd(Lcom/zykj/huiwei/launcher/bean/req/UpdatePwdReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/huiwei/launcher/bean/req/UpdatePwdReq;
        .annotation runtime Lc6/a;
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "api/services/app/User/ChangePasswordAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/huiwei/launcher/bean/req/UpdatePwdReq;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Void;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract userInfo(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation runtime Lc6/f;
        value = "api/services/app/StudentUser/GetMyInfoAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
