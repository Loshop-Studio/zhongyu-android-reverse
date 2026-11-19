# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyHeader$Header;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# static fields
.field public static final AUTHOR_FIELD_NUMBER:I = 0x7

.field public static final CONVERTURL_FIELD_NUMBER:I = 0x8

.field public static final CREATEDATE_FIELD_NUMBER:I = 0x4

.field public static final DEFAULTBACKGROUNDCOLOR_FIELD_NUMBER:I = 0xa

.field public static final DEFAULTBACKGROUNDLINECONFIG_FIELD_NUMBER:I = 0xd

.field public static final DURATION_FIELD_NUMBER:I = 0x6

.field public static final HEIGHT_FIELD_NUMBER:I = 0x3

.field public static final LASTBACKGROUNDCOLOR_FIELD_NUMBER:I = 0xb

.field public static final LASTBACKGROUNDLINECONFIG_FIELD_NUMBER:I = 0xe

.field public static final MOVECONFIG_FIELD_NUMBER:I = 0xc

.field public static final PROVIDER_FIELD_NUMBER:I = 0x9

.field public static final UPDATEDATE_FIELD_NUMBER:I = 0x5

.field public static final VERSION_FIELD_NUMBER:I = 0x1

.field public static final WIDTH_FIELD_NUMBER:I = 0x2

.field public static final a:Lcom/zykj/board/EzyHeader$Header;

.field public static final b:Lb4/t;

.field private static final serialVersionUID:J


# instance fields
.field private author_:Lcom/zykj/board/EzyHeader$Author;

.field private bitField0_:I

.field private volatile convertUrl_:Ljava/lang/Object;

.field private createDate_:J

.field private defaultBackgroundColor_:I

.field private defaultBackgroundLineConfig_:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

.field private duration_:J

.field private height_:I

.field private lastBackgroundColor_:I

.field private lastBackgroundLineConfig_:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

.field private memoizedIsInitialized:B

.field private moveConfig_:Lcom/zykj/board/EzyHeader$MoveConfig;

.field private provider_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyHeader$Author;",
            ">;"
        }
    .end annotation
.end field

.field private updateDate_:J

.field private version_:I

.field private width_:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyHeader$Header;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyHeader$Header;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyHeader$Header;->a:Lcom/zykj/board/EzyHeader$Header;

    .line 7
    .line 8
    new-instance v0, Lb4/t;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/AbstractParser;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 12
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header;->version_:I

    .line 14
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header;->width_:I

    .line 15
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header;->height_:I

    const-wide/16 v1, 0x0

    .line 16
    iput-wide v1, p0, Lcom/zykj/board/EzyHeader$Header;->createDate_:J

    .line 17
    iput-wide v1, p0, Lcom/zykj/board/EzyHeader$Header;->updateDate_:J

    .line 18
    iput-wide v1, p0, Lcom/zykj/board/EzyHeader$Header;->duration_:J

    .line 19
    const-string v1, ""

    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Header;->convertUrl_:Ljava/lang/Object;

    .line 20
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header;->defaultBackgroundColor_:I

    .line 21
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header;->lastBackgroundColor_:I

    const/4 v0, -0x1

    .line 22
    iput-byte v0, p0, Lcom/zykj/board/EzyHeader$Header;->memoizedIsInitialized:B

    .line 23
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Header;->convertUrl_:Ljava/lang/Object;

    .line 24
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->provider_:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lb4/m;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header;->version_:I

    .line 3
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header;->width_:I

    .line 4
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header;->height_:I

    const-wide/16 v0, 0x0

    .line 5
    iput-wide v0, p0, Lcom/zykj/board/EzyHeader$Header;->createDate_:J

    .line 6
    iput-wide v0, p0, Lcom/zykj/board/EzyHeader$Header;->updateDate_:J

    .line 7
    iput-wide v0, p0, Lcom/zykj/board/EzyHeader$Header;->duration_:J

    .line 8
    const-string p2, ""

    iput-object p2, p0, Lcom/zykj/board/EzyHeader$Header;->convertUrl_:Ljava/lang/Object;

    .line 9
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header;->defaultBackgroundColor_:I

    .line 10
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header;->lastBackgroundColor_:I

    const/4 p1, -0x1

    .line 11
    iput-byte p1, p0, Lcom/zykj/board/EzyHeader$Header;->memoizedIsInitialized:B

    return-void
.end method

.method public static synthetic access$1002(Lcom/zykj/board/EzyHeader$Header;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyHeader$Header;->createDate_:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic access$1102(Lcom/zykj/board/EzyHeader$Header;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyHeader$Header;->updateDate_:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic access$1202(Lcom/zykj/board/EzyHeader$Header;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyHeader$Header;->duration_:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic access$1302(Lcom/zykj/board/EzyHeader$Header;Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Author;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header;->author_:Lcom/zykj/board/EzyHeader$Author;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1400(Lcom/zykj/board/EzyHeader$Header;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyHeader$Header;->convertUrl_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1402(Lcom/zykj/board/EzyHeader$Header;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header;->convertUrl_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1502(Lcom/zykj/board/EzyHeader$Header;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header;->defaultBackgroundColor_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1602(Lcom/zykj/board/EzyHeader$Header;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header;->lastBackgroundColor_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1702(Lcom/zykj/board/EzyHeader$Header;Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header;->moveConfig_:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1802(Lcom/zykj/board/EzyHeader$Header;Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header;->defaultBackgroundLineConfig_:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1902(Lcom/zykj/board/EzyHeader$Header;Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header;->lastBackgroundLineConfig_:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2076(Lcom/zykj/board/EzyHeader$Header;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->bitField0_:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header;->bitField0_:I

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

.method public static synthetic access$2200(Lcom/google/protobuf/ByteString;)V
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

.method public static synthetic access$400()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$600(Lcom/zykj/board/EzyHeader$Header;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyHeader$Header;->provider_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$602(Lcom/zykj/board/EzyHeader$Header;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header;->provider_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$702(Lcom/zykj/board/EzyHeader$Header;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header;->version_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$802(Lcom/zykj/board/EzyHeader$Header;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header;->width_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$902(Lcom/zykj/board/EzyHeader$Header;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header;->height_:I

    .line 2
    .line 3
    return p1
.end method

.method public static getDefaultInstance()Lcom/zykj/board/EzyHeader$Header;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->a:Lcom/zykj/board/EzyHeader$Header;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lb4/y;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lb4/u;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->a:Lcom/zykj/board/EzyHeader$Header;

    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$Header;->toBuilder()Lb4/u;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/board/EzyHeader$Header;)Lb4/u;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->a:Lcom/zykj/board/EzyHeader$Header;

    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$Header;->toBuilder()Lb4/u;

    move-result-object v0

    invoke-virtual {v0, p0}, Lb4/u;->m(Lcom/zykj/board/EzyHeader$Header;)V

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyHeader$Header;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$Header;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Header;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$Header;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyHeader$Header;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$Header;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Header;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$Header;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/board/EzyHeader$Header;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    .line 12
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$Header;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Header;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    .line 14
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$Header;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyHeader$Header;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    .line 8
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$Header;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Header;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    .line 10
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$Header;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/board/EzyHeader$Header;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$Header;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Header;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$Header;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/board/EzyHeader$Header;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$Header;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Header;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyHeader$Header;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/board/EzyHeader$Header;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/board/EzyHeader$Header;

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
    check-cast p1, Lcom/zykj/board/EzyHeader$Header;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getWidth()I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getHeight()I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getCreateDate()J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getCreateDate()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    cmp-long v1, v1, v4

    .line 59
    .line 60
    if-eqz v1, :cond_5

    .line 61
    .line 62
    return v3

    .line 63
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getUpdateDate()J

    .line 64
    .line 65
    .line 66
    move-result-wide v1

    .line 67
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getUpdateDate()J

    .line 68
    .line 69
    .line 70
    move-result-wide v4

    .line 71
    cmp-long v1, v1, v4

    .line 72
    .line 73
    if-eqz v1, :cond_6

    .line 74
    .line 75
    return v3

    .line 76
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getDuration()J

    .line 77
    .line 78
    .line 79
    move-result-wide v1

    .line 80
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getDuration()J

    .line 81
    .line 82
    .line 83
    move-result-wide v4

    .line 84
    cmp-long v1, v1, v4

    .line 85
    .line 86
    if-eqz v1, :cond_7

    .line 87
    .line 88
    return v3

    .line 89
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->hasAuthor()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->hasAuthor()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eq v1, v2, :cond_8

    .line 98
    .line 99
    return v3

    .line 100
    :cond_8
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->hasAuthor()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_9

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getAuthor()Lcom/zykj/board/EzyHeader$Author;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getAuthor()Lcom/zykj/board/EzyHeader$Author;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$Author;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-nez v1, :cond_9

    .line 119
    .line 120
    return v3

    .line 121
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getConvertUrl()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getConvertUrl()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_a

    .line 134
    .line 135
    return v3

    .line 136
    :cond_a
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getProviderList()Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getProviderList()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-nez v1, :cond_b

    .line 149
    .line 150
    return v3

    .line 151
    :cond_b
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getDefaultBackgroundColor()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getDefaultBackgroundColor()I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eq v1, v2, :cond_c

    .line 160
    .line 161
    return v3

    .line 162
    :cond_c
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getLastBackgroundColor()I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getLastBackgroundColor()I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eq v1, v2, :cond_d

    .line 171
    .line 172
    return v3

    .line 173
    :cond_d
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->hasMoveConfig()Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->hasMoveConfig()Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eq v1, v2, :cond_e

    .line 182
    .line 183
    return v3

    .line 184
    :cond_e
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->hasMoveConfig()Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_f

    .line 189
    .line 190
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getMoveConfig()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getMoveConfig()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$MoveConfig;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-nez v1, :cond_f

    .line 203
    .line 204
    return v3

    .line 205
    :cond_f
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->hasDefaultBackgroundLineConfig()Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->hasDefaultBackgroundLineConfig()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eq v1, v2, :cond_10

    .line 214
    .line 215
    return v3

    .line 216
    :cond_10
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->hasDefaultBackgroundLineConfig()Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-eqz v1, :cond_11

    .line 221
    .line 222
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getDefaultBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getDefaultBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-nez v1, :cond_11

    .line 235
    .line 236
    return v3

    .line 237
    :cond_11
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->hasLastBackgroundLineConfig()Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->hasLastBackgroundLineConfig()Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    if-eq v1, v2, :cond_12

    .line 246
    .line 247
    return v3

    .line 248
    :cond_12
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->hasLastBackgroundLineConfig()Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-eqz v1, :cond_13

    .line 253
    .line 254
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getLastBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getLastBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-nez v1, :cond_13

    .line 267
    .line 268
    return v3

    .line 269
    :cond_13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result p1

    .line 281
    if-nez p1, :cond_14

    .line 282
    .line 283
    return v3

    .line 284
    :cond_14
    return v0
.end method

.method public getAuthor()Lcom/zykj/board/EzyHeader$Author;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->author_:Lcom/zykj/board/EzyHeader$Author;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->getDefaultInstance()Lcom/zykj/board/EzyHeader$Author;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getAuthorOrBuilder()Lb4/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->author_:Lcom/zykj/board/EzyHeader$Author;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->getDefaultInstance()Lcom/zykj/board/EzyHeader$Author;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getConvertUrl()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->convertUrl_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->convertUrl_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getConvertUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->convertUrl_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->convertUrl_:Ljava/lang/Object;

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

.method public getCreateDate()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/board/EzyHeader$Header;->createDate_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getDefaultBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->defaultBackgroundColor_:I

    .line 2
    .line 3
    return v0
.end method

.method public getDefaultBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->defaultBackgroundLineConfig_:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

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

.method public getDefaultBackgroundLineConfigOrBuilder()Lb4/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->defaultBackgroundLineConfig_:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getDefaultInstanceForType()Lcom/zykj/board/EzyHeader$Header;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getDefaultInstanceForType()Lcom/zykj/board/EzyHeader$Header;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/board/EzyHeader$Header;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->a:Lcom/zykj/board/EzyHeader$Header;

    return-object v0
.end method

.method public getDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/board/EzyHeader$Header;->duration_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->height_:I

    .line 2
    .line 3
    return v0
.end method

.method public getLastBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->lastBackgroundColor_:I

    .line 2
    .line 3
    return v0
.end method

.method public getLastBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->lastBackgroundLineConfig_:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

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

.method public getLastBackgroundLineConfigOrBuilder()Lb4/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->lastBackgroundLineConfig_:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

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

.method public getMoveConfig()Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->moveConfig_:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->getDefaultInstance()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getMoveConfigOrBuilder()Lb4/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->moveConfig_:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->getDefaultInstance()Lcom/zykj/board/EzyHeader$MoveConfig;

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
            "Lcom/zykj/board/EzyHeader$Header;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->b:Lb4/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public getProvider(I)Lcom/zykj/board/EzyHeader$Author;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->provider_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/board/EzyHeader$Author;

    .line 8
    .line 9
    return-object p1
.end method

.method public getProviderCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->provider_:Ljava/util/List;

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

.method public getProviderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyHeader$Author;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->provider_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getProviderOrBuilder(I)Lb4/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->provider_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lb4/p;

    .line 8
    .line 9
    return-object p1
.end method

.method public getProviderOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lb4/p;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->provider_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSerializedSize()I
    .locals 10

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
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->version_:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-static {v2, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move v0, v1

    .line 19
    :goto_0
    iget v3, p0, Lcom/zykj/board/EzyHeader$Header;->width_:I

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    invoke-static {v4, v3}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    add-int/2addr v0, v3

    .line 29
    :cond_2
    iget v3, p0, Lcom/zykj/board/EzyHeader$Header;->height_:I

    .line 30
    .line 31
    if-eqz v3, :cond_3

    .line 32
    .line 33
    const/4 v5, 0x3

    .line 34
    invoke-static {v5, v3}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    add-int/2addr v0, v3

    .line 39
    :cond_3
    iget-wide v5, p0, Lcom/zykj/board/EzyHeader$Header;->createDate_:J

    .line 40
    .line 41
    const-wide/16 v7, 0x0

    .line 42
    .line 43
    cmp-long v3, v5, v7

    .line 44
    .line 45
    const/4 v9, 0x4

    .line 46
    if-eqz v3, :cond_4

    .line 47
    .line 48
    invoke-static {v9, v5, v6}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    add-int/2addr v0, v3

    .line 53
    :cond_4
    iget-wide v5, p0, Lcom/zykj/board/EzyHeader$Header;->updateDate_:J

    .line 54
    .line 55
    cmp-long v3, v5, v7

    .line 56
    .line 57
    if-eqz v3, :cond_5

    .line 58
    .line 59
    const/4 v3, 0x5

    .line 60
    invoke-static {v3, v5, v6}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    add-int/2addr v0, v3

    .line 65
    :cond_5
    iget-wide v5, p0, Lcom/zykj/board/EzyHeader$Header;->duration_:J

    .line 66
    .line 67
    cmp-long v3, v5, v7

    .line 68
    .line 69
    if-eqz v3, :cond_6

    .line 70
    .line 71
    const/4 v3, 0x6

    .line 72
    invoke-static {v3, v5, v6}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    add-int/2addr v0, v3

    .line 77
    :cond_6
    iget v3, p0, Lcom/zykj/board/EzyHeader$Header;->bitField0_:I

    .line 78
    .line 79
    and-int/2addr v2, v3

    .line 80
    if-eqz v2, :cond_7

    .line 81
    .line 82
    const/4 v2, 0x7

    .line 83
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getAuthor()Lcom/zykj/board/EzyHeader$Author;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {v2, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    add-int/2addr v0, v2

    .line 92
    :cond_7
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Header;->convertUrl_:Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v2}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    const/16 v3, 0x8

    .line 99
    .line 100
    if-nez v2, :cond_8

    .line 101
    .line 102
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Header;->convertUrl_:Ljava/lang/Object;

    .line 103
    .line 104
    invoke-static {v3, v2}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    add-int/2addr v0, v2

    .line 109
    :cond_8
    :goto_1
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Header;->provider_:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-ge v1, v2, :cond_9

    .line 116
    .line 117
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Header;->provider_:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 124
    .line 125
    const/16 v5, 0x9

    .line 126
    .line 127
    invoke-static {v5, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    add-int/2addr v0, v2

    .line 132
    add-int/lit8 v1, v1, 0x1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_9
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header;->defaultBackgroundColor_:I

    .line 136
    .line 137
    if-eqz v1, :cond_a

    .line 138
    .line 139
    const/16 v2, 0xa

    .line 140
    .line 141
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    add-int/2addr v0, v1

    .line 146
    :cond_a
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header;->lastBackgroundColor_:I

    .line 147
    .line 148
    if-eqz v1, :cond_b

    .line 149
    .line 150
    const/16 v2, 0xb

    .line 151
    .line 152
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    add-int/2addr v0, v1

    .line 157
    :cond_b
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header;->bitField0_:I

    .line 158
    .line 159
    and-int/2addr v1, v4

    .line 160
    if-eqz v1, :cond_c

    .line 161
    .line 162
    const/16 v1, 0xc

    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getMoveConfig()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    add-int/2addr v0, v1

    .line 173
    :cond_c
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header;->bitField0_:I

    .line 174
    .line 175
    and-int/2addr v1, v9

    .line 176
    if-eqz v1, :cond_d

    .line 177
    .line 178
    const/16 v1, 0xd

    .line 179
    .line 180
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getDefaultBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    add-int/2addr v0, v1

    .line 189
    :cond_d
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header;->bitField0_:I

    .line 190
    .line 191
    and-int/2addr v1, v3

    .line 192
    if-eqz v1, :cond_e

    .line 193
    .line 194
    const/16 v1, 0xe

    .line 195
    .line 196
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getLastBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    add-int/2addr v0, v1

    .line 205
    :cond_e
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    add-int/2addr v1, v0

    .line 214
    iput v1, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 215
    .line 216
    return v1
.end method

.method public getUpdateDate()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/board/EzyHeader$Header;->updateDate_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->version_:I

    .line 2
    .line 3
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->width_:I

    .line 2
    .line 3
    return v0
.end method

.method public hasAuthor()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->bitField0_:I

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

.method public hasDefaultBackgroundLineConfig()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->bitField0_:I

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

.method public hasLastBackgroundLineConfig()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x8

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

.method public hasMoveConfig()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->bitField0_:I

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

.method public hashCode()I
    .locals 6

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
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    add-int/2addr v3, v0

    .line 29
    mul-int/2addr v3, v1

    .line 30
    add-int/lit8 v3, v3, 0x2

    .line 31
    .line 32
    mul-int/2addr v3, v2

    .line 33
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v3

    .line 38
    mul-int/2addr v0, v1

    .line 39
    add-int/lit8 v0, v0, 0x3

    .line 40
    .line 41
    mul-int/2addr v0, v2

    .line 42
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getHeight()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    add-int/2addr v3, v0

    .line 47
    mul-int/2addr v3, v1

    .line 48
    add-int/lit8 v3, v3, 0x4

    .line 49
    .line 50
    mul-int/2addr v3, v2

    .line 51
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getCreateDate()J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    invoke-static {v4, v5}, Lcom/google/protobuf/Internal;->hashLong(J)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    add-int/2addr v0, v3

    .line 60
    mul-int/2addr v0, v1

    .line 61
    add-int/lit8 v0, v0, 0x5

    .line 62
    .line 63
    mul-int/2addr v0, v2

    .line 64
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getUpdateDate()J

    .line 65
    .line 66
    .line 67
    move-result-wide v3

    .line 68
    invoke-static {v3, v4}, Lcom/google/protobuf/Internal;->hashLong(J)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    add-int/2addr v3, v0

    .line 73
    mul-int/2addr v3, v1

    .line 74
    add-int/lit8 v3, v3, 0x6

    .line 75
    .line 76
    mul-int/2addr v3, v2

    .line 77
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getDuration()J

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    invoke-static {v4, v5}, Lcom/google/protobuf/Internal;->hashLong(J)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    add-int/2addr v0, v3

    .line 86
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->hasAuthor()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_1

    .line 91
    .line 92
    const/4 v3, 0x7

    .line 93
    invoke-static {v0, v1, v3, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getAuthor()Lcom/zykj/board/EzyHeader$Author;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v3}, Lcom/zykj/board/EzyHeader$Author;->hashCode()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    add-int/2addr v0, v3

    .line 106
    :cond_1
    const/16 v3, 0x8

    .line 107
    .line 108
    invoke-static {v0, v1, v3, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getConvertUrl()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    add-int/2addr v3, v0

    .line 121
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getProviderCount()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-lez v0, :cond_2

    .line 126
    .line 127
    const/16 v0, 0x9

    .line 128
    .line 129
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getProviderList()Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    add-int/2addr v3, v0

    .line 142
    :cond_2
    const/16 v0, 0xa

    .line 143
    .line 144
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getDefaultBackgroundColor()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    add-int/2addr v3, v0

    .line 153
    mul-int/2addr v3, v1

    .line 154
    add-int/lit8 v3, v3, 0xb

    .line 155
    .line 156
    mul-int/2addr v3, v2

    .line 157
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getLastBackgroundColor()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    add-int/2addr v0, v3

    .line 162
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->hasMoveConfig()Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eqz v3, :cond_3

    .line 167
    .line 168
    const/16 v3, 0xc

    .line 169
    .line 170
    invoke-static {v0, v1, v3, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getMoveConfig()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v3}, Lcom/zykj/board/EzyHeader$MoveConfig;->hashCode()I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    add-int/2addr v0, v3

    .line 183
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->hasDefaultBackgroundLineConfig()Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-eqz v3, :cond_4

    .line 188
    .line 189
    const/16 v3, 0xd

    .line 190
    .line 191
    invoke-static {v0, v1, v3, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getDefaultBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v3}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->hashCode()I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    add-int/2addr v0, v3

    .line 204
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->hasLastBackgroundLineConfig()Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-eqz v3, :cond_5

    .line 209
    .line 210
    const/16 v3, 0xe

    .line 211
    .line 212
    invoke-static {v0, v1, v3, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getLastBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->hashCode()I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    add-int/2addr v0, v1

    .line 225
    :cond_5
    mul-int/lit8 v0, v0, 0x1d

    .line 226
    .line 227
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    add-int/2addr v1, v0

    .line 236
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 237
    .line 238
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    sget-object v0, Lb4/y;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/board/EzyHeader$Header;

    .line 4
    .line 5
    const-class v2, Lb4/u;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyHeader$Header;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyHeader$Header;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public newBuilderForType()Lb4/u;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->newBuilder()Lb4/u;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lb4/u;
    .locals 1

    .line 5
    new-instance v0, Lb4/u;

    .line 6
    invoke-direct {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 7
    const-string p1, ""

    iput-object p1, v0, Lb4/u;->j:Ljava/lang/Object;

    .line 8
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, v0, Lb4/u;->k:Ljava/util/List;

    .line 9
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->access$400()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 10
    invoke-virtual {v0}, Lb4/u;->h()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    invoke-virtual {v0}, Lb4/u;->l()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 12
    invoke-virtual {v0}, Lb4/u;->k()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 13
    invoke-virtual {v0}, Lb4/u;->i()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 14
    invoke-virtual {v0}, Lb4/u;->j()Lcom/google/protobuf/SingleFieldBuilderV3;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->newBuilderForType()Lb4/u;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lb4/u;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->newBuilderForType()Lb4/u;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyHeader$Header;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyHeader$Header;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public toBuilder()Lb4/u;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/board/EzyHeader$Header;->a:Lcom/zykj/board/EzyHeader$Header;

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lb4/u;

    .line 5
    invoke-direct {v0}, Lb4/u;-><init>()V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lb4/u;

    .line 7
    invoke-direct {v0}, Lb4/u;-><init>()V

    .line 8
    invoke-virtual {v0, p0}, Lb4/u;->m(Lcom/zykj/board/EzyHeader$Header;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->toBuilder()Lb4/u;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->toBuilder()Lb4/u;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->version_:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->width_:I

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1, v2, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->height_:I

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const/4 v3, 0x3

    .line 22
    invoke-virtual {p1, v3, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 23
    .line 24
    .line 25
    :cond_2
    iget-wide v3, p0, Lcom/zykj/board/EzyHeader$Header;->createDate_:J

    .line 26
    .line 27
    const-wide/16 v5, 0x0

    .line 28
    .line 29
    cmp-long v0, v3, v5

    .line 30
    .line 31
    const/4 v7, 0x4

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {p1, v7, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 35
    .line 36
    .line 37
    :cond_3
    iget-wide v3, p0, Lcom/zykj/board/EzyHeader$Header;->updateDate_:J

    .line 38
    .line 39
    cmp-long v0, v3, v5

    .line 40
    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    const/4 v0, 0x5

    .line 44
    invoke-virtual {p1, v0, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 45
    .line 46
    .line 47
    :cond_4
    iget-wide v3, p0, Lcom/zykj/board/EzyHeader$Header;->duration_:J

    .line 48
    .line 49
    cmp-long v0, v3, v5

    .line 50
    .line 51
    if-eqz v0, :cond_5

    .line 52
    .line 53
    const/4 v0, 0x6

    .line 54
    invoke-virtual {p1, v0, v3, v4}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 55
    .line 56
    .line 57
    :cond_5
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->bitField0_:I

    .line 58
    .line 59
    and-int/2addr v0, v1

    .line 60
    if-eqz v0, :cond_6

    .line 61
    .line 62
    const/4 v0, 0x7

    .line 63
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getAuthor()Lcom/zykj/board/EzyHeader$Author;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 68
    .line 69
    .line 70
    :cond_6
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->convertUrl_:Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/16 v1, 0x8

    .line 77
    .line 78
    if-nez v0, :cond_7

    .line 79
    .line 80
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header;->convertUrl_:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_7
    const/4 v0, 0x0

    .line 86
    :goto_0
    iget-object v3, p0, Lcom/zykj/board/EzyHeader$Header;->provider_:Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-ge v0, v3, :cond_8

    .line 93
    .line 94
    iget-object v3, p0, Lcom/zykj/board/EzyHeader$Header;->provider_:Ljava/util/List;

    .line 95
    .line 96
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Lcom/google/protobuf/MessageLite;

    .line 101
    .line 102
    const/16 v4, 0x9

    .line 103
    .line 104
    invoke-virtual {p1, v4, v3}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v0, v0, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_8
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->defaultBackgroundColor_:I

    .line 111
    .line 112
    if-eqz v0, :cond_9

    .line 113
    .line 114
    const/16 v3, 0xa

    .line 115
    .line 116
    invoke-virtual {p1, v3, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 117
    .line 118
    .line 119
    :cond_9
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->lastBackgroundColor_:I

    .line 120
    .line 121
    if-eqz v0, :cond_a

    .line 122
    .line 123
    const/16 v3, 0xb

    .line 124
    .line 125
    invoke-virtual {p1, v3, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 126
    .line 127
    .line 128
    :cond_a
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->bitField0_:I

    .line 129
    .line 130
    and-int/2addr v0, v2

    .line 131
    if-eqz v0, :cond_b

    .line 132
    .line 133
    const/16 v0, 0xc

    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getMoveConfig()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {p1, v0, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 140
    .line 141
    .line 142
    :cond_b
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->bitField0_:I

    .line 143
    .line 144
    and-int/2addr v0, v7

    .line 145
    if-eqz v0, :cond_c

    .line 146
    .line 147
    const/16 v0, 0xd

    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getDefaultBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {p1, v0, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 154
    .line 155
    .line 156
    :cond_c
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header;->bitField0_:I

    .line 157
    .line 158
    and-int/2addr v0, v1

    .line 159
    if-eqz v0, :cond_d

    .line 160
    .line 161
    const/16 v0, 0xe

    .line 162
    .line 163
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header;->getLastBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 168
    .line 169
    .line 170
    :cond_d
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 175
    .line 176
    .line 177
    return-void
.end method
