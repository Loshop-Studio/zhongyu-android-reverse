# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/EzyDrawBoard$BoardBody;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/EzyDrawBoard$BoardBodyOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BoardBody"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;
    }
.end annotation


# static fields
.field public static final ACTIONCONTENT_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$BoardBody;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J


# instance fields
.field private actionContent_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;"
        }
    .end annotation
.end field

.field private memoizedIsInitialized:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->PARSER:Lcom/google/protobuf/Parser;

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
    iput-byte v0, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->memoizedIsInitialized:B

    .line 7
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 5

    .line 8
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    :goto_0
    const/4 v2, 0x1

    if-nez v0, :cond_5

    .line 9
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v3

    if-eqz v3, :cond_1

    const/16 v4, 0xa

    if-eq v3, v4, :cond_2

    .line 10
    invoke-virtual {p1, v3}, Lcom/google/protobuf/CodedInputStream;->skipField(I)Z

    move-result v3

    if-nez v3, :cond_0

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

    :cond_2
    if-eq v1, v2, :cond_3

    .line 11
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

    move v1, v2

    .line 12
    :cond_3
    iget-object v3, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

    .line 13
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->parser()Lcom/google/protobuf/Parser;

    move-result-object v4

    invoke-virtual {p1, v4, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v4

    check-cast v4, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 14
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 15
    :goto_1
    :try_start_1
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 16
    invoke-virtual {p2, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 17
    :goto_2
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    if-ne v1, v2, :cond_4

    .line 18
    iget-object p2, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

    .line 19
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->makeExtensionsImmutable()V

    .line 20
    throw p1

    :cond_5
    if-ne v1, v2, :cond_6

    .line 21
    iget-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

    .line 22
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->makeExtensionsImmutable()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

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
    iput-byte p1, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic access$4000()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$4200(Lcom/zykj/sketch/EzyDrawBoard$BoardBody;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$4202(Lcom/zykj/sketch/EzyDrawBoard$BoardBody;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$4300()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$4400()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$BoardBody;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$3600()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/sketch/EzyDrawBoard$BoardBody;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$BoardBody;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->PARSER:Lcom/google/protobuf/Parser;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody;
    .locals 1

    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->PARSER:Lcom/google/protobuf/Parser;

    .line 10
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody;
    .locals 1

    .line 11
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->PARSER:Lcom/google/protobuf/Parser;

    .line 12
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody;
    .locals 1

    .line 5
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->PARSER:Lcom/google/protobuf/Parser;

    .line 6
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody;
    .locals 1

    .line 7
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->PARSER:Lcom/google/protobuf/Parser;

    .line 8
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/sketch/EzyDrawBoard$BoardBody;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody;
    .locals 1

    .line 4
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$BoardBody;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->PARSER:Lcom/google/protobuf/Parser;

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
    instance-of v1, p1, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

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
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->getActionContentList()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->getActionContentList()Ljava/util/List;

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

.method public getActionContent(I)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 8
    .line 9
    return-object p1
.end method

.method public getActionContentCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

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

.method public getActionContentList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getActionContentOrBuilder(I)Lcom/zykj/sketch/EzyDrawBoard$ActionContentOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContentOrBuilder;

    .line 8
    .line 9
    return-object p1
.end method

.method public getActionContentOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContentOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$BoardBody;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$BoardBody;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

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
    iget-object v2, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

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
    iget-object v2, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

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
    iput v1, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 35
    .line 36
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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->getActionContentCount()I

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->getActionContentList()Ljava/util/List;

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
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$3700()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

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
    iget-byte v0, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;
    .locals 2

    .line 5
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/sketch/EzyDrawBoard$1;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;
    .locals 2

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;-><init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;-><init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V

    invoke-virtual {v0, p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$BoardBody;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

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
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->actionContent_:Ljava/util/List;

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
    return-void
.end method
