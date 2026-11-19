# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/EzyDrawBoard$ActionZoomOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ActionZoom"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    }
.end annotation


# static fields
.field public static final CENTERX_FIELD_NUMBER:I = 0x5

.field public static final CENTERY_FIELD_NUMBER:I = 0x6

.field private static final DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

.field public static final KEEP_FIELD_NUMBER:I = 0x7

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;",
            ">;"
        }
    .end annotation
.end field

.field public static final SCALEX_FIELD_NUMBER:I = 0x3

.field public static final SCALEY_FIELD_NUMBER:I = 0x4

.field public static final STARTTIME_FIELD_NUMBER:I = 0x2

.field public static final TYPE_FIELD_NUMBER:I = 0x1

.field private static final serialVersionUID:J


# instance fields
.field private centerX_:F

.field private centerY_:F

.field private keep_:Z

.field private memoizedIsInitialized:B

.field private scaleX_:F

.field private scaleY_:F

.field private startTime_:J

.field private type_:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->PARSER:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->memoizedIsInitialized:B

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->type_:I

    const-wide/16 v1, 0x0

    .line 8
    iput-wide v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->startTime_:J

    const/4 v1, 0x0

    .line 9
    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->scaleX_:F

    .line 10
    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->scaleY_:F

    .line 11
    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->centerX_:F

    .line 12
    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->centerY_:F

    .line 13
    iput-boolean v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->keep_:Z

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 3

    .line 14
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;-><init>()V

    const/4 p2, 0x0

    :cond_0
    :goto_0
    if-nez p2, :cond_9

    .line 15
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    const/16 v2, 0x8

    if-eq v0, v2, :cond_8

    const/16 v2, 0x10

    if-eq v0, v2, :cond_7

    const/16 v2, 0x1d

    if-eq v0, v2, :cond_6

    const/16 v2, 0x25

    if-eq v0, v2, :cond_5

    const/16 v2, 0x2d

    if-eq v0, v2, :cond_4

    const/16 v2, 0x35

    if-eq v0, v2, :cond_3

    const/16 v2, 0x38

    if-eq v0, v2, :cond_2

    .line 16
    invoke-virtual {p1, v0}, Lcom/google/protobuf/CodedInputStream;->skipField(I)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    move p2, v1

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

    .line 17
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBool()Z

    move-result v0

    iput-boolean v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->keep_:Z

    goto :goto_0

    .line 18
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->centerY_:F

    goto :goto_0

    .line 19
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->centerX_:F

    goto :goto_0

    .line 20
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->scaleY_:F

    goto :goto_0

    .line 21
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->scaleX_:F

    goto :goto_0

    .line 22
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->startTime_:J

    goto :goto_0

    .line 23
    :cond_8
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->type_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 24
    :goto_1
    :try_start_1
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 25
    invoke-virtual {p2, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 26
    :goto_2
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    :goto_3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->makeExtensionsImmutable()V

    .line 28
    throw p1

    .line 29
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->makeExtensionsImmutable()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

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
    iput-byte p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic access$25800()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$26002(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->type_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$26102(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->startTime_:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic access$26202(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->scaleX_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$26302(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->scaleY_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$26402(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->centerX_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$26502(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->centerY_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$26602(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->keep_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$26700()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$25400()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->PARSER:Lcom/google/protobuf/Parser;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 1

    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->PARSER:Lcom/google/protobuf/Parser;

    .line 10
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 1

    .line 11
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->PARSER:Lcom/google/protobuf/Parser;

    .line 12
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 1

    .line 5
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->PARSER:Lcom/google/protobuf/Parser;

    .line 6
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 1

    .line 7
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->PARSER:Lcom/google/protobuf/Parser;

    .line 8
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 1

    .line 4
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

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
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getType()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getType()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-ne v1, v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getStartTime()J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getStartTime()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    cmp-long v1, v1, v3

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getScaleX()F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getScaleX()F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-ne v1, v2, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getScaleY()F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getScaleY()F

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-ne v1, v2, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getCenterX()F

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getCenterX()F

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-ne v1, v2, :cond_2

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getCenterY()F

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getCenterY()F

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-ne v1, v2, :cond_2

    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getKeep()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getKeep()Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-ne v1, p1, :cond_2

    .line 119
    .line 120
    return v0

    .line 121
    :cond_2
    const/4 p1, 0x0

    .line 122
    return p1
.end method

.method public getCenterX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->centerX_:F

    .line 2
    .line 3
    return v0
.end method

.method public getCenterY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->centerY_:F

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    return-object v0
.end method

.method public getKeep()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->keep_:Z

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
            "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getScaleX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->scaleX_:F

    .line 2
    .line 3
    return v0
.end method

.method public getScaleY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->scaleY_:F

    .line 2
    .line 3
    return v0
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
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->type_:I

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
    iget-wide v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->startTime_:J

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
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->scaleX_:F

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    cmpl-float v3, v1, v2

    .line 36
    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    const/4 v3, 0x3

    .line 40
    invoke-static {v3, v1}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    add-int/2addr v0, v1

    .line 45
    :cond_3
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->scaleY_:F

    .line 46
    .line 47
    cmpl-float v3, v1, v2

    .line 48
    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    const/4 v3, 0x4

    .line 52
    invoke-static {v3, v1}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v0, v1

    .line 57
    :cond_4
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->centerX_:F

    .line 58
    .line 59
    cmpl-float v3, v1, v2

    .line 60
    .line 61
    if-eqz v3, :cond_5

    .line 62
    .line 63
    const/4 v3, 0x5

    .line 64
    invoke-static {v3, v1}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    add-int/2addr v0, v1

    .line 69
    :cond_5
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->centerY_:F

    .line 70
    .line 71
    cmpl-float v2, v1, v2

    .line 72
    .line 73
    if-eqz v2, :cond_6

    .line 74
    .line 75
    const/4 v2, 0x6

    .line 76
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    add-int/2addr v0, v1

    .line 81
    :cond_6
    iget-boolean v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->keep_:Z

    .line 82
    .line 83
    if-eqz v1, :cond_7

    .line 84
    .line 85
    const/4 v2, 0x7

    .line 86
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    add-int/2addr v0, v1

    .line 91
    :cond_7
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 92
    .line 93
    return v0
.end method

.method public getStartTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->startTime_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->type_:I

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getType()I

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getStartTime()J

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
    mul-int/lit8 v1, v1, 0x25

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x3

    .line 46
    .line 47
    mul-int/lit8 v1, v1, 0x35

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getScaleX()F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    add-int/2addr v1, v0

    .line 58
    mul-int/lit8 v1, v1, 0x25

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x4

    .line 61
    .line 62
    mul-int/lit8 v1, v1, 0x35

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getScaleY()F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    add-int/2addr v1, v0

    .line 73
    mul-int/lit8 v1, v1, 0x25

    .line 74
    .line 75
    add-int/lit8 v1, v1, 0x5

    .line 76
    .line 77
    mul-int/lit8 v1, v1, 0x35

    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getCenterX()F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    add-int/2addr v1, v0

    .line 88
    mul-int/lit8 v1, v1, 0x25

    .line 89
    .line 90
    add-int/lit8 v1, v1, 0x6

    .line 91
    .line 92
    mul-int/lit8 v1, v1, 0x35

    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getCenterY()F

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    add-int/2addr v1, v0

    .line 103
    mul-int/lit8 v1, v1, 0x25

    .line 104
    .line 105
    add-int/lit8 v1, v1, 0x7

    .line 106
    .line 107
    mul-int/lit8 v1, v1, 0x35

    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getKeep()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {v0}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    add-int/2addr v1, v0

    .line 118
    mul-int/lit8 v1, v1, 0x1d

    .line 119
    .line 120
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    add-int/2addr v1, v0

    .line 127
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 128
    .line 129
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$25500()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

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
    iget-byte v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 2

    .line 5
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/sketch/EzyDrawBoard$1;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 2

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;-><init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;-><init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V

    invoke-virtual {v0, p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->type_:I

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
    iget-wide v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->startTime_:J

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
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->scaleX_:F

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    cmpl-float v2, v0, v1

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-virtual {p1, v2, v0}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 30
    .line 31
    .line 32
    :cond_2
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->scaleY_:F

    .line 33
    .line 34
    cmpl-float v2, v0, v1

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    invoke-virtual {p1, v2, v0}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 40
    .line 41
    .line 42
    :cond_3
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->centerX_:F

    .line 43
    .line 44
    cmpl-float v2, v0, v1

    .line 45
    .line 46
    if-eqz v2, :cond_4

    .line 47
    .line 48
    const/4 v2, 0x5

    .line 49
    invoke-virtual {p1, v2, v0}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 50
    .line 51
    .line 52
    :cond_4
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->centerY_:F

    .line 53
    .line 54
    cmpl-float v1, v0, v1

    .line 55
    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    const/4 v1, 0x6

    .line 59
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 60
    .line 61
    .line 62
    :cond_5
    iget-boolean v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->keep_:Z

    .line 63
    .line 64
    if-eqz v0, :cond_6

    .line 65
    .line 66
    const/4 v1, 0x7

    .line 67
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 68
    .line 69
    .line 70
    :cond_6
    return-void
.end method
