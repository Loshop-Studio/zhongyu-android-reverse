.class public final Lc5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc5/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lc5/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc5/c;->a:Lc5/c;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)Lcom/zykj/board/EzyHeader$Author;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->E()Lcom/zykj/board/EzyHeader$Author$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$Author$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Author$b;

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->a()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$Author$b;->q(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Author$b;

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->e()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$Author$b;->v(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Author$b;

    .line 30
    .line 31
    .line 32
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->g()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$Author$b;->y(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Author$b;

    .line 39
    .line 40
    .line 41
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->f()Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    invoke-virtual {v0, v1, v2}, Lcom/zykj/board/EzyHeader$Author$b;->w(J)Lcom/zykj/board/EzyHeader$Author$b;

    .line 52
    .line 53
    .line 54
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->c()Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_5

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    invoke-virtual {v0, v1, v2}, Lcom/zykj/board/EzyHeader$Author$b;->s(J)Lcom/zykj/board/EzyHeader$Author$b;

    .line 65
    .line 66
    .line 67
    :cond_5
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$Author$b;->d()Lcom/zykj/board/EzyHeader$Author;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v0, "newBuilder().apply {\n   \u2026      }\n        }.build()"

    .line 72
    .line 73
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-object p1
.end method

.method public final b(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->z()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->r(I)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->c()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->s(F)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->d()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->t(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->d()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "newBuilder().apply {\n   \u2026ineType\n        }.build()"

    .line 31
    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public final c(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->D()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->h()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->s(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->g()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->z(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->a()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->r(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->f()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->x(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->e()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->w(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->c()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->t(I)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->d()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->u(I)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->d()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v0, "newBuilder().apply {\n   \u2026thTimes\n        }.build()"

    .line 59
    .line 60
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object p1
.end method

.method public final d(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;)V
    .locals 6

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource;->u()Lcom/zykj/board/EzyCommand$CommandSource$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 34
    .line 35
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->B()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->c()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    invoke-virtual {v3, v4, v5}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->t(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->d()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    invoke-virtual {v3, v4, v5}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->u(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->g()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->w(Z)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->a()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->q(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->b()[B

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v2}, Lcom/google/protobuf/ByteString;->copyFrom([B)Lcom/google/protobuf/ByteString;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v3, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->s(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v3}, Lcom/zykj/board/EzyCommand$CommandSource$b;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;)Lcom/zykj/board/EzyCommand$CommandSource$b;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$b;->o()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-lez v1, :cond_2

    .line 87
    .line 88
    sget-object v1, Lu5/k;->a:Lu5/k;

    .line 89
    .line 90
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->b()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$b;->e()Lcom/zykj/board/EzyCommand$CommandSource;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v3, "audioRecord.build()"

    .line 99
    .line 100
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, p1, v2, v0}, Lu5/k;->d(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-eqz p1, :cond_1

    .line 108
    .line 109
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 110
    .line 111
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->c:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 112
    .line 113
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->a(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eqz p1, :cond_1

    .line 118
    .line 119
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->g(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_1
    return-void

    .line 123
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v0, "[SourceSave]: saveAudio-> ["

    .line 129
    .line 130
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->b()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string p2, "]commandInfoCount==0"

    .line 141
    .line 142
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public final e(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;)V
    .locals 6

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource;->u()Lcom/zykj/board/EzyCommand$CommandSource$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 34
    .line 35
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->B()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->c()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    invoke-virtual {v3, v4, v5}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->t(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->d()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    invoke-virtual {v3, v4, v5}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->u(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->g()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->w(Z)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->a()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->q(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v2}, Lcom/google/protobuf/ByteString;->copyFrom([B)Lcom/google/protobuf/ByteString;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v3, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->s(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v3}, Lcom/zykj/board/EzyCommand$CommandSource$b;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;)Lcom/zykj/board/EzyCommand$CommandSource$b;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$b;->o()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-lez v1, :cond_2

    .line 87
    .line 88
    sget-object v1, Lu5/k;->a:Lu5/k;

    .line 89
    .line 90
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->b()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$b;->e()Lcom/zykj/board/EzyCommand$CommandSource;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v3, "commandRecord.build()"

    .line 99
    .line 100
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, p1, v2, v0}, Lu5/k;->d(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-eqz p1, :cond_1

    .line 108
    .line 109
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 110
    .line 111
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->c:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 112
    .line 113
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->a(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eqz p1, :cond_1

    .line 118
    .line 119
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->g(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_1
    return-void

    .line 123
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v0, "[SourceSave]: saveCommand-> ["

    .line 129
    .line 130
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->b()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string p2, "]commandInfoCount==0"

    .line 141
    .line 142
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public final f(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)V
    .locals 5

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$FileSource;->u()Lcom/zykj/board/EzySource$FileSource$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 34
    .line 35
    invoke-static {}, Lcom/zykj/board/EzySource$FileSource$FileInfo;->w()Lcom/zykj/board/EzySource$FileSource$FileInfo$b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->a()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$FileSource$FileInfo$b;->s(Ljava/lang/String;)Lcom/zykj/board/EzySource$FileSource$FileInfo$b;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->e()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v3, v2}, Lcom/zykj/board/EzySource$FileSource$FileInfo$b;->v(Ljava/lang/String;)Lcom/zykj/board/EzySource$FileSource$FileInfo$b;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v3}, Lcom/zykj/board/EzySource$FileSource$b;->b(Lcom/zykj/board/EzySource$FileSource$FileInfo$b;)Lcom/zykj/board/EzySource$FileSource$b;

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$FileSource$b;->p()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-lez v1, :cond_2

    .line 62
    .line 63
    sget-object v1, Lu5/k;->a:Lu5/k;

    .line 64
    .line 65
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->b()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$FileSource$b;->e()Lcom/zykj/board/EzySource$FileSource;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v3, "fileRecord.build()"

    .line 74
    .line 75
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, p1, v2, v0}, Lu5/k;->d(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-eqz p1, :cond_1

    .line 83
    .line 84
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 85
    .line 86
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->c:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 87
    .line 88
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->a(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-eqz p1, :cond_1

    .line 93
    .line 94
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->g(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    return-void

    .line 98
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v0, "[SourceSave]: saveFile-> ["

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->b()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string p2, "]fileInfoCount==0"

    .line 116
    .line 117
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public final g(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)V
    .locals 7

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$GeometrySource;->t()Lcom/zykj/board/EzySource$GeometrySource$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 34
    .line 35
    invoke-static {}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->A()Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->b()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;->x(I)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->z()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->a()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->q(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->h()F

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->y(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->g()F

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->w(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->f()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->v(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4}, Lcom/zykj/board/EzyPaint$Paint$b;->d()Lcom/zykj/board/EzyPaint$Paint;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;->y(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->d()Lio/objectbox/relation/ToMany;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_0

    .line 98
    .line 99
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    check-cast v4, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    .line 104
    .line 105
    invoke-static {}, Lcom/zykj/board/EzyPointF$PointF;->n()Lcom/zykj/board/EzyPointF$PointF$b;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->c()F

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyPointF$PointF$b;->t(F)Lcom/zykj/board/EzyPointF$PointF$b;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->d()F

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    invoke-virtual {v5, v4}, Lcom/zykj/board/EzyPointF$PointF$b;->u(F)Lcom/zykj/board/EzyPointF$PointF$b;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5}, Lcom/zykj/board/EzyPointF$PointF$b;->d()Lcom/zykj/board/EzyPointF$PointF;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;->b(Lcom/zykj/board/EzyPointF$PointF;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_0
    invoke-virtual {v0, v3}, Lcom/zykj/board/EzySource$GeometrySource$b;->b(Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;)Lcom/zykj/board/EzySource$GeometrySource$b;

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$b;->p()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-lez v1, :cond_3

    .line 140
    .line 141
    sget-object v1, Lu5/k;->a:Lu5/k;

    .line 142
    .line 143
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->a()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$b;->e()Lcom/zykj/board/EzySource$GeometrySource;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    const-string v3, "geometryRecord.build()"

    .line 152
    .line 153
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, p1, v2, v0}, Lu5/k;->d(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-eqz p1, :cond_2

    .line 161
    .line 162
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 163
    .line 164
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->c:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 165
    .line 166
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->a(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    if-eqz p1, :cond_2

    .line 171
    .line 172
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->g(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :cond_2
    return-void

    .line 176
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    const-string v0, "[SourceSave]: saveGeometry-> ["

    .line 182
    .line 183
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->a()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string p2, "]geometryInfoCount==0"

    .line 194
    .line 195
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    return-void
.end method

.method public final h(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "pageEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "\u9875\u9762SourceSave\uff1a\u5f00\u59cb\u4fdd\u5b58Header.bin\u6587\u4ef6"

    .line 12
    .line 13
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->e()Lio/objectbox/relation/ToOne;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->g()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 29
    .line 30
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->V()Lcom/zykj/board/EzyHeader$Header$b;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->o()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->X(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->p()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->Y(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->g()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->Q(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->c()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    invoke-virtual {v1, v2, v3}, Lcom/zykj/board/EzyHeader$Header$b;->L(J)Lcom/zykj/board/EzyHeader$Header$b;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->n()J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    invoke-virtual {v1, v2, v3}, Lcom/zykj/board/EzyHeader$Header$b;->W(J)Lcom/zykj/board/EzyHeader$Header$b;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->f()J

    .line 70
    .line 71
    .line 72
    move-result-wide v2

    .line 73
    invoke-virtual {v1, v2, v3}, Lcom/zykj/board/EzyHeader$Header$b;->O(J)Lcom/zykj/board/EzyHeader$Header$b;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->d()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->M(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->i()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->R(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->a()Lio/objectbox/relation/ToOne;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->g()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 99
    .line 100
    if-eqz v2, :cond_0

    .line 101
    .line 102
    sget-object v3, Lc5/c;->a:Lc5/c;

    .line 103
    .line 104
    invoke-virtual {v3, v2}, Lc5/c;->a(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)Lcom/zykj/board/EzyHeader$Author;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->K(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 109
    .line 110
    .line 111
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->k()Lio/objectbox/relation/ToOne;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->g()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 120
    .line 121
    if-eqz v2, :cond_1

    .line 122
    .line 123
    sget-object v3, Lc5/c;->a:Lc5/c;

    .line 124
    .line 125
    invoke-virtual {v3, v2}, Lc5/c;->c(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->T(Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 130
    .line 131
    .line 132
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->e()Lio/objectbox/relation/ToOne;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->g()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 141
    .line 142
    if-eqz v2, :cond_2

    .line 143
    .line 144
    sget-object v3, Lc5/c;->a:Lc5/c;

    .line 145
    .line 146
    invoke-virtual {v3, v2}, Lc5/c;->b(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->N(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 151
    .line 152
    .line 153
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->j()Lio/objectbox/relation/ToOne;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->g()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 162
    .line 163
    if-eqz v2, :cond_3

    .line 164
    .line 165
    sget-object v3, Lc5/c;->a:Lc5/c;

    .line 166
    .line 167
    invoke-virtual {v3, v2}, Lc5/c;->b(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->S(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 172
    .line 173
    .line 174
    :cond_3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->m()Lio/objectbox/relation/ToMany;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_4

    .line 187
    .line 188
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 193
    .line 194
    sget-object v3, Lc5/c;->a:Lc5/c;

    .line 195
    .line 196
    const-string v4, "it"

    .line 197
    .line 198
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v2}, Lc5/c;->a(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)Lcom/zykj/board/EzyHeader$Author;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->b(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 206
    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_4
    sget-object v0, Lu5/k;->a:Lu5/k;

    .line 210
    .line 211
    new-instance v2, Ljava/io/File;

    .line 212
    .line 213
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-direct {v2, p2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    const-string v3, "File(path, pageEntity.dirName).absolutePath"

    .line 225
    .line 226
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header$b;->e()Lcom/zykj/board/EzyHeader$Header;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    const-string v3, "header.build()"

    .line 234
    .line 235
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    const-string v3, "header.bin"

    .line 239
    .line 240
    invoke-virtual {v0, v2, v3, v1}, Lu5/k;->d(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 241
    .line 242
    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 246
    .line 247
    .line 248
    const-string v1, "\u9875\u9762SourceSave\uff1a\u4fdd\u5b58Header.bin\u6587\u4ef6\u7ed3\u675f\uff0c\u8def\u5f84\u662f"

    .line 249
    .line 250
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    new-instance v1, Ljava/io/File;

    .line 254
    .line 255
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-direct {v1, p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    return-void
.end method

.method public final i(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$MatrixSource;->t()Lcom/zykj/board/EzySource$MatrixSource$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 34
    .line 35
    invoke-static {}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->q()Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo$b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->b()Lio/objectbox/relation/ToMany;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 58
    .line 59
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->G()Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->a()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    invoke-virtual {v5, v6, v7}, Lcom/zykj/board/EzyMatrix$Matrix$b;->q(J)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->g()F

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->w(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->i()F

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->y(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->k()F

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->A(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->j()F

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->z(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->h()F

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->x(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->l()F

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->B(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->c()F

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->s(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->d()F

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->t(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->e()F

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    invoke-virtual {v5, v4}, Lcom/zykj/board/EzyMatrix$Matrix$b;->u(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5}, Lcom/zykj/board/EzyMatrix$Matrix$b;->d()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo$b;->d(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo$b;

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_0
    invoke-virtual {v3}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo$b;->f()Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzySource$MatrixSource$b;->b(Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;)Lcom/zykj/board/EzySource$MatrixSource$b;

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$MatrixSource$b;->p()I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-lez v1, :cond_3

    .line 154
    .line 155
    sget-object v1, Lu5/k;->a:Lu5/k;

    .line 156
    .line 157
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->a()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$MatrixSource$b;->e()Lcom/zykj/board/EzySource$MatrixSource;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    const-string v3, "matrixRecord.build()"

    .line 166
    .line 167
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, p1, v2, v0}, Lu5/k;->d(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    if-eqz p1, :cond_2

    .line 175
    .line 176
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 177
    .line 178
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->c:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 179
    .line 180
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->a(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-eqz p1, :cond_2

    .line 185
    .line 186
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->g(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    :cond_2
    return-void

    .line 190
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const-string v0, "[SourceSave]: saveMatrix-> ["

    .line 196
    .line 197
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->a()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string p2, "]matrixInfoCount==0"

    .line 208
    .line 209
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    return-void
.end method

.method public final j(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/util/List;)V
    .locals 9

    .line 1
    const-string v0, "boardEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pagePathList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->a()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {}, Lcom/zykj/board/EzyPageRouter$PageRouter;->t()Lcom/zykj/board/EzyPageRouter$PageRouter$b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->c()Lio/objectbox/relation/ToMany;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v2, 0x0

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    add-int/lit8 v4, v2, 0x1

    .line 42
    .line 43
    if-gez v2, :cond_1

    .line 44
    .line 45
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 46
    .line 47
    .line 48
    :cond_1
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 49
    .line 50
    new-instance v5, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v6, "\u9875\u9762SourceSave: saveRecord-> \u7b2c"

    .line 56
    .line 57
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v7, "\u6761 => "

    .line 64
    .line 65
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v8, "\u5f00\u59cb\u6267\u884c\u4fdd\u5b58\u64cd\u4f5c"

    .line 76
    .line 77
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-static {v5}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-interface {p2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_2

    .line 100
    .line 101
    invoke-static {}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;->t()Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v5, v2}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;->s(I)Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    invoke-virtual {v5, v8}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v5}, Lcom/zykj/board/EzyPageRouter$PageRouter$b;->b(Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;)Lcom/zykj/board/EzyPageRouter$PageRouter$b;

    .line 116
    .line 117
    .line 118
    sget-object v5, Lc5/c;->a:Lc5/c;

    .line 119
    .line 120
    const-string v8, "pageEntity"

    .line 121
    .line 122
    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5, v3, v0}, Lc5/c;->h(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5, v3, v0}, Lc5/c;->k(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    new-instance v5, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v2, " \u7ed3\u675f"

    .line 153
    .line 154
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_2
    move v2, v4

    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_3
    sget-object p1, Lu5/k;->a:Lu5/k;

    .line 172
    .line 173
    invoke-virtual {v1}, Lcom/zykj/board/EzyPageRouter$PageRouter$b;->e()Lcom/zykj/board/EzyPageRouter$PageRouter;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    const-string v1, "pageRecord.build()"

    .line 178
    .line 179
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const-string v1, "page_router.bin"

    .line 183
    .line 184
    invoke-virtual {p1, v0, v1, p2}, Lu5/k;->d(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 185
    .line 186
    .line 187
    const-string p1, "\u9875\u9762SourceSave: saveRecord-> \u7ed3\u675f,page_route.bin\u6587\u4ef6\u4fdd\u5b58\u7ed3\u675f"

    .line 188
    .line 189
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    return-void
.end method

.method public final k(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V
    .locals 8

    .line 1
    const-string v0, "pageEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->U()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/io/File;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-direct {v1, p2, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->g()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const-string v3, ", validate:"

    .line 51
    .line 52
    const-string v4, "it"

    .line 53
    .line 54
    const-string v5, "pagePath"

    .line 55
    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 63
    .line 64
    new-instance v6, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v7, "\u9875\u9762SourceSave: \u5f00\u59cb\u4fdd\u5b58commandList\u6587\u4ef6:"

    .line 70
    .line 71
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->b()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-nez v6, :cond_0

    .line 101
    .line 102
    sget-object v6, Lc5/c;->a:Lc5/c;

    .line 103
    .line 104
    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6, p2, v2}, Lc5/c;->e(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;)V

    .line 111
    .line 112
    .line 113
    new-instance v4, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    const-string v5, "\u9875\u9762SourceSave: saveRouter-> command:"

    .line 119
    .line 120
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->b()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->d()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->u()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->b()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->d()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v3, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v3}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-eqz v2, :cond_3

    .line 186
    .line 187
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 192
    .line 193
    new-instance v6, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    const-string v7, "\u9875\u9762SourceSave: \u5f00\u59cb\u4fdd\u5b58file\u6587\u4ef6-> file:"

    .line 199
    .line 200
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->b()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 226
    .line 227
    .line 228
    move-result v6

    .line 229
    if-nez v6, :cond_2

    .line 230
    .line 231
    sget-object v6, Lc5/c;->a:Lc5/c;

    .line 232
    .line 233
    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v6, p2, v2}, Lc5/c;->f(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)V

    .line 240
    .line 241
    .line 242
    new-instance v6, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 245
    .line 246
    .line 247
    const-string v7, "\u9875\u9762SourceSave: saveRouter-> file:"

    .line 248
    .line 249
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->b()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->d()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->u()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->b()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    invoke-virtual {v6, v7}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->d()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-virtual {v6, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v6}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 299
    .line 300
    .line 301
    goto :goto_1

    .line 302
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->i()Lio/objectbox/relation/ToMany;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-eqz v2, :cond_5

    .line 315
    .line 316
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 321
    .line 322
    new-instance v6, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    const-string v7, "\u9875\u9762SourceSave: \u5f00\u59cb\u4fdd\u5b58touch\u6587\u4ef6-> touch:"

    .line 328
    .line 329
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->a()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v7

    .line 336
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v6

    .line 343
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v6

    .line 347
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 355
    .line 356
    .line 357
    move-result v6

    .line 358
    if-nez v6, :cond_4

    .line 359
    .line 360
    sget-object v6, Lc5/c;->a:Lc5/c;

    .line 361
    .line 362
    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v6, p2, v2}, Lc5/c;->m(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;)V

    .line 369
    .line 370
    .line 371
    new-instance v6, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 374
    .line 375
    .line 376
    const-string v7, "\u9875\u9762SourceSave: saveRouter-> touch:"

    .line 377
    .line 378
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->a()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->d()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v7

    .line 395
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->u()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 410
    .line 411
    .line 412
    move-result-object v6

    .line 413
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->a()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v7

    .line 417
    invoke-virtual {v6, v7}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->d()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-virtual {v6, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v6}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 428
    .line 429
    .line 430
    goto :goto_2

    .line 431
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->f()Lio/objectbox/relation/ToMany;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    if-eqz v2, :cond_7

    .line 444
    .line 445
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 450
    .line 451
    new-instance v6, Ljava/lang/StringBuilder;

    .line 452
    .line 453
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 454
    .line 455
    .line 456
    const-string v7, "\u9875\u9762SourceSave: \u5f00\u59cb\u4fdd\u5b58\u77e9\u9635\u6587\u4ef6-> matrix:"

    .line 457
    .line 458
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->a()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v7

    .line 465
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v6

    .line 476
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 484
    .line 485
    .line 486
    move-result v6

    .line 487
    if-nez v6, :cond_6

    .line 488
    .line 489
    sget-object v6, Lc5/c;->a:Lc5/c;

    .line 490
    .line 491
    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v6, p2, v2}, Lc5/c;->i(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;)V

    .line 498
    .line 499
    .line 500
    new-instance v6, Ljava/lang/StringBuilder;

    .line 501
    .line 502
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 503
    .line 504
    .line 505
    const-string v7, "\u9875\u9762SourceSave: saveRouter-> matrix:"

    .line 506
    .line 507
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->a()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v7

    .line 514
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->d()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v7

    .line 524
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v6

    .line 531
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v6

    .line 535
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->u()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 539
    .line 540
    .line 541
    move-result-object v6

    .line 542
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->a()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v7

    .line 546
    invoke-virtual {v6, v7}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->d()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    invoke-virtual {v6, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0, v6}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 557
    .line 558
    .line 559
    goto :goto_3

    .line 560
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    :cond_8
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 569
    .line 570
    .line 571
    move-result v2

    .line 572
    if-eqz v2, :cond_9

    .line 573
    .line 574
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 579
    .line 580
    new-instance v6, Ljava/lang/StringBuilder;

    .line 581
    .line 582
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 583
    .line 584
    .line 585
    const-string v7, "\u9875\u9762SourceSave: \u5f00\u59cb\u4fdd\u5b58\u97f3\u9891\u6587\u4ef6-> audio:"

    .line 586
    .line 587
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->b()Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v7

    .line 594
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v6

    .line 601
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v6

    .line 605
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 609
    .line 610
    .line 611
    move-result-object v6

    .line 612
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 613
    .line 614
    .line 615
    move-result v6

    .line 616
    if-nez v6, :cond_8

    .line 617
    .line 618
    sget-object v6, Lc5/c;->a:Lc5/c;

    .line 619
    .line 620
    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v6, p2, v2}, Lc5/c;->d(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;)V

    .line 627
    .line 628
    .line 629
    new-instance v6, Ljava/lang/StringBuilder;

    .line 630
    .line 631
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 632
    .line 633
    .line 634
    const-string v7, "\u9875\u9762SourceSave: saveRouter-> audio:"

    .line 635
    .line 636
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->b()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v7

    .line 643
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->d()Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v7

    .line 653
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v6

    .line 660
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v6

    .line 664
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->u()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 668
    .line 669
    .line 670
    move-result-object v6

    .line 671
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->b()Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v7

    .line 675
    invoke-virtual {v6, v7}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->d()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    invoke-virtual {v6, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v0, v6}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 686
    .line 687
    .line 688
    goto :goto_4

    .line 689
    :cond_9
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->h()Lio/objectbox/relation/ToMany;

    .line 690
    .line 691
    .line 692
    move-result-object v1

    .line 693
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    :cond_a
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 698
    .line 699
    .line 700
    move-result v2

    .line 701
    if-eqz v2, :cond_b

    .line 702
    .line 703
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 708
    .line 709
    new-instance v6, Ljava/lang/StringBuilder;

    .line 710
    .line 711
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 712
    .line 713
    .line 714
    const-string v7, "\u9875\u9762SourceSave: \u5f00\u59cb\u4fdd\u5b58text\u6587\u4ef6,saveRouter-> text:"

    .line 715
    .line 716
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->a()Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v7

    .line 723
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v6

    .line 730
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v6

    .line 734
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 738
    .line 739
    .line 740
    move-result-object v6

    .line 741
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 742
    .line 743
    .line 744
    move-result v6

    .line 745
    if-nez v6, :cond_a

    .line 746
    .line 747
    sget-object v6, Lc5/c;->a:Lc5/c;

    .line 748
    .line 749
    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v6, p2, v2}, Lc5/c;->l(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;)V

    .line 756
    .line 757
    .line 758
    new-instance v6, Ljava/lang/StringBuilder;

    .line 759
    .line 760
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 761
    .line 762
    .line 763
    const-string v7, "\u9875\u9762SourceSave: saveRouter-> text:"

    .line 764
    .line 765
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->a()Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v7

    .line 772
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->d()Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v7

    .line 782
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v6

    .line 789
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v6

    .line 793
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 794
    .line 795
    .line 796
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->u()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 797
    .line 798
    .line 799
    move-result-object v6

    .line 800
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->a()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v7

    .line 804
    invoke-virtual {v6, v7}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 805
    .line 806
    .line 807
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->d()Ljava/lang/String;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    invoke-virtual {v6, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v0, v6}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 815
    .line 816
    .line 817
    goto :goto_5

    .line 818
    :cond_b
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->d()Lio/objectbox/relation/ToMany;

    .line 819
    .line 820
    .line 821
    move-result-object p1

    .line 822
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 823
    .line 824
    .line 825
    move-result-object p1

    .line 826
    :cond_c
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 827
    .line 828
    .line 829
    move-result v1

    .line 830
    if-eqz v1, :cond_d

    .line 831
    .line 832
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 837
    .line 838
    new-instance v2, Ljava/lang/StringBuilder;

    .line 839
    .line 840
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 841
    .line 842
    .line 843
    const-string v6, "\u9875\u9762SourceSave: \u5f00\u59cb\u4fdd\u5b58geometryList\u6587\u4ef6\uff0csaveRouter-> geometry:"

    .line 844
    .line 845
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 846
    .line 847
    .line 848
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->a()Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v6

    .line 852
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 853
    .line 854
    .line 855
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v2

    .line 859
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 867
    .line 868
    .line 869
    move-result-object v2

    .line 870
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 871
    .line 872
    .line 873
    move-result v2

    .line 874
    if-nez v2, :cond_c

    .line 875
    .line 876
    sget-object v2, Lc5/c;->a:Lc5/c;

    .line 877
    .line 878
    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 879
    .line 880
    .line 881
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    invoke-virtual {v2, p2, v1}, Lc5/c;->g(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)V

    .line 885
    .line 886
    .line 887
    new-instance v2, Ljava/lang/StringBuilder;

    .line 888
    .line 889
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 890
    .line 891
    .line 892
    const-string v6, "\u9875\u9762SourceSave: saveRouter-> geometry:"

    .line 893
    .line 894
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 895
    .line 896
    .line 897
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->a()Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object v6

    .line 901
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 902
    .line 903
    .line 904
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 905
    .line 906
    .line 907
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->d()Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v6

    .line 911
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 912
    .line 913
    .line 914
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v2

    .line 918
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object v2

    .line 922
    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 923
    .line 924
    .line 925
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->u()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 926
    .line 927
    .line 928
    move-result-object v2

    .line 929
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->a()Ljava/lang/String;

    .line 930
    .line 931
    .line 932
    move-result-object v6

    .line 933
    invoke-virtual {v2, v6}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 934
    .line 935
    .line 936
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->d()Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v1

    .line 940
    invoke-virtual {v2, v1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 941
    .line 942
    .line 943
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 944
    .line 945
    .line 946
    goto :goto_6

    .line 947
    :cond_d
    sget-object p1, Lu5/k;->a:Lu5/k;

    .line 948
    .line 949
    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    const-string v1, "routerRecord.build()"

    .line 957
    .line 958
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 959
    .line 960
    .line 961
    const-string v1, "router.bin"

    .line 962
    .line 963
    invoke-virtual {p1, p2, v1, v0}, Lu5/k;->d(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 964
    .line 965
    .line 966
    return-void
.end method

.method public final l(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;)V
    .locals 6

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$TextSource;->u()Lcom/zykj/board/EzySource$TextSource$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 34
    .line 35
    invoke-static {}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->w()Lcom/zykj/board/EzySource$TextSource$TextInfo$b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->b()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$TextSource$TextInfo$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzySource$TextSource$TextInfo$b;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->z()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->a()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->q(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->g()F

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->y(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->f()F

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->w(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->e()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {v4, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->v(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4}, Lcom/zykj/board/EzyPaint$Paint$b;->d()Lcom/zykj/board/EzyPaint$Paint;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v3, v2}, Lcom/zykj/board/EzySource$TextSource$TextInfo$b;->w(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzySource$TextSource$TextInfo$b;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v3}, Lcom/zykj/board/EzySource$TextSource$b;->d(Lcom/zykj/board/EzySource$TextSource$TextInfo$b;)Lcom/zykj/board/EzySource$TextSource$b;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TextSource$b;->p()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-lez v1, :cond_2

    .line 94
    .line 95
    sget-object v1, Lu5/k;->a:Lu5/k;

    .line 96
    .line 97
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->a()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TextSource$b;->e()Lcom/zykj/board/EzySource$TextSource;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v3, "textRecord.build()"

    .line 106
    .line 107
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, p1, v2, v0}, Lu5/k;->d(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-eqz p1, :cond_1

    .line 115
    .line 116
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 117
    .line 118
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->c:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 119
    .line 120
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->a(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-eqz p1, :cond_1

    .line 125
    .line 126
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->g(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :cond_1
    return-void

    .line 130
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    .line 135
    const-string v0, "[SourceSave]: saveText-> ["

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->a()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string p2, "]textInfoCount==0"

    .line 148
    .line 149
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public final m(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$TouchSource;->u()Lcom/zykj/board/EzySource$TouchSource$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 34
    .line 35
    invoke-static {}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->x()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->z()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->i()F

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->y(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->a()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->q(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->e()F

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->u(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->c()F

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->s(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->f()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->v(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->g()F

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->w(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Lcom/zykj/board/EzyPaint$Paint$b;->d()Lcom/zykj/board/EzyPaint$Paint;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->y(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->h()Lio/objectbox/relation/ToMany;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_0

    .line 105
    .line 106
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 111
    .line 112
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->A()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->d()F

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->B(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->e()F

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->C(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->a()J

    .line 131
    .line 132
    .line 133
    move-result-wide v6

    .line 134
    invoke-virtual {v5, v6, v7}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->v(J)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->f()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->e(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_0
    invoke-virtual {v0, v3}, Lcom/zykj/board/EzySource$TouchSource$b;->d(Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;)Lcom/zykj/board/EzySource$TouchSource$b;

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource$b;->p()I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-lez v1, :cond_3

    .line 154
    .line 155
    sget-object v1, Lu5/k;->a:Lu5/k;

    .line 156
    .line 157
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->a()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource$b;->e()Lcom/zykj/board/EzySource$TouchSource;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    const-string v3, "touchRecord.build()"

    .line 166
    .line 167
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, p1, v2, v0}, Lu5/k;->d(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    if-eqz p1, :cond_2

    .line 175
    .line 176
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 177
    .line 178
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->c:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 179
    .line 180
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->a(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-eqz p1, :cond_2

    .line 185
    .line 186
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->g(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    :cond_2
    return-void

    .line 190
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const-string v0, "[SourceSave]: saveTouch-> ["

    .line 196
    .line 197
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->a()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string p2, "]touchInfoCount==0"

    .line 208
    .line 209
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    return-void
.end method
