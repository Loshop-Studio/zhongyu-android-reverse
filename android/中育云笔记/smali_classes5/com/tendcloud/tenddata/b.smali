.class public Lcom/tendcloud/tenddata/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# instance fields
.field mAEPEditState:Lcom/tendcloud/tenddata/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/tendcloud/tenddata/y;->a()Lcom/tendcloud/tenddata/y;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sput-boolean v0, Lcom/tendcloud/tenddata/ab;->I:Z

    .line 3
    .line 4
    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/c;->b(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/tendcloud/tenddata/b;->mAEPEditState:Lcom/tendcloud/tenddata/g;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/g;->remove(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    :catchall_0
    :cond_0
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/tendcloud/tenddata/ab;->K:Z

    .line 3
    .line 4
    sput-boolean v0, Lcom/tendcloud/tenddata/ab;->I:Z

    .line 5
    .line 6
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    .line 7
    .line 8
    invoke-static {p1, v1}, Lcom/tendcloud/tenddata/c;->a(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/tendcloud/tenddata/u;->a()Lcom/tendcloud/tenddata/u;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/u;->b()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    const-string v3, "talkingdata"

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    const-string v3, "loginToken"

    .line 45
    .line 46
    invoke-virtual {v1, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {}, Lcom/tendcloud/tenddata/u;->a()Lcom/tendcloud/tenddata/u;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3, v1}, Lcom/tendcloud/tenddata/u;->connectWebSocket(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v3, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v4, "Codeless Scheme: "

    .line 63
    .line 64
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v2}, Lcom/tendcloud/tenddata/ca;->iForDeveloper(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v2, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v3, "Codeless Token:  "

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v1}, Lcom/tendcloud/tenddata/ca;->iForDeveloper(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_0
    iget-object v1, p0, Lcom/tendcloud/tenddata/b;->mAEPEditState:Lcom/tendcloud/tenddata/g;

    .line 98
    .line 99
    if-eqz v1, :cond_1

    .line 100
    .line 101
    invoke-virtual {v1, p1}, Lcom/tendcloud/tenddata/g;->add(Landroid/app/Activity;)V

    .line 102
    .line 103
    .line 104
    :cond_1
    invoke-static {}, Lcom/tendcloud/tenddata/l;->a()Lcom/tendcloud/tenddata/l;

    .line 105
    .line 106
    .line 107
    sput-boolean v0, Lcom/tendcloud/tenddata/ab;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    :catchall_0
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public setEditState(Lcom/tendcloud/tenddata/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/b;->mAEPEditState:Lcom/tendcloud/tenddata/g;

    .line 2
    .line 3
    return-void
.end method
