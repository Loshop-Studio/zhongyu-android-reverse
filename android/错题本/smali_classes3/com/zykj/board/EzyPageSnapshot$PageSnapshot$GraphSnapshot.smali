# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/board/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "GraphSnapshot"
.end annotation


# static fields
.field public static final BACKGROUNDCOLOR_FIELD_NUMBER:I = 0x8

.field public static final CHILDGRAPH_FIELD_NUMBER:I = 0x5

.field public static final CONTENT_FIELD_NUMBER:I = 0xa

.field public static final FILEPATH_FIELD_NUMBER:I = 0xc

.field public static final GRAPHENUM_FIELD_NUMBER:I = 0x2

.field public static final ID_FIELD_NUMBER:I = 0x1

.field public static final MATRIX_FIELD_NUMBER:I = 0x4

.field public static final OUTRECT_FIELD_NUMBER:I = 0x3

.field public static final PAINT_FIELD_NUMBER:I = 0x9

.field public static final POINTLIST_FIELD_NUMBER:I = 0xb

.field public static final SOURCEFILENAME_FIELD_NUMBER:I = 0x6

.field public static final SOURCEID_FIELD_NUMBER:I = 0x7

.field public static final a:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

.field public static final b:Lcom/zykj/board/c0;

.field private static final serialVersionUID:J


# instance fields
.field private backgroundColor_:I

.field private bitField0_:I

.field private childGraph_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;",
            ">;"
        }
    .end annotation
.end field

.field private volatile content_:Ljava/lang/Object;

.field private volatile filePath_:Ljava/lang/Object;

.field private graphEnum_:I

.field private volatile id_:Ljava/lang/Object;

.field private matrix_:Lcom/zykj/board/EzyMatrix$Matrix;

.field private memoizedIsInitialized:B

.field private outRect_:Lcom/zykj/board/EzyRectF$RectF;

.field private paint_:Lcom/zykj/board/EzyPaint$Paint;

.field private pointList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyPointF$PointF;",
            ">;"
        }
    .end annotation
.end field

.field private volatile sourceFileName_:Ljava/lang/Object;

.field private sourceId_:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/c0;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/AbstractParser;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 10
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->id_:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 12
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->graphEnum_:I

    .line 13
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceFileName_:Ljava/lang/Object;

    .line 14
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceId_:I

    .line 15
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->backgroundColor_:I

    .line 16
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->content_:Ljava/lang/Object;

    .line 17
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->filePath_:Ljava/lang/Object;

    const/4 v2, -0x1

    .line 18
    iput-byte v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->memoizedIsInitialized:B

    .line 19
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->id_:Ljava/lang/Object;

    .line 20
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->graphEnum_:I

    .line 21
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->childGraph_:Ljava/util/List;

    .line 22
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceFileName_:Ljava/lang/Object;

    .line 23
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->content_:Ljava/lang/Object;

    .line 24
    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->pointList_:Ljava/util/List;

    .line 25
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->filePath_:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lb4/k0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    .line 2
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->id_:Ljava/lang/Object;

    const/4 p2, 0x0

    .line 3
    iput p2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->graphEnum_:I

    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceFileName_:Ljava/lang/Object;

    .line 5
    iput p2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceId_:I

    .line 6
    iput p2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->backgroundColor_:I

    .line 7
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->content_:Ljava/lang/Object;

    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->filePath_:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 9
    iput-byte p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->memoizedIsInitialized:B

    return-void
.end method

.method public static synthetic access$1000(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->id_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1002(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->id_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1100(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->graphEnum_:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1102(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->graphEnum_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1202(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyRectF$RectF;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->outRect_:Lcom/zykj/board/EzyRectF$RectF;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1302(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->matrix_:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1400(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceFileName_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1402(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceFileName_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1502(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceId_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1602(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->backgroundColor_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1702(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPaint$Paint;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->paint_:Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1800(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->content_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1802(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->content_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1900(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->filePath_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1902(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->filePath_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2076(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->bitField0_:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->bitField0_:I

    .line 5
    .line 6
    return p1
.end method

.method public static synthetic access$2100()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$2200()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$2300(Lcom/google/protobuf/ByteString;)V
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

.method public static synthetic access$2400(Lcom/google/protobuf/ByteString;)V
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

.method public static synthetic access$2500(Lcom/google/protobuf/ByteString;)V
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

.method public static synthetic access$2600(Lcom/google/protobuf/ByteString;)V
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

.method public static synthetic access$600()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$800(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->childGraph_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$802(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->childGraph_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$900(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->pointList_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$902(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->pointList_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static getDefaultInstance()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lb4/m0;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/board/d0;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->toBuilder()Lcom/zykj/board/d0;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/d0;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->toBuilder()Lcom/zykj/board/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/board/d0;->l(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)V

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

    .line 12
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

    .line 14
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

    .line 8
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

    .line 10
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

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
    instance-of v1, p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

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
    check-cast p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getId()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getId()Ljava/lang/String;

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
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->graphEnum_:I

    .line 33
    .line 34
    iget v3, p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->graphEnum_:I

    .line 35
    .line 36
    if-eq v1, v3, :cond_3

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasOutRect()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasOutRect()Z

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasOutRect()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getOutRect()Lcom/zykj/board/EzyRectF$RectF;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getOutRect()Lcom/zykj/board/EzyRectF$RectF;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasMatrix()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasMatrix()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eq v1, v3, :cond_6

    .line 80
    .line 81
    return v2

    .line 82
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasMatrix()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_7

    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v1, v3}, Lcom/zykj/board/EzyMatrix$Matrix;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_7

    .line 101
    .line 102
    return v2

    .line 103
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphList()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphList()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getSourceFileName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getSourceFileName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getSourceId()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getSourceId()I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getBackgroundColor()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getBackgroundColor()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eq v1, v3, :cond_b

    .line 153
    .line 154
    return v2

    .line 155
    :cond_b
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasPaint()Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasPaint()Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eq v1, v3, :cond_c

    .line 164
    .line 165
    return v2

    .line 166
    :cond_c
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasPaint()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_d

    .line 171
    .line 172
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-virtual {v1, v3}, Lcom/zykj/board/EzyPaint$Paint;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-nez v1, :cond_d

    .line 185
    .line 186
    return v2

    .line 187
    :cond_d
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getContent()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getContent()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-nez v1, :cond_e

    .line 200
    .line 201
    return v2

    .line 202
    :cond_e
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getPointListList()Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getPointListList()Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-nez v1, :cond_f

    .line 215
    .line 216
    return v2

    .line 217
    :cond_f
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getFilePath()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getFilePath()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-nez v1, :cond_10

    .line 230
    .line 231
    return v2

    .line 232
    :cond_10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    if-nez p1, :cond_11

    .line 245
    .line 246
    return v2

    .line 247
    :cond_11
    return v0
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->backgroundColor_:I

    .line 2
    .line 3
    return v0
.end method

.method public getChildGraph(I)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->childGraph_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 8
    .line 9
    return-object p1
.end method

.method public getChildGraphCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->childGraph_:Ljava/util/List;

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

.method public getChildGraphList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->childGraph_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getChildGraphOrBuilder(I)Lcom/zykj/board/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->childGraph_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/board/e0;

    .line 8
    .line 9
    return-object p1
.end method

.method public getChildGraphOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/board/e0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->childGraph_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getContent()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->content_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->content_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getContentBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->content_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->content_:Ljava/lang/Object;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getDefaultInstanceForType()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getDefaultInstanceForType()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    return-object v0
.end method

.method public getFilePath()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->filePath_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->filePath_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getFilePathBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->filePath_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->filePath_:Ljava/lang/Object;

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
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->graphEnum_:I

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
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->graphEnum_:I

    .line 2
    .line 3
    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->id_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->id_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getIdBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->id_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->id_:Ljava/lang/Object;

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

.method public getMatrix()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->matrix_:Lcom/zykj/board/EzyMatrix$Matrix;

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

.method public getMatrixOrBuilder()Lb4/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->matrix_:Lcom/zykj/board/EzyMatrix$Matrix;

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

.method public getOutRect()Lcom/zykj/board/EzyRectF$RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->outRect_:Lcom/zykj/board/EzyRectF$RectF;

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
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->outRect_:Lcom/zykj/board/EzyRectF$RectF;

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
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->paint_:Lcom/zykj/board/EzyPaint$Paint;

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
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->paint_:Lcom/zykj/board/EzyPaint$Paint;

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
            "Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Lcom/zykj/board/c0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointList(I)Lcom/zykj/board/EzyPointF$PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->pointList_:Ljava/util/List;

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

.method public getPointListCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->pointList_:Ljava/util/List;

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

.method public getPointListList()Ljava/util/List;
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
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->pointList_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointListOrBuilder(I)Lb4/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->pointList_:Ljava/util/List;

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

.method public getPointListOrBuilderList()Ljava/util/List;
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
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->pointList_:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->id_:Ljava/lang/Object;

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
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->id_:Ljava/lang/Object;

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
    iget v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->graphEnum_:I

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
    iget v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->graphEnum_:I

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
    iget v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->bitField0_:I

    .line 44
    .line 45
    and-int/2addr v2, v3

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    const/4 v2, 0x3

    .line 49
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getOutRect()Lcom/zykj/board/EzyRectF$RectF;

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
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->bitField0_:I

    .line 59
    .line 60
    and-int/2addr v2, v5

    .line 61
    const/4 v3, 0x4

    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v3, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    add-int/2addr v0, v2

    .line 73
    :cond_4
    move v2, v1

    .line 74
    :goto_1
    iget-object v4, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->childGraph_:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-ge v2, v4, :cond_5

    .line 81
    .line 82
    iget-object v4, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->childGraph_:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Lcom/google/protobuf/MessageLite;

    .line 89
    .line 90
    const/4 v5, 0x5

    .line 91
    invoke-static {v5, v4}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    add-int/2addr v0, v4

    .line 96
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceFileName_:Ljava/lang/Object;

    .line 100
    .line 101
    invoke-static {v2}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-nez v2, :cond_6

    .line 106
    .line 107
    const/4 v2, 0x6

    .line 108
    iget-object v4, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceFileName_:Ljava/lang/Object;

    .line 109
    .line 110
    invoke-static {v2, v4}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    add-int/2addr v0, v2

    .line 115
    :cond_6
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceId_:I

    .line 116
    .line 117
    if-eqz v2, :cond_7

    .line 118
    .line 119
    const/4 v4, 0x7

    .line 120
    invoke-static {v4, v2}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    add-int/2addr v0, v2

    .line 125
    :cond_7
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->backgroundColor_:I

    .line 126
    .line 127
    if-eqz v2, :cond_8

    .line 128
    .line 129
    const/16 v4, 0x8

    .line 130
    .line 131
    invoke-static {v4, v2}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    add-int/2addr v0, v2

    .line 136
    :cond_8
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->bitField0_:I

    .line 137
    .line 138
    and-int/2addr v2, v3

    .line 139
    if-eqz v2, :cond_9

    .line 140
    .line 141
    const/16 v2, 0x9

    .line 142
    .line 143
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-static {v2, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    add-int/2addr v0, v2

    .line 152
    :cond_9
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->content_:Ljava/lang/Object;

    .line 153
    .line 154
    invoke-static {v2}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-nez v2, :cond_a

    .line 159
    .line 160
    const/16 v2, 0xa

    .line 161
    .line 162
    iget-object v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->content_:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-static {v2, v3}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    add-int/2addr v0, v2

    .line 169
    :cond_a
    :goto_2
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->pointList_:Ljava/util/List;

    .line 170
    .line 171
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-ge v1, v2, :cond_b

    .line 176
    .line 177
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->pointList_:Ljava/util/List;

    .line 178
    .line 179
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 184
    .line 185
    const/16 v3, 0xb

    .line 186
    .line 187
    invoke-static {v3, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    add-int/2addr v0, v2

    .line 192
    add-int/lit8 v1, v1, 0x1

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_b
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->filePath_:Ljava/lang/Object;

    .line 196
    .line 197
    invoke-static {v1}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-nez v1, :cond_c

    .line 202
    .line 203
    const/16 v1, 0xc

    .line 204
    .line 205
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->filePath_:Ljava/lang/Object;

    .line 206
    .line 207
    invoke-static {v1, v2}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    add-int/2addr v0, v1

    .line 212
    :cond_c
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    add-int/2addr v1, v0

    .line 221
    iput v1, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 222
    .line 223
    return v1
.end method

.method public getSourceFileName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceFileName_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceFileName_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getSourceFileNameBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceFileName_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceFileName_:Ljava/lang/Object;

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

.method public getSourceId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceId_:I

    .line 2
    .line 3
    return v0
.end method

.method public hasMatrix()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->bitField0_:I

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

.method public hasOutRect()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->bitField0_:I

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
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->bitField0_:I

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
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getId()Ljava/lang/String;

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
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->graphEnum_:I

    .line 38
    .line 39
    add-int/2addr v3, v0

    .line 40
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasOutRect()Z

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getOutRect()Lcom/zykj/board/EzyRectF$RectF;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasMatrix()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    const/4 v0, 0x4

    .line 67
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    add-int/2addr v3, v0

    .line 80
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphCount()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-lez v0, :cond_3

    .line 85
    .line 86
    const/4 v0, 0x5

    .line 87
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphList()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    add-int/2addr v3, v0

    .line 100
    :cond_3
    const/4 v0, 0x6

    .line 101
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getSourceFileName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    add-int/2addr v3, v0

    .line 114
    mul-int/2addr v3, v1

    .line 115
    add-int/lit8 v3, v3, 0x7

    .line 116
    .line 117
    mul-int/2addr v3, v2

    .line 118
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getSourceId()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    add-int/2addr v0, v3

    .line 123
    mul-int/2addr v0, v1

    .line 124
    add-int/lit8 v0, v0, 0x8

    .line 125
    .line 126
    mul-int/2addr v0, v2

    .line 127
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getBackgroundColor()I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    add-int/2addr v3, v0

    .line 132
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasPaint()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_4

    .line 137
    .line 138
    const/16 v0, 0x9

    .line 139
    .line 140
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->hashCode()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    add-int/2addr v3, v0

    .line 153
    :cond_4
    const/16 v0, 0xa

    .line 154
    .line 155
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getContent()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    add-int/2addr v3, v0

    .line 168
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getPointListCount()I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-lez v0, :cond_5

    .line 173
    .line 174
    const/16 v0, 0xb

    .line 175
    .line 176
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getPointListList()Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    add-int/2addr v3, v0

    .line 189
    :cond_5
    const/16 v0, 0xc

    .line 190
    .line 191
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getFilePath()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    add-int/2addr v1, v0

    .line 204
    mul-int/lit8 v1, v1, 0x1d

    .line 205
    .line 206
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    add-int/2addr v0, v1

    .line 215
    iput v0, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 216
    .line 217
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    sget-object v0, Lb4/m0;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 4
    .line 5
    const-class v2, Lcom/zykj/board/d0;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->newBuilderForType()Lcom/zykj/board/d0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/d0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->newBuilderForType()Lcom/zykj/board/d0;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/board/d0;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->newBuilder()Lcom/zykj/board/d0;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/d0;
    .locals 2

    .line 5
    new-instance v0, Lcom/zykj/board/d0;

    .line 6
    invoke-direct {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 7
    const-string p1, ""

    iput-object p1, v0, Lcom/zykj/board/d0;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 8
    iput v1, v0, Lcom/zykj/board/d0;->c:I

    .line 9
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lcom/zykj/board/d0;->h:Ljava/util/List;

    .line 10
    iput-object p1, v0, Lcom/zykj/board/d0;->j:Ljava/lang/Object;

    .line 11
    iput-object p1, v0, Lcom/zykj/board/d0;->o:Ljava/lang/Object;

    .line 12
    iput-object v1, v0, Lcom/zykj/board/d0;->p:Ljava/util/List;

    .line 13
    iput-object p1, v0, Lcom/zykj/board/d0;->r:Ljava/lang/Object;

    .line 14
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->access$600()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 15
    invoke-virtual {v0}, Lcom/zykj/board/d0;->i()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 16
    invoke-virtual {v0}, Lcom/zykj/board/d0;->h()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 17
    invoke-virtual {v0}, Lcom/zykj/board/d0;->getChildGraphFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 18
    invoke-virtual {v0}, Lcom/zykj/board/d0;->j()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 19
    invoke-virtual {v0}, Lcom/zykj/board/d0;->k()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    :cond_0
    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->toBuilder()Lcom/zykj/board/d0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->toBuilder()Lcom/zykj/board/d0;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/board/d0;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/board/d0;

    .line 5
    invoke-direct {v0}, Lcom/zykj/board/d0;-><init>()V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lcom/zykj/board/d0;

    .line 7
    invoke-direct {v0}, Lcom/zykj/board/d0;-><init>()V

    .line 8
    invoke-virtual {v0, p0}, Lcom/zykj/board/d0;->l(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)V

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->id_:Ljava/lang/Object;

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
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->id_:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->graphEnum_:I

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
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->graphEnum_:I

    .line 27
    .line 28
    invoke-virtual {p1, v3, v0}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->bitField0_:I

    .line 32
    .line 33
    and-int/2addr v0, v1

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getOutRect()Lcom/zykj/board/EzyRectF$RectF;

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
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->bitField0_:I

    .line 45
    .line 46
    and-int/2addr v0, v3

    .line 47
    const/4 v1, 0x4

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    const/4 v0, 0x0

    .line 58
    move v2, v0

    .line 59
    :goto_0
    iget-object v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->childGraph_:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-ge v2, v3, :cond_4

    .line 66
    .line 67
    iget-object v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->childGraph_:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lcom/google/protobuf/MessageLite;

    .line 74
    .line 75
    const/4 v4, 0x5

    .line 76
    invoke-virtual {p1, v4, v3}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceFileName_:Ljava/lang/Object;

    .line 83
    .line 84
    invoke-static {v2}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-nez v2, :cond_5

    .line 89
    .line 90
    const/4 v2, 0x6

    .line 91
    iget-object v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceFileName_:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-static {p1, v2, v3}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_5
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->sourceId_:I

    .line 97
    .line 98
    if-eqz v2, :cond_6

    .line 99
    .line 100
    const/4 v3, 0x7

    .line 101
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 102
    .line 103
    .line 104
    :cond_6
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->backgroundColor_:I

    .line 105
    .line 106
    if-eqz v2, :cond_7

    .line 107
    .line 108
    const/16 v3, 0x8

    .line 109
    .line 110
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 111
    .line 112
    .line 113
    :cond_7
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->bitField0_:I

    .line 114
    .line 115
    and-int/2addr v1, v2

    .line 116
    if-eqz v1, :cond_8

    .line 117
    .line 118
    const/16 v1, 0x9

    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 125
    .line 126
    .line 127
    :cond_8
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->content_:Ljava/lang/Object;

    .line 128
    .line 129
    invoke-static {v1}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_9

    .line 134
    .line 135
    const/16 v1, 0xa

    .line 136
    .line 137
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->content_:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-static {p1, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_9
    :goto_1
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->pointList_:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-ge v0, v1, :cond_a

    .line 149
    .line 150
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->pointList_:Ljava/util/List;

    .line 151
    .line 152
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Lcom/google/protobuf/MessageLite;

    .line 157
    .line 158
    const/16 v2, 0xb

    .line 159
    .line 160
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 161
    .line 162
    .line 163
    add-int/lit8 v0, v0, 0x1

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_a
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->filePath_:Ljava/lang/Object;

    .line 167
    .line 168
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-nez v0, :cond_b

    .line 173
    .line 174
    const/16 v0, 0xc

    .line 175
    .line 176
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->filePath_:Ljava/lang/Object;

    .line 177
    .line 178
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 186
    .line 187
    .line 188
    return-void
.end method
