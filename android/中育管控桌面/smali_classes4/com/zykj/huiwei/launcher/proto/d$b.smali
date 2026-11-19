# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/huiwei/launcher/proto/d$b;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/huiwei/launcher/proto/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/proto/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/d;->m()Lcom/zykj/huiwei/launcher/proto/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/proto/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/d$b;-><init>()V

    return-void
.end method


# virtual methods
.method public clearIsFirstInstall()Lcom/zykj/huiwei/launcher/proto/d$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/d;->a(Lcom/zykj/huiwei/launcher/proto/d;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearIsLoginSuccess()Lcom/zykj/huiwei/launcher/proto/d$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/d;->b(Lcom/zykj/huiwei/launcher/proto/d;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearNeedCheckCrack()Lcom/zykj/huiwei/launcher/proto/d$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/d;->c(Lcom/zykj/huiwei/launcher/proto/d;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearWhiteIpList()Lcom/zykj/huiwei/launcher/proto/d$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/d;->d(Lcom/zykj/huiwei/launcher/proto/d;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearWifiInfo()Lcom/zykj/huiwei/launcher/proto/d$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/d;->e(Lcom/zykj/huiwei/launcher/proto/d;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public getIsFirstInstall()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/d;->getIsFirstInstall()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getIsLoginSuccess()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/d;->getIsLoginSuccess()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getNeedCheckCrack()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/d;->getNeedCheckCrack()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getWhiteIpList()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/d;->getWhiteIpList()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getWhiteIpListBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/d;->getWhiteIpListBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getWifiInfo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/d;->getWifiInfo()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getWifiInfoBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/d;->getWifiInfoBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public setIsFirstInstall(Z)Lcom/zykj/huiwei/launcher/proto/d$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/d;->f(Lcom/zykj/huiwei/launcher/proto/d;Z)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setIsLoginSuccess(Z)Lcom/zykj/huiwei/launcher/proto/d$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/d;->g(Lcom/zykj/huiwei/launcher/proto/d;Z)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setNeedCheckCrack(Z)Lcom/zykj/huiwei/launcher/proto/d$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/d;->h(Lcom/zykj/huiwei/launcher/proto/d;Z)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setWhiteIpList(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/d$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/d;->i(Lcom/zykj/huiwei/launcher/proto/d;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setWhiteIpListBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/d$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/d;->j(Lcom/zykj/huiwei/launcher/proto/d;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setWifiInfo(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/d$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/d;->k(Lcom/zykj/huiwei/launcher/proto/d;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setWifiInfoBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/d$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/d;->l(Lcom/zykj/huiwei/launcher/proto/d;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
