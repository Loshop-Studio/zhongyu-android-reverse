.class public La/k/b/q0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:La/k/b/m;

.field public final synthetic c:La/k/b/m;

.field public final synthetic d:Z

.field public final synthetic e:La/e/a;

.field public final synthetic f:Landroid/view/View;

.field public final synthetic g:La/k/b/u0;

.field public final synthetic h:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(La/k/b/m;La/k/b/m;ZLa/e/a;Landroid/view/View;La/k/b/u0;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, La/k/b/q0;->b:La/k/b/m;

    iput-object p2, p0, La/k/b/q0;->c:La/k/b/m;

    iput-boolean p3, p0, La/k/b/q0;->d:Z

    iput-object p4, p0, La/k/b/q0;->e:La/e/a;

    iput-object p5, p0, La/k/b/q0;->f:Landroid/view/View;

    iput-object p6, p0, La/k/b/q0;->g:La/k/b/u0;

    iput-object p7, p0, La/k/b/q0;->h:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, La/k/b/q0;->b:La/k/b/m;

    iget-object v1, p0, La/k/b/q0;->c:La/k/b/m;

    iget-boolean v2, p0, La/k/b/q0;->d:Z

    iget-object v3, p0, La/k/b/q0;->e:La/e/a;

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, La/k/b/s0;->c(La/k/b/m;La/k/b/m;ZLa/e/a;Z)V

    iget-object v0, p0, La/k/b/q0;->f:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v1, p0, La/k/b/q0;->g:La/k/b/u0;

    iget-object v2, p0, La/k/b/q0;->h:Landroid/graphics/Rect;

    invoke-virtual {v1, v0, v2}, La/k/b/u0;->j(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_0
    return-void
.end method
