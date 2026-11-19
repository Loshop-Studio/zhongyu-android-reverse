# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/view/EzySimpleBoardData$Paint;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/EzySimpleBoardData$PaintOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/EzySimpleBoardData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Paint"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite<",
        "Lcom/zykj/view/EzySimpleBoardData$Paint;",
        "Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;",
        ">;",
        "Lcom/zykj/view/EzySimpleBoardData$PaintOrBuilder;"
    }
.end annotation


# static fields
.field public static final COLOR_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

.field public static final ISDASHED_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/view/EzySimpleBoardData$Paint;",
            ">;"
        }
    .end annotation
.end field

.field public static final WIDTH_FIELD_NUMBER:I = 0x1


# instance fields
.field private color_:I

.field private isDashed_:Z

.field private width_:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/view/EzySimpleBoardData$Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 7
    .line 8
    const-class v1, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageLite;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageLite;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic a(Lcom/zykj/view/EzySimpleBoardData$Paint;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->clearColor()V

    return-void
.end method

.method private clearColor()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/view/EzySimpleBoardData$Paint;->color_:I

    .line 3
    .line 4
    return-void
.end method

.method private clearIsDashed()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/view/EzySimpleBoardData$Paint;->isDashed_:Z

    .line 3
    .line 4
    return-void
.end method

.method private clearWidth()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/view/EzySimpleBoardData$Paint;->width_:F

    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic f(Lcom/zykj/view/EzySimpleBoardData$Paint;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->clearIsDashed()V

    return-void
.end method

.method public static getDefaultInstance()Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic j(Lcom/zykj/view/EzySimpleBoardData$Paint;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->clearWidth()V

    return-void
.end method

.method public static bridge synthetic k(Lcom/zykj/view/EzySimpleBoardData$Paint;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/EzySimpleBoardData$Paint;->setColor(I)V

    return-void
.end method

.method public static bridge synthetic m(Lcom/zykj/view/EzySimpleBoardData$Paint;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/EzySimpleBoardData$Paint;->setIsDashed(Z)V

    return-void
.end method

.method public static newBuilder()Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/view/EzySimpleBoardData$Paint;)Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;

    return-object p0
.end method

.method public static bridge synthetic o(Lcom/zykj/view/EzySimpleBoardData$Paint;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/EzySimpleBoardData$Paint;->setWidth(F)V

    return-void
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/view/EzySimpleBoardData$Paint;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->getParserForType()Lcom/google/protobuf/Parser;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static bridge synthetic q()Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    return-object v0
.end method

.method private setColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/EzySimpleBoardData$Paint;->color_:I

    .line 2
    .line 3
    return-void
.end method

.method private setIsDashed(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/EzySimpleBoardData$Paint;->isDashed_:Z

    .line 2
    .line 3
    return-void
.end method

.method private setWidth(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/EzySimpleBoardData$Paint;->width_:F

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p2, Lcom/zykj/view/EzySimpleBoardData$1;->$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, p2, p1

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :pswitch_0
    return-object p2

    .line 20
    :pswitch_1
    const/4 p1, 0x1

    .line 21
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :pswitch_2
    sget-object p1, Lcom/zykj/view/EzySimpleBoardData$Paint;->PARSER:Lcom/google/protobuf/Parser;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-class p2, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 31
    .line 32
    monitor-enter p2

    .line 33
    :try_start_0
    sget-object p1, Lcom/zykj/view/EzySimpleBoardData$Paint;->PARSER:Lcom/google/protobuf/Parser;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 38
    .line 39
    sget-object p3, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 42
    .line 43
    .line 44
    sput-object p1, Lcom/zykj/view/EzySimpleBoardData$Paint;->PARSER:Lcom/google/protobuf/Parser;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    monitor-exit p2

    .line 50
    return-object p1

    .line 51
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw p1

    .line 53
    :cond_1
    return-object p1

    .line 54
    :pswitch_3
    sget-object p1, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_4
    const-string p1, "width_"

    .line 58
    .line 59
    const-string p2, "color_"

    .line 60
    .line 61
    const-string p3, "isDashed_"

    .line 62
    .line 63
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string p2, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0002\u0004\u0003\u0007"

    .line 68
    .line 69
    sget-object p3, Lcom/zykj/view/EzySimpleBoardData$Paint;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 70
    .line 71
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/GeneratedMessageLite;->newMessageInfo(Lcom/google/protobuf/MessageLite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :pswitch_5
    new-instance p1, Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;

    .line 77
    .line 78
    invoke-direct {p1, p2}, Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;-><init>(Lcom/zykj/view/b;)V

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_6
    new-instance p1, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 83
    .line 84
    invoke-direct {p1}, Lcom/zykj/view/EzySimpleBoardData$Paint;-><init>()V

    .line 85
    .line 86
    .line 87
    return-object p1

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/EzySimpleBoardData$Paint;->color_:I

    .line 2
    .line 3
    return v0
.end method

.method public getIsDashed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/EzySimpleBoardData$Paint;->isDashed_:Z

    .line 2
    .line 3
    return v0
.end method

.method public getWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/EzySimpleBoardData$Paint;->width_:F

    .line 2
    .line 3
    return v0
.end method
