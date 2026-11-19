# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
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
    name = "REBUILD"
.end annotation


# static fields
.field public static final BACKGROUNDCOLOR_FIELD_NUMBER:I = 0x2

.field public static final BACKGROUNDLINECONFIG_FIELD_NUMBER:I = 0x3

.field public static final SNAPSHOT_FIELD_NUMBER:I = 0x1

.field public static final a:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

.field public static final b:Lcom/zykj/board/w;

.field private static final serialVersionUID:J


# instance fields
.field private backgroundColor_:I

.field private backgroundLineConfig_:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

.field private bitField0_:I

.field private memoizedIsInitialized:B

.field private snapshot_:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->a:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/w;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/AbstractParser;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 4
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->backgroundColor_:I

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->memoizedIsInitialized:B

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lb4/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->backgroundColor_:I

    const/4 p1, -0x1

    .line 3
    iput-byte p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->memoizedIsInitialized:B

    return-void
.end method

.method public static synthetic access$11600()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$11802(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->snapshot_:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$11902(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->backgroundColor_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$12002(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->backgroundLineConfig_:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$12176(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->bitField0_:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->bitField0_:I

    .line 5
    .line 6
    return p1
.end method

.method public static getDefaultInstance()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->a:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lb4/f;->w:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/board/x;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->a:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->toBuilder()Lcom/zykj/board/x;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;)Lcom/zykj/board/x;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->a:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->toBuilder()Lcom/zykj/board/x;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/board/x;->h(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;)V

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

    .line 12
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

    .line 14
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

    .line 8
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

    .line 10
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

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
    instance-of v1, p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

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
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->hasSnapshot()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->hasSnapshot()Z

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->hasSnapshot()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_3

    .line 47
    .line 48
    return v3

    .line 49
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getBackgroundColor()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getBackgroundColor()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eq v1, v2, :cond_4

    .line 58
    .line 59
    return v3

    .line 60
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->hasBackgroundLineConfig()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->hasBackgroundLineConfig()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eq v1, v2, :cond_5

    .line 69
    .line 70
    return v3

    .line 71
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->hasBackgroundLineConfig()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-nez v1, :cond_6

    .line 90
    .line 91
    return v3

    .line 92
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_7

    .line 105
    .line 106
    return v3

    .line 107
    :cond_7
    return v0
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->backgroundColor_:I

    .line 2
    .line 3
    return v0
.end method

.method public getBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->backgroundLineConfig_:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getDefaultInstance()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getBackgroundLineConfigOrBuilder()Lb4/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->backgroundLineConfig_:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getDefaultInstance()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getDefaultInstanceForType()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getDefaultInstanceForType()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->a:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->b:Lcom/zykj/board/w;

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
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->bitField0_:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->backgroundColor_:I

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    if-eqz v1, :cond_2

    .line 27
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
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->bitField0_:I

    .line 34
    .line 35
    and-int/2addr v1, v2

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v0, v1

    .line 48
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v1, v0

    .line 57
    iput v1, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 58
    .line 59
    return v1
.end method

.method public getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->snapshot_:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getDefaultInstance()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getSnapshotOrBuilder()Lcom/zykj/board/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->snapshot_:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getDefaultInstance()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public hasBackgroundLineConfig()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->bitField0_:I

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

.method public hasSnapshot()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->bitField0_:I

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
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->hasSnapshot()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/16 v2, 0x35

    .line 21
    .line 22
    const/16 v3, 0x25

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-static {v0, v3, v1, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/2addr v0, v1

    .line 40
    :cond_1
    const/4 v1, 0x2

    .line 41
    invoke-static {v0, v3, v1, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getBackgroundColor()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    add-int/2addr v1, v0

    .line 50
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->hasBackgroundLineConfig()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    const/4 v0, 0x3

    .line 57
    invoke-static {v1, v3, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    add-int/2addr v1, v0

    .line 70
    :cond_2
    mul-int/lit8 v1, v1, 0x1d

    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    add-int/2addr v0, v1

    .line 81
    iput v0, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 82
    .line 83
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    sget-object v0, Lb4/f;->x:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    .line 4
    .line 5
    const-class v2, Lcom/zykj/board/x;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->newBuilderForType()Lcom/zykj/board/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/x;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->newBuilderForType()Lcom/zykj/board/x;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/board/x;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->newBuilder()Lcom/zykj/board/x;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/x;
    .locals 1

    .line 5
    new-instance v0, Lcom/zykj/board/x;

    .line 6
    invoke-direct {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 7
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->access$11600()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {v0}, Lcom/zykj/board/x;->g()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 9
    invoke-virtual {v0}, Lcom/zykj/board/x;->f()Lcom/google/protobuf/SingleFieldBuilderV3;

    :cond_0
    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->toBuilder()Lcom/zykj/board/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->toBuilder()Lcom/zykj/board/x;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/board/x;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->a:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/board/x;

    .line 5
    invoke-direct {v0}, Lcom/zykj/board/x;-><init>()V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lcom/zykj/board/x;

    .line 7
    invoke-direct {v0}, Lcom/zykj/board/x;-><init>()V

    .line 8
    invoke-virtual {v0, p0}, Lcom/zykj/board/x;->h(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;)V

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
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->bitField0_:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->backgroundColor_:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->bitField0_:I

    .line 23
    .line 24
    and-int/2addr v0, v1

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
