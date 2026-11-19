# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/EzyDrawBoard$DrawAreaOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DrawArea"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

.field public static final LEFTTOPPOINT_FIELD_NUMBER:I = 0x1

.field public static final MATRIX_FIELD_NUMBER:I = 0x3

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;",
            ">;"
        }
    .end annotation
.end field

.field public static final RIGHTBOTTOMPOINT_FIELD_NUMBER:I = 0x2

.field private static final serialVersionUID:J


# instance fields
.field private bitField0_:I

.field private leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

.field private matrixMemoizedSerializedSize:I

.field private matrix_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private memoizedIsInitialized:B

.field private rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->PARSER:Lcom/google/protobuf/Parser;

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
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrixMemoizedSerializedSize:I

    .line 8
    iput-byte v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->memoizedIsInitialized:B

    .line 9
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7

    .line 10
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    :goto_0
    const/4 v2, 0x4

    if-nez v0, :cond_c

    .line 11
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    const/16 v5, 0xa

    const/4 v6, 0x0

    if-eq v3, v5, :cond_9

    const/16 v5, 0x12

    if-eq v3, v5, :cond_7

    const/16 v5, 0x1a

    if-eq v3, v5, :cond_4

    const/16 v5, 0x1d

    if-eq v3, v5, :cond_2

    .line 12
    invoke-virtual {p1, v3}, Lcom/google/protobuf/CodedInputStream;->skipField(I)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_1
    move v0, v4

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_3

    :cond_2
    and-int/lit8 v3, v1, 0x4

    if-eq v3, v2, :cond_3

    .line 13
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

    move v1, v2

    .line 14
    :cond_3
    iget-object v3, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 15
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readRawVarint32()I

    move-result v3

    .line 16
    invoke-virtual {p1, v3}, Lcom/google/protobuf/CodedInputStream;->pushLimit(I)I

    move-result v3

    and-int/lit8 v4, v1, 0x4

    if-eq v4, v2, :cond_5

    .line 17
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v4

    if-lez v4, :cond_5

    .line 18
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

    move v1, v2

    .line 19
    :cond_5
    :goto_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v4

    if-lez v4, :cond_6

    .line 20
    iget-object v4, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 21
    :cond_6
    invoke-virtual {p1, v3}, Lcom/google/protobuf/CodedInputStream;->popLimit(I)V

    goto :goto_0

    .line 22
    :cond_7
    iget-object v3, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    if-eqz v3, :cond_8

    .line 23
    invoke-virtual {v3}, Lcom/zykj/sketch/GraphSnapshot$PointF;->toBuilder()Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    move-result-object v6

    .line 24
    :cond_8
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$PointF;->parser()Lcom/google/protobuf/Parser;

    move-result-object v3

    invoke-virtual {p1, v3, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v3

    check-cast v3, Lcom/zykj/sketch/GraphSnapshot$PointF;

    iput-object v3, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    if-eqz v6, :cond_0

    .line 25
    invoke-virtual {v6, v3}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->mergeFrom(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 26
    invoke-virtual {v6}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->buildPartial()Lcom/zykj/sketch/GraphSnapshot$PointF;

    move-result-object v3

    iput-object v3, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    goto/16 :goto_0

    .line 27
    :cond_9
    iget-object v3, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    if-eqz v3, :cond_a

    .line 28
    invoke-virtual {v3}, Lcom/zykj/sketch/GraphSnapshot$PointF;->toBuilder()Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    move-result-object v6

    .line 29
    :cond_a
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$PointF;->parser()Lcom/google/protobuf/Parser;

    move-result-object v3

    invoke-virtual {p1, v3, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v3

    check-cast v3, Lcom/zykj/sketch/GraphSnapshot$PointF;

    iput-object v3, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    if-eqz v6, :cond_0

    .line 30
    invoke-virtual {v6, v3}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->mergeFrom(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 31
    invoke-virtual {v6}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->buildPartial()Lcom/zykj/sketch/GraphSnapshot$PointF;

    move-result-object v3

    iput-object v3, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 32
    :goto_2
    :try_start_1
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 33
    invoke-virtual {p2, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 34
    :goto_3
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    and-int/lit8 p2, v1, 0x4

    if-ne p2, v2, :cond_b

    .line 35
    iget-object p2, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

    .line 36
    :cond_b
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->makeExtensionsImmutable()V

    .line 37
    throw p1

    :cond_c
    and-int/lit8 p1, v1, 0x4

    if-ne p1, v2, :cond_d

    .line 38
    iget-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

    .line 39
    :cond_d
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->makeExtensionsImmutable()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

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
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrixMemoizedSerializedSize:I

    .line 5
    iput-byte p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic access$19000()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$19202(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/GraphSnapshot$PointF;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$19302(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/GraphSnapshot$PointF;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$19400(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$19402(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$19502(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->bitField0_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$19600()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$18600()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->PARSER:Lcom/google/protobuf/Parser;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1

    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->PARSER:Lcom/google/protobuf/Parser;

    .line 10
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1

    .line 11
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->PARSER:Lcom/google/protobuf/Parser;

    .line 12
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1

    .line 5
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->PARSER:Lcom/google/protobuf/Parser;

    .line 6
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1

    .line 7
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->PARSER:Lcom/google/protobuf/Parser;

    .line 8
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1

    .line 4
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->PARSER:Lcom/google/protobuf/Parser;

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
    instance-of v1, p1, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

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
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->hasLeftTopPoint()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->hasLeftTopPoint()Z

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->hasLeftTopPoint()Z

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$PointF;->equals(Ljava/lang/Object;)Z

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->hasRightBottomPoint()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->hasRightBottomPoint()Z

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->hasRightBottomPoint()Z

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$PointF;->equals(Ljava/lang/Object;)Z

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getMatrixList()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getMatrixList()Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    return-object v0
.end method

.method public getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getLeftTopPointOrBuilder()Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getMatrix(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

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

.method public getMatrixCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

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

.method public getMatrixList()Ljava/util/List;
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
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getRightBottomPointOrBuilder()Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

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
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

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
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getMatrixList()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    mul-int/lit8 v1, v1, 0x4

    .line 45
    .line 46
    add-int/2addr v0, v1

    .line 47
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getMatrixList()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    invoke-static {v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32SizeNoTag(I)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    add-int/2addr v0, v2

    .line 64
    :cond_3
    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrixMemoizedSerializedSize:I

    .line 65
    .line 66
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 67
    .line 68
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

.method public hasLeftTopPoint()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

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

.method public hasRightBottomPoint()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->hasLeftTopPoint()Z

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$PointF;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v1, v0

    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->hasRightBottomPoint()Z

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$PointF;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int/2addr v1, v0

    .line 59
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getMatrixCount()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-lez v0, :cond_3

    .line 64
    .line 65
    mul-int/lit8 v1, v1, 0x25

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x3

    .line 68
    .line 69
    mul-int/lit8 v1, v1, 0x35

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getMatrixList()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    add-int/2addr v1, v0

    .line 80
    :cond_3
    mul-int/lit8 v1, v1, 0x1d

    .line 81
    .line 82
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    add-int/2addr v1, v0

    .line 89
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 90
    .line 91
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$18700()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

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
    iget-byte v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 2

    .line 5
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/sketch/EzyDrawBoard$1;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->toBuilder()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 2

    .line 3
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->DEFAULT_INSTANCE:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;-><init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;-><init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V

    invoke-virtual {v0, p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getSerializedSize()I

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getMatrixList()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-lez v0, :cond_2

    .line 37
    .line 38
    const/16 v0, 0x1a

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeUInt32NoTag(I)V

    .line 41
    .line 42
    .line 43
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrixMemoizedSerializedSize:I

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeUInt32NoTag(I)V

    .line 46
    .line 47
    .line 48
    :cond_2
    const/4 v0, 0x0

    .line 49
    :goto_0
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-ge v0, v1, :cond_3

    .line 56
    .line 57
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->matrix_:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/Float;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {p1, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloatNoTag(F)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    return-void
.end method
