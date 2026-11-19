.class public Landroidx/core/view/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/c0$a;,
        Landroidx/core/view/c0$n;,
        Landroidx/core/view/c0$m;,
        Landroidx/core/view/c0$e;,
        Landroidx/core/view/c0$d;,
        Landroidx/core/view/c0$c;,
        Landroidx/core/view/c0$f;,
        Landroidx/core/view/c0$b;,
        Landroidx/core/view/c0$k;,
        Landroidx/core/view/c0$j;,
        Landroidx/core/view/c0$i;,
        Landroidx/core/view/c0$h;,
        Landroidx/core/view/c0$g;,
        Landroidx/core/view/c0$l;
    }
.end annotation


# static fields
.field public static final b:Landroidx/core/view/c0;


# instance fields
.field private final a:Landroidx/core/view/c0$l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 2
    sget-object v0, Landroidx/core/view/c0$k;->r:Landroidx/core/view/c0;

    sput-object v0, Landroidx/core/view/c0;->b:Landroidx/core/view/c0;

    goto :goto_0

    .line 3
    :cond_0
    sget-object v0, Landroidx/core/view/c0$l;->b:Landroidx/core/view/c0;

    sput-object v0, Landroidx/core/view/c0;->b:Landroidx/core/view/c0;

    :goto_0
    return-void
.end method

.method private constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Landroidx/core/view/c0$k;

    invoke-direct {v0, p0, p1}, Landroidx/core/view/c0$k;-><init>(Landroidx/core/view/c0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, Landroidx/core/view/c0$j;

    invoke-direct {v0, p0, p1}, Landroidx/core/view/c0$j;-><init>(Landroidx/core/view/c0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, Landroidx/core/view/c0$i;

    invoke-direct {v0, p0, p1}, Landroidx/core/view/c0$i;-><init>(Landroidx/core/view/c0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    goto :goto_0

    .line 6
    :cond_2
    new-instance v0, Landroidx/core/view/c0$h;

    invoke-direct {v0, p0, p1}, Landroidx/core/view/c0$h;-><init>(Landroidx/core/view/c0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroidx/core/view/c0;)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_5

    .line 8
    iget-object p1, p1, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    instance-of v1, p1, Landroidx/core/view/c0$k;

    if-eqz v1, :cond_0

    .line 10
    new-instance v0, Landroidx/core/view/c0$k;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/c0$k;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/c0$k;-><init>(Landroidx/core/view/c0;Landroidx/core/view/c0$k;)V

    iput-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 11
    instance-of v1, p1, Landroidx/core/view/c0$j;

    if-eqz v1, :cond_1

    .line 12
    new-instance v0, Landroidx/core/view/c0$j;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/c0$j;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/c0$j;-><init>(Landroidx/core/view/c0;Landroidx/core/view/c0$j;)V

    iput-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    .line 13
    instance-of v0, p1, Landroidx/core/view/c0$i;

    if-eqz v0, :cond_2

    .line 14
    new-instance v0, Landroidx/core/view/c0$i;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/c0$i;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/c0$i;-><init>(Landroidx/core/view/c0;Landroidx/core/view/c0$i;)V

    iput-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    goto :goto_0

    .line 15
    :cond_2
    instance-of v0, p1, Landroidx/core/view/c0$h;

    if-eqz v0, :cond_3

    .line 16
    new-instance v0, Landroidx/core/view/c0$h;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/c0$h;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/c0$h;-><init>(Landroidx/core/view/c0;Landroidx/core/view/c0$h;)V

    iput-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    goto :goto_0

    .line 17
    :cond_3
    instance-of v0, p1, Landroidx/core/view/c0$g;

    if-eqz v0, :cond_4

    .line 18
    new-instance v0, Landroidx/core/view/c0$g;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/c0$g;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/c0$g;-><init>(Landroidx/core/view/c0;Landroidx/core/view/c0$g;)V

    iput-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    goto :goto_0

    .line 19
    :cond_4
    new-instance v0, Landroidx/core/view/c0$l;

    invoke-direct {v0, p0}, Landroidx/core/view/c0$l;-><init>(Landroidx/core/view/c0;)V

    iput-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    .line 20
    :goto_0
    invoke-virtual {p1, p0}, Landroidx/core/view/c0$l;->e(Landroidx/core/view/c0;)V

    goto :goto_1

    .line 21
    :cond_5
    new-instance p1, Landroidx/core/view/c0$l;

    invoke-direct {p1, p0}, Landroidx/core/view/c0$l;-><init>(Landroidx/core/view/c0;)V

    iput-object p1, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    :goto_1
    return-void
.end method

.method static o(Lt/e;IIII)Lt/e;
    .locals 5

    .line 1
    iget v0, p0, Lt/e;->a:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 2
    iget v2, p0, Lt/e;->b:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 3
    iget v3, p0, Lt/e;->c:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 4
    iget v4, p0, Lt/e;->d:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    .line 5
    :cond_0
    invoke-static {v0, v2, v3, v1}, Lt/e;->b(IIII)Lt/e;

    move-result-object p0

    return-object p0
.end method

.method public static w(Landroid/view/WindowInsets;)Landroidx/core/view/c0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/core/view/c0;->x(Landroid/view/WindowInsets;Landroid/view/View;)Landroidx/core/view/c0;

    move-result-object p0

    return-object p0
.end method

.method public static x(Landroid/view/WindowInsets;Landroid/view/View;)Landroidx/core/view/c0;
    .locals 1

    .line 1
    new-instance v0, Landroidx/core/view/c0;

    invoke-static {p0}, Lb0/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowInsets;

    invoke-direct {v0, p0}, Landroidx/core/view/c0;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 3
    invoke-static {p1}, Landroidx/core/view/u;->I(Landroid/view/View;)Landroidx/core/view/c0;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/core/view/c0;->t(Landroidx/core/view/c0;)V

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/core/view/c0;->d(Landroid/view/View;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Landroidx/core/view/c0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0}, Landroidx/core/view/c0$l;->a()Landroidx/core/view/c0;

    move-result-object v0

    return-object v0
.end method

.method public b()Landroidx/core/view/c0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0}, Landroidx/core/view/c0$l;->b()Landroidx/core/view/c0;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroidx/core/view/c0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0}, Landroidx/core/view/c0$l;->c()Landroidx/core/view/c0;

    move-result-object v0

    return-object v0
.end method

.method d(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0, p1}, Landroidx/core/view/c0$l;->d(Landroid/view/View;)V

    return-void
.end method

.method public e()Landroidx/core/view/d;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0}, Landroidx/core/view/c0$l;->f()Landroidx/core/view/d;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1
    :cond_0
    instance-of v0, p1, Landroidx/core/view/c0;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_1
    check-cast p1, Landroidx/core/view/c0;

    .line 3
    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    iget-object p1, p1, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-static {v0, p1}, Lb0/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(I)Lt/e;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0, p1}, Landroidx/core/view/c0$l;->g(I)Lt/e;

    move-result-object p1

    return-object p1
.end method

.method public g()Lt/e;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0}, Landroidx/core/view/c0$l;->h()Lt/e;

    move-result-object v0

    return-object v0
.end method

.method public h()Lt/e;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0}, Landroidx/core/view/c0$l;->i()Lt/e;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/core/view/c0$l;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public i()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0}, Landroidx/core/view/c0$l;->k()Lt/e;

    move-result-object v0

    iget v0, v0, Lt/e;->d:I

    return v0
.end method

.method public j()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0}, Landroidx/core/view/c0$l;->k()Lt/e;

    move-result-object v0

    iget v0, v0, Lt/e;->a:I

    return v0
.end method

.method public k()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0}, Landroidx/core/view/c0$l;->k()Lt/e;

    move-result-object v0

    iget v0, v0, Lt/e;->c:I

    return v0
.end method

.method public l()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0}, Landroidx/core/view/c0$l;->k()Lt/e;

    move-result-object v0

    iget v0, v0, Lt/e;->b:I

    return v0
.end method

.method public m()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0}, Landroidx/core/view/c0$l;->k()Lt/e;

    move-result-object v0

    sget-object v1, Lt/e;->e:Lt/e;

    invoke-virtual {v0, v1}, Lt/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public n(IIII)Landroidx/core/view/c0;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/core/view/c0$l;->m(IIII)Landroidx/core/view/c0;

    move-result-object p1

    return-object p1
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0}, Landroidx/core/view/c0$l;->n()Z

    move-result v0

    return v0
.end method

.method public q(IIII)Landroidx/core/view/c0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Landroidx/core/view/c0$b;

    invoke-direct {v0, p0}, Landroidx/core/view/c0$b;-><init>(Landroidx/core/view/c0;)V

    .line 2
    invoke-static {p1, p2, p3, p4}, Lt/e;->b(IIII)Lt/e;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/core/view/c0$b;->c(Lt/e;)Landroidx/core/view/c0$b;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroidx/core/view/c0$b;->a()Landroidx/core/view/c0;

    move-result-object p1

    return-object p1
.end method

.method r([Lt/e;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0, p1}, Landroidx/core/view/c0$l;->p([Lt/e;)V

    return-void
.end method

.method s(Lt/e;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0, p1}, Landroidx/core/view/c0$l;->q(Lt/e;)V

    return-void
.end method

.method t(Landroidx/core/view/c0;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0, p1}, Landroidx/core/view/c0$l;->r(Landroidx/core/view/c0;)V

    return-void
.end method

.method u(Lt/e;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    invoke-virtual {v0, p1}, Landroidx/core/view/c0$l;->s(Lt/e;)V

    return-void
.end method

.method public v()Landroid/view/WindowInsets;
    .locals 2

    iget-object v0, p0, Landroidx/core/view/c0;->a:Landroidx/core/view/c0$l;

    instance-of v1, v0, Landroidx/core/view/c0$g;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/core/view/c0$g;

    iget-object v0, v0, Landroidx/core/view/c0$g;->c:Landroid/view/WindowInsets;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
