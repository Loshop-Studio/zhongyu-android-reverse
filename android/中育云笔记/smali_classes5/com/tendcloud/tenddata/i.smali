.class Lcom/tendcloud/tenddata/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/t$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/i$c;,
        Lcom/tendcloud/tenddata/i$b;,
        Lcom/tendcloud/tenddata/i$a;
    }
.end annotation


# static fields
.field private static final d:I = 0x80

.field private static final e:I = 0x3e8


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Ljava/lang/Runnable;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/tendcloud/tenddata/i$b;",
            "Lcom/tendcloud/tenddata/i$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/tendcloud/tenddata/i;->c:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Lcom/tendcloud/tenddata/i$a;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, Lcom/tendcloud/tenddata/i$a;-><init>(Lcom/tendcloud/tenddata/i;Lcom/tendcloud/tenddata/i$1;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/tendcloud/tenddata/i;->b:Ljava/lang/Runnable;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/tendcloud/tenddata/i;->a:Landroid/os/Handler;

    .line 20
    .line 21
    return-void
.end method

.method private static a(Landroid/view/View;)Ljava/lang/String;
    .locals 7

    if-nez p0, :cond_0

    .line 2
    const-string p0, ""

    return-object p0

    .line 3
    :cond_0
    :try_start_0
    instance-of v0, p0, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 4
    check-cast p0, Landroid/widget/TextView;

    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    if-eqz p0, :cond_6

    .line 6
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 7
    :cond_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_6

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    check-cast p0, Landroid/view/ViewGroup;

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    const/16 v5, 0x80

    if-ge v3, v1, :cond_4

    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    if-ge v6, v5, :cond_4

    .line 12
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 13
    invoke-static {v5}, Lcom/tendcloud/tenddata/i;->a(Landroid/view/View;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 14
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_3

    if-eqz v4, :cond_2

    .line 15
    const-string v4, ","

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    :cond_2
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v4, 0x1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 17
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    if-le p0, v5, :cond_5

    .line 18
    invoke-virtual {v0, v2, v5}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    if-eqz v4, :cond_6

    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/i;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/i;->c:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic b(Lcom/tendcloud/tenddata/i;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/i;->a:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public OnEvent(Landroid/view/View;Ljava/lang/String;Z)V
    .locals 5

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    new-instance v2, Ljava/util/Hashtable;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/Hashtable;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/tendcloud/tenddata/i;->a(Landroid/view/View;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const-string v4, "text"

    .line 15
    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    const-string v3, ""

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v2, v4, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    const-string v3, "dynamic_event"

    .line 24
    .line 25
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v2, v3, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    const-string v3, "id"

    .line 31
    .line 32
    invoke-virtual {v2, v3, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    const-string v3, "time"

    .line 36
    .line 37
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v2, v3, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    if-eqz p3, :cond_2

    .line 45
    .line 46
    new-instance p3, Lcom/tendcloud/tenddata/i$b;

    .line 47
    .line 48
    invoke-direct {p3, p1, p2}, Lcom/tendcloud/tenddata/i$b;-><init>(Landroid/view/View;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance p1, Lcom/tendcloud/tenddata/i$c;

    .line 52
    .line 53
    invoke-direct {p1, p2, v2, v0, v1}, Lcom/tendcloud/tenddata/i$c;-><init>(Ljava/lang/String;Ljava/util/Hashtable;J)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p0, Lcom/tendcloud/tenddata/i;->c:Ljava/util/Map;

    .line 57
    .line 58
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 59
    :try_start_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/i;->c:Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget-object v1, p0, Lcom/tendcloud/tenddata/i;->c:Ljava/util/Map;

    .line 66
    .line 67
    invoke-interface {v1, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    iget-object p1, p0, Lcom/tendcloud/tenddata/i;->a:Landroid/os/Handler;

    .line 73
    .line 74
    iget-object p3, p0, Lcom/tendcloud/tenddata/i;->b:Ljava/lang/Runnable;

    .line 75
    .line 76
    const-wide/16 v0, 0x3e8

    .line 77
    .line 78
    invoke-virtual {p1, p3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    :goto_0
    monitor-exit p2

    .line 85
    return-void

    .line 86
    :goto_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    :try_start_2
    throw p1

    .line 88
    :cond_2
    iget-object p1, p0, Lcom/tendcloud/tenddata/i;->a:Landroid/os/Handler;

    .line 89
    .line 90
    const/16 p2, 0xd

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 97
    .line 98
    iget-object p2, p0, Lcom/tendcloud/tenddata/i;->a:Landroid/os/Handler;

    .line 99
    .line 100
    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 101
    .line 102
    .line 103
    :catchall_1
    return-void
.end method
