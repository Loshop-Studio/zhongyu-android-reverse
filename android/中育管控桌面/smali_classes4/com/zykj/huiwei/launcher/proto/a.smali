# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/huiwei/launcher/proto/a;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/huiwei/launcher/proto/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/proto/a$b;
    }
.end annotation


# static fields
.field public static final ACCESSTOKEN_FIELD_NUMBER:I = 0x3

.field private static final DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

.field public static final IMACCESSTOKEN_FIELD_NUMBER:I = 0x5

.field public static final MOBILE_FIELD_NUMBER:I = 0x6

.field public static final NEEDCHANGEPWD_FIELD_NUMBER:I = 0x8

.field public static final NEEDSMSVERIFY_FIELD_NUMBER:I = 0x7

.field private static volatile PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/huiwei/launcher/proto/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final REFRESHTOKEN_FIELD_NUMBER:I = 0x4

.field public static final SCHOOLCODE_FIELD_NUMBER:I = 0x1

.field public static final SERVERURL_FIELD_NUMBER:I = 0x2

.field public static final USERID_FIELD_NUMBER:I = 0x9

.field public static final WEBSERVERURL_FIELD_NUMBER:I = 0xa


# instance fields
.field private accessToken_:Ljava/lang/String;

.field private imAccessToken_:Ljava/lang/String;

.field private mobile_:Ljava/lang/String;

.field private needChangePwd_:Z

.field private needSmsVerify_:Z

.field private refreshToken_:Ljava/lang/String;

.field private schoolCode_:Ljava/lang/String;

.field private serverUrl_:Ljava/lang/String;

.field private userId_:J

.field private webServerUrl_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/proto/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    const-class v1, Lcom/zykj/huiwei/launcher/proto/a;

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
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->schoolCode_:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->serverUrl_:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->accessToken_:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->refreshToken_:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->imAccessToken_:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->mobile_:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->webServerUrl_:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method

.method public static bridge synthetic A(Lcom/zykj/huiwei/launcher/proto/a;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setWebServerUrlBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic B()Lcom/zykj/huiwei/launcher/proto/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    return-object v0
.end method

.method public static bridge synthetic a(Lcom/zykj/huiwei/launcher/proto/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/a;->clearAccessToken()V

    return-void
.end method

.method public static bridge synthetic b(Lcom/zykj/huiwei/launcher/proto/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/a;->clearImAccessToken()V

    return-void
.end method

.method public static bridge synthetic c(Lcom/zykj/huiwei/launcher/proto/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/a;->clearMobile()V

    return-void
.end method

.method private clearAccessToken()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/a;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getAccessToken()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->accessToken_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearImAccessToken()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/a;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getImAccessToken()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->imAccessToken_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearMobile()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/a;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getMobile()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->mobile_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearNeedChangePwd()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->needChangePwd_:Z

    .line 3
    .line 4
    return-void
.end method

.method private clearNeedSmsVerify()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->needSmsVerify_:Z

    .line 3
    .line 4
    return-void
.end method

.method private clearRefreshToken()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/a;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getRefreshToken()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->refreshToken_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearSchoolCode()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/a;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getSchoolCode()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->schoolCode_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearServerUrl()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/a;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getServerUrl()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->serverUrl_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearUserId()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->userId_:J

    .line 4
    .line 5
    return-void
.end method

.method private clearWebServerUrl()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/a;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getWebServerUrl()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->webServerUrl_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public static bridge synthetic d(Lcom/zykj/huiwei/launcher/proto/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/a;->clearNeedChangePwd()V

    return-void
.end method

.method public static bridge synthetic e(Lcom/zykj/huiwei/launcher/proto/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/a;->clearNeedSmsVerify()V

    return-void
.end method

.method public static bridge synthetic f(Lcom/zykj/huiwei/launcher/proto/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/a;->clearRefreshToken()V

    return-void
.end method

.method public static bridge synthetic g(Lcom/zykj/huiwei/launcher/proto/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/a;->clearSchoolCode()V

    return-void
.end method

.method public static getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic h(Lcom/zykj/huiwei/launcher/proto/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/a;->clearServerUrl()V

    return-void
.end method

.method public static bridge synthetic i(Lcom/zykj/huiwei/launcher/proto/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/a;->clearUserId()V

    return-void
.end method

.method public static bridge synthetic j(Lcom/zykj/huiwei/launcher/proto/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/a;->clearWebServerUrl()V

    return-void
.end method

.method public static bridge synthetic k(Lcom/zykj/huiwei/launcher/proto/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setAccessToken(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic l(Lcom/zykj/huiwei/launcher/proto/a;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setAccessTokenBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic m(Lcom/zykj/huiwei/launcher/proto/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setImAccessToken(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic n(Lcom/zykj/huiwei/launcher/proto/a;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setImAccessTokenBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static newBuilder()Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a$b;

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/huiwei/launcher/proto/a;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/a$b;

    return-object p0
.end method

.method public static bridge synthetic o(Lcom/zykj/huiwei/launcher/proto/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setMobile(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic p(Lcom/zykj/huiwei/launcher/proto/a;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setMobileBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/huiwei/launcher/proto/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/a;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/a;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/a;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/a;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/a;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/a;
    .locals 1

    .line 4
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/a;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/huiwei/launcher/proto/a;
    .locals 1

    .line 9
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/a;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/a;
    .locals 1

    .line 10
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/a;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/huiwei/launcher/proto/a;
    .locals 1

    .line 7
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/a;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/a;
    .locals 1

    .line 8
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/a;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/huiwei/launcher/proto/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/a;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/a;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/a;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/huiwei/launcher/proto/a;
    .locals 1

    .line 5
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/a;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/a;
    .locals 1

    .line 6
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/a;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/huiwei/launcher/proto/a;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

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

.method public static bridge synthetic q(Lcom/zykj/huiwei/launcher/proto/a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setNeedChangePwd(Z)V

    return-void
.end method

.method public static bridge synthetic r(Lcom/zykj/huiwei/launcher/proto/a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setNeedSmsVerify(Z)V

    return-void
.end method

.method public static bridge synthetic s(Lcom/zykj/huiwei/launcher/proto/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setRefreshToken(Ljava/lang/String;)V

    return-void
.end method

.method private setAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->accessToken_:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->accessToken_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setImAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->imAccessToken_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setImAccessTokenBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->imAccessToken_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setMobile(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->mobile_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setMobileBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->mobile_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setNeedChangePwd(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->needChangePwd_:Z

    .line 2
    .line 3
    return-void
.end method

.method private setNeedSmsVerify(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->needSmsVerify_:Z

    .line 2
    .line 3
    return-void
.end method

.method private setRefreshToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->refreshToken_:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->refreshToken_:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->schoolCode_:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->schoolCode_:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->serverUrl_:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->serverUrl_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setUserId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->userId_:J

    .line 2
    .line 3
    return-void
.end method

.method private setWebServerUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->webServerUrl_:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/a;->webServerUrl_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public static bridge synthetic t(Lcom/zykj/huiwei/launcher/proto/a;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setRefreshTokenBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic u(Lcom/zykj/huiwei/launcher/proto/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setSchoolCode(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic v(Lcom/zykj/huiwei/launcher/proto/a;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setSchoolCodeBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic w(Lcom/zykj/huiwei/launcher/proto/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setServerUrl(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic x(Lcom/zykj/huiwei/launcher/proto/a;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setServerUrlBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic y(Lcom/zykj/huiwei/launcher/proto/a;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/huiwei/launcher/proto/a;->setUserId(J)V

    return-void
.end method

.method public static bridge synthetic z(Lcom/zykj/huiwei/launcher/proto/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->setWebServerUrl(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object p2, Lcom/zykj/huiwei/launcher/proto/a$a;->$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke:[I

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
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/a;->PARSER:Lcom/google/protobuf/Parser;

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    const-class p2, Lcom/zykj/huiwei/launcher/proto/a;

    .line 25
    .line 26
    monitor-enter p2

    .line 27
    :try_start_0
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/a;->PARSER:Lcom/google/protobuf/Parser;

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 32
    .line 33
    sget-object p3, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    .line 34
    .line 35
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 36
    .line 37
    .line 38
    sput-object p1, Lcom/zykj/huiwei/launcher/proto/a;->PARSER:Lcom/google/protobuf/Parser;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p1, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    monitor-exit p2

    .line 45
    return-object p1

    .line 46
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw p1

    .line 48
    :cond_1
    return-object p1

    .line 49
    :pswitch_2
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_3
    const-string v0, "schoolCode_"

    .line 53
    .line 54
    const-string v1, "serverUrl_"

    .line 55
    .line 56
    const-string v2, "accessToken_"

    .line 57
    .line 58
    const-string v3, "refreshToken_"

    .line 59
    .line 60
    const-string v4, "imAccessToken_"

    .line 61
    .line 62
    const-string v5, "mobile_"

    .line 63
    .line 64
    const-string v6, "needSmsVerify_"

    .line 65
    .line 66
    const-string v7, "needChangePwd_"

    .line 67
    .line 68
    const-string v8, "userId_"

    .line 69
    .line 70
    const-string v9, "webServerUrl_"

    .line 71
    .line 72
    filled-new-array/range {v0 .. v9}, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-string p2, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0007\u0008\u0007\t\u0002\n\u0208"

    .line 77
    .line 78
    sget-object p3, Lcom/zykj/huiwei/launcher/proto/a;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/a;

    .line 79
    .line 80
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/GeneratedMessageLite;->newMessageInfo(Lcom/google/protobuf/MessageLite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    :pswitch_4
    new-instance p1, Lcom/zykj/huiwei/launcher/proto/a$b;

    .line 86
    .line 87
    invoke-direct {p1, p2}, Lcom/zykj/huiwei/launcher/proto/a$b;-><init>(Lcom/zykj/huiwei/launcher/proto/b;)V

    .line 88
    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_5
    new-instance p1, Lcom/zykj/huiwei/launcher/proto/a;

    .line 92
    .line 93
    invoke-direct {p1}, Lcom/zykj/huiwei/launcher/proto/a;-><init>()V

    .line 94
    .line 95
    .line 96
    return-object p1

    .line 97
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

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->accessToken_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAccessTokenBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->accessToken_:Ljava/lang/String;

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

.method public getImAccessToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->imAccessToken_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getImAccessTokenBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->imAccessToken_:Ljava/lang/String;

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

.method public getMobile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->mobile_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMobileBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->mobile_:Ljava/lang/String;

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

.method public getNeedChangePwd()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->needChangePwd_:Z

    .line 2
    .line 3
    return v0
.end method

.method public getNeedSmsVerify()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->needSmsVerify_:Z

    .line 2
    .line 3
    return v0
.end method

.method public getRefreshToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->refreshToken_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRefreshTokenBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->refreshToken_:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->schoolCode_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSchoolCodeBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->schoolCode_:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->serverUrl_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getServerUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->serverUrl_:Ljava/lang/String;

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

.method public getUserId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->userId_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getWebServerUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->webServerUrl_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getWebServerUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/a;->webServerUrl_:Ljava/lang/String;

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
