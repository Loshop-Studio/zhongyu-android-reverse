.class public La/k/b/a0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/k/b/a0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/k/b/j0;

.field public final synthetic c:La/k/b/a0;


# direct methods
.method public constructor <init>(La/k/b/a0;La/k/b/j0;)V
    .locals 0

    iput-object p1, p0, La/k/b/a0$a;->c:La/k/b/a0;

    iput-object p2, p0, La/k/b/a0$a;->b:La/k/b/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, La/k/b/a0$a;->b:La/k/b/j0;

    .line 1
    iget-object v0, p1, La/k/b/j0;->c:La/k/b/m;

    .line 2
    invoke-virtual {p1}, La/k/b/j0;->k()V

    iget-object p1, v0, La/k/b/m;->G:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, La/k/b/a0$a;->c:La/k/b/a0;

    iget-object v0, v0, La/k/b/a0;->b:La/k/b/c0;

    invoke-static {p1, v0}, La/k/b/z0;->f(Landroid/view/ViewGroup;La/k/b/c0;)La/k/b/z0;

    move-result-object p1

    invoke-virtual {p1}, La/k/b/z0;->e()V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
