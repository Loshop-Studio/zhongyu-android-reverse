# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/huiwei/launcher/proto/m$b;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/huiwei/launcher/proto/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/proto/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/m;->s()Lcom/zykj/huiwei/launcher/proto/m;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/proto/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/m$b;-><init>()V

    return-void
.end method


# virtual methods
.method public clearAvatar()Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/m;->a(Lcom/zykj/huiwei/launcher/proto/m;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearId()Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/m;->b(Lcom/zykj/huiwei/launcher/proto/m;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearPassword()Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/m;->c(Lcom/zykj/huiwei/launcher/proto/m;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearRealName()Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/m;->d(Lcom/zykj/huiwei/launcher/proto/m;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearRole()Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/m;->e(Lcom/zykj/huiwei/launcher/proto/m;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearUserName()Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/m;->f(Lcom/zykj/huiwei/launcher/proto/m;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public getAvatar()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getAvatar()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getAvatarBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getAvatarBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getIdBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getIdBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getPassword()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getPasswordBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getPasswordBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getRealName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getRealName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getRealNameBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getRealNameBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getRole()Lcom/zykj/huiwei/launcher/proto/RoleType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getRole()Lcom/zykj/huiwei/launcher/proto/RoleType;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getRoleValue()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getRoleValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getUserName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getUserNameBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getUserNameBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public setAvatar(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->g(Lcom/zykj/huiwei/launcher/proto/m;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setAvatarBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->h(Lcom/zykj/huiwei/launcher/proto/m;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setId(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->i(Lcom/zykj/huiwei/launcher/proto/m;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setIdBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->j(Lcom/zykj/huiwei/launcher/proto/m;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setPassword(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->k(Lcom/zykj/huiwei/launcher/proto/m;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setPasswordBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->l(Lcom/zykj/huiwei/launcher/proto/m;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setRealName(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->m(Lcom/zykj/huiwei/launcher/proto/m;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setRealNameBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->n(Lcom/zykj/huiwei/launcher/proto/m;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setRole(Lcom/zykj/huiwei/launcher/proto/RoleType;)Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->o(Lcom/zykj/huiwei/launcher/proto/m;Lcom/zykj/huiwei/launcher/proto/RoleType;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setRoleValue(I)Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->p(Lcom/zykj/huiwei/launcher/proto/m;I)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setUserName(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->q(Lcom/zykj/huiwei/launcher/proto/m;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setUserNameBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/m;->r(Lcom/zykj/huiwei/launcher/proto/m;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
