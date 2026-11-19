# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/paint/Actions$EzyMatrixData;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/paint/Actions$EzyMatrixDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/paint/Actions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "EzyMatrixData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/paint/Actions$EzyMatrixData$Builder;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$EzyMatrixData;

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/paint/Actions$EzyMatrixData;",
            ">;"
        }
    .end annotation
.end field

.field public static final VALUES_FIELD_NUMBER:I = 0x1

.field private static final serialVersionUID:J


# instance fields
.field private memoizedIsInitialized:B

.field private valuesMemoizedSerializedSize:I

.field private values_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/paint/Actions$EzyMatrixData;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/paint/Actions$EzyMatrixData$1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/paint/Actions$EzyMatrixData$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->PARSER:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->valuesMemoizedSerializedSize:I

    .line 8
    iput-byte v0, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->memoizedIsInitialized:B

    .line 9
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 5

    .line 10
    invoke-direct {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;-><init>()V

    const/4 p2, 0x0

    move v0, p2

    :cond_0
    :goto_0
    const/4 v1, 0x1

    if-nez p2, :cond_8

    .line 11
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v2

    if-eqz v2, :cond_1

    const/16 v3, 0xa

    if-eq v2, v3, :cond_4

    const/16 v3, 0xd

    if-eq v2, v3, :cond_2

    .line 12
    invoke-virtual {p1, v2}, Lcom/google/protobuf/CodedInputStream;->skipField(I)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_1
    move p2, v1

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

    :cond_2
    if-eq v0, v1, :cond_3

    .line 13
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    move v0, v1

    .line 14
    :cond_3
    iget-object v2, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 15
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readRawVarint32()I

    move-result v2

    .line 16
    invoke-virtual {p1, v2}, Lcom/google/protobuf/CodedInputStream;->pushLimit(I)I

    move-result v2

    if-eq v0, v1, :cond_5

    .line 17
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v3

    if-lez v3, :cond_5

    .line 18
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    move v0, v1

    .line 19
    :cond_5
    :goto_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v3

    if-lez v3, :cond_6

    .line 20
    iget-object v3, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 21
    :cond_6
    invoke-virtual {p1, v2}, Lcom/google/protobuf/CodedInputStream;->popLimit(I)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 22
    :goto_2
    :try_start_1
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 23
    invoke-virtual {p2, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 24
    :goto_3
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    if-ne v0, v1, :cond_7

    .line 25
    iget-object p2, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    .line 26
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->makeExtensionsImmutable()V

    .line 27
    throw p1

    :cond_8
    if-ne v0, v1, :cond_9

    .line 28
    iget-object p1, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    .line 29
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->makeExtensionsImmutable()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/zykj/paint/Actions$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/paint/Actions$EzyMatrixData;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

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
    iput p1, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->valuesMemoizedSerializedSize:I

    .line 5
    iput-byte p1, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/paint/Actions$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/paint/Actions$EzyMatrixData;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic access$2600()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$2800(Lcom/zykj/paint/Actions$EzyMatrixData;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2802(Lcom/zykj/paint/Actions$EzyMatrixData;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2900()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDefaultInstance()Lcom/zykj/paint/Actions$EzyMatrixData;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions;->access$2200()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$EzyMatrixData;

    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyMatrixData;->toBuilder()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/paint/Actions$EzyMatrixData;)Lcom/zykj/paint/Actions$EzyMatrixData$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$EzyMatrixData;

    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyMatrixData;->toBuilder()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->mergeFrom(Lcom/zykj/paint/Actions$EzyMatrixData;)Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/paint/Actions$EzyMatrixData;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$EzyMatrixData;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$EzyMatrixData;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->PARSER:Lcom/google/protobuf/Parser;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$EzyMatrixData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/paint/Actions$EzyMatrixData;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$EzyMatrixData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$EzyMatrixData;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$EzyMatrixData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/paint/Actions$EzyMatrixData;
    .locals 1

    .line 9
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->PARSER:Lcom/google/protobuf/Parser;

    .line 10
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$EzyMatrixData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$EzyMatrixData;
    .locals 1

    .line 11
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->PARSER:Lcom/google/protobuf/Parser;

    .line 12
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$EzyMatrixData;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/paint/Actions$EzyMatrixData;
    .locals 1

    .line 5
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->PARSER:Lcom/google/protobuf/Parser;

    .line 6
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$EzyMatrixData;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$EzyMatrixData;
    .locals 1

    .line 7
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->PARSER:Lcom/google/protobuf/Parser;

    .line 8
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$EzyMatrixData;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/paint/Actions$EzyMatrixData;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$EzyMatrixData;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$EzyMatrixData;
    .locals 1

    .line 4
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$EzyMatrixData;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/paint/Actions$EzyMatrixData;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/paint/Actions$EzyMatrixData;

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
    check-cast p1, Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->getValuesList()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyMatrixData;->getValuesList()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    return v0

    .line 31
    :cond_2
    const/4 p1, 0x0

    .line 32
    return p1
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->getDefaultInstanceForType()Lcom/zykj/paint/Actions$EzyMatrixData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->getDefaultInstanceForType()Lcom/zykj/paint/Actions$EzyMatrixData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/paint/Actions$EzyMatrixData;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$EzyMatrixData;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/paint/Actions$EzyMatrixData;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->PARSER:Lcom/google/protobuf/Parser;

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
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->getValuesList()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    mul-int/lit8 v0, v0, 0x4

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->getValuesList()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    add-int/lit8 v1, v0, 0x1

    .line 28
    .line 29
    invoke-static {v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32SizeNoTag(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-int/2addr v1, v2

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v1, v0

    .line 36
    :goto_0
    iput v0, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->valuesMemoizedSerializedSize:I

    .line 37
    .line 38
    iput v1, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 39
    .line 40
    return v1
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

.method public getValues(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public getValuesCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getValuesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
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
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->getValuesCount()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lez v0, :cond_1

    .line 22
    .line 23
    mul-int/lit8 v1, v1, 0x25

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    mul-int/lit8 v1, v1, 0x35

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->getValuesList()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v1, v0

    .line 38
    :cond_1
    mul-int/lit8 v1, v1, 0x1d

    .line 39
    .line 40
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    add-int/2addr v1, v0

    .line 47
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 48
    .line 49
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions;->access$2300()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

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
    iget-byte v0, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->newBuilderForType()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$EzyMatrixData;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->newBuilderForType()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/paint/Actions$EzyMatrixData;->newBuilder()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/paint/Actions$EzyMatrixData$Builder;
    .locals 2

    .line 5
    new-instance v0, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/paint/Actions$1;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->toBuilder()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->toBuilder()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;
    .locals 2

    .line 3
    sget-object v0, Lcom/zykj/paint/Actions$EzyMatrixData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$EzyMatrixData;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;-><init>(Lcom/zykj/paint/Actions$1;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;-><init>(Lcom/zykj/paint/Actions$1;)V

    invoke-virtual {v0, p0}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->mergeFrom(Lcom/zykj/paint/Actions$EzyMatrixData;)Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->getSerializedSize()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyMatrixData;->getValuesList()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    const/16 v0, 0xa

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeUInt32NoTag(I)V

    .line 17
    .line 18
    .line 19
    iget v0, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->valuesMemoizedSerializedSize:I

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeUInt32NoTag(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    iget-object v1, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ge v0, v1, :cond_1

    .line 32
    .line 33
    iget-object v1, p0, Lcom/zykj/paint/Actions$EzyMatrixData;->values_:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/lang/Float;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {p1, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloatNoTag(F)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-void
.end method
