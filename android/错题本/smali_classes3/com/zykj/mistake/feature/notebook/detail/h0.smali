.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lw4/c;

.field public final synthetic c:Lcom/zykj/mistake/activity/MainActivity;

.field public final synthetic d:Landroid/os/Messenger;


# direct methods
.method public synthetic constructor <init>(Lw4/c;Lcom/zykj/mistake/activity/MainActivity;Landroid/os/Messenger;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/zykj/mistake/feature/notebook/detail/h0;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/h0;->b:Lw4/c;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/h0;->c:Lcom/zykj/mistake/activity/MainActivity;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/h0;->d:Landroid/os/Messenger;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/h0;->a:I

    .line 2
    .line 3
    check-cast p1, Landroid/net/Uri;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/h0;->b:Lw4/c;

    .line 11
    .line 12
    invoke-static {v0}, Lw4/c;->a(Lw4/c;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/blankj/utilcode/util/c;->r(Landroid/net/Uri;)Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "getAbsolutePath(...)"

    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Landroid/content/Intent;

    .line 29
    .line 30
    const-class v1, Lcom/zykj/mistake/service/UploadIntentService;

    .line 31
    .line 32
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/h0;->c:Lcom/zykj/mistake/activity/MainActivity;

    .line 33
    .line 34
    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 35
    .line 36
    .line 37
    const-string v1, "UPLOAD_TYPE"

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    const-string v1, "UPLOAD_PATH"

    .line 44
    .line 45
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    const-string p1, "UPLOAD_MESSENGER"

    .line 49
    .line 50
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/h0;->d:Landroid/os/Messenger;

    .line 51
    .line 52
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 56
    .line 57
    .line 58
    :cond_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_0
    if-eqz p1, :cond_1

    .line 62
    .line 63
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/h0;->b:Lw4/c;

    .line 64
    .line 65
    invoke-static {v0}, Lw4/c;->a(Lw4/c;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Lcom/blankj/utilcode/util/c;->r(Landroid/net/Uri;)Ljava/io/File;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-string v0, "getAbsolutePath(...)"

    .line 77
    .line 78
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Landroid/content/Intent;

    .line 82
    .line 83
    const-class v1, Lcom/zykj/mistake/service/UploadIntentService;

    .line 84
    .line 85
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/h0;->c:Lcom/zykj/mistake/activity/MainActivity;

    .line 86
    .line 87
    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 88
    .line 89
    .line 90
    const-string v1, "UPLOAD_TYPE"

    .line 91
    .line 92
    const/4 v3, 0x1

    .line 93
    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 94
    .line 95
    .line 96
    const-string v1, "UPLOAD_PATH"

    .line 97
    .line 98
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 99
    .line 100
    .line 101
    const-string p1, "UPLOAD_MESSENGER"

    .line 102
    .line 103
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/h0;->d:Landroid/os/Messenger;

    .line 104
    .line 105
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 109
    .line 110
    .line 111
    :cond_1
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 112
    .line 113
    return-object p1

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
