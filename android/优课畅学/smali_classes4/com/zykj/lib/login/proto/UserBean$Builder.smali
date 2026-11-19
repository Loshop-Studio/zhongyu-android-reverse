# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/lib/login/proto/UserBean$Builder;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/lib/login/proto/UserBeanOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/lib/login/proto/UserBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lcom/zykj/lib/login/proto/UserBean;",
        "Lcom/zykj/lib/login/proto/UserBean$Builder;",
        ">;",
        "Lcom/zykj/lib/login/proto/UserBeanOrBuilder;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/lib/login/proto/UserBean;->q()Lcom/zykj/lib/login/proto/UserBean;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/lib/login/proto/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/proto/UserBean$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public clearAvatar()Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/lib/login/proto/UserBean;->a(Lcom/zykj/lib/login/proto/UserBean;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearId()Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/lib/login/proto/UserBean;->b(Lcom/zykj/lib/login/proto/UserBean;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearRealName()Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/lib/login/proto/UserBean;->c(Lcom/zykj/lib/login/proto/UserBean;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearRole()Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/lib/login/proto/UserBean;->d(Lcom/zykj/lib/login/proto/UserBean;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearUserName()Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/lib/login/proto/UserBean;->e(Lcom/zykj/lib/login/proto/UserBean;)V

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
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/UserBean;->getAvatar()Ljava/lang/String;

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
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/UserBean;->getAvatarBytes()Lcom/google/protobuf/ByteString;

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
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

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
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/UserBean;->getIdBytes()Lcom/google/protobuf/ByteString;

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
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/UserBean;->getRealName()Ljava/lang/String;

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
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/UserBean;->getRealNameBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getRole()Lcom/zykj/lib/login/proto/RoleType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/UserBean;->getRole()Lcom/zykj/lib/login/proto/RoleType;

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
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/UserBean;->getRoleValue()I

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
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/UserBean;->getUserName()Ljava/lang/String;

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
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/UserBean;->getUserNameBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public setAvatar(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/UserBean;->g(Lcom/zykj/lib/login/proto/UserBean;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setAvatarBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/UserBean;->h(Lcom/zykj/lib/login/proto/UserBean;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setId(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/UserBean;->i(Lcom/zykj/lib/login/proto/UserBean;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setIdBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/UserBean;->j(Lcom/zykj/lib/login/proto/UserBean;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setRealName(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/UserBean;->k(Lcom/zykj/lib/login/proto/UserBean;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setRealNameBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/UserBean;->l(Lcom/zykj/lib/login/proto/UserBean;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setRole(Lcom/zykj/lib/login/proto/RoleType;)Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/UserBean;->m(Lcom/zykj/lib/login/proto/UserBean;Lcom/zykj/lib/login/proto/RoleType;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setRoleValue(I)Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/UserBean;->n(Lcom/zykj/lib/login/proto/UserBean;I)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setUserName(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/UserBean;->o(Lcom/zykj/lib/login/proto/UserBean;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setUserNameBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/lib/login/proto/UserBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/UserBean;->p(Lcom/zykj/lib/login/proto/UserBean;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
