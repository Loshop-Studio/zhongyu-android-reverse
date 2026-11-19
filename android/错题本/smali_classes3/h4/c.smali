.class public final Lh4/c;
.super Lc4/c;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Landroid/content/ComponentCallbacks;


# direct methods
.method public synthetic constructor <init>(Landroid/content/ComponentCallbacks;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh4/c;->d:I

    iput-object p1, p0, Lh4/c;->e:Landroid/content/ComponentCallbacks;

    invoke-direct {p0}, Lc4/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 5

    .line 1
    iget v0, p0, Lh4/c;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lh4/c;->e:Landroid/content/ComponentCallbacks;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v2, p1, Lcom/zykj/message/server/bean/ServerInfo;->a:Lcom/zykj/message/server/bean/Status;

    .line 12
    .line 13
    :cond_0
    sget-object p1, Lcom/zykj/message/server/bean/Status;->LOGIN:Lcom/zykj/message/server/bean/Status;

    .line 14
    .line 15
    if-ne v2, p1, :cond_1

    .line 16
    .line 17
    check-cast v1, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, v1, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->d:Z

    .line 21
    .line 22
    :cond_1
    return-void

    .line 23
    :pswitch_0
    check-cast v1, Lcom/zykj/mistake/application/MistakeApplication;

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    iget-object v0, p1, Lcom/zykj/message/server/bean/ServerInfo;->a:Lcom/zykj/message/server/bean/Status;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move-object v0, v2

    .line 31
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v4, "serverInfoUpdate -> "

    .line 34
    .line 35
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v3, "MistakeApplication"

    .line 46
    .line 47
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    iget-object v2, p1, Lcom/zykj/message/server/bean/ServerInfo;->a:Lcom/zykj/message/server/bean/Status;

    .line 53
    .line 54
    :cond_3
    sget-object v0, Lcom/zykj/message/server/bean/Status;->LOGIN:Lcom/zykj/message/server/bean/Status;

    .line 55
    .line 56
    if-ne v2, v0, :cond_4

    .line 57
    .line 58
    sget-object v0, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 59
    .line 60
    iget-object v0, p1, Lcom/zykj/message/server/bean/ServerInfo;->b:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v2, p1, Lcom/zykj/message/server/bean/ServerInfo;->c:Ljava/lang/String;

    .line 63
    .line 64
    const-string v3, "getServerUrl(...)"

    .line 65
    .line 66
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lcom/zykj/mistake/network/a;->b:Ljava/lang/String;

    .line 70
    .line 71
    const-string v0, "getToken(...)"

    .line 72
    .line 73
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sput-object v2, Lcom/zykj/mistake/network/a;->c:Ljava/lang/String;

    .line 77
    .line 78
    const-string v0, "SP_API_URL"

    .line 79
    .line 80
    iget-object p1, p1, Lcom/zykj/message/server/bean/ServerInfo;->b:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v1, v0, p1}, Lcom/zykj/mistake/utils/d;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string p1, "SP_API_TOKEN"

    .line 86
    .line 87
    invoke-static {v1, p1, v2}, Lcom/zykj/mistake/utils/d;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    return-void

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
