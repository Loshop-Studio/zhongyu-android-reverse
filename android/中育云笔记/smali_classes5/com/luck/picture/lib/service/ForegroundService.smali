.class public Lcom/luck/picture/lib/service/ForegroundService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/String;

.field public static d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "com.luck.picture.lib."

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-class v1, Lcom/luck/picture/lib/service/ForegroundService;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lcom/luck/picture/lib/service/ForegroundService;->c:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    sput-boolean v0, Lcom/luck/picture/lib/service/ForegroundService;->d:Z

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 2

    .line 1
    :try_start_0
    sget-boolean v0, Lcom/luck/picture/lib/service/ForegroundService;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->u0:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Landroid/content/Intent;

    .line 14
    .line 15
    const-class v1, Lcom/luck/picture/lib/service/ForegroundService;

    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, La7/j;->d()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-static {p0, v0}, Landroidx/media/session/a;->a(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void

    .line 34
    :catch_0
    move-exception p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 2

    .line 1
    :try_start_0
    sget-boolean v0, Lcom/luck/picture/lib/service/ForegroundService;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/content/Intent;

    .line 6
    .line 7
    const-class v1, Lcom/luck/picture/lib/service/ForegroundService;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :catch_0
    move-exception p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Landroid/app/Notification;
    .locals 5

    .line 1
    invoke-static {}, La7/j;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    invoke-static {}, La7/j;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-static {}, Lj2/a;->a()V

    .line 19
    .line 20
    .line 21
    sget-object v2, Lcom/luck/picture/lib/service/ForegroundService;->c:Ljava/lang/String;

    .line 22
    .line 23
    const-string v4, "com.luck.picture.lib"

    .line 24
    .line 25
    invoke-static {v2, v4, v0}, Lcom/blankj/utilcode/util/j;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const v2, -0xffff01

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v2}, Lcom/blankj/utilcode/util/i;->a(Landroid/app/NotificationChannel;I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ly6/a;->a(Landroid/app/NotificationChannel;)Z

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v3}, Lcom/blankj/utilcode/util/n;->a(Landroid/app/NotificationChannel;Z)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/p;->a(Landroid/app/NotificationChannel;I)V

    .line 42
    .line 43
    .line 44
    const-string v1, "notification"

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Landroid/app/NotificationManager;

    .line 51
    .line 52
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/g;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 60
    .line 61
    invoke-static {}, Ll6/d;->b()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-ne v0, v1, :cond_2

    .line 66
    .line 67
    sget v0, Lcom/luck/picture/lib/R$string;->ps_use_sound:I

    .line 68
    .line 69
    :goto_1
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    sget v0, Lcom/luck/picture/lib/R$string;->ps_use_camera:I

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :goto_2
    new-instance v1, Landroidx/core/app/NotificationCompat$Builder;

    .line 78
    .line 79
    sget-object v2, Lcom/luck/picture/lib/service/ForegroundService;->c:Ljava/lang/String;

    .line 80
    .line 81
    invoke-direct {v1, p0, v2}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    sget v2, Lcom/luck/picture/lib/R$drawable;->ps_ic_trans_1px:I

    .line 85
    .line 86
    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {p0}, Lcom/luck/picture/lib/service/ForegroundService;->b()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0, v3}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    return-object v0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 31
    .line 32
    .line 33
    const-string v0, ""

    .line 34
    .line 35
    return-object v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/service/ForegroundService;->a()Landroid/app/Notification;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p0, v1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-boolean v0, Lcom/luck/picture/lib/service/ForegroundService;->d:Z

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/luck/picture/lib/service/ForegroundService;->d:Z

    .line 3
    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method
