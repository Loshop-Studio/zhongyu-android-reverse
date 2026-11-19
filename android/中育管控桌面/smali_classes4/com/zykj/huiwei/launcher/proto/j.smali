# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/huiwei/launcher/proto/j;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/huiwei/launcher/proto/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/proto/j$b;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

.field public static final IGNOREVERSIONCODE_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/huiwei/launcher/proto/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private ignoreVersionCode_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/proto/j;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/proto/j;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    .line 7
    .line 8
    const-class v1, Lcom/zykj/huiwei/launcher/proto/j;

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

.method public static bridge synthetic a(Lcom/zykj/huiwei/launcher/proto/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/j;->clearIgnoreVersionCode()V

    return-void
.end method

.method public static bridge synthetic b(Lcom/zykj/huiwei/launcher/proto/j;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/j;->setIgnoreVersionCode(I)V

    return-void
.end method

.method public static bridge synthetic c()Lcom/zykj/huiwei/launcher/proto/j;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    return-object v0
.end method

.method private clearIgnoreVersionCode()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/huiwei/launcher/proto/j;->ignoreVersionCode_:I

    .line 3
    .line 4
    return-void
.end method

.method public static getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/j;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/huiwei/launcher/proto/j$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/huiwei/launcher/proto/j$b;

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/huiwei/launcher/proto/j;)Lcom/zykj/huiwei/launcher/proto/j$b;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/j$b;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/huiwei/launcher/proto/j;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/j;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/j;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/j;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/j;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/j;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/j;
    .locals 1

    .line 4
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/j;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/huiwei/launcher/proto/j;
    .locals 1

    .line 9
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/j;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/j;
    .locals 1

    .line 10
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/j;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/huiwei/launcher/proto/j;
    .locals 1

    .line 7
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/j;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/j;
    .locals 1

    .line 8
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/j;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/huiwei/launcher/proto/j;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/j;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/j;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/j;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/huiwei/launcher/proto/j;
    .locals 1

    .line 5
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/j;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/j;
    .locals 1

    .line 6
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/j;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/huiwei/launcher/proto/j;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

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

.method private setIgnoreVersionCode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/huiwei/launcher/proto/j;->ignoreVersionCode_:I

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p2, Lcom/zykj/huiwei/launcher/proto/j$a;->$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke:[I

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
    throw p2

    .line 14
    :pswitch_0
    const/4 p1, 0x1

    .line 15
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :pswitch_1
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/j;->PARSER:Lcom/google/protobuf/Parser;

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    const-class p2, Lcom/zykj/huiwei/launcher/proto/j;

    .line 25
    .line 26
    monitor-enter p2

    .line 27
    :try_start_0
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/j;->PARSER:Lcom/google/protobuf/Parser;

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 32
    .line 33
    sget-object p3, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    .line 34
    .line 35
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 36
    .line 37
    .line 38
    sput-object p1, Lcom/zykj/huiwei/launcher/proto/j;->PARSER:Lcom/google/protobuf/Parser;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    monitor-exit p2

    .line 44
    return-object p1

    .line 45
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw p1

    .line 47
    :cond_1
    return-object p1

    .line 48
    :pswitch_2
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_3
    const-string p1, "ignoreVersionCode_"

    .line 52
    .line 53
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string p2, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004"

    .line 58
    .line 59
    sget-object p3, Lcom/zykj/huiwei/launcher/proto/j;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/j;

    .line 60
    .line 61
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/GeneratedMessageLite;->newMessageInfo(Lcom/google/protobuf/MessageLite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :pswitch_4
    new-instance p1, Lcom/zykj/huiwei/launcher/proto/j$b;

    .line 67
    .line 68
    invoke-direct {p1, p2}, Lcom/zykj/huiwei/launcher/proto/j$b;-><init>(Lcom/zykj/huiwei/launcher/proto/k;)V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_5
    new-instance p1, Lcom/zykj/huiwei/launcher/proto/j;

    .line 73
    .line 74
    invoke-direct {p1}, Lcom/zykj/huiwei/launcher/proto/j;-><init>()V

    .line 75
    .line 76
    .line 77
    return-object p1

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getIgnoreVersionCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/proto/j;->ignoreVersionCode_:I

    .line 2
    .line 3
    return v0
.end method
