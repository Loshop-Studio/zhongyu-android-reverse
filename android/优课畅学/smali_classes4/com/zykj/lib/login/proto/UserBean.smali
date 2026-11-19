# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/lib/login/proto/UserBean;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/lib/login/proto/UserBeanOrBuilder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/lib/login/proto/UserBean$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite<",
        "Lcom/zykj/lib/login/proto/UserBean;",
        "Lcom/zykj/lib/login/proto/UserBean$Builder;",
        ">;",
        "Lcom/zykj/lib/login/proto/UserBeanOrBuilder;"
    }
.end annotation


# static fields
.field public static final AVATAR_FIELD_NUMBER:I = 0x4

.field private static final DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

.field public static final ID_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/lib/login/proto/UserBean;",
            ">;"
        }
    .end annotation
.end field

.field public static final REALNAME_FIELD_NUMBER:I = 0x3

.field public static final ROLE_FIELD_NUMBER:I = 0x5

.field public static final USERNAME_FIELD_NUMBER:I = 0x2


# instance fields
.field private avatar_:Ljava/lang/String;

.field private id_:Ljava/lang/String;

.field private realName_:Ljava/lang/String;

.field private role_:I

.field private userName_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/lib/login/proto/UserBean;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    const-class v1, Lcom/zykj/lib/login/proto/UserBean;

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
    iput-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->id_:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->userName_:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->realName_:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->avatar_:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method

.method public static bridge synthetic a(Lcom/zykj/lib/login/proto/UserBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/proto/UserBean;->clearAvatar()V

    return-void
.end method

.method public static bridge synthetic b(Lcom/zykj/lib/login/proto/UserBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/proto/UserBean;->clearId()V

    return-void
.end method

.method public static bridge synthetic c(Lcom/zykj/lib/login/proto/UserBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/proto/UserBean;->clearRealName()V

    return-void
.end method

.method private clearAvatar()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/lib/login/proto/UserBean;->getDefaultInstance()Lcom/zykj/lib/login/proto/UserBean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/UserBean;->getAvatar()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->avatar_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearId()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/lib/login/proto/UserBean;->getDefaultInstance()Lcom/zykj/lib/login/proto/UserBean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->id_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearRealName()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/lib/login/proto/UserBean;->getDefaultInstance()Lcom/zykj/lib/login/proto/UserBean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/UserBean;->getRealName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->realName_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearRole()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/lib/login/proto/UserBean;->role_:I

    .line 3
    .line 4
    return-void
.end method

.method private clearUserName()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/lib/login/proto/UserBean;->getDefaultInstance()Lcom/zykj/lib/login/proto/UserBean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/UserBean;->getUserName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->userName_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public static bridge synthetic d(Lcom/zykj/lib/login/proto/UserBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/proto/UserBean;->clearRole()V

    return-void
.end method

.method public static bridge synthetic e(Lcom/zykj/lib/login/proto/UserBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/proto/UserBean;->clearUserName()V

    return-void
.end method

.method public static bridge synthetic g(Lcom/zykj/lib/login/proto/UserBean;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/UserBean;->setAvatar(Ljava/lang/String;)V

    return-void
.end method

.method public static getDefaultInstance()Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic h(Lcom/zykj/lib/login/proto/UserBean;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/UserBean;->setAvatarBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic i(Lcom/zykj/lib/login/proto/UserBean;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/UserBean;->setId(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic j(Lcom/zykj/lib/login/proto/UserBean;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/UserBean;->setIdBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic k(Lcom/zykj/lib/login/proto/UserBean;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/UserBean;->setRealName(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic l(Lcom/zykj/lib/login/proto/UserBean;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/UserBean;->setRealNameBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic m(Lcom/zykj/lib/login/proto/UserBean;Lcom/zykj/lib/login/proto/RoleType;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/UserBean;->setRole(Lcom/zykj/lib/login/proto/RoleType;)V

    return-void
.end method

.method public static bridge synthetic n(Lcom/zykj/lib/login/proto/UserBean;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/UserBean;->setRoleValue(I)V

    return-void
.end method

.method public static newBuilder()Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/lib/login/proto/UserBean$Builder;

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/lib/login/proto/UserBean;)Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/UserBean$Builder;

    return-object p0
.end method

.method public static bridge synthetic o(Lcom/zykj/lib/login/proto/UserBean;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/UserBean;->setUserName(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic p(Lcom/zykj/lib/login/proto/UserBean;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/lib/login/proto/UserBean;->setUserNameBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/UserBean;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/UserBean;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/UserBean;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 4
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/UserBean;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 9
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/UserBean;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 10
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/UserBean;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 7
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/UserBean;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 8
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/UserBean;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/UserBean;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/UserBean;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 5
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/UserBean;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 6
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/UserBean;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/lib/login/proto/UserBean;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

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

.method public static bridge synthetic q()Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    return-object v0
.end method

.method private setAvatar(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/lib/login/proto/UserBean;->avatar_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setAvatarBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/zykj/lib/login/proto/UserBean;->avatar_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/lib/login/proto/UserBean;->id_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setIdBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/zykj/lib/login/proto/UserBean;->id_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setRealName(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/lib/login/proto/UserBean;->realName_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setRealNameBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/zykj/lib/login/proto/UserBean;->realName_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setRole(Lcom/zykj/lib/login/proto/RoleType;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/zykj/lib/login/proto/RoleType;->getNumber()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/zykj/lib/login/proto/UserBean;->role_:I

    .line 6
    .line 7
    return-void
.end method

.method private setRoleValue(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/lib/login/proto/UserBean;->role_:I

    .line 2
    .line 3
    return-void
.end method

.method private setUserName(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/lib/login/proto/UserBean;->userName_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setUserNameBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/zykj/lib/login/proto/UserBean;->userName_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object p2, Lcom/zykj/lib/login/proto/UserBean$1;->$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke:[I

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
    sget-object p1, Lcom/zykj/lib/login/proto/UserBean;->PARSER:Lcom/google/protobuf/Parser;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-class p2, Lcom/zykj/lib/login/proto/UserBean;

    .line 31
    .line 32
    monitor-enter p2

    .line 33
    :try_start_0
    sget-object p1, Lcom/zykj/lib/login/proto/UserBean;->PARSER:Lcom/google/protobuf/Parser;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 38
    .line 39
    sget-object p3, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 42
    .line 43
    .line 44
    sput-object p1, Lcom/zykj/lib/login/proto/UserBean;->PARSER:Lcom/google/protobuf/Parser;

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
    sget-object p1, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_4
    const-string p1, "id_"

    .line 58
    .line 59
    const-string p2, "userName_"

    .line 60
    .line 61
    const-string p3, "realName_"

    .line 62
    .line 63
    const-string v0, "avatar_"

    .line 64
    .line 65
    const-string v1, "role_"

    .line 66
    .line 67
    filled-new-array {p1, p2, p3, v0, v1}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string p2, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u000c"

    .line 72
    .line 73
    sget-object p3, Lcom/zykj/lib/login/proto/UserBean;->DEFAULT_INSTANCE:Lcom/zykj/lib/login/proto/UserBean;

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
    new-instance p1, Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 81
    .line 82
    invoke-direct {p1, p2}, Lcom/zykj/lib/login/proto/UserBean$Builder;-><init>(Lcom/zykj/lib/login/proto/b;)V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    :pswitch_6
    new-instance p1, Lcom/zykj/lib/login/proto/UserBean;

    .line 87
    .line 88
    invoke-direct {p1}, Lcom/zykj/lib/login/proto/UserBean;-><init>()V

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

.method public getAvatar()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->avatar_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAvatarBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->avatar_:Ljava/lang/String;

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

.method public getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->id_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getIdBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->id_:Ljava/lang/String;

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

.method public getRealName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->realName_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRealNameBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->realName_:Ljava/lang/String;

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

.method public getRole()Lcom/zykj/lib/login/proto/RoleType;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/lib/login/proto/UserBean;->role_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/lib/login/proto/RoleType;->forNumber(I)Lcom/zykj/lib/login/proto/RoleType;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/zykj/lib/login/proto/RoleType;->UNRECOGNIZED:Lcom/zykj/lib/login/proto/RoleType;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getRoleValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/lib/login/proto/UserBean;->role_:I

    .line 2
    .line 3
    return v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->userName_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUserNameBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/proto/UserBean;->userName_:Ljava/lang/String;

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
