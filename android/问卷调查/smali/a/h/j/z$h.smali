.class public La/h/j/z$h;
.super La/h/j/z$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/h/j/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public o:La/h/d/b;

.field public p:La/h/d/b;

.field public q:La/h/d/b;


# direct methods
.method public constructor <init>(La/h/j/z;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La/h/j/z$g;-><init>(La/h/j/z;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, La/h/j/z$h;->o:La/h/d/b;

    iput-object p1, p0, La/h/j/z$h;->p:La/h/d/b;

    iput-object p1, p0, La/h/j/z$h;->q:La/h/d/b;

    return-void
.end method


# virtual methods
.method public f()La/h/d/b;
    .locals 1

    iget-object v0, p0, La/h/j/z$h;->p:La/h/d/b;

    if-nez v0, :cond_0

    iget-object v0, p0, La/h/j/z$e;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, La/h/d/b;->b(Landroid/graphics/Insets;)La/h/d/b;

    move-result-object v0

    iput-object v0, p0, La/h/j/z$h;->p:La/h/d/b;

    :cond_0
    iget-object v0, p0, La/h/j/z$h;->p:La/h/d/b;

    return-object v0
.end method

.method public i(IIII)La/h/j/z;
    .locals 1

    iget-object v0, p0, La/h/j/z$e;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, La/h/j/z;->i(Landroid/view/WindowInsets;)La/h/j/z;

    move-result-object p1

    return-object p1
.end method

.method public n(La/h/d/b;)V
    .locals 0

    return-void
.end method
