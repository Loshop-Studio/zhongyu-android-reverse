.class public Lt1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt1/a;
.implements Lt1/a$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt1/c$c;,
        Lt1/c$a;,
        Lt1/c$b;
    }
.end annotation


# instance fields
.field public a:Ljava/net/URLConnection;

.field public b:Ljava/net/URL;

.field public c:Lq1/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lt1/c$a;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lt1/c;-><init>(Ljava/net/URL;Lt1/c$a;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;Lt1/c$a;)V
    .locals 1

    .line 2
    new-instance v0, Lt1/c$c;

    invoke-direct {v0}, Lt1/c$c;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lt1/c;-><init>(Ljava/net/URL;Lt1/c$a;Lq1/c;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;Lt1/c$a;Lq1/c;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lt1/c;->b:Ljava/net/URL;

    .line 5
    iput-object p3, p0, Lt1/c;->c:Lq1/c;

    .line 6
    invoke-virtual {p0}, Lt1/c;->j()V

    return-void
.end method

.method public static synthetic i(Lt1/c;Ljava/net/URL;)Ljava/net/URL;
    .locals 0

    .line 1
    iput-object p1, p0, Lt1/c;->b:Ljava/net/URL;

    .line 2
    .line 3
    return-object p1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/c;->c:Lq1/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lq1/c;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/c;->a:Ljava/net/URLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/c;->a:Ljava/net/URLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lt1/c;->a:Ljava/net/URLConnection;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
.end method

.method public e()Ljava/io/InputStream;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/c;->a:Ljava/net/URLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public execute()Lt1/a$a;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lt1/c;->f()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lt1/c;->a:Ljava/net/URLConnection;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/net/URLConnection;->connect()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lt1/c;->c:Lq1/c;

    .line 11
    .line 12
    invoke-interface {v1, p0, p0, v0}, Lq1/c;->b(Lt1/a;Lt1/a$a;Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public f()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/c;->a:Ljava/net/URLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getRequestProperties()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/c;->a:Ljava/net/URLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h()I
    .locals 2

    .line 1
    iget-object v0, p0, Lt1/c;->a:Ljava/net/URLConnection;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public j()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "config connection for "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lt1/c;->b:Ljava/net/URL;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "DownloadUrlConnection"

    .line 21
    .line 22
    invoke-static {v1, v0}, Lr1/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lt1/c;->b:Ljava/net/URL;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lt1/c;->a:Ljava/net/URLConnection;

    .line 32
    .line 33
    instance-of v1, v0, Ljava/net/HttpURLConnection;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lt1/c;->a:Ljava/net/URLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    :catch_0
    :cond_0
    return-void
.end method
