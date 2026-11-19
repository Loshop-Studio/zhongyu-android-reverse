# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "GraphChange"
.end annotation


# static fields
.field public static final CONTENT_FIELD_NUMBER:I = 0x4

.field public static final FILEPATH_FIELD_NUMBER:I = 0x8

.field public static final GRAPHENUM_FIELD_NUMBER:I = 0x2

.field public static final GRAPHID_FIELD_NUMBER:I = 0x1

.field public static final OUTRECT_FIELD_NUMBER:I = 0x3

.field public static final PAINT_FIELD_NUMBER:I = 0x5

.field public static final POINTS_FIELD_NUMBER:I = 0x6

.field public static final RENDERMATRIX_FIELD_NUMBER:I = 0x7

.field public static final a:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

.field public static final b:Lcom/zykj/board/n;

.field private static final serialVersionUID:J


# instance fields
.field private bitField0_:I

.field private volatile content_:Ljava/lang/Object;

.field private volatile filePath_:Ljava/lang/Object;

.field private graphEnum_:I

.field private volatile graphId_:Ljava/lang/Object;

.field private memoizedIsInitialized:B

.field private outRect_:Lcom/zykj/board/EzyRectF$RectF;

.field private paint_:Lcom/zykj/board/EzyPaint$Paint;

.field private points_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyPointF$PointF;",
            ">;"
        }
    .end annotation
.end field

.field private renderMatrix_:Lcom/zykj/board/EzyMatrix$Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->a:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/n;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/AbstractParser;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 7
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphId_:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 9
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphEnum_:I

    .line 10
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->content_:Ljava/lang/Object;

    .line 11
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->filePath_:Ljava/lang/Object;

    const/4 v2, -0x1

    .line 12
    iput-byte v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->memoizedIsInitialized:B

    .line 13
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphId_:Ljava/lang/Object;

    .line 14
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphEnum_:I

    .line 15
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->content_:Ljava/lang/Object;

    .line 16
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->points_:Ljava/util/List;

    .line 17
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->filePath_:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lb4/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    .line 2
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphId_:Ljava/lang/Object;

    const/4 p2, 0x0

    .line 3
    iput p2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphEnum_:I

    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->content_:Ljava/lang/Object;

    .line 5
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->filePath_:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 6
    iput-byte p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->memoizedIsInitialized:B

    return-void
.end method

.method public static synthetic access$4700()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$4900(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->points_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$4902(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->points_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$5000(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphId_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$5002(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphId_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$5100(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphEnum_:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$5102(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphEnum_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$5202(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyRectF$RectF;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->outRect_:Lcom/zykj/board/EzyRectF$RectF;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$5300(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->content_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$5302(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->content_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$5402(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPaint$Paint;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->paint_:Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$5502(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->renderMatrix_:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$5600(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->filePath_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$5602(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->filePath_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$5776(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->bitField0_:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->bitField0_:I

    .line 5
    .line 6
    return p1
.end method

.method public static synthetic access$5800()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$5900(Lcom/google/protobuf/ByteString;)V
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

.method public static synthetic access$6000(Lcom/google/protobuf/ByteString;)V
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

.method public static synthetic access$6100(Lcom/google/protobuf/ByteString;)V
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

.method public static getDefaultInstance()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->a:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lb4/f;->k:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/board/o;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->a:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->toBuilder()Lcom/zykj/board/o;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)Lcom/zykj/board/o;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->a:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->toBuilder()Lcom/zykj/board/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/board/o;->h(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

    .line 12
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

    .line 14
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

    .line 8
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

    .line 10
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

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
    instance-of v1, p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

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
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getGraphId()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getGraphId()Ljava/lang/String;

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
    if-nez v1, :cond_2

    .line 30
    .line 31
    return v2

    .line 32
    :cond_2
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphEnum_:I

    .line 33
    .line 34
    iget v3, p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphEnum_:I

    .line 35
    .line 36
    if-eq v1, v3, :cond_3

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasOutRect()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasOutRect()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eq v1, v3, :cond_4

    .line 48
    .line 49
    return v2

    .line 50
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasOutRect()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getOutRect()Lcom/zykj/board/EzyRectF$RectF;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getOutRect()Lcom/zykj/board/EzyRectF$RectF;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v1, v3}, Lcom/zykj/board/EzyRectF$RectF;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_5

    .line 69
    .line 70
    return v2

    .line 71
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getContent()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getContent()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_6

    .line 84
    .line 85
    return v2

    .line 86
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasPaint()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasPaint()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eq v1, v3, :cond_7

    .line 95
    .line 96
    return v2

    .line 97
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasPaint()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_8

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v1, v3}, Lcom/zykj/board/EzyPaint$Paint;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_8

    .line 116
    .line 117
    return v2

    .line 118
    :cond_8
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getPointsList()Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getPointsList()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_9

    .line 131
    .line 132
    return v2

    .line 133
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasRenderMatrix()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasRenderMatrix()Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eq v1, v3, :cond_a

    .line 142
    .line 143
    return v2

    .line 144
    :cond_a
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasRenderMatrix()Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_b

    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getRenderMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getRenderMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v1, v3}, Lcom/zykj/board/EzyMatrix$Matrix;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-nez v1, :cond_b

    .line 163
    .line 164
    return v2

    .line 165
    :cond_b
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getFilePath()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getFilePath()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-nez v1, :cond_c

    .line 178
    .line 179
    return v2

    .line 180
    :cond_c
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    if-nez p1, :cond_d

    .line 193
    .line 194
    return v2

    .line 195
    :cond_d
    return v0
.end method

.method public getContent()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->content_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->content_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getContentBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->content_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->content_:Ljava/lang/Object;

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

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getDefaultInstanceForType()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getDefaultInstanceForType()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->a:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    return-object v0
.end method

.method public getFilePath()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->filePath_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->filePath_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getFilePathBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->filePath_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->filePath_:Ljava/lang/Object;

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

.method public getGraphEnum()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphEnum_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->forNumber(I)Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->UNRECOGNIZED:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getGraphEnumValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphEnum_:I

    .line 2
    .line 3
    return v0
.end method

.method public getGraphId()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphId_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphId_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getGraphIdBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphId_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphId_:Ljava/lang/Object;

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

.method public getOutRect()Lcom/zykj/board/EzyRectF$RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->outRect_:Lcom/zykj/board/EzyRectF$RectF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->getDefaultInstance()Lcom/zykj/board/EzyRectF$RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getOutRectOrBuilder()Lb4/c1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->outRect_:Lcom/zykj/board/EzyRectF$RectF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->getDefaultInstance()Lcom/zykj/board/EzyRectF$RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getPaint()Lcom/zykj/board/EzyPaint$Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->paint_:Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->getDefaultInstance()Lcom/zykj/board/EzyPaint$Paint;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getPaintOrBuilder()Lb4/q0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->paint_:Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->getDefaultInstance()Lcom/zykj/board/EzyPaint$Paint;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->b:Lcom/zykj/board/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPoints(I)Lcom/zykj/board/EzyPointF$PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->points_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/board/EzyPointF$PointF;

    .line 8
    .line 9
    return-object p1
.end method

.method public getPointsCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->points_:Ljava/util/List;

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
            "Lcom/zykj/board/EzyPointF$PointF;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->points_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointsOrBuilder(I)Lb4/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->points_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lb4/v0;

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
            "Lb4/v0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->points_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRenderMatrix()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->renderMatrix_:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->getDefaultInstance()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getRenderMatrixOrBuilder()Lb4/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->renderMatrix_:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->getDefaultInstance()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
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
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphId_:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphId_:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v2, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v0, v1

    .line 25
    :goto_0
    iget v3, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphEnum_:I

    .line 26
    .line 27
    sget-object v4, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->BOUNDED_CONTAINER_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 28
    .line 29
    invoke-virtual {v4}, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->getNumber()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/4 v5, 0x2

    .line 34
    if-eq v3, v4, :cond_2

    .line 35
    .line 36
    iget v3, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphEnum_:I

    .line 37
    .line 38
    invoke-static {v5, v3}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    add-int/2addr v0, v3

    .line 43
    :cond_2
    iget v3, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->bitField0_:I

    .line 44
    .line 45
    and-int/2addr v2, v3

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    const/4 v2, 0x3

    .line 49
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getOutRect()Lcom/zykj/board/EzyRectF$RectF;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v2, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    add-int/2addr v0, v2

    .line 58
    :cond_3
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->content_:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-static {v2}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const/4 v3, 0x4

    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->content_:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {v3, v2}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    add-int/2addr v0, v2

    .line 74
    :cond_4
    iget v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->bitField0_:I

    .line 75
    .line 76
    and-int/2addr v2, v5

    .line 77
    if-eqz v2, :cond_5

    .line 78
    .line 79
    const/4 v2, 0x5

    .line 80
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-static {v2, v4}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    add-int/2addr v0, v2

    .line 89
    :cond_5
    :goto_1
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->points_:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-ge v1, v2, :cond_6

    .line 96
    .line 97
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->points_:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 104
    .line 105
    const/4 v4, 0x6

    .line 106
    invoke-static {v4, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    add-int/2addr v0, v2

    .line 111
    add-int/lit8 v1, v1, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_6
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->bitField0_:I

    .line 115
    .line 116
    and-int/2addr v1, v3

    .line 117
    if-eqz v1, :cond_7

    .line 118
    .line 119
    const/4 v1, 0x7

    .line 120
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getRenderMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    add-int/2addr v0, v1

    .line 129
    :cond_7
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->filePath_:Ljava/lang/Object;

    .line 130
    .line 131
    invoke-static {v1}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_8

    .line 136
    .line 137
    const/16 v1, 0x8

    .line 138
    .line 139
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->filePath_:Ljava/lang/Object;

    .line 140
    .line 141
    invoke-static {v1, v2}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    add-int/2addr v0, v1

    .line 146
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    add-int/2addr v1, v0

    .line 155
    iput v1, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 156
    .line 157
    return v1
.end method

.method public hasOutRect()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->bitField0_:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public hasPaint()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public hasRenderMatrix()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
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
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    const/16 v1, 0x25

    .line 17
    .line 18
    mul-int/2addr v0, v1

    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    const/16 v2, 0x35

    .line 22
    .line 23
    mul-int/2addr v0, v2

    .line 24
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getGraphId()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    add-int/2addr v3, v0

    .line 33
    mul-int/2addr v3, v1

    .line 34
    add-int/lit8 v3, v3, 0x2

    .line 35
    .line 36
    mul-int/2addr v3, v2

    .line 37
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphEnum_:I

    .line 38
    .line 39
    add-int/2addr v3, v0

    .line 40
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasOutRect()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    const/4 v0, 0x3

    .line 47
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getOutRect()Lcom/zykj/board/EzyRectF$RectF;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Lcom/zykj/board/EzyRectF$RectF;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    add-int/2addr v3, v0

    .line 60
    :cond_1
    const/4 v0, 0x4

    .line 61
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getContent()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    add-int/2addr v3, v0

    .line 74
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasPaint()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    const/4 v0, 0x5

    .line 81
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->hashCode()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    add-int/2addr v3, v0

    .line 94
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getPointsCount()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-lez v0, :cond_3

    .line 99
    .line 100
    const/4 v0, 0x6

    .line 101
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getPointsList()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    add-int/2addr v3, v0

    .line 114
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasRenderMatrix()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_4

    .line 119
    .line 120
    const/4 v0, 0x7

    .line 121
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getRenderMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->hashCode()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    add-int/2addr v3, v0

    .line 134
    :cond_4
    const/16 v0, 0x8

    .line 135
    .line 136
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getFilePath()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    add-int/2addr v1, v0

    .line 149
    mul-int/lit8 v1, v1, 0x1d

    .line 150
    .line 151
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    add-int/2addr v0, v1

    .line 160
    iput v0, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 161
    .line 162
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    sget-object v0, Lb4/f;->l:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    .line 4
    .line 5
    const-class v2, Lcom/zykj/board/o;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->newBuilderForType()Lcom/zykj/board/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/o;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->newBuilderForType()Lcom/zykj/board/o;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/board/o;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->newBuilder()Lcom/zykj/board/o;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/o;
    .locals 2

    .line 5
    new-instance v0, Lcom/zykj/board/o;

    .line 6
    invoke-direct {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 7
    const-string p1, ""

    iput-object p1, v0, Lcom/zykj/board/o;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 8
    iput v1, v0, Lcom/zykj/board/o;->c:I

    .line 9
    iput-object p1, v0, Lcom/zykj/board/o;->f:Ljava/lang/Object;

    .line 10
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 11
    iput-object p1, v0, Lcom/zykj/board/o;->m:Ljava/lang/Object;

    .line 12
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$4700()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 13
    invoke-virtual {v0}, Lcom/zykj/board/o;->getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 14
    invoke-virtual {v0}, Lcom/zykj/board/o;->f()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 15
    invoke-virtual {v0}, Lcom/zykj/board/o;->getPointsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 16
    invoke-virtual {v0}, Lcom/zykj/board/o;->g()Lcom/google/protobuf/SingleFieldBuilderV3;

    :cond_0
    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->toBuilder()Lcom/zykj/board/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->toBuilder()Lcom/zykj/board/o;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/board/o;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->a:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/board/o;

    .line 5
    invoke-direct {v0}, Lcom/zykj/board/o;-><init>()V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lcom/zykj/board/o;

    .line 7
    invoke-direct {v0}, Lcom/zykj/board/o;-><init>()V

    .line 8
    invoke-virtual {v0, p0}, Lcom/zykj/board/o;->h(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V

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
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphId_:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphId_:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphEnum_:I

    .line 16
    .line 17
    sget-object v2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->BOUNDED_CONTAINER_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->getNumber()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x2

    .line 24
    if-eq v0, v2, :cond_1

    .line 25
    .line 26
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->graphEnum_:I

    .line 27
    .line 28
    invoke-virtual {p1, v3, v0}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->bitField0_:I

    .line 32
    .line 33
    and-int/2addr v0, v1

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getOutRect()Lcom/zykj/board/EzyRectF$RectF;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->content_:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/4 v1, 0x4

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->content_:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->bitField0_:I

    .line 59
    .line 60
    and-int/2addr v0, v3

    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    const/4 v0, 0x5

    .line 64
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p1, v0, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 69
    .line 70
    .line 71
    :cond_4
    const/4 v0, 0x0

    .line 72
    :goto_0
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->points_:Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-ge v0, v2, :cond_5

    .line 79
    .line 80
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->points_:Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 87
    .line 88
    const/4 v3, 0x6

    .line 89
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v0, v0, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_5
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->bitField0_:I

    .line 96
    .line 97
    and-int/2addr v0, v1

    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    const/4 v0, 0x7

    .line 101
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getRenderMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 106
    .line 107
    .line 108
    :cond_6
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->filePath_:Ljava/lang/Object;

    .line 109
    .line 110
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_7

    .line 115
    .line 116
    const/16 v0, 0x8

    .line 117
    .line 118
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->filePath_:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method
