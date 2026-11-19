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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
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
    invoke-static {v5, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object p1
.end method


# virtual methods
.method public final parse(ILjava/lang/String;Lcom/zykj/sketch/EzyDrawBoard$BoardBody;)Ljava/util/List;
    .locals 17
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
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "body"

    .line 11
    .line 12
    move-object/from16 v3, p3

    .line 13
    .line 14
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    check-cast v0, Ljava/lang/Iterable;

    .line 260
    .line 261
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    if-eqz v4, :cond_1b

    .line 270
    .line 271
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    check-cast v4, Lcom/google/protobuf/Any;

    .line 276
    .line 277
    invoke-virtual {v4}, Lcom/google/protobuf/Any;->getTypeUrl()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    if-eqz v6, :cond_11

    .line 282
    .line 283
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 284
    .line 285
    .line 286
    move-result v7

    .line 287
    sparse-switch v7, :sswitch_data_0

    .line 288
    .line 289
    .line 290
    goto/16 :goto_4

    .line 291
    .line 292
    :sswitch_0
    const-string v7, "type.googleapis.com/ActionImageConfig"

    .line 293
    .line 294
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    if-nez v6, :cond_8

    .line 299
    .line 300
    goto/16 :goto_4

    .line 301
    .line 302
    :cond_8
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_IMAGE:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 303
    .line 304
    goto/16 :goto_5

    .line 305
    .line 306
    :sswitch_1
    const-string v7, "type.googleapis.com/ActionModeConfig"

    .line 307
    .line 308
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v6

    .line 312
    if-nez v6, :cond_9

    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_9
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_MODE:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :sswitch_2
    const-string v7, "type.googleapis.com/ActionGraphConfig"

    .line 319
    .line 320
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v6

    .line 324
    if-nez v6, :cond_a

    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_a
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_GRAPH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 328
    .line 329
    goto :goto_5

    .line 330
    :sswitch_3
    const-string v7, "type.googleapis.com/ActionWebViewConfig"

    .line 331
    .line 332
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    if-nez v6, :cond_b

    .line 337
    .line 338
    goto :goto_4

    .line 339
    :cond_b
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_WEB:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 340
    .line 341
    goto :goto_5

    .line 342
    :sswitch_4
    const-string v7, "type.googleapis.com/ActionClearBoard"

    .line 343
    .line 344
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v6

    .line 348
    if-nez v6, :cond_c

    .line 349
    .line 350
    goto :goto_4

    .line 351
    :cond_c
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_CLEAR_BOARD:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 352
    .line 353
    goto :goto_5

    .line 354
    :sswitch_5
    const-string v7, "type.googleapis.com/ActionFitterConfig"

    .line 355
    .line 356
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v6

    .line 360
    if-nez v6, :cond_d

    .line 361
    .line 362
    goto :goto_4

    .line 363
    :cond_d
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_FILTER:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 364
    .line 365
    goto :goto_5

    .line 366
    :sswitch_6
    const-string v7, "type.googleapis.com/ActionPrevAction"

    .line 367
    .line 368
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v6

    .line 372
    if-nez v6, :cond_e

    .line 373
    .line 374
    goto :goto_4

    .line 375
    :cond_e
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_PREV:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 376
    .line 377
    goto :goto_5

    .line 378
    :sswitch_7
    const-string v7, "type.googleapis.com/ActionTouchEvent"

    .line 379
    .line 380
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v6

    .line 384
    if-nez v6, :cond_f

    .line 385
    .line 386
    goto :goto_4

    .line 387
    :cond_f
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 388
    .line 389
    goto :goto_5

    .line 390
    :sswitch_8
    const-string v7, "type.googleapis.com/ActionNextAction"

    .line 391
    .line 392
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    if-nez v6, :cond_10

    .line 397
    .line 398
    goto :goto_4

    .line 399
    :cond_10
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_NEXT:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 400
    .line 401
    goto :goto_5

    .line 402
    :cond_11
    :goto_4
    sget-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 403
    .line 404
    :goto_5
    sget-object v7, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_FILTER:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 405
    .line 406
    if-ne v6, v7, :cond_1a

    .line 407
    .line 408
    const-class v6, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig;

    .line 409
    .line 410
    invoke-virtual {v4, v6}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    check-cast v4, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig;

    .line 415
    .line 416
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig$Builder;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    const-string v6, "it.unpack(EzyDrawBoard.A\u2026::class.java).toBuilder()"

    .line 421
    .line 422
    invoke-static {v4, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    sget-object v7, Lcom/zykj/sketch/core/data/VersionParseFactory;->Companion:Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;

    .line 426
    .line 427
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig$Builder;->getScale()F

    .line 428
    .line 429
    .line 430
    move-result v8

    .line 431
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig$Builder;->getCenterX()I

    .line 432
    .line 433
    .line 434
    move-result v9

    .line 435
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig$Builder;->getCenterY()I

    .line 436
    .line 437
    .line 438
    move-result v10

    .line 439
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig$Builder;->getPx()I

    .line 440
    .line 441
    .line 442
    move-result v11

    .line 443
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig$Builder;->getPy()I

    .line 444
    .line 445
    .line 446
    move-result v12

    .line 447
    invoke-direct/range {v7 .. v12}, Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;->getFilterMatrix(FIIII)Landroid/graphics/Matrix;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 452
    .line 453
    .line 454
    move-result v6

    .line 455
    const/4 v7, 0x0

    .line 456
    :cond_12
    :goto_6
    if-ge v7, v6, :cond_7

    .line 457
    .line 458
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v8

    .line 462
    add-int/lit8 v7, v7, 0x1

    .line 463
    .line 464
    check-cast v8, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 465
    .line 466
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 467
    .line 468
    .line 469
    move-result-object v9

    .line 470
    const-string v10, "item.toBuilder()"

    .line 471
    .line 472
    invoke-static {v9, v10}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 476
    .line 477
    .line 478
    move-result-object v10

    .line 479
    sget-object v11, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 480
    .line 481
    if-ne v10, v11, :cond_12

    .line 482
    .line 483
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 484
    .line 485
    .line 486
    move-result-object v8

    .line 487
    const-class v10, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;

    .line 488
    .line 489
    invoke-virtual {v8, v10}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 490
    .line 491
    .line 492
    move-result-object v8

    .line 493
    check-cast v8, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;

    .line 494
    .line 495
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$Builder;

    .line 496
    .line 497
    .line 498
    move-result-object v8

    .line 499
    const-string v10, "item.action.unpack(EzyDr\u2026             .toBuilder()"

    .line 500
    .line 501
    invoke-static {v8, v10}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$Builder;->getTouchEventBuilderList()Ljava/util/List;

    .line 505
    .line 506
    .line 507
    move-result-object v10

    .line 508
    const-string v11, "action.touchEventBuilderList"

    .line 509
    .line 510
    invoke-static {v10, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    check-cast v10, Ljava/lang/Iterable;

    .line 514
    .line 515
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 516
    .line 517
    .line 518
    move-result-object v10

    .line 519
    :cond_13
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 520
    .line 521
    .line 522
    move-result v11

    .line 523
    if-eqz v11, :cond_19

    .line 524
    .line 525
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v11

    .line 529
    check-cast v11, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 530
    .line 531
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerCount()I

    .line 532
    .line 533
    .line 534
    move-result v12

    .line 535
    if-eq v12, v5, :cond_18

    .line 536
    .line 537
    if-eq v12, v3, :cond_14

    .line 538
    .line 539
    goto :goto_7

    .line 540
    :cond_14
    new-instance v12, Landroid/graphics/PointF;

    .line 541
    .line 542
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getX()F

    .line 543
    .line 544
    .line 545
    move-result v13

    .line 546
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getY()F

    .line 547
    .line 548
    .line 549
    move-result v14

    .line 550
    invoke-direct {v12, v13, v14}, Landroid/graphics/PointF;-><init>(FF)V

    .line 551
    .line 552
    .line 553
    invoke-static {v4, v12}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 554
    .line 555
    .line 556
    move-result-object v12

    .line 557
    iget v13, v12, Landroid/graphics/PointF;->x:F

    .line 558
    .line 559
    invoke-virtual {v11, v13}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 560
    .line 561
    .line 562
    iget v13, v12, Landroid/graphics/PointF;->y:F

    .line 563
    .line 564
    invoke-virtual {v11, v13}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerCoordsBuilderList()Ljava/util/List;

    .line 568
    .line 569
    .line 570
    move-result-object v13

    .line 571
    const-string v14, "this.pointerCoordsBuilderList"

    .line 572
    .line 573
    invoke-static {v13, v14}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    check-cast v13, Ljava/lang/Iterable;

    .line 577
    .line 578
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 579
    .line 580
    .line 581
    move-result-object v13

    .line 582
    const/4 v14, 0x0

    .line 583
    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 584
    .line 585
    .line 586
    move-result v15

    .line 587
    if-eqz v15, :cond_13

    .line 588
    .line 589
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v15

    .line 593
    add-int/lit8 v16, v14, 0x1

    .line 594
    .line 595
    if-gez v14, :cond_15

    .line 596
    .line 597
    invoke-static {}, Lrc/w;->w()V

    .line 598
    .line 599
    .line 600
    :cond_15
    check-cast v15, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;

    .line 601
    .line 602
    if-eq v14, v5, :cond_17

    .line 603
    .line 604
    if-eq v14, v3, :cond_16

    .line 605
    .line 606
    goto :goto_9

    .line 607
    :cond_16
    new-instance v12, Landroid/graphics/PointF;

    .line 608
    .line 609
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getX()F

    .line 610
    .line 611
    .line 612
    move-result v14

    .line 613
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getY()F

    .line 614
    .line 615
    .line 616
    move-result v2

    .line 617
    invoke-direct {v12, v14, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 618
    .line 619
    .line 620
    invoke-static {v4, v12}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    iget v12, v2, Landroid/graphics/PointF;->x:F

    .line 625
    .line 626
    invoke-virtual {v15, v12}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;->setX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;

    .line 627
    .line 628
    .line 629
    iget v12, v2, Landroid/graphics/PointF;->x:F

    .line 630
    .line 631
    invoke-virtual {v15, v12}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;->setY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;

    .line 632
    .line 633
    .line 634
    move-object v12, v2

    .line 635
    goto :goto_9

    .line 636
    :cond_17
    iget v2, v12, Landroid/graphics/PointF;->x:F

    .line 637
    .line 638
    invoke-virtual {v15, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;->setX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;

    .line 639
    .line 640
    .line 641
    iget v2, v12, Landroid/graphics/PointF;->x:F

    .line 642
    .line 643
    invoke-virtual {v15, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;->setY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;

    .line 644
    .line 645
    .line 646
    :goto_9
    move/from16 v14, v16

    .line 647
    .line 648
    goto :goto_8

    .line 649
    :cond_18
    new-instance v2, Landroid/graphics/PointF;

    .line 650
    .line 651
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getX()F

    .line 652
    .line 653
    .line 654
    move-result v12

    .line 655
    invoke-virtual {v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getY()F

    .line 656
    .line 657
    .line 658
    move-result v13

    .line 659
    invoke-direct {v2, v12, v13}, Landroid/graphics/PointF;-><init>(FF)V

    .line 660
    .line 661
    .line 662
    invoke-static {v4, v2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    iget v12, v2, Landroid/graphics/PointF;->x:F

    .line 667
    .line 668
    invoke-virtual {v11, v12}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 669
    .line 670
    .line 671
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 672
    .line 673
    invoke-virtual {v11, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 674
    .line 675
    .line 676
    goto/16 :goto_7

    .line 677
    .line 678
    :cond_19
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    invoke-static {v2}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    invoke-virtual {v9, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setAction(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 687
    .line 688
    .line 689
    goto/16 :goto_6

    .line 690
    .line 691
    :cond_1a
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 692
    .line 693
    .line 694
    move-result-object v2

    .line 695
    invoke-virtual {v2, v6}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setType(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    invoke-virtual {v2, v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setAction(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    const-string v4, "newBuilder()\n           \u2026                 .build()"

    .line 708
    .line 709
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    goto/16 :goto_3

    .line 716
    .line 717
    :cond_1b
    return-object v1

    .line 718
    nop

    .line 719
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
