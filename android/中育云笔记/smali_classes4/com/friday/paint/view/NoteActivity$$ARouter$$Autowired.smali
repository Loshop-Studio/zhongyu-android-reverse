.class public Lcom/friday/paint/view/NoteActivity$$ARouter$$Autowired;
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
    iput-object v0, p0, Lcom/friday/paint/view/NoteActivity$$ARouter$$Autowired;->serializationService:Lcom/alibaba/android/arouter/facade/service/SerializationService;

    .line 14
    .line 15
    check-cast p1, Lcom/friday/paint/view/NoteActivity;

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
    iget-object v0, p1, Lcom/friday/paint/view/NoteActivity;->i:Ljava/lang/String;

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
    const-string v1, "parentId"

    .line 39
    .line 40
    iget-object v2, p1, Lcom/friday/paint/view/NoteActivity;->i:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    iput-object v0, p1, Lcom/friday/paint/view/NoteActivity;->i:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    iget-object v0, p1, Lcom/friday/paint/view/NoteActivity;->j:Ljava/lang/String;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "fileName"

    .line 70
    .line 71
    iget-object v2, p1, Lcom/friday/paint/view/NoteActivity;->j:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_1
    iput-object v0, p1, Lcom/friday/paint/view/NoteActivity;->j:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-nez v0, :cond_2

    .line 88
    .line 89
    iget-object v0, p1, Lcom/friday/paint/view/NoteActivity;->k:Ljava/lang/String;

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const-string v1, "fileId"

    .line 101
    .line 102
    iget-object v2, p1, Lcom/friday/paint/view/NoteActivity;->k:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :goto_2
    iput-object v0, p1, Lcom/friday/paint/view/NoteActivity;->k:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-nez v0, :cond_3

    .line 119
    .line 120
    iget-object v0, p1, Lcom/friday/paint/view/NoteActivity;->l:Ljava/lang/String;

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_3
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const-string v1, "fromPage"

    .line 132
    .line 133
    iget-object v2, p1, Lcom/friday/paint/view/NoteActivity;->l:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    :goto_3
    iput-object v0, p1, Lcom/friday/paint/view/NoteActivity;->l:Ljava/lang/String;

    .line 140
    .line 141
    return-void
.end method
