# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyTouchEvent$TouchEvent;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/board/c1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;,
        Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;
    }
.end annotation


# static fields
.field public static final ACTION_FIELD_NUMBER:I = 0x2

.field public static final EVENTTIME_FIELD_NUMBER:I = 0x1

.field public static final POINTERCOORDS_FIELD_NUMBER:I = 0x7

.field public static final POINTERCOUNT_FIELD_NUMBER:I = 0x5

.field public static final POINTERPROPERTIES_FIELD_NUMBER:I = 0x6

.field public static final X_FIELD_NUMBER:I = 0x3

.field public static final Y_FIELD_NUMBER:I = 0x4

.field public static final a:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

.field public static final b:Lb4/x1;

.field private static final serialVersionUID:J


# instance fields
.field private action_:I

.field private eventTime_:J

.field private memoizedIsInitialized:B

.field private pointerCoords_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;",
            ">;"
        }
    .end annotation
.end field

.field private pointerCount_:I

.field private pointerProperties_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;",
            ">;"
        }
    .end annotation
.end field

.field private x_:F

.field private y_:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->a:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 7
    .line 8
    new-instance v0, Lb4/x1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/AbstractParser;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 8
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const-wide/16 v0, 0x0

    .line 9
    iput-wide v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->eventTime_:J

    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->action_:I

    const/4 v1, 0x0

    .line 11
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->x_:F

    .line 12
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->y_:F

    .line 13
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCount_:I

    const/4 v0, -0x1

    .line 14
    iput-byte v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->memoizedIsInitialized:B

    .line 15
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerProperties_:Ljava/util/List;

    .line 16
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCoords_:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lb4/w1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const-wide/16 p1, 0x0

    .line 2
    iput-wide p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->eventTime_:J

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->action_:I

    const/4 p2, 0x0

    .line 4
    iput p2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->x_:F

    .line 5
    iput p2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->y_:F

    .line 6
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCount_:I

    const/4 p1, -0x1

    .line 7
    iput-byte p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->memoizedIsInitialized:B

    return-void
.end method

.method public static synthetic access$1900(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerProperties_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1902(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerProperties_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2000(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCoords_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2002(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCoords_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2102(Lcom/zykj/board/EzyTouchEvent$TouchEvent;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->eventTime_:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic access$2202(Lcom/zykj/board/EzyTouchEvent$TouchEvent;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->action_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$2302(Lcom/zykj/board/EzyTouchEvent$TouchEvent;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->x_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$2402(Lcom/zykj/board/EzyTouchEvent$TouchEvent;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->y_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$2502(Lcom/zykj/board/EzyTouchEvent$TouchEvent;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCount_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$2600()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$2700()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static getDefaultInstance()Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->a:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lb4/a2;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/board/x0;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->a:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->toBuilder()Lcom/zykj/board/x0;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Lcom/zykj/board/x0;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->a:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->toBuilder()Lcom/zykj/board/x0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/board/x0;->g(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

    .line 12
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

    .line 14
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

    .line 8
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

    .line 10
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

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
    instance-of v1, p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

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
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getAction()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getAction()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eq v1, v3, :cond_3

    .line 39
    .line 40
    return v2

    .line 41
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eq v1, v3, :cond_4

    .line 58
    .line 59
    return v2

    .line 60
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eq v1, v3, :cond_5

    .line 77
    .line 78
    return v2

    .line 79
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCount()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCount()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eq v1, v3, :cond_6

    .line 88
    .line 89
    return v2

    .line 90
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_7

    .line 103
    .line 104
    return v2

    .line 105
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoordsList()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoordsList()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-nez v1, :cond_8

    .line 118
    .line 119
    return v2

    .line 120
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-nez p1, :cond_9

    .line 133
    .line 134
    return v2

    .line 135
    :cond_9
    return v0
.end method

.method public getAction()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->action_:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getDefaultInstanceForType()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getDefaultInstanceForType()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->a:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    return-object v0
.end method

.method public getEventTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->eventTime_:J

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
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b:Lb4/x1;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointerCoords(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCoords_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 8
    .line 9
    return-object p1
.end method

.method public getPointerCoordsCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCoords_:Ljava/util/List;

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

.method public getPointerCoordsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCoords_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointerCoordsOrBuilder(I)Lb4/y1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCoords_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lb4/y1;

    .line 8
    .line 9
    return-object p1
.end method

.method public getPointerCoordsOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lb4/y1;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCoords_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointerCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCount_:I

    .line 2
    .line 3
    return v0
.end method

.method public getPointerProperties(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerProperties_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 8
    .line 9
    return-object p1
.end method

.method public getPointerPropertiesCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerProperties_:Ljava/util/List;

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

.method public getPointerPropertiesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerProperties_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointerPropertiesOrBuilder(I)Lb4/z1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerProperties_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lb4/z1;

    .line 8
    .line 9
    return-object p1
.end method

.method public getPointerPropertiesOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lb4/z1;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerProperties_:Ljava/util/List;

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
    iget-wide v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->eventTime_:J

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v0, v3

    .line 23
    :goto_0
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->action_:I

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/2addr v0, v1

    .line 33
    :cond_2
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->x_:F

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    const/4 v1, 0x3

    .line 42
    iget v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->x_:F

    .line 43
    .line 44
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/2addr v0, v1

    .line 49
    :cond_3
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->y_:F

    .line 50
    .line 51
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    const/4 v1, 0x4

    .line 58
    iget v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->y_:F

    .line 59
    .line 60
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/2addr v0, v1

    .line 65
    :cond_4
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCount_:I

    .line 66
    .line 67
    if-eqz v1, :cond_5

    .line 68
    .line 69
    const/4 v2, 0x5

    .line 70
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    add-int/2addr v0, v1

    .line 75
    :cond_5
    move v1, v3

    .line 76
    :goto_1
    iget-object v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerProperties_:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-ge v1, v2, :cond_6

    .line 83
    .line 84
    iget-object v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerProperties_:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 91
    .line 92
    const/4 v4, 0x6

    .line 93
    invoke-static {v4, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    add-int/2addr v0, v2

    .line 98
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_6
    :goto_2
    iget-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCoords_:Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-ge v3, v1, :cond_7

    .line 108
    .line 109
    iget-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCoords_:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, Lcom/google/protobuf/MessageLite;

    .line 116
    .line 117
    const/4 v2, 0x7

    .line 118
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    add-int/2addr v0, v1

    .line 123
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    add-int/2addr v1, v0

    .line 135
    iput v1, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 136
    .line 137
    return v1
.end method

.method public getX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->x_:F

    .line 2
    .line 3
    return v0
.end method

.method public getY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->y_:F

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 5

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
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    invoke-static {v3, v4}, Lcom/google/protobuf/Internal;->hashLong(J)I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getAction()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    add-int/2addr v0, v3

    .line 42
    mul-int/2addr v0, v1

    .line 43
    add-int/lit8 v0, v0, 0x3

    .line 44
    .line 45
    mul-int/2addr v0, v2

    .line 46
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    add-int/2addr v3, v0

    .line 55
    mul-int/2addr v3, v1

    .line 56
    add-int/lit8 v3, v3, 0x4

    .line 57
    .line 58
    mul-int/2addr v3, v2

    .line 59
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    add-int/2addr v0, v3

    .line 68
    mul-int/2addr v0, v1

    .line 69
    add-int/lit8 v0, v0, 0x5

    .line 70
    .line 71
    mul-int/2addr v0, v2

    .line 72
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCount()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    add-int/2addr v3, v0

    .line 77
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesCount()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-lez v0, :cond_1

    .line 82
    .line 83
    const/4 v0, 0x6

    .line 84
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    add-int/2addr v3, v0

    .line 97
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoordsCount()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-lez v0, :cond_2

    .line 102
    .line 103
    const/4 v0, 0x7

    .line 104
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoordsList()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    add-int v3, v1, v0

    .line 117
    .line 118
    :cond_2
    mul-int/lit8 v3, v3, 0x1d

    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    add-int/2addr v0, v3

    .line 129
    iput v0, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 130
    .line 131
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    sget-object v0, Lb4/a2;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 4
    .line 5
    const-class v2, Lcom/zykj/board/x0;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->newBuilderForType()Lcom/zykj/board/x0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/x0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->newBuilderForType()Lcom/zykj/board/x0;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/board/x0;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->newBuilder()Lcom/zykj/board/x0;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/x0;
    .locals 1

    .line 5
    new-instance v0, Lcom/zykj/board/x0;

    .line 6
    invoke-direct {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 7
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, v0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 8
    iput-object p1, v0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->toBuilder()Lcom/zykj/board/x0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->toBuilder()Lcom/zykj/board/x0;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/board/x0;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->a:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/board/x0;

    .line 5
    invoke-direct {v0}, Lcom/zykj/board/x0;-><init>()V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lcom/zykj/board/x0;

    .line 7
    invoke-direct {v0}, Lcom/zykj/board/x0;-><init>()V

    .line 8
    invoke-virtual {v0, p0}, Lcom/zykj/board/x0;->g(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

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
    iget-wide v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->eventTime_:J

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
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->action_:I

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->x_:F

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x3

    .line 30
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->x_:F

    .line 31
    .line 32
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 33
    .line 34
    .line 35
    :cond_2
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->y_:F

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const/4 v0, 0x4

    .line 44
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->y_:F

    .line 45
    .line 46
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 47
    .line 48
    .line 49
    :cond_3
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCount_:I

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    const/4 v1, 0x5

    .line 54
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 55
    .line 56
    .line 57
    :cond_4
    const/4 v0, 0x0

    .line 58
    move v1, v0

    .line 59
    :goto_0
    iget-object v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerProperties_:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-ge v1, v2, :cond_5

    .line 66
    .line 67
    iget-object v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerProperties_:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 74
    .line 75
    const/4 v3, 0x6

    .line 76
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_5
    :goto_1
    iget-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCoords_:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-ge v0, v1, :cond_6

    .line 89
    .line 90
    iget-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->pointerCoords_:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Lcom/google/protobuf/MessageLite;

    .line 97
    .line 98
    const/4 v2, 0x7

    .line 99
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v0, v0, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method
