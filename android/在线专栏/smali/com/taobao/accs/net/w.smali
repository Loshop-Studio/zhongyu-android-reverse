.class public Lcom/taobao/accs/net/w;
.super Lcom/taobao/accs/net/b;
.source "SourceFile"

# interfaces
.implements Lorg/android/spdy/SessionCb;
.implements Lorg/android/spdy/Spdycb;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/taobao/accs/net/w$a;
    }
.end annotation


# instance fields
.field private final A:Ljava/lang/Object;

.field private B:J

.field private C:J

.field private D:J

.field private E:J

.field private F:I

.field private G:Ljava/lang/String;

.field private H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

.field private I:Lcom/taobao/accs/ut/a/c;

.field private J:Z

.field private K:Ljava/lang/String;

.field private L:Z

.field private M:Lcom/taobao/accs/net/g;

.field private N:Ljava/lang/String;

.field protected n:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field protected o:Ljava/lang/String;

.field protected p:I

.field protected q:Ljava/lang/String;

.field protected r:I

.field private s:I

.field private final t:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/taobao/accs/data/Message;",
            ">;"
        }
    .end annotation
.end field

.field private u:Lcom/taobao/accs/net/w$a;

.field private v:Z

.field private w:Ljava/lang/String;

.field private x:Ljava/lang/String;

.field private y:Lorg/android/spdy/SpdyAgent;

.field private z:Lorg/android/spdy/SpdySession;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/taobao/accs/net/b;-><init>(Landroid/content/Context;ILjava/lang/String;)V

    const/4 p1, 0x3

    .line 2
    iput p1, p0, Lcom/taobao/accs/net/w;->s:I

    .line 3
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/taobao/accs/net/w;->v:Z

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/taobao/accs/net/w;->y:Lorg/android/spdy/SpdyAgent;

    .line 6
    iput-object p1, p0, Lcom/taobao/accs/net/w;->z:Lorg/android/spdy/SpdySession;

    .line 7
    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/taobao/accs/net/w;->A:Ljava/lang/Object;

    const/4 p2, -0x1

    .line 8
    iput p2, p0, Lcom/taobao/accs/net/w;->F:I

    .line 9
    iput-object p1, p0, Lcom/taobao/accs/net/w;->G:Ljava/lang/String;

    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lcom/taobao/accs/net/w;->J:Z

    const-string p2, ""

    .line 11
    iput-object p2, p0, Lcom/taobao/accs/net/w;->K:Ljava/lang/String;

    .line 12
    iput-boolean p1, p0, Lcom/taobao/accs/net/w;->L:Z

    .line 13
    new-instance p1, Lcom/taobao/accs/net/g;

    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->r()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/taobao/accs/net/g;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/taobao/accs/net/w;->M:Lcom/taobao/accs/net/g;

    .line 14
    invoke-direct {p0}, Lcom/taobao/accs/net/w;->w()V

    return-void
.end method

.method static synthetic a(Lcom/taobao/accs/net/w;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/taobao/accs/net/w;->B:J

    return-wide p1
.end method

.method static synthetic a(Lcom/taobao/accs/net/w;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/taobao/accs/net/w;->K:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    return-object p0
.end method

.method private a(Lcom/alibaba/sdk/android/error/ErrorCode;)V
    .locals 11

    const/4 v0, 0x0

    .line 74
    iput-object v0, p0, Lcom/taobao/accs/net/b;->k:Ljava/lang/String;

    .line 75
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->q()V

    .line 76
    iget-object v0, p0, Lcom/taobao/accs/net/w;->u:Lcom/taobao/accs/net/w$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 77
    iget v0, v0, Lcom/taobao/accs/net/w$a;->a:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 78
    :goto_0
    iget-object v2, p0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "code not 200 is"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setCloseReason(Ljava/lang/String;)V

    const/4 v2, 0x1

    .line 79
    iput-boolean v2, p0, Lcom/taobao/accs/net/w;->L:Z

    .line 80
    iget v3, p0, Lcom/taobao/accs/net/b;->c:I

    if-nez v3, :cond_1

    const-string v3, "service"

    goto :goto_1

    :cond_1
    const-string v3, "inapp"

    .line 81
    :goto_1
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v4

    const v5, 0x101d1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "CONNECTED NO 200 "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v0, 0xde

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v0, 0x2

    new-array v10, v0, [Ljava/lang/String;

    iget-object v0, p0, Lcom/taobao/accs/net/w;->x:Ljava/lang/String;

    aput-object v0, v10, v1

    iget-object v0, p0, Lcom/taobao/accs/net/w;->K:Ljava/lang/String;

    aput-object v0, v10, v2

    move-object v7, p1

    invoke-virtual/range {v4 .. v10}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "accs"

    const-string v2, "auth"

    invoke-static {v1, v2, p1, v0, p1}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/taobao/accs/data/Message;)V
    .locals 6

    .line 37
    iget-object v0, p1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_6

    .line 39
    iget-object v2, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/taobao/accs/data/Message;

    if-eqz v2, :cond_5

    .line 40
    iget-object v3, v2, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    if-eqz v3, :cond_5

    .line 41
    invoke-virtual {v2}, Lcom/taobao/accs/data/Message;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 42
    iget-object v3, p1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto :goto_1

    .line 43
    :pswitch_0
    iget-object v3, v2, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x5

    if-eq v3, v4, :cond_1

    iget-object v3, v2, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    .line 44
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x6

    if-ne v3, v4, :cond_4

    .line 45
    :cond_1
    iget-object v3, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 46
    :pswitch_1
    iget-object v3, v2, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x3

    if-eq v3, v4, :cond_2

    iget-object v3, v2, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    .line 47
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x4

    if-ne v3, v4, :cond_4

    .line 48
    :cond_2
    iget-object v3, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 49
    :pswitch_2
    iget-object v3, v2, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v3, v1, :cond_3

    iget-object v3, v2, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    .line 50
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_4

    .line 51
    :cond_3
    iget-object v3, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    .line 52
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "clearRepeatControlCommand message:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v2, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    invoke-virtual {v2}, Lcom/taobao/accs/data/Message;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    .line 54
    invoke-static {v3, v2, v4}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_5
    add-int/lit8 v0, v0, -0x1

    goto/16 :goto_0

    .line 55
    :cond_6
    iget-object v0, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    if-eqz v0, :cond_7

    .line 56
    invoke-virtual {v0, p1}, Lcom/taobao/accs/data/d;->b(Lcom/taobao/accs/data/Message;)V

    :cond_7
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic a(Lcom/taobao/accs/net/w;Lcom/taobao/accs/data/Message;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/data/Message;)V

    return-void
.end method

.method static synthetic a(Lcom/taobao/accs/net/w;Z)Z
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/taobao/accs/net/w;->J:Z

    return p1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 11

    .line 57
    invoke-static {}, Lcom/taobao/accs/utl/Utils;->getMode()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    return v2

    .line 58
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 59
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_1
    const/4 v0, 0x3

    .line 60
    invoke-direct {p0, v0}, Lcom/taobao/accs/net/w;->c(I)V

    .line 61
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    .line 62
    :cond_3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v0, 0x2

    goto :goto_0

    .line 63
    :cond_4
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 64
    :goto_0
    iget-object p1, p0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {p1, v0}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setFailReason(I)V

    .line 65
    iget-object p1, p0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {p1}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->onConnectStop()V

    .line 66
    iget p1, p0, Lcom/taobao/accs/net/b;->c:I

    if-nez p1, :cond_5

    const-string p1, "service"

    goto :goto_1

    :cond_5
    const-string p1, "inapp"

    .line 67
    :goto_1
    iget-object p2, p0, Lcom/taobao/accs/net/w;->u:Lcom/taobao/accs/net/w$a;

    if-eqz p2, :cond_6

    .line 68
    iget p2, p2, Lcom/taobao/accs/net/w$a;->a:I

    goto :goto_2

    :cond_6
    const/4 p2, 0x0

    .line 69
    :goto_2
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v4

    const v5, 0x101d1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "DISCONNECT "

    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 70
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 p1, 0xde

    .line 71
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-array v10, v1, [Ljava/lang/String;

    iget-object p1, p0, Lcom/taobao/accs/net/w;->x:Ljava/lang/String;

    aput-object p1, v10, v3

    iget-object p1, p0, Lcom/taobao/accs/net/w;->K:Ljava/lang/String;

    aput-object p1, v10, v2

    .line 72
    invoke-virtual/range {v4 .. v10}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 73
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "retrytimes:"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "accs"

    const-string v1, "connect"

    invoke-static {v0, v1, p1, p2, p3}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_7
    return v2
.end method

.method static synthetic b(Lcom/taobao/accs/net/w;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/taobao/accs/net/w;->s:I

    return p0
.end method

.method static synthetic b(Lcom/taobao/accs/net/w;J)J
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/taobao/accs/net/w;->C:J

    return-wide p1
.end method

.method static synthetic b(Lcom/taobao/accs/net/w;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/taobao/accs/net/w;->d(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/taobao/accs/net/w;Z)Z
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/taobao/accs/net/w;->L:Z

    return p1
.end method

.method static synthetic c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    return-object p0
.end method

.method private declared-synchronized c(I)V
    .locals 9

    monitor-enter p0

    .line 13
    :try_start_0
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "notifyStatus start"

    const/4 v2, 0x2

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "status"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {p0, p1}, Lcom/taobao/accs/net/b;->a(I)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    invoke-static {v0, v1, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    iget v0, p0, Lcom/taobao/accs/net/w;->s:I

    if-ne p1, v0, :cond_0

    .line 15
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ignore notifyStatus"

    new-array v1, v5, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 16
    monitor-exit p0

    return-void

    .line 17
    :cond_0
    :try_start_1
    iput p1, p0, Lcom/taobao/accs/net/w;->s:I

    if-eq p1, v6, :cond_4

    if-eq p1, v2, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    goto/16 :goto_4

    .line 18
    :cond_1
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "notifyStatus"

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "status"

    aput-object v4, v3, v5

    invoke-virtual {p0, p1}, Lcom/taobao/accs/net/b;->a(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v0, v1, v3}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    invoke-direct {p0}, Lcom/taobao/accs/net/w;->v()V

    .line 20
    iget-object v0, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/taobao/accs/net/f;->a(Landroid/content/Context;)Lcom/taobao/accs/net/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/taobao/accs/net/f;->d()V

    .line 21
    iget-object v0, p0, Lcom/taobao/accs/net/w;->A:Ljava/lang/Object;

    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 22
    :try_start_2
    iget-object v1, p0, Lcom/taobao/accs/net/w;->A:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 23
    :catch_0
    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 24
    :try_start_4
    iget-object v0, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->SPDY_CON_DISCONNECTED:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v1

    invoke-static {}, Lcom/taobao/accs/utl/i;->a()Lcom/taobao/accs/utl/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/taobao/accs/utl/i;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/taobao/accs/data/d;->a(Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 25
    invoke-virtual {p0, v5, v6}, Lcom/taobao/accs/net/w;->a(ZZ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_4

    .line 26
    :goto_1
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1

    .line 27
    :cond_2
    iget-object v0, p0, Lcom/taobao/accs/net/w;->n:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_3

    .line 28
    invoke-interface {v0, v6}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 29
    :cond_3
    iget-object v0, p0, Lcom/taobao/accs/net/w;->N:Ljava/lang/String;

    .line 30
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v1

    new-instance v3, Lcom/taobao/accs/net/z;

    invoke-direct {v3, p0, v0}, Lcom/taobao/accs/net/z;-><init>(Lcom/taobao/accs/net/w;Ljava/lang/String;)V

    const-wide/32 v7, 0x1d4c0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v3, v7, v8, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    goto :goto_4

    .line 31
    :cond_4
    iget-object v0, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/taobao/accs/net/f;->a(Landroid/content/Context;)Lcom/taobao/accs/net/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/taobao/accs/net/f;->f()V

    .line 32
    invoke-direct {p0}, Lcom/taobao/accs/net/w;->v()V

    .line 33
    iget-object v0, p0, Lcom/taobao/accs/net/w;->n:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_5

    .line 34
    invoke-interface {v0, v6}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 35
    :cond_5
    iget-object v0, p0, Lcom/taobao/accs/net/w;->A:Ljava/lang/Object;

    monitor-enter v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 36
    :try_start_7
    iget-object v1, p0, Lcom/taobao/accs/net/w;->A:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_6

    .line 37
    :catch_1
    :goto_2
    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 38
    :try_start_9
    iget-object v0, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    monitor-enter v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 39
    :try_start_a
    iget-object v1, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p1

    goto :goto_5

    .line 40
    :catch_2
    :goto_3
    :try_start_b
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 41
    :goto_4
    :try_start_c
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "notifyStatus end"

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "status"

    aput-object v3, v2, v5

    invoke-virtual {p0, p1}, Lcom/taobao/accs/net/b;->a(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v6

    invoke-static {v0, v1, v2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 42
    monitor-exit p0

    return-void

    .line 43
    :goto_5
    :try_start_d
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    :try_start_e
    throw p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 44
    :goto_6
    :try_start_f
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    :try_start_10
    throw p1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    :catchall_3
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic d(Lcom/taobao/accs/net/w;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/taobao/accs/net/w;->N:Ljava/lang/String;

    return-object p0
.end method

.method private d(Ljava/lang/String;)V
    .locals 17

    move-object/from16 v10, p0

    move-object/from16 v0, p1

    .line 2
    iget v1, v10, Lcom/taobao/accs/net/w;->s:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_e

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    goto/16 :goto_a

    .line 3
    :cond_0
    iget-object v1, v10, Lcom/taobao/accs/net/w;->M:Lcom/taobao/accs/net/g;

    if-nez v1, :cond_1

    .line 4
    new-instance v1, Lcom/taobao/accs/net/g;

    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->r()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Lcom/taobao/accs/net/g;-><init>(Ljava/lang/String;)V

    iput-object v1, v10, Lcom/taobao/accs/net/w;->M:Lcom/taobao/accs/net/g;

    .line 5
    :cond_1
    iget-object v1, v10, Lcom/taobao/accs/net/w;->M:Lcom/taobao/accs/net/g;

    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->r()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/taobao/accs/net/g;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    const-wide/16 v4, 0x0

    const/16 v6, 0x1bb

    const-wide/16 v11, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x4

    const/4 v13, 0x0

    if-eqz v1, :cond_7

    .line 6
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v9

    if-lez v9, :cond_7

    .line 7
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lanet/channel/strategy/IConnStrategy;

    if-eqz v1, :cond_2

    .line 8
    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v9

    const-string v14, "connect"

    new-array v15, v8, [Ljava/lang/Object;

    const-string v16, "ip"

    aput-object v16, v15, v13

    invoke-interface {v1}, Lanet/channel/strategy/IConnStrategy;->getIp()Ljava/lang/String;

    move-result-object v16

    aput-object v16, v15, v3

    const-string v16, "port"

    aput-object v16, v15, v2

    invoke-interface {v1}, Lanet/channel/strategy/IConnStrategy;->getPort()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v15, v7

    invoke-static {v9, v14, v15}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 9
    :cond_3
    iget-boolean v0, v10, Lcom/taobao/accs/net/w;->L:Z

    if-eqz v0, :cond_4

    .line 10
    iget-object v0, v10, Lcom/taobao/accs/net/w;->M:Lcom/taobao/accs/net/g;

    invoke-virtual {v0}, Lcom/taobao/accs/net/g;->b()V

    .line 11
    iput-boolean v13, v10, Lcom/taobao/accs/net/w;->L:Z

    .line 12
    :cond_4
    iget-object v0, v10, Lcom/taobao/accs/net/w;->M:Lcom/taobao/accs/net/g;

    invoke-virtual {v0}, Lcom/taobao/accs/net/g;->a()Lanet/channel/strategy/IConnStrategy;

    move-result-object v0

    if-nez v0, :cond_5

    .line 13
    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->r()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_5
    invoke-interface {v0}, Lanet/channel/strategy/IConnStrategy;->getIp()Ljava/lang/String;

    move-result-object v1

    :goto_1
    iput-object v1, v10, Lcom/taobao/accs/net/w;->o:Ljava/lang/String;

    if-nez v0, :cond_6

    goto :goto_2

    .line 14
    :cond_6
    invoke-interface {v0}, Lanet/channel/strategy/IConnStrategy;->getPort()I

    move-result v6

    :goto_2
    iput v6, v10, Lcom/taobao/accs/net/w;->p:I

    const-string v0, "accs"

    const-string v1, "dns"

    const-string v6, "httpdns"

    .line 15
    invoke-static {v0, v1, v6, v4, v5}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    .line 16
    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "connect from amdc succ"

    const/4 v4, 0x6

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "ip"

    aput-object v5, v4, v13

    iget-object v5, v10, Lcom/taobao/accs/net/w;->o:Ljava/lang/String;

    aput-object v5, v4, v3

    const-string v5, "port"

    aput-object v5, v4, v2

    iget v5, v10, Lcom/taobao/accs/net/w;->p:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v7

    const-string v5, "originPos"

    aput-object v5, v4, v8

    const/4 v5, 0x5

    iget-object v6, v10, Lcom/taobao/accs/net/w;->M:Lcom/taobao/accs/net/g;

    invoke-virtual {v6}, Lcom/taobao/accs/net/g;->c()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v0, v1, v4}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    if-eqz v0, :cond_8

    .line 17
    iput-object v0, v10, Lcom/taobao/accs/net/w;->o:Ljava/lang/String;

    goto :goto_3

    .line 18
    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->r()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Lcom/taobao/accs/net/w;->o:Ljava/lang/String;

    .line 19
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v14, 0x2

    rem-long/2addr v0, v14

    cmp-long v9, v0, v11

    if-nez v9, :cond_9

    const/16 v6, 0x50

    :cond_9
    iput v6, v10, Lcom/taobao/accs/net/w;->p:I

    const-string v0, "accs"

    const-string v1, "dns"

    const-string v6, "localdns"

    .line 20
    invoke-static {v0, v1, v6, v4, v5}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    .line 21
    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "connect get ip from amdc fail!!"

    new-array v4, v13, [Ljava/lang/Object;

    invoke-static {v0, v1, v4}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    :goto_4
    iget-object v0, v10, Lcom/taobao/accs/net/w;->o:Ljava/lang/String;

    invoke-static {v0}, Lcom/taobao/accs/utl/Utils;->isIPV6Address(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v10, Lcom/taobao/accs/net/w;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v10, Lcom/taobao/accs/net/w;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "/accs/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Lcom/taobao/accs/net/w;->w:Ljava/lang/String;

    goto :goto_5

    .line 24
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v10, Lcom/taobao/accs/net/w;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v10, Lcom/taobao/accs/net/w;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "/accs/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Lcom/taobao/accs/net/w;->w:Ljava/lang/String;

    .line 25
    :goto_5
    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "connect"

    new-array v4, v2, [Ljava/lang/Object;

    const-string v5, "URL"

    aput-object v5, v4, v13

    iget-object v5, v10, Lcom/taobao/accs/net/w;->w:Ljava/lang/String;

    aput-object v5, v4, v3

    invoke-static {v0, v1, v4}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Lcom/taobao/accs/net/w;->N:Ljava/lang/String;

    .line 27
    iget-object v0, v10, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    if-eqz v0, :cond_b

    .line 28
    invoke-static {}, Lanet/channel/appmonitor/AppMonitor;->getInstance()Lanet/channel/appmonitor/IAppMonitor;

    move-result-object v0

    iget-object v1, v10, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-interface {v0, v1}, Lanet/channel/appmonitor/IAppMonitor;->commitStat(Lanet/channel/statist/StatObject;)V

    .line 29
    :cond_b
    new-instance v0, Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-direct {v0}, Lcom/taobao/accs/ut/monitor/SessionMonitor;-><init>()V

    iput-object v0, v10, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    .line 30
    iget v1, v10, Lcom/taobao/accs/net/b;->c:I

    if-nez v1, :cond_c

    const-string v1, "service"

    goto :goto_6

    :cond_c
    const-string v1, "inapp"

    :goto_6
    invoke-virtual {v0, v1}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setConnectType(Ljava/lang/String;)V

    .line 31
    iget-object v0, v10, Lcom/taobao/accs/net/w;->y:Lorg/android/spdy/SpdyAgent;

    if-eqz v0, :cond_e

    .line 32
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, v10, Lcom/taobao/accs/net/w;->D:J

    .line 33
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, v10, Lcom/taobao/accs/net/w;->E:J

    .line 34
    iget-object v0, v10, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/taobao/accs/utl/UtilityImpl;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Lcom/taobao/accs/net/w;->q:Ljava/lang/String;

    .line 35
    iget-object v0, v10, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/taobao/accs/utl/UtilityImpl;->b(Landroid/content/Context;)I

    move-result v0

    iput v0, v10, Lcom/taobao/accs/net/w;->r:I

    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, v10, Lcom/taobao/accs/net/w;->B:J

    .line 37
    iget-object v0, v10, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {v0}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->onStartConnect()V

    .line 38
    invoke-direct {v10, v2}, Lcom/taobao/accs/net/w;->c(I)V

    .line 39
    iget-object v14, v10, Lcom/taobao/accs/net/w;->A:Ljava/lang/Object;

    monitor-enter v14
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 40
    :try_start_1
    iget-object v0, v10, Lcom/taobao/accs/net/w;->q:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    iget v0, v10, Lcom/taobao/accs/net/w;->r:I

    if-ltz v0, :cond_d

    iget-boolean v0, v10, Lcom/taobao/accs/net/w;->J:Z

    if-eqz v0, :cond_d

    .line 41
    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "connect"

    new-array v4, v8, [Ljava/lang/Object;

    const-string v5, "proxy"

    aput-object v5, v4, v13

    iget-object v5, v10, Lcom/taobao/accs/net/w;->q:Ljava/lang/String;

    aput-object v5, v4, v3

    const-string v3, "port"

    aput-object v3, v4, v2

    iget v2, v10, Lcom/taobao/accs/net/w;->r:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v7

    invoke-static {v0, v1, v4}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    new-instance v0, Lorg/android/spdy/SessionInfo;

    iget-object v2, v10, Lcom/taobao/accs/net/w;->o:Ljava/lang/String;

    iget v3, v10, Lcom/taobao/accs/net/w;->p:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->r()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "_"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v10, Lcom/taobao/accs/net/b;->b:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v10, Lcom/taobao/accs/net/w;->q:Ljava/lang/String;

    iget v6, v10, Lcom/taobao/accs/net/w;->r:I

    iget-object v7, v10, Lcom/taobao/accs/net/w;->N:Ljava/lang/String;

    const/16 v9, 0x1082

    move-object v1, v0

    move-object/from16 v8, p0

    invoke-direct/range {v1 .. v9}, Lorg/android/spdy/SessionInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;Lorg/android/spdy/SessionCb;I)V

    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v10, Lcom/taobao/accs/net/w;->q:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v10, Lcom/taobao/accs/net/w;->r:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Lcom/taobao/accs/net/w;->K:Ljava/lang/String;

    goto :goto_7

    .line 44
    :cond_d
    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "connect normal"

    new-array v2, v13, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    new-instance v0, Lorg/android/spdy/SessionInfo;

    iget-object v2, v10, Lcom/taobao/accs/net/w;->o:Ljava/lang/String;

    iget v3, v10, Lcom/taobao/accs/net/w;->p:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->r()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "_"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v10, Lcom/taobao/accs/net/b;->b:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-object v7, v10, Lcom/taobao/accs/net/w;->N:Ljava/lang/String;

    const/16 v9, 0x1082

    move-object v1, v0

    move-object/from16 v8, p0

    invoke-direct/range {v1 .. v9}, Lorg/android/spdy/SessionInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;Lorg/android/spdy/SessionCb;I)V

    const-string v1, ""

    .line 46
    iput-object v1, v10, Lcom/taobao/accs/net/w;->K:Ljava/lang/String;

    .line 47
    :goto_7
    invoke-direct/range {p0 .. p0}, Lcom/taobao/accs/net/w;->t()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/android/spdy/SessionInfo;->setPubKeySeqNum(I)V

    const v1, 0x9c40

    .line 48
    invoke-virtual {v0, v1}, Lorg/android/spdy/SessionInfo;->setConnectionTimeoutMs(I)V

    .line 49
    iget-object v1, v10, Lcom/taobao/accs/net/w;->y:Lorg/android/spdy/SpdyAgent;

    invoke-virtual {v1, v0}, Lorg/android/spdy/SpdyAgent;->createSession(Lorg/android/spdy/SessionInfo;)Lorg/android/spdy/SpdySession;

    move-result-object v0

    iput-object v0, v10, Lcom/taobao/accs/net/w;->z:Lorg/android/spdy/SpdySession;

    .line 50
    iget-object v0, v10, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    iput-wide v11, v0, Lcom/taobao/accs/ut/monitor/SessionMonitor;->connection_stop_date:J

    .line 51
    iget-object v0, v10, Lcom/taobao/accs/net/w;->A:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_9

    :catch_0
    move-exception v0

    .line 52
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 53
    iput-boolean v13, v10, Lcom/taobao/accs/net/w;->J:Z

    goto :goto_8

    :catch_1
    move-exception v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 55
    :goto_8
    monitor-exit v14

    goto :goto_a

    :goto_9
    monitor-exit v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    move-exception v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_e
    :goto_a
    return-void
.end method

.method static synthetic e(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/net/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/taobao/accs/net/w;->M:Lcom/taobao/accs/net/g;

    return-object p0
.end method

.method static synthetic f(Lcom/taobao/accs/net/w;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/taobao/accs/net/w;->v:Z

    return p0
.end method

.method static synthetic g(Lcom/taobao/accs/net/w;)J
    .locals 2

    iget-wide v0, p0, Lcom/taobao/accs/net/w;->B:J

    return-wide v0
.end method

.method static synthetic h(Lcom/taobao/accs/net/w;)Lorg/android/spdy/SpdySession;
    .locals 0

    iget-object p0, p0, Lcom/taobao/accs/net/w;->z:Lorg/android/spdy/SpdySession;

    return-object p0
.end method

.method static synthetic i(Lcom/taobao/accs/net/w;)V
    .locals 0

    invoke-direct {p0}, Lcom/taobao/accs/net/w;->v()V

    return-void
.end method

.method private t()I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/taobao/accs/net/b;->k()Z

    move-result v0

    .line 2
    sget v1, Lcom/taobao/accs/AccsClientConfig;->mEnv:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v1}, Lcom/taobao/accs/AccsClientConfig;->getChannelPubKey()I

    move-result v1

    if-lez v1, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v4, "pubKey"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const-string v3, "getPublicKeyType use custom pub key"

    invoke-static {v0, v3, v2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    :cond_1
    if-eqz v0, :cond_2

    const/4 v3, 0x4

    goto :goto_0

    :cond_2
    const/4 v3, 0x3

    :goto_0
    return v3
.end method

.method private u()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/net/w;->z:Lorg/android/spdy/SpdySession;

    if-nez v0, :cond_0

    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lcom/taobao/accs/net/w;->c(I)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {v1}, Lcom/taobao/accs/utl/UtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {p0}, Lcom/taobao/accs/net/b;->i()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v3}, Lcom/taobao/accs/AccsClientConfig;->getAppSecret()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    .line 6
    invoke-static {v4}, Lcom/taobao/accs/utl/UtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 7
    invoke-static {v2, v3, v4}, Lcom/taobao/accs/utl/UtilityImpl;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 8
    iget-object v3, p0, Lcom/taobao/accs/net/w;->w:Ljava/lang/String;

    invoke-virtual {p0, v3}, Lcom/taobao/accs/net/b;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v4

    const-string v5, "auth"

    const/4 v6, 0x2

    new-array v7, v6, [Ljava/lang/Object;

    const-string v8, "url"

    aput-object v8, v7, v0

    const/4 v8, 0x1

    aput-object v3, v7, v8

    invoke-static {v4, v5, v7}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10
    iput-object v3, p0, Lcom/taobao/accs/net/w;->x:Ljava/lang/String;

    .line 11
    invoke-virtual {p0}, Lcom/taobao/accs/net/b;->i()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v1, v4, v2}, Lcom/taobao/accs/net/w;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 12
    sget-object v3, Lcom/taobao/accs/AccsErrorCode;->SPDY_AUTH_PARAM_ERROR:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v3}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "device "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " key "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/taobao/accs/net/b;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " sign "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v1

    .line 13
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v2

    const-string v3, "auth param error!"

    new-array v4, v6, [Ljava/lang/Object;

    const-string v5, "code"

    aput-object v5, v4, v0

    aput-object v1, v4, v8

    invoke-static {v2, v3, v4}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    invoke-direct {p0, v1}, Lcom/taobao/accs/net/w;->a(Lcom/alibaba/sdk/android/error/ErrorCode;)V

    return-void

    .line 15
    :cond_1
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 16
    new-instance v1, Lorg/android/spdy/SpdyRequest;

    new-instance v5, Ljava/net/URL;

    invoke-direct {v5, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    const-string v6, "GET"

    sget-object v7, Lorg/android/spdy/RequestPriority;->DEFAULT_PRIORITY:Lorg/android/spdy/RequestPriority;

    const v8, 0x13880

    const v9, 0x9c40

    move-object v4, v1

    invoke-direct/range {v4 .. v9}, Lorg/android/spdy/SpdyRequest;-><init>(Ljava/net/URL;Ljava/lang/String;Lorg/android/spdy/RequestPriority;II)V

    .line 17
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/android/spdy/SpdyRequest;->setDomain(Ljava/lang/String;)V

    .line 18
    new-instance v2, Lorg/android/spdy/SpdyDataProvider;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lorg/android/spdy/SpdyDataProvider;-><init>([B)V

    .line 19
    iget-object v3, p0, Lcom/taobao/accs/net/w;->z:Lorg/android/spdy/SpdySession;

    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->r()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v1, v2, v4, p0}, Lorg/android/spdy/SpdySession;->submitRequest(Lorg/android/spdy/SpdyRequest;Lorg/android/spdy/SpdyDataProvider;Ljava/lang/Object;Lorg/android/spdy/Spdycb;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 20
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v3, "auth exception "

    invoke-static {v2, v3, v1, v0}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 21
    sget-object v0, Lcom/taobao/accs/AccsErrorCode;->SPDY_AUTH_EXCEPTION:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v0}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v0

    invoke-static {v1}, Lcom/taobao/accs/AccsErrorCode;->getExceptionInfo(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/taobao/accs/net/w;->a(Lcom/alibaba/sdk/android/error/ErrorCode;)V

    :goto_0
    return-void
.end method

.method private declared-synchronized v()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lcom/taobao/accs/net/b;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    monitor-exit p0

    return-void

    .line 3
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/taobao/accs/net/w;->B:J

    .line 4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/taobao/accs/net/w;->C:J

    .line 5
    iget-object v0, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/taobao/accs/net/f;->a(Landroid/content/Context;)Lcom/taobao/accs/net/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/taobao/accs/net/f;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private w()V
    .locals 6

    const-string v0, "initClient"

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1
    :try_start_0
    sput-boolean v1, Lorg/android/spdy/SpdyAgent;->enableDebug:Z

    .line 2
    iget-object v1, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    sget-object v3, Lorg/android/spdy/SpdyVersion;->SPDY3:Lorg/android/spdy/SpdyVersion;

    sget-object v4, Lorg/android/spdy/SpdySessionKind;->NONE_SESSION:Lorg/android/spdy/SpdySessionKind;

    invoke-static {v1, v3, v4}, Lorg/android/spdy/SpdyAgent;->getInstance(Landroid/content/Context;Lorg/android/spdy/SpdyVersion;Lorg/android/spdy/SpdySessionKind;)Lorg/android/spdy/SpdyAgent;

    move-result-object v1

    iput-object v1, p0, Lcom/taobao/accs/net/w;->y:Lorg/android/spdy/SpdyAgent;

    .line 3
    invoke-static {}, Lorg/android/spdy/SpdyAgent;->checkLoadSucc()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    invoke-static {}, Lcom/taobao/accs/utl/f;->a()V

    .line 5
    invoke-virtual {p0}, Lcom/taobao/accs/net/b;->k()Z

    move-result v1

    if-nez v1, :cond_0

    .line 6
    iget-object v1, p0, Lcom/taobao/accs/net/w;->y:Lorg/android/spdy/SpdyAgent;

    new-instance v3, Lcom/taobao/accs/net/aa;

    invoke-direct {v3, p0}, Lcom/taobao/accs/net/aa;-><init>(Lcom/taobao/accs/net/w;)V

    invoke-virtual {v1, v3}, Lorg/android/spdy/SpdyAgent;->setAccsSslCallback(Lorg/android/spdy/AccsSSLCallback;)V

    .line 7
    :cond_0
    invoke-static {v2}, Lcom/taobao/accs/utl/OrangeAdapter;->isTnetLogOff(Z)Z

    move-result v1

    if-nez v1, :cond_3

    .line 8
    iget v1, p0, Lcom/taobao/accs/net/b;->c:I

    if-nez v1, :cond_1

    const-string v1, "service"

    goto :goto_0

    :cond_1
    const-string v1, "inapp"

    .line 9
    :goto_0
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v3

    const-string v4, "into--[setTnetLogPath]"

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {v3, v4, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10
    iget-object v3, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {v3, v1}, Lcom/taobao/accs/utl/UtilityImpl;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "config tnet log path:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {v3, v4, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 13
    iget-object v3, p0, Lcom/taobao/accs/net/w;->y:Lorg/android/spdy/SpdyAgent;

    const/high16 v4, 0x500000

    const/4 v5, 0x5

    invoke-virtual {v3, v1, v4, v5}, Lorg/android/spdy/SpdyAgent;->configLogFile(Ljava/lang/String;II)I

    goto :goto_1

    .line 14
    :cond_2
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v1

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v3}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    invoke-static {}, Lcom/taobao/accs/utl/f;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    .line 16
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v3, v0, v1, v2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/taobao/accs/net/w;->v:Z

    .line 7
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "start"

    invoke-static {v0, v3, v2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 8
    iget-object v0, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/taobao/accs/net/w;->a(Landroid/content/Context;)V

    .line 9
    iget-object v0, p0, Lcom/taobao/accs/net/w;->u:Lcom/taobao/accs/net/w$a;

    if-nez v0, :cond_0

    .line 10
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "start thread"

    invoke-static {v0, v3, v2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    new-instance v0, Lcom/taobao/accs/net/w$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NetworkThread_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Lcom/taobao/accs/net/w$a;-><init>(Lcom/taobao/accs/net/w;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/taobao/accs/net/w;->u:Lcom/taobao/accs/net/w$a;

    const/4 v2, 0x2

    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setPriority(I)V

    .line 13
    iget-object v0, p0, Lcom/taobao/accs/net/w;->u:Lcom/taobao/accs/net/w$a;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 14
    :cond_0
    invoke-virtual {p0, v1, v1}, Lcom/taobao/accs/net/w;->a(ZZ)V

    return-void
.end method

.method protected a(Landroid/content/Context;)V
    .locals 2

    .line 94
    iget-boolean v0, p0, Lcom/taobao/accs/net/b;->g:Z

    if-eqz v0, :cond_0

    return-void

    .line 95
    :cond_0
    invoke-super {p0, p1}, Lcom/taobao/accs/net/b;->a(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 96
    invoke-static {p1}, Lanet/channel/GlobalAppRuntimeInfo;->setBackground(Z)V

    const/4 v0, 0x1

    .line 97
    iput-boolean v0, p0, Lcom/taobao/accs/net/b;->g:Z

    .line 98
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v1, "init awcn success!"

    invoke-static {v0, v1, p1}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected a(Lcom/taobao/accs/data/Message;Z)V
    .locals 5

    .line 15
    iget-boolean v0, p0, Lcom/taobao/accs/net/w;->v:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    if-nez p1, :cond_0

    goto/16 :goto_1

    .line 16
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    const/16 v2, 0x3e8

    if-gt v0, v2, :cond_3

    .line 17
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    new-instance v2, Lcom/taobao/accs/net/x;

    invoke-direct {v2, p0, p1, p2}, Lcom/taobao/accs/net/x;-><init>(Lcom/taobao/accs/net/w;Lcom/taobao/accs/data/Message;Z)V

    iget-wide v3, p1, Lcom/taobao/accs/data/Message;->Q:J

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v4, p2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p2

    .line 18
    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->a()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    iget-object v0, p1, Lcom/taobao/accs/data/Message;->O:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 19
    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 20
    iget-object v0, p1, Lcom/taobao/accs/data/Message;->O:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/taobao/accs/net/w;->a(Ljava/lang/String;)Z

    .line 21
    :cond_1
    iget-object v0, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    iget-object v0, v0, Lcom/taobao/accs/data/d;->a:Ljava/util/concurrent/ConcurrentMap;

    iget-object v2, p1, Lcom/taobao/accs/data/Message;->O:Ljava/lang/String;

    invoke-interface {v0, v2, p2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    :cond_2
    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 23
    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object p2

    iget-object v0, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/taobao/accs/utl/UtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setDeviceId(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object p2

    iget v0, p0, Lcom/taobao/accs/net/b;->c:I

    invoke-virtual {p2, v0}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setConnType(I)V

    .line 25
    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object p2

    invoke-virtual {p2}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->onEnterQueueData()V

    goto :goto_0

    .line 26
    :cond_3
    new-instance p2, Ljava/util/concurrent/RejectedExecutionException;

    const-string v0, "accs"

    invoke-direct {p2, v0}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p2

    .line 27
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send error"

    invoke-static {v0, v2, p2, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 28
    iget-object v0, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->SEND_LOCAL_EXCEPTION:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v1

    invoke-static {p2}, Lcom/taobao/accs/AccsErrorCode;->getExceptionInfo(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    goto :goto_0

    .line 29
    :catch_0
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result p2

    .line 30
    iget-object v0, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    sget-object v2, Lcom/taobao/accs/AccsErrorCode;->MESSAGE_QUEUE_FULL:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v2}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "channel "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 31
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "send queue full count:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_0
    return-void

    .line 32
    :cond_5
    :goto_1
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "not running or msg null! "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/taobao/accs/net/w;->v:Z

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected a(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    const/4 p1, 0x4

    .line 83
    :try_start_0
    invoke-direct {p0, p1}, Lcom/taobao/accs/net/w;->c(I)V

    .line 84
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->q()V

    .line 85
    iget-object p1, p0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {p1, p3}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setCloseReason(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 86
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public a(ZZ)V
    .locals 4

    .line 33
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "try ping, force:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v3}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    iget v0, p0, Lcom/taobao/accs/net/b;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 35
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    new-array p2, v2, [Ljava/lang/Object;

    const-string v0, "INAPP, skip"

    invoke-static {p1, v0, p2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 36
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    mul-double v0, v0, v2

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double v0, v0, v2

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    double-to-int p2, v0

    invoke-static {p1, p2}, Lcom/taobao/accs/data/Message;->a(ZI)Lcom/taobao/accs/data/Message;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 5

    .line 87
    iget-object v0, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    monitor-enter v0

    .line 88
    :try_start_0
    iget-object v1, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_1

    .line 89
    iget-object v3, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    invoke-virtual {v3, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/taobao/accs/data/Message;

    if-eqz v3, :cond_0

    .line 90
    invoke-virtual {v3}, Lcom/taobao/accs/data/Message;->a()I

    move-result v4

    if-ne v4, v2, :cond_0

    iget-object v3, v3, Lcom/taobao/accs/data/Message;->O:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 91
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 92
    iget-object p1, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    invoke-virtual {p1, v1}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 93
    :goto_1
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "https://"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v0}, Lcom/taobao/accs/AccsClientConfig;->getChannelHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/taobao/accs/net/w;->J:Z

    .line 6
    iput v0, p0, Lcom/taobao/accs/net/b;->f:I

    return-void
.end method

.method public bioPingRecvCallback(Lorg/android/spdy/SpdySession;I)V
    .locals 2

    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bioPingRecvCallback uniId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public c()Lcom/taobao/accs/ut/a/c;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/taobao/accs/net/w;->I:Lcom/taobao/accs/ut/a/c;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/taobao/accs/ut/a/c;

    invoke-direct {v0}, Lcom/taobao/accs/ut/a/c;-><init>()V

    iput-object v0, p0, Lcom/taobao/accs/net/w;->I:Lcom/taobao/accs/ut/a/c;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/taobao/accs/net/w;->I:Lcom/taobao/accs/ut/a/c;

    iget v1, p0, Lcom/taobao/accs/net/b;->c:I

    iput v1, v0, Lcom/taobao/accs/ut/a/c;->b:I

    .line 5
    iget-object v1, p0, Lcom/taobao/accs/net/w;->t:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v1

    iput v1, v0, Lcom/taobao/accs/ut/a/c;->d:I

    .line 6
    iget-object v0, p0, Lcom/taobao/accs/net/w;->I:Lcom/taobao/accs/ut/a/c;

    iget-object v1, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {v1}, Lcom/taobao/accs/utl/UtilityImpl;->g(Landroid/content/Context;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/taobao/accs/ut/a/c;->i:Z

    .line 7
    iget-object v0, p0, Lcom/taobao/accs/net/w;->I:Lcom/taobao/accs/ut/a/c;

    iget-object v1, p0, Lcom/taobao/accs/net/w;->K:Ljava/lang/String;

    iput-object v1, v0, Lcom/taobao/accs/ut/a/c;->f:Ljava/lang/String;

    .line 8
    iget v1, p0, Lcom/taobao/accs/net/w;->s:I

    iput v1, v0, Lcom/taobao/accs/ut/a/c;->a:I

    .line 9
    iget-object v1, p0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->getRet()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, v0, Lcom/taobao/accs/ut/a/c;->c:Z

    .line 10
    iget-object v0, p0, Lcom/taobao/accs/net/w;->I:Lcom/taobao/accs/ut/a/c;

    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->s()Z

    move-result v1

    iput-boolean v1, v0, Lcom/taobao/accs/ut/a/c;->j:Z

    .line 11
    iget-object v0, p0, Lcom/taobao/accs/net/w;->I:Lcom/taobao/accs/ut/a/c;

    iget-object v1, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/taobao/accs/data/d;->d()I

    move-result v2

    :goto_1
    iput v2, v0, Lcom/taobao/accs/ut/a/c;->e:I

    .line 12
    iget-object v0, p0, Lcom/taobao/accs/net/w;->I:Lcom/taobao/accs/ut/a/c;

    iget-object v1, p0, Lcom/taobao/accs/net/w;->x:Ljava/lang/String;

    iput-object v1, v0, Lcom/taobao/accs/ut/a/c;->g:Ljava/lang/String;

    return-object v0
.end method

.method protected d()Ljava/lang/String;
    .locals 2

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SilenceConn_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 3

    .line 2
    invoke-super {p0}, Lcom/taobao/accs/net/b;->e()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/taobao/accs/net/w;->v:Z

    .line 4
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v1

    new-instance v2, Lcom/taobao/accs/net/y;

    invoke-direct {v2, p0}, Lcom/taobao/accs/net/y;-><init>(Lcom/taobao/accs/net/w;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 5
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "shut down"

    invoke-static {v1, v2, v0}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public getSSLMeta(Lorg/android/spdy/SpdySession;)[B
    .locals 2

    iget-object v0, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/taobao/accs/net/b;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lorg/android/spdy/SpdySession;->getDomain()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/taobao/accs/utl/UtilityImpl;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    return-object p1
.end method

.method protected h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l()Z
    .locals 2

    iget v0, p0, Lcom/taobao/accs/net/w;->s:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n()V
    .locals 0

    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->q()V

    return-void
.end method

.method public o()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/taobao/accs/net/w;->a(ZZ)V

    return-void
.end method

.method public putSSLMeta(Lorg/android/spdy/SpdySession;[B)I
    .locals 2

    iget-object v0, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/taobao/accs/net/b;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lorg/android/spdy/SpdySession;->getDomain()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1, p2}, Lcom/taobao/accs/utl/UtilityImpl;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[B)I

    move-result p1

    return p1
.end method

.method public q()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " force close!"

    invoke-static {v0, v2, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/taobao/accs/net/w;->z:Lorg/android/spdy/SpdySession;

    invoke-virtual {v0}, Lorg/android/spdy/SpdySession;->closeSession()I

    .line 3
    iget-object v0, p0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setCloseType(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x3

    .line 4
    invoke-direct {p0, v0}, Lcom/taobao/accs/net/w;->c(I)V

    return-void
.end method

.method public r()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v0}, Lcom/taobao/accs/AccsClientConfig;->getChannelHost()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "host"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const-string v3, "getChannelHost"

    invoke-static {v1, v3, v2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Lcom/taobao/accs/net/w;->v:Z

    return v0
.end method

.method public spdyCustomControlFrameFailCallback(Lorg/android/spdy/SpdySession;Ljava/lang/Object;II)V
    .locals 0

    invoke-virtual {p0, p3}, Lcom/taobao/accs/net/b;->b(I)V

    return-void
.end method

.method public spdyCustomControlFrameRecvCallback(Lorg/android/spdy/SpdySession;Ljava/lang/Object;IIII[B)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/taobao/accs/net/w;->v()V

    .line 2
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x4

    new-array p2, p2, [Ljava/lang/Object;

    const-string p3, "type"

    const/4 p5, 0x0

    aput-object p3, p2, p5

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 p6, 0x1

    aput-object p3, p2, p6

    const/4 p3, 0x2

    const-string v0, "len"

    aput-object v0, p2, p3

    array-length v1, p7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, p2, v2

    const-string v1, "onFrame"

    invoke-static {p1, v1, p2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    sget-object p2, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {p2}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 5
    array-length p2, p7

    const/16 v1, 0x200

    if-ge p2, v1, :cond_1

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 p2, 0x0

    .line 7
    :goto_0
    array-length v3, p7

    if-ge p2, v3, :cond_0

    .line 8
    aget-byte v3, p7, p2

    and-int/lit16 v3, v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " log time:"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v1

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, p5, [Ljava/lang/Object;

    invoke-static {p2, p1, v1}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    const/16 p1, 0xc8

    if-ne p4, p1, :cond_4

    .line 10
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    .line 11
    iget-object p3, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    invoke-virtual {p3, p7}, Lcom/taobao/accs/data/d;->a([B)V

    .line 12
    iget-object p3, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    invoke-virtual {p3}, Lcom/taobao/accs/data/d;->g()Lcom/taobao/accs/ut/a/d;

    move-result-object p3

    if-eqz p3, :cond_3

    .line 13
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p3, Lcom/taobao/accs/ut/a/d;->c:Ljava/lang/String;

    .line 14
    iget p1, p0, Lcom/taobao/accs/net/b;->c:I

    if-nez p1, :cond_2

    const-string p1, "service"

    goto :goto_1

    :cond_2
    const-string p1, "inapp"

    :goto_1
    iput-object p1, p3, Lcom/taobao/accs/ut/a/d;->g:Ljava/lang/String;

    .line 15
    invoke-virtual {p3}, Lcom/taobao/accs/ut/a/d;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    .line 16
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p2

    new-array p3, p5, [Ljava/lang/Object;

    const-string p4, "onDataReceive "

    invoke-static {p2, p4, p1, p3}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 17
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object p2

    const p3, 0x101d1

    invoke-static {p1}, Lcom/taobao/accs/utl/UtilityImpl;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const-string p4, "SERVICE_DATA_RECEIVE"

    invoke-virtual {p2, p3, p4, p1}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;)V

    .line 18
    :cond_3
    :goto_2
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    new-array p2, p5, [Ljava/lang/Object;

    const-string p3, "try handle msg"

    invoke-static {p1, p3, p2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    invoke-virtual {p0}, Lcom/taobao/accs/net/b;->g()V

    goto :goto_3

    .line 20
    :cond_4
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    new-array p2, p3, [Ljava/lang/Object;

    aput-object v0, p2, p5

    array-length p3, p7

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, p6

    const-string p3, "drop frame"

    invoke-static {p1, p3, p2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    :goto_3
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    new-array p2, p5, [Ljava/lang/Object;

    const-string p3, "spdyCustomControlFrameRecvCallback"

    invoke-static {p1, p3, p2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public spdyDataChunkRecvCB(Lorg/android/spdy/SpdySession;ZJLorg/android/spdy/SpdyByteArray;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string p3, "spdyDataChunkRecvCB"

    invoke-static {p1, p3, p2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public spdyDataRecvCallback(Lorg/android/spdy/SpdySession;ZJILjava/lang/Object;)V
    .locals 0

    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string p3, "spdyDataRecvCallback"

    invoke-static {p1, p3, p2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public spdyDataSendCallback(Lorg/android/spdy/SpdySession;ZJILjava/lang/Object;)V
    .locals 0

    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string p3, "spdyDataSendCallback"

    invoke-static {p1, p3, p2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public spdyOnStreamResponse(Lorg/android/spdy/SpdySession;JLjava/util/Map;Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/android/spdy/SpdySession;",
            "J",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const-string p1, "spdyOnStreamResponse"

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/taobao/accs/net/w;->B:J

    .line 2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/taobao/accs/net/w;->C:J

    const/4 p2, 0x0

    .line 3
    :try_start_0
    invoke-static {p4}, Lcom/taobao/accs/utl/UtilityImpl;->a(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p3

    const-string p5, "SilenceConn_"

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "header"

    aput-object v2, v1, p2

    const/4 v2, 0x1

    aput-object p4, v1, v2

    .line 4
    invoke-static {p5, p1, v1}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p4, ":status"

    .line 5
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    invoke-static {p4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 p5, 0xc8

    const-string v1, "httpStatusCode"

    if-ne p4, p5, :cond_3

    .line 6
    :try_start_1
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p5

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v1, v0, p2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    aput-object p4, v0, v2

    invoke-static {p5, p1, v0}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    invoke-direct {p0, v2}, Lcom/taobao/accs/net/w;->c(I)V

    const-string p4, "x-at"

    .line 8
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    .line 9
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-nez p4, :cond_0

    .line 10
    iput-object p3, p0, Lcom/taobao/accs/net/b;->k:Ljava/lang/String;

    .line 11
    :cond_0
    iget-object p3, p0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    iget-wide p4, p3, Lcom/taobao/accs/ut/monitor/SessionMonitor;->connection_stop_date:J

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    if-lez v2, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    iget-object v0, p0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    iget-wide v0, v0, Lcom/taobao/accs/ut/monitor/SessionMonitor;->connection_stop_date:J

    sub-long v0, p4, v0

    :cond_1
    iput-wide v0, p3, Lcom/taobao/accs/ut/monitor/SessionMonitor;->auth_time:J

    .line 12
    iget p3, p0, Lcom/taobao/accs/net/b;->c:I

    if-nez p3, :cond_2

    const-string p3, "service"

    goto :goto_0

    :cond_2
    const-string p3, "inapp"

    .line 13
    :goto_0
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v0

    const v1, 0x101d1

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "CONNECTED 200 "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/taobao/accs/net/w;->x:Ljava/lang/String;

    iget-object v4, p0, Lcom/taobao/accs/net/w;->K:Ljava/lang/String;

    const/16 p3, 0xde

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string p3, "0"

    filled-new-array {p3}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    const-string p3, "accs"

    const-string p4, "auth"

    const-string p5, ""

    .line 14
    invoke-static {p3, p4, p5}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmSuccess(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 15
    :cond_3
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p3

    new-array p5, v0, [Ljava/lang/Object;

    aput-object v1, p5, p2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p5, v2

    invoke-static {p3, p1, p5}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    sget-object p3, Lcom/taobao/accs/AccsErrorCode;->NETWORKSDK_SPDY_RES_ERROR:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p3}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p3

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "channel code "

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p3

    invoke-virtual {p3}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p3

    invoke-direct {p0, p3}, Lcom/taobao/accs/net/w;->a(Lcom/alibaba/sdk/android/error/ErrorCode;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p3

    .line 17
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p3

    new-array p5, p2, [Ljava/lang/Object;

    invoke-static {p4, p3, p5}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->q()V

    .line 19
    iget-object p3, p0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    const-string p4, "exception"

    invoke-virtual {p3, p4}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setCloseReason(Ljava/lang/String;)V

    .line 20
    :goto_1
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p3

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p3, p1, p2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public spdyPingRecvCallback(Lorg/android/spdy/SpdySession;JLjava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "spdyPingRecvCallback uniId:"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p4, v0}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-gez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    invoke-virtual {p1}, Lcom/taobao/accs/data/d;->b()V

    .line 3
    iget-object p1, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {p1}, Lcom/taobao/accs/net/f;->a(Landroid/content/Context;)Lcom/taobao/accs/net/f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/taobao/accs/net/f;->e()V

    .line 4
    iget-object p1, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {p1}, Lcom/taobao/accs/net/f;->a(Landroid/content/Context;)Lcom/taobao/accs/net/f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/taobao/accs/net/f;->a()V

    .line 5
    iget-object p1, p0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {p1}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->onPingCBReceive()V

    .line 6
    iget-object p1, p0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    iget p1, p1, Lcom/taobao/accs/ut/monitor/SessionMonitor;->ping_rec_times:I

    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    const-string p4, "service_end"

    invoke-static {p1, p4, p2, p3}, Lcom/taobao/accs/utl/UtilityImpl;->a(Landroid/content/Context;Ljava/lang/String;J)V

    :cond_1
    return-void
.end method

.method public spdyRequestRecvCallback(Lorg/android/spdy/SpdySession;JLjava/lang/Object;)V
    .locals 0

    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string p3, "spdyRequestRecvCallback"

    invoke-static {p1, p3, p2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public spdySessionCloseCallback(Lorg/android/spdy/SpdySession;Ljava/lang/Object;Lorg/android/spdy/SuperviseConnectInfo;I)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Object;

    const-string v5, "errorCode"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v7, 0x1

    aput-object v5, v4, v7

    const-string v5, "spdySessionCloseCallback"

    invoke-static {v0, v5, v4}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    .line 2
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lorg/android/spdy/SpdySession;->cleanUp()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v4, v0

    .line 3
    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "session cleanUp has exception: "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v6, [Ljava/lang/Object;

    invoke-static {v0, v4, v5}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    const/4 v0, 0x3

    .line 4
    invoke-direct {v1, v0}, Lcom/taobao/accs/net/w;->c(I)V

    .line 5
    iget-object v0, v1, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {v0}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->onCloseConnect()V

    .line 6
    iget-object v0, v1, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {v0}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->getConCloseDate()J

    move-result-wide v4

    const-wide/16 v8, 0x0

    cmp-long v0, v4, v8

    if-lez v0, :cond_1

    iget-object v0, v1, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {v0}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->getConStopDate()J

    move-result-wide v4

    cmp-long v0, v4, v8

    if-lez v0, :cond_1

    .line 7
    iget-object v0, v1, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {v0}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->getConCloseDate()J

    iget-object v0, v1, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {v0}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->getConStopDate()J

    .line 8
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v1, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {v4}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->getCloseReason()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "tnet error:"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v4, p4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 9
    iget-object v5, v1, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {v5, v0}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setCloseReason(Ljava/lang/String;)V

    if-eqz v2, :cond_2

    .line 10
    iget-object v0, v1, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    iget v2, v2, Lorg/android/spdy/SuperviseConnectInfo;->keepalive_period_second:I

    int-to-long v8, v2

    iput-wide v8, v0, Lcom/taobao/accs/ut/monitor/SessionMonitor;->live_time:J

    .line 11
    :cond_2
    invoke-static {}, Lanet/channel/appmonitor/AppMonitor;->getInstance()Lanet/channel/appmonitor/IAppMonitor;

    move-result-object v0

    iget-object v2, v1, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-interface {v0, v2}, Lanet/channel/appmonitor/IAppMonitor;->commitStat(Lanet/channel/statist/StatObject;)V

    .line 12
    iget-object v0, v1, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    invoke-virtual {v0}, Lcom/taobao/accs/data/d;->e()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/taobao/accs/data/Message;

    .line 13
    invoke-virtual {v2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 14
    invoke-virtual {v2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v5

    const-string v8, "session close"

    invoke-virtual {v5, v8}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setFailReason(Ljava/lang/String;)V

    .line 15
    invoke-static {}, Lanet/channel/appmonitor/AppMonitor;->getInstance()Lanet/channel/appmonitor/IAppMonitor;

    move-result-object v5

    invoke-virtual {v2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v2

    invoke-interface {v5, v2}, Lanet/channel/appmonitor/IAppMonitor;->commitStat(Lanet/channel/statist/StatObject;)V

    goto :goto_1

    .line 16
    :cond_4
    iget v0, v1, Lcom/taobao/accs/net/b;->c:I

    if-nez v0, :cond_5

    const-string v0, "service"

    goto :goto_2

    :cond_5
    const-string v0, "inapp"

    .line 17
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "spdySessionCloseCallback, conKeepTime:"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v1, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    iget-wide v8, v8, Lcom/taobao/accs/ut/monitor/SessionMonitor;->live_time:J

    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, " connectType:"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v8, v6, [Ljava/lang/Object;

    invoke-static {v2, v5, v8}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v9

    const v10, 0x101d1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "DISCONNECT CLOSE "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    iget-object v0, v1, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    iget-wide v4, v0, Lcom/taobao/accs/ut/monitor/SessionMonitor;->live_time:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    const/16 v0, 0xde

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-array v15, v3, [Ljava/lang/String;

    iget-object v0, v1, Lcom/taobao/accs/net/w;->x:Ljava/lang/String;

    aput-object v0, v15, v6

    iget-object v0, v1, Lcom/taobao/accs/net/w;->K:Ljava/lang/String;

    aput-object v0, v15, v7

    invoke-virtual/range {v9 .. v15}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    return-void
.end method

.method public spdySessionConnectCB(Lorg/android/spdy/SpdySession;Lorg/android/spdy/SuperviseConnectInfo;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 1
    iget v2, v1, Lorg/android/spdy/SuperviseConnectInfo;->connectTime:I

    iput v2, v0, Lcom/taobao/accs/net/w;->F:I

    .line 2
    iget v2, v1, Lorg/android/spdy/SuperviseConnectInfo;->handshakeTime:I

    .line 3
    invoke-virtual/range {p0 .. p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x6

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "sessionConnectInterval"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    iget v5, v0, Lcom/taobao/accs/net/w;->F:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v7, 0x1

    aput-object v5, v4, v7

    const-string v5, "sslTime"

    const/4 v8, 0x2

    aput-object v5, v4, v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v9, 0x3

    aput-object v5, v4, v9

    const/4 v5, 0x4

    const-string v10, "reuse"

    aput-object v10, v4, v5

    iget v5, v1, Lorg/android/spdy/SuperviseConnectInfo;->sessionTicketReused:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v10, 0x5

    aput-object v5, v4, v10

    const-string v5, "spdySessionConnectCB"

    invoke-static {v3, v5, v4}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    invoke-direct/range {p0 .. p0}, Lcom/taobao/accs/net/w;->u()V

    .line 5
    iget-object v3, v0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {v3, v7}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setRet(Z)V

    .line 6
    iget-object v3, v0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {v3}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->onConnectStop()V

    .line 7
    iget-object v3, v0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    iget v4, v0, Lcom/taobao/accs/net/w;->F:I

    int-to-long v4, v4

    iput-wide v4, v3, Lcom/taobao/accs/ut/monitor/SessionMonitor;->tcp_time:J

    int-to-long v4, v2

    .line 8
    iput-wide v4, v3, Lcom/taobao/accs/ut/monitor/SessionMonitor;->ssl_time:J

    .line 9
    iget v3, v0, Lcom/taobao/accs/net/b;->c:I

    if-nez v3, :cond_0

    const-string v3, "service"

    goto :goto_0

    :cond_0
    const-string v3, "inapp"

    .line 10
    :goto_0
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v10

    const v11, 0x101d1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "CONNECTED "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v1, Lorg/android/spdy/SuperviseConnectInfo;->sessionTicketReused:I

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    iget v3, v0, Lcom/taobao/accs/net/w;->F:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v14

    const/16 v2, 0xde

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    new-array v2, v9, [Ljava/lang/String;

    iget v1, v1, Lorg/android/spdy/SuperviseConnectInfo;->sessionTicketReused:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v2, v6

    iget-object v1, v0, Lcom/taobao/accs/net/w;->x:Ljava/lang/String;

    aput-object v1, v2, v7

    iget-object v1, v0, Lcom/taobao/accs/net/w;->K:Ljava/lang/String;

    aput-object v1, v2, v8

    move-object/from16 v16, v2

    invoke-virtual/range {v10 .. v16}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    const-string v1, "accs"

    const-string v2, "connect"

    const-string v3, ""

    .line 11
    invoke-static {v1, v2, v3}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmSuccess(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public spdySessionFailedError(Lorg/android/spdy/SpdySession;ILjava/lang/Object;)V
    .locals 12

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lorg/android/spdy/SpdySession;->cleanUp()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "session cleanUp has exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, p3, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/taobao/accs/net/w;->u:Lcom/taobao/accs/net/w$a;

    if-eqz p1, :cond_1

    .line 4
    iget p1, p1, Lcom/taobao/accs/net/w$a;->a:I

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 5
    :goto_1
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "retryTimes"

    aput-object v2, v1, p3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "errorId"

    const/4 v4, 0x2

    aput-object v2, v1, v4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x3

    aput-object v2, v1, v5

    const-string v2, "spdySessionFailedError"

    invoke-static {v0, v2, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    iput-boolean p3, p0, Lcom/taobao/accs/net/w;->J:Z

    .line 7
    iput-boolean v3, p0, Lcom/taobao/accs/net/w;->L:Z

    .line 8
    invoke-direct {p0, v5}, Lcom/taobao/accs/net/w;->c(I)V

    .line 9
    iget-object v0, p0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {v0, p2}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setFailReason(I)V

    .line 10
    iget-object v0, p0, Lcom/taobao/accs/net/w;->H:Lcom/taobao/accs/ut/monitor/SessionMonitor;

    invoke-virtual {v0}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->onConnectStop()V

    .line 11
    iget v0, p0, Lcom/taobao/accs/net/b;->c:I

    if-nez v0, :cond_2

    const-string v0, "service"

    goto :goto_2

    :cond_2
    const-string v0, "inapp"

    .line 12
    :goto_2
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v5

    const v6, 0x101d1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DISCONNECT "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/16 v0, 0xde

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    new-array v11, v4, [Ljava/lang/String;

    iget-object v0, p0, Lcom/taobao/accs/net/w;->x:Ljava/lang/String;

    aput-object v0, v11, p3

    iget-object p3, p0, Lcom/taobao/accs/net/w;->K:Ljava/lang/String;

    aput-object p3, v11, v3

    invoke-virtual/range {v5 .. v11}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 13
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "retrytimes:"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ""

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "accs"

    const-string v1, "connect"

    invoke-static {v0, v1, p1, p3, p2}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public spdyStreamCloseCallback(Lorg/android/spdy/SpdySession;JILjava/lang/Object;Lorg/android/spdy/SuperviseData;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p3, p2, [Ljava/lang/Object;

    const-string p5, "spdyStreamCloseCallback"

    invoke-static {p1, p5, p3}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p4, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x2

    new-array p3, p3, [Ljava/lang/Object;

    const-string p6, "statusCode"

    aput-object p6, p3, p2

    const/4 p2, 0x1

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    aput-object p6, p3, p2

    invoke-static {p1, p5, p3}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    sget-object p1, Lcom/taobao/accs/AccsErrorCode;->NETWORKSDK_SPDY_CLOSE_ERROR:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "channel code "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/taobao/accs/net/w;->a(Lcom/alibaba/sdk/android/error/ErrorCode;)V

    :cond_0
    return-void
.end method
