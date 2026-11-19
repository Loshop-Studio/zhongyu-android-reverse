# RE note 按头部版本选择动作解析器，兼容 V1 的 Any 列表。
.class public final Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/core/data/VersionParseFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J7\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ+\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000e0 2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008!\u0010\"R\u0016\u0010#\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;",
        "",
        "<init>",
        "()V",
        "Lcom/google/protobuf/CodedInputStream;",
        "input",
        "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;",
        "parseDrawBoardData",
        "(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;",
        "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;",
        "drawBoard",
        "Ld6/s;",
        "parseBody",
        "(Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;Lcom/google/protobuf/CodedInputStream;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
        "parseActionContent",
        "(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
        "",
        "scale",
        "",
        "centerX",
        "centerY",
        "px",
        "py",
        "Landroid/graphics/Matrix;",
        "getFilterMatrix",
        "(FIIII)Landroid/graphics/Matrix;",
        "versionCode",
        "",
        "path",
        "Lcom/zykj/sketch/EzyDrawBoard$BoardBody;",
        "body",
        "",
        "parse",
        "(ILjava/lang/String;Lcom/zykj/sketch/EzyDrawBoard$BoardBody;)Ljava/util/List;",
        "flag",
        "I",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;-><init>()V

    return-void
.end method

.method private final getFilterMatrix(FIIII)Landroid/graphics/Matrix;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    int-to-float p2, p2

    .line 7
    int-to-float p3, p3

    .line 8
    invoke-virtual {v0, p1, p1, p2, p3}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 9
    .line 10
    .line 11
    int-to-float p1, p4

    .line 12
    int-to-float p2, p5

    .line 13
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method private final parseActionContent(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 8

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/google/protobuf/ExtensionRegistry;->newInstance()Lcom/google/protobuf/ExtensionRegistry;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lcom/zykj/sketch/EzyDrawBoard;->registerAllExtensions(Lcom/google/protobuf/ExtensionRegistry;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    move-object v4, v3

    .line 15
    :cond_0
    :goto_0
    if-nez v2, :cond_9

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const/4 v6, 0x1

    .line 22
    if-eqz v5, :cond_8

    .line 23
    .line 24
    const/16 v7, 0x8

    .line 25
    .line 26
    if-eq v5, v7, :cond_7

    .line 27
    .line 28
    const/16 v7, 0x12

    .line 29
    .line 30
    if-eq v5, v7, :cond_6

    .line 31
    .line 32
    const/16 v7, 0x1a

    .line 33
    .line 34
    if-eq v5, v7, :cond_2

    .line 35
    .line 36
    const/16 v6, 0x2a

    .line 37
    .line 38
    if-eq v5, v6, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->parser()Lcom/google/protobuf/Parser;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {p1, v5, v1}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 50
    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v5}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setResetData(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-static {}, Lcom/zykj/sketch/core/data/VersionParseFactory;->access$getFlag$cp()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_5

    .line 62
    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    invoke-virtual {v4}, Lcom/google/protobuf/Any;->getTypeUrl()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move-object v5, v3

    .line 71
    :goto_1
    const-string v7, "type.googleapis.com/ActionTouchEvent"

    .line 72
    .line 73
    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_5

    .line 78
    .line 79
    invoke-static {}, Lcom/zykj/sketch/core/data/VersionParseFactory;->access$getFlag$cp()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    const/16 v7, 0x32

    .line 84
    .line 85
    if-ne v5, v7, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readByteArray()[B

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    :goto_2
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->parser()Lcom/google/protobuf/Parser;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {p1, v5, v1}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    check-cast v5, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 101
    .line 102
    invoke-virtual {v0, v5}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setGraphSnapshot(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 103
    .line 104
    .line 105
    :goto_3
    invoke-static {}, Lcom/zykj/sketch/core/data/VersionParseFactory;->access$getFlag$cp()I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    add-int/2addr v5, v6

    .line 110
    invoke-static {v5}, Lcom/zykj/sketch/core/data/VersionParseFactory;->access$setFlag$cp(I)V

    .line 111
    .line 112
    .line 113
    invoke-static {}, Lcom/zykj/sketch/core/data/VersionParseFactory;->access$getFlag$cp()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    const/16 v7, 0x33

    .line 118
    .line 119
    if-ne v5, v7, :cond_0

    .line 120
    .line 121
    invoke-static {v6}, Lcom/zykj/sketch/core/data/VersionParseFactory;->access$setFlag$cp(I)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_6
    invoke-static {}, Lcom/google/protobuf/Any;->parser()Lcom/google/protobuf/Parser;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-virtual {p1, v4, v1}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, Lcom/google/protobuf/Any;

    .line 134
    .line 135
    if-eqz v4, :cond_0

    .line 136
    .line 137
    invoke-virtual {v0, v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setAction(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readEnum()I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    invoke-static {v5}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->forNumber(I)Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-virtual {v0, v5}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setType(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 150
    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :cond_8
    move v2, v6

    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_9
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    const-string v0, "newBuilder.build()"

    .line 162
    .line 163
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-object p1
.end method

.method private final parseBody(Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;Lcom/google/protobuf/CodedInputStream;)V
    .locals 5

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-nez v2, :cond_2

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    const/16 v4, 0xa

    .line 20
    .line 21
    if-eq v3, v4, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readByteArray()[B

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v3}, Lcom/google/protobuf/CodedInputStream;->newInstance([B)Lcom/google/protobuf/CodedInputStream;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "newInstance(input.readByteArray())"

    .line 33
    .line 34
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v3}, Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;->parseActionContent(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v2, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;->addAllActionContent(Ljava/lang/Iterable;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;->setBoardBody(Lcom/zykj/sketch/EzyDrawBoard$BoardBody;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method private final parseDrawBoardData(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;
    .locals 4

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-nez v1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    const/16 v3, 0xa

    .line 15
    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    const/16 v3, 0x12

    .line 19
    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string v2, "newBuilder"

    .line 24
    .line 25
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readByteArray()[B

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, Lcom/google/protobuf/CodedInputStream;->newInstance([B)Lcom/google/protobuf/CodedInputStream;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "newInstance(input.readByteArray())"

    .line 37
    .line 38
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, v0, v2}, Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;->parseBody(Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;Lcom/google/protobuf/CodedInputStream;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readByteArray()[B

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v1, 0x1

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v0, "newBuilder.build()"

    .line 56
    .line 57
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object p1
.end method


# virtual methods
.method public final parse(ILjava/lang/String;Lcom/zykj/sketch/EzyDrawBoard$BoardBody;)Ljava/util/List;
    .locals 17
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/sketch/EzyDrawBoard$BoardBody;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lcom/zykj/sketch/EzyDrawBoard$BoardBody;",
            ")",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "path"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "body"

    .line 11
    .line 12
    move-object/from16 v3, p3

    .line 13
    .line 14
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const-string v4, "actions.bin"

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    if-eq v0, v5, :cond_6

    .line 22
    .line 23
    const-string v6, "{\n                    Ez\u2026entList\n                }"

    .line 24
    .line 25
    if-eq v0, v3, :cond_5

    .line 26
    .line 27
    const/4 v3, 0x3

    .line 28
    if-eq v0, v3, :cond_1

    .line 29
    .line 30
    const/4 v3, 0x4

    .line 31
    if-eq v0, v3, :cond_1

    .line 32
    .line 33
    const/4 v2, 0x5

    .line 34
    if-eq v0, v2, :cond_0

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_0
    new-instance v0, Ljava/io/FileInputStream;

    .line 43
    .line 44
    new-instance v2, Ljava/io/File;

    .line 45
    .line 46
    invoke-direct {v2, v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->parseFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->getBoardBody()Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->getActionContentList()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_1
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    .line 69
    .line 70
    new-instance v3, Ljava/io/File;

    .line 71
    .line 72
    invoke-direct {v3, v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {v0, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->parseFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->getBoardBody()Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->getActionContentList()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v3, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    const/4 v2, 0x0

    .line 100
    :goto_0
    if-ge v2, v6, :cond_4

    .line 101
    .line 102
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    check-cast v7, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 107
    .line 108
    rem-int/lit8 v8, v2, 0x32

    .line 109
    .line 110
    if-eqz v8, :cond_3

    .line 111
    .line 112
    invoke-virtual {v7}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    sget-object v9, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 117
    .line 118
    if-ne v8, v9, :cond_3

    .line 119
    .line 120
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    sub-int/2addr v8, v5

    .line 125
    if-ne v2, v8, :cond_2

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-virtual {v7}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    invoke-virtual {v8, v9}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setType(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v7}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    invoke-virtual {v8, v9}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setAction(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v7}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-virtual {v8, v7}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setResetData(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_3
    :goto_1
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    .line 163
    .line 164
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_4
    return-object v3

    .line 168
    :catch_0
    new-instance v0, Ljava/io/FileInputStream;

    .line 169
    .line 170
    new-instance v2, Ljava/io/File;

    .line 171
    .line 172
    invoke-direct {v2, v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->parseFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->getBoardBody()Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->getActionContentList()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    const-string v1, "{\n                    tr\u2026      }\n                }"

    .line 191
    .line 192
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    return-object v0

    .line 196
    :cond_5
    new-instance v0, Ljava/io/FileInputStream;

    .line 197
    .line 198
    new-instance v2, Ljava/io/File;

    .line 199
    .line 200
    invoke-direct {v2, v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->parseFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->getBoardBody()Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->getActionContentList()Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    return-object v0

    .line 222
    :cond_6
    new-instance v0, Ljava/io/FileInputStream;

    .line 223
    .line 224
    new-instance v6, Ljava/io/File;

    .line 225
    .line 226
    invoke-direct {v6, v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-direct {v0, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoardV1;->parseFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoardV1;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    const-string v1, "parseFrom(FileInputStrea\u2026ile(path,\"actions.bin\")))"

    .line 237
    .line 238
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    new-instance v1, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoardV1;->getBoardBodyV1()Lcom/zykj/sketch/EzyDrawBoard$BoardBodyV1;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBodyV1;->getActionContentList()Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    const-string v4, "data.boardBodyV1.actionContentList"

    .line 255
    .line 256
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-eqz v4, :cond_1b

    .line 268
    .line 269
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    check-cast v4, Lcom/google/protobuf/Any;

    .line 274
    .line 275
    invoke-virtual {v4}, Lcom/google/protobuf/Any;->getTypeUrl()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    if-eqz v6, :cond_11

    .line 280
    .line 281
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 282
    .line 283
    .line 284
    move-result v7

    .line 285
    sparse-switch v7, :sswitch_data_0

    .line 286
    .line 287
    .line 288
    goto/16 :goto_4

    .line 289
    .line 290
    :sswitch_0
    const-string v7, "type.googleapis.com/ActionImageConfig"

    .line 291
    .line 292
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v6

    .line 296
    if-nez v6, :cond_8

    .line 297
    .line 298
    goto/16 :goto_4

    .line 299
    .line 300
    :cond_8
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_IMAGE:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 301
    .line 302
    goto/16 :goto_5

    .line 303
    .line 304
    :sswitch_1
    const-string v7, "type.googleapis.com/ActionModeConfig"

    .line 305
    .line 306
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    if-nez v6, :cond_9

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_9
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_MODE:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 314
    .line 315
    goto :goto_5

    .line 316
    :sswitch_2
    const-string v7, "type.googleapis.com/ActionGraphConfig"

    .line 317
    .line 318
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v6

    .line 322
    if-nez v6, :cond_a

    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_a
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_GRAPH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 326
    .line 327
    goto :goto_5

    .line 328
    :sswitch_3
    const-string v7, "type.googleapis.com/ActionWebViewConfig"

    .line 329
    .line 330
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v6

    .line 334
    if-nez v6, :cond_b

    .line 335
    .line 336
    goto :goto_4

    .line 337
    :cond_b
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_WEB:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 338
    .line 339
    goto :goto_5

    .line 340
    :sswitch_4
    const-string v7, "type.googleapis.com/ActionClearBoard"

    .line 341
    .line 342
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v6

    .line 346
    if-nez v6, :cond_c

    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_c
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_CLEAR_BOARD:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 350
    .line 351
    goto :goto_5

    .line 352
    :sswitch_5
    const-string v7, "type.googleapis.com/ActionFitterConfig"

    .line 353
    .line 354
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v6

    .line 358
    if-nez v6, :cond_d

    .line 359
    .line 360
    goto :goto_4

    .line 361
    :cond_d
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_FILTER:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 362
    .line 363
    goto :goto_5

    .line 364
    :sswitch_6
    const-string v7, "type.googleapis.com/ActionPrevAction"

    .line 365
    .line 366
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v6

    .line 370
    if-nez v6, :cond_e

    .line 371
    .line 372
    goto :goto_4

    .line 373
    :cond_e
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_PREV:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 374
    .line 375
    goto :goto_5

    .line 376
    :sswitch_7
    const-string v7, "type.googleapis.com/ActionTouchEvent"

    .line 377
    .line 378
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v6

    .line 382
    if-nez v6, :cond_f

    .line 383
    .line 384
    goto :goto_4

    .line 385
    :cond_f
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 386
    .line 387
    goto :goto_5

    .line 388
    :sswitch_8
    const-string v7, "type.googleapis.com/ActionNextAction"

    .line 389
    .line 390
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v6

    .line 394
    if-nez v6, :cond_10

    .line 395
    .line 396
    goto :goto_4

    .line 397
    :cond_10
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_NEXT:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 398
    .line 399
    goto :goto_5

    .line 400
    :cond_11
    :goto_4
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 401
    .line 402
    :goto_5
    sget-object v7, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_FILTER:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 403
    .line 404
    if-ne v6, v7, :cond_1a

    .line 405
    .line 406
    const-class v6, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig;

    .line 407
    .line 408
    invoke-virtual {v4, v6}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    check-cast v4, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig;

    .line 413
    .line 414
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig$Builder;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    const-string v6, "it.unpack(EzyDrawBoard.A\u2026::class.java).toBuilder()"

    .line 419
    .line 420
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    sget-object v7, Lcom/zykj/sketch/core/data/VersionParseFactory;->Companion:Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;

    .line 424
    .line 425
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig$Builder;->getScale()F

    .line 426
    .line 427
    .line 428
    move-result v8

    .line 429
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig$Builder;->getCenterX()I

    .line 430
    .line 431
    .line 432
    move-result v9

    .line 433
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig$Builder;->getCenterY()I

    .line 434
    .line 435
    .line 436
    move-result v10

    .line 437
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig$Builder;->getPx()I

    .line 438
    .line 439
    .line 440
    move-result v11

    .line 441
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig$Builder;->getPy()I

    .line 442
    .line 443
    .line 444
    move-result v12

    .line 445
    invoke-direct/range {v7 .. v12}, Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;->getFilterMatrix(FIIII)Landroid/graphics/Matrix;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 450
    .line 451
    .line 452
    move-result v6

    .line 453
    const/4 v7, 0x0

    .line 454
    :cond_12
    :goto_6
    if-ge v7, v6, :cond_7

    .line 455
    .line 456
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v8

    .line 460
    add-int/lit8 v7, v7, 0x1

    .line 461
    .line 462
    check-cast v8, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 463
    .line 464
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 465
    .line 466
    .line 467
    move-result-object v9

    .line 468
    const-string v10, "item.toBuilder()"

    .line 469
    .line 470
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 474
    .line 475
    .line 476
    move-result-object v10

    .line 477
    sget-object v11, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 478
    .line 479
    if-ne v10, v11, :cond_12

    .line 480
    .line 481
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 482
    .line 483
    .line 484
    move-result-object v8

    .line 485
    const-class v10, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;

    .line 486
    .line 487
    invoke-virtual {v8, v10}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 488
    .line 489
    .line 490
    move-result-object v8

    .line 491
    check-cast v8, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;

    .line 492
    .line 493
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$Builder;

    .line 494
    .line 495
    .line 496
    move-result-object v8

    .line 497
    const-string v10, "item.action.unpack(EzyDr\u2026             .toBuilder()"

    .line 498
    .line 499
    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$Builder;->getTouchEventBuilderList()Ljava/util/List;

    .line 503
    .line 504
    .line 505
    move-result-object v10

    .line 506
    const-string v11, "action.touchEventBuilderList"

    .line 507
    .line 508
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 512
    .line 513
    .line 514
    move-result-object v10

    .line 515
    :cond_13
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 516
    .line 517
    .line 518
    move-result v11

    .line 519
    if-eqz v11, :cond_19

    .line 520
    .line 521
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v11

    .line 525
    check-cast v11, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 526
    .line 527
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerCount()I

    .line 528
    .line 529
    .line 530
    move-result v12

    .line 531
    if-eq v12, v5, :cond_18

    .line 532
    .line 533
    if-eq v12, v3, :cond_14

    .line 534
    .line 535
    goto :goto_7

    .line 536
    :cond_14
    new-instance v12, Landroid/graphics/PointF;

    .line 537
    .line 538
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getX()F

    .line 539
    .line 540
    .line 541
    move-result v13

    .line 542
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getY()F

    .line 543
    .line 544
    .line 545
    move-result v14

    .line 546
    invoke-direct {v12, v13, v14}, Landroid/graphics/PointF;-><init>(FF)V

    .line 547
    .line 548
    .line 549
    invoke-static {v4, v12}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 550
    .line 551
    .line 552
    move-result-object v12

    .line 553
    iget v13, v12, Landroid/graphics/PointF;->x:F

    .line 554
    .line 555
    invoke-virtual {v11, v13}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 556
    .line 557
    .line 558
    iget v13, v12, Landroid/graphics/PointF;->y:F

    .line 559
    .line 560
    invoke-virtual {v11, v13}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerCoordsBuilderList()Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v13

    .line 567
    const-string v14, "this.pointerCoordsBuilderList"

    .line 568
    .line 569
    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 573
    .line 574
    .line 575
    move-result-object v13

    .line 576
    const/4 v14, 0x0

    .line 577
    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 578
    .line 579
    .line 580
    move-result v15

    .line 581
    if-eqz v15, :cond_13

    .line 582
    .line 583
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v15

    .line 587
    add-int/lit8 v16, v14, 0x1

    .line 588
    .line 589
    if-ltz v14, :cond_17

    .line 590
    .line 591
    check-cast v15, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;

    .line 592
    .line 593
    if-eq v14, v5, :cond_16

    .line 594
    .line 595
    if-eq v14, v3, :cond_15

    .line 596
    .line 597
    goto :goto_9

    .line 598
    :cond_15
    new-instance v12, Landroid/graphics/PointF;

    .line 599
    .line 600
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getX()F

    .line 601
    .line 602
    .line 603
    move-result v14

    .line 604
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getY()F

    .line 605
    .line 606
    .line 607
    move-result v2

    .line 608
    invoke-direct {v12, v14, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 609
    .line 610
    .line 611
    invoke-static {v4, v12}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    iget v12, v2, Landroid/graphics/PointF;->x:F

    .line 616
    .line 617
    invoke-virtual {v15, v12}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;->setX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;

    .line 618
    .line 619
    .line 620
    iget v12, v2, Landroid/graphics/PointF;->x:F

    .line 621
    .line 622
    invoke-virtual {v15, v12}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;->setY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;

    .line 623
    .line 624
    .line 625
    move-object v12, v2

    .line 626
    goto :goto_9

    .line 627
    :cond_16
    iget v2, v12, Landroid/graphics/PointF;->x:F

    .line 628
    .line 629
    invoke-virtual {v15, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;->setX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;

    .line 630
    .line 631
    .line 632
    iget v2, v12, Landroid/graphics/PointF;->x:F

    .line 633
    .line 634
    invoke-virtual {v15, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;->setY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;

    .line 635
    .line 636
    .line 637
    :goto_9
    move/from16 v14, v16

    .line 638
    .line 639
    goto :goto_8

    .line 640
    :cond_17
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 641
    .line 642
    .line 643
    const/4 v0, 0x0

    .line 644
    throw v0

    .line 645
    :cond_18
    new-instance v2, Landroid/graphics/PointF;

    .line 646
    .line 647
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getX()F

    .line 648
    .line 649
    .line 650
    move-result v12

    .line 651
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getY()F

    .line 652
    .line 653
    .line 654
    move-result v13

    .line 655
    invoke-direct {v2, v12, v13}, Landroid/graphics/PointF;-><init>(FF)V

    .line 656
    .line 657
    .line 658
    invoke-static {v4, v2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    iget v12, v2, Landroid/graphics/PointF;->x:F

    .line 663
    .line 664
    invoke-virtual {v11, v12}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 665
    .line 666
    .line 667
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 668
    .line 669
    invoke-virtual {v11, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 670
    .line 671
    .line 672
    goto/16 :goto_7

    .line 673
    .line 674
    :cond_19
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    invoke-static {v2}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    invoke-virtual {v9, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setAction(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 683
    .line 684
    .line 685
    goto/16 :goto_6

    .line 686
    .line 687
    :cond_1a
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    invoke-virtual {v2, v6}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setType(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 692
    .line 693
    .line 694
    move-result-object v2

    .line 695
    invoke-virtual {v2, v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setAction(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    const-string v4, "newBuilder()\n           \u2026                 .build()"

    .line 704
    .line 705
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 709
    .line 710
    .line 711
    goto/16 :goto_3

    .line 712
    .line 713
    :cond_1b
    return-object v1

    .line 714
    nop

    .line 715
    :sswitch_data_0
    .sparse-switch
        -0x281d24cb -> :sswitch_8
        -0x1dbe8539 -> :sswitch_7
        -0x3fa7d8b -> :sswitch_6
        0x115716fe -> :sswitch_5
        0x159758c5 -> :sswitch_4
        0x372bc10f -> :sswitch_3
        0x607b5b84 -> :sswitch_2
        0x7b40caf1 -> :sswitch_1
        0x7f3845d1 -> :sswitch_0
    .end sparse-switch
.end method
