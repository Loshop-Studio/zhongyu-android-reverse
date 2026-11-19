# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/EzyDrawBoard$GraphResetDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "GraphResetData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;,
        Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;,
        Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactoryOrBuilder;
    }
.end annotation


# static fields
.field public static final ACTION_FIELD_NUMBER:I = 0x5

.field public static final BACKGROUNDCOLOR_FIELD_NUMBER:I = 0x8

.field private static final DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

.field public static final DRAWAREA_FIELD_NUMBER:I = 0x9

.field public static final FACTORYACTIONGRAPHNAME_FIELD_NUMBER:I = 0x2

.field public static final FACTORYGRAPHNAME_FIELD_NUMBER:I = 0x1

.field public static final GRAPHCONFIG_FIELD_NUMBER:I = 0x6

.field public static final MODECONFIG_FIELD_NUMBER:I = 0x7

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J


# instance fields
.field private action_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

.field private backgroundColor_:I

.field private drawArea_:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

.field private volatile factoryActionGraphName_:Ljava/lang/Object;

.field private volatile factoryGraphName_:Ljava/lang/Object;

.field private graphConfig_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

.field private memoizedIsInitialized:B

.field private modeConfig_:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->PARSER:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->memoizedIsInitialized:B

    .line 7
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryGraphName_:Ljava/lang/Object;

    .line 8
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryActionGraphName_:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->modeConfig_:I

    .line 10
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->backgroundColor_:I

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 11
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;-><init>()V

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_c

    .line 12
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/16 v3, 0xa

    if-eq v1, v3, :cond_b

    const/16 v3, 0x12

    if-eq v1, v3, :cond_a

    const/16 v3, 0x2a

    const/4 v4, 0x0

    if-eq v1, v3, :cond_8

    const/16 v3, 0x32

    if-eq v1, v3, :cond_6

    const/16 v3, 0x38

    if-eq v1, v3, :cond_5

    const/16 v3, 0x40

    if-eq v1, v3, :cond_4

    const/16 v3, 0x4a

    if-eq v1, v3, :cond_2

    .line 13
    invoke-virtual {p1, v1}, Lcom/google/protobuf/CodedInputStream;->skipField(I)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    move v0, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_2

    .line 14
    :cond_2
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->drawArea_:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    if-eqz v1, :cond_3

    .line 15
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v4

    .line 16
    :cond_3
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->parser()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->drawArea_:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    if-eqz v4, :cond_0

    .line 17
    invoke-virtual {v4, v1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    .line 18
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->drawArea_:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    goto :goto_0

    .line 19
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v1

    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->backgroundColor_:I

    goto :goto_0

    .line 20
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readEnum()I

    move-result v1

    .line 21
    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->modeConfig_:I

    goto :goto_0

    .line 22
    :cond_6
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->graphConfig_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    if-eqz v1, :cond_7

    .line 23
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;

    move-result-object v4

    .line 24
    :cond_7
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->parser()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->graphConfig_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    if-eqz v4, :cond_0

    .line 25
    invoke-virtual {v4, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;

    .line 26
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->graphConfig_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    goto/16 :goto_0

    .line 27
    :cond_8
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->action_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    if-eqz v1, :cond_9

    .line 28
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory$Builder;

    move-result-object v4

    .line 29
    :cond_9
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;->parser()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->action_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    if-eqz v4, :cond_0

    .line 30
    invoke-virtual {v4, v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory$Builder;

    .line 31
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->action_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    goto/16 :goto_0

    .line 32
    :cond_a
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object v1

    .line 33
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryActionGraphName_:Ljava/lang/Object;

    goto/16 :goto_0

    .line 34
    :cond_b
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object v1

    .line 35
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryGraphName_:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 36
    :goto_1
    :try_start_1
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 37
    invoke-virtual {p2, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 38
    :goto_2
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    :goto_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->makeExtensionsImmutable()V

    .line 40
    throw p1

    .line 41
    :cond_c
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->makeExtensionsImmutable()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/GeneratedMessageV3$Builder<",
            "*>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, -0x1

    .line 4
    iput-byte p1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic access$33000()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$33200(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryGraphName_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$33202(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryGraphName_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$33300(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryActionGraphName_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$33302(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryActionGraphName_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$33402(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->action_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$33502(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->graphConfig_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$33600(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->modeConfig_:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$33602(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->modeConfig_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$33702(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->backgroundColor_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$33802(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->drawArea_:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$33900()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$34000(Lcom/google/protobuf/ByteString;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$34100(Lcom/google/protobuf/ByteString;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$31300()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->PARSER:Lcom/google/protobuf/Parser;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->PARSER:Lcom/google/protobuf/Parser;

    .line 10
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->PARSER:Lcom/google/protobuf/Parser;

    .line 12
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->PARSER:Lcom/google/protobuf/Parser;

    .line 6
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->PARSER:Lcom/google/protobuf/Parser;

    .line 8
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_1
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getFactoryGraphName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getFactoryGraphName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getFactoryActionGraphName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getFactoryActionGraphName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->hasAction()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->hasAction()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-ne v1, v3, :cond_2

    .line 54
    .line 55
    move v1, v0

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    move v1, v2

    .line 58
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->hasAction()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getAction()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getAction()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v1, v3}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    move v1, v0

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move v1, v2

    .line 83
    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->hasGraphConfig()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->hasGraphConfig()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-ne v1, v3, :cond_5

    .line 94
    .line 95
    move v1, v0

    .line 96
    goto :goto_2

    .line 97
    :cond_5
    move v1, v2

    .line 98
    :goto_2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->hasGraphConfig()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_7

    .line 103
    .line 104
    if-eqz v1, :cond_6

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v1, v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_6

    .line 119
    .line 120
    move v1, v0

    .line 121
    goto :goto_3

    .line 122
    :cond_6
    move v1, v2

    .line 123
    :cond_7
    :goto_3
    if-eqz v1, :cond_8

    .line 124
    .line 125
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->modeConfig_:I

    .line 126
    .line 127
    iget v3, p1, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->modeConfig_:I

    .line 128
    .line 129
    if-ne v1, v3, :cond_8

    .line 130
    .line 131
    move v1, v0

    .line 132
    goto :goto_4

    .line 133
    :cond_8
    move v1, v2

    .line 134
    :goto_4
    if-eqz v1, :cond_9

    .line 135
    .line 136
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getBackgroundColor()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getBackgroundColor()I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-ne v1, v3, :cond_9

    .line 145
    .line 146
    move v1, v0

    .line 147
    goto :goto_5

    .line 148
    :cond_9
    move v1, v2

    .line 149
    :goto_5
    if-eqz v1, :cond_a

    .line 150
    .line 151
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->hasDrawArea()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->hasDrawArea()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-ne v1, v3, :cond_a

    .line 160
    .line 161
    move v1, v0

    .line 162
    goto :goto_6

    .line 163
    :cond_a
    move v1, v2

    .line 164
    :goto_6
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->hasDrawArea()Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-eqz v3, :cond_c

    .line 169
    .line 170
    if-eqz v1, :cond_b

    .line 171
    .line 172
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {v1, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_b

    .line 185
    .line 186
    return v0

    .line 187
    :cond_b
    return v2

    .line 188
    :cond_c
    return v1
.end method

.method public getAction()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->action_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getActionOrBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactoryOrBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getAction()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->backgroundColor_:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    return-object v0
.end method

.method public getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->drawArea_:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getDrawAreaOrBuilder()Lcom/zykj/sketch/EzyDrawBoard$DrawAreaOrBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getFactoryActionGraphName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryActionGraphName_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryActionGraphName_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getFactoryActionGraphNameBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryActionGraphName_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryActionGraphName_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getFactoryGraphName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryGraphName_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryGraphName_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getFactoryGraphNameBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryGraphName_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryGraphName_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->graphConfig_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getGraphConfigOrBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfigOrBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getModeConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->modeConfig_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->valueOf(I)Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->UNRECOGNIZED:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getModeConfigValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->modeConfig_:I

    .line 2
    .line 3
    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getFactoryGraphNameBytes()Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryGraphName_:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getFactoryActionGraphNameBytes()Lcom/google/protobuf/ByteString;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    iget-object v2, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryActionGraphName_:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v1, v2}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    add-int/2addr v0, v1

    .line 44
    :cond_2
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->action_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    const/4 v1, 0x5

    .line 49
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getAction()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    add-int/2addr v0, v1

    .line 58
    :cond_3
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->graphConfig_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 59
    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    const/4 v1, 0x6

    .line 63
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    add-int/2addr v0, v1

    .line 72
    :cond_4
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->modeConfig_:I

    .line 73
    .line 74
    sget-object v2, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_SELECT:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->getNumber()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eq v1, v2, :cond_5

    .line 81
    .line 82
    const/4 v1, 0x7

    .line 83
    iget v2, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->modeConfig_:I

    .line 84
    .line 85
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    add-int/2addr v0, v1

    .line 90
    :cond_5
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->backgroundColor_:I

    .line 91
    .line 92
    if-eqz v1, :cond_6

    .line 93
    .line 94
    const/16 v2, 0x8

    .line 95
    .line 96
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    add-int/2addr v0, v1

    .line 101
    :cond_6
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->drawArea_:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 102
    .line 103
    if-eqz v1, :cond_7

    .line 104
    .line 105
    const/16 v1, 0x9

    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    add-int/2addr v0, v1

    .line 116
    :cond_7
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 117
    .line 118
    return v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public hasAction()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->action_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public hasDrawArea()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->drawArea_:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public hasGraphConfig()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->graphConfig_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x30b

    .line 15
    .line 16
    add-int/2addr v1, v0

    .line 17
    mul-int/lit8 v1, v1, 0x25

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    mul-int/lit8 v1, v1, 0x35

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getFactoryGraphName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/2addr v1, v0

    .line 32
    mul-int/lit8 v1, v1, 0x25

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x2

    .line 35
    .line 36
    mul-int/lit8 v1, v1, 0x35

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getFactoryActionGraphName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    add-int/2addr v1, v0

    .line 47
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->hasAction()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    mul-int/lit8 v1, v1, 0x25

    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x5

    .line 56
    .line 57
    mul-int/lit8 v1, v1, 0x35

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getAction()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;->hashCode()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    add-int/2addr v1, v0

    .line 68
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->hasGraphConfig()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    mul-int/lit8 v1, v1, 0x25

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x6

    .line 77
    .line 78
    mul-int/lit8 v1, v1, 0x35

    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    add-int/2addr v1, v0

    .line 89
    :cond_2
    mul-int/lit8 v1, v1, 0x25

    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x7

    .line 92
    .line 93
    mul-int/lit8 v1, v1, 0x35

    .line 94
    .line 95
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->modeConfig_:I

    .line 96
    .line 97
    add-int/2addr v1, v0

    .line 98
    mul-int/lit8 v1, v1, 0x25

    .line 99
    .line 100
    add-int/lit8 v1, v1, 0x8

    .line 101
    .line 102
    mul-int/lit8 v1, v1, 0x35

    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getBackgroundColor()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    add-int/2addr v1, v0

    .line 109
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->hasDrawArea()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    mul-int/lit8 v1, v1, 0x25

    .line 116
    .line 117
    add-int/lit8 v1, v1, 0x9

    .line 118
    .line 119
    mul-int/lit8 v1, v1, 0x35

    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->hashCode()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    add-int/2addr v1, v0

    .line 130
    :cond_3
    mul-int/lit8 v1, v1, 0x1d

    .line 131
    .line 132
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    add-int/2addr v1, v0

    .line 139
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 140
    .line 141
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$31400()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->memoizedIsInitialized:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_1
    iput-byte v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;
    .locals 2

    .line 5
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/sketch/EzyDrawBoard$1;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;
    .locals 2

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;-><init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;-><init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V

    invoke-virtual {v0, p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getFactoryGraphNameBytes()Lcom/google/protobuf/ByteString;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryGraphName_:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getFactoryActionGraphNameBytes()Lcom/google/protobuf/ByteString;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->factoryActionGraphName_:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->action_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    const/4 v0, 0x5

    .line 38
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getAction()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->graphConfig_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    const/4 v0, 0x6

    .line 50
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->modeConfig_:I

    .line 58
    .line 59
    sget-object v1, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_SELECT:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->getNumber()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eq v0, v1, :cond_4

    .line 66
    .line 67
    const/4 v0, 0x7

    .line 68
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->modeConfig_:I

    .line 69
    .line 70
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 71
    .line 72
    .line 73
    :cond_4
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->backgroundColor_:I

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    const/16 v1, 0x8

    .line 78
    .line 79
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 80
    .line 81
    .line 82
    :cond_5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->drawArea_:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 83
    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    const/16 v0, 0x9

    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 93
    .line 94
    .line 95
    :cond_6
    return-void
.end method
