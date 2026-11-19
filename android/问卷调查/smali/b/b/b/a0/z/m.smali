.class public final Lb/b/b/a0/z/m;
.super Lb/b/b/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/b/b/a0/z/m$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lb/b/b/x<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lb/b/b/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/b/u<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Lb/b/b/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/b/m<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lb/b/b/i;

.field public final d:Lb/b/b/b0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/b/b0/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final e:Lb/b/b/a0/z/m$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/b/a0/z/m<",
            "TT;>.b;"
        }
    .end annotation
.end field

.field public f:Lb/b/b/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/b/x<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lb/b/b/u;Lb/b/b/m;Lb/b/b/i;Lb/b/b/b0/a;Lb/b/b/y;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b/b/u<",
            "TT;>;",
            "Lb/b/b/m<",
            "TT;>;",
            "Lb/b/b/i;",
            "Lb/b/b/b0/a<",
            "TT;>;",
            "Lb/b/b/y;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lb/b/b/x;-><init>()V

    new-instance p5, Lb/b/b/a0/z/m$b;

    const/4 v0, 0x0

    invoke-direct {p5, p0, v0}, Lb/b/b/a0/z/m$b;-><init>(Lb/b/b/a0/z/m;Lb/b/b/a0/z/m$a;)V

    iput-object p5, p0, Lb/b/b/a0/z/m;->e:Lb/b/b/a0/z/m$b;

    iput-object p1, p0, Lb/b/b/a0/z/m;->a:Lb/b/b/u;

    iput-object p2, p0, Lb/b/b/a0/z/m;->b:Lb/b/b/m;

    iput-object p3, p0, Lb/b/b/a0/z/m;->c:Lb/b/b/i;

    iput-object p4, p0, Lb/b/b/a0/z/m;->d:Lb/b/b/b0/a;

    return-void
.end method


# virtual methods
.method public a(Lb/b/b/c0/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b/b/c0/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lb/b/b/a0/z/m;->b:Lb/b/b/m;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 1
    iget-object v0, p0, Lb/b/b/a0/z/m;->f:Lb/b/b/x;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb/b/b/a0/z/m;->c:Lb/b/b/i;

    iget-object v2, p0, Lb/b/b/a0/z/m;->d:Lb/b/b/b0/a;

    invoke-virtual {v0, v1, v2}, Lb/b/b/i;->d(Lb/b/b/y;Lb/b/b/b0/a;)Lb/b/b/x;

    move-result-object v0

    iput-object v0, p0, Lb/b/b/a0/z/m;->f:Lb/b/b/x;

    .line 2
    :goto_0
    invoke-virtual {v0, p1}, Lb/b/b/x;->a(Lb/b/b/c0/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 3
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Lb/b/b/c0/a;->v()Lb/b/b/c0/b;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lb/b/b/c0/d; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v0, 0x0

    :try_start_1
    sget-object v2, Lb/b/b/a0/z/o;->X:Lb/b/b/x;

    invoke-virtual {v2, p1}, Lb/b/b/x;->a(Lb/b/b/c0/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb/b/b/n;
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lb/b/b/c0/d; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    new-instance v0, Lb/b/b/v;

    invoke-direct {v0, p1}, Lb/b/b/v;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p1

    new-instance v0, Lb/b/b/o;

    invoke-direct {v0, p1}, Lb/b/b/o;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p1

    new-instance v0, Lb/b/b/v;

    invoke-direct {v0, p1}, Lb/b/b/v;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_4
    move-exception p1

    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    sget-object p1, Lb/b/b/p;->a:Lb/b/b/p;

    .line 4
    :goto_2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p1, Lb/b/b/p;

    if-eqz v0, :cond_2

    return-object v1

    .line 5
    :cond_2
    iget-object v0, p0, Lb/b/b/a0/z/m;->b:Lb/b/b/m;

    iget-object v1, p0, Lb/b/b/a0/z/m;->d:Lb/b/b/b0/a;

    .line 6
    iget-object v1, v1, Lb/b/b/b0/a;->b:Ljava/lang/reflect/Type;

    .line 7
    iget-object v2, p0, Lb/b/b/a0/z/m;->e:Lb/b/b/a0/z/m$b;

    invoke-interface {v0, p1, v1, v2}, Lb/b/b/m;->a(Lb/b/b/n;Ljava/lang/reflect/Type;Lb/b/b/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 8
    :cond_3
    new-instance v0, Lb/b/b/v;

    invoke-direct {v0, p1}, Lb/b/b/v;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public b(Lb/b/b/c0/c;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b/b/c0/c;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lb/b/b/a0/z/m;->a:Lb/b/b/u;

    if-nez v0, :cond_1

    .line 1
    iget-object v0, p0, Lb/b/b/a0/z/m;->f:Lb/b/b/x;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb/b/b/a0/z/m;->c:Lb/b/b/i;

    const/4 v1, 0x0

    iget-object v2, p0, Lb/b/b/a0/z/m;->d:Lb/b/b/b0/a;

    invoke-virtual {v0, v1, v2}, Lb/b/b/i;->d(Lb/b/b/y;Lb/b/b/b0/a;)Lb/b/b/x;

    move-result-object v0

    iput-object v0, p0, Lb/b/b/a0/z/m;->f:Lb/b/b/x;

    .line 2
    :goto_0
    invoke-virtual {v0, p1, p2}, Lb/b/b/x;->b(Lb/b/b/c0/c;Ljava/lang/Object;)V

    return-void

    :cond_1
    if-nez p2, :cond_2

    invoke-virtual {p1}, Lb/b/b/c0/c;->h()Lb/b/b/c0/c;

    return-void

    :cond_2
    iget-object v1, p0, Lb/b/b/a0/z/m;->d:Lb/b/b/b0/a;

    .line 3
    iget-object v1, v1, Lb/b/b/b0/a;->b:Ljava/lang/reflect/Type;

    .line 4
    iget-object v2, p0, Lb/b/b/a0/z/m;->e:Lb/b/b/a0/z/m$b;

    invoke-interface {v0, p2, v1, v2}, Lb/b/b/u;->a(Ljava/lang/Object;Ljava/lang/reflect/Type;Lb/b/b/t;)Lb/b/b/n;

    move-result-object p2

    .line 5
    sget-object v0, Lb/b/b/a0/z/o;->X:Lb/b/b/x;

    invoke-virtual {v0, p1, p2}, Lb/b/b/x;->b(Lb/b/b/c0/c;Ljava/lang/Object;)V

    return-void
.end method
