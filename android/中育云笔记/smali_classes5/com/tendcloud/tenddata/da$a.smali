.class public final Lcom/tendcloud/tenddata/da$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/da;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private body:Lcom/tendcloud/tenddata/db;

.field private cert:Ljava/lang/String;

.field private connectionTimeout:I

.field private headers:Lcom/tendcloud/tenddata/dc;

.field private host:Ljava/lang/String;

.field private ip:Ljava/lang/String;

.field private method:Lcom/tendcloud/tenddata/dd;

.field private readTimeout:I

.field private url:Ljava/net/URL;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x3a98

    .line 5
    .line 6
    iput v0, p0, Lcom/tendcloud/tenddata/da$a;->connectionTimeout:I

    .line 7
    .line 8
    iput v0, p0, Lcom/tendcloud/tenddata/da$a;->readTimeout:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public body(Lcom/tendcloud/tenddata/db;)Lcom/tendcloud/tenddata/da$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/da$a;->body:Lcom/tendcloud/tenddata/db;

    .line 2
    .line 3
    return-object p0
.end method

.method public build()Lcom/tendcloud/tenddata/da;
    .locals 11

    .line 1
    new-instance v0, Lcom/tendcloud/tenddata/da;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tendcloud/tenddata/da$a;->url:Ljava/net/URL;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/tendcloud/tenddata/da$a;->method:Lcom/tendcloud/tenddata/dd;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/tendcloud/tenddata/da$a;->headers:Lcom/tendcloud/tenddata/dc;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/tendcloud/tenddata/da$a;->body:Lcom/tendcloud/tenddata/db;

    .line 10
    .line 11
    iget v5, p0, Lcom/tendcloud/tenddata/da$a;->connectionTimeout:I

    .line 12
    .line 13
    iget v6, p0, Lcom/tendcloud/tenddata/da$a;->readTimeout:I

    .line 14
    .line 15
    iget-object v7, p0, Lcom/tendcloud/tenddata/da$a;->cert:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v8, p0, Lcom/tendcloud/tenddata/da$a;->host:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v9, p0, Lcom/tendcloud/tenddata/da$a;->ip:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    invoke-direct/range {v0 .. v10}, Lcom/tendcloud/tenddata/da;-><init>(Ljava/net/URL;Lcom/tendcloud/tenddata/dd;Lcom/tendcloud/tenddata/dc;Lcom/tendcloud/tenddata/db;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/da$1;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public cert(Ljava/lang/String;)Lcom/tendcloud/tenddata/da$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/da$a;->cert:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public connectionTimeout(I)Lcom/tendcloud/tenddata/da$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/tendcloud/tenddata/da$a;->connectionTimeout:I

    .line 2
    .line 3
    return-object p0
.end method

.method public header(Lcom/tendcloud/tenddata/dc;)Lcom/tendcloud/tenddata/da$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/da$a;->headers:Lcom/tendcloud/tenddata/dc;

    .line 2
    .line 3
    return-object p0
.end method

.method public host(Ljava/lang/String;)Lcom/tendcloud/tenddata/da$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/da$a;->host:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public ip(Ljava/lang/String;)Lcom/tendcloud/tenddata/da$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/da$a;->ip:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public method(Lcom/tendcloud/tenddata/dd;)Lcom/tendcloud/tenddata/da$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/da$a;->method:Lcom/tendcloud/tenddata/dd;

    .line 2
    .line 3
    return-object p0
.end method

.method public readTimeout(I)Lcom/tendcloud/tenddata/da$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/tendcloud/tenddata/da$a;->readTimeout:I

    .line 2
    .line 3
    return-object p0
.end method

.method public url(Ljava/lang/String;)Lcom/tendcloud/tenddata/da$a;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/tendcloud/tenddata/da$a;->url:Ljava/net/URL;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method
