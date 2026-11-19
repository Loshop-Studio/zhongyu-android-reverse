.class public abstract Lcom/zykj/blackboard/core/execute/EventPlayThread;
.super Lcom/zykj/blackboard/core/execute/PlayThread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/zykj/blackboard/core/execute/PlayThread;"
    }
.end annotation


# instance fields
.field private currentTime:J

.field private iterator:Ljava/util/ListIterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ListIterator<",
            "TT;>;"
        }
    .end annotation
.end field

.field private startPlayTime:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getStartPlayTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/execute/EventPlayThread;->startPlayTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public abstract handle(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public final initStartPlayTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/execute/EventPlayThread;->startPlayTime:J

    .line 2
    .line 3
    return-void
.end method

.method public abstract needHandle(Ljava/lang/Object;J)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;J)Z"
        }
    .end annotation
.end method

.method public run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-object v3, v0, Lcom/zykj/blackboard/core/execute/EventPlayThread;->iterator:Ljava/util/ListIterator;

    .line 8
    .line 9
    if-eqz v3, :cond_7

    .line 10
    .line 11
    const-wide/16 v6, 0x0

    .line 12
    .line 13
    const-wide/16 v8, 0x0

    .line 14
    .line 15
    :goto_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v10

    .line 19
    if-eqz v10, :cond_7

    .line 20
    .line 21
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getPlayStatus()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 22
    .line 23
    .line 24
    move-result-object v10

    .line 25
    sget-object v11, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_PAUSE:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 26
    .line 27
    const-wide/16 v12, 0x10

    .line 28
    .line 29
    if-ne v10, v11, :cond_0

    .line 30
    .line 31
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getPlayStatus()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    sget-object v11, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_END:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 40
    .line 41
    if-ne v10, v11, :cond_1

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->notifyFinish(Z)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    invoke-interface {v3}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    iget-wide v14, v0, Lcom/zykj/blackboard/core/execute/EventPlayThread;->currentTime:J

    .line 53
    .line 54
    invoke-virtual {v0, v10, v14, v15}, Lcom/zykj/blackboard/core/execute/EventPlayThread;->needHandle(Ljava/lang/Object;J)Z

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-eqz v11, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0, v10}, Lcom/zykj/blackboard/core/execute/EventPlayThread;->handle(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    if-eqz v10, :cond_3

    .line 69
    .line 70
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_3
    iget-wide v10, v0, Lcom/zykj/blackboard/core/execute/EventPlayThread;->currentTime:J

    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getPlaySpeed()Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 76
    .line 77
    .line 78
    move-result-object v14

    .line 79
    const/16 v15, 0x10

    .line 80
    .line 81
    if-eqz v14, :cond_4

    .line 82
    .line 83
    invoke-virtual {v14}, Lcom/zykj/blackboard/bean/PlaySpeed;->getPlayIncrement()I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    :goto_2
    const-wide/16 v16, 0x0

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    move v14, v15

    .line 91
    goto :goto_2

    .line 92
    :goto_3
    int-to-long v4, v14

    .line 93
    add-long/2addr v10, v4

    .line 94
    iput-wide v10, v0, Lcom/zykj/blackboard/core/execute/EventPlayThread;->currentTime:J

    .line 95
    .line 96
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 97
    .line 98
    .line 99
    move-result-wide v4

    .line 100
    cmp-long v10, v6, v16

    .line 101
    .line 102
    if-eqz v10, :cond_6

    .line 103
    .line 104
    sub-long v6, v4, v6

    .line 105
    .line 106
    int-to-long v10, v15

    .line 107
    sub-long/2addr v10, v6

    .line 108
    add-long/2addr v10, v8

    .line 109
    cmp-long v6, v10, v16

    .line 110
    .line 111
    if-lez v6, :cond_5

    .line 112
    .line 113
    move-wide v8, v10

    .line 114
    goto :goto_4

    .line 115
    :cond_5
    move-wide/from16 v8, v16

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_6
    move-wide v8, v12

    .line 119
    :goto_4
    new-instance v6, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    const-string v7, "\u547d\u4ee4\u6267\u884c\uff0csleepTime:"

    .line 125
    .line 126
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 137
    .line 138
    invoke-virtual {v7, v6}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V

    .line 142
    .line 143
    .line 144
    move-wide v6, v4

    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :cond_7
    const/4 v3, 0x1

    .line 148
    invoke-virtual {v0, v3}, Lcom/zykj/blackboard/core/execute/PlayThread;->notifyFinish(Z)V

    .line 149
    .line 150
    .line 151
    new-instance v3, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    const-string v4, "\u547d\u4ee4\u6267\u884c\uff0c \u603b\u65f6\u95f4\u82b1\u8d39\uff1a"

    .line 157
    .line 158
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 162
    .line 163
    .line 164
    move-result-wide v4

    .line 165
    sub-long/2addr v4, v1

    .line 166
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 174
    .line 175
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public final seekTo(J)V
    .locals 3

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/execute/EventPlayThread;->currentTime:J

    .line 2
    .line 3
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/EventPlayThread;->iterator:Ljava/util/ListIterator;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/EventPlayThread;->iterator:Ljava/util/ListIterator;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/EventPlayThread;->iterator:Ljava/util/ListIterator;

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    :goto_1
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p0, v1, p1, p2}, Lcom/zykj/blackboard/core/execute/EventPlayThread;->needHandle(Ljava/lang/Object;J)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/execute/EventPlayThread;->handle(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :cond_3
    return-void
.end method

.method public final setListIterator(Ljava/util/ListIterator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ListIterator<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "listIterator"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/EventPlayThread;->iterator:Ljava/util/ListIterator;

    .line 7
    .line 8
    return-void
.end method
