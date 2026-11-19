.class public final Lio/objectbox/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lio/objectbox/BoxStore;

.field public final b:Lb8/c;

.field public final c:Ljava/util/ArrayDeque;

.field public volatile d:Z


# direct methods
.method public constructor <init>(Lio/objectbox/BoxStore;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/greenrobot/essentials/collections/MultimapSet$SetType;->THREAD_SAFE:Lorg/greenrobot/essentials/collections/MultimapSet$SetType;

    .line 5
    .line 6
    new-instance v1, Lb8/c;

    .line 7
    .line 8
    new-instance v2, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v2, v0}, Lb8/c;-><init>(Ljava/util/HashMap;Lorg/greenrobot/essentials/collections/MultimapSet$SetType;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lio/objectbox/f;->b:Lb8/c;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayDeque;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lio/objectbox/f;->c:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    iput-object p1, p0, Lio/objectbox/f;->a:Lio/objectbox/BoxStore;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    :cond_0
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lio/objectbox/f;->c:Ljava/util/ArrayDeque;

    .line 3
    .line 4
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    iget-object v2, p0, Lio/objectbox/f;->c:Ljava/util/ArrayDeque;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, [I

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    iput-boolean v0, p0, Lio/objectbox/f;->d:Z

    .line 16
    .line 17
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    iput-boolean v0, p0, Lio/objectbox/f;->d:Z

    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v2

    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :cond_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    :try_start_3
    array-length v1, v2

    .line 26
    move v3, v0

    .line 27
    :goto_0
    if-ge v3, v1, :cond_0

    .line 28
    .line 29
    aget v4, v2, v3

    .line 30
    .line 31
    iget-object v5, p0, Lio/objectbox/f;->b:Lb8/c;

    .line 32
    .line 33
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v5, v6}, Lb8/c;->a(Ljava/lang/Object;)Ljava/util/Collection;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    if-eqz v5, :cond_5

    .line 42
    .line 43
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-nez v6, :cond_5

    .line 48
    .line 49
    iget-object v6, p0, Lio/objectbox/f;->a:Lio/objectbox/BoxStore;

    .line 50
    .line 51
    iget-object v6, v6, Lio/objectbox/BoxStore;->f:Lb8/b;

    .line 52
    .line 53
    int-to-long v7, v4

    .line 54
    const/16 v9, 0x20

    .line 55
    .line 56
    ushr-long v9, v7, v9

    .line 57
    .line 58
    long-to-int v9, v9

    .line 59
    long-to-int v10, v7

    .line 60
    xor-int/2addr v9, v10

    .line 61
    const v10, 0x7fffffff

    .line 62
    .line 63
    .line 64
    and-int/2addr v9, v10

    .line 65
    iget v10, v6, Lb8/b;->b:I

    .line 66
    .line 67
    rem-int/2addr v9, v10

    .line 68
    iget-object v6, v6, Lb8/b;->a:[Lb8/a;

    .line 69
    .line 70
    aget-object v6, v6, v9

    .line 71
    .line 72
    :goto_1
    if-eqz v6, :cond_3

    .line 73
    .line 74
    iget-wide v9, v6, Lb8/a;->a:J

    .line 75
    .line 76
    cmp-long v9, v9, v7

    .line 77
    .line 78
    if-nez v9, :cond_2

    .line 79
    .line 80
    iget-object v6, v6, Lb8/a;->b:Ljava/lang/Object;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    iget-object v6, v6, Lb8/a;->c:Lb8/a;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    const/4 v6, 0x0

    .line 87
    :goto_2
    check-cast v6, Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 88
    .line 89
    if-eqz v6, :cond_4

    .line 90
    .line 91
    :try_start_4
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_5

    .line 100
    .line 101
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, Lp5/a;

    .line 106
    .line 107
    invoke-interface {v5, v6}, Lp5/a;->a(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :catchall_1
    move-exception v1

    .line 112
    goto :goto_5

    .line 113
    :catch_0
    :try_start_5
    new-instance v1, Ljava/lang/RuntimeException;

    .line 114
    .line 115
    new-instance v2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v3, "Observer failed while processing data for "

    .line 118
    .line 119
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v3, ". Consider using an ErrorObserver"

    .line 126
    .line 127
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 138
    .line 139
    .line 140
    throw v1

    .line 141
    :cond_4
    new-instance v1, Lio/objectbox/exception/DbSchemaException;

    .line 142
    .line 143
    const-string v2, "No entity registered for type ID "

    .line 144
    .line 145
    invoke-static {v4, v2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-direct {v1, v2}, Lio/objectbox/exception/DbSchemaException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 153
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :goto_4
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 158
    :try_start_7
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 159
    :goto_5
    iput-boolean v0, p0, Lio/objectbox/f;->d:Z

    .line 160
    .line 161
    throw v1
.end method
