.class public Ld1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Ld1/g;


# instance fields
.field private a:Ld1/a;

.field private b:Ld1/b;

.field private c:Ld1/e;

.field private d:Ld1/f;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lh1/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 3
    new-instance v0, Ld1/a;

    invoke-direct {v0, p1, p2}, Ld1/a;-><init>(Landroid/content/Context;Lh1/a;)V

    iput-object v0, p0, Ld1/g;->a:Ld1/a;

    .line 4
    new-instance v0, Ld1/b;

    invoke-direct {v0, p1, p2}, Ld1/b;-><init>(Landroid/content/Context;Lh1/a;)V

    iput-object v0, p0, Ld1/g;->b:Ld1/b;

    .line 5
    new-instance v0, Ld1/e;

    invoke-direct {v0, p1, p2}, Ld1/e;-><init>(Landroid/content/Context;Lh1/a;)V

    iput-object v0, p0, Ld1/g;->c:Ld1/e;

    .line 6
    new-instance v0, Ld1/f;

    invoke-direct {v0, p1, p2}, Ld1/f;-><init>(Landroid/content/Context;Lh1/a;)V

    iput-object v0, p0, Ld1/g;->d:Ld1/f;

    return-void
.end method

.method public static declared-synchronized c(Landroid/content/Context;Lh1/a;)Ld1/g;
    .locals 2

    const-class v0, Ld1/g;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Ld1/g;->e:Ld1/g;

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Ld1/g;

    invoke-direct {v1, p0, p1}, Ld1/g;-><init>(Landroid/content/Context;Lh1/a;)V

    sput-object v1, Ld1/g;->e:Ld1/g;

    .line 3
    :cond_0
    sget-object p0, Ld1/g;->e:Ld1/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public a()Ld1/a;
    .locals 1

    iget-object v0, p0, Ld1/g;->a:Ld1/a;

    return-object v0
.end method

.method public b()Ld1/b;
    .locals 1

    iget-object v0, p0, Ld1/g;->b:Ld1/b;

    return-object v0
.end method

.method public d()Ld1/e;
    .locals 1

    iget-object v0, p0, Ld1/g;->c:Ld1/e;

    return-object v0
.end method

.method public e()Ld1/f;
    .locals 1

    iget-object v0, p0, Ld1/g;->d:Ld1/f;

    return-object v0
.end method
