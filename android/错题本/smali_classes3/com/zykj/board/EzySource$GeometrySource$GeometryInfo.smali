# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lb4/o1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzySource$GeometrySource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "GeometryInfo"
.end annotation


# static fields
.field public static final GEOMETRYTYPE_FIELD_NUMBER:I = 0x1

.field public static final PAINT_FIELD_NUMBER:I = 0x3

.field public static final POINTS_FIELD_NUMBER:I = 0x2

.field public static final a:Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

.field public static final b:Lcom/zykj/board/m0;

.field private static final serialVersionUID:J


# instance fields
.field private bitField0_:I

.field private geometryType_:I

.field private memoizedIsInitialized:B

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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->a:Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/m0;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/AbstractParser;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 4
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, -0x1

    .line 5
    iput-byte v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->memoizedIsInitialized:B

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->geometryType_:I

    .line 7
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->points_:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lb4/k1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->geometryType_:I

    const/4 p1, -0x1

    .line 3
    iput-byte p1, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->memoizedIsInitialized:B

    return-void
.end method

.method public static synthetic access$8900()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$9100(Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->points_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$9102(Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->points_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$9200(Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->geometryType_:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$9202(Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->geometryType_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$9302(Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPaint$Paint;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->paint_:Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$9476(Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->bitField0_:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->bitField0_:I

    .line 5
    .line 6
    return p1
.end method

.method public static synthetic access$9500()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static getDefaultInstance()Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->a:Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lb4/v1;->s:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/board/n0;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->a:Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->toBuilder()Lcom/zykj/board/n0;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;)Lcom/zykj/board/n0;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->a:Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->toBuilder()Lcom/zykj/board/n0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/board/n0;->k(Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;)V

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

    .line 12
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

    .line 14
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

    .line 8
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

    .line 10
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

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
    instance-of v1, p1, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

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
    check-cast p1, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 15
    .line 16
    iget v1, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->geometryType_:I

    .line 17
    .line 18
    iget v2, p1, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->geometryType_:I

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-eq v1, v2, :cond_2

    .line 22
    .line 23
    return v3

    .line 24
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getPointsList()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getPointsList()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    return v3

    .line 39
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->hasPaint()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->hasPaint()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eq v1, v2, :cond_4

    .line 48
    .line 49
    return v3

    .line 50
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->hasPaint()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_5

    .line 69
    .line 70
    return v3

    .line 71
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-nez p1, :cond_6

    .line 84
    .line 85
    return v3

    .line 86
    :cond_6
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getDefaultInstanceForType()Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getDefaultInstanceForType()Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->a:Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    return-object v0
.end method

.method public getGeometryType()Lcom/zykj/board/EzyGeometryEnum$GeometryEnum;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->geometryType_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/board/EzyGeometryEnum$GeometryEnum;->forNumber(I)Lcom/zykj/board/EzyGeometryEnum$GeometryEnum;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/zykj/board/EzyGeometryEnum$GeometryEnum;->UNRECOGNIZED:Lcom/zykj/board/EzyGeometryEnum$GeometryEnum;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getGeometryTypeValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->geometryType_:I

    .line 2
    .line 3
    return v0
.end method

.method public getPaint()Lcom/zykj/board/EzyPaint$Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->paint_:Lcom/zykj/board/EzyPaint$Paint;

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
    iget-object v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->paint_:Lcom/zykj/board/EzyPaint$Paint;

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
            "Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->b:Lcom/zykj/board/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPoints(I)Lcom/zykj/board/EzyPointF$PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->points_:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->points_:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->points_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointsOrBuilder(I)Lb4/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->points_:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->points_:Ljava/util/List;

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
    iget v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->geometryType_:I

    .line 8
    .line 9
    sget-object v1, Lcom/zykj/board/EzyGeometryEnum$GeometryEnum;->OVAL:Lcom/zykj/board/EzyGeometryEnum$GeometryEnum;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/zykj/board/EzyGeometryEnum$GeometryEnum;->getNumber()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    iget v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->geometryType_:I

    .line 20
    .line 21
    invoke-static {v3, v0}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v2

    .line 27
    :goto_0
    iget-object v1, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->points_:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-ge v2, v1, :cond_2

    .line 34
    .line 35
    iget-object v1, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->points_:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lcom/google/protobuf/MessageLite;

    .line 42
    .line 43
    const/4 v4, 0x2

    .line 44
    invoke-static {v4, v1}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/2addr v0, v1

    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    iget v1, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->bitField0_:I

    .line 53
    .line 54
    and-int/2addr v1, v3

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    const/4 v1, 0x3

    .line 58
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    add-int/2addr v0, v1

    .line 67
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    add-int/2addr v1, v0

    .line 76
    iput v1, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 77
    .line 78
    return v1
.end method

.method public hasPaint()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->bitField0_:I

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
    invoke-static {}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    iget v3, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->geometryType_:I

    .line 25
    .line 26
    add-int/2addr v0, v3

    .line 27
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getPointsCount()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-lez v3, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    invoke-static {v0, v1, v3, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getPointsList()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    add-int/2addr v0, v3

    .line 47
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->hasPaint()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    const/4 v3, 0x3

    .line 54
    invoke-static {v0, v1, v3, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Lcom/zykj/board/EzyPaint$Paint;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    add-int/2addr v0, v1

    .line 67
    :cond_2
    mul-int/lit8 v0, v0, 0x1d

    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/2addr v1, v0

    .line 78
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 79
    .line 80
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    sget-object v0, Lb4/v1;->t:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 4
    .line 5
    const-class v2, Lcom/zykj/board/n0;

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
    iget-byte v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->newBuilderForType()Lcom/zykj/board/n0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/n0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->newBuilderForType()Lcom/zykj/board/n0;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/board/n0;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->newBuilder()Lcom/zykj/board/n0;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/n0;
    .locals 1

    .line 5
    new-instance v0, Lcom/zykj/board/n0;

    .line 6
    invoke-direct {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    const/4 p1, 0x0

    .line 7
    iput p1, v0, Lcom/zykj/board/n0;->b:I

    .line 8
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, v0, Lcom/zykj/board/n0;->c:Ljava/util/List;

    .line 9
    invoke-static {}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->access$8900()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/board/n0;->j()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 11
    invoke-virtual {v0}, Lcom/zykj/board/n0;->i()Lcom/google/protobuf/SingleFieldBuilderV3;

    :cond_0
    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->toBuilder()Lcom/zykj/board/n0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->toBuilder()Lcom/zykj/board/n0;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/board/n0;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->a:Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/board/n0;

    .line 5
    invoke-direct {v0}, Lcom/zykj/board/n0;-><init>()V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lcom/zykj/board/n0;

    .line 7
    invoke-direct {v0}, Lcom/zykj/board/n0;-><init>()V

    .line 8
    invoke-virtual {v0, p0}, Lcom/zykj/board/n0;->k(Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;)V

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
    iget v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->geometryType_:I

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/board/EzyGeometryEnum$GeometryEnum;->OVAL:Lcom/zykj/board/EzyGeometryEnum$GeometryEnum;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/board/EzyGeometryEnum$GeometryEnum;->getNumber()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    iget v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->geometryType_:I

    .line 13
    .line 14
    invoke-virtual {p1, v2, v0}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    iget-object v1, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->points_:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-ge v0, v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->points_:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/google/protobuf/MessageLite;

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    invoke-virtual {p1, v3, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget v0, p0, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->bitField0_:I

    .line 42
    .line 43
    and-int/2addr v0, v2

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    const/4 v0, 0x3

    .line 47
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method
