.class public final Ls1/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/io/File;

.field public b:Lt1/c;

.field public c:Lt1/a;

.field public final d:Lv1/c;

.field public e:Lu1/b;

.field public f:Ljavax/net/ssl/HostnameVerifier;

.field public g:[Ljavax/net/ssl/TrustManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lv1/d;->b(Landroid/content/Context;)Lv1/c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Ls1/g$b;->d:Lv1/c;

    .line 9
    .line 10
    invoke-static {p1}, Ls1/q;->c(Landroid/content/Context;)Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Ls1/g$b;->a:Ljava/io/File;

    .line 15
    .line 16
    new-instance p1, Lt1/h;

    .line 17
    .line 18
    const-wide/32 v0, 0x20000000

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, v0, v1}, Lt1/h;-><init>(J)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Ls1/g$b;->c:Lt1/a;

    .line 25
    .line 26
    new-instance p1, Lt1/f;

    .line 27
    .line 28
    invoke-direct {p1}, Lt1/f;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Ls1/g$b;->b:Lt1/c;

    .line 32
    .line 33
    new-instance p1, Lu1/a;

    .line 34
    .line 35
    invoke-direct {p1}, Lu1/a;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Ls1/g$b;->e:Lu1/b;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public a()Ls1/g;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ls1/g$b;->b()Ls1/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ls1/g;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v0, v2}, Ls1/g;-><init>(Ls1/c;Ls1/g$a;)V

    .line 9
    .line 10
    .line 11
    return-object v1
.end method

.method public final b()Ls1/c;
    .locals 8

    .line 1
    new-instance v0, Ls1/c;

    .line 2
    .line 3
    iget-object v1, p0, Ls1/g$b;->a:Ljava/io/File;

    .line 4
    .line 5
    iget-object v2, p0, Ls1/g$b;->b:Lt1/c;

    .line 6
    .line 7
    iget-object v3, p0, Ls1/g$b;->c:Lt1/a;

    .line 8
    .line 9
    iget-object v4, p0, Ls1/g$b;->d:Lv1/c;

    .line 10
    .line 11
    iget-object v5, p0, Ls1/g$b;->e:Lu1/b;

    .line 12
    .line 13
    iget-object v6, p0, Ls1/g$b;->f:Ljavax/net/ssl/HostnameVerifier;

    .line 14
    .line 15
    iget-object v7, p0, Ls1/g$b;->g:[Ljavax/net/ssl/TrustManager;

    .line 16
    .line 17
    invoke-direct/range {v0 .. v7}, Ls1/c;-><init>(Ljava/io/File;Lt1/c;Lt1/a;Lv1/c;Lu1/b;Ljavax/net/ssl/HostnameVerifier;[Ljavax/net/ssl/TrustManager;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public c(Ljava/io/File;)Ls1/g$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ls1/l;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/io/File;

    .line 6
    .line 7
    iput-object p1, p0, Ls1/g$b;->a:Ljava/io/File;

    .line 8
    .line 9
    return-object p0
.end method

.method public d(Lt1/c;)Ls1/g$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ls1/l;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lt1/c;

    .line 6
    .line 7
    iput-object p1, p0, Ls1/g$b;->b:Lt1/c;

    .line 8
    .line 9
    return-object p0
.end method

.method public e(Lu1/b;)Ls1/g$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ls1/l;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lu1/b;

    .line 6
    .line 7
    iput-object p1, p0, Ls1/g$b;->e:Lu1/b;

    .line 8
    .line 9
    return-object p0
.end method

.method public f(Ljavax/net/ssl/HostnameVerifier;)Ls1/g$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ls1/g$b;->f:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object p0
.end method

.method public g(I)Ls1/g$b;
    .locals 1

    .line 1
    new-instance v0, Lt1/g;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lt1/g;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Ls1/g$b;->c:Lt1/a;

    .line 7
    .line 8
    return-object p0
.end method

.method public h(J)Ls1/g$b;
    .locals 1

    .line 1
    new-instance v0, Lt1/h;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lt1/h;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Ls1/g$b;->c:Lt1/a;

    .line 7
    .line 8
    return-object p0
.end method

.method public i([Ljavax/net/ssl/TrustManager;)Ls1/g$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ls1/g$b;->g:[Ljavax/net/ssl/TrustManager;

    .line 2
    .line 3
    return-object p0
.end method
