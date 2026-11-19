# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/lib/login/proto/ServerBean$Builder;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/lib/login/proto/ServerBeanOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/lib/login/proto/ServerBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lcom/zykj/lib/login/proto/ServerBean;",
        "Lcom/zykj/lib/login/proto/ServerBean$Builder;",
        ">;",
        "Lcom/zykj/lib/login/proto/ServerBeanOrBuilder;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/lib/login/proto/ServerBean;->q()Lcom/zykj/lib/login/proto/ServerBean;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/lib/login/proto/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/proto/ServerBean$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public clearAccessToken()Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/lib/login/proto/ServerBean;->a(Lcom/zykj/lib/login/proto/ServerBean;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearRefreshToken()Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/lib/login/proto/ServerBean;->b(Lcom/zykj/lib/login/proto/ServerBean;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearSchoolCode()Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/lib/login/proto/ServerBean;->c(Lcom/zykj/lib/login/proto/ServerBean;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearServerUrl()Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/lib/login/proto/ServerBean;->d(Lcom/zykj/lib/login/proto/ServerBean;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearWebServerUrl()Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/lib/login/proto/ServerBean;->e(Lcom/zykj/lib/login/proto/ServerBean;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getAccessToken()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getAccessTokenBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getAccessTokenBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getRefreshToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getRefreshToken()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getRefreshTokenBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getRefreshTokenBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getSchoolCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getSchoolCode()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getSchoolCodeBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getSchoolCodeBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getServerUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getServerUrl()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getServerUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getServerUrlBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getWebServerUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getWebServerUrl()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getWebServerUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getWebServerUrlBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public setAccessToken(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->g(Lcom/zykj/lib/login/proto/ServerBean;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setAccessTokenBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->h(Lcom/zykj/lib/login/proto/ServerBean;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setRefreshToken(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->i(Lcom/zykj/lib/login/proto/ServerBean;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setRefreshTokenBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->j(Lcom/zykj/lib/login/proto/ServerBean;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setSchoolCode(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->k(Lcom/zykj/lib/login/proto/ServerBean;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setSchoolCodeBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->l(Lcom/zykj/lib/login/proto/ServerBean;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setServerUrl(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->m(Lcom/zykj/lib/login/proto/ServerBean;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setServerUrlBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->n(Lcom/zykj/lib/login/proto/ServerBean;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setWebServerUrl(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->o(Lcom/zykj/lib/login/proto/ServerBean;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setWebServerUrlBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/lib/login/proto/ServerBean$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/lib/login/proto/ServerBean;->p(Lcom/zykj/lib/login/proto/ServerBean;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
