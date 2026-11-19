.class public Lcom/friday/main/view/FolderMoveActivity$$ARouter$$Autowired;
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
    iput-object v0, p0, Lcom/friday/main/view/FolderMoveActivity$$ARouter$$Autowired;->serializationService:Lcom/alibaba/android/arouter/facade/service/SerializationService;

    .line 14
    .line 15
    check-cast p1, Lcom/friday/main/view/FolderMoveActivity;

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
    iget-object v0, p1, Lcom/friday/main/view/FolderMoveActivity;->g:Ljava/lang/String;

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
    iget-object v2, p1, Lcom/friday/main/view/FolderMoveActivity;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    iput-object v0, p1, Lcom/friday/main/view/FolderMoveActivity;->g:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "fileIdList"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    iput-object v0, p1, Lcom/friday/main/view/FolderMoveActivity;->h:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    iget-object v0, p1, Lcom/friday/main/view/FolderMoveActivity;->i:Ljava/lang/String;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v1, "parentId"

    .line 84
    .line 85
    iget-object v2, p1, Lcom/friday/main/view/FolderMoveActivity;->i:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :goto_1
    iput-object v0, p1, Lcom/friday/main/view/FolderMoveActivity;->i:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-string v1, "isNoteCopy"

    .line 98
    .line 99
    iget-boolean v2, p1, Lcom/friday/main/view/FolderMoveActivity;->j:Z

    .line 100
    .line 101
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iput-boolean v0, p1, Lcom/friday/main/view/FolderMoveActivity;->j:Z

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const-string v1, "isNewNote"

    .line 112
    .line 113
    iget-boolean v2, p1, Lcom/friday/main/view/FolderMoveActivity;->k:Z

    .line 114
    .line 115
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    iput-boolean v0, p1, Lcom/friday/main/view/FolderMoveActivity;->k:Z

    .line 120
    .line 121
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const-string v1, "restoreFile"

    .line 126
    .line 127
    iget-boolean v2, p1, Lcom/friday/main/view/FolderMoveActivity;->l:Z

    .line 128
    .line 129
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    iput-boolean v0, p1, Lcom/friday/main/view/FolderMoveActivity;->l:Z

    .line 134
    .line 135
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const-string v1, "resourceList"

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, Ljava/util/ArrayList;

    .line 146
    .line 147
    iput-object v0, p1, Lcom/friday/main/view/FolderMoveActivity;->m:Ljava/util/ArrayList;

    .line 148
    .line 149
    return-void
.end method
