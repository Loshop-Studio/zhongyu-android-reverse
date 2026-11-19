.class public La/b/c/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/h/j/k;


# instance fields
.field public final synthetic a:La/b/c/j;


# direct methods
.method public constructor <init>(La/b/c/j;)V
    .locals 0

    iput-object p1, p0, La/b/c/k;->a:La/b/c/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;La/h/j/z;)La/h/j/z;
    .locals 4

    invoke-virtual {p2}, La/h/j/z;->d()I

    move-result v0

    iget-object v1, p0, La/b/c/k;->a:La/b/c/j;

    const/4 v2, 0x0

    invoke-virtual {v1, p2, v2}, La/b/c/j;->X(La/h/j/z;Landroid/graphics/Rect;)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, La/h/j/z;->b()I

    move-result v0

    invoke-virtual {p2}, La/h/j/z;->c()I

    move-result v2

    invoke-virtual {p2}, La/h/j/z;->a()I

    move-result v3

    invoke-virtual {p2, v0, v1, v2, v3}, La/h/j/z;->g(IIII)La/h/j/z;

    move-result-object p2

    :cond_0
    invoke-static {p1, p2}, La/h/j/o;->i(Landroid/view/View;La/h/j/z;)La/h/j/z;

    move-result-object p1

    return-object p1
.end method
