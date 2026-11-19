# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lb4/z1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyTouchEvent$TouchEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PointerProperties"
.end annotation


# static fields
.field public static final ID_FIELD_NUMBER:I = 0x1

.field public static final TOOLTYPE_FIELD_NUMBER:I = 0x2

.field public static final a:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

.field public static final b:Lcom/zykj/board/a1;

.field private static final serialVersionUID:J


# instance fields
.field private id_:I

.field private memoizedIsInitialized:B

.field private toolType_:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->a:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/a1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/AbstractParser;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->id_:I

    .line 7
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->toolType_:I

    const/4 v0, -0x1

    .line 8
    iput-byte v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->memoizedIsInitialized:B

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lb4/w1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->id_:I

    .line 3
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->toolType_:I

    const/4 p1, -0x1

    .line 4
    iput-byte p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->memoizedIsInitialized:B

    return-void
.end method

.method public static synthetic access$702(Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->id_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$802(Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->toolType_:I

    .line 2
    .line 3
    return p1
.end method

.method public static getDefaultInstance()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->a:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lb4/a2;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/board/b1;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->a:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->toBuilder()Lcom/zykj/board/b1;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;)Lcom/zykj/board/b1;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->a:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->toBuilder()Lcom/zykj/board/b1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/board/b1;->e(Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;)V

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

    .line 12
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

    .line 14
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

    .line 8
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

    .line 10
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

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
    instance-of v1, p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

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
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getId()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getId()I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getToolType()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getToolType()I

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
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_4

    .line 52
    .line 53
    return v3

    .line 54
    :cond_4
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getDefaultInstanceForType()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getDefaultInstanceForType()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->a:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->id_:I

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
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->b:Lcom/zykj/board/a1;

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
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->id_:I

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
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->toolType_:I

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/2addr v0, v1

    .line 28
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-int/2addr v1, v0

    .line 37
    iput v1, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 38
    .line 39
    return v1
.end method

.method public getToolType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->toolType_:I

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
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getId()I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getToolType()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1d

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/2addr v1, v0

    .line 49
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 50
    .line 51
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    sget-object v0, Lb4/a2;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 4
    .line 5
    const-class v2, Lcom/zykj/board/b1;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->newBuilderForType()Lcom/zykj/board/b1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/b1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->newBuilderForType()Lcom/zykj/board/b1;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/board/b1;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->newBuilder()Lcom/zykj/board/b1;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/b1;
    .locals 1

    .line 5
    new-instance v0, Lcom/zykj/board/b1;

    .line 6
    invoke-direct {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->toBuilder()Lcom/zykj/board/b1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->toBuilder()Lcom/zykj/board/b1;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/board/b1;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->a:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/board/b1;

    .line 5
    invoke-direct {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lcom/zykj/board/b1;

    .line 7
    invoke-direct {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 8
    invoke-virtual {v0, p0}, Lcom/zykj/board/b1;->e(Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;)V

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
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->id_:I

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
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->toolType_:I

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
