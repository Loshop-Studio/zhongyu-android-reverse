# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/lib/login/proto/ServerBean;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/lib/login/proto/ServerBeanOrBuilder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/lib/login/proto/ServerBean$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite<",
        "Lcom/zykj/lib/login/proto/ServerBean;",
        "Lcom/zykj/lib/login/proto/ServerBean$Builder;",
        ">;",
        "Lcom/zykj/lib/login/proto/ServerBeanOrBuilder;"
    }
.end annotation


# static fields
.field public static final ACCESSTOKEN_FIELD_NUMBER:I = 0x3

.field private static final DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

.field private static volatile PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/lib/login/proto/ServerBean;",
            ">;"
        }
    .end annotation
.end field

.field public static final REFRESHTOKEN_FIELD_NUMBER:I = 0x4

.field public static final SCHOOLCODE_FIELD_NUMBER:I = 0x1

.field public static final SERVERURL_FIELD_NUMBER:I = 0x2

.field public static final WEBSERVERURL_FIELD_NUMBER:I = 0x5


# instance fields
.field private accessToken_:Ljava/lang/String;

.field private refreshToken_:Ljava/lang/String;

.field private schoolCode_:Ljava/lang/String;

.field private serverUrl_:Ljava/lang/String;

.field private webServerUrl_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/lib/login/proto/ServerBean;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    const-class v1, Lcom/zykj/lib/login/proto/ServerBean;

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
    iput-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->schoolCode_:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->serverUrl_:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->accessToken_:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->refreshToken_:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->webServerUrl_:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method

.method public static bridge synthetic a(Lcom/zykj/lib/login/proto/ServerBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/proto/ServerBean;->clearAccessToken()V

    return-void
.end method

.method public static bridge synthetic b(Lcom/zykj/lib/login/proto/ServerBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/proto/ServerBean;->clearRefreshToken()V

    return-void
.end method

.method public static bridge synthetic c(Lcom/zykj/lib/login/proto/ServerBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/proto/ServerBean;->clearSchoolCode()V

    return-void
.end method

.method private clearAccessToken()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/lib/login/proto/ServerBean;->getDefaultInstance()Lcom/zykj/lib/login/proto/ServerBean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getAccessToken()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->accessToken_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearRefreshToken()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/lib/login/proto/ServerBean;->getDefaultInstance()Lcom/zykj/lib/login/proto/ServerBean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getRefreshToken()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->refreshToken_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearSchoolCode()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/lib/login/proto/ServerBean;->getDefaultInstance()Lcom/zykj/lib/login/proto/ServerBean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getSchoolCode()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->schoolCode_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearServerUrl()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/lib/login/proto/ServerBean;->getDefaultInstance()Lcom/zykj/lib/login/proto/ServerBean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getServerUrl()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->serverUrl_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearWebServerUrl()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/lib/login/proto/ServerBean;->getDefaultInstance()Lcom/zykj/lib/login/proto/ServerBean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getWebServerUrl()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->webServerUrl_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public static bridge synthetic d(Lcom/zykj/lib/login/proto/ServerBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/proto/ServerBean;->clearServerUrl()V

    return-void
.end method

.method public static bridge synthetic e(Lcom/zykj/lib/login/proto/ServerBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/proto/ServerBean;->clearWebServerUrl()V

    return-void
.end method

.method public static bridge synthetic g(Lcom/zykj/lib/login/proto/ServerBean;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->setAccessToken(Ljava/lang/String;)V

    return-void
.end method

.method public static getDefaultInstance()Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic h(Lcom/zykj/lib/login/proto/ServerBean;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->setAccessTokenBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic i(Lcom/zykj/lib/login/proto/ServerBean;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->setRefreshToken(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic j(Lcom/zykj/lib/login/proto/ServerBean;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->setRefreshTokenBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic k(Lcom/zykj/lib/login/proto/ServerBean;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->setSchoolCode(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic l(Lcom/zykj/lib/login/proto/ServerBean;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->setSchoolCodeBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic m(Lcom/zykj/lib/login/proto/ServerBean;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->setServerUrl(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic n(Lcom/zykj/lib/login/proto/ServerBean;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->setServerUrlBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static newBuilder()Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean$Builder;

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/lib/login/proto/ServerBean;)Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/ServerBean$Builder;

    return-object p0
.end method

.method public static bridge synthetic o(Lcom/zykj/lib/login/proto/ServerBean;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->setWebServerUrl(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic p(Lcom/zykj/lib/login/proto/ServerBean;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->setWebServerUrlBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/ServerBean;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/ServerBean;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/ServerBean;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 4
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/ServerBean;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 9
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/ServerBean;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 10
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/ServerBean;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 7
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/ServerBean;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 8
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/ServerBean;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/ServerBean;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/ServerBean;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 5
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/ServerBean;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 6
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/ServerBean;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/lib/login/proto/ServerBean;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

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

.method public static bridge synthetic q()Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    return-object v0
.end method

.method private setAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/lib/login/proto/ServerBean;->accessToken_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setAccessTokenBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/zykj/lib/login/proto/ServerBean;->accessToken_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setRefreshToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/lib/login/proto/ServerBean;->refreshToken_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setRefreshTokenBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/zykj/lib/login/proto/ServerBean;->refreshToken_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setSchoolCode(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/lib/login/proto/ServerBean;->schoolCode_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setSchoolCodeBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/zykj/lib/login/proto/ServerBean;->schoolCode_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setServerUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/lib/login/proto/ServerBean;->serverUrl_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setServerUrlBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/zykj/lib/login/proto/ServerBean;->serverUrl_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setWebServerUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/lib/login/proto/ServerBean;->webServerUrl_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setWebServerUrlBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/zykj/lib/login/proto/ServerBean;->webServerUrl_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object p2, Lcom/zykj/lib/login/proto/ServerBean$1;->$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke:[I

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
    sget-object p1, Lcom/zykj/lib/login/proto/ServerBean;->PARSER:Lcom/google/protobuf/Parser;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-class p2, Lcom/zykj/lib/login/proto/ServerBean;

    .line 31
    .line 32
    monitor-enter p2

    .line 33
    :try_start_0
    sget-object p1, Lcom/zykj/lib/login/proto/ServerBean;->PARSER:Lcom/google/protobuf/Parser;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 38
    .line 39
    sget-object p3, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 42
    .line 43
    .line 44
    sput-object p1, Lcom/zykj/lib/login/proto/ServerBean;->PARSER:Lcom/google/protobuf/Parser;

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
    sget-object p1, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_4
    const-string p1, "schoolCode_"

    .line 58
    .line 59
    const-string p2, "serverUrl_"

    .line 60
    .line 61
    const-string p3, "accessToken_"

    .line 62
    .line 63
    const-string v0, "refreshToken_"

    .line 64
    .line 65
    const-string v1, "webServerUrl_"

    .line 66
    .line 67
    filled-new-array {p1, p2, p3, v0, v1}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string p2, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208"

    .line 72
    .line 73
    sget-object p3, Lcom/zykj/lib/login/proto/ServerBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/ServerBean;

    .line 74
    .line 75
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/GeneratedMessageLite;->newMessageInfo(Lcom/google/protobuf/MessageLite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :pswitch_5
    new-instance p1, Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 81
    .line 82
    invoke-direct {p1, p2}, Lcom/zykj/lib/login/proto/ServerBean$Builder;-><init>(Lcom/zykj/lib/login/proto/a;)V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    :pswitch_6
    new-instance p1, Lcom/zykj/lib/login/proto/ServerBean;

    .line 87
    .line 88
    invoke-direct {p1}, Lcom/zykj/lib/login/proto/ServerBean;-><init>()V

    .line 89
    .line 90
    .line 91
    return-object p1

    .line 92
    nop

    .line 93
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

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->accessToken_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAccessTokenBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->accessToken_:Ljava/lang/String;

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

.method public getRefreshToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->refreshToken_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRefreshTokenBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->refreshToken_:Ljava/lang/String;

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

.method public getSchoolCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->schoolCode_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSchoolCodeBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->schoolCode_:Ljava/lang/String;

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

.method public getServerUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->serverUrl_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getServerUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->serverUrl_:Ljava/lang/String;

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

.method public getWebServerUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->webServerUrl_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getWebServerUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/ServerBean;->webServerUrl_:Ljava/lang/String;

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
