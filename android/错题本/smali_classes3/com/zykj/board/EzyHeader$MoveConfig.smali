# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyHeader$MoveConfig;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lb4/x;


# static fields
.field public static final HORIZONTALTRANSLATE_FIELD_NUMBER:I = 0x3

.field public static final ISENABLE_FIELD_NUMBER:I = 0x1

.field public static final MAXHEIGHTTIMES_FIELD_NUMBER:I = 0x6

.field public static final MAXWIDTHTIMES_FIELD_NUMBER:I = 0x7

.field public static final ROTATE_FIELD_NUMBER:I = 0x5

.field public static final SCALE_FIELD_NUMBER:I = 0x4

.field public static final VERTICALTRANSLATE_FIELD_NUMBER:I = 0x2

.field public static final a:Lcom/zykj/board/EzyHeader$MoveConfig;

.field public static final b:Lb4/v;

.field private static final serialVersionUID:J


# instance fields
.field private horizontalTranslate_:Z

.field private isEnable_:Z

.field private maxHeightTimes_:I

.field private maxWidthTimes_:I

.field private memoizedIsInitialized:B

.field private rotate_:Z

.field private scale_:Z

.field private verticalTranslate_:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyHeader$MoveConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->a:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 7
    .line 8
    new-instance v0, Lb4/v;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/AbstractParser;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->isEnable_:Z

    .line 12
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->verticalTranslate_:Z

    .line 13
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->horizontalTranslate_:Z

    .line 14
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->scale_:Z

    .line 15
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->rotate_:Z

    .line 16
    iput v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->maxHeightTimes_:I

    .line 17
    iput v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->maxWidthTimes_:I

    const/4 v0, -0x1

    .line 18
    iput-byte v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->memoizedIsInitialized:B

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lb4/m;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->isEnable_:Z

    .line 3
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->verticalTranslate_:Z

    .line 4
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->horizontalTranslate_:Z

    .line 5
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->scale_:Z

    .line 6
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->rotate_:Z

    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->maxHeightTimes_:I

    .line 8
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->maxWidthTimes_:I

    const/4 p1, -0x1

    .line 9
    iput-byte p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->memoizedIsInitialized:B

    return-void
.end method

.method public static synthetic access$2802(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->isEnable_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$2902(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->verticalTranslate_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$3002(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->horizontalTranslate_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$3102(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->scale_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$3202(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->rotate_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$3302(Lcom/zykj/board/EzyHeader$MoveConfig;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->maxHeightTimes_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$3402(Lcom/zykj/board/EzyHeader$MoveConfig;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->maxWidthTimes_:I

    .line 2
    .line 3
    return p1
.end method

.method public static getDefaultInstance()Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->a:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lb4/y;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lb4/w;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->a:Lcom/zykj/board/EzyHeader$MoveConfig;

    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$MoveConfig;->toBuilder()Lb4/w;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/board/EzyHeader$MoveConfig;)Lb4/w;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->a:Lcom/zykj/board/EzyHeader$MoveConfig;

    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$MoveConfig;->toBuilder()Lb4/w;

    move-result-object v0

    invoke-virtual {v0, p0}, Lb4/w;->f(Lcom/zykj/board/EzyHeader$MoveConfig;)V

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$MoveConfig;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$MoveConfig;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$MoveConfig;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$MoveConfig;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

    .line 12
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$MoveConfig;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

    .line 14
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$MoveConfig;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

    .line 8
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$MoveConfig;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

    .line 10
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$MoveConfig;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$MoveConfig;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$MoveConfig;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$MoveConfig;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$MoveConfig;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/board/EzyHeader$MoveConfig;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

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
    instance-of v1, p1, Lcom/zykj/board/EzyHeader$MoveConfig;

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
    check-cast p1, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getIsEnable()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->getIsEnable()Z

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getVerticalTranslate()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->getVerticalTranslate()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eq v1, v2, :cond_3

    .line 37
    .line 38
    return v3

    .line 39
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getHorizontalTranslate()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->getHorizontalTranslate()Z

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getScale()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->getScale()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eq v1, v2, :cond_5

    .line 59
    .line 60
    return v3

    .line 61
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getRotate()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->getRotate()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eq v1, v2, :cond_6

    .line 70
    .line 71
    return v3

    .line 72
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getMaxHeightTimes()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->getMaxHeightTimes()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eq v1, v2, :cond_7

    .line 81
    .line 82
    return v3

    .line 83
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getMaxWidthTimes()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->getMaxWidthTimes()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eq v1, v2, :cond_8

    .line 92
    .line 93
    return v3

    .line 94
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-nez p1, :cond_9

    .line 107
    .line 108
    return v3

    .line 109
    :cond_9
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getDefaultInstanceForType()Lcom/zykj/board/EzyHeader$MoveConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getDefaultInstanceForType()Lcom/zykj/board/EzyHeader$MoveConfig;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->a:Lcom/zykj/board/EzyHeader$MoveConfig;

    return-object v0
.end method

.method public getHorizontalTranslate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->horizontalTranslate_:Z

    .line 2
    .line 3
    return v0
.end method

.method public getIsEnable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->isEnable_:Z

    .line 2
    .line 3
    return v0
.end method

.method public getMaxHeightTimes()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->maxHeightTimes_:I

    .line 2
    .line 3
    return v0
.end method

.method public getMaxWidthTimes()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->maxWidthTimes_:I

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
            "Lcom/zykj/board/EzyHeader$MoveConfig;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->b:Lb4/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRotate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->rotate_:Z

    .line 2
    .line 3
    return v0
.end method

.method public getScale()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->scale_:Z

    .line 2
    .line 3
    return v0
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
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->isEnable_:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

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
    iget-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->verticalTranslate_:Z

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/2addr v0, v1

    .line 28
    :cond_2
    iget-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->horizontalTranslate_:Z

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    const/4 v2, 0x3

    .line 33
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    :cond_3
    iget-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->scale_:Z

    .line 39
    .line 40
    if-eqz v1, :cond_4

    .line 41
    .line 42
    const/4 v2, 0x4

    .line 43
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v0, v1

    .line 48
    :cond_4
    iget-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->rotate_:Z

    .line 49
    .line 50
    if-eqz v1, :cond_5

    .line 51
    .line 52
    const/4 v2, 0x5

    .line 53
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    add-int/2addr v0, v1

    .line 58
    :cond_5
    iget v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->maxHeightTimes_:I

    .line 59
    .line 60
    if-eqz v1, :cond_6

    .line 61
    .line 62
    const/4 v2, 0x6

    .line 63
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/2addr v0, v1

    .line 68
    :cond_6
    iget v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->maxWidthTimes_:I

    .line 69
    .line 70
    if-eqz v1, :cond_7

    .line 71
    .line 72
    const/4 v2, 0x7

    .line 73
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/2addr v0, v1

    .line 78
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    add-int/2addr v1, v0

    .line 87
    iput v1, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 88
    .line 89
    return v1
.end method

.method public getVerticalTranslate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->verticalTranslate_:Z

    .line 2
    .line 3
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
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getIsEnable()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-static {v1}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getVerticalTranslate()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v0}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getHorizontalTranslate()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-static {v1}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getScale()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {v0}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getRotate()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-static {v1}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getMaxHeightTimes()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    add-int/2addr v0, v1

    .line 102
    mul-int/lit8 v0, v0, 0x25

    .line 103
    .line 104
    add-int/lit8 v0, v0, 0x7

    .line 105
    .line 106
    mul-int/lit8 v0, v0, 0x35

    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getMaxWidthTimes()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    add-int/2addr v1, v0

    .line 113
    mul-int/lit8 v1, v1, 0x1d

    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    add-int/2addr v0, v1

    .line 124
    iput v0, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 125
    .line 126
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    sget-object v0, Lb4/y;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 4
    .line 5
    const-class v2, Lb4/w;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public newBuilderForType()Lb4/w;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->newBuilder()Lb4/w;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lb4/w;
    .locals 1

    .line 5
    new-instance v0, Lb4/w;

    .line 6
    invoke-direct {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->newBuilderForType()Lb4/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lb4/w;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->newBuilderForType()Lb4/w;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public toBuilder()Lb4/w;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->a:Lcom/zykj/board/EzyHeader$MoveConfig;

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lb4/w;

    .line 5
    invoke-direct {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lb4/w;

    .line 7
    invoke-direct {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 8
    invoke-virtual {v0, p0}, Lb4/w;->f(Lcom/zykj/board/EzyHeader$MoveConfig;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->toBuilder()Lb4/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->toBuilder()Lb4/w;

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
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->isEnable_:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->verticalTranslate_:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->horizontalTranslate_:Z

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 23
    .line 24
    .line 25
    :cond_2
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->scale_:Z

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 31
    .line 32
    .line 33
    :cond_3
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->rotate_:Z

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    const/4 v1, 0x5

    .line 38
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 39
    .line 40
    .line 41
    :cond_4
    iget v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->maxHeightTimes_:I

    .line 42
    .line 43
    if-eqz v0, :cond_5

    .line 44
    .line 45
    const/4 v1, 0x6

    .line 46
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 47
    .line 48
    .line 49
    :cond_5
    iget v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->maxWidthTimes_:I

    .line 50
    .line 51
    if-eqz v0, :cond_6

    .line 52
    .line 53
    const/4 v1, 0x7

    .line 54
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 55
    .line 56
    .line 57
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method
