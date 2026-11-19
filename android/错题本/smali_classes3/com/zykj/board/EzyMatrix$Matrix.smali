# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyMatrix$Matrix;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lb4/c0;


# static fields
.field public static final EVENTTIME_FIELD_NUMBER:I = 0x1

.field public static final PERSP0_FIELD_NUMBER:I = 0x8

.field public static final PERSP1_FIELD_NUMBER:I = 0x9

.field public static final PERSP2_FIELD_NUMBER:I = 0xa

.field public static final SCALEX_FIELD_NUMBER:I = 0x2

.field public static final SCALEY_FIELD_NUMBER:I = 0x6

.field public static final SKEWX_FIELD_NUMBER:I = 0x3

.field public static final SKEWY_FIELD_NUMBER:I = 0x5

.field public static final TRANSX_FIELD_NUMBER:I = 0x4

.field public static final TRANSY_FIELD_NUMBER:I = 0x7

.field public static final a:Lcom/zykj/board/EzyMatrix$Matrix;

.field public static final b:Lb4/a0;

.field private static final serialVersionUID:J


# instance fields
.field private eventTime_:J

.field private memoizedIsInitialized:B

.field private perSp0_:F

.field private perSp1_:F

.field private perSp2_:F

.field private scaleX_:F

.field private scaleY_:F

.field private skewX_:F

.field private skewY_:F

.field private transX_:F

.field private transY_:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyMatrix$Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->a:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 7
    .line 8
    new-instance v0, Lb4/a0;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/AbstractParser;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 13
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const-wide/16 v0, 0x0

    .line 14
    iput-wide v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->eventTime_:J

    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleX_:F

    .line 16
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewX_:F

    .line 17
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transX_:F

    .line 18
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewY_:F

    .line 19
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleY_:F

    .line 20
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transY_:F

    .line 21
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp0_:F

    .line 22
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp1_:F

    .line 23
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp2_:F

    const/4 v0, -0x1

    .line 24
    iput-byte v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->memoizedIsInitialized:B

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lb4/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const-wide/16 p1, 0x0

    .line 2
    iput-wide p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->eventTime_:J

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleX_:F

    .line 4
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewX_:F

    .line 5
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transX_:F

    .line 6
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewY_:F

    .line 7
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleY_:F

    .line 8
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transY_:F

    .line 9
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp0_:F

    .line 10
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp1_:F

    .line 11
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp2_:F

    const/4 p1, -0x1

    .line 12
    iput-byte p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->memoizedIsInitialized:B

    return-void
.end method

.method public static synthetic access$1002(Lcom/zykj/board/EzyMatrix$Matrix;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleY_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1102(Lcom/zykj/board/EzyMatrix$Matrix;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transY_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1202(Lcom/zykj/board/EzyMatrix$Matrix;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp0_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1302(Lcom/zykj/board/EzyMatrix$Matrix;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp1_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1402(Lcom/zykj/board/EzyMatrix$Matrix;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp2_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$502(Lcom/zykj/board/EzyMatrix$Matrix;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->eventTime_:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic access$602(Lcom/zykj/board/EzyMatrix$Matrix;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleX_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$702(Lcom/zykj/board/EzyMatrix$Matrix;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewX_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$802(Lcom/zykj/board/EzyMatrix$Matrix;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transX_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$902(Lcom/zykj/board/EzyMatrix$Matrix;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewY_:F

    .line 2
    .line 3
    return p1
.end method

.method public static getDefaultInstance()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->a:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lb4/d0;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lb4/b0;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->a:Lcom/zykj/board/EzyMatrix$Matrix;

    invoke-virtual {v0}, Lcom/zykj/board/EzyMatrix$Matrix;->toBuilder()Lb4/b0;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/board/EzyMatrix$Matrix;)Lb4/b0;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->a:Lcom/zykj/board/EzyMatrix$Matrix;

    invoke-virtual {v0}, Lcom/zykj/board/EzyMatrix$Matrix;->toBuilder()Lb4/b0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lb4/b0;->g(Lcom/zykj/board/EzyMatrix$Matrix;)V

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyMatrix$Matrix;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyMatrix$Matrix;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyMatrix$Matrix;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyMatrix$Matrix;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

    .line 12
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyMatrix$Matrix;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

    .line 14
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyMatrix$Matrix;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

    .line 8
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyMatrix$Matrix;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

    .line 10
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyMatrix$Matrix;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyMatrix$Matrix;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyMatrix$Matrix;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyMatrix$Matrix;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyMatrix$Matrix;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

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
    instance-of v1, p1, Lcom/zykj/board/EzyMatrix$Matrix;

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
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    cmp-long v1, v1, v3

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eq v1, v3, :cond_3

    .line 47
    .line 48
    return v2

    .line 49
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getSkewX()F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getSkewX()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eq v1, v3, :cond_4

    .line 66
    .line 67
    return v2

    .line 68
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getTransX()F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getTransX()F

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eq v1, v3, :cond_5

    .line 85
    .line 86
    return v2

    .line 87
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getSkewY()F

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getSkewY()F

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eq v1, v3, :cond_6

    .line 104
    .line 105
    return v2

    .line 106
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eq v1, v3, :cond_7

    .line 123
    .line 124
    return v2

    .line 125
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getTransY()F

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getTransY()F

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eq v1, v3, :cond_8

    .line 142
    .line 143
    return v2

    .line 144
    :cond_8
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp0()F

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp0()F

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eq v1, v3, :cond_9

    .line 161
    .line 162
    return v2

    .line 163
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp1()F

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp1()F

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eq v1, v3, :cond_a

    .line 180
    .line 181
    return v2

    .line 182
    :cond_a
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp2()F

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp2()F

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-eq v1, v3, :cond_b

    .line 199
    .line 200
    return v2

    .line 201
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-nez p1, :cond_c

    .line 214
    .line 215
    return v2

    .line 216
    :cond_c
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getDefaultInstanceForType()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getDefaultInstanceForType()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->a:Lcom/zykj/board/EzyMatrix$Matrix;

    return-object v0
.end method

.method public getEventTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->eventTime_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->b:Lb4/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPerSp0()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp0_:F

    .line 2
    .line 3
    return v0
.end method

.method public getPerSp1()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp1_:F

    .line 2
    .line 3
    return v0
.end method

.method public getPerSp2()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp2_:F

    .line 2
    .line 3
    return v0
.end method

.method public getScaleX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleX_:F

    .line 2
    .line 3
    return v0
.end method

.method public getScaleY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleY_:F

    .line 2
    .line 3
    return v0
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
    iget-wide v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->eventTime_:J

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

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
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleX_:F

    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    iget v2, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleX_:F

    .line 32
    .line 33
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    :cond_2
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewX_:F

    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x3

    .line 47
    iget v2, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewX_:F

    .line 48
    .line 49
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v0, v1

    .line 54
    :cond_3
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transX_:F

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    const/4 v1, 0x4

    .line 63
    iget v2, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transX_:F

    .line 64
    .line 65
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    add-int/2addr v0, v1

    .line 70
    :cond_4
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewY_:F

    .line 71
    .line 72
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    const/4 v1, 0x5

    .line 79
    iget v2, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewY_:F

    .line 80
    .line 81
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    add-int/2addr v0, v1

    .line 86
    :cond_5
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleY_:F

    .line 87
    .line 88
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_6

    .line 93
    .line 94
    const/4 v1, 0x6

    .line 95
    iget v2, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleY_:F

    .line 96
    .line 97
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    add-int/2addr v0, v1

    .line 102
    :cond_6
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transY_:F

    .line 103
    .line 104
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_7

    .line 109
    .line 110
    const/4 v1, 0x7

    .line 111
    iget v2, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transY_:F

    .line 112
    .line 113
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    add-int/2addr v0, v1

    .line 118
    :cond_7
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp0_:F

    .line 119
    .line 120
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_8

    .line 125
    .line 126
    const/16 v1, 0x8

    .line 127
    .line 128
    iget v2, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp0_:F

    .line 129
    .line 130
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    add-int/2addr v0, v1

    .line 135
    :cond_8
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp1_:F

    .line 136
    .line 137
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_9

    .line 142
    .line 143
    const/16 v1, 0x9

    .line 144
    .line 145
    iget v2, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp1_:F

    .line 146
    .line 147
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    add-int/2addr v0, v1

    .line 152
    :cond_9
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp2_:F

    .line 153
    .line 154
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_a

    .line 159
    .line 160
    const/16 v1, 0xa

    .line 161
    .line 162
    iget v2, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp2_:F

    .line 163
    .line 164
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    add-int/2addr v0, v1

    .line 169
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    add-int/2addr v1, v0

    .line 178
    iput v1, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 179
    .line 180
    return v1
.end method

.method public getSkewX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewX_:F

    .line 2
    .line 3
    return v0
.end method

.method public getSkewY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewY_:F

    .line 2
    .line 3
    return v0
.end method

.method public getTransX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transX_:F

    .line 2
    .line 3
    return v0
.end method

.method public getTransY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transY_:F

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

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
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    invoke-static {v1, v2}, Lcom/google/protobuf/Internal;->hashLong(J)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/2addr v1, v0

    .line 31
    mul-int/lit8 v1, v1, 0x25

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x2

    .line 34
    .line 35
    mul-int/lit8 v1, v1, 0x35

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    add-int/2addr v0, v1

    .line 46
    mul-int/lit8 v0, v0, 0x25

    .line 47
    .line 48
    add-int/lit8 v0, v0, 0x3

    .line 49
    .line 50
    mul-int/lit8 v0, v0, 0x35

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getSkewX()F

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v1, v0

    .line 61
    mul-int/lit8 v1, v1, 0x25

    .line 62
    .line 63
    add-int/lit8 v1, v1, 0x4

    .line 64
    .line 65
    mul-int/lit8 v1, v1, 0x35

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getTransX()F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    add-int/2addr v0, v1

    .line 76
    mul-int/lit8 v0, v0, 0x25

    .line 77
    .line 78
    add-int/lit8 v0, v0, 0x5

    .line 79
    .line 80
    mul-int/lit8 v0, v0, 0x35

    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getSkewY()F

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    add-int/2addr v1, v0

    .line 91
    mul-int/lit8 v1, v1, 0x25

    .line 92
    .line 93
    add-int/lit8 v1, v1, 0x6

    .line 94
    .line 95
    mul-int/lit8 v1, v1, 0x35

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    add-int/2addr v0, v1

    .line 106
    mul-int/lit8 v0, v0, 0x25

    .line 107
    .line 108
    add-int/lit8 v0, v0, 0x7

    .line 109
    .line 110
    mul-int/lit8 v0, v0, 0x35

    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getTransY()F

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    add-int/2addr v1, v0

    .line 121
    mul-int/lit8 v1, v1, 0x25

    .line 122
    .line 123
    add-int/lit8 v1, v1, 0x8

    .line 124
    .line 125
    mul-int/lit8 v1, v1, 0x35

    .line 126
    .line 127
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp0()F

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    add-int/2addr v0, v1

    .line 136
    mul-int/lit8 v0, v0, 0x25

    .line 137
    .line 138
    add-int/lit8 v0, v0, 0x9

    .line 139
    .line 140
    mul-int/lit8 v0, v0, 0x35

    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp1()F

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    add-int/2addr v1, v0

    .line 151
    mul-int/lit8 v1, v1, 0x25

    .line 152
    .line 153
    add-int/lit8 v1, v1, 0xa

    .line 154
    .line 155
    mul-int/lit8 v1, v1, 0x35

    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp2()F

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    add-int/2addr v0, v1

    .line 166
    mul-int/lit8 v0, v0, 0x1d

    .line 167
    .line 168
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    add-int/2addr v1, v0

    .line 177
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 178
    .line 179
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    sget-object v0, Lb4/d0;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 4
    .line 5
    const-class v2, Lb4/b0;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public newBuilderForType()Lb4/b0;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->newBuilder()Lb4/b0;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lb4/b0;
    .locals 1

    .line 5
    new-instance v0, Lb4/b0;

    .line 6
    invoke-direct {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->newBuilderForType()Lb4/b0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lb4/b0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->newBuilderForType()Lb4/b0;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyMatrix$Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public toBuilder()Lb4/b0;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyMatrix$Matrix;->a:Lcom/zykj/board/EzyMatrix$Matrix;

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lb4/b0;

    .line 5
    invoke-direct {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lb4/b0;

    .line 7
    invoke-direct {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 8
    invoke-virtual {v0, p0}, Lb4/b0;->g(Lcom/zykj/board/EzyMatrix$Matrix;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->toBuilder()Lb4/b0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->toBuilder()Lb4/b0;

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
    iget-wide v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->eventTime_:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleX_:F

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleX_:F

    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewX_:F

    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewX_:F

    .line 37
    .line 38
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transX_:F

    .line 42
    .line 43
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    const/4 v0, 0x4

    .line 50
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transX_:F

    .line 51
    .line 52
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 53
    .line 54
    .line 55
    :cond_3
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewY_:F

    .line 56
    .line 57
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    const/4 v0, 0x5

    .line 64
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->skewY_:F

    .line 65
    .line 66
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 67
    .line 68
    .line 69
    :cond_4
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleY_:F

    .line 70
    .line 71
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    const/4 v0, 0x6

    .line 78
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->scaleY_:F

    .line 79
    .line 80
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 81
    .line 82
    .line 83
    :cond_5
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transY_:F

    .line 84
    .line 85
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_6

    .line 90
    .line 91
    const/4 v0, 0x7

    .line 92
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->transY_:F

    .line 93
    .line 94
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 95
    .line 96
    .line 97
    :cond_6
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp0_:F

    .line 98
    .line 99
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_7

    .line 104
    .line 105
    const/16 v0, 0x8

    .line 106
    .line 107
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp0_:F

    .line 108
    .line 109
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 110
    .line 111
    .line 112
    :cond_7
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp1_:F

    .line 113
    .line 114
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_8

    .line 119
    .line 120
    const/16 v0, 0x9

    .line 121
    .line 122
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp1_:F

    .line 123
    .line 124
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 125
    .line 126
    .line 127
    :cond_8
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp2_:F

    .line 128
    .line 129
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_9

    .line 134
    .line 135
    const/16 v0, 0xa

    .line 136
    .line 137
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix;->perSp2_:F

    .line 138
    .line 139
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 140
    .line 141
    .line 142
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method
