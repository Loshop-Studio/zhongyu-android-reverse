.class public Lcom/tendcloud/tenddata/fr;
.super Lcom/tendcloud/tenddata/fk;
.source "SourceFile"


# static fields
.field private static volatile j:Lcom/tendcloud/tenddata/fr;


# instance fields
.field private final a:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private volatile f:Ljava/lang/String;

.field private volatile g:Ljava/lang/String;

.field private volatile h:Ljava/lang/String;

.field private volatile i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/fk;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "oaid"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tendcloud/tenddata/fr;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "vaid"

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tendcloud/tenddata/fr;->c:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "aaid"

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tendcloud/tenddata/fr;->d:Ljava/lang/String;

    .line 15
    .line 16
    const-string v0, "udid"

    .line 17
    .line 18
    iput-object v0, p0, Lcom/tendcloud/tenddata/fr;->e:Ljava/lang/String;

    .line 19
    .line 20
    const-string v0, ""

    .line 21
    .line 22
    iput-object v0, p0, Lcom/tendcloud/tenddata/fr;->f:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tendcloud/tenddata/fr;->g:Ljava/lang/String;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tendcloud/tenddata/fr;->h:Ljava/lang/String;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/tendcloud/tenddata/fr;->i:Ljava/lang/String;

    .line 29
    .line 30
    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/fr;
    .locals 2

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/fr;->j:Lcom/tendcloud/tenddata/fr;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/tendcloud/tenddata/fr;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/fr;->j:Lcom/tendcloud/tenddata/fr;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/tendcloud/tenddata/fr;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/tendcloud/tenddata/fr;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/tendcloud/tenddata/fr;->j:Lcom/tendcloud/tenddata/fr;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_2
    sget-object v0, Lcom/tendcloud/tenddata/fr;->j:Lcom/tendcloud/tenddata/fr;

    .line 27
    .line 28
    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/fr;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/fr;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/fr;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/fr;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public setAAID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/fr;->g:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "aaid"

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setOAID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/fr;->f:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "oaid"

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setUDID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/fr;->i:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "udid"

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setVAID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/fr;->h:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "vaid"

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
