# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/huiwei/launcher/proto/d;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/huiwei/launcher/proto/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/proto/d$b;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

.field public static final ISFIRSTINSTALL_FIELD_NUMBER:I = 0x3

.field public static final ISLOGINSUCCESS_FIELD_NUMBER:I = 0x2

.field public static final NEEDCHECKCRACK_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/huiwei/launcher/proto/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final WHITEIPLIST_FIELD_NUMBER:I = 0x4

.field public static final WIFIINFO_FIELD_NUMBER:I = 0x5


# instance fields
.field private isFirstInstall_:Z

.field private isLoginSuccess_:Z

.field private needCheckCrack_:Z

.field private whiteIpList_:Ljava/lang/String;

.field private wifiInfo_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/proto/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    .line 7
    .line 8
    const-class v1, Lcom/zykj/huiwei/launcher/proto/d;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageLite;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageLite;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/d;->whiteIpList_:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/d;->wifiInfo_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public static bridge synthetic a(Lcom/zykj/huiwei/launcher/proto/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/d;->clearIsFirstInstall()V

    return-void
.end method

.method public static bridge synthetic b(Lcom/zykj/huiwei/launcher/proto/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/d;->clearIsLoginSuccess()V

    return-void
.end method

.method public static bridge synthetic c(Lcom/zykj/huiwei/launcher/proto/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/d;->clearNeedCheckCrack()V

    return-void
.end method

.method private clearIsFirstInstall()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/huiwei/launcher/proto/d;->isFirstInstall_:Z

    .line 3
    .line 4
    return-void
.end method

.method private clearIsLoginSuccess()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/huiwei/launcher/proto/d;->isLoginSuccess_:Z

    .line 3
    .line 4
    return-void
.end method

.method private clearNeedCheckCrack()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/huiwei/launcher/proto/d;->needCheckCrack_:Z

    .line 3
    .line 4
    return-void
.end method

.method private clearWhiteIpList()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/d;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/d;->getWhiteIpList()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/d;->whiteIpList_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearWifiInfo()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/d;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/d;->getWifiInfo()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/d;->wifiInfo_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public static bridge synthetic d(Lcom/zykj/huiwei/launcher/proto/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/d;->clearWhiteIpList()V

    return-void
.end method

.method public static bridge synthetic e(Lcom/zykj/huiwei/launcher/proto/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/d;->clearWifiInfo()V

    return-void
.end method

.method public static bridge synthetic f(Lcom/zykj/huiwei/launcher/proto/d;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/d;->setIsFirstInstall(Z)V

    return-void
.end method

.method public static bridge synthetic g(Lcom/zykj/huiwei/launcher/proto/d;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/d;->setIsLoginSuccess(Z)V

    return-void
.end method

.method public static getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic h(Lcom/zykj/huiwei/launcher/proto/d;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/d;->setNeedCheckCrack(Z)V

    return-void
.end method

.method public static bridge synthetic i(Lcom/zykj/huiwei/launcher/proto/d;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/d;->setWhiteIpList(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic j(Lcom/zykj/huiwei/launcher/proto/d;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/d;->setWhiteIpListBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic k(Lcom/zykj/huiwei/launcher/proto/d;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/d;->setWifiInfo(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic l(Lcom/zykj/huiwei/launcher/proto/d;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/d;->setWifiInfoBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic m()Lcom/zykj/huiwei/launcher/proto/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/huiwei/launcher/proto/d$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d$b;

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/huiwei/launcher/proto/d;)Lcom/zykj/huiwei/launcher/proto/d$b;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/d$b;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/huiwei/launcher/proto/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/d;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/d;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/d;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/d;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/d;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/d;
    .locals 1

    .line 4
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/d;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/huiwei/launcher/proto/d;
    .locals 1

    .line 9
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/d;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/d;
    .locals 1

    .line 10
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/d;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/huiwei/launcher/proto/d;
    .locals 1

    .line 7
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/d;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/d;
    .locals 1

    .line 8
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/d;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/huiwei/launcher/proto/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/d;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/d;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/d;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/huiwei/launcher/proto/d;
    .locals 1

    .line 5
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/d;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/d;
    .locals 1

    .line 6
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/d;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/huiwei/launcher/proto/d;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

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

.method private setIsFirstInstall(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/huiwei/launcher/proto/d;->isFirstInstall_:Z

    .line 2
    .line 3
    return-void
.end method

.method private setIsLoginSuccess(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/huiwei/launcher/proto/d;->isLoginSuccess_:Z

    .line 2
    .line 3
    return-void
.end method

.method private setNeedCheckCrack(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/huiwei/launcher/proto/d;->needCheckCrack_:Z

    .line 2
    .line 3
    return-void
.end method

.method private setWhiteIpList(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/d;->whiteIpList_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setWhiteIpListBytes(Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/d;->whiteIpList_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setWifiInfo(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/d;->wifiInfo_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setWifiInfoBytes(Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/d;->wifiInfo_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object p2, Lcom/zykj/huiwei/launcher/proto/d$a;->$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke:[I

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
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/d;->PARSER:Lcom/google/protobuf/Parser;

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    const-class p2, Lcom/zykj/huiwei/launcher/proto/d;

    .line 25
    .line 26
    monitor-enter p2

    .line 27
    :try_start_0
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/d;->PARSER:Lcom/google/protobuf/Parser;

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 32
    .line 33
    sget-object p3, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    .line 34
    .line 35
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 36
    .line 37
    .line 38
    sput-object p1, Lcom/zykj/huiwei/launcher/proto/d;->PARSER:Lcom/google/protobuf/Parser;

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
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_3
    const-string p1, "needCheckCrack_"

    .line 52
    .line 53
    const-string p2, "isLoginSuccess_"

    .line 54
    .line 55
    const-string p3, "isFirstInstall_"

    .line 56
    .line 57
    const-string v0, "whiteIpList_"

    .line 58
    .line 59
    const-string v1, "wifiInfo_"

    .line 60
    .line 61
    filled-new-array {p1, p2, p3, v0, v1}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string p2, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0208\u0005\u0208"

    .line 66
    .line 67
    sget-object p3, Lcom/zykj/huiwei/launcher/proto/d;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/d;

    .line 68
    .line 69
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/GeneratedMessageLite;->newMessageInfo(Lcom/google/protobuf/MessageLite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :pswitch_4
    new-instance p1, Lcom/zykj/huiwei/launcher/proto/d$b;

    .line 75
    .line 76
    invoke-direct {p1, p2}, Lcom/zykj/huiwei/launcher/proto/d$b;-><init>(Lcom/zykj/huiwei/launcher/proto/e;)V

    .line 77
    .line 78
    .line 79
    return-object p1

    .line 80
    :pswitch_5
    new-instance p1, Lcom/zykj/huiwei/launcher/proto/d;

    .line 81
    .line 82
    invoke-direct {p1}, Lcom/zykj/huiwei/launcher/proto/d;-><init>()V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    nop

    .line 87
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

.method public getIsFirstInstall()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/huiwei/launcher/proto/d;->isFirstInstall_:Z

    .line 2
    .line 3
    return v0
.end method

.method public getIsLoginSuccess()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/huiwei/launcher/proto/d;->isLoginSuccess_:Z

    .line 2
    .line 3
    return v0
.end method

.method public getNeedCheckCrack()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/huiwei/launcher/proto/d;->needCheckCrack_:Z

    .line 2
    .line 3
    return v0
.end method

.method public getWhiteIpList()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/d;->whiteIpList_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getWhiteIpListBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/d;->whiteIpList_:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getWifiInfo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/d;->wifiInfo_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getWifiInfoBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/d;->wifiInfo_:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
