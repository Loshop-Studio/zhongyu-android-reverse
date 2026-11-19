.class public final Lcn/com/techvision/launchercore/internal/LauncherService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcn/com/techvision/launchercore/internal/LauncherService$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 %2\u00020\u0001:\u0001\u0011B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0003J\u000f\u0010\u000c\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u0003J\u000f\u0010\r\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0003R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0012\u001a\u0004\u0008\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0012\u001a\u0004\u0008\"\u0010#\u00a8\u0006&"
    }
    d2 = {
        "Lcn/com/techvision/launchercore/internal/LauncherService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "Landroid/content/Intent;",
        "intent",
        "Landroid/os/IBinder;",
        "onBind",
        "(Landroid/content/Intent;)Landroid/os/IBinder;",
        "",
        "onCreate",
        "onDestroy",
        "q",
        "h",
        "s",
        "t",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "a",
        "Lkotlin/Lazy;",
        "m",
        "()Lio/reactivex/disposables/CompositeDisposable;",
        "mCompositeDisposable",
        "Landroid/content/pm/LauncherApps;",
        "b",
        "o",
        "()Landroid/content/pm/LauncherApps;",
        "mLAService",
        "Landroid/database/ContentObserver;",
        "c",
        "p",
        "()Landroid/database/ContentObserver;",
        "mUACallback",
        "Landroid/content/pm/LauncherApps$Callback;",
        "d",
        "n",
        "()Landroid/content/pm/LauncherApps$Callback;",
        "mLACallback",
        "e",
        "LauncherCore_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:Lcn/com/techvision/launchercore/internal/LauncherService$a;

.field public static f:Lh/c;


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lkotlin/Lazy;

.field public final c:Lkotlin/Lazy;

.field public final d:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcn/com/techvision/launchercore/internal/LauncherService$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcn/com/techvision/launchercore/internal/LauncherService$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcn/com/techvision/launchercore/internal/LauncherService;->e:Lcn/com/techvision/launchercore/internal/LauncherService$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcn/com/techvision/launchercore/internal/LauncherService$mCompositeDisposable$2;->a:Lcn/com/techvision/launchercore/internal/LauncherService$mCompositeDisposable$2;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcn/com/techvision/launchercore/internal/LauncherService;->a:Lkotlin/Lazy;

    .line 11
    .line 12
    new-instance v0, Lcn/com/techvision/launchercore/internal/LauncherService$mLAService$2;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcn/com/techvision/launchercore/internal/LauncherService$mLAService$2;-><init>(Lcn/com/techvision/launchercore/internal/LauncherService;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcn/com/techvision/launchercore/internal/LauncherService;->b:Lkotlin/Lazy;

    .line 22
    .line 23
    new-instance v0, Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lcn/com/techvision/launchercore/internal/LauncherService$mUACallback$2;-><init>(Lcn/com/techvision/launchercore/internal/LauncherService;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcn/com/techvision/launchercore/internal/LauncherService;->c:Lkotlin/Lazy;

    .line 33
    .line 34
    new-instance v0, Lcn/com/techvision/launchercore/internal/LauncherService$mLACallback$2;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Lcn/com/techvision/launchercore/internal/LauncherService$mLACallback$2;-><init>(Lcn/com/techvision/launchercore/internal/LauncherService;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lcn/com/techvision/launchercore/internal/LauncherService;->d:Lkotlin/Lazy;

    .line 44
    .line 45
    return-void
.end method

.method public static synthetic a(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->k(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Lcn/com/techvision/launchercore/internal/LauncherService;Lcn/com/techvision/launchercore/internal/LauncherFlow$b;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcn/com/techvision/launchercore/internal/LauncherService;->i(Lcn/com/techvision/launchercore/internal/LauncherService;Lcn/com/techvision/launchercore/internal/LauncherFlow$b;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcn/com/techvision/launchercore/internal/LauncherService;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->r(Lcn/com/techvision/launchercore/internal/LauncherService;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic e(Lcn/com/techvision/launchercore/internal/LauncherService;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcn/com/techvision/launchercore/internal/LauncherService;->j(Lcn/com/techvision/launchercore/internal/LauncherService;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcn/com/techvision/launchercore/internal/LauncherService;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->q()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic g(Lh/c;)V
    .locals 0

    .line 1
    sput-object p0, Lcn/com/techvision/launchercore/internal/LauncherService;->f:Lh/c;

    .line 2
    .line 3
    return-void
.end method

.method public static final i(Lcn/com/techvision/launchercore/internal/LauncherService;Lcn/com/techvision/launchercore/internal/LauncherFlow$b;)Ljava/util/List;
    .locals 6

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "it"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lcn/com/techvision/launchercore/internal/LauncherService;->e:Lcn/com/techvision/launchercore/internal/LauncherService$a;

    .line 12
    .line 13
    const-string v0, "getActivityList"

    .line 14
    .line 15
    invoke-static {p1, v0}, Lcn/com/techvision/launchercore/internal/LauncherService$a;->a(Lcn/com/techvision/launchercore/internal/LauncherService$a;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->o()Landroid/content/pm/LauncherApps;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {}, Landroid/os/Process;->myUserHandle()Landroid/os/UserHandle;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {p1, v1, v0}, Landroid/content/pm/LauncherApps;->getActivityList(Ljava/lang/String;Landroid/os/UserHandle;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v0, "usableApps"

    .line 36
    .line 37
    invoke-static {p0, v0}, Landroid/provider/Settings$System;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-nez p0, :cond_0

    .line 42
    .line 43
    const-string p0, "[]"

    .line 44
    .line 45
    :cond_0
    const-string v0, "mAIList"

    .line 46
    .line 47
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    move-object v3, v2

    .line 70
    check-cast v3, Landroid/content/pm/LauncherActivityInfo;

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    :try_start_0
    invoke-virtual {v3}, Landroid/content/pm/LauncherActivityInfo;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const/4 v5, 0x2

    .line 86
    invoke-static {p0, v3, v4, v5, v1}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    goto :goto_1

    .line 91
    :catch_0
    move-exception v3

    .line 92
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 93
    .line 94
    .line 95
    :goto_1
    if-eqz v4, :cond_1

    .line 96
    .line 97
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    return-object v0
.end method

.method public static final j(Lcn/com/techvision/launchercore/internal/LauncherService;Ljava/util/List;)Ljava/util/List;
    .locals 9

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "it"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcn/com/techvision/launchercore/internal/LauncherService;->e:Lcn/com/techvision/launchercore/internal/LauncherService$a;

    .line 12
    .line 13
    const-string v1, "cache icon"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcn/com/techvision/launchercore/internal/LauncherService$a;->a(Lcn/com/techvision/launchercore/internal/LauncherService$a;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, "/launcher-core-icon/"

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Landroid/content/pm/LauncherActivityInfo;

    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/content/pm/LauncherActivityInfo;->getComponentName()Landroid/content/ComponentName;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    new-instance v3, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v4, ".png"

    .line 84
    .line 85
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    new-instance v4, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v2, ".flag"

    .line 108
    .line 109
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v3}, Lcom/blankj/utilcode/util/l;->y(Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    const-string v5, "1"

    .line 121
    .line 122
    if-eqz v4, :cond_1

    .line 123
    .line 124
    invoke-static {v2}, Lcom/blankj/utilcode/util/l;->y(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eqz v4, :cond_1

    .line 129
    .line 130
    invoke-static {v2}, Lcom/blankj/utilcode/util/k;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_1

    .line 139
    .line 140
    new-instance v2, Lh/a;

    .line 141
    .line 142
    invoke-virtual {v1}, Landroid/content/pm/LauncherActivityInfo;->getLabel()Ljava/lang/CharSequence;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {v1}, Landroid/content/pm/LauncherActivityInfo;->getComponentName()Landroid/content/ComponentName;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {v5}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-virtual {v1}, Landroid/content/pm/LauncherActivityInfo;->getComponentName()Landroid/content/ComponentName;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-direct {v2, v4, v5, v1, v3}, Lh/a;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/ComponentName;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_1
    invoke-static {v3}, Lcom/blankj/utilcode/util/l;->j(Ljava/lang/String;)Z

    .line 170
    .line 171
    .line 172
    invoke-static {v2}, Lcom/blankj/utilcode/util/l;->j(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    const-string v4, "0"

    .line 176
    .line 177
    const/4 v6, 0x0

    .line 178
    invoke-static {v2, v4, v6}, Lcom/blankj/utilcode/util/k;->h(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 179
    .line 180
    .line 181
    const/16 v4, 0x140

    .line 182
    .line 183
    invoke-virtual {v1, v4}, Landroid/content/pm/LauncherActivityInfo;->getIcon(I)Landroid/graphics/drawable/Drawable;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-static {v4}, Lcom/blankj/utilcode/util/n;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    sget-object v7, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 192
    .line 193
    const/4 v8, 0x1

    .line 194
    invoke-static {v4, v3, v7, v8}, Lcom/blankj/utilcode/util/n;->e(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;Z)Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-eqz v4, :cond_0

    .line 199
    .line 200
    invoke-static {v2, v5, v6}, Lcom/blankj/utilcode/util/k;->h(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 201
    .line 202
    .line 203
    new-instance v2, Lh/a;

    .line 204
    .line 205
    invoke-virtual {v1}, Landroid/content/pm/LauncherActivityInfo;->getLabel()Ljava/lang/CharSequence;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    invoke-virtual {v1}, Landroid/content/pm/LauncherActivityInfo;->getComponentName()Landroid/content/ComponentName;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-virtual {v5}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-virtual {v1}, Landroid/content/pm/LauncherActivityInfo;->getComponentName()Landroid/content/ComponentName;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-direct {v2, v4, v5, v1, v3}, Lh/a;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/ComponentName;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :cond_2
    return-object v0
.end method

.method public static final k(Ljava/util/List;)V
    .locals 1

    .line 1
    sget-object v0, Lcn/com/techvision/launchercore/internal/LauncherService;->f:Lh/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lh/c;->a(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static final l(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final r(Lcn/com/techvision/launchercore/internal/LauncherService;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->q()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final h()V
    .locals 3

    .line 1
    sget-object v0, Lcn/com/techvision/launchercore/internal/LauncherFlow;->b:Lcn/com/techvision/launchercore/internal/LauncherFlow$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcn/com/techvision/launchercore/internal/LauncherFlow$a;->a()Lcn/com/techvision/launchercore/internal/LauncherFlow;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lcn/com/techvision/launchercore/internal/LauncherFlow$b;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcn/com/techvision/launchercore/internal/LauncherFlow;->d(Ljava/lang/Class;)Lio/reactivex/Flowable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lio/reactivex/Flowable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Flowable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Lio/reactivex/Flowable;->unsubscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Flowable;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->single()Lio/reactivex/Scheduler;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Lio/reactivex/Flowable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Flowable;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Li/b;

    .line 38
    .line 39
    invoke-direct {v1, p0}, Li/b;-><init>(Lcn/com/techvision/launchercore/internal/LauncherService;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lio/reactivex/Flowable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Flowable;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->single()Lio/reactivex/Scheduler;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Lio/reactivex/Flowable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Flowable;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, Li/c;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Li/c;-><init>(Lcn/com/techvision/launchercore/internal/LauncherService;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lio/reactivex/Flowable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Flowable;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, Lio/reactivex/Flowable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Flowable;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v1, Li/d;

    .line 72
    .line 73
    invoke-direct {v1}, Li/d;-><init>()V

    .line 74
    .line 75
    .line 76
    new-instance v2, Li/e;

    .line 77
    .line 78
    invoke-direct {v2}, Li/e;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Flowable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->m()Lio/reactivex/disposables/CompositeDisposable;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final m()Lio/reactivex/disposables/CompositeDisposable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcn/com/techvision/launchercore/internal/LauncherService;->a:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/reactivex/disposables/CompositeDisposable;

    .line 8
    .line 9
    return-object v0
.end method

.method public final n()Landroid/content/pm/LauncherApps$Callback;
    .locals 1

    .line 1
    iget-object v0, p0, Lcn/com/techvision/launchercore/internal/LauncherService;->d:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/pm/LauncherApps$Callback;

    .line 8
    .line 9
    return-object v0
.end method

.method public final o()Landroid/content/pm/LauncherApps;
    .locals 1

    .line 1
    iget-object v0, p0, Lcn/com/techvision/launchercore/internal/LauncherService;->b:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/pm/LauncherApps;

    .line 8
    .line 9
    return-object v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lcom/blankj/utilcode/util/l0;->b(Landroid/app/Application;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcn/com/techvision/launchercore/internal/LauncherService;->e:Lcn/com/techvision/launchercore/internal/LauncherService$a;

    .line 12
    .line 13
    const-string v1, "onCreate"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcn/com/techvision/launchercore/internal/LauncherService$a;->a(Lcn/com/techvision/launchercore/internal/LauncherService$a;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->s()V

    .line 19
    .line 20
    .line 21
    const-string v1, "registerLA"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcn/com/techvision/launchercore/internal/LauncherService$a;->a(Lcn/com/techvision/launchercore/internal/LauncherService$a;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->h()V

    .line 27
    .line 28
    .line 29
    const-string v1, "forwardChange"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lcn/com/techvision/launchercore/internal/LauncherService$a;->a(Lcn/com/techvision/launchercore/internal/LauncherService$a;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Landroid/os/Handler;

    .line 35
    .line 36
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Li/a;

    .line 44
    .line 45
    invoke-direct {v2, p0}, Li/a;-><init>(Lcn/com/techvision/launchercore/internal/LauncherService;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 49
    .line 50
    .line 51
    const-string v1, "noticeChange"

    .line 52
    .line 53
    invoke-static {v0, v1}, Lcn/com/techvision/launchercore/internal/LauncherService$a;->a(Lcn/com/techvision/launchercore/internal/LauncherService$a;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->t()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->m()Lio/reactivex/disposables/CompositeDisposable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final p()Landroid/database/ContentObserver;
    .locals 1

    .line 1
    iget-object v0, p0, Lcn/com/techvision/launchercore/internal/LauncherService;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/database/ContentObserver;

    .line 8
    .line 9
    return-object v0
.end method

.method public final q()V
    .locals 3

    .line 1
    sget-object v0, Lcn/com/techvision/launchercore/internal/LauncherFlow;->b:Lcn/com/techvision/launchercore/internal/LauncherFlow$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcn/com/techvision/launchercore/internal/LauncherFlow$a;->a()Lcn/com/techvision/launchercore/internal/LauncherFlow;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcn/com/techvision/launchercore/internal/LauncherFlow$b;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, v2}, Lcn/com/techvision/launchercore/internal/LauncherFlow$b;-><init>(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcn/com/techvision/launchercore/internal/LauncherFlow;->c(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final s()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->o()Landroid/content/pm/LauncherApps;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->n()Landroid/content/pm/LauncherApps$Callback;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/content/pm/LauncherApps;->registerCallback(Landroid/content/pm/LauncherApps$Callback;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "usableApps"

    .line 17
    .line 18
    invoke-static {v1}, Landroid/provider/Settings$System;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->p()Landroid/database/ContentObserver;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final t()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->o()Landroid/content/pm/LauncherApps;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->n()Landroid/content/pm/LauncherApps$Callback;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/content/pm/LauncherApps;->unregisterCallback(Landroid/content/pm/LauncherApps$Callback;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherService;->p()Landroid/database/ContentObserver;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
