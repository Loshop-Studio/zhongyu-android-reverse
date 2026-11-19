.class final Lcom/friday/cloudsnote/view/MainActivity$initData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/cloudsnote/view/MainActivity;->initData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.cloudsnote.view.MainActivity$initData$1"
    f = "MainActivity.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/cloudsnote/view/MainActivity;


# direct methods
.method public constructor <init>(Lcom/friday/cloudsnote/view/MainActivity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/cloudsnote/view/MainActivity$initData$1;->d:Lcom/friday/cloudsnote/view/MainActivity;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic g(Lcom/friday/cloudsnote/view/MainActivity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/cloudsnote/view/MainActivity$initData$1;->v(Lcom/friday/cloudsnote/view/MainActivity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m()Lqc/q;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/cloudsnote/view/MainActivity$initData$1;->t()Lqc/q;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic n(Lcom/friday/cloudsnote/view/MainActivity;Lcom/zykj/message/server/bean/ServerInfo;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/cloudsnote/view/MainActivity$initData$1;->p(Lcom/friday/cloudsnote/view/MainActivity;Lcom/zykj/message/server/bean/ServerInfo;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lcom/friday/cloudsnote/view/MainActivity;Lcom/zykj/message/server/bean/ServerInfo;)Lqc/q;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->b()Lcom/zykj/message/server/bean/Status;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/zykj/message/server/bean/Status;->d:Lcom/zykj/message/server/bean/Status;

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    invoke-static {p0}, Lcom/friday/cloudsnote/view/MainActivity;->N(Lcom/friday/cloudsnote/view/MainActivity;)Lcom/friday/cloudsnote/viewModel/MainViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/friday/cloudsnote/viewModel/MainViewModel;->h(Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lcom/zykj/message/client/MessageClient;->c:Lcom/zykj/message/client/MessageClient;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/message/client/MessageClient;->d()Lcom/zykj/message/server/bean/UserInfo;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-static {p0}, Lcom/friday/cloudsnote/view/MainActivity;->N(Lcom/friday/cloudsnote/view/MainActivity;)Lcom/friday/cloudsnote/viewModel/MainViewModel;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0, p1}, Lcom/friday/cloudsnote/viewModel/MainViewModel;->g(Lcom/zykj/message/server/bean/UserInfo;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/UserInfo;->g()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/UserInfo;->h()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, "_"

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lcom/tencent/bugly/crashreport/CrashReport;->setUserId(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/blankj/utilcode/util/LogUtils;->getConfig()Lcom/blankj/utilcode/util/LogUtils$Config;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppFilesPath()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance v3, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, "log"

    .line 88
    .line 89
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {v0, p1}, Lcom/blankj/utilcode/util/LogUtils$Config;->setDir(Ljava/lang/String;)Lcom/blankj/utilcode/util/LogUtils$Config;

    .line 106
    .line 107
    .line 108
    invoke-static {p0}, Lcom/friday/cloudsnote/view/MainActivity;->N(Lcom/friday/cloudsnote/view/MainActivity;)Lcom/friday/cloudsnote/viewModel/MainViewModel;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0}, Lcom/friday/cloudsnote/viewModel/MainViewModel;->i()V

    .line 113
    .line 114
    .line 115
    :cond_0
    sget-object p0, Lk2/v;->a:Lk2/v$a;

    .line 116
    .line 117
    const-string p1, "StudentLogin"

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    sget-object p0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/friday/common/helper/c;->c()V

    .line 125
    .line 126
    .line 127
    :cond_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 128
    .line 129
    return-object p0
.end method

.method public static final t()Lqc/q;
    .locals 1

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/ActivityUtils;->finishAllActivities()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object v0
.end method

.method public static final v(Lcom/friday/cloudsnote/view/MainActivity;)Lqc/q;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->x()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/friday/common/helper/c;->u()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/friday/common/helper/c;->f()V

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 28
    .line 29
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/cloudsnote/view/MainActivity$initData$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/cloudsnote/view/MainActivity$initData$1;->d:Lcom/friday/cloudsnote/view/MainActivity;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/cloudsnote/view/MainActivity$initData$1;-><init>(Lcom/friday/cloudsnote/view/MainActivity;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/cloudsnote/view/MainActivity$initData$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/cloudsnote/view/MainActivity$initData$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/cloudsnote/view/MainActivity$initData$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/cloudsnote/view/MainActivity$initData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/cloudsnote/view/MainActivity$initData$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lk2/v;->a:Lk2/v$a;

    .line 12
    .line 13
    const-string v0, "HotLaunch"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, Lg2/a;->a:Lg2/a;

    .line 19
    .line 20
    invoke-virtual {p1}, Lg2/a;->a()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    sget-object p1, Lcom/zykj/message/client/MessageClient;->c:Lcom/zykj/message/client/MessageClient;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/friday/cloudsnote/view/MainActivity$initData$1;->d:Lcom/friday/cloudsnote/view/MainActivity;

    .line 29
    .line 30
    new-instance v1, Lcom/friday/cloudsnote/view/a;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Lcom/friday/cloudsnote/view/a;-><init>(Lcom/friday/cloudsnote/view/MainActivity;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lcom/zykj/message/client/MessageClient;->c(Lhd/l;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance p1, Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/friday/cloudsnote/view/MainActivity$initData$1;->d:Lcom/friday/cloudsnote/view/MainActivity;

    .line 42
    .line 43
    invoke-direct {p1, v0}, Lcom/zykj/policy/ext/PolicyHelper$Builder;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "https://web.alicdn.zykj.org/privacypolicy/cloudnote/userServiceAgreement.html"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->g(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string v0, "https://web.alicdn.zykj.org/privacypolicy/cloudnote/userPrivacyPolicy.html"

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->f(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v0, Lcom/friday/cloudsnote/view/b;

    .line 59
    .line 60
    invoke-direct {v0}, Lcom/friday/cloudsnote/view/b;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->d(Lhd/a;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object v0, p0, Lcom/friday/cloudsnote/view/MainActivity$initData$1;->d:Lcom/friday/cloudsnote/view/MainActivity;

    .line 68
    .line 69
    new-instance v1, Lcom/friday/cloudsnote/view/c;

    .line 70
    .line 71
    invoke-direct {v1, v0}, Lcom/friday/cloudsnote/view/c;-><init>(Lcom/friday/cloudsnote/view/MainActivity;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v1}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->e(Lhd/a;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->i()V

    .line 79
    .line 80
    .line 81
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 87
    .line 88
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1
.end method
