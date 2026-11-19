# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/EzyDrawBoard$ActionContentOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ActionContent"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    }
.end annotation


# static fields
.field public static final ACTION_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

.field public static final GRAPHSNAPSHOT_FIELD_NUMBER:I = 0x3

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;"
        }
    .end annotation
.end field

.field public static final RESETDATA_FIELD_NUMBER:I = 0x5

.field public static final TYPE_FIELD_NUMBER:I = 0x1

.field private static final serialVersionUID:J


# instance fields
.field private action_:Lcom/google/protobuf/Any;

.field private graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

.field private memoizedIsInitialized:B

.field private resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

.field private type_:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->PARSER:Lcom/google/protobuf/Parser;

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
    iput-byte v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->memoizedIsInitialized:B

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->type_:I

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 8
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;-><init>()V

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_9

    .line 9
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/16 v3, 0x8

    if-eq v1, v3, :cond_8

    const/16 v3, 0x12

    const/4 v4, 0x0

    if-eq v1, v3, :cond_6

    const/16 v3, 0x1a

    if-eq v1, v3, :cond_4

    const/16 v3, 0x2a

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

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_2

    .line 11
    :cond_2
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    if-eqz v1, :cond_3

    .line 12
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    move-result-object v4

    .line 13
    :cond_3
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->parser()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    if-eqz v4, :cond_0

    .line 14
    invoke-virtual {v4, v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    .line 15
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    goto :goto_0

    .line 16
    :cond_4
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    if-eqz v1, :cond_5

    .line 17
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->toBuilder()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v4

    .line 18
    :cond_5
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->parser()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    if-eqz v4, :cond_0

    .line 19
    invoke-virtual {v4, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeFrom(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 20
    invoke-virtual {v4}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->buildPartial()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    goto :goto_0

    .line 21
    :cond_6
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->action_:Lcom/google/protobuf/Any;

    if-eqz v1, :cond_7

    .line 22
    invoke-virtual {v1}, Lcom/google/protobuf/Any;->toBuilder()Lcom/google/protobuf/Any$Builder;

    move-result-object v4

    .line 23
    :cond_7
    invoke-static {}, Lcom/google/protobuf/Any;->parser()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/Any;

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->action_:Lcom/google/protobuf/Any;

    if-eqz v4, :cond_0

    .line 24
    invoke-virtual {v4, v1}, Lcom/google/protobuf/Any$Builder;->mergeFrom(Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any$Builder;

    .line 25
    invoke-virtual {v4}, Lcom/google/protobuf/Any$Builder;->buildPartial()Lcom/google/protobuf/Any;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->action_:Lcom/google/protobuf/Any;

    goto/16 :goto_0

    .line 26
    :cond_8
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readEnum()I

    move-result v1

    .line 27
    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->type_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 28
    :goto_1
    :try_start_1
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 29
    invoke-virtual {p2, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 30
    :goto_2
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    :goto_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->makeExtensionsImmutable()V

    .line 32
    throw p1

    .line 33
    :cond_9
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
    invoke-direct {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

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
    iput-byte p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic access$6000()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$6200(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->type_:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$6202(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->type_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$6302(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->action_:Lcom/google/protobuf/Any;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$6402(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$6502(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$6600()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$5600()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->PARSER:Lcom/google/protobuf/Parser;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->PARSER:Lcom/google/protobuf/Parser;

    .line 10
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->PARSER:Lcom/google/protobuf/Parser;

    .line 12
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->PARSER:Lcom/google/protobuf/Parser;

    .line 6
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->PARSER:Lcom/google/protobuf/Parser;

    .line 8
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->PARSER:Lcom/google/protobuf/Parser;

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
    instance-of v1, p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

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
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 15
    .line 16
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->type_:I

    .line 17
    .line 18
    iget v2, p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->type_:I

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-ne v1, v2, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasAction()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasAction()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-ne v1, v2, :cond_2

    .line 32
    .line 33
    move v1, v0

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move v1, v3

    .line 36
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasAction()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_4

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    move v1, v0

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    move v1, v3

    .line 61
    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-ne v1, v2, :cond_5

    .line 72
    .line 73
    move v1, v0

    .line 74
    goto :goto_2

    .line 75
    :cond_5
    move v1, v3

    .line 76
    :goto_2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_7

    .line 81
    .line 82
    if-eqz v1, :cond_6

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getGraphSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getGraphSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    move v1, v0

    .line 99
    goto :goto_3

    .line 100
    :cond_6
    move v1, v3

    .line 101
    :cond_7
    :goto_3
    if-eqz v1, :cond_8

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasResetData()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasResetData()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-ne v1, v2, :cond_8

    .line 112
    .line 113
    move v1, v0

    .line 114
    goto :goto_4

    .line 115
    :cond_8
    move v1, v3

    .line 116
    :goto_4
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasResetData()Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_a

    .line 121
    .line 122
    if-eqz v1, :cond_9

    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {v1, p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_9

    .line 137
    .line 138
    return v0

    .line 139
    :cond_9
    return v3

    .line 140
    :cond_a
    return v1
.end method

.method public getAction()Lcom/google/protobuf/Any;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->action_:Lcom/google/protobuf/Any;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/Any;->getDefaultInstance()Lcom/google/protobuf/Any;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getActionOrBuilder()Lcom/google/protobuf/AnyOrBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    return-object v0
.end method

.method public getGraphSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getGraphSnapshotOrBuilder()Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getGraphSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getResetDataOrBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetDataOrBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

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
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->type_:I

    .line 8
    .line 9
    sget-object v1, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->getNumber()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->type_:I

    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

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
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->action_:Lcom/google/protobuf/Any;

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/2addr v0, v1

    .line 40
    :cond_2
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getGraphSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v0, v1

    .line 54
    :cond_3
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    const/4 v1, 0x5

    .line 59
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/2addr v0, v1

    .line 68
    :cond_4
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 69
    .line 70
    return v0
.end method

.method public getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->type_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->valueOf(I)Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->UNRECOGNIZED:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getTypeValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->type_:I

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

.method public hasAction()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->action_:Lcom/google/protobuf/Any;

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

.method public hasGraphSnapshot()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

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

.method public hasResetData()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

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
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->type_:I

    .line 24
    .line 25
    add-int/2addr v1, v0

    .line 26
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasAction()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/google/protobuf/Any;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    add-int/2addr v1, v0

    .line 47
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    mul-int/lit8 v1, v1, 0x25

    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x3

    .line 56
    .line 57
    mul-int/lit8 v1, v1, 0x35

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getGraphSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->hashCode()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    add-int/2addr v1, v0

    .line 68
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasResetData()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    mul-int/lit8 v1, v1, 0x25

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x5

    .line 77
    .line 78
    mul-int/lit8 v1, v1, 0x35

    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    add-int/2addr v1, v0

    .line 89
    :cond_3
    mul-int/lit8 v1, v1, 0x1d

    .line 90
    .line 91
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    add-int/2addr v1, v0

    .line 98
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 99
    .line 100
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$5700()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

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
    iget-byte v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 2

    .line 5
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/sketch/EzyDrawBoard$1;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 2

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;-><init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;-><init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V

    invoke-virtual {v0, p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

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
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->type_:I

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->getNumber()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->type_:I

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->action_:Lcom/google/protobuf/Any;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getGraphSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    const/4 v0, 0x5

    .line 46
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method
