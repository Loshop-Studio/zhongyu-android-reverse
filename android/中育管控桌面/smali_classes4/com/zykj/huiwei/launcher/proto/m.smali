# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/huiwei/launcher/proto/m;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/huiwei/launcher/proto/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/proto/m$b;
    }
.end annotation


# static fields
.field public static final AVATAR_FIELD_NUMBER:I = 0x5

.field private static final DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

.field public static final ID_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/huiwei/launcher/proto/m;",
            ">;"
        }
    .end annotation
.end field

.field public static final PASSWORD_FIELD_NUMBER:I = 0x3

.field public static final REALNAME_FIELD_NUMBER:I = 0x4

.field public static final ROLE_FIELD_NUMBER:I = 0x6

.field public static final USERNAME_FIELD_NUMBER:I = 0x2


# instance fields
.field private avatar_:Ljava/lang/String;

.field private id_:Ljava/lang/String;

.field private password_:Ljava/lang/String;

.field private realName_:Ljava/lang/String;

.field private role_:I

.field private userName_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/proto/m;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    const-class v1, Lcom/zykj/huiwei/launcher/proto/m;

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
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->id_:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->userName_:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->password_:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->realName_:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->avatar_:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method

.method public static bridge synthetic a(Lcom/zykj/huiwei/launcher/proto/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/m;->clearAvatar()V

    return-void
.end method

.method public static bridge synthetic b(Lcom/zykj/huiwei/launcher/proto/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/m;->clearId()V

    return-void
.end method

.method public static bridge synthetic c(Lcom/zykj/huiwei/launcher/proto/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/m;->clearPassword()V

    return-void
.end method

.method private clearAvatar()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/m;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getAvatar()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->avatar_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearId()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/m;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->id_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearPassword()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/m;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getPassword()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->password_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearRealName()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/m;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getRealName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->realName_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearRole()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->role_:I

    .line 3
    .line 4
    return-void
.end method

.method private clearUserName()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/m;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getUserName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->userName_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public static bridge synthetic d(Lcom/zykj/huiwei/launcher/proto/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/m;->clearRealName()V

    return-void
.end method

.method public static bridge synthetic e(Lcom/zykj/huiwei/launcher/proto/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/m;->clearRole()V

    return-void
.end method

.method public static bridge synthetic f(Lcom/zykj/huiwei/launcher/proto/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/m;->clearUserName()V

    return-void
.end method

.method public static bridge synthetic g(Lcom/zykj/huiwei/launcher/proto/m;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->setAvatar(Ljava/lang/String;)V

    return-void
.end method

.method public static getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/m;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic h(Lcom/zykj/huiwei/launcher/proto/m;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->setAvatarBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic i(Lcom/zykj/huiwei/launcher/proto/m;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->setId(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic j(Lcom/zykj/huiwei/launcher/proto/m;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->setIdBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic k(Lcom/zykj/huiwei/launcher/proto/m;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->setPassword(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic l(Lcom/zykj/huiwei/launcher/proto/m;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->setPasswordBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic m(Lcom/zykj/huiwei/launcher/proto/m;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->setRealName(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic n(Lcom/zykj/huiwei/launcher/proto/m;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->setRealNameBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static newBuilder()Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m$b;

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/huiwei/launcher/proto/m;)Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/m$b;

    return-object p0
.end method

.method public static bridge synthetic o(Lcom/zykj/huiwei/launcher/proto/m;Lcom/zykj/huiwei/launcher/proto/RoleType;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->setRole(Lcom/zykj/huiwei/launcher/proto/RoleType;)V

    return-void
.end method

.method public static bridge synthetic p(Lcom/zykj/huiwei/launcher/proto/m;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->setRoleValue(I)V

    return-void
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/huiwei/launcher/proto/m;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/m;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/m;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/m;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/m;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/m;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/m;
    .locals 1

    .line 4
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/m;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/huiwei/launcher/proto/m;
    .locals 1

    .line 9
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/m;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/m;
    .locals 1

    .line 10
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/m;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/huiwei/launcher/proto/m;
    .locals 1

    .line 7
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/m;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/m;
    .locals 1

    .line 8
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/m;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/huiwei/launcher/proto/m;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/m;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/m;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/m;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/huiwei/launcher/proto/m;
    .locals 1

    .line 5
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/m;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/m;
    .locals 1

    .line 6
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/m;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/huiwei/launcher/proto/m;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

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

.method public static bridge synthetic q(Lcom/zykj/huiwei/launcher/proto/m;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->setUserName(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic r(Lcom/zykj/huiwei/launcher/proto/m;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->setUserNameBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic s()Lcom/zykj/huiwei/launcher/proto/m;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    return-object v0
.end method

.method private setAvatar(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/m;->avatar_:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/m;->avatar_:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/m;->id_:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/m;->id_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setPassword(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/m;->password_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setPasswordBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/m;->password_:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/m;->realName_:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/m;->realName_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setRole(Lcom/zykj/huiwei/launcher/proto/RoleType;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/proto/RoleType;->getNumber()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/zykj/huiwei/launcher/proto/m;->role_:I

    .line 6
    .line 7
    return-void
.end method

.method private setRoleValue(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/huiwei/launcher/proto/m;->role_:I

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/m;->userName_:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/m;->userName_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object p2, Lcom/zykj/huiwei/launcher/proto/m$a;->$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke:[I

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
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/m;->PARSER:Lcom/google/protobuf/Parser;

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    const-class p2, Lcom/zykj/huiwei/launcher/proto/m;

    .line 25
    .line 26
    monitor-enter p2

    .line 27
    :try_start_0
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/m;->PARSER:Lcom/google/protobuf/Parser;

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 32
    .line 33
    sget-object p3, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    .line 34
    .line 35
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 36
    .line 37
    .line 38
    sput-object p1, Lcom/zykj/huiwei/launcher/proto/m;->PARSER:Lcom/google/protobuf/Parser;

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
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_3
    const-string v0, "id_"

    .line 53
    .line 54
    const-string v1, "userName_"

    .line 55
    .line 56
    const-string v2, "password_"

    .line 57
    .line 58
    const-string v3, "realName_"

    .line 59
    .line 60
    const-string v4, "avatar_"

    .line 61
    .line 62
    const-string v5, "role_"

    .line 63
    .line 64
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string p2, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u000c"

    .line 69
    .line 70
    sget-object p3, Lcom/zykj/huiwei/launcher/proto/m;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/m;

    .line 71
    .line 72
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/GeneratedMessageLite;->newMessageInfo(Lcom/google/protobuf/MessageLite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :pswitch_4
    new-instance p1, Lcom/zykj/huiwei/launcher/proto/m$b;

    .line 78
    .line 79
    invoke-direct {p1, p2}, Lcom/zykj/huiwei/launcher/proto/m$b;-><init>(Lcom/zykj/huiwei/launcher/proto/n;)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :pswitch_5
    new-instance p1, Lcom/zykj/huiwei/launcher/proto/m;

    .line 84
    .line 85
    invoke-direct {p1}, Lcom/zykj/huiwei/launcher/proto/m;-><init>()V

    .line 86
    .line 87
    .line 88
    return-object p1

    .line 89
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

.method public getAvatar()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->avatar_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAvatarBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->avatar_:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->id_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getIdBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->id_:Ljava/lang/String;

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

.method public getPassword()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->password_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPasswordBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->password_:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->realName_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRealNameBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->realName_:Ljava/lang/String;

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

.method public getRole()Lcom/zykj/huiwei/launcher/proto/RoleType;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->role_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/RoleType;->forNumber(I)Lcom/zykj/huiwei/launcher/proto/RoleType;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/RoleType;->UNRECOGNIZED:Lcom/zykj/huiwei/launcher/proto/RoleType;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getRoleValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->role_:I

    .line 2
    .line 3
    return v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->userName_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUserNameBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/m;->userName_:Ljava/lang/String;

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
