.class public Lcom/friday/main/view/FullScreenPreviewActivity$$ARouter$$Autowired;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/android/arouter/facade/template/ISyringe;


# instance fields
.field private serializationService:Lcom/alibaba/android/arouter/facade/service/SerializationService;


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
.method public inject(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/alibaba/android/arouter/facade/service/SerializationService;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/alibaba/android/arouter/launcher/ARouter;->navigation(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/alibaba/android/arouter/facade/service/SerializationService;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/friday/main/view/FullScreenPreviewActivity$$ARouter$$Autowired;->serializationService:Lcom/alibaba/android/arouter/facade/service/SerializationService;

    .line 14
    .line 15
    check-cast p1, Lcom/friday/main/view/FullScreenPreviewActivity;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p1, Lcom/friday/main/view/FullScreenPreviewActivity;->j:Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "fileId"

    .line 39
    .line 40
    iget-object v2, p1, Lcom/friday/main/view/FullScreenPreviewActivity;->j:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    iput-object v0, p1, Lcom/friday/main/view/FullScreenPreviewActivity;->j:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "isSearchPage"

    .line 53
    .line 54
    iget-boolean v2, p1, Lcom/friday/main/view/FullScreenPreviewActivity;->k:Z

    .line 55
    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput-boolean v0, p1, Lcom/friday/main/view/FullScreenPreviewActivity;->k:Z

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "canEdit"

    .line 67
    .line 68
    iget-boolean v2, p1, Lcom/friday/main/view/FullScreenPreviewActivity;->l:Z

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iput-boolean v0, p1, Lcom/friday/main/view/FullScreenPreviewActivity;->l:Z

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, "isVersion6"

    .line 81
    .line 82
    iget-boolean v2, p1, Lcom/friday/main/view/FullScreenPreviewActivity;->m:Z

    .line 83
    .line 84
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iput-boolean v0, p1, Lcom/friday/main/view/FullScreenPreviewActivity;->m:Z

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-nez v0, :cond_1

    .line 99
    .line 100
    iget-object v0, p1, Lcom/friday/main/view/FullScreenPreviewActivity;->n:Ljava/lang/String;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const-string v1, "shareTime"

    .line 112
    .line 113
    iget-object v2, p1, Lcom/friday/main/view/FullScreenPreviewActivity;->n:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :goto_1
    iput-object v0, p1, Lcom/friday/main/view/FullScreenPreviewActivity;->n:Ljava/lang/String;

    .line 120
    .line 121
    return-void
.end method
