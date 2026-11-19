.class public La/b/c/m$a;
.super La/h/j/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/b/c/m;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/b/c/m;


# direct methods
.method public constructor <init>(La/b/c/m;)V
    .locals 0

    iput-object p1, p0, La/b/c/m$a;->a:La/b/c/m;

    invoke-direct {p0}, La/h/j/x;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, La/b/c/m$a;->a:La/b/c/m;

    iget-object p1, p1, La/b/c/m;->b:La/b/c/j;

    iget-object p1, p1, La/b/c/j;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, La/b/c/m$a;->a:La/b/c/m;

    iget-object p1, p1, La/b/c/m;->b:La/b/c/j;

    iget-object p1, p1, La/b/c/j;->s:La/h/j/v;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, La/h/j/v;->d(La/h/j/w;)La/h/j/v;

    iget-object p1, p0, La/b/c/m$a;->a:La/b/c/m;

    iget-object p1, p1, La/b/c/m;->b:La/b/c/j;

    iput-object v0, p1, La/b/c/j;->s:La/h/j/v;

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, La/b/c/m$a;->a:La/b/c/m;

    iget-object p1, p1, La/b/c/m;->b:La/b/c/j;

    iget-object p1, p1, La/b/c/j;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    return-void
.end method
