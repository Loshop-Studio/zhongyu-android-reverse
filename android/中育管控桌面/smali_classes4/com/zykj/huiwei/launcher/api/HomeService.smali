.class public interface abstract Lcom/zykj/huiwei/launcher/api/HomeService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/api/HomeService$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00032\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00032\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00032\u0008\u0008\u0003\u0010\u0017\u001a\u00020\u0018H\u00a7@\u00a2\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00032\u0008\u0008\u0003\u0010\u0017\u001a\u00020\u0018H\u00a7@\u00a2\u0006\u0002\u0010\u0019J\u0014\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001f0\u001e0\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00032\u0008\u0008\u0001\u0010!\u001a\u00020\"H\u00a7@\u00a2\u0006\u0002\u0010#J\u001a\u0010$\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020%0\t0\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\'0\u00032\u0008\u0008\u0001\u0010(\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006)\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/api/HomeService;",
        "",
        "getStudentUserTodo",
        "Lcom/zykj/http/bean/ApiResp;",
        "Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;",
        "studentId",
        "",
        "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getWebsitesUsedOften",
        "",
        "Lcom/zykj/huiwei/launcher/bean/resp/WebsitesUsedOftenBean;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getSettings",
        "Lcom/zykj/huiwei/launcher/bean/resp/SettingResp;",
        "getDnUrl",
        "",
        "clientType",
        "getWeatherList",
        "Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;",
        "location",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getTodoTasksList",
        "Lcom/zykj/huiwei/launcher/bean/GetTaskListResponse;",
        "getTaskListReq",
        "Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;",
        "(Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getTodoTasksListWithUrgeCount",
        "getStorageCredentialAsync",
        "Lcom/zykj/huiwei/launcher/bean/resp/Credential;",
        "getAllProfilesAsync",
        "",
        "Lcom/zykj/huiwei/launcher/bean/AvatarItem;",
        "setPictureAsync",
        "req",
        "Lcom/zykj/huiwei/launcher/bean/req/AvatarSetReq;",
        "(Lcom/zykj/huiwei/launcher/bean/req/AvatarSetReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getDisableAppsAsync",
        "Lcom/zykj/huiwei/launcher/bean/resp/DisableAppInfo;",
        "getSystemSettings",
        "Lcom/zykj/huiwei/launcher/bean/SystemSettingsBean;",
        "propertyName",
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


# direct methods
.method public static synthetic getTodoTasksList$default(Lcom/zykj/huiwei/launcher/api/HomeService;Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 v0, p3, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;

    .line 8
    .line 9
    const/16 v12, 0x3fc

    .line 10
    .line 11
    const/4 v13, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    invoke-direct/range {v1 .. v13}, Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;-><init>(IIILjava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    .line 25
    move-object p1, v1

    .line 26
    :cond_0
    move-object/from16 v0, p2

    .line 27
    .line 28
    invoke-interface {p0, p1, v0}, Lcom/zykj/huiwei/launcher/api/HomeService;->getTodoTasksList(Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 34
    .line 35
    const-string p1, "Super calls with default arguments not supported in this target, function: getTodoTasksList"

    .line 36
    .line 37
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p0
.end method

.method public static synthetic getTodoTasksListWithUrgeCount$default(Lcom/zykj/huiwei/launcher/api/HomeService;Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 v0, p3, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;

    .line 8
    .line 9
    const/16 v12, 0x3fc

    .line 10
    .line 11
    const/4 v13, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    invoke-direct/range {v1 .. v13}, Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;-><init>(IIILjava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    .line 25
    move-object p1, v1

    .line 26
    :cond_0
    move-object/from16 v0, p2

    .line 27
    .line 28
    invoke-interface {p0, p1, v0}, Lcom/zykj/huiwei/launcher/api/HomeService;->getTodoTasksListWithUrgeCount(Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 34
    .line 35
    const-string p1, "Super calls with default arguments not supported in this target, function: getTodoTasksListWithUrgeCount"

    .line 36
    .line 37
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p0
.end method


# virtual methods
.method public abstract getAllProfilesAsync(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation runtime Lc6/f;
        value = "api/services/app/User/GetAllProfilesAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/util/List<",
            "Lcom/zykj/huiwei/launcher/bean/AvatarItem;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getDisableAppsAsync(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation runtime Lc6/f;
        value = "api/services/app/Huiwei/GetDisableAppsAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/util/List<",
            "Lcom/zykj/huiwei/launcher/bean/resp/DisableAppInfo;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getDnUrl(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lc6/t;
            value = "clientType"
        .end annotation
    .end param
    .annotation runtime Lc6/f;
        value = "/api/dn/GetDnUrl"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getSettings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation runtime Lc6/f;
        value = "/api/services/app/Setting/GetAllSettings"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/resp/SettingResp;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getStorageCredentialAsync(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation runtime Lc6/f;
        value = "api/services/app/ObjectStorage/GeneratorTokenAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/resp/Credential;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getStudentUserTodo(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lc6/t;
            value = "studentId"
        .end annotation
    .end param
    .annotation runtime Lc6/f;
        value = "/api/services/app/StudentUser/GetStudentUserTodoAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getSystemSettings(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lc6/t;
            value = "propertyName"
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "api/services/app/Setting/GetSettingByNameAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/SystemSettingsBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getTodoTasksList(Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;
        .annotation runtime Lc6/a;
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "api/services/app/Task/GetStudentTaskListAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/GetTaskListResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "2025/05/22, \u9700\u8981\u540c\u65f6\u8fd4\u56de\u50ac\u4ea4\u6570\u91cf\uff0c\u5df2\u88ab {@link #getTodoTasksListWithUrgeCount()} \u66ff\u4ee3"
    .end annotation
.end method

.method public abstract getTodoTasksListWithUrgeCount(Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;
        .annotation runtime Lc6/a;
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "api/services/app/Task/GetStudentTaskListWithUrgeCountAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/GetTaskListResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getWeatherList(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lc6/t;
            value = "location"
        .end annotation
    .end param
    .annotation runtime Lc6/f;
        value = "api/services/app/Weather/GetQWeatherAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getWebsitesUsedOften(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation runtime Lc6/f;
        value = "/api/services/app/WebWhiteList/GetAllCommonWebSiteAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/util/List<",
            "Lcom/zykj/huiwei/launcher/bean/resp/WebsitesUsedOftenBean;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract setPictureAsync(Lcom/zykj/huiwei/launcher/bean/req/AvatarSetReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/huiwei/launcher/bean/req/AvatarSetReq;
        .annotation runtime Lc6/a;
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "api/services/app/StudentUser/SetPictureAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/huiwei/launcher/bean/req/AvatarSetReq;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
