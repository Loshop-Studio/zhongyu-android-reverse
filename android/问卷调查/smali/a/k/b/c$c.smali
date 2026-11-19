.class public La/k/b/c$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/k/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:La/k/b/z0$d;

.field public final b:La/h/f/a;


# direct methods
.method public constructor <init>(La/k/b/z0$d;La/h/f/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/k/b/c$c;->a:La/k/b/z0$d;

    iput-object p2, p0, La/k/b/c$c;->b:La/h/f/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, La/k/b/c$c;->a:La/k/b/z0$d;

    iget-object v1, p0, La/k/b/c$c;->b:La/h/f/a;

    .line 1
    iget-object v2, v0, La/k/b/z0$d;->e:Ljava/util/HashSet;

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, La/k/b/z0$d;->e:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, La/k/b/z0$d;->b()V

    :cond_0
    return-void
.end method

.method public b()Z
    .locals 3

    iget-object v0, p0, La/k/b/c$c;->a:La/k/b/z0$d;

    .line 1
    iget-object v0, v0, La/k/b/z0$d;->c:La/k/b/m;

    .line 2
    iget-object v0, v0, La/k/b/m;->G:Landroid/view/View;

    invoke-static {v0}, La/k/b/z0$d$c;->c(Landroid/view/View;)La/k/b/z0$d$c;

    move-result-object v0

    iget-object v1, p0, La/k/b/c$c;->a:La/k/b/z0$d;

    .line 3
    iget-object v1, v1, La/k/b/z0$d;->a:La/k/b/z0$d$c;

    if-eq v0, v1, :cond_1

    .line 4
    sget-object v2, La/k/b/z0$d$c;->c:La/k/b/z0$d$c;

    if-eq v0, v2, :cond_0

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
