# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/data/SourceSave;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final HEADER_FILE_NAME:Ljava/lang/String; = "header.bin"

.field public static final INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

.field public static final PAGE_ROUTER_FILE_NAME:Ljava/lang/String; = "page_router.bin"

.field public static final ROUTER_FILE_NAME:Ljava/lang/String; = "router.bin"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/blackboard/core/data/SourceSave;

    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/SourceSave;-><init>()V

    sput-object v0, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final buildAuthor(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)Lcom/zykj/board/EzyHeader$Author;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->s()Lcom/zykj/board/EzyHeader$Author$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getAuthorName()Ljava/lang/String;

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
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getAuthorId()Ljava/lang/String;

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
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getSchoolId()Ljava/lang/String;

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
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getUrl()Ljava/lang/String;

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
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getStartTime()Ljava/lang/Long;

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
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getDuration()Ljava/lang/Long;

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
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$Author$b;->e()Lcom/zykj/board/EzyHeader$Author;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v0, "newBuilder().apply {\n   \u2026      }\n        }.build()"

    .line 72
    .line 73
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-object p1
.end method

.method private final buildBackgroundLineConfig(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->n()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->getLineColor()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->r(I)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->getLineSpace()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->s(F)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->getLineType()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->t(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->e()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "newBuilder().apply {\n   \u2026ineType\n        }.build()"

    .line 31
    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method private final buildMoveConfig(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->r()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->isEnable()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->s(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getVerticalTranslate()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->z(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getHorizontalTranslate()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->r(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getScale()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->x(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getRotate()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->w(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getMaxHeightTimes()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->t(I)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getMaxWidthTimes()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->u(I)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->e()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v0, "newBuilder().apply {\n   \u2026thTimes\n        }.build()"

    .line 59
    .line 60
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object p1
.end method

.method public static synthetic saveRecord$default(Lcom/zykj/blackboard/core/data/SourceSave;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    move-object p3, p2

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/data/SourceSave;->saveRecord(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final saveAudio(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;)V
    .locals 6

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource;->i()Lcom/zykj/board/EzyCommand$CommandSource$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

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
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->p()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getDelayTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    invoke-virtual {v3, v4, v5}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->t(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getDuration()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    invoke-virtual {v3, v4, v5}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->u(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->isPlay()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->w(Z)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getCommandEnum()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->q(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getData()[B

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
    invoke-virtual {v0, v3}, Lcom/zykj/board/EzyCommand$CommandSource$b;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;)Lcom/zykj/board/EzyCommand$CommandSource$b;

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
    sget-object v1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 89
    .line 90
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getFileName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$b;->f()Lcom/zykj/board/EzyCommand$CommandSource;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v3, "audioRecord.build()"

    .line 99
    .line 100
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, p1, v2, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-eqz p1, :cond_1

    .line 108
    .line 109
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 110
    .line 111
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->SHA256:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 112
    .line 113
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eqz p1, :cond_1

    .line 118
    .line 119
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->setValidate(Ljava/lang/String;)V

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
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getFileName()Ljava/lang/String;

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
    invoke-static {p1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public final saveCommand(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;)V
    .locals 6

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource;->i()Lcom/zykj/board/EzyCommand$CommandSource$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

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
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->p()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getDelayTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    invoke-virtual {v3, v4, v5}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->t(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getDuration()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    invoke-virtual {v3, v4, v5}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->u(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->isPlay()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->w(Z)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getCommandEnum()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->q(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

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
    invoke-virtual {v0, v3}, Lcom/zykj/board/EzyCommand$CommandSource$b;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;)Lcom/zykj/board/EzyCommand$CommandSource$b;

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
    sget-object v1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 89
    .line 90
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getFileName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$b;->f()Lcom/zykj/board/EzyCommand$CommandSource;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v3, "commandRecord.build()"

    .line 99
    .line 100
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, p1, v2, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-eqz p1, :cond_1

    .line 108
    .line 109
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 110
    .line 111
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->SHA256:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 112
    .line 113
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eqz p1, :cond_1

    .line 118
    .line 119
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->setValidate(Ljava/lang/String;)V

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
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getFileName()Ljava/lang/String;

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
    invoke-static {p1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public final saveFile(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)V
    .locals 5

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$FileSource;->i()Lcom/zykj/board/EzySource$FileSource$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileInfoEntity()Lio/objectbox/relation/ToMany;

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
    invoke-static {}, Lcom/zykj/board/EzySource$FileSource$FileInfo;->k()Lcom/zykj/board/EzySource$FileSource$FileInfo$b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->getFileName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$FileSource$FileInfo$b;->s(Ljava/lang/String;)Lcom/zykj/board/EzySource$FileSource$FileInfo$b;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->getValidate()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v3, v2}, Lcom/zykj/board/EzySource$FileSource$FileInfo$b;->v(Ljava/lang/String;)Lcom/zykj/board/EzySource$FileSource$FileInfo$b;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v3}, Lcom/zykj/board/EzySource$FileSource$b;->c(Lcom/zykj/board/EzySource$FileSource$FileInfo$b;)Lcom/zykj/board/EzySource$FileSource$b;

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
    sget-object v1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 64
    .line 65
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$FileSource$b;->f()Lcom/zykj/board/EzySource$FileSource;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v3, "fileRecord.build()"

    .line 74
    .line 75
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, p1, v2, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-eqz p1, :cond_1

    .line 83
    .line 84
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 85
    .line 86
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->SHA256:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 87
    .line 88
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-eqz p1, :cond_1

    .line 93
    .line 94
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->setValidate(Ljava/lang/String;)V

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
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileName()Ljava/lang/String;

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
    invoke-static {p1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public final saveGeometry(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)V
    .locals 7

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$GeometrySource;->i()Lcom/zykj/board/EzySource$GeometrySource$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getGeometryInfoEntityList()Lio/objectbox/relation/ToMany;

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
    invoke-static {}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->q()Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getGeometryType()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;->z(I)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->n()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getColor()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->q(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getWidth()F

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->y(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getTextSize()F

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->w(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getStyle()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->v(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4}, Lcom/zykj/board/EzyPaint$Paint$b;->e()Lcom/zykj/board/EzyPaint$Paint;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;->A(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getPointList()Lio/objectbox/relation/ToMany;

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
    invoke-static {}, Lcom/zykj/board/EzyPointF$PointF;->e()Lcom/zykj/board/EzyPointF$PointF$b;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->getX()F

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyPointF$PointF$b;->t(F)Lcom/zykj/board/EzyPointF$PointF$b;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->getY()F

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    invoke-virtual {v5, v4}, Lcom/zykj/board/EzyPointF$PointF$b;->u(F)Lcom/zykj/board/EzyPointF$PointF$b;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5}, Lcom/zykj/board/EzyPointF$PointF$b;->e()Lcom/zykj/board/EzyPointF$PointF;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;->c(Lcom/zykj/board/EzyPointF$PointF;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_0
    invoke-virtual {v0, v3}, Lcom/zykj/board/EzySource$GeometrySource$b;->c(Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;)Lcom/zykj/board/EzySource$GeometrySource$b;

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
    sget-object v1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 142
    .line 143
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getFileName()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$b;->f()Lcom/zykj/board/EzySource$GeometrySource;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    const-string v3, "geometryRecord.build()"

    .line 152
    .line 153
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, p1, v2, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-eqz p1, :cond_2

    .line 161
    .line 162
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 163
    .line 164
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->SHA256:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 165
    .line 166
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    if-eqz p1, :cond_2

    .line 171
    .line 172
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->setValidate(Ljava/lang/String;)V

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
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getFileName()Ljava/lang/String;

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
    invoke-static {p1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    return-void
.end method

.method public final saveHeader(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "pageEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 20
    .line 21
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->J()Lcom/zykj/board/EzyHeader$Header$b;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getVersion()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->Y(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getWidth()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->Z(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->R(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getCreateDate()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    invoke-virtual {v1, v2, v3}, Lcom/zykj/board/EzyHeader$Header$b;->M(J)Lcom/zykj/board/EzyHeader$Header$b;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getUpdateDate()J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    invoke-virtual {v1, v2, v3}, Lcom/zykj/board/EzyHeader$Header$b;->X(J)Lcom/zykj/board/EzyHeader$Header$b;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDuration()J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    invoke-virtual {v1, v2, v3}, Lcom/zykj/board/EzyHeader$Header$b;->P(J)Lcom/zykj/board/EzyHeader$Header$b;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDefaultBackgroundColor()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->N(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getLastBackgroundColor()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->S(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getAuthor()Lio/objectbox/relation/ToOne;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 90
    .line 91
    if-eqz v2, :cond_0

    .line 92
    .line 93
    sget-object v3, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 94
    .line 95
    invoke-direct {v3, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->buildAuthor(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)Lcom/zykj/board/EzyHeader$Author;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->L(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 100
    .line 101
    .line 102
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getMoveConfig()Lio/objectbox/relation/ToOne;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 111
    .line 112
    if-eqz v2, :cond_1

    .line 113
    .line 114
    sget-object v3, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 115
    .line 116
    invoke-direct {v3, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->buildMoveConfig(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->U(Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 121
    .line 122
    .line 123
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDefaultBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 132
    .line 133
    if-eqz v2, :cond_2

    .line 134
    .line 135
    sget-object v3, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 136
    .line 137
    invoke-direct {v3, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->buildBackgroundLineConfig(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->O(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 142
    .line 143
    .line 144
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getLastBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 153
    .line 154
    if-eqz v2, :cond_3

    .line 155
    .line 156
    sget-object v3, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 157
    .line 158
    invoke-direct {v3, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->buildBackgroundLineConfig(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->T(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 163
    .line 164
    .line 165
    :cond_3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getProvider()Lio/objectbox/relation/ToMany;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_4

    .line 178
    .line 179
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 184
    .line 185
    sget-object v3, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 186
    .line 187
    const-string v4, "it"

    .line 188
    .line 189
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-direct {v3, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->buildAuthor(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)Lcom/zykj/board/EzyHeader$Author;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Header$b;->e(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 197
    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_4
    sget-object v0, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 201
    .line 202
    new-instance v2, Ljava/io/File;

    .line 203
    .line 204
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-direct {v2, p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    const-string p2, "File(path, pageEntity.dirName).absolutePath"

    .line 216
    .line 217
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header$b;->g()Lcom/zykj/board/EzyHeader$Header;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    const-string v1, "header.build()"

    .line 225
    .line 226
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    const-string v1, "header.bin"

    .line 230
    .line 231
    invoke-virtual {v0, p1, v1, p2}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 232
    .line 233
    .line 234
    return-void
.end method

.method public final saveMatrix(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$MatrixSource;->h()Lcom/zykj/board/EzySource$MatrixSource$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getMatrixEventEntity()Lio/objectbox/relation/ToMany;

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
    invoke-static {}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->g()Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo$b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->getMatrixInfo()Lio/objectbox/relation/ToMany;

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
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->u()Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getEventTime()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    invoke-virtual {v5, v6, v7}, Lcom/zykj/board/EzyMatrix$Matrix$b;->q(J)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getScaleX()F

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->w(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getSkewX()F

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->y(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getTransX()F

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->A(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getSkewY()F

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->z(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getScaleY()F

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->x(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getTransY()F

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->B(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp0()F

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->s(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp1()F

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyMatrix$Matrix$b;->t(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp2()F

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    invoke-virtual {v5, v4}, Lcom/zykj/board/EzyMatrix$Matrix$b;->u(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5}, Lcom/zykj/board/EzyMatrix$Matrix$b;->e()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo$b;->e(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo$b;

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_0
    invoke-virtual {v3}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo$b;->g()Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzySource$MatrixSource$b;->c(Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;)Lcom/zykj/board/EzySource$MatrixSource$b;

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
    sget-object v1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 156
    .line 157
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getFileName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$MatrixSource$b;->f()Lcom/zykj/board/EzySource$MatrixSource;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    const-string v3, "matrixRecord.build()"

    .line 166
    .line 167
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, p1, v2, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    if-eqz p1, :cond_2

    .line 175
    .line 176
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 177
    .line 178
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->SHA256:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 179
    .line 180
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-eqz p1, :cond_2

    .line 185
    .line 186
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->setValidate(Ljava/lang/String;)V

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
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getFileName()Ljava/lang/String;

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
    invoke-static {p1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    return-void
.end method

.method public final saveRecord(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "boardEntity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagePathList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->getDir()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 15
    :cond_0
    invoke-static {}, Lcom/zykj/board/EzyPageRouter$PageRouter;->h()Lcom/zykj/board/EzyPageRouter$PageRouter$b;

    move-result-object v1

    .line 16
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->getPages()Lio/objectbox/relation/ToMany;

    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_1

    invoke-static {}, Li7/v;->w()V

    :cond_1
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 18
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "[SourceSave]: saveRecord-> ["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "]["

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0x5d

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 19
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 20
    invoke-static {}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;->h()Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;

    move-result-object v5

    .line 21
    invoke-virtual {v5, v2}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;->s(I)Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;

    .line 22
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;

    .line 23
    invoke-virtual {v1, v5}, Lcom/zykj/board/EzyPageRouter$PageRouter$b;->c(Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;)Lcom/zykj/board/EzyPageRouter$PageRouter$b;

    .line 24
    sget-object v5, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 25
    const-string v8, "pageEntity"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-virtual {v5, v3, v0}, Lcom/zykj/blackboard/core/data/SourceSave;->saveHeader(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V

    .line 27
    invoke-virtual {v5, v3, v0}, Lcom/zykj/blackboard/core/data/SourceSave;->saveRouter(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V

    .line 28
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] \u7ed3\u675f"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    :cond_2
    move v2, v4

    goto/16 :goto_0

    .line 29
    :cond_3
    sget-object p1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 30
    invoke-virtual {v1}, Lcom/zykj/board/EzyPageRouter$PageRouter$b;->f()Lcom/zykj/board/EzyPageRouter$PageRouter;

    move-result-object p2

    const-string v1, "pageRecord.build()"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    const-string v1, "page_router.bin"

    invoke-virtual {p1, v0, v1, p2}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    return-void
.end method

.method public final saveRecord(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "pagePathList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "boardPath"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[SourceSave]: saveRecord-> boardPath:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, Li7/v;->w()V

    :cond_0
    check-cast v2, Ljava/lang/String;

    .line 4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v5, 0x5b

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]:"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v1, v3

    goto :goto_0

    .line 5
    :cond_1
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 6
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 7
    sget-object p2, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    invoke-virtual {p2}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    move-result-object p2

    const-class v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    invoke-virtual {p2, v0}, Lio/objectbox/BoxStore;->d(Ljava/lang/Class;)Lio/objectbox/a;

    move-result-object p2

    const-string v0, "BoardBox.boxStore.boxFor\u2026kBoardEntity::class.java)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p2}, Lio/objectbox/a;->n()Lio/objectbox/query/QueryBuilder;

    move-result-object p2

    .line 9
    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->dir:Lio/objectbox/Property;

    invoke-virtual {p2, v0, p3}, Lio/objectbox/query/QueryBuilder;->c(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 11
    invoke-virtual {p2}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    move-result-object p2

    const-string p3, "builder.build()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p2}, Lio/objectbox/query/Query;->l()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    if-eqz p2, :cond_2

    .line 13
    sget-object p3, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    invoke-virtual {p3, p2, p1}, Lcom/zykj/blackboard/core/data/SourceSave;->saveRecord(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method public final saveRouter(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V
    .locals 9

    const-string v0, "pageEntity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->I()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    .line 3
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    move-result-object p1

    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 4
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

    move-result-object v1

    .line 5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, ", validate:"

    const-string v4, "it"

    const-string v5, "pagePath"

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 6
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "[SourceSave]: saveRouter-> command:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 7
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_0

    .line 8
    sget-object v6, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    invoke-static {p2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, p2, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->saveCommand(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;)V

    .line 9
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 10
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->i()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v3

    .line 11
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 12
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 13
    invoke-virtual {v0, v3}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getFileList()Lio/objectbox/relation/ToMany;

    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 16
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "[SourceSave]: saveRouter-> file:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 17
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileInfoEntity()Lio/objectbox/relation/ToMany;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_2

    .line 18
    sget-object v6, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    invoke-static {p2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, p2, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->saveFile(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)V

    .line 19
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 20
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->i()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v6

    .line 21
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 22
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 23
    invoke-virtual {v0, v6}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    goto :goto_1

    .line 24
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTouchList()Lio/objectbox/relation/ToMany;

    move-result-object v1

    .line 25
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 26
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "[SourceSave]: saveRouter-> touch:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 27
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getTouchEventList()Lio/objectbox/relation/ToMany;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_4

    .line 28
    sget-object v6, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    invoke-static {p2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, p2, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->saveTouch(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;)V

    .line 29
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 30
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->i()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v6

    .line 31
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 32
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 33
    invoke-virtual {v0, v6}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    goto :goto_2

    .line 34
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getMatrixList()Lio/objectbox/relation/ToMany;

    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 36
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "[SourceSave]: saveRouter-> matrix:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 37
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getMatrixEventEntity()Lio/objectbox/relation/ToMany;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_6

    .line 38
    sget-object v6, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    invoke-static {p2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, p2, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->saveMatrix(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;)V

    .line 39
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 40
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->i()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v6

    .line 41
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 42
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 43
    invoke-virtual {v0, v6}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    goto :goto_3

    .line 44
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getAudioList()Lio/objectbox/relation/ToMany;

    move-result-object v1

    .line 45
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 46
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "[SourceSave]: saveRouter-> audio:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 47
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_8

    .line 48
    sget-object v6, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    invoke-static {p2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, p2, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->saveAudio(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;)V

    .line 49
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 50
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->i()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v6

    .line 51
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 52
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 53
    invoke-virtual {v0, v6}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    goto :goto_4

    .line 54
    :cond_9
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTextList()Lio/objectbox/relation/ToMany;

    move-result-object v1

    .line 55
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_a
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 56
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "[SourceSave]: saveRouter-> text:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 57
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getTextInfoEntityList()Lio/objectbox/relation/ToMany;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_a

    .line 58
    sget-object v6, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    invoke-static {p2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, p2, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->saveText(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;)V

    .line 59
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 60
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->i()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v6

    .line 61
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 62
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 63
    invoke-virtual {v0, v6}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    goto :goto_5

    .line 64
    :cond_b
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getGeometryList()Lio/objectbox/relation/ToMany;

    move-result-object p1

    .line 65
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_c
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 66
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "[SourceSave]: saveRouter-> geometry:"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 67
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getGeometryInfoEntityList()Lio/objectbox/relation/ToMany;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_c

    .line 68
    sget-object v2, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    invoke-static {p2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p2, v1}, Lcom/zykj/blackboard/core/data/SourceSave;->saveGeometry(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)V

    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 70
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->i()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v2

    .line 71
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 72
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 73
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    goto :goto_6

    .line 74
    :cond_d
    sget-object p1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 75
    invoke-static {p2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    move-result-object v0

    const-string v1, "routerRecord.build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    const-string v1, "router.bin"

    invoke-virtual {p1, p2, v1, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    return-void
.end method

.method public final saveText(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;)V
    .locals 6

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$TextSource;->i()Lcom/zykj/board/EzySource$TextSource$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getTextInfoEntityList()Lio/objectbox/relation/ToMany;

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
    invoke-static {}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->k()Lcom/zykj/board/EzySource$TextSource$TextInfo$b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getContent()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$TextSource$TextInfo$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzySource$TextSource$TextInfo$b;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->n()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getColor()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->q(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getWidth()F

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->y(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getTextSize()F

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->w(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getStyle()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {v4, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->v(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4}, Lcom/zykj/board/EzyPaint$Paint$b;->e()Lcom/zykj/board/EzyPaint$Paint;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v3, v2}, Lcom/zykj/board/EzySource$TextSource$TextInfo$b;->w(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzySource$TextSource$TextInfo$b;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v3}, Lcom/zykj/board/EzySource$TextSource$b;->e(Lcom/zykj/board/EzySource$TextSource$TextInfo$b;)Lcom/zykj/board/EzySource$TextSource$b;

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
    sget-object v1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 96
    .line 97
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getFileName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TextSource$b;->f()Lcom/zykj/board/EzySource$TextSource;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v3, "textRecord.build()"

    .line 106
    .line 107
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, p1, v2, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-eqz p1, :cond_1

    .line 115
    .line 116
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 117
    .line 118
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->SHA256:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 119
    .line 120
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-eqz p1, :cond_1

    .line 125
    .line 126
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->setValidate(Ljava/lang/String;)V

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
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getFileName()Ljava/lang/String;

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
    invoke-static {p1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public final saveTouch(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$TouchSource;->i()Lcom/zykj/board/EzySource$TouchSource$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getTouchEventList()Lio/objectbox/relation/ToMany;

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
    invoke-static {}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->l()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->n()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getWidth()F

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->y(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getColor()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->q(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getSpacing()F

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->u(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getItemLength()F

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->s(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getStyle()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->v(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getTextSize()F

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-virtual {v4, v5}, Lcom/zykj/board/EzyPaint$Paint$b;->w(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Lcom/zykj/board/EzyPaint$Paint$b;->e()Lcom/zykj/board/EzyPaint$Paint;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->y(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getTouchInfoList()Lio/objectbox/relation/ToMany;

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
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->o()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->getX()F

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->B(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->getY()F

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->C(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->getEventTime()J

    .line 131
    .line 132
    .line 133
    move-result-wide v6

    .line 134
    invoke-virtual {v5, v6, v7}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->v(J)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-virtual {v3, v4}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->f(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_0
    invoke-virtual {v0, v3}, Lcom/zykj/board/EzySource$TouchSource$b;->e(Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;)Lcom/zykj/board/EzySource$TouchSource$b;

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
    sget-object v1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 156
    .line 157
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getFileName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource$b;->f()Lcom/zykj/board/EzySource$TouchSource;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    const-string v3, "touchRecord.build()"

    .line 166
    .line 167
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, p1, v2, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    if-eqz p1, :cond_2

    .line 175
    .line 176
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 177
    .line 178
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->SHA256:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 179
    .line 180
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-eqz p1, :cond_2

    .line 185
    .line 186
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->setValidate(Ljava/lang/String;)V

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
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getFileName()Ljava/lang/String;

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
    invoke-static {p1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    return-void
.end method
