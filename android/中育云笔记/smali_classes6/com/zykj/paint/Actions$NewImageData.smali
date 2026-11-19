# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/paint/Actions$NewImageData;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/paint/Actions$NewImageDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/paint/Actions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NewImageData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/paint/Actions$NewImageData$Builder;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$NewImageData;

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/paint/Actions$NewImageData;",
            ">;"
        }
    .end annotation
.end field

.field public static final POINT_FIELD_NUMBER:I = 0x1

.field public static final SIZE_FIELD_NUMBER:I = 0x2

.field public static final SRC_FIELD_NUMBER:I = 0x3

.field private static final serialVersionUID:J


# instance fields
.field private memoizedIsInitialized:B

.field private point_:Lcom/zykj/paint/Actions$EzyPoint;

.field private size_:Lcom/zykj/paint/Actions$EzySize;

.field private volatile src_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/paint/Actions$NewImageData;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/paint/Actions$NewImageData;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/paint/Actions$NewImageData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$NewImageData;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/paint/Actions$NewImageData$1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/paint/Actions$NewImageData$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/paint/Actions$NewImageData;->PARSER:Lcom/google/protobuf/Parser;

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
    iput-byte v0, p0, Lcom/zykj/paint/Actions$NewImageData;->memoizedIsInitialized:B

    .line 7
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/paint/Actions$NewImageData;->src_:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 5

    .line 8
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewImageData;-><init>()V

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_7

    .line 9
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/16 v3, 0xa

    const/4 v4, 0x0

    if-eq v1, v3, :cond_5

    const/16 v3, 0x12

    if-eq v1, v3, :cond_3

    const/16 v3, 0x1a

    if-eq v1, v3, :cond_2

    .line 10
    invoke-virtual {p1, v1}, Lcom/google/protobuf/CodedInputStream;->skipField(I)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    move v0, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    .line 11
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object v1

    .line 12
    iput-object v1, p0, Lcom/zykj/paint/Actions$NewImageData;->src_:Ljava/lang/Object;

    goto :goto_0

    .line 13
    :cond_3
    iget-object v1, p0, Lcom/zykj/paint/Actions$NewImageData;->size_:Lcom/zykj/paint/Actions$EzySize;

    if-eqz v1, :cond_4

    .line 14
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzySize;->toBuilder()Lcom/zykj/paint/Actions$EzySize$Builder;

    move-result-object v4

    .line 15
    :cond_4
    invoke-static {}, Lcom/zykj/paint/Actions$EzySize;->parser()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    check-cast v1, Lcom/zykj/paint/Actions$EzySize;

    iput-object v1, p0, Lcom/zykj/paint/Actions$NewImageData;->size_:Lcom/zykj/paint/Actions$EzySize;

    if-eqz v4, :cond_0

    .line 16
    invoke-virtual {v4, v1}, Lcom/zykj/paint/Actions$EzySize$Builder;->mergeFrom(Lcom/zykj/paint/Actions$EzySize;)Lcom/zykj/paint/Actions$EzySize$Builder;

    .line 17
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzySize$Builder;->buildPartial()Lcom/zykj/paint/Actions$EzySize;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/paint/Actions$NewImageData;->size_:Lcom/zykj/paint/Actions$EzySize;

    goto :goto_0

    .line 18
    :cond_5
    iget-object v1, p0, Lcom/zykj/paint/Actions$NewImageData;->point_:Lcom/zykj/paint/Actions$EzyPoint;

    if-eqz v1, :cond_6

    .line 19
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzyPoint;->toBuilder()Lcom/zykj/paint/Actions$EzyPoint$Builder;

    move-result-object v4

    .line 20
    :cond_6
    invoke-static {}, Lcom/zykj/paint/Actions$EzyPoint;->parser()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    check-cast v1, Lcom/zykj/paint/Actions$EzyPoint;

    iput-object v1, p0, Lcom/zykj/paint/Actions$NewImageData;->point_:Lcom/zykj/paint/Actions$EzyPoint;

    if-eqz v4, :cond_0

    .line 21
    invoke-virtual {v4, v1}, Lcom/zykj/paint/Actions$EzyPoint$Builder;->mergeFrom(Lcom/zykj/paint/Actions$EzyPoint;)Lcom/zykj/paint/Actions$EzyPoint$Builder;

    .line 22
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyPoint$Builder;->buildPartial()Lcom/zykj/paint/Actions$EzyPoint;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/paint/Actions$NewImageData;->point_:Lcom/zykj/paint/Actions$EzyPoint;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 23
    :goto_1
    :try_start_1
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 24
    invoke-virtual {p2, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 25
    :goto_2
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :goto_3
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->makeExtensionsImmutable()V

    .line 27
    throw p1

    .line 28
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->makeExtensionsImmutable()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/zykj/paint/Actions$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/paint/Actions$NewImageData;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

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
    iput-byte p1, p0, Lcom/zykj/paint/Actions$NewImageData;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/paint/Actions$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/paint/Actions$NewImageData;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic access$6200()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$6402(Lcom/zykj/paint/Actions$NewImageData;Lcom/zykj/paint/Actions$EzyPoint;)Lcom/zykj/paint/Actions$EzyPoint;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/Actions$NewImageData;->point_:Lcom/zykj/paint/Actions$EzyPoint;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$6502(Lcom/zykj/paint/Actions$NewImageData;Lcom/zykj/paint/Actions$EzySize;)Lcom/zykj/paint/Actions$EzySize;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/Actions$NewImageData;->size_:Lcom/zykj/paint/Actions$EzySize;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$6600(Lcom/zykj/paint/Actions$NewImageData;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/Actions$NewImageData;->src_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$6602(Lcom/zykj/paint/Actions$NewImageData;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/Actions$NewImageData;->src_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$6700()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$6800(Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getDefaultInstance()Lcom/zykj/paint/Actions$NewImageData;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$NewImageData;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions;->access$5800()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/paint/Actions$NewImageData$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$NewImageData;

    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewImageData;->toBuilder()Lcom/zykj/paint/Actions$NewImageData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/paint/Actions$NewImageData;)Lcom/zykj/paint/Actions$NewImageData$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$NewImageData;

    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewImageData;->toBuilder()Lcom/zykj/paint/Actions$NewImageData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/paint/Actions$NewImageData$Builder;->mergeFrom(Lcom/zykj/paint/Actions$NewImageData;)Lcom/zykj/paint/Actions$NewImageData$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/paint/Actions$NewImageData;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewImageData;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewImageData;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->PARSER:Lcom/google/protobuf/Parser;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewImageData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/paint/Actions$NewImageData;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewImageData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewImageData;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewImageData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/paint/Actions$NewImageData;
    .locals 1

    .line 9
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->PARSER:Lcom/google/protobuf/Parser;

    .line 10
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewImageData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewImageData;
    .locals 1

    .line 11
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->PARSER:Lcom/google/protobuf/Parser;

    .line 12
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewImageData;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/paint/Actions$NewImageData;
    .locals 1

    .line 5
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->PARSER:Lcom/google/protobuf/Parser;

    .line 6
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewImageData;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewImageData;
    .locals 1

    .line 7
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->PARSER:Lcom/google/protobuf/Parser;

    .line 8
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewImageData;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/paint/Actions$NewImageData;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewImageData;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewImageData;
    .locals 1

    .line 4
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewImageData;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/paint/Actions$NewImageData;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->PARSER:Lcom/google/protobuf/Parser;

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
    instance-of v1, p1, Lcom/zykj/paint/Actions$NewImageData;

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
    check-cast p1, Lcom/zykj/paint/Actions$NewImageData;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->hasPoint()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewImageData;->hasPoint()Z

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
    move v1, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move v1, v3

    .line 30
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->hasPoint()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getPoint()Lcom/zykj/paint/Actions$EzyPoint;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewImageData;->getPoint()Lcom/zykj/paint/Actions$EzyPoint;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1, v2}, Lcom/zykj/paint/Actions$EzyPoint;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    move v1, v0

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    move v1, v3

    .line 55
    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->hasSize()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewImageData;->hasSize()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-ne v1, v2, :cond_5

    .line 66
    .line 67
    move v1, v0

    .line 68
    goto :goto_2

    .line 69
    :cond_5
    move v1, v3

    .line 70
    :goto_2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->hasSize()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_7

    .line 75
    .line 76
    if-eqz v1, :cond_6

    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getSize()Lcom/zykj/paint/Actions$EzySize;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewImageData;->getSize()Lcom/zykj/paint/Actions$EzySize;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v1, v2}, Lcom/zykj/paint/Actions$EzySize;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_6

    .line 91
    .line 92
    move v1, v0

    .line 93
    goto :goto_3

    .line 94
    :cond_6
    move v1, v3

    .line 95
    :cond_7
    :goto_3
    if-eqz v1, :cond_8

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getSrc()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewImageData;->getSrc()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_8

    .line 110
    .line 111
    return v0

    .line 112
    :cond_8
    return v3
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getDefaultInstanceForType()Lcom/zykj/paint/Actions$NewImageData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getDefaultInstanceForType()Lcom/zykj/paint/Actions$NewImageData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/paint/Actions$NewImageData;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$NewImageData;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/paint/Actions$NewImageData;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPoint()Lcom/zykj/paint/Actions$EzyPoint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewImageData;->point_:Lcom/zykj/paint/Actions$EzyPoint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/paint/Actions$EzyPoint;->getDefaultInstance()Lcom/zykj/paint/Actions$EzyPoint;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getPointOrBuilder()Lcom/zykj/paint/Actions$EzyPointOrBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getPoint()Lcom/zykj/paint/Actions$EzyPoint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
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
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewImageData;->point_:Lcom/zykj/paint/Actions$EzyPoint;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getPoint()Lcom/zykj/paint/Actions$EzyPoint;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_0
    iget-object v1, p0, Lcom/zykj/paint/Actions$NewImageData;->size_:Lcom/zykj/paint/Actions$EzySize;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getSize()Lcom/zykj/paint/Actions$EzySize;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v0, v1

    .line 36
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getSrcBytes()Lcom/google/protobuf/ByteString;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x3

    .line 47
    iget-object v2, p0, Lcom/zykj/paint/Actions$NewImageData;->src_:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {v1, v2}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v0, v1

    .line 54
    :cond_3
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 55
    .line 56
    return v0
.end method

.method public getSize()Lcom/zykj/paint/Actions$EzySize;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewImageData;->size_:Lcom/zykj/paint/Actions$EzySize;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/paint/Actions$EzySize;->getDefaultInstance()Lcom/zykj/paint/Actions$EzySize;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getSizeOrBuilder()Lcom/zykj/paint/Actions$EzySizeOrBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getSize()Lcom/zykj/paint/Actions$EzySize;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getSrc()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewImageData;->src_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/paint/Actions$NewImageData;->src_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getSrcBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewImageData;->src_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/paint/Actions$NewImageData;->src_:Ljava/lang/Object;

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

.method public hasPoint()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewImageData;->point_:Lcom/zykj/paint/Actions$EzyPoint;

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

.method public hasSize()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewImageData;->size_:Lcom/zykj/paint/Actions$EzySize;

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
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->hasPoint()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

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
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getPoint()Lcom/zykj/paint/Actions$EzyPoint;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyPoint;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v1, v0

    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->hasSize()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    mul-int/lit8 v1, v1, 0x25

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x2

    .line 47
    .line 48
    mul-int/lit8 v1, v1, 0x35

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getSize()Lcom/zykj/paint/Actions$EzySize;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzySize;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int/2addr v1, v0

    .line 59
    :cond_2
    mul-int/lit8 v1, v1, 0x25

    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x3

    .line 62
    .line 63
    mul-int/lit8 v1, v1, 0x35

    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getSrc()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    add-int/2addr v1, v0

    .line 74
    mul-int/lit8 v1, v1, 0x1d

    .line 75
    .line 76
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    add-int/2addr v1, v0

    .line 83
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 84
    .line 85
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions;->access$5900()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/paint/Actions$NewImageData;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/paint/Actions$NewImageData$Builder;

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
    iget-byte v0, p0, Lcom/zykj/paint/Actions$NewImageData;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/paint/Actions$NewImageData;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->newBuilderForType()Lcom/zykj/paint/Actions$NewImageData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewImageData;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/paint/Actions$NewImageData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->newBuilderForType()Lcom/zykj/paint/Actions$NewImageData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/paint/Actions$NewImageData$Builder;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/paint/Actions$NewImageData;->newBuilder()Lcom/zykj/paint/Actions$NewImageData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/paint/Actions$NewImageData$Builder;
    .locals 2

    .line 5
    new-instance v0, Lcom/zykj/paint/Actions$NewImageData$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/zykj/paint/Actions$NewImageData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/paint/Actions$1;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->toBuilder()Lcom/zykj/paint/Actions$NewImageData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->toBuilder()Lcom/zykj/paint/Actions$NewImageData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/paint/Actions$NewImageData$Builder;
    .locals 2

    .line 3
    sget-object v0, Lcom/zykj/paint/Actions$NewImageData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$NewImageData;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/paint/Actions$NewImageData$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/paint/Actions$NewImageData$Builder;-><init>(Lcom/zykj/paint/Actions$1;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/zykj/paint/Actions$NewImageData$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/paint/Actions$NewImageData$Builder;-><init>(Lcom/zykj/paint/Actions$1;)V

    invoke-virtual {v0, p0}, Lcom/zykj/paint/Actions$NewImageData$Builder;->mergeFrom(Lcom/zykj/paint/Actions$NewImageData;)Lcom/zykj/paint/Actions$NewImageData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewImageData;->point_:Lcom/zykj/paint/Actions$EzyPoint;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getPoint()Lcom/zykj/paint/Actions$EzyPoint;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewImageData;->size_:Lcom/zykj/paint/Actions$EzySize;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getSize()Lcom/zykj/paint/Actions$EzySize;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewImageData;->getSrcBytes()Lcom/google/protobuf/ByteString;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    iget-object v1, p0, Lcom/zykj/paint/Actions$NewImageData;->src_:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method
