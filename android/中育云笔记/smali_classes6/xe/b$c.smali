.class public Lxe/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxe/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Lxe/b;


# direct methods
.method public constructor <init>(Lxe/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxe/b$c;->a:Lxe/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public resolve(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/net/InetAddress;->isSiteLocalAddress()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lxe/b$c;->a:Lxe/b;

    .line 12
    .line 13
    invoke-virtual {v0}, Lwe/a;->l()Ljava/net/InetAddress;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/net/InetAddress;->isSiteLocalAddress()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :cond_0
    return-object p1
.end method
