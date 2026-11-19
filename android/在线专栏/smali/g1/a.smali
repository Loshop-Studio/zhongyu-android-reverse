.class public abstract Lg1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Ly0/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ly0/c;

    invoke-direct {v0}, Ly0/c;-><init>()V

    iput-object v0, p0, Lg1/a;->a:Ly0/c;

    return-void
.end method

.method public static b(Ly0/i;)Lg1/a;
    .locals 1

    new-instance v0, Lg1/a$d;

    invoke-direct {v0, p0}, Lg1/a$d;-><init>(Ly0/i;)V

    return-object v0
.end method

.method public static c(Ljava/util/UUID;Ly0/i;)Lg1/a;
    .locals 1

    new-instance v0, Lg1/a$a;

    invoke-direct {v0, p1, p0}, Lg1/a$a;-><init>(Ly0/i;Ljava/util/UUID;)V

    return-object v0
.end method

.method public static d(Ljava/lang/String;Ly0/i;Z)Lg1/a;
    .locals 1

    new-instance v0, Lg1/a$c;

    invoke-direct {v0, p1, p0, p2}, Lg1/a$c;-><init>(Ly0/i;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static e(Ljava/lang/String;Ly0/i;)Lg1/a;
    .locals 1

    new-instance v0, Lg1/a$b;

    invoke-direct {v0, p1, p0}, Lg1/a$b;-><init>(Ly0/i;Ljava/lang/String;)V

    return-object v0
.end method

.method private g(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->M()Lf1/s;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->D()Lf1/b;

    move-result-object p1

    .line 3
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 4
    invoke-virtual {v1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 5
    :goto_0
    invoke-virtual {v1}, Ljava/util/LinkedList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    .line 6
    invoke-virtual {v1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 7
    invoke-interface {v0, p2}, Lf1/s;->i(Ljava/lang/String;)Lx0/v$a;

    move-result-object v2

    .line 8
    sget-object v3, Lx0/v$a;->c:Lx0/v$a;

    if-eq v2, v3, :cond_0

    sget-object v3, Lx0/v$a;->d:Lx0/v$a;

    if-eq v2, v3, :cond_0

    .line 9
    sget-object v2, Lx0/v$a;->f:Lx0/v$a;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    invoke-interface {v0, v2, v3}, Lf1/s;->g(Lx0/v$a;[Ljava/lang/String;)I

    .line 10
    :cond_0
    invoke-interface {p1, p2}, Lf1/b;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method a(Ly0/i;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ly0/i;->s()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lg1/a;->g(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Ly0/i;->p()Ly0/d;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p2}, Ly0/d;->l(Ljava/lang/String;)Z

    .line 4
    invoke-virtual {p1}, Ly0/i;->r()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/e;

    .line 5
    invoke-interface {v0, p2}, Ly0/e;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public f()Lx0/q;
    .locals 1

    iget-object v0, p0, Lg1/a;->a:Ly0/c;

    return-object v0
.end method

.method h(Ly0/i;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ly0/i;->l()Lx0/b;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Ly0/i;->s()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    .line 3
    invoke-virtual {p1}, Ly0/i;->r()Ljava/util/List;

    move-result-object p1

    .line 4
    invoke-static {v0, v1, p1}, Ly0/f;->b(Lx0/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method

.method abstract i()V
.end method

.method public run()V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lg1/a;->i()V

    .line 2
    iget-object v0, p0, Lg1/a;->a:Ly0/c;

    sget-object v1, Lx0/q;->a:Lx0/q$b$c;

    invoke-virtual {v0, v1}, Ly0/c;->b(Lx0/q$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 3
    iget-object v1, p0, Lg1/a;->a:Ly0/c;

    new-instance v2, Lx0/q$b$a;

    invoke-direct {v2, v0}, Lx0/q$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Ly0/c;->b(Lx0/q$b;)V

    :goto_0
    return-void
.end method
