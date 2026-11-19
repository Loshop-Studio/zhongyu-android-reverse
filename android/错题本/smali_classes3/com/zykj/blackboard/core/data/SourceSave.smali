# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox、Protobuf。
.class public final Lcom/zykj/blackboard/core/data/SourceSave;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J-\u0010\u0019\u001a\u00020\u00182\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\u0004\u0008\u0019\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0014\u00a2\u0006\u0004\u0008 \u0010!J\u001d\u0010\"\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\"\u0010!J\u001d\u0010&\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008&\u0010\'J\u001d\u0010)\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00142\u0006\u0010%\u001a\u00020(\u00a2\u0006\u0004\u0008)\u0010*J\u001d\u0010,\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00142\u0006\u0010%\u001a\u00020+\u00a2\u0006\u0004\u0008,\u0010-J\u001d\u0010/\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00142\u0006\u0010%\u001a\u00020.\u00a2\u0006\u0004\u0008/\u00100J\u001d\u00102\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00142\u0006\u0010%\u001a\u000201\u00a2\u0006\u0004\u00082\u00103J\u001d\u00105\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00142\u0006\u0010%\u001a\u000204\u00a2\u0006\u0004\u00085\u00106J\u001d\u00108\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00142\u0006\u0010%\u001a\u000207\u00a2\u0006\u0004\u00088\u00109R\u0014\u0010:\u001a\u00020\u00148\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010<\u001a\u00020\u00148\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008<\u0010;R\u0014\u0010=\u001a\u00020\u00148\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008=\u0010;\u00a8\u0006>"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/data/SourceSave;",
        "",
        "<init>",
        "()V",
        "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
        "authorEntity",
        "Lcom/zykj/board/EzyHeader$Author;",
        "buildAuthor",
        "(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)Lcom/zykj/board/EzyHeader$Author;",
        "Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;",
        "moveConfig",
        "Lcom/zykj/board/EzyHeader$MoveConfig;",
        "buildMoveConfig",
        "(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)Lcom/zykj/board/EzyHeader$MoveConfig;",
        "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
        "backgroundLineConfig",
        "Lcom/zykj/board/EzyHeader$BackgroundLineConfig;",
        "buildBackgroundLineConfig",
        "(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;",
        "",
        "",
        "pagePathList",
        "path",
        "boardPath",
        "Ld6/s;",
        "saveRecord",
        "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V",
        "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
        "boardEntity",
        "(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/util/List;)V",
        "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
        "pageEntity",
        "saveHeader",
        "(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V",
        "saveRouter",
        "pagePath",
        "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;",
        "record",
        "saveCommand",
        "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;)V",
        "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
        "saveTouch",
        "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;)V",
        "Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;",
        "saveFile",
        "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)V",
        "Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;",
        "saveMatrix",
        "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;)V",
        "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;",
        "saveAudio",
        "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;)V",
        "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;",
        "saveText",
        "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;)V",
        "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;",
        "saveGeometry",
        "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)V",
        "PAGE_ROUTER_FILE_NAME",
        "Ljava/lang/String;",
        "ROUTER_FILE_NAME",
        "HEADER_FILE_NAME",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final HEADER_FILE_NAME:Ljava/lang/String; = "header.bin"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final PAGE_ROUTER_FILE_NAME:Ljava/lang/String; = "page_router.bin"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final ROUTER_FILE_NAME:Ljava/lang/String; = "router.bin"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


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
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->newBuilder()Lb4/o;

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
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iput-object v1, v0, Lb4/o;->b:Ljava/lang/Object;

    .line 15
    .line 16
    iget v1, v0, Lb4/o;->a:I

    .line 17
    .line 18
    or-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    iput v1, v0, Lb4/o;->a:I

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getAuthorId()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iput-object v1, v0, Lb4/o;->d:Ljava/lang/Object;

    .line 35
    .line 36
    iget v1, v0, Lb4/o;->a:I

    .line 37
    .line 38
    or-int/lit8 v1, v1, 0x4

    .line 39
    .line 40
    iput v1, v0, Lb4/o;->a:I

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getSchoolId()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iput-object v1, v0, Lb4/o;->c:Ljava/lang/Object;

    .line 55
    .line 56
    iget v1, v0, Lb4/o;->a:I

    .line 57
    .line 58
    or-int/lit8 v1, v1, 0x2

    .line 59
    .line 60
    iput v1, v0, Lb4/o;->a:I

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getUrl()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iput-object v1, v0, Lb4/o;->e:Ljava/lang/Object;

    .line 75
    .line 76
    iget v1, v0, Lb4/o;->a:I

    .line 77
    .line 78
    or-int/lit8 v1, v1, 0x8

    .line 79
    .line 80
    iput v1, v0, Lb4/o;->a:I

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 83
    .line 84
    .line 85
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getStartTime()Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 92
    .line 93
    .line 94
    move-result-wide v1

    .line 95
    iput-wide v1, v0, Lb4/o;->f:J

    .line 96
    .line 97
    iget v1, v0, Lb4/o;->a:I

    .line 98
    .line 99
    or-int/lit8 v1, v1, 0x10

    .line 100
    .line 101
    iput v1, v0, Lb4/o;->a:I

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getDuration()Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 113
    .line 114
    .line 115
    move-result-wide v1

    .line 116
    iput-wide v1, v0, Lb4/o;->g:J

    .line 117
    .line 118
    iget p1, v0, Lb4/o;->a:I

    .line 119
    .line 120
    or-int/lit8 p1, p1, 0x20

    .line 121
    .line 122
    iput p1, v0, Lb4/o;->a:I

    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 125
    .line 126
    .line 127
    :cond_5
    invoke-virtual {v0}, Lb4/o;->c()Lcom/zykj/board/EzyHeader$Author;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->isInitialized()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_6

    .line 136
    .line 137
    return-object p1

    .line 138
    :cond_6
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    throw p1
.end method

.method private final buildBackgroundLineConfig(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->newBuilder()Lb4/r;

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
    iput v1, v0, Lb4/r;->b:I

    .line 10
    .line 11
    iget v1, v0, Lb4/r;->a:I

    .line 12
    .line 13
    or-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    iput v1, v0, Lb4/r;->a:I

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->getLineSpace()F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iput v1, v0, Lb4/r;->c:F

    .line 25
    .line 26
    iget v1, v0, Lb4/r;->a:I

    .line 27
    .line 28
    or-int/lit8 v1, v1, 0x2

    .line 29
    .line 30
    iput v1, v0, Lb4/r;->a:I

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->getLineType()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget v1, v0, Lb4/r;->a:I

    .line 43
    .line 44
    or-int/lit8 v1, v1, 0x4

    .line 45
    .line 46
    iput v1, v0, Lb4/r;->a:I

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->getNumber()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iput p1, v0, Lb4/r;->d:I

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lb4/r;->c()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
.end method

.method private final buildMoveConfig(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->newBuilder()Lb4/w;

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
    iput-boolean v1, v0, Lb4/w;->b:Z

    .line 10
    .line 11
    iget v1, v0, Lb4/w;->a:I

    .line 12
    .line 13
    or-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    iput v1, v0, Lb4/w;->a:I

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getVerticalTranslate()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iput-boolean v1, v0, Lb4/w;->c:Z

    .line 25
    .line 26
    iget v1, v0, Lb4/w;->a:I

    .line 27
    .line 28
    or-int/lit8 v1, v1, 0x2

    .line 29
    .line 30
    iput v1, v0, Lb4/w;->a:I

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getHorizontalTranslate()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iput-boolean v1, v0, Lb4/w;->d:Z

    .line 40
    .line 41
    iget v1, v0, Lb4/w;->a:I

    .line 42
    .line 43
    or-int/lit8 v1, v1, 0x4

    .line 44
    .line 45
    iput v1, v0, Lb4/w;->a:I

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getScale()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iput-boolean v1, v0, Lb4/w;->e:Z

    .line 55
    .line 56
    iget v1, v0, Lb4/w;->a:I

    .line 57
    .line 58
    or-int/lit8 v1, v1, 0x8

    .line 59
    .line 60
    iput v1, v0, Lb4/w;->a:I

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getRotate()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iput-boolean v1, v0, Lb4/w;->f:Z

    .line 70
    .line 71
    iget v1, v0, Lb4/w;->a:I

    .line 72
    .line 73
    or-int/lit8 v1, v1, 0x10

    .line 74
    .line 75
    iput v1, v0, Lb4/w;->a:I

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getMaxHeightTimes()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    iput v1, v0, Lb4/w;->g:I

    .line 85
    .line 86
    iget v1, v0, Lb4/w;->a:I

    .line 87
    .line 88
    or-int/lit8 v1, v1, 0x20

    .line 89
    .line 90
    iput v1, v0, Lb4/w;->a:I

    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getMaxWidthTimes()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    iput p1, v0, Lb4/w;->h:I

    .line 100
    .line 101
    iget p1, v0, Lb4/w;->a:I

    .line 102
    .line 103
    or-int/lit8 p1, p1, 0x40

    .line 104
    .line 105
    iput p1, v0, Lb4/w;->a:I

    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Lb4/w;->c()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->isInitialized()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_0

    .line 119
    .line 120
    return-object p1

    .line 121
    :cond_0
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    throw p1
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
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource;->newBuilder()Lcom/zykj/board/a;

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
    if-eqz v2, :cond_1

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
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->newBuilder()Lcom/zykj/board/e;

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
    invoke-virtual {v3, v4, v5}, Lcom/zykj/board/e;->k(J)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getDuration()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    invoke-virtual {v3, v4, v5}, Lcom/zykj/board/e;->l(J)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->isPlay()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {v3, v4}, Lcom/zykj/board/e;->m(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getCommandEnum()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v3, v4}, Lcom/zykj/board/e;->i(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)V

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
    invoke-virtual {v3, v2}, Lcom/zykj/board/e;->j(Lcom/google/protobuf/ByteString;)V

    .line 76
    .line 77
    .line 78
    iget-object v2, v0, Lcom/zykj/board/a;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 79
    .line 80
    if-nez v2, :cond_0

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/zykj/board/a;->g()V

    .line 83
    .line 84
    .line 85
    iget-object v2, v0, Lcom/zykj/board/a;->b:Ljava/util/List;

    .line 86
    .line 87
    invoke-virtual {v3}, Lcom/zykj/board/e;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    invoke-virtual {v3}, Lcom/zykj/board/e;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v2, v3}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_1
    iget-object v1, v0, Lcom/zykj/board/a;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 107
    .line 108
    if-nez v1, :cond_2

    .line 109
    .line 110
    iget-object v1, v0, Lcom/zykj/board/a;->b:Ljava/util/List;

    .line 111
    .line 112
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    goto :goto_1

    .line 117
    :cond_2
    invoke-virtual {v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getCount()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    :goto_1
    if-lez v1, :cond_4

    .line 122
    .line 123
    sget-object v1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 124
    .line 125
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getFileName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v0}, Lcom/zykj/board/a;->c()Lcom/zykj/board/EzyCommand$CommandSource;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v1, p1, v2, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-eqz p1, :cond_3

    .line 138
    .line 139
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 140
    .line 141
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->SHA256:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 142
    .line 143
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-eqz p1, :cond_3

    .line 148
    .line 149
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->setValidate(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_3
    return-void

    .line 153
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v0, "[SourceSave]: saveAudio-> ["

    .line 156
    .line 157
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getFileName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string p2, "]commandInfoCount==0"

    .line 168
    .line 169
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public final saveCommand(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource;->newBuilder()Lcom/zykj/board/a;

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
    if-eqz v2, :cond_1

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
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->newBuilder()Lcom/zykj/board/e;

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
    invoke-virtual {v3, v4, v5}, Lcom/zykj/board/e;->k(J)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getDuration()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    invoke-virtual {v3, v4, v5}, Lcom/zykj/board/e;->l(J)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->isPlay()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {v3, v4}, Lcom/zykj/board/e;->m(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getCommandEnum()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v3, v4}, Lcom/zykj/board/e;->i(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)V

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
    invoke-virtual {v3, v2}, Lcom/zykj/board/e;->j(Lcom/google/protobuf/ByteString;)V

    .line 76
    .line 77
    .line 78
    iget-object v2, v0, Lcom/zykj/board/a;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 79
    .line 80
    if-nez v2, :cond_0

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/zykj/board/a;->g()V

    .line 83
    .line 84
    .line 85
    iget-object v2, v0, Lcom/zykj/board/a;->b:Ljava/util/List;

    .line 86
    .line 87
    invoke-virtual {v3}, Lcom/zykj/board/e;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    invoke-virtual {v3}, Lcom/zykj/board/e;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v2, v3}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_1
    iget-object v1, v0, Lcom/zykj/board/a;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 107
    .line 108
    if-nez v1, :cond_2

    .line 109
    .line 110
    iget-object v1, v0, Lcom/zykj/board/a;->b:Ljava/util/List;

    .line 111
    .line 112
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    goto :goto_1

    .line 117
    :cond_2
    invoke-virtual {v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getCount()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    :goto_1
    if-lez v1, :cond_4

    .line 122
    .line 123
    sget-object v1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 124
    .line 125
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getFileName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v0}, Lcom/zykj/board/a;->c()Lcom/zykj/board/EzyCommand$CommandSource;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v1, p1, v2, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-eqz p1, :cond_3

    .line 138
    .line 139
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 140
    .line 141
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->SHA256:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 142
    .line 143
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-eqz p1, :cond_3

    .line 148
    .line 149
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->setValidate(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_3
    return-void

    .line 153
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v0, "[SourceSave]: saveCommand-> ["

    .line 156
    .line 157
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getFileName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string p2, "]commandInfoCount==0"

    .line 168
    .line 169
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public final saveFile(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$FileSource;->newBuilder()Lcom/zykj/board/i0;

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
    if-eqz v2, :cond_1

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
    invoke-static {}, Lcom/zykj/board/EzySource$FileSource$FileInfo;->newBuilder()Lcom/zykj/board/k0;

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
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iput-object v4, v3, Lcom/zykj/board/k0;->b:Ljava/lang/Object;

    .line 50
    .line 51
    iget v4, v3, Lcom/zykj/board/k0;->a:I

    .line 52
    .line 53
    or-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    iput v4, v3, Lcom/zykj/board/k0;->a:I

    .line 56
    .line 57
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->getValidate()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iput-object v2, v3, Lcom/zykj/board/k0;->e:Ljava/lang/Object;

    .line 68
    .line 69
    iget v2, v3, Lcom/zykj/board/k0;->a:I

    .line 70
    .line 71
    or-int/lit8 v2, v2, 0x8

    .line 72
    .line 73
    iput v2, v3, Lcom/zykj/board/k0;->a:I

    .line 74
    .line 75
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 76
    .line 77
    .line 78
    iget-object v2, v0, Lcom/zykj/board/i0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 79
    .line 80
    if-nez v2, :cond_0

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/zykj/board/i0;->f()V

    .line 83
    .line 84
    .line 85
    iget-object v2, v0, Lcom/zykj/board/i0;->b:Ljava/util/List;

    .line 86
    .line 87
    invoke-virtual {v3}, Lcom/zykj/board/k0;->c()Lcom/zykj/board/EzySource$FileSource$FileInfo;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    invoke-virtual {v3}, Lcom/zykj/board/k0;->c()Lcom/zykj/board/EzySource$FileSource$FileInfo;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v2, v3}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_1
    iget-object v1, v0, Lcom/zykj/board/i0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 107
    .line 108
    if-nez v1, :cond_2

    .line 109
    .line 110
    iget-object v1, v0, Lcom/zykj/board/i0;->b:Ljava/util/List;

    .line 111
    .line 112
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    goto :goto_1

    .line 117
    :cond_2
    invoke-virtual {v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getCount()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    :goto_1
    if-lez v1, :cond_5

    .line 122
    .line 123
    sget-object v1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 124
    .line 125
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v0}, Lcom/zykj/board/i0;->c()Lcom/zykj/board/EzySource$FileSource;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$FileSource;->isInitialized()Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_4

    .line 138
    .line 139
    invoke-virtual {v1, p1, v2, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-eqz p1, :cond_3

    .line 144
    .line 145
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 146
    .line 147
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->SHA256:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 148
    .line 149
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    if-eqz p1, :cond_3

    .line 154
    .line 155
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->setValidate(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_3
    return-void

    .line 159
    :cond_4
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    throw p1

    .line 164
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    const-string v0, "[SourceSave]: saveFile-> ["

    .line 167
    .line 168
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileName()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string p2, "]fileInfoCount==0"

    .line 179
    .line 180
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    return-void
.end method

.method public final saveGeometry(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$GeometrySource;->newBuilder()Lcom/zykj/board/l0;

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
    if-eqz v2, :cond_4

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
    invoke-static {}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->newBuilder()Lcom/zykj/board/n0;

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
    iput v4, v3, Lcom/zykj/board/n0;->b:I

    .line 44
    .line 45
    iget v4, v3, Lcom/zykj/board/n0;->a:I

    .line 46
    .line 47
    or-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    iput v4, v3, Lcom/zykj/board/n0;->a:I

    .line 50
    .line 51
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->newBuilder()Lb4/p0;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getColor()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-virtual {v4, v5}, Lb4/p0;->i(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getWidth()F

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    invoke-virtual {v4, v5}, Lb4/p0;->n(F)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getTextSize()F

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    invoke-virtual {v4, v5}, Lb4/p0;->m(F)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getStyle()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    invoke-virtual {v4, v5}, Lb4/p0;->l(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Lb4/p0;->c()Lcom/zykj/board/EzyPaint$Paint;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    iget-object v5, v3, Lcom/zykj/board/n0;->f:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 91
    .line 92
    if-nez v5, :cond_0

    .line 93
    .line 94
    iput-object v4, v3, Lcom/zykj/board/n0;->e:Lcom/zykj/board/EzyPaint$Paint;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_0
    invoke-virtual {v5, v4}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 98
    .line 99
    .line 100
    :goto_1
    iget v4, v3, Lcom/zykj/board/n0;->a:I

    .line 101
    .line 102
    or-int/lit8 v4, v4, 0x4

    .line 103
    .line 104
    iput v4, v3, Lcom/zykj/board/n0;->a:I

    .line 105
    .line 106
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getPointList()Lio/objectbox/relation/ToMany;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    check-cast v4, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    .line 128
    .line 129
    invoke-static {}, Lcom/zykj/board/EzyPointF$PointF;->newBuilder()Lb4/u0;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->getX()F

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    invoke-virtual {v5, v6}, Lb4/u0;->i(F)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->getY()F

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    invoke-virtual {v5, v4}, Lb4/u0;->j(F)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5}, Lb4/u0;->c()Lcom/zykj/board/EzyPointF$PointF;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    iget-object v5, v3, Lcom/zykj/board/n0;->d:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 152
    .line 153
    if-nez v5, :cond_1

    .line 154
    .line 155
    invoke-virtual {v3}, Lcom/zykj/board/n0;->g()V

    .line 156
    .line 157
    .line 158
    iget-object v5, v3, Lcom/zykj/board/n0;->c:Ljava/util/List;

    .line 159
    .line 160
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_1
    invoke-virtual {v5, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_2
    iget-object v2, v0, Lcom/zykj/board/l0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 172
    .line 173
    if-nez v2, :cond_3

    .line 174
    .line 175
    invoke-virtual {v0}, Lcom/zykj/board/l0;->f()V

    .line 176
    .line 177
    .line 178
    iget-object v2, v0, Lcom/zykj/board/l0;->b:Ljava/util/List;

    .line 179
    .line 180
    invoke-virtual {v3}, Lcom/zykj/board/n0;->c()Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 188
    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :cond_3
    invoke-virtual {v3}, Lcom/zykj/board/n0;->c()Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v2, v3}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 197
    .line 198
    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :cond_4
    iget-object v1, v0, Lcom/zykj/board/l0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 202
    .line 203
    if-nez v1, :cond_5

    .line 204
    .line 205
    iget-object v1, v0, Lcom/zykj/board/l0;->b:Ljava/util/List;

    .line 206
    .line 207
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    goto :goto_3

    .line 212
    :cond_5
    invoke-virtual {v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getCount()I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    :goto_3
    if-lez v1, :cond_8

    .line 217
    .line 218
    sget-object v1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 219
    .line 220
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getFileName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-virtual {v0}, Lcom/zykj/board/l0;->c()Lcom/zykj/board/EzySource$GeometrySource;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource;->isInitialized()Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-eqz v3, :cond_7

    .line 233
    .line 234
    invoke-virtual {v1, p1, v2, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    if-eqz p1, :cond_6

    .line 239
    .line 240
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 241
    .line 242
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->SHA256:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 243
    .line 244
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    if-eqz p1, :cond_6

    .line 249
    .line 250
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->setValidate(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    :cond_6
    return-void

    .line 254
    :cond_7
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    throw p1

    .line 259
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    const-string v0, "[SourceSave]: saveGeometry-> ["

    .line 262
    .line 263
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getFileName()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    const-string p2, "]geometryInfoCount==0"

    .line 274
    .line 275
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    return-void
.end method

.method public final saveHeader(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V
    .locals 5
    .param p1    # Lcom/zykj/blackboard/core/data/dao/PageEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "pageEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 29
    .line 30
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->newBuilder()Lb4/u;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getVersion()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iput v2, v1, Lb4/u;->b:I

    .line 39
    .line 40
    iget v2, v1, Lb4/u;->a:I

    .line 41
    .line 42
    or-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    iput v2, v1, Lb4/u;->a:I

    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iput v2, v1, Lb4/u;->c:I

    .line 54
    .line 55
    iget v2, v1, Lb4/u;->a:I

    .line 56
    .line 57
    or-int/lit8 v2, v2, 0x2

    .line 58
    .line 59
    iput v2, v1, Lb4/u;->a:I

    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iput v2, v1, Lb4/u;->d:I

    .line 69
    .line 70
    iget v2, v1, Lb4/u;->a:I

    .line 71
    .line 72
    or-int/lit8 v2, v2, 0x4

    .line 73
    .line 74
    iput v2, v1, Lb4/u;->a:I

    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getCreateDate()J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    iput-wide v2, v1, Lb4/u;->e:J

    .line 84
    .line 85
    iget v2, v1, Lb4/u;->a:I

    .line 86
    .line 87
    or-int/lit8 v2, v2, 0x8

    .line 88
    .line 89
    iput v2, v1, Lb4/u;->a:I

    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getUpdateDate()J

    .line 95
    .line 96
    .line 97
    move-result-wide v2

    .line 98
    iput-wide v2, v1, Lb4/u;->f:J

    .line 99
    .line 100
    iget v2, v1, Lb4/u;->a:I

    .line 101
    .line 102
    or-int/lit8 v2, v2, 0x10

    .line 103
    .line 104
    iput v2, v1, Lb4/u;->a:I

    .line 105
    .line 106
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDuration()J

    .line 110
    .line 111
    .line 112
    move-result-wide v2

    .line 113
    iput-wide v2, v1, Lb4/u;->g:J

    .line 114
    .line 115
    iget v2, v1, Lb4/u;->a:I

    .line 116
    .line 117
    or-int/lit8 v2, v2, 0x20

    .line 118
    .line 119
    iput v2, v1, Lb4/u;->a:I

    .line 120
    .line 121
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDefaultBackgroundColor()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    iput v2, v1, Lb4/u;->m:I

    .line 129
    .line 130
    iget v2, v1, Lb4/u;->a:I

    .line 131
    .line 132
    or-int/lit16 v2, v2, 0x200

    .line 133
    .line 134
    iput v2, v1, Lb4/u;->a:I

    .line 135
    .line 136
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getLastBackgroundColor()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    iput v2, v1, Lb4/u;->n:I

    .line 144
    .line 145
    iget v2, v1, Lb4/u;->a:I

    .line 146
    .line 147
    or-int/lit16 v2, v2, 0x400

    .line 148
    .line 149
    iput v2, v1, Lb4/u;->a:I

    .line 150
    .line 151
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getAuthor()Lio/objectbox/relation/ToOne;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 163
    .line 164
    if-eqz v2, :cond_1

    .line 165
    .line 166
    sget-object v3, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 167
    .line 168
    invoke-direct {v3, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->buildAuthor(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)Lcom/zykj/board/EzyHeader$Author;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    iget-object v3, v1, Lb4/u;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 173
    .line 174
    if-nez v3, :cond_0

    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iput-object v2, v1, Lb4/u;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_0
    invoke-virtual {v3, v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 183
    .line 184
    .line 185
    :goto_0
    iget v2, v1, Lb4/u;->a:I

    .line 186
    .line 187
    or-int/lit8 v2, v2, 0x40

    .line 188
    .line 189
    iput v2, v1, Lb4/u;->a:I

    .line 190
    .line 191
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 192
    .line 193
    .line 194
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getMoveConfig()Lio/objectbox/relation/ToOne;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 203
    .line 204
    if-eqz v2, :cond_3

    .line 205
    .line 206
    sget-object v3, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 207
    .line 208
    invoke-direct {v3, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->buildMoveConfig(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    iget-object v3, v1, Lb4/u;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 213
    .line 214
    if-nez v3, :cond_2

    .line 215
    .line 216
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    iput-object v2, v1, Lb4/u;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_2
    invoke-virtual {v3, v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 223
    .line 224
    .line 225
    :goto_1
    iget v2, v1, Lb4/u;->a:I

    .line 226
    .line 227
    or-int/lit16 v2, v2, 0x800

    .line 228
    .line 229
    iput v2, v1, Lb4/u;->a:I

    .line 230
    .line 231
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 232
    .line 233
    .line 234
    :cond_3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDefaultBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 243
    .line 244
    if-eqz v2, :cond_5

    .line 245
    .line 246
    sget-object v3, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 247
    .line 248
    invoke-direct {v3, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->buildBackgroundLineConfig(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    iget-object v3, v1, Lb4/u;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 253
    .line 254
    if-nez v3, :cond_4

    .line 255
    .line 256
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    iput-object v2, v1, Lb4/u;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_4
    invoke-virtual {v3, v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 263
    .line 264
    .line 265
    :goto_2
    iget v2, v1, Lb4/u;->a:I

    .line 266
    .line 267
    or-int/lit16 v2, v2, 0x1000

    .line 268
    .line 269
    iput v2, v1, Lb4/u;->a:I

    .line 270
    .line 271
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 272
    .line 273
    .line 274
    :cond_5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getLastBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 283
    .line 284
    if-eqz v2, :cond_7

    .line 285
    .line 286
    sget-object v3, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 287
    .line 288
    invoke-direct {v3, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->buildBackgroundLineConfig(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    iget-object v3, v1, Lb4/u;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 293
    .line 294
    if-nez v3, :cond_6

    .line 295
    .line 296
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    iput-object v2, v1, Lb4/u;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_6
    invoke-virtual {v3, v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 303
    .line 304
    .line 305
    :goto_3
    iget v2, v1, Lb4/u;->a:I

    .line 306
    .line 307
    or-int/lit16 v2, v2, 0x2000

    .line 308
    .line 309
    iput v2, v1, Lb4/u;->a:I

    .line 310
    .line 311
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 312
    .line 313
    .line 314
    :cond_7
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getProvider()Lio/objectbox/relation/ToMany;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-eqz v2, :cond_9

    .line 327
    .line 328
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 333
    .line 334
    sget-object v3, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 335
    .line 336
    const-string v4, "it"

    .line 337
    .line 338
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-direct {v3, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->buildAuthor(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)Lcom/zykj/board/EzyHeader$Author;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    iget-object v3, v1, Lb4/u;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 346
    .line 347
    if-nez v3, :cond_8

    .line 348
    .line 349
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1}, Lb4/u;->g()V

    .line 353
    .line 354
    .line 355
    iget-object v3, v1, Lb4/u;->k:Ljava/util/List;

    .line 356
    .line 357
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 361
    .line 362
    .line 363
    goto :goto_4

    .line 364
    :cond_8
    invoke-virtual {v3, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 365
    .line 366
    .line 367
    goto :goto_4

    .line 368
    :cond_9
    sget-object v0, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 369
    .line 370
    new-instance v2, Ljava/io/File;

    .line 371
    .line 372
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    invoke-direct {v2, p2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    const-string v3, "File(path, pageEntity.dirName).absolutePath"

    .line 384
    .line 385
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    const-string v3, "header.bin"

    .line 389
    .line 390
    invoke-virtual {v1}, Lb4/u;->c()Lcom/zykj/board/EzyHeader$Header;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    invoke-virtual {v0, v2, v3, v1}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 395
    .line 396
    .line 397
    new-instance v0, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    const-string v1, "\u9875\u9762SourceSave\uff1a\u4fdd\u5b58Header.bin\u6587\u4ef6\u7ed3\u675f\uff0c\u8def\u5f84\u662f"

    .line 400
    .line 401
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    new-instance v1, Ljava/io/File;

    .line 405
    .line 406
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    invoke-direct {v1, p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    return-void
.end method

.method public final saveMatrix(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$MatrixSource;->newBuilder()Lcom/zykj/board/o0;

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
    if-eqz v2, :cond_3

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
    invoke-static {}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->newBuilder()Lcom/zykj/board/q0;

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
    if-eqz v4, :cond_1

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
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->newBuilder()Lb4/b0;

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
    invoke-virtual {v5, v6, v7}, Lb4/b0;->i(J)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getScaleX()F

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    invoke-virtual {v5, v6}, Lb4/b0;->m(F)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getSkewX()F

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    invoke-virtual {v5, v6}, Lb4/b0;->o(F)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getTransX()F

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    invoke-virtual {v5, v6}, Lb4/b0;->q(F)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getSkewY()F

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    invoke-virtual {v5, v6}, Lb4/b0;->p(F)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getScaleY()F

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    invoke-virtual {v5, v6}, Lb4/b0;->n(F)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getTransY()F

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    invoke-virtual {v5, v6}, Lb4/b0;->r(F)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp0()F

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    invoke-virtual {v5, v6}, Lb4/b0;->j(F)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp1()F

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-virtual {v5, v6}, Lb4/b0;->k(F)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp2()F

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    invoke-virtual {v5, v4}, Lb4/b0;->l(F)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5}, Lb4/b0;->c()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    iget-object v5, v3, Lcom/zykj/board/q0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 138
    .line 139
    if-nez v5, :cond_0

    .line 140
    .line 141
    invoke-virtual {v3}, Lcom/zykj/board/q0;->ensureMatrixIsMutable()V

    .line 142
    .line 143
    .line 144
    iget-object v5, v3, Lcom/zykj/board/q0;->b:Ljava/util/List;

    .line 145
    .line 146
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_0
    invoke-virtual {v5, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_1
    invoke-virtual {v3}, Lcom/zykj/board/q0;->c()Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    iget-object v3, v0, Lcom/zykj/board/o0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 162
    .line 163
    if-nez v3, :cond_2

    .line 164
    .line 165
    invoke-virtual {v0}, Lcom/zykj/board/o0;->f()V

    .line 166
    .line 167
    .line 168
    iget-object v3, v0, Lcom/zykj/board/o0;->b:Ljava/util/List;

    .line 169
    .line 170
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :cond_2
    invoke-virtual {v3, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 179
    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_3
    iget-object v1, v0, Lcom/zykj/board/o0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 184
    .line 185
    if-nez v1, :cond_4

    .line 186
    .line 187
    iget-object v1, v0, Lcom/zykj/board/o0;->b:Ljava/util/List;

    .line 188
    .line 189
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    goto :goto_2

    .line 194
    :cond_4
    invoke-virtual {v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getCount()I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    :goto_2
    if-lez v1, :cond_7

    .line 199
    .line 200
    sget-object v1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 201
    .line 202
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getFileName()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v0}, Lcom/zykj/board/o0;->c()Lcom/zykj/board/EzySource$MatrixSource;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$MatrixSource;->isInitialized()Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eqz v3, :cond_6

    .line 215
    .line 216
    invoke-virtual {v1, p1, v2, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    if-eqz p1, :cond_5

    .line 221
    .line 222
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 223
    .line 224
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->SHA256:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 225
    .line 226
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    if-eqz p1, :cond_5

    .line 231
    .line 232
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->setValidate(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :cond_5
    return-void

    .line 236
    :cond_6
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    throw p1

    .line 241
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v0, "[SourceSave]: saveMatrix-> ["

    .line 244
    .line 245
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getFileName()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string p2, "]matrixInfoCount==0"

    .line 256
    .line 257
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    return-void
.end method

.method public final saveRecord(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/util/List;)V
    .locals 9
    .param p1    # Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagePathList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->getDir()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 14
    :cond_0
    invoke-static {}, Lcom/zykj/board/EzyPageRouter$PageRouter;->newBuilder()Lcom/zykj/board/y;

    move-result-object v1

    .line 15
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->getPages()Lio/objectbox/relation/ToMany;

    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-ltz v2, :cond_3

    check-cast v3, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 17
    const-string v5, "\u9875\u9762SourceSave: saveRecord-> \u7b2c"

    const-string v6, "\u6761 => "

    invoke-static {v2, v5, v6}, Landroid/support/v4/media/f;->s(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 18
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "\u5f00\u59cb\u6267\u884c\u4fdd\u5b58\u64cd\u4f5c"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 19
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p2, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 20
    invoke-static {}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;->newBuilder()Lcom/zykj/board/a0;

    move-result-object v7

    .line 21
    iput v2, v7, Lcom/zykj/board/a0;->c:I

    .line 22
    iget v8, v7, Lcom/zykj/board/a0;->a:I

    or-int/lit8 v8, v8, 0x2

    iput v8, v7, Lcom/zykj/board/a0;->a:I

    .line 23
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 24
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    move-result-object v8

    .line 25
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    iput-object v8, v7, Lcom/zykj/board/a0;->b:Ljava/lang/Object;

    .line 27
    iget v8, v7, Lcom/zykj/board/a0;->a:I

    or-int/lit8 v8, v8, 0x1

    iput v8, v7, Lcom/zykj/board/a0;->a:I

    .line 28
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 29
    iget-object v8, v1, Lcom/zykj/board/y;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v8, :cond_1

    .line 30
    invoke-virtual {v1}, Lcom/zykj/board/y;->f()V

    .line 31
    iget-object v8, v1, Lcom/zykj/board/y;->b:Ljava/util/List;

    invoke-virtual {v7}, Lcom/zykj/board/a0;->c()Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;

    move-result-object v7

    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {v7}, Lcom/zykj/board/a0;->c()Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;

    move-result-object v7

    invoke-virtual {v8, v7}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 34
    :goto_1
    sget-object v7, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    invoke-virtual {v7, v3, v0}, Lcom/zykj/blackboard/core/data/SourceSave;->saveHeader(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V

    .line 35
    invoke-virtual {v7, v3, v0}, Lcom/zykj/blackboard/core/data/SourceSave;->saveRouter(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V

    .line 36
    invoke-static {v2, v5, v6}, Landroid/support/v4/media/f;->s(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 37
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " \u7ed3\u675f"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    :cond_2
    move v2, v4

    goto/16 :goto_0

    .line 38
    :cond_3
    invoke-static {}, Lkotlin/collections/u;->L()V

    const/4 p1, 0x0

    throw p1

    .line 39
    :cond_4
    sget-object p1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 40
    invoke-virtual {v1}, Lcom/zykj/board/y;->c()Lcom/zykj/board/EzyPageRouter$PageRouter;

    move-result-object p2

    .line 41
    invoke-virtual {p2}, Lcom/zykj/board/EzyPageRouter$PageRouter;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 42
    const-string v1, "page_router.bin"

    invoke-virtual {p1, v0, v1, p2}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 43
    const-string p1, "\u9875\u9762SourceSave: saveRecord-> \u7ed3\u675f,page_route.bin\u6587\u4ef6\u4fdd\u5b58\u7ed3\u675f"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    return-void

    .line 44
    :cond_5
    invoke-static {p2}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object p1

    throw p1
.end method

.method public final saveRecord(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "boardPath"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    const-string v0, "[SourceSave]: saveRecord-> boardPath:"

    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

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

    if-ltz v1, :cond_0

    check-cast v2, Ljava/lang/String;

    .line 4
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

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
    :cond_0
    invoke-static {}, Lkotlin/collections/u;->L()V

    const/4 p1, 0x0

    throw p1

    .line 6
    :cond_1
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 7
    sget-object p2, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    invoke-virtual {p2}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    move-result-object p2

    const-class v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    invoke-virtual {p2, v0}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    move-result-object p2

    .line 8
    invoke-virtual {p2}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    move-result-object p2

    .line 9
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->dir:Lio/objectbox/Property;

    invoke-virtual {p2, v0, p3}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p2}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    move-result-object p2

    .line 11
    invoke-virtual {p2}, Lio/objectbox/query/Query;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    if-eqz p2, :cond_2

    .line 12
    sget-object p3, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    invoke-virtual {p3, p2, p1}, Lcom/zykj/blackboard/core/data/SourceSave;->saveRecord(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method public final saveRouter(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V
    .locals 7
    .param p1    # Lcom/zykj/blackboard/core/data/dao/PageEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "pageEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->newBuilder()Lcom/zykj/board/f0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/io/File;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

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
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

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
    const-string v4, "pagePath"

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 61
    .line 62
    new-instance v5, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v6, "\u9875\u9762SourceSave: \u5f00\u59cb\u4fdd\u5b58commandList\u6587\u4ef6:"

    .line 65
    .line 66
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getFileName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-static {v5}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-nez v5, :cond_0

    .line 96
    .line 97
    sget-object v5, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 98
    .line 99
    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, p2, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->saveCommand(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;)V

    .line 103
    .line 104
    .line 105
    new-instance v4, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v5, "\u9875\u9762SourceSave: saveRouter-> command:"

    .line 108
    .line 109
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getFileName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getValidate()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-static {v3}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->newBuilder()Lcom/zykj/board/h0;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getFileName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v3, v4}, Lcom/zykj/board/h0;->i(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getValidate()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v3, v2}, Lcom/zykj/board/h0;->j(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iget-object v2, v0, Lcom/zykj/board/f0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 159
    .line 160
    if-nez v2, :cond_1

    .line 161
    .line 162
    invoke-virtual {v0}, Lcom/zykj/board/f0;->g()V

    .line 163
    .line 164
    .line 165
    iget-object v2, v0, Lcom/zykj/board/f0;->b:Ljava/util/List;

    .line 166
    .line 167
    invoke-virtual {v3}, Lcom/zykj/board/h0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_1
    invoke-virtual {v3}, Lcom/zykj/board/h0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v2, v3}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 184
    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getFileList()Lio/objectbox/relation/ToMany;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_5

    .line 201
    .line 202
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 207
    .line 208
    new-instance v5, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    const-string v6, "\u9875\u9762SourceSave: \u5f00\u59cb\u4fdd\u5b58file\u6587\u4ef6-> file:"

    .line 211
    .line 212
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileName()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-static {v5}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileInfoEntity()Lio/objectbox/relation/ToMany;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-nez v5, :cond_3

    .line 242
    .line 243
    sget-object v5, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 244
    .line 245
    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v5, p2, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->saveFile(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)V

    .line 249
    .line 250
    .line 251
    new-instance v5, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    const-string v6, "\u9875\u9762SourceSave: saveRouter-> file:"

    .line 254
    .line 255
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileName()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getValidate()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-static {v5}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->newBuilder()Lcom/zykj/board/h0;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileName()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v6

    .line 294
    invoke-virtual {v5, v6}, Lcom/zykj/board/h0;->i(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getValidate()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-virtual {v5, v2}, Lcom/zykj/board/h0;->j(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    iget-object v2, v0, Lcom/zykj/board/f0;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 305
    .line 306
    if-nez v2, :cond_4

    .line 307
    .line 308
    invoke-virtual {v0}, Lcom/zykj/board/f0;->h()V

    .line 309
    .line 310
    .line 311
    iget-object v2, v0, Lcom/zykj/board/f0;->j:Ljava/util/List;

    .line 312
    .line 313
    invoke-virtual {v5}, Lcom/zykj/board/h0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 321
    .line 322
    .line 323
    goto :goto_1

    .line 324
    :cond_4
    invoke-virtual {v5}, Lcom/zykj/board/h0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    invoke-virtual {v2, v5}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 329
    .line 330
    .line 331
    goto/16 :goto_1

    .line 332
    .line 333
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTouchList()Lio/objectbox/relation/ToMany;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    :cond_6
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    if-eqz v2, :cond_8

    .line 346
    .line 347
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 352
    .line 353
    new-instance v5, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    const-string v6, "\u9875\u9762SourceSave: \u5f00\u59cb\u4fdd\u5b58touch\u6587\u4ef6-> touch:"

    .line 356
    .line 357
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getFileName()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v6

    .line 364
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    invoke-static {v5}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getTouchEventList()Lio/objectbox/relation/ToMany;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    if-nez v5, :cond_6

    .line 387
    .line 388
    sget-object v5, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 389
    .line 390
    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v5, p2, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->saveTouch(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;)V

    .line 394
    .line 395
    .line 396
    new-instance v5, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    const-string v6, "\u9875\u9762SourceSave: saveRouter-> touch:"

    .line 399
    .line 400
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getFileName()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getValidate()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v6

    .line 417
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    invoke-static {v5}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->newBuilder()Lcom/zykj/board/h0;

    .line 432
    .line 433
    .line 434
    move-result-object v5

    .line 435
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getFileName()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v6

    .line 439
    invoke-virtual {v5, v6}, Lcom/zykj/board/h0;->i(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getValidate()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    invoke-virtual {v5, v2}, Lcom/zykj/board/h0;->j(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    iget-object v2, v0, Lcom/zykj/board/f0;->g:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 450
    .line 451
    if-nez v2, :cond_7

    .line 452
    .line 453
    invoke-virtual {v0}, Lcom/zykj/board/f0;->l()V

    .line 454
    .line 455
    .line 456
    iget-object v2, v0, Lcom/zykj/board/f0;->f:Ljava/util/List;

    .line 457
    .line 458
    invoke-virtual {v5}, Lcom/zykj/board/h0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 459
    .line 460
    .line 461
    move-result-object v5

    .line 462
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 466
    .line 467
    .line 468
    goto :goto_2

    .line 469
    :cond_7
    invoke-virtual {v5}, Lcom/zykj/board/h0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    invoke-virtual {v2, v5}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 474
    .line 475
    .line 476
    goto/16 :goto_2

    .line 477
    .line 478
    :cond_8
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getMatrixList()Lio/objectbox/relation/ToMany;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    :cond_9
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    if-eqz v2, :cond_b

    .line 491
    .line 492
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 497
    .line 498
    new-instance v5, Ljava/lang/StringBuilder;

    .line 499
    .line 500
    const-string v6, "\u9875\u9762SourceSave: \u5f00\u59cb\u4fdd\u5b58\u77e9\u9635\u6587\u4ef6-> matrix:"

    .line 501
    .line 502
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getFileName()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v6

    .line 509
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v5

    .line 516
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v5

    .line 520
    invoke-static {v5}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getMatrixEventEntity()Lio/objectbox/relation/ToMany;

    .line 524
    .line 525
    .line 526
    move-result-object v5

    .line 527
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 528
    .line 529
    .line 530
    move-result v5

    .line 531
    if-nez v5, :cond_9

    .line 532
    .line 533
    sget-object v5, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 534
    .line 535
    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v5, p2, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->saveMatrix(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;)V

    .line 539
    .line 540
    .line 541
    new-instance v5, Ljava/lang/StringBuilder;

    .line 542
    .line 543
    const-string v6, "\u9875\u9762SourceSave: saveRouter-> matrix:"

    .line 544
    .line 545
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getFileName()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getValidate()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v6

    .line 562
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v5

    .line 569
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v5

    .line 573
    invoke-static {v5}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->newBuilder()Lcom/zykj/board/h0;

    .line 577
    .line 578
    .line 579
    move-result-object v5

    .line 580
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getFileName()Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v6

    .line 584
    invoke-virtual {v5, v6}, Lcom/zykj/board/h0;->i(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getValidate()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    invoke-virtual {v5, v2}, Lcom/zykj/board/h0;->j(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    iget-object v2, v0, Lcom/zykj/board/f0;->i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 595
    .line 596
    if-nez v2, :cond_a

    .line 597
    .line 598
    invoke-virtual {v0}, Lcom/zykj/board/f0;->j()V

    .line 599
    .line 600
    .line 601
    iget-object v2, v0, Lcom/zykj/board/f0;->h:Ljava/util/List;

    .line 602
    .line 603
    invoke-virtual {v5}, Lcom/zykj/board/h0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 604
    .line 605
    .line 606
    move-result-object v5

    .line 607
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 611
    .line 612
    .line 613
    goto :goto_3

    .line 614
    :cond_a
    invoke-virtual {v5}, Lcom/zykj/board/h0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    invoke-virtual {v2, v5}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 619
    .line 620
    .line 621
    goto/16 :goto_3

    .line 622
    .line 623
    :cond_b
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getAudioList()Lio/objectbox/relation/ToMany;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    :cond_c
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 632
    .line 633
    .line 634
    move-result v2

    .line 635
    if-eqz v2, :cond_e

    .line 636
    .line 637
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 642
    .line 643
    new-instance v5, Ljava/lang/StringBuilder;

    .line 644
    .line 645
    const-string v6, "\u9875\u9762SourceSave: \u5f00\u59cb\u4fdd\u5b58\u97f3\u9891\u6587\u4ef6-> audio:"

    .line 646
    .line 647
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getFileName()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v6

    .line 654
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v5

    .line 661
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v5

    .line 665
    invoke-static {v5}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 669
    .line 670
    .line 671
    move-result-object v5

    .line 672
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 673
    .line 674
    .line 675
    move-result v5

    .line 676
    if-nez v5, :cond_c

    .line 677
    .line 678
    sget-object v5, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 679
    .line 680
    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v5, p2, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->saveAudio(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;)V

    .line 684
    .line 685
    .line 686
    new-instance v5, Ljava/lang/StringBuilder;

    .line 687
    .line 688
    const-string v6, "\u9875\u9762SourceSave: saveRouter-> audio:"

    .line 689
    .line 690
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getFileName()Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v6

    .line 697
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getValidate()Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v6

    .line 707
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v5

    .line 714
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v5

    .line 718
    invoke-static {v5}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 719
    .line 720
    .line 721
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->newBuilder()Lcom/zykj/board/h0;

    .line 722
    .line 723
    .line 724
    move-result-object v5

    .line 725
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getFileName()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v6

    .line 729
    invoke-virtual {v5, v6}, Lcom/zykj/board/h0;->i(Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getValidate()Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v2

    .line 736
    invoke-virtual {v5, v2}, Lcom/zykj/board/h0;->j(Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    iget-object v2, v0, Lcom/zykj/board/f0;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 740
    .line 741
    if-nez v2, :cond_d

    .line 742
    .line 743
    invoke-virtual {v0}, Lcom/zykj/board/f0;->f()V

    .line 744
    .line 745
    .line 746
    iget-object v2, v0, Lcom/zykj/board/f0;->d:Ljava/util/List;

    .line 747
    .line 748
    invoke-virtual {v5}, Lcom/zykj/board/h0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 749
    .line 750
    .line 751
    move-result-object v5

    .line 752
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 756
    .line 757
    .line 758
    goto :goto_4

    .line 759
    :cond_d
    invoke-virtual {v5}, Lcom/zykj/board/h0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 760
    .line 761
    .line 762
    move-result-object v5

    .line 763
    invoke-virtual {v2, v5}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 764
    .line 765
    .line 766
    goto/16 :goto_4

    .line 767
    .line 768
    :cond_e
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTextList()Lio/objectbox/relation/ToMany;

    .line 769
    .line 770
    .line 771
    move-result-object v1

    .line 772
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    :cond_f
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 777
    .line 778
    .line 779
    move-result v2

    .line 780
    if-eqz v2, :cond_11

    .line 781
    .line 782
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v2

    .line 786
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 787
    .line 788
    new-instance v5, Ljava/lang/StringBuilder;

    .line 789
    .line 790
    const-string v6, "\u9875\u9762SourceSave: \u5f00\u59cb\u4fdd\u5b58text\u6587\u4ef6,saveRouter-> text:"

    .line 791
    .line 792
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getFileName()Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v6

    .line 799
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v5

    .line 806
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v5

    .line 810
    invoke-static {v5}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getTextInfoEntityList()Lio/objectbox/relation/ToMany;

    .line 814
    .line 815
    .line 816
    move-result-object v5

    .line 817
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 818
    .line 819
    .line 820
    move-result v5

    .line 821
    if-nez v5, :cond_f

    .line 822
    .line 823
    sget-object v5, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 824
    .line 825
    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    invoke-virtual {v5, p2, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->saveText(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;)V

    .line 829
    .line 830
    .line 831
    new-instance v5, Ljava/lang/StringBuilder;

    .line 832
    .line 833
    const-string v6, "\u9875\u9762SourceSave: saveRouter-> text:"

    .line 834
    .line 835
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getFileName()Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v6

    .line 842
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 846
    .line 847
    .line 848
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getValidate()Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v6

    .line 852
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 853
    .line 854
    .line 855
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v5

    .line 859
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v5

    .line 863
    invoke-static {v5}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 864
    .line 865
    .line 866
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->newBuilder()Lcom/zykj/board/h0;

    .line 867
    .line 868
    .line 869
    move-result-object v5

    .line 870
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getFileName()Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v6

    .line 874
    invoke-virtual {v5, v6}, Lcom/zykj/board/h0;->i(Ljava/lang/String;)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getValidate()Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v2

    .line 881
    invoke-virtual {v5, v2}, Lcom/zykj/board/h0;->j(Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    iget-object v2, v0, Lcom/zykj/board/f0;->m:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 885
    .line 886
    if-nez v2, :cond_10

    .line 887
    .line 888
    invoke-virtual {v0}, Lcom/zykj/board/f0;->k()V

    .line 889
    .line 890
    .line 891
    iget-object v2, v0, Lcom/zykj/board/f0;->l:Ljava/util/List;

    .line 892
    .line 893
    invoke-virtual {v5}, Lcom/zykj/board/h0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 894
    .line 895
    .line 896
    move-result-object v5

    .line 897
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 898
    .line 899
    .line 900
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 901
    .line 902
    .line 903
    goto :goto_5

    .line 904
    :cond_10
    invoke-virtual {v5}, Lcom/zykj/board/h0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 905
    .line 906
    .line 907
    move-result-object v5

    .line 908
    invoke-virtual {v2, v5}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 909
    .line 910
    .line 911
    goto/16 :goto_5

    .line 912
    .line 913
    :cond_11
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getGeometryList()Lio/objectbox/relation/ToMany;

    .line 914
    .line 915
    .line 916
    move-result-object p1

    .line 917
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 918
    .line 919
    .line 920
    move-result-object p1

    .line 921
    :cond_12
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 922
    .line 923
    .line 924
    move-result v1

    .line 925
    if-eqz v1, :cond_14

    .line 926
    .line 927
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v1

    .line 931
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 932
    .line 933
    new-instance v2, Ljava/lang/StringBuilder;

    .line 934
    .line 935
    const-string v5, "\u9875\u9762SourceSave: \u5f00\u59cb\u4fdd\u5b58geometryList\u6587\u4ef6\uff0csaveRouter-> geometry:"

    .line 936
    .line 937
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getFileName()Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v5

    .line 944
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 945
    .line 946
    .line 947
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v2

    .line 951
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v2

    .line 955
    invoke-static {v2}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getGeometryInfoEntityList()Lio/objectbox/relation/ToMany;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 963
    .line 964
    .line 965
    move-result v2

    .line 966
    if-nez v2, :cond_12

    .line 967
    .line 968
    sget-object v2, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 969
    .line 970
    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    invoke-virtual {v2, p2, v1}, Lcom/zykj/blackboard/core/data/SourceSave;->saveGeometry(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)V

    .line 974
    .line 975
    .line 976
    new-instance v2, Ljava/lang/StringBuilder;

    .line 977
    .line 978
    const-string v5, "\u9875\u9762SourceSave: saveRouter-> geometry:"

    .line 979
    .line 980
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 981
    .line 982
    .line 983
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getFileName()Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v5

    .line 987
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 988
    .line 989
    .line 990
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 991
    .line 992
    .line 993
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getValidate()Ljava/lang/String;

    .line 994
    .line 995
    .line 996
    move-result-object v5

    .line 997
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v2

    .line 1004
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v2

    .line 1008
    invoke-static {v2}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 1009
    .line 1010
    .line 1011
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->newBuilder()Lcom/zykj/board/h0;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v2

    .line 1015
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getFileName()Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v5

    .line 1019
    invoke-virtual {v2, v5}, Lcom/zykj/board/h0;->i(Ljava/lang/String;)V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getValidate()Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v1

    .line 1026
    invoke-virtual {v2, v1}, Lcom/zykj/board/h0;->j(Ljava/lang/String;)V

    .line 1027
    .line 1028
    .line 1029
    iget-object v1, v0, Lcom/zykj/board/f0;->o:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 1030
    .line 1031
    if-nez v1, :cond_13

    .line 1032
    .line 1033
    invoke-virtual {v0}, Lcom/zykj/board/f0;->i()V

    .line 1034
    .line 1035
    .line 1036
    iget-object v1, v0, Lcom/zykj/board/f0;->n:Ljava/util/List;

    .line 1037
    .line 1038
    invoke-virtual {v2}, Lcom/zykj/board/h0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v2

    .line 1042
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 1046
    .line 1047
    .line 1048
    goto :goto_6

    .line 1049
    :cond_13
    invoke-virtual {v2}, Lcom/zykj/board/h0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v2

    .line 1053
    invoke-virtual {v1, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 1054
    .line 1055
    .line 1056
    goto/16 :goto_6

    .line 1057
    .line 1058
    :cond_14
    sget-object p1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 1059
    .line 1060
    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v0}, Lcom/zykj/board/f0;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->isInitialized()Z

    .line 1068
    .line 1069
    .line 1070
    move-result v1

    .line 1071
    if-eqz v1, :cond_15

    .line 1072
    .line 1073
    const-string v1, "router.bin"

    .line 1074
    .line 1075
    invoke-virtual {p1, p2, v1, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 1076
    .line 1077
    .line 1078
    return-void

    .line 1079
    :cond_15
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    .line 1080
    .line 1081
    .line 1082
    move-result-object p1

    .line 1083
    throw p1
.end method

.method public final saveText(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$TextSource;->newBuilder()Lcom/zykj/board/r0;

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
    if-eqz v2, :cond_2

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
    invoke-static {}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->newBuilder()Lcom/zykj/board/t0;

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
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iput-object v4, v3, Lcom/zykj/board/t0;->b:Ljava/lang/Object;

    .line 50
    .line 51
    iget v4, v3, Lcom/zykj/board/t0;->a:I

    .line 52
    .line 53
    or-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    iput v4, v3, Lcom/zykj/board/t0;->a:I

    .line 56
    .line 57
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->newBuilder()Lb4/p0;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getColor()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v4, v5}, Lb4/p0;->i(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getWidth()F

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-virtual {v4, v5}, Lb4/p0;->n(F)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getTextSize()F

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-virtual {v4, v5}, Lb4/p0;->m(F)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getStyle()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {v4, v2}, Lb4/p0;->l(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4}, Lb4/p0;->c()Lcom/zykj/board/EzyPaint$Paint;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    iget-object v4, v3, Lcom/zykj/board/t0;->d:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 97
    .line 98
    if-nez v4, :cond_0

    .line 99
    .line 100
    iput-object v2, v3, Lcom/zykj/board/t0;->c:Lcom/zykj/board/EzyPaint$Paint;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_0
    invoke-virtual {v4, v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 104
    .line 105
    .line 106
    :goto_1
    iget v2, v3, Lcom/zykj/board/t0;->a:I

    .line 107
    .line 108
    or-int/lit8 v2, v2, 0x2

    .line 109
    .line 110
    iput v2, v3, Lcom/zykj/board/t0;->a:I

    .line 111
    .line 112
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 113
    .line 114
    .line 115
    iget-object v2, v0, Lcom/zykj/board/r0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 116
    .line 117
    if-nez v2, :cond_1

    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/zykj/board/r0;->f()V

    .line 120
    .line 121
    .line 122
    iget-object v2, v0, Lcom/zykj/board/r0;->b:Ljava/util/List;

    .line 123
    .line 124
    invoke-virtual {v3}, Lcom/zykj/board/t0;->c()Lcom/zykj/board/EzySource$TextSource$TextInfo;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_1
    invoke-virtual {v3}, Lcom/zykj/board/t0;->c()Lcom/zykj/board/EzySource$TextSource$TextInfo;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v2, v3}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_2
    iget-object v1, v0, Lcom/zykj/board/r0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 144
    .line 145
    if-nez v1, :cond_3

    .line 146
    .line 147
    iget-object v1, v0, Lcom/zykj/board/r0;->b:Ljava/util/List;

    .line 148
    .line 149
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    goto :goto_2

    .line 154
    :cond_3
    invoke-virtual {v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getCount()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    :goto_2
    if-lez v1, :cond_6

    .line 159
    .line 160
    sget-object v1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 161
    .line 162
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getFileName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v0}, Lcom/zykj/board/r0;->c()Lcom/zykj/board/EzySource$TextSource;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TextSource;->isInitialized()Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_5

    .line 175
    .line 176
    invoke-virtual {v1, p1, v2, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    if-eqz p1, :cond_4

    .line 181
    .line 182
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 183
    .line 184
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->SHA256:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 185
    .line 186
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    if-eqz p1, :cond_4

    .line 191
    .line 192
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->setValidate(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    :cond_4
    return-void

    .line 196
    :cond_5
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    throw p1

    .line 201
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    const-string v0, "[SourceSave]: saveText-> ["

    .line 204
    .line 205
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getFileName()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string p2, "]textInfoCount==0"

    .line 216
    .line 217
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    return-void
.end method

.method public final saveTouch(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/board/EzySource$TouchSource;->newBuilder()Lcom/zykj/board/u0;

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
    if-eqz v2, :cond_4

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
    invoke-static {}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->newBuilder()Lcom/zykj/board/w0;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->newBuilder()Lb4/p0;

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
    invoke-virtual {v4, v5}, Lb4/p0;->n(F)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getColor()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-virtual {v4, v5}, Lb4/p0;->i(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getSpacing()F

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    invoke-virtual {v4, v5}, Lb4/p0;->k(F)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getItemLength()F

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v4, v5}, Lb4/p0;->j(F)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getStyle()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-virtual {v4, v5}, Lb4/p0;->l(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getTextSize()F

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-virtual {v4, v5}, Lb4/p0;->m(F)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Lb4/p0;->c()Lcom/zykj/board/EzyPaint$Paint;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    iget-object v5, v3, Lcom/zykj/board/w0;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 90
    .line 91
    if-nez v5, :cond_0

    .line 92
    .line 93
    iput-object v4, v3, Lcom/zykj/board/w0;->d:Lcom/zykj/board/EzyPaint$Paint;

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_0
    invoke-virtual {v5, v4}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 97
    .line 98
    .line 99
    :goto_1
    iget v4, v3, Lcom/zykj/board/w0;->a:I

    .line 100
    .line 101
    or-int/lit8 v4, v4, 0x2

    .line 102
    .line 103
    iput v4, v3, Lcom/zykj/board/w0;->a:I

    .line 104
    .line 105
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getTouchInfoList()Lio/objectbox/relation/ToMany;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_2

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 127
    .line 128
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->newBuilder()Lcom/zykj/board/x0;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->getX()F

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    invoke-virtual {v5, v6}, Lcom/zykj/board/x0;->j(F)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->getY()F

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    invoke-virtual {v5, v6}, Lcom/zykj/board/x0;->k(F)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->getEventTime()J

    .line 147
    .line 148
    .line 149
    move-result-wide v6

    .line 150
    invoke-virtual {v5, v6, v7}, Lcom/zykj/board/x0;->i(J)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5}, Lcom/zykj/board/x0;->c()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    iget-object v5, v3, Lcom/zykj/board/w0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 158
    .line 159
    if-nez v5, :cond_1

    .line 160
    .line 161
    invoke-virtual {v3}, Lcom/zykj/board/w0;->ensureTouchEventIsMutable()V

    .line 162
    .line 163
    .line 164
    iget-object v5, v3, Lcom/zykj/board/w0;->b:Ljava/util/List;

    .line 165
    .line 166
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_1
    invoke-virtual {v5, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_2
    iget-object v2, v0, Lcom/zykj/board/u0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 178
    .line 179
    if-nez v2, :cond_3

    .line 180
    .line 181
    invoke-virtual {v0}, Lcom/zykj/board/u0;->f()V

    .line 182
    .line 183
    .line 184
    iget-object v2, v0, Lcom/zykj/board/u0;->b:Ljava/util/List;

    .line 185
    .line 186
    invoke-virtual {v3}, Lcom/zykj/board/w0;->c()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 194
    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_3
    invoke-virtual {v3}, Lcom/zykj/board/w0;->c()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-virtual {v2, v3}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 203
    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_4
    iget-object v1, v0, Lcom/zykj/board/u0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 208
    .line 209
    if-nez v1, :cond_5

    .line 210
    .line 211
    iget-object v1, v0, Lcom/zykj/board/u0;->b:Ljava/util/List;

    .line 212
    .line 213
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    goto :goto_3

    .line 218
    :cond_5
    invoke-virtual {v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getCount()I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    :goto_3
    if-lez v1, :cond_8

    .line 223
    .line 224
    sget-object v1, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 225
    .line 226
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getFileName()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-virtual {v0}, Lcom/zykj/board/u0;->c()Lcom/zykj/board/EzySource$TouchSource;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource;->isInitialized()Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-eqz v3, :cond_7

    .line 239
    .line 240
    invoke-virtual {v1, p1, v2, v0}, Lcom/zykj/blackboard/utils/FileUtils;->saveToFile(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    if-eqz p1, :cond_6

    .line 245
    .line 246
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 247
    .line 248
    sget-object v1, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->SHA256:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 249
    .line 250
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    if-eqz p1, :cond_6

    .line 255
    .line 256
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->setValidate(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    :cond_6
    return-void

    .line 260
    :cond_7
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    throw p1

    .line 265
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    const-string v0, "[SourceSave]: saveTouch-> ["

    .line 268
    .line 269
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getFileName()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    const-string p2, "]touchInfoCount==0"

    .line 280
    .line 281
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    return-void
.end method
