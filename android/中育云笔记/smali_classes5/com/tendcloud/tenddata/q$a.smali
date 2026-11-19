.class Lcom/tendcloud/tenddata/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/q;


# direct methods
.method private constructor <init>(Lcom/tendcloud/tenddata/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/q$a;->this$0:Lcom/tendcloud/tenddata/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tendcloud/tenddata/q;Lcom/tendcloud/tenddata/q$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/q$a;-><init>(Lcom/tendcloud/tenddata/q;)V

    return-void
.end method

.method private internalSendMessage(ILorg/json/JSONObject;)V
    .locals 7

    .line 1
    invoke-static {}, Lcom/tendcloud/tenddata/q;->a()Lcom/tendcloud/tenddata/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/tendcloud/tenddata/q;->d(Lcom/tendcloud/tenddata/q;)Lcom/tendcloud/tenddata/q$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    iput-object p2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 16
    .line 17
    :cond_0
    const/4 p2, 0x2

    .line 18
    const-wide/16 v1, 0x0

    .line 19
    .line 20
    if-ne p1, p2, :cond_1

    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    iget-object v3, p0, Lcom/tendcloud/tenddata/q$a;->this$0:Lcom/tendcloud/tenddata/q;

    .line 27
    .line 28
    invoke-static {v3}, Lcom/tendcloud/tenddata/q;->e(Lcom/tendcloud/tenddata/q;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    sub-long v3, p1, v3

    .line 33
    .line 34
    const-wide/16 v5, 0x7d0

    .line 35
    .line 36
    cmp-long v3, v3, v5

    .line 37
    .line 38
    if-gez v3, :cond_1

    .line 39
    .line 40
    iget-object v1, p0, Lcom/tendcloud/tenddata/q$a;->this$0:Lcom/tendcloud/tenddata/q;

    .line 41
    .line 42
    invoke-static {v1}, Lcom/tendcloud/tenddata/q;->e(Lcom/tendcloud/tenddata/q;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    sub-long/2addr p1, v1

    .line 47
    sub-long v1, v5, p1

    .line 48
    .line 49
    :cond_1
    invoke-static {}, Lcom/tendcloud/tenddata/q;->a()Lcom/tendcloud/tenddata/q;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Lcom/tendcloud/tenddata/q;->d(Lcom/tendcloud/tenddata/q;)Lcom/tendcloud/tenddata/q$b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 58
    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public bindEvents(Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-direct {p0, v0, p1}, Lcom/tendcloud/tenddata/q$a;->internalSendMessage(ILorg/json/JSONObject;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public cleanup()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/q$a;->this$0:Lcom/tendcloud/tenddata/q;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/q;->d(Lcom/tendcloud/tenddata/q;)Lcom/tendcloud/tenddata/q$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/tendcloud/tenddata/q$a;->this$0:Lcom/tendcloud/tenddata/q;

    .line 14
    .line 15
    invoke-static {v1}, Lcom/tendcloud/tenddata/q;->d(Lcom/tendcloud/tenddata/q;)Lcom/tendcloud/tenddata/q$b;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public clearEdits(Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lcom/tendcloud/tenddata/q$a;->internalSendMessage(ILorg/json/JSONObject;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public performEdit(Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0, p1}, Lcom/tendcloud/tenddata/q$a;->internalSendMessage(ILorg/json/JSONObject;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public sendDeviceInfo()V
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v1}, Lcom/tendcloud/tenddata/q$a;->internalSendMessage(ILorg/json/JSONObject;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public sendSnapshot(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/tendcloud/tenddata/q;->a()Lcom/tendcloud/tenddata/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/tendcloud/tenddata/q;->d(Lcom/tendcloud/tenddata/q;)Lcom/tendcloud/tenddata/q$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v1, p1}, Lcom/tendcloud/tenddata/q$a;->internalSendMessage(ILorg/json/JSONObject;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setTweaks(Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lcom/tendcloud/tenddata/q$a;->internalSendMessage(ILorg/json/JSONObject;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
