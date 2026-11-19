# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/paint/Actions$NewPolylineData;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/paint/Actions$NewPolylineDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/paint/Actions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NewPolylineData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    }
.end annotation


# static fields
.field public static final COLOR_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$NewPolylineData;

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/paint/Actions$NewPolylineData;",
            ">;"
        }
    .end annotation
.end field

.field public static final POINTS_FIELD_NUMBER:I = 0x1

.field public static final STICKYGRAPHID_FIELD_NUMBER:I = 0x4

.field public static final WIDTH_FIELD_NUMBER:I = 0x3

.field private static final serialVersionUID:J


# instance fields
.field private bitField0_:I

.field private color_:Lcom/zykj/paint/Actions$EzyColor;

.field private memoizedIsInitialized:B

.field private points_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyPoint;",
            ">;"
        }
    .end annotation
.end field

.field private stickyGraphId_:I

.field private width_:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/paint/Actions$NewPolylineData;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$NewPolylineData;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/paint/Actions$NewPolylineData$1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/paint/Actions$NewPolylineData$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->PARSER:Lcom/google/protobuf/Parser;

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
    iput-byte v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->memoizedIsInitialized:B

    .line 7
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    const-wide/16 v0, 0x0

    .line 8
    iput-wide v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->width_:D

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->stickyGraphId_:I

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 10
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    :goto_0
    const/4 v2, 0x1

    if-nez v0, :cond_9

    .line 11
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v3

    if-eqz v3, :cond_1

    const/16 v4, 0xa

    if-eq v3, v4, :cond_6

    const/16 v4, 0x12

    if-eq v3, v4, :cond_4

    const/16 v4, 0x19

    if-eq v3, v4, :cond_3

    const/16 v4, 0x20

    if-eq v3, v4, :cond_2

    .line 12
    invoke-virtual {p1, v3}, Lcom/google/protobuf/CodedInputStream;->skipField(I)Z

    move-result v3

    if-nez v3, :cond_0

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

    .line 13
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v3

    iput v3, p0, Lcom/zykj/paint/Actions$NewPolylineData;->stickyGraphId_:I

    goto :goto_0

    .line 14
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readDouble()D

    move-result-wide v3

    iput-wide v3, p0, Lcom/zykj/paint/Actions$NewPolylineData;->width_:D

    goto :goto_0

    .line 15
    :cond_4
    iget-object v3, p0, Lcom/zykj/paint/Actions$NewPolylineData;->color_:Lcom/zykj/paint/Actions$EzyColor;

    if-eqz v3, :cond_5

    .line 16
    invoke-virtual {v3}, Lcom/zykj/paint/Actions$EzyColor;->toBuilder()Lcom/zykj/paint/Actions$EzyColor$Builder;

    move-result-object v3

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    .line 17
    :goto_1
    invoke-static {}, Lcom/zykj/paint/Actions$EzyColor;->parser()Lcom/google/protobuf/Parser;

    move-result-object v4

    invoke-virtual {p1, v4, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v4

    check-cast v4, Lcom/zykj/paint/Actions$EzyColor;

    iput-object v4, p0, Lcom/zykj/paint/Actions$NewPolylineData;->color_:Lcom/zykj/paint/Actions$EzyColor;

    if-eqz v3, :cond_0

    .line 18
    invoke-virtual {v3, v4}, Lcom/zykj/paint/Actions$EzyColor$Builder;->mergeFrom(Lcom/zykj/paint/Actions$EzyColor;)Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 19
    invoke-virtual {v3}, Lcom/zykj/paint/Actions$EzyColor$Builder;->buildPartial()Lcom/zykj/paint/Actions$EzyColor;

    move-result-object v3

    iput-object v3, p0, Lcom/zykj/paint/Actions$NewPolylineData;->color_:Lcom/zykj/paint/Actions$EzyColor;

    goto :goto_0

    :cond_6
    if-eq v1, v2, :cond_7

    .line 20
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    move v1, v2

    .line 21
    :cond_7
    iget-object v3, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    .line 22
    invoke-static {}, Lcom/zykj/paint/Actions$EzyPoint;->parser()Lcom/google/protobuf/Parser;

    move-result-object v4

    invoke-virtual {p1, v4, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v4

    check-cast v4, Lcom/zykj/paint/Actions$EzyPoint;

    .line 23
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 24
    :goto_2
    :try_start_1
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 25
    invoke-virtual {p2, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 26
    :goto_3
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    if-ne v1, v2, :cond_8

    .line 27
    iget-object p2, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    .line 28
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->makeExtensionsImmutable()V

    .line 29
    throw p1

    :cond_9
    if-ne v1, v2, :cond_a

    .line 30
    iget-object p1, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    .line 31
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->makeExtensionsImmutable()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/zykj/paint/Actions$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/paint/Actions$NewPolylineData;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

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
    iput-byte p1, p0, Lcom/zykj/paint/Actions$NewPolylineData;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/paint/Actions$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic access$7400()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$7600(Lcom/zykj/paint/Actions$NewPolylineData;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$7602(Lcom/zykj/paint/Actions$NewPolylineData;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$7702(Lcom/zykj/paint/Actions$NewPolylineData;Lcom/zykj/paint/Actions$EzyColor;)Lcom/zykj/paint/Actions$EzyColor;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/Actions$NewPolylineData;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$7802(Lcom/zykj/paint/Actions$NewPolylineData;D)D
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/paint/Actions$NewPolylineData;->width_:D

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic access$7902(Lcom/zykj/paint/Actions$NewPolylineData;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/paint/Actions$NewPolylineData;->stickyGraphId_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$8002(Lcom/zykj/paint/Actions$NewPolylineData;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/paint/Actions$NewPolylineData;->bitField0_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$8100()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$8200()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDefaultInstance()Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$NewPolylineData;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions;->access$7000()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$NewPolylineData;

    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewPolylineData;->toBuilder()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/paint/Actions$NewPolylineData;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$NewPolylineData;

    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewPolylineData;->toBuilder()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeFrom(Lcom/zykj/paint/Actions$NewPolylineData;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewPolylineData;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->PARSER:Lcom/google/protobuf/Parser;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewPolylineData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewPolylineData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewPolylineData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->PARSER:Lcom/google/protobuf/Parser;

    .line 10
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewPolylineData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->PARSER:Lcom/google/protobuf/Parser;

    .line 12
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewPolylineData;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->PARSER:Lcom/google/protobuf/Parser;

    .line 6
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewPolylineData;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->PARSER:Lcom/google/protobuf/Parser;

    .line 8
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewPolylineData;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewPolylineData;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/paint/Actions$NewPolylineData;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/paint/Actions$NewPolylineData;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/paint/Actions$NewPolylineData;

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
    check-cast p1, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->getPointsList()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->getPointsList()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

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
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->hasColor()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->hasColor()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-ne v1, v3, :cond_2

    .line 40
    .line 41
    move v1, v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v1, v2

    .line 44
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->hasColor()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_4

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v1, v3}, Lcom/zykj/paint/Actions$EzyColor;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    move v1, v0

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    move v1, v2

    .line 69
    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->getWidth()D

    .line 72
    .line 73
    .line 74
    move-result-wide v3

    .line 75
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->getWidth()D

    .line 80
    .line 81
    .line 82
    move-result-wide v5

    .line 83
    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 84
    .line 85
    .line 86
    move-result-wide v5

    .line 87
    cmp-long v1, v3, v5

    .line 88
    .line 89
    if-nez v1, :cond_5

    .line 90
    .line 91
    move v1, v0

    .line 92
    goto :goto_2

    .line 93
    :cond_5
    move v1, v2

    .line 94
    :goto_2
    if-eqz v1, :cond_6

    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->getStickyGraphId()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->getStickyGraphId()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-ne v1, p1, :cond_6

    .line 105
    .line 106
    return v0

    .line 107
    :cond_6
    return v2
.end method

.method public getColor()Lcom/zykj/paint/Actions$EzyColor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/paint/Actions$EzyColor;->getDefaultInstance()Lcom/zykj/paint/Actions$EzyColor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getColorOrBuilder()Lcom/zykj/paint/Actions$EzyColorOrBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

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
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->getDefaultInstanceForType()Lcom/zykj/paint/Actions$NewPolylineData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->getDefaultInstanceForType()Lcom/zykj/paint/Actions$NewPolylineData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$NewPolylineData;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/paint/Actions$NewPolylineData;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPoints(I)Lcom/zykj/paint/Actions$EzyPoint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/paint/Actions$EzyPoint;

    .line 8
    .line 9
    return-object p1
.end method

.method public getPointsCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

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

.method public getPointsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyPoint;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointsOrBuilder(I)Lcom/zykj/paint/Actions$EzyPointOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/paint/Actions$EzyPointOrBuilder;

    .line 8
    .line 9
    return-object p1
.end method

.method public getPointsOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/paint/Actions$EzyPointOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSerializedSize()I
    .locals 6

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
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    iget-object v2, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v0, v2, :cond_1

    .line 16
    .line 17
    iget-object v2, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-static {v3, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/2addr v1, v2

    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    const/4 v0, 0x2

    .line 39
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v0, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    add-int/2addr v1, v0

    .line 48
    :cond_2
    iget-wide v2, p0, Lcom/zykj/paint/Actions$NewPolylineData;->width_:D

    .line 49
    .line 50
    const-wide/16 v4, 0x0

    .line 51
    .line 52
    cmpl-double v0, v2, v4

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    const/4 v0, 0x3

    .line 57
    invoke-static {v0, v2, v3}, Lcom/google/protobuf/CodedOutputStream;->computeDoubleSize(ID)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    add-int/2addr v1, v0

    .line 62
    :cond_3
    iget v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->stickyGraphId_:I

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    const/4 v2, 0x4

    .line 67
    invoke-static {v2, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    add-int/2addr v1, v0

    .line 72
    :cond_4
    iput v1, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 73
    .line 74
    return v1
.end method

.method public getStickyGraphId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->stickyGraphId_:I

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

.method public getWidth()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->width_:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public hasColor()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->color_:Lcom/zykj/paint/Actions$EzyColor;

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
    .locals 6

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
    add-int/lit16 v0, v0, 0x30b

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->getPointsCount()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/16 v2, 0x35

    .line 21
    .line 22
    const/16 v3, 0x25

    .line 23
    .line 24
    if-lez v1, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-static {v0, v3, v1, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->getPointsList()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/2addr v0, v1

    .line 40
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->hasColor()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-static {v0, v3, v1, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzyColor;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    add-int/2addr v0, v1

    .line 60
    :cond_2
    const/4 v1, 0x3

    .line 61
    invoke-static {v0, v3, v1, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->getWidth()D

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    invoke-static {v4, v5}, Lcom/google/protobuf/Internal;->hashLong(J)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/2addr v1, v0

    .line 78
    mul-int/2addr v1, v3

    .line 79
    add-int/lit8 v1, v1, 0x4

    .line 80
    .line 81
    mul-int/2addr v1, v2

    .line 82
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->getStickyGraphId()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    add-int/2addr v0, v1

    .line 87
    mul-int/lit8 v0, v0, 0x1d

    .line 88
    .line 89
    iget-object v1, p0, Lcom/google/protobuf/GeneratedMessageV3;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    add-int/2addr v1, v0

    .line 96
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 97
    .line 98
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions;->access$7100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/paint/Actions$NewPolylineData$Builder;

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
    iget-byte v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/paint/Actions$NewPolylineData;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->newBuilderForType()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->newBuilderForType()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/paint/Actions$NewPolylineData;->newBuilder()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 2

    .line 5
    new-instance v0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/paint/Actions$1;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->toBuilder()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->toBuilder()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 2

    .line 3
    sget-object v0, Lcom/zykj/paint/Actions$NewPolylineData;->DEFAULT_INSTANCE:Lcom/zykj/paint/Actions$NewPolylineData;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;-><init>(Lcom/zykj/paint/Actions$1;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;-><init>(Lcom/zykj/paint/Actions$1;)V

    invoke-virtual {v0, p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeFrom(Lcom/zykj/paint/Actions$NewPolylineData;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData;->points_:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/google/protobuf/MessageLite;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-wide v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->width_:D

    .line 38
    .line 39
    const-wide/16 v2, 0x0

    .line 40
    .line 41
    cmpl-double v2, v0, v2

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    const/4 v2, 0x3

    .line 46
    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeDouble(ID)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget v0, p0, Lcom/zykj/paint/Actions$NewPolylineData;->stickyGraphId_:I

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    const/4 v1, 0x4

    .line 54
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 55
    .line 56
    .line 57
    :cond_3
    return-void
.end method
