# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lb4/s;


# static fields
.field public static final LINECOLOR_FIELD_NUMBER:I = 0x1

.field public static final LINESPACE_FIELD_NUMBER:I = 0x2

.field public static final LINETYPE_FIELD_NUMBER:I = 0x3

.field public static final LINEWIDTH_FIELD_NUMBER:I = 0x4

.field public static final a:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

.field public static final b:Lb4/q;

.field private static final serialVersionUID:J


# instance fields
.field private lineColor_:I

.field private lineSpace_:F

.field private lineType_:I

.field private lineWidth_:F

.field private memoizedIsInitialized:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->a:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 7
    .line 8
    new-instance v0, Lb4/q;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/AbstractParser;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 7
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineColor_:I

    const/4 v1, 0x0

    .line 9
    iput v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineSpace_:F

    .line 10
    iput v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineWidth_:F

    const/4 v1, -0x1

    .line 11
    iput-byte v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->memoizedIsInitialized:B

    .line 12
    iput v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineType_:I

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lb4/m;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineColor_:I

    const/4 p2, 0x0

    .line 3
    iput p2, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineSpace_:F

    .line 4
    iput p1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineType_:I

    .line 5
    iput p2, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineWidth_:F

    const/4 p1, -0x1

    .line 6
    iput-byte p1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->memoizedIsInitialized:B

    return-void
.end method

.method public static synthetic access$4002(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineColor_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$4102(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineSpace_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$4200(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineType_:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$4202(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineType_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$4302(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineWidth_:F

    .line 2
    .line 3
    return p1
.end method

.method public static getDefaultInstance()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->a:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lb4/y;->e:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lb4/r;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->a:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->toBuilder()Lb4/r;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lb4/r;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->a:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->toBuilder()Lb4/r;

    move-result-object v0

    invoke-virtual {v0, p0}, Lb4/r;->g(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)V

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

    .line 12
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

    .line 14
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

    .line 8
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

    .line 10
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/board/EzyHeader$BackgroundLineConfig;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

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
    instance-of v1, p1, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

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
    check-cast p1, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getLineColor()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getLineColor()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eq v1, v2, :cond_2

    .line 26
    .line 27
    return v3

    .line 28
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getLineSpace()F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getLineSpace()F

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eq v1, v2, :cond_3

    .line 45
    .line 46
    return v3

    .line 47
    :cond_3
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineType_:I

    .line 48
    .line 49
    iget v2, p1, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineType_:I

    .line 50
    .line 51
    if-eq v1, v2, :cond_4

    .line 52
    .line 53
    return v3

    .line 54
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getLineWidth()F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getLineWidth()F

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eq v1, v2, :cond_5

    .line 71
    .line 72
    return v3

    .line 73
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_6

    .line 86
    .line 87
    return v3

    .line 88
    :cond_6
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getDefaultInstanceForType()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getDefaultInstanceForType()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->a:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    return-object v0
.end method

.method public getLineColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineColor_:I

    .line 2
    .line 3
    return v0
.end method

.method public getLineSpace()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineSpace_:F

    .line 2
    .line 3
    return v0
.end method

.method public getLineType()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineType_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->forNumber(I)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->UNRECOGNIZED:Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getLineTypeValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineType_:I

    .line 2
    .line 3
    return v0
.end method

.method public getLineWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineWidth_:F

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
            "Lcom/zykj/board/EzyHeader$BackgroundLineConfig;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->b:Lb4/q;

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
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineColor_:I

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
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineSpace_:F

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    iget v2, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineSpace_:F

    .line 28
    .line 29
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineType_:I

    .line 35
    .line 36
    sget-object v2, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->HORIZONTAL:Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->getNumber()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eq v1, v2, :cond_3

    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    iget v2, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineType_:I

    .line 46
    .line 47
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    :cond_3
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineWidth_:F

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    const/4 v1, 0x4

    .line 61
    iget v2, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineWidth_:F

    .line 62
    .line 63
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/2addr v0, v1

    .line 68
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v1, v0

    .line 77
    iput v1, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 78
    .line 79
    return v1
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
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    mul-int/lit8 v0, v0, 0x25

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    mul-int/lit8 v0, v0, 0x35

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getLineColor()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    add-int/2addr v1, v0

    .line 27
    mul-int/lit8 v1, v1, 0x25

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x2

    .line 30
    .line 31
    mul-int/lit8 v1, v1, 0x35

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getLineSpace()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    add-int/2addr v0, v1

    .line 42
    mul-int/lit8 v0, v0, 0x25

    .line 43
    .line 44
    add-int/lit8 v0, v0, 0x3

    .line 45
    .line 46
    mul-int/lit8 v0, v0, 0x35

    .line 47
    .line 48
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineType_:I

    .line 49
    .line 50
    add-int/2addr v0, v1

    .line 51
    mul-int/lit8 v0, v0, 0x25

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x4

    .line 54
    .line 55
    mul-int/lit8 v0, v0, 0x35

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getLineWidth()F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    add-int/2addr v1, v0

    .line 66
    mul-int/lit8 v1, v1, 0x1d

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    add-int/2addr v0, v1

    .line 77
    iput v0, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 78
    .line 79
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    sget-object v0, Lb4/y;->f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 4
    .line 5
    const-class v2, Lb4/r;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public newBuilderForType()Lb4/r;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->newBuilder()Lb4/r;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lb4/r;
    .locals 1

    .line 5
    new-instance v0, Lb4/r;

    .line 6
    invoke-direct {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    const/4 p1, 0x0

    .line 7
    iput p1, v0, Lb4/r;->d:I

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->newBuilderForType()Lb4/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lb4/r;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->newBuilderForType()Lb4/r;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public toBuilder()Lb4/r;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->a:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lb4/r;

    .line 5
    invoke-direct {v0}, Lb4/r;-><init>()V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lb4/r;

    .line 7
    invoke-direct {v0}, Lb4/r;-><init>()V

    .line 8
    invoke-virtual {v0, p0}, Lb4/r;->g(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->toBuilder()Lb4/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->toBuilder()Lb4/r;

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
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineColor_:I

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
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineSpace_:F

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineSpace_:F

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineType_:I

    .line 24
    .line 25
    sget-object v1, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->HORIZONTAL:Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->getNumber()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eq v0, v1, :cond_2

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineType_:I

    .line 35
    .line 36
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineWidth_:F

    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    const/4 v0, 0x4

    .line 48
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->lineWidth_:F

    .line 49
    .line 50
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method
