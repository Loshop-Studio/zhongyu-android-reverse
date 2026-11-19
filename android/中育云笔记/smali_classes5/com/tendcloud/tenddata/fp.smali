.class public Lcom/tendcloud/tenddata/fp;
.super Lcom/tendcloud/tenddata/fk;
.source "SourceFile"


# static fields
.field public static a:Lcom/tendcloud/tenddata/fo; = null

.field private static final c:Ljava/lang/String; = "type"

.field private static final d:Ljava/lang/String; = "deviceId"

.field private static final e:Ljava/lang/String; = "runtimeConfig"

.field private static final f:Ljava/lang/String; = "hardwareConfig"

.field private static final g:Ljava/lang/String; = "softwareConfig"


# instance fields
.field private h:Lcom/tendcloud/tenddata/fq;

.field private i:Lcom/tendcloud/tenddata/fn;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/fk;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/tendcloud/tenddata/fq;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/tendcloud/tenddata/fq;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/tendcloud/tenddata/fp;->h:Lcom/tendcloud/tenddata/fq;

    .line 10
    .line 11
    new-instance v0, Lcom/tendcloud/tenddata/fn;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/tendcloud/tenddata/fn;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/tendcloud/tenddata/fp;->i:Lcom/tendcloud/tenddata/fn;

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/tendcloud/tenddata/fp;->d()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private d()V
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    const-string v1, "mobile"

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/tendcloud/tenddata/fo;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/tendcloud/tenddata/fo;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/tendcloud/tenddata/fp;->a:Lcom/tendcloud/tenddata/fo;

    .line 14
    .line 15
    const-string v1, "deviceId"

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/tendcloud/tenddata/fs;

    .line 25
    .line 26
    invoke-direct {v0}, Lcom/tendcloud/tenddata/fs;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v1, "runtimeConfig"

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/tendcloud/tenddata/fp;->i:Lcom/tendcloud/tenddata/fn;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "hardwareConfig"

    .line 45
    .line 46
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/tendcloud/tenddata/fp;->h:Lcom/tendcloud/tenddata/fq;

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "softwareConfig"

    .line 56
    .line 57
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public a()Lcom/tendcloud/tenddata/fq;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/fp;->h:Lcom/tendcloud/tenddata/fq;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Lcom/tendcloud/tenddata/fn;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/fp;->i:Lcom/tendcloud/tenddata/fn;

    .line 2
    .line 3
    return-object v0
.end method
