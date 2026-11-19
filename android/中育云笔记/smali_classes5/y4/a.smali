.class public Ly4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/lang/String; = "HmsInstanceId"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Le5/b;

.field public c:Lcom/huawei/hms/common/HuaweiApi;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Ly4/a;->a:Landroid/content/Context;

    .line 9
    .line 10
    new-instance v0, Le5/b;

    .line 11
    .line 12
    const-string v1, "aaid"

    .line 13
    .line 14
    invoke-direct {v0, p1, v1}, Le5/b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ly4/a;->b:Le5/b;

    .line 18
    .line 19
    new-instance v0, Lcom/huawei/hms/api/Api;

    .line 20
    .line 21
    const-string v1, "HuaweiPush.API"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lcom/huawei/hms/api/Api;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    instance-of v1, p1, Landroid/app/Activity;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    new-instance v1, Lcom/huawei/hms/common/HuaweiApi;

    .line 32
    .line 33
    check-cast p1, Landroid/app/Activity;

    .line 34
    .line 35
    new-instance v3, Lc5/b;

    .line 36
    .line 37
    invoke-direct {v3}, Lc5/b;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, p1, v0, v2, v3}, Lcom/huawei/hms/common/HuaweiApi;-><init>(Landroid/app/Activity;Lcom/huawei/hms/api/Api;Lcom/huawei/hms/api/Api$ApiOptions;Lcom/huawei/hms/common/internal/AbstractClientBuilder;)V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Ly4/a;->c:Lcom/huawei/hms/common/HuaweiApi;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance v1, Lcom/huawei/hms/common/HuaweiApi;

    .line 47
    .line 48
    new-instance v3, Lc5/b;

    .line 49
    .line 50
    invoke-direct {v3}, Lc5/b;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, p1, v0, v2, v3}, Lcom/huawei/hms/common/HuaweiApi;-><init>(Landroid/content/Context;Lcom/huawei/hms/api/Api;Lcom/huawei/hms/api/Api$ApiOptions;Lcom/huawei/hms/common/internal/AbstractClientBuilder;)V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Ly4/a;->c:Lcom/huawei/hms/common/HuaweiApi;

    .line 57
    .line 58
    :goto_0
    iget-object p1, p0, Ly4/a;->c:Lcom/huawei/hms/common/HuaweiApi;

    .line 59
    .line 60
    const v0, 0x3a75e4c

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lcom/huawei/hms/common/HuaweiApi;->setKitSdkVersion(I)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public static f(Landroid/content/Context;)Ly4/a;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/huawei/hms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Ls5/i;->i(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ly4/a;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Ly4/a;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public final a(Lcom/huawei/hms/aaid/entity/TokenReq;I)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {}, Lb5/a;->b()Lb5/b;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/huawei/hms/aaid/entity/TokenReq;->getSubjectId()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0, v0}, Ly4/a;->c(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ly4/a;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-string v1, "push.gettoken"

    .line 14
    .line 15
    invoke-static {v0, v1}, Ls5/f;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :try_start_0
    sget-object v2, Ly4/a;->d:Ljava/lang/String;

    .line 20
    .line 21
    new-instance v3, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v4, "getToken req :"

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/huawei/hms/aaid/entity/TokenReq;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v2, v3}, Lcom/huawei/hms/support/log/HMSLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v2, Ls5/e;

    .line 46
    .line 47
    iget-object v3, p0, Ly4/a;->a:Landroid/content/Context;

    .line 48
    .line 49
    invoke-direct {v2, v1, p1, v3, v0}, Ls5/e;-><init>(Ljava/lang/String;Lcom/huawei/hms/aaid/entity/TokenReq;Landroid/content/Context;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, p2}, Lcom/huawei/hms/common/internal/TaskApiCall;->setApiLevel(I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Ly4/a;->c:Lcom/huawei/hms/common/HuaweiApi;

    .line 56
    .line 57
    invoke-virtual {p1, v2}, Lcom/huawei/hms/common/HuaweiApi;->doWrite(Lcom/huawei/hms/common/internal/TaskApiCall;)Lw4/e;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lw4/h;->a(Lw4/e;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lcom/huawei/hms/aaid/entity/TokenResult;

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/huawei/hms/aaid/entity/TokenResult;->getToken()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    return-object p1

    .line 72
    :catch_0
    move-exception p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    instance-of p2, p2, Lcom/huawei/hms/common/ApiException;

    .line 78
    .line 79
    if-eqz p2, :cond_0

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Lcom/huawei/hms/common/ApiException;

    .line 86
    .line 87
    iget-object p2, p0, Ly4/a;->a:Landroid/content/Context;

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/huawei/hms/common/ApiException;->getStatusCode()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-static {p2, v1, v0, v2}, Ls5/f;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_0
    iget-object p1, p0, Ly4/a;->a:Landroid/content/Context;

    .line 98
    .line 99
    sget-object p2, Lcom/huawei/hms/aaid/constant/ErrorEnum;->T:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 100
    .line 101
    invoke-static {p1, v1, v0, p2}, Ls5/f;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/aaid/constant/ErrorEnum;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->f()Lcom/huawei/hms/common/ApiException;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    throw p1
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly4/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Le5/a;->e(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-static {}, Lb5/a;->b()Lb5/b;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ly4/a;->a:Landroid/content/Context;

    .line 13
    .line 14
    invoke-static {v0}, Le5/a;->g(Landroid/content/Context;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object v0, Ly4/a;->d:Ljava/lang/String;

    .line 22
    .line 23
    const-string v1, "Operations in child processes are not supported."

    .line 24
    .line 25
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lcom/huawei/hms/aaid/constant/ErrorEnum;->L0:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->f()Lcom/huawei/hms/common/ApiException;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    throw v0

    .line 35
    :cond_1
    :goto_0
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Ly4/a;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {v0}, Ls5/d;->g(Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const-string v1, "subjectId"

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, Ly4/a;->a:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v0}, Ls5/g;->k(Landroid/content/Context;)Ls5/g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, v1}, Le5/b;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Ly4/a;->a:Landroid/content/Context;

    .line 35
    .line 36
    invoke-static {v0}, Ls5/g;->k(Landroid/content/Context;)Ls5/g;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0, v1, p1}, Le5/b;->i(Ljava/lang/String;Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    iget-object v2, p0, Ly4/a;->a:Landroid/content/Context;

    .line 51
    .line 52
    invoke-static {v2}, Ls5/g;->k(Landroid/content/Context;)Ls5/g;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v3, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, ","

    .line 65
    .line 66
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v2, v1, p1}, Le5/b;->i(Ljava/lang/String;Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    :cond_2
    :goto_0
    return-void

    .line 80
    :cond_3
    iget-object p1, p0, Ly4/a;->a:Landroid/content/Context;

    .line 81
    .line 82
    invoke-static {p1}, Ls5/g;->k(Landroid/content/Context;)Ls5/g;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1, v1}, Le5/b;->f(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object v0, Lcom/huawei/hms/aaid/constant/ErrorEnum;->w0:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->f()Lcom/huawei/hms/common/ApiException;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    throw v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Ls5/a;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, v0, v0}, Ly4/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    :catch_0
    return-object v0
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ly4/a;->d()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ly4/a;->b()V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Ly4/a;->a:Landroid/content/Context;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {p1, v0, p2}, Ls5/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hms/aaid/entity/TokenReq;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0}, Ly4/a;->e()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p1, p2}, Lcom/huawei/hms/aaid/entity/TokenReq;->setAaid(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-virtual {p1, p2}, Lcom/huawei/hms/aaid/entity/TokenReq;->setMultiSender(Z)V

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, Ly4/a;->a:Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {p2}, Ls5/g;->k(Landroid/content/Context;)Ls5/g;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iget-object v0, p0, Ly4/a;->a:Landroid/content/Context;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "1"

    .line 38
    .line 39
    invoke-virtual {p2, v0, v1}, Le5/b;->i(Ljava/lang/String;Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    const/4 p2, 0x1

    .line 43
    invoke-virtual {p0, p1, p2}, Ly4/a;->a(Lcom/huawei/hms/aaid/entity/TokenReq;I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method
