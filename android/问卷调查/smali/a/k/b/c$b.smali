.class public La/k/b/c$b;
.super La/k/b/c$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/k/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public c:Z

.field public d:Z

.field public e:La/k/b/t;


# direct methods
.method public constructor <init>(La/k/b/z0$d;La/h/f/a;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, La/k/b/c$c;-><init>(La/k/b/z0$d;La/h/f/a;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, La/k/b/c$b;->d:Z

    iput-boolean p3, p0, La/k/b/c$b;->c:Z

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;)La/k/b/t;
    .locals 4

    iget-boolean v0, p0, La/k/b/c$b;->d:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, La/k/b/c$b;->e:La/k/b/t;

    return-object p1

    .line 1
    :cond_0
    iget-object v0, p0, La/k/b/c$c;->a:La/k/b/z0$d;

    .line 2
    iget-object v1, v0, La/k/b/z0$d;->c:La/k/b/m;

    .line 3
    iget-object v0, v0, La/k/b/z0$d;->a:La/k/b/z0$d$c;

    .line 4
    sget-object v2, La/k/b/z0$d$c;->c:La/k/b/z0$d$c;

    const/4 v3, 0x1

    if-ne v0, v2, :cond_1

    move v0, v3

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-boolean v2, p0, La/k/b/c$b;->c:Z

    invoke-static {p1, v1, v0, v2}, La/h/b/e;->B(Landroid/content/Context;La/k/b/m;ZZ)La/k/b/t;

    move-result-object p1

    iput-object p1, p0, La/k/b/c$b;->e:La/k/b/t;

    iput-boolean v3, p0, La/k/b/c$b;->d:Z

    return-object p1
.end method
