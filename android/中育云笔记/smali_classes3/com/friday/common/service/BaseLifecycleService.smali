.class public Lcom/friday/common/service/BaseLifecycleService;
.super Landroidx/lifecycle/LifecycleService;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final c:I = 0x8


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/LifecycleService;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {}, Lj2/a;->a()V

    .line 13
    .line 14
    .line 15
    const-string v1, "My Background Service"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static {v0, v1, v3}, Lcom/blankj/utilcode/util/j;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const v4, -0xffff01

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v4}, Lcom/blankj/utilcode/util/i;->a(Landroid/app/NotificationChannel;I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v3}, Lcom/blankj/utilcode/util/p;->a(Landroid/app/NotificationChannel;I)V

    .line 29
    .line 30
    .line 31
    const-string v3, "notification"

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const-string v4, "null cannot be cast to non-null type android.app.NotificationManager"

    .line 38
    .line 39
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    check-cast v3, Landroid/app/NotificationManager;

    .line 43
    .line 44
    invoke-static {v3, v1}, Lcom/blankj/utilcode/util/g;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Landroidx/core/app/NotificationCompat$Builder;

    .line 48
    .line 49
    invoke-direct {v1, p0, v0}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "\u670d\u52a1\u6b63\u5728\u8fd0\u884c"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "service"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "build(...)"

    .line 77
    .line 78
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v2, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_0
    new-instance v0, Landroid/app/Notification;

    .line 86
    .line 87
    invoke-direct {v0}, Landroid/app/Notification;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v2, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/lifecycle/LifecycleService;->onCreate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/service/BaseLifecycleService;->a()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/lifecycle/LifecycleService;->onDestroy()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
