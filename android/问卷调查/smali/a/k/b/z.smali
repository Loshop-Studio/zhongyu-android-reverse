.class public abstract La/k/b/z;
.super La/k/b/v;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "La/k/b/v;"
    }
.end annotation


# instance fields
.field public final b:Landroid/app/Activity;

.field public final c:Landroid/content/Context;

.field public final d:Landroid/os/Handler;

.field public final e:La/k/b/c0;


# direct methods
.method public constructor <init>(La/k/b/p;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 1
    invoke-direct {p0}, La/k/b/v;-><init>()V

    new-instance v1, La/k/b/d0;

    invoke-direct {v1}, La/k/b/d0;-><init>()V

    iput-object v1, p0, La/k/b/z;->e:La/k/b/c0;

    iput-object p1, p0, La/k/b/z;->b:Landroid/app/Activity;

    const-string v1, "context == null"

    invoke-static {p1, v1}, La/h/b/e;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, La/k/b/z;->c:Landroid/content/Context;

    const-string p1, "handler == null"

    invoke-static {v0, p1}, La/h/b/e;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, La/k/b/z;->d:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public abstract i()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation
.end method

.method public abstract j()Landroid/view/LayoutInflater;
.end method

.method public abstract k(La/k/b/m;)Z
.end method

.method public abstract l()V
.end method
