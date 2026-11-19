.class public final Lc5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/d;


# instance fields
.field public final synthetic a:Le5/a;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Le5/a;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc5/b;->a:Le5/a;

    .line 5
    .line 6
    iput-object p2, p0, Lc5/b;->b:Landroid/content/Context;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/io/File;)V
    .locals 6

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    sput-boolean v0, Lc5/c;->a:Z

    .line 8
    .line 9
    sget-object v1, Lcom/zykj/sketch/utils/LogUtils;->Companion:Lcom/zykj/sketch/utils/LogUtils$Companion;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "\u6587\u4ef6\u662f\u5426\u5b58\u5728: "

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "UpdateDebug"

    .line 30
    .line 31
    invoke-virtual {v1, v3, v2}, Lcom/zykj/sketch/utils/LogUtils$Companion;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v4, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v5, "APK\u7edd\u5bf9\u8def\u5f84: "

    .line 41
    .line 42
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v3, v2}, Lcom/zykj/sketch/utils/LogUtils$Companion;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Landroid/content/Intent;

    .line 56
    .line 57
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v2, "android.intent.action.VIEW"

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 63
    .line 64
    .line 65
    sget-object v2, Lh4/b;->a:Landroid/app/Application;

    .line 66
    .line 67
    const-string v3, "com.zykj.mistake.fileProvider"

    .line 68
    .line 69
    invoke-static {v2, v3, p1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-string v2, "getUriForFile(...)"

    .line 74
    .line 75
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const/high16 v2, 0x10000000

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 89
    .line 90
    .line 91
    const-string v2, "application/vnd.android.package-archive"

    .line 92
    .line 93
    invoke-virtual {v1, p1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lc5/b;->b:Landroid/content/Context;

    .line 97
    .line 98
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-static {p1}, Landroid/os/Process;->killProcess(I)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 109
    .line 110
    .line 111
    new-instance p1, Ljava/lang/RuntimeException;

    .line 112
    .line 113
    const-string v0, "System.exit returned normally, while it was supposed to halt JVM."

    .line 114
    .line 115
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p1
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-boolean v0, Lc5/c;->a:Z

    .line 3
    .line 4
    return-void
.end method

.method public final update(I)V
    .locals 2

    .line 1
    int-to-float p1, p1

    .line 2
    const/16 v0, 0x64

    .line 3
    .line 4
    int-to-float v0, v0

    .line 5
    div-float/2addr p1, v0

    .line 6
    sget v0, Lcom/zykj/mistake/R$id;->pcv_update_process:I

    .line 7
    .line 8
    iget-object v1, p0, Lc5/b;->a:Le5/a;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/zykj/mistake/update/view/PercentCircleView;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/update/view/PercentCircleView;->setTargetPercent(F)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
