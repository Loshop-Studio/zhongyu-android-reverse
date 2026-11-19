.class public Lj3/j$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj3/j$b;->U(Lj3/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj3/d;

.field public final synthetic b:Lj3/j$b;


# direct methods
.method public constructor <init>(Lj3/j$b;Lj3/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj3/j$b$a;->b:Lj3/j$b;

    .line 2
    .line 3
    iput-object p2, p0, Lj3/j$b$a;->a:Lj3/d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic c(Lj3/j$b$a;Lj3/d;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lj3/j$b$a;->e(Lj3/d;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic d(Lj3/j$b$a;Lj3/d;Lj3/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lj3/j$b$a;->f(Lj3/d;Lj3/d0;)V

    return-void
.end method

.method private synthetic e(Lj3/d;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/j$b$a;->b:Lj3/j$b;

    .line 2
    .line 3
    invoke-interface {p1, v0, p2}, Lj3/d;->b(Lj3/b;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic f(Lj3/d;Lj3/d0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj3/j$b$a;->b:Lj3/j$b;

    .line 2
    .line 3
    iget-object v0, v0, Lj3/j$b;->b:Lj3/b;

    .line 4
    .line 5
    invoke-interface {v0}, Lj3/b;->T()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p2, p0, Lj3/j$b$a;->b:Lj3/j$b;

    .line 12
    .line 13
    new-instance v0, Ljava/io/IOException;

    .line 14
    .line 15
    const-string v1, "Canceled"

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, p2, v0}, Lj3/d;->b(Lj3/b;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Lj3/j$b$a;->b:Lj3/j$b;

    .line 25
    .line 26
    invoke-interface {p1, v0, p2}, Lj3/d;->a(Lj3/b;Lj3/d0;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lj3/b;Lj3/d0;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lj3/j$b$a;->b:Lj3/j$b;

    .line 2
    .line 3
    iget-object p1, p1, Lj3/j$b;->a:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iget-object v0, p0, Lj3/j$b$a;->a:Lj3/d;

    .line 6
    .line 7
    new-instance v1, Lj3/k;

    .line 8
    .line 9
    invoke-direct {v1, p0, v0, p2}, Lj3/k;-><init>(Lj3/j$b$a;Lj3/d;Lj3/d0;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public b(Lj3/b;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lj3/j$b$a;->b:Lj3/j$b;

    .line 2
    .line 3
    iget-object p1, p1, Lj3/j$b;->a:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iget-object v0, p0, Lj3/j$b$a;->a:Lj3/d;

    .line 6
    .line 7
    new-instance v1, Lj3/l;

    .line 8
    .line 9
    invoke-direct {v1, p0, v0, p2}, Lj3/l;-><init>(Lj3/j$b$a;Lj3/d;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
