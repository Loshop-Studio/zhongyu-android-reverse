.class Lcom/tendcloud/tenddata/du$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/du;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field appId:Ljava/lang/String;

.field channelId:Ljava/lang/String;

.field features:Lcom/tendcloud/tenddata/a;

.field final synthetic this$0:Lcom/tendcloud/tenddata/du;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/du;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/du$1;->this$0:Lcom/tendcloud/tenddata/du;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Ljava/util/HashMap;

    .line 6
    .line 7
    const-string v1, "appId"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, p0, Lcom/tendcloud/tenddata/du$1;->appId:Ljava/lang/String;

    .line 18
    .line 19
    const-string v1, "channelId"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, p0, Lcom/tendcloud/tenddata/du$1;->channelId:Ljava/lang/String;

    .line 30
    .line 31
    const-string v1, "Features"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lcom/tendcloud/tenddata/a;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/tendcloud/tenddata/du$1;->features:Lcom/tendcloud/tenddata/a;

    .line 40
    .line 41
    :cond_0
    iget p1, p1, Landroid/os/Message;->what:I

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    if-eq p1, v0, :cond_2

    .line 47
    .line 48
    const/4 v0, 0x3

    .line 49
    if-eq p1, v0, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance p1, Lcom/tendcloud/tenddata/el;

    .line 53
    .line 54
    invoke-direct {p1}, Lcom/tendcloud/tenddata/el;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v0, "app"

    .line 58
    .line 59
    iput-object v0, p1, Lcom/tendcloud/tenddata/el;->b:Ljava/lang/String;

    .line 60
    .line 61
    const-string v0, "initaddition"

    .line 62
    .line 63
    iput-object v0, p1, Lcom/tendcloud/tenddata/el;->c:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v0, p0, Lcom/tendcloud/tenddata/du$1;->features:Lcom/tendcloud/tenddata/a;

    .line 66
    .line 67
    iput-object v0, p1, Lcom/tendcloud/tenddata/el;->a:Lcom/tendcloud/tenddata/a;

    .line 68
    .line 69
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/cr;->post(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Lcom/tendcloud/tenddata/ek;

    .line 77
    .line 78
    invoke-direct {p1}, Lcom/tendcloud/tenddata/ek;-><init>()V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lcom/tendcloud/tenddata/du$1;->features:Lcom/tendcloud/tenddata/a;

    .line 82
    .line 83
    iput-object v0, p1, Lcom/tendcloud/tenddata/ek;->a:Lcom/tendcloud/tenddata/a;

    .line 84
    .line 85
    sget-object v0, Lcom/tendcloud/tenddata/ek$a;->IMMEDIATELY:Lcom/tendcloud/tenddata/ek$a;

    .line 86
    .line 87
    iput-object v0, p1, Lcom/tendcloud/tenddata/ek;->b:Lcom/tendcloud/tenddata/ek$a;

    .line 88
    .line 89
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/cr;->post(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_2
    const/4 p1, 0x0

    .line 98
    invoke-static {p1}, Lcom/tendcloud/tenddata/du;->a(Z)Z

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lcom/tendcloud/tenddata/du$1;->this$0:Lcom/tendcloud/tenddata/du;

    .line 102
    .line 103
    iget-object v0, p0, Lcom/tendcloud/tenddata/du$1;->appId:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v1, p0, Lcom/tendcloud/tenddata/du$1;->channelId:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v2, p0, Lcom/tendcloud/tenddata/du$1;->features:Lcom/tendcloud/tenddata/a;

    .line 108
    .line 109
    invoke-static {p1, v0, v1, v2}, Lcom/tendcloud/tenddata/du;->a(Lcom/tendcloud/tenddata/du;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_3
    iget-object p1, p0, Lcom/tendcloud/tenddata/du$1;->this$0:Lcom/tendcloud/tenddata/du;

    .line 114
    .line 115
    iget-object v0, p0, Lcom/tendcloud/tenddata/du$1;->appId:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v1, p0, Lcom/tendcloud/tenddata/du$1;->channelId:Ljava/lang/String;

    .line 118
    .line 119
    iget-object v2, p0, Lcom/tendcloud/tenddata/du$1;->features:Lcom/tendcloud/tenddata/a;

    .line 120
    .line 121
    invoke-static {p1, v0, v1, v2}, Lcom/tendcloud/tenddata/du;->a(Lcom/tendcloud/tenddata/du;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    .line 124
    :catchall_0
    :goto_0
    return-void
.end method
