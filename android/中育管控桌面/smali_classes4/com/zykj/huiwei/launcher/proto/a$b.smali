# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/huiwei/launcher/proto/a$b;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/huiwei/launcher/proto/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/proto/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/a;->B()Lcom/zykj/huiwei/launcher/proto/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/proto/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public clearAccessToken()Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/a;->a(Lcom/zykj/huiwei/launcher/proto/a;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearImAccessToken()Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/a;->b(Lcom/zykj/huiwei/launcher/proto/a;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearMobile()Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/a;->c(Lcom/zykj/huiwei/launcher/proto/a;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearNeedChangePwd()Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/a;->d(Lcom/zykj/huiwei/launcher/proto/a;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearNeedSmsVerify()Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/a;->e(Lcom/zykj/huiwei/launcher/proto/a;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearRefreshToken()Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/a;->f(Lcom/zykj/huiwei/launcher/proto/a;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearSchoolCode()Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/a;->g(Lcom/zykj/huiwei/launcher/proto/a;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearServerUrl()Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/a;->h(Lcom/zykj/huiwei/launcher/proto/a;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearUserId()Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/a;->i(Lcom/zykj/huiwei/launcher/proto/a;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearWebServerUrl()Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/a;->j(Lcom/zykj/huiwei/launcher/proto/a;)V

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
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getAccessToken()Ljava/lang/String;

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
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getAccessTokenBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getImAccessToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getImAccessToken()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getImAccessTokenBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getImAccessTokenBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getMobile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getMobile()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getMobileBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getMobileBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getNeedChangePwd()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getNeedChangePwd()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getNeedSmsVerify()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getNeedSmsVerify()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getRefreshToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getRefreshToken()Ljava/lang/String;

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
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getRefreshTokenBytes()Lcom/google/protobuf/ByteString;

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
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getSchoolCode()Ljava/lang/String;

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
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getSchoolCodeBytes()Lcom/google/protobuf/ByteString;

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
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getServerUrl()Ljava/lang/String;

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
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getServerUrlBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getUserId()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getUserId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public getWebServerUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getWebServerUrl()Ljava/lang/String;

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
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getWebServerUrlBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public setAccessToken(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->k(Lcom/zykj/huiwei/launcher/proto/a;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setAccessTokenBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->l(Lcom/zykj/huiwei/launcher/proto/a;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setImAccessToken(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->m(Lcom/zykj/huiwei/launcher/proto/a;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setImAccessTokenBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->n(Lcom/zykj/huiwei/launcher/proto/a;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setMobile(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->o(Lcom/zykj/huiwei/launcher/proto/a;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setMobileBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->p(Lcom/zykj/huiwei/launcher/proto/a;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setNeedChangePwd(Z)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->q(Lcom/zykj/huiwei/launcher/proto/a;Z)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setNeedSmsVerify(Z)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->r(Lcom/zykj/huiwei/launcher/proto/a;Z)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setRefreshToken(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->s(Lcom/zykj/huiwei/launcher/proto/a;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setRefreshTokenBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->t(Lcom/zykj/huiwei/launcher/proto/a;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setSchoolCode(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->u(Lcom/zykj/huiwei/launcher/proto/a;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setSchoolCodeBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->v(Lcom/zykj/huiwei/launcher/proto/a;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setServerUrl(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->w(Lcom/zykj/huiwei/launcher/proto/a;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setServerUrlBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->x(Lcom/zykj/huiwei/launcher/proto/a;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setUserId(J)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1, p2}, Lcom/zykj/huiwei/launcher/proto/a;->y(Lcom/zykj/huiwei/launcher/proto/a;J)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setWebServerUrl(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->z(Lcom/zykj/huiwei/launcher/proto/a;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setWebServerUrlBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/a;->A(Lcom/zykj/huiwei/launcher/proto/a;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
