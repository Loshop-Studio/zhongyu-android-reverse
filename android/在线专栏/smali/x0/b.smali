.class public final Lx0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/b$b;,
        Lx0/b$a;
    }
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/Executor;

.field final b:Ljava/util/concurrent/Executor;

.field final c:Lx0/z;

.field final d:Lx0/m;

.field final e:Lx0/t;

.field final f:Lx0/k;

.field final g:Ljava/lang/String;

.field final h:I

.field final i:I

.field final j:I

.field final k:I

.field private final l:Z


# direct methods
.method constructor <init>(Lx0/b$a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lx0/b$a;->a:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0}, Lx0/b;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lx0/b;->a:Ljava/util/concurrent/Executor;

    goto :goto_0

    .line 4
    :cond_0
    iput-object v0, p0, Lx0/b;->a:Ljava/util/concurrent/Executor;

    .line 5
    :goto_0
    iget-object v0, p1, Lx0/b$a;->d:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lx0/b;->l:Z

    .line 7
    invoke-direct {p0}, Lx0/b;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lx0/b;->b:Ljava/util/concurrent/Executor;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, Lx0/b;->l:Z

    .line 9
    iput-object v0, p0, Lx0/b;->b:Ljava/util/concurrent/Executor;

    .line 10
    :goto_1
    iget-object v0, p1, Lx0/b$a;->b:Lx0/z;

    if-nez v0, :cond_2

    .line 11
    invoke-static {}, Lx0/z;->c()Lx0/z;

    move-result-object v0

    iput-object v0, p0, Lx0/b;->c:Lx0/z;

    goto :goto_2

    .line 12
    :cond_2
    iput-object v0, p0, Lx0/b;->c:Lx0/z;

    .line 13
    :goto_2
    iget-object v0, p1, Lx0/b$a;->c:Lx0/m;

    if-nez v0, :cond_3

    .line 14
    invoke-static {}, Lx0/m;->c()Lx0/m;

    move-result-object v0

    iput-object v0, p0, Lx0/b;->d:Lx0/m;

    goto :goto_3

    .line 15
    :cond_3
    iput-object v0, p0, Lx0/b;->d:Lx0/m;

    .line 16
    :goto_3
    iget-object v0, p1, Lx0/b$a;->e:Lx0/t;

    if-nez v0, :cond_4

    .line 17
    new-instance v0, Ly0/a;

    invoke-direct {v0}, Ly0/a;-><init>()V

    iput-object v0, p0, Lx0/b;->e:Lx0/t;

    goto :goto_4

    .line 18
    :cond_4
    iput-object v0, p0, Lx0/b;->e:Lx0/t;

    .line 19
    :goto_4
    iget v0, p1, Lx0/b$a;->h:I

    iput v0, p0, Lx0/b;->h:I

    .line 20
    iget v0, p1, Lx0/b$a;->i:I

    iput v0, p0, Lx0/b;->i:I

    .line 21
    iget v0, p1, Lx0/b$a;->j:I

    iput v0, p0, Lx0/b;->j:I

    .line 22
    iget v0, p1, Lx0/b$a;->k:I

    iput v0, p0, Lx0/b;->k:I

    .line 23
    iget-object v0, p1, Lx0/b$a;->f:Lx0/k;

    iput-object v0, p0, Lx0/b;->f:Lx0/k;

    .line 24
    iget-object p1, p1, Lx0/b$a;->g:Ljava/lang/String;

    iput-object p1, p0, Lx0/b;->g:Ljava/lang/String;

    return-void
.end method

.method private a()Ljava/util/concurrent/Executor;
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x4

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 2
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx0/b;->g:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lx0/k;
    .locals 1

    iget-object v0, p0, Lx0/b;->f:Lx0/k;

    return-object v0
.end method

.method public d()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lx0/b;->a:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public e()Lx0/m;
    .locals 1

    iget-object v0, p0, Lx0/b;->d:Lx0/m;

    return-object v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lx0/b;->j:I

    return v0
.end method

.method public g()I
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ne v0, v1, :cond_0

    .line 2
    iget v0, p0, Lx0/b;->k:I

    div-int/lit8 v0, v0, 0x2

    return v0

    .line 3
    :cond_0
    iget v0, p0, Lx0/b;->k:I

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lx0/b;->i:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lx0/b;->h:I

    return v0
.end method

.method public j()Lx0/t;
    .locals 1

    iget-object v0, p0, Lx0/b;->e:Lx0/t;

    return-object v0
.end method

.method public k()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lx0/b;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public l()Lx0/z;
    .locals 1

    iget-object v0, p0, Lx0/b;->c:Lx0/z;

    return-object v0
.end method
