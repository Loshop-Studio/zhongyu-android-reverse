.class public abstract Lb0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb0/m;

.field public static final b:Lb0/m;

.field public static final c:Lb0/m;

.field public static final d:Lb0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lb0/m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lb0/m;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lb0/o;->a:Lb0/m;

    .line 8
    .line 9
    new-instance v0, Lb0/m;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lb0/m;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lb0/o;->b:Lb0/m;

    .line 16
    .line 17
    new-instance v0, Lb0/m;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lb0/m;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lb0/o;->c:Lb0/m;

    .line 24
    .line 25
    new-instance v0, Lb0/m;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lb0/m;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lb0/o;->d:Lb0/m;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b()Z
.end method

.method public abstract c(Lcom/bumptech/glide/load/DataSource;)Z
.end method

.method public abstract d(ZLcom/bumptech/glide/load/DataSource;Lcom/bumptech/glide/load/EncodeStrategy;)Z
.end method
