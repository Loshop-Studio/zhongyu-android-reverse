.class public La/h/j/z;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/h/j/z$c;,
        La/h/j/z$b;,
        La/h/j/z$a;,
        La/h/j/z$d;,
        La/h/j/z$i;,
        La/h/j/z$h;,
        La/h/j/z$g;,
        La/h/j/z$f;,
        La/h/j/z$e;,
        La/h/j/z$j;
    }
.end annotation


# static fields
.field public static final b:La/h/j/z;


# instance fields
.field public final a:La/h/j/z$j;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, La/h/j/z$i;->r:La/h/j/z;

    goto :goto_0

    :cond_0
    sget-object v0, La/h/j/z$j;->b:La/h/j/z;

    :goto_0
    sput-object v0, La/h/j/z;->b:La/h/j/z;

    return-void
.end method

.method public constructor <init>(La/h/j/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, La/h/j/z$j;

    invoke-direct {p1, p0}, La/h/j/z$j;-><init>(La/h/j/z;)V

    iput-object p1, p0, La/h/j/z;->a:La/h/j/z$j;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, La/h/j/z$i;

    invoke-direct {v0, p0, p1}, La/h/j/z$i;-><init>(La/h/j/z;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, La/h/j/z$h;

    invoke-direct {v0, p0, p1}, La/h/j/z$h;-><init>(La/h/j/z;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    new-instance v0, La/h/j/z$g;

    invoke-direct {v0, p0, p1}, La/h/j/z$g;-><init>(La/h/j/z;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_2
    new-instance v0, La/h/j/z$f;

    invoke-direct {v0, p0, p1}, La/h/j/z$f;-><init>(La/h/j/z;Landroid/view/WindowInsets;)V

    :goto_0
    iput-object v0, p0, La/h/j/z;->a:La/h/j/z$j;

    return-void
.end method

.method public static e(La/h/d/b;IIII)La/h/d/b;
    .locals 5

    iget v0, p0, La/h/d/b;->a:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, La/h/d/b;->b:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, La/h/d/b;->c:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, p0, La/h/d/b;->d:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, v2, v3, v1}, La/h/d/b;->a(IIII)La/h/d/b;

    move-result-object p0

    return-object p0
.end method

.method public static i(Landroid/view/WindowInsets;)La/h/j/z;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, La/h/j/z;->j(Landroid/view/WindowInsets;Landroid/view/View;)La/h/j/z;

    move-result-object p0

    return-object p0
.end method

.method public static j(Landroid/view/WindowInsets;Landroid/view/View;)La/h/j/z;
    .locals 2

    new-instance v0, La/h/j/z;

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-direct {v0, p0}, La/h/j/z;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, La/h/j/o;->g(Landroid/view/View;)La/h/j/z;

    move-result-object p0

    .line 3
    iget-object v1, v0, La/h/j/z;->a:La/h/j/z$j;

    invoke-virtual {v1, p0}, La/h/j/z$j;->m(La/h/j/z;)V

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    .line 5
    iget-object p1, v0, La/h/j/z;->a:La/h/j/z$j;

    invoke-virtual {p1, p0}, La/h/j/z$j;->d(Landroid/view/View;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, La/h/j/z;->a:La/h/j/z$j;

    invoke-virtual {v0}, La/h/j/z$j;->h()La/h/d/b;

    move-result-object v0

    iget v0, v0, La/h/d/b;->d:I

    return v0
.end method

.method public b()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, La/h/j/z;->a:La/h/j/z$j;

    invoke-virtual {v0}, La/h/j/z$j;->h()La/h/d/b;

    move-result-object v0

    iget v0, v0, La/h/d/b;->a:I

    return v0
.end method

.method public c()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, La/h/j/z;->a:La/h/j/z$j;

    invoke-virtual {v0}, La/h/j/z$j;->h()La/h/d/b;

    move-result-object v0

    iget v0, v0, La/h/d/b;->c:I

    return v0
.end method

.method public d()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, La/h/j/z;->a:La/h/j/z$j;

    invoke-virtual {v0}, La/h/j/z$j;->h()La/h/d/b;

    move-result-object v0

    iget v0, v0, La/h/d/b;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, La/h/j/z;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, La/h/j/z;

    iget-object v0, p0, La/h/j/z;->a:La/h/j/z$j;

    iget-object p1, p1, La/h/j/z;->a:La/h/j/z$j;

    .line 1
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, La/h/j/z;->a:La/h/j/z$j;

    invoke-virtual {v0}, La/h/j/z$j;->j()Z

    move-result v0

    return v0
.end method

.method public g(IIII)La/h/j/z;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, La/h/j/z$c;

    invoke-direct {v0, p0}, La/h/j/z$c;-><init>(La/h/j/z;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, La/h/j/z$b;

    invoke-direct {v0, p0}, La/h/j/z$b;-><init>(La/h/j/z;)V

    goto :goto_0

    :cond_1
    new-instance v0, La/h/j/z$a;

    invoke-direct {v0, p0}, La/h/j/z$a;-><init>(La/h/j/z;)V

    .line 2
    :goto_0
    invoke-static {p1, p2, p3, p4}, La/h/d/b;->a(IIII)La/h/d/b;

    move-result-object p1

    .line 3
    invoke-virtual {v0, p1}, La/h/j/z$d;->c(La/h/d/b;)V

    .line 4
    invoke-virtual {v0}, La/h/j/z$d;->a()La/h/j/z;

    move-result-object p1

    return-object p1
.end method

.method public h()Landroid/view/WindowInsets;
    .locals 2

    iget-object v0, p0, La/h/j/z;->a:La/h/j/z$j;

    instance-of v1, v0, La/h/j/z$e;

    if-eqz v1, :cond_0

    check-cast v0, La/h/j/z$e;

    iget-object v0, v0, La/h/j/z$e;->c:Landroid/view/WindowInsets;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, La/h/j/z;->a:La/h/j/z$j;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, La/h/j/z$j;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method
