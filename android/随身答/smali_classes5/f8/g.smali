.class public Lf8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf8/b;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/concurrent/ExecutorService;

.field public d:Lf8/a;

.field public e:Z

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Lf8/b;Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf8/g;->a:Lf8/b;

    .line 5
    .line 6
    iput-object p2, p0, Lf8/g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lf8/g;->c:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Lf8/a;)Lf8/d;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lf8/g;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lf8/h;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lf8/h;-><init>(Lf8/a;)V

    .line 8
    .line 9
    .line 10
    move-object p1, v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    iput-object p1, p0, Lf8/g;->d:Lf8/a;

    .line 14
    .line 15
    new-instance v1, Lf8/e;

    .line 16
    .line 17
    iget-object v2, p0, Lf8/g;->a:Lf8/b;

    .line 18
    .line 19
    iget-object v3, p0, Lf8/g;->b:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-direct {v1, v2, v3, p1}, Lf8/e;-><init>(Lf8/b;Ljava/lang/Object;Lf8/a;)V

    .line 22
    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lf8/h;->c(Lf8/d;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-boolean v0, p0, Lf8/g;->f:Z

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    iget-boolean v0, p0, Lf8/g;->g:Z

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lf8/g;->a:Lf8/b;

    .line 38
    .line 39
    iget-object v2, p0, Lf8/g;->b:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-interface {v0, p1, v2}, Lf8/b;->b(Lf8/a;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object v1

    .line 45
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "Illegal combination of single() and onlyChanges()"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_3
    iget-object v0, p0, Lf8/g;->a:Lf8/b;

    .line 54
    .line 55
    iget-object v2, p0, Lf8/g;->b:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-interface {v0, p1, v2}, Lf8/b;->a(Lf8/a;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-boolean v0, p0, Lf8/g;->g:Z

    .line 61
    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    iget-object v0, p0, Lf8/g;->a:Lf8/b;

    .line 65
    .line 66
    iget-object v2, p0, Lf8/g;->b:Ljava/lang/Object;

    .line 67
    .line 68
    invoke-interface {v0, p1, v2}, Lf8/b;->b(Lf8/a;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_4
    return-object v1
.end method

.method public b()Lf8/g;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lf8/g;->g:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public c()Lf8/g;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lf8/g;->e:Z

    .line 3
    .line 4
    return-object p0
.end method
