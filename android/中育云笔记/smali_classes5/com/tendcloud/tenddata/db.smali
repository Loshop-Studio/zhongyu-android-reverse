.class public final Lcom/tendcloud/tenddata/db;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/db$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/tendcloud/tenddata/db$a;

.field private final b:[B


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/db$a;[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/tenddata/db;->a:Lcom/tendcloud/tenddata/db$a;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/tendcloud/tenddata/db;->b:[B

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/net/HttpURLConnection;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tendcloud/tenddata/db;->b:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 3
    iget-object v0, p0, Lcom/tendcloud/tenddata/db;->a:Lcom/tendcloud/tenddata/db$a;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/db$a;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Content-Type"

    invoke-virtual {p1, v1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :try_start_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/db;->b:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 6
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    return-void

    :catchall_0
    const/4 p1, 0x0

    :catchall_1
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    :cond_0
    return-void
.end method

.method public a()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/db;->b:[B

    return-object v0
.end method

.method public b()Lcom/tendcloud/tenddata/db$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/db;->a:Lcom/tendcloud/tenddata/db$a;

    .line 2
    .line 3
    return-object v0
.end method
