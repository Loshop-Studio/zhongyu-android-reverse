.class public final Lcom/blankj/utilcode/util/UiMessageUtils;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/blankj/utilcode/util/UiMessageUtils$LazyHolder;,
        Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;,
        Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;
    }
.end annotation


# static fields
.field private static final DEBUG:Z

.field private static final TAG:Ljava/lang/String; = "UiMessageUtils"


# instance fields
.field private final mDefensiveCopyList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final mHandler:Landroid/os/Handler;

.field private final mListenersSpecific:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/List<",
            "Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mListenersUniversal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final mMessage:Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/UtilsBridge;->isAppDebug()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sput-boolean v0, Lcom/blankj/utilcode/util/UiMessageUtils;->DEBUG:Z

    .line 6
    .line 7
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mHandler:Landroid/os/Handler;

    .line 4
    new-instance v0, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;-><init>(Landroid/os/Message;Lcom/blankj/utilcode/util/UiMessageUtils$1;)V

    iput-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mMessage:Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;

    .line 5
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersSpecific:Landroid/util/SparseArray;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mDefensiveCopyList:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/blankj/utilcode/util/UiMessageUtils$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/blankj/utilcode/util/UiMessageUtils;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/blankj/utilcode/util/UiMessageUtils;
    .locals 1

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/UiMessageUtils$LazyHolder;->access$100()Lcom/blankj/utilcode/util/UiMessageUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private logMessageHandling(Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;)V
    .locals 4
    .param p1    # Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersSpecific:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;->getId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/List;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :cond_0
    iget-object v1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    const-string v0, "UiMessageUtils"

    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v2, "Delivering FAILED for message ID "

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;->getId()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, ". No listeners. "

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    invoke-virtual {p1}, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;->getId()I

    .line 69
    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move v2, v1

    .line 85
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-ge v2, v3, :cond_3

    .line 90
    .line 91
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    add-int/lit8 v2, v2, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    .line 107
    .line 108
    monitor-enter v0

    .line 109
    :try_start_0
    iget-object v2, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_4

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    iget-object v2, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    :goto_2
    iget-object v2, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-ge v1, v2, :cond_5

    .line 130
    .line 131
    iget-object v2, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    .line 132
    .line 133
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    check-cast v2, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;

    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    iget-object v2, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 145
    .line 146
    .line 147
    add-int/lit8 v1, v1, 0x1

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :catchall_0
    move-exception p1

    .line 151
    goto :goto_4

    .line 152
    :cond_5
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    invoke-virtual {p1}, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :goto_4
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    throw p1
.end method


# virtual methods
.method public addListener(ILcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;)V
    .locals 3
    .param p2    # Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersSpecific:Landroid/util/SparseArray;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersSpecific:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    iget-object v2, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersSpecific:Landroid/util/SparseArray;

    invoke-virtual {v2, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    invoke-interface {v1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 6
    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public addListener(Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;)V
    .locals 4
    .param p1    # Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 8
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 10
    iget-object v1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 11
    :cond_0
    sget-boolean v1, Lcom/blankj/utilcode/util/UiMessageUtils;->DEBUG:Z

    if-eqz v1, :cond_1

    .line 12
    const-string v1, "UiMessageUtils"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Listener is already added. "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mMessage:Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;->access$200(Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;Landroid/os/Message;)V

    .line 4
    .line 5
    .line 6
    sget-boolean v0, Lcom/blankj/utilcode/util/UiMessageUtils;->DEBUG:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mMessage:Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;

    .line 11
    .line 12
    invoke-direct {p0, v0}, Lcom/blankj/utilcode/util/UiMessageUtils;->logMessageHandling(Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersSpecific:Landroid/util/SparseArray;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersSpecific:Landroid/util/SparseArray;

    .line 19
    .line 20
    iget v2, p1, Landroid/os/Message;->what:I

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/util/List;

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    iget-object v1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersSpecific:Landroid/util/SparseArray;

    .line 37
    .line 38
    iget p1, p1, Landroid/os/Message;->what:I

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_4

    .line 46
    :cond_1
    iget-object p1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mDefensiveCopyList:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {p1, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mDefensiveCopyList:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;

    .line 68
    .line 69
    iget-object v2, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mMessage:Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;

    .line 70
    .line 71
    invoke-interface {v1, v2}, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;->handleMessage(Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    iget-object p1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mDefensiveCopyList:Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 78
    .line 79
    .line 80
    :cond_3
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    iget-object p1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    .line 82
    .line 83
    monitor-enter p1

    .line 84
    :try_start_1
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-lez v0, :cond_5

    .line 91
    .line 92
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mDefensiveCopyList:Ljava/util/List;

    .line 93
    .line 94
    iget-object v1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    .line 95
    .line 96
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mDefensiveCopyList:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_4

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;

    .line 116
    .line 117
    iget-object v2, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mMessage:Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;

    .line 118
    .line 119
    invoke-interface {v1, v2}, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;->handleMessage(Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    goto :goto_3

    .line 125
    :cond_4
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mDefensiveCopyList:Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 128
    .line 129
    .line 130
    :cond_5
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 131
    iget-object p1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mMessage:Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;

    .line 132
    .line 133
    const/4 v0, 0x0

    .line 134
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;->access$200(Lcom/blankj/utilcode/util/UiMessageUtils$UiMessage;Landroid/os/Message;)V

    .line 135
    .line 136
    .line 137
    const/4 p1, 0x1

    .line 138
    return p1

    .line 139
    :goto_3
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    throw v0

    .line 141
    :goto_4
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 142
    throw p1
.end method

.method public removeListener(ILcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;)V
    .locals 4
    .param p2    # Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 6
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersSpecific:Landroid/util/SparseArray;

    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersSpecific:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    .line 8
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 9
    sget-boolean v2, Lcom/blankj/utilcode/util/UiMessageUtils;->DEBUG:Z

    if-eqz v2, :cond_0

    .line 10
    invoke-interface {v1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 11
    const-string v1, "UiMessageUtils"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Trying to remove specific listener that is not registered. ID "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 13
    :cond_0
    invoke-interface {v1, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 14
    :cond_1
    sget-boolean v1, Lcom/blankj/utilcode/util/UiMessageUtils;->DEBUG:Z

    if-eqz v1, :cond_2

    .line 15
    const-string v1, "UiMessageUtils"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Trying to remove specific listener that is not registered. ID "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public removeListener(Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;)V
    .locals 4
    .param p1    # Lcom/blankj/utilcode/util/UiMessageUtils$UiMessageCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-boolean v1, Lcom/blankj/utilcode/util/UiMessageUtils;->DEBUG:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    const-string v1, "UiMessageUtils"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Trying to remove a listener that is not registered. "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 4
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersUniversal:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 5
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public removeListeners(I)V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/blankj/utilcode/util/UiMessageUtils;->DEBUG:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersSpecific:Landroid/util/SparseArray;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/List;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    :cond_0
    const-string v0, "UiMessageUtils"

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v2, "Trying to remove specific listeners that are not registered. ID "

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersSpecific:Landroid/util/SparseArray;

    .line 44
    .line 45
    monitor-enter v0

    .line 46
    :try_start_0
    iget-object v1, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mListenersSpecific:Landroid/util/SparseArray;

    .line 47
    .line 48
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->delete(I)V

    .line 49
    .line 50
    .line 51
    monitor-exit v0

    .line 52
    return-void

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    throw p1
.end method

.method public final send(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public final send(ILjava/lang/Object;)V
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/blankj/utilcode/util/UiMessageUtils;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
