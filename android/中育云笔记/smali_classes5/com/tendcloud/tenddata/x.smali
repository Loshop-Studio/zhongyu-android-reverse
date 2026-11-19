.class Lcom/tendcloud/tenddata/x;
.super Landroid/os/Handler;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String; = "EventHandler"


# instance fields
.field private a:Lcom/tendcloud/tenddata/y;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/y;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/tenddata/x;->a:Lcom/tendcloud/tenddata/y;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1
    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_6

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-eq v0, v1, :cond_5

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq v0, v1, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    if-eq v0, v1, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x6

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x7

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/x;->a:Lcom/tendcloud/tenddata/y;

    .line 26
    .line 27
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lorg/json/JSONObject;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/y;->handleCodelessConfigSave(Lorg/json/JSONObject;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-object p1, p0, Lcom/tendcloud/tenddata/x;->a:Lcom/tendcloud/tenddata/y;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/y;->c()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    iget-object p1, p0, Lcom/tendcloud/tenddata/x;->a:Lcom/tendcloud/tenddata/y;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/y;->c()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    iget-object v0, p0, Lcom/tendcloud/tenddata/x;->a:Lcom/tendcloud/tenddata/y;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/y;->handleActivityResume(Landroid/os/Message;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_4
    iget-object v0, p0, Lcom/tendcloud/tenddata/x;->a:Lcom/tendcloud/tenddata/y;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/y;->a(Landroid/os/Message;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_5
    iget-object v0, p0, Lcom/tendcloud/tenddata/x;->a:Lcom/tendcloud/tenddata/y;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/y;->b(Landroid/os/Message;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_6
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Landroid/os/Looper;->quit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    :catch_0
    :goto_0
    return-void
.end method
