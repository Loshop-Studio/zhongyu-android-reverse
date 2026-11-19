.class public La/k/b/x0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/p/c;
.implements La/m/u;


# instance fields
.field public final b:La/m/t;

.field public c:La/m/h;

.field public d:La/p/b;


# direct methods
.method public constructor <init>(La/k/b/m;La/m/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, La/k/b/x0;->c:La/m/h;

    iput-object p1, p0, La/k/b/x0;->d:La/p/b;

    iput-object p2, p0, La/k/b/x0;->b:La/m/t;

    return-void
.end method


# virtual methods
.method public a()La/m/d;
    .locals 1

    invoke-virtual {p0}, La/k/b/x0;->f()V

    iget-object v0, p0, La/k/b/x0;->c:La/m/h;

    return-object v0
.end method

.method public b(La/m/d$a;)V
    .locals 2

    iget-object v0, p0, La/k/b/x0;->c:La/m/h;

    const-string v1, "handleLifecycleEvent"

    .line 1
    invoke-virtual {v0, v1}, La/m/h;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, La/m/d$a;->a()La/m/d$b;

    move-result-object p1

    invoke-virtual {v0, p1}, La/m/h;->f(La/m/d$b;)V

    return-void
.end method

.method public d()La/p/a;
    .locals 1

    invoke-virtual {p0}, La/k/b/x0;->f()V

    iget-object v0, p0, La/k/b/x0;->d:La/p/b;

    .line 1
    iget-object v0, v0, La/p/b;->b:La/p/a;

    return-object v0
.end method

.method public e()La/m/t;
    .locals 1

    invoke-virtual {p0}, La/k/b/x0;->f()V

    iget-object v0, p0, La/k/b/x0;->b:La/m/t;

    return-object v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, La/k/b/x0;->c:La/m/h;

    if-nez v0, :cond_0

    new-instance v0, La/m/h;

    invoke-direct {v0, p0}, La/m/h;-><init>(La/m/g;)V

    iput-object v0, p0, La/k/b/x0;->c:La/m/h;

    .line 1
    new-instance v0, La/p/b;

    invoke-direct {v0, p0}, La/p/b;-><init>(La/p/c;)V

    .line 2
    iput-object v0, p0, La/k/b/x0;->d:La/p/b;

    :cond_0
    return-void
.end method
