# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfigOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ActionGraphConfig"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfigOrBuilder;
    }
.end annotation


# static fields
.field public static final CONFIG_FIELD_NUMBER:I = 0x4

.field private static final DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;",
            ">;"
        }
    .end annotation
.end field

.field public static final STARTTIME_FIELD_NUMBER:I = 0x2

.field public static final TYPE_FIELD_NUMBER:I = 0x1

.field private static final serialVersionUID:J


# instance fields
.field private config_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

.field private memoizedIsInitialized:B

.field private startTime_:J

.field private type_:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->PARSER:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->memoizedIsInitialized:B

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->type_:I

    const-wide/16 v0, 0x0

    .line 8
    iput-wide v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->startTime_:J

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 4

    .line 9
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;-><init>()V

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_6

    .line 10
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/16 v3, 0x8

    if-eq v1, v3, :cond_5

    const/16 v3, 0x10

    if-eq v1, v3, :cond_4

    const/16 v3, 0x22

    if-eq v1, v3, :cond_2

    .line 11
    invoke-virtual {p1, v1}, Lcom/google/protobuf/CodedInputStream;->skipField(I)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    move v0, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    .line 12
    :cond_2
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->config_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    if-eqz v1, :cond_3

    .line 13
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;

    move-result-object v1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    .line 14
    :goto_1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->parser()Lcom/google/protobuf/Parser;

    move-result-object v2

    invoke-virtual {p1, v2, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v2

    check-cast v2, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    iput-object v2, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->config_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    if-eqz v1, :cond_0

    .line 15
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;

    .line 16
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->config_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    goto :goto_0

    .line 17
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->startTime_:J

    goto :goto_0

    .line 18
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v1

    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->type_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 19
    :goto_2
    :try_start_1
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 20
    invoke-virtual {p2, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 21
    :goto_3
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :goto_4
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->makeExtensionsImmutable()V

    .line 23
    throw p1

    .line 24
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->makeExtensionsImmutable()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

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
    iput-byte p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic access$16700()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$16902(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->type_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$17002(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->startTime_:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic access$17102(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->config_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$17200()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$15300()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->PARSER:Lcom/google/protobuf/Parser;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
    .locals 1

    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->PARSER:Lcom/google/protobuf/Parser;

    .line 10
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
    .locals 1

    .line 11
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->PARSER:Lcom/google/protobuf/Parser;

    .line 12
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
    .locals 1

    .line 5
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->PARSER:Lcom/google/protobuf/Parser;

    .line 6
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
    .locals 1

    .line 7
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->PARSER:Lcom/google/protobuf/Parser;

    .line 8
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
    .locals 1

    .line 4
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

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
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getType()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getType()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getStartTime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getStartTime()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    cmp-long v1, v1, v4

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->hasConfig()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->hasConfig()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-ne v1, v2, :cond_2

    .line 48
    .line 49
    move v1, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    move v1, v3

    .line 52
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->hasConfig()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {v1, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    return v0

    .line 75
    :cond_3
    return v3

    .line 76
    :cond_4
    return v1
.end method

.method public getConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->config_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

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

.method public getConfigOrBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfigOrBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSerializedSize()I
    .locals 5

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
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->type_:I

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    :goto_0
    iget-wide v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->startTime_:J

    .line 19
    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    cmp-long v3, v1, v3

    .line 23
    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    invoke-static {v3, v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v0, v1

    .line 32
    :cond_2
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->config_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    add-int/2addr v0, v1

    .line 46
    :cond_3
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 47
    .line 48
    return v0
.end method

.method public getStartTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->startTime_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->type_:I

    .line 2
    .line 3
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

.method public hasConfig()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->config_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

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
    .locals 4

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
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getType()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/2addr v1, v0

    .line 28
    mul-int/lit8 v1, v1, 0x25

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x2

    .line 31
    .line 32
    mul-int/lit8 v1, v1, 0x35

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getStartTime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    invoke-static {v2, v3}, Lcom/google/protobuf/Internal;->hashLong(J)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v1, v0

    .line 43
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->hasConfig()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    mul-int/lit8 v1, v1, 0x25

    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x4

    .line 52
    .line 53
    mul-int/lit8 v1, v1, 0x35

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    add-int/2addr v1, v0

    .line 64
    :cond_1
    mul-int/lit8 v1, v1, 0x1d

    .line 65
    .line 66
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    add-int/2addr v1, v0

    .line 73
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 74
    .line 75
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$15400()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

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
    iget-byte v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;
    .locals 2

    .line 5
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/sketch/EzyDrawBoard$1;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;
    .locals 2

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;-><init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;-><init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V

    invoke-virtual {v0, p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->type_:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->startTime_:J

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->config_:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    return-void
.end method
