.class public La/b/c/j$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/b/g/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/b/c/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public a:La/b/g/a$a;

.field public final synthetic b:La/b/c/j;


# direct methods
.method public constructor <init>(La/b/c/j;La/b/g/a$a;)V
    .locals 0

    iput-object p1, p0, La/b/c/j$c;->b:La/b/c/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/b/c/j$c;->a:La/b/g/a$a;

    return-void
.end method


# virtual methods
.method public a(La/b/g/a;Landroid/view/Menu;)Z
    .locals 2

    iget-object v0, p0, La/b/c/j$c;->b:La/b/c/j;

    iget-object v0, v0, La/b/c/j;->u:Landroid/view/ViewGroup;

    .line 1
    sget-object v1, La/h/j/o;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Landroid/view/View;->requestApplyInsets()V

    .line 2
    iget-object v0, p0, La/b/c/j$c;->a:La/b/g/a$a;

    invoke-interface {v0, p1, p2}, La/b/g/a$a;->a(La/b/g/a;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public b(La/b/g/a;)V
    .locals 2

    iget-object v0, p0, La/b/c/j$c;->a:La/b/g/a$a;

    invoke-interface {v0, p1}, La/b/g/a$a;->b(La/b/g/a;)V

    iget-object p1, p0, La/b/c/j$c;->b:La/b/c/j;

    iget-object v0, p1, La/b/c/j;->q:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, La/b/c/j;->f:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, La/b/c/j$c;->b:La/b/c/j;

    iget-object v0, v0, La/b/c/j;->r:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, La/b/c/j$c;->b:La/b/c/j;

    iget-object v0, p1, La/b/c/j;->p:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, La/b/c/j;->I()V

    iget-object p1, p0, La/b/c/j$c;->b:La/b/c/j;

    iget-object v0, p1, La/b/c/j;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, La/h/j/o;->a(Landroid/view/View;)La/h/j/v;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La/h/j/v;->a(F)La/h/j/v;

    iput-object v0, p1, La/b/c/j;->s:La/h/j/v;

    iget-object p1, p0, La/b/c/j$c;->b:La/b/c/j;

    iget-object p1, p1, La/b/c/j;->s:La/h/j/v;

    new-instance v0, La/b/c/j$c$a;

    invoke-direct {v0, p0}, La/b/c/j$c$a;-><init>(La/b/c/j$c;)V

    .line 1
    iget-object v1, p1, La/h/j/v;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_1

    invoke-virtual {p1, v1, v0}, La/h/j/v;->e(Landroid/view/View;La/h/j/w;)V

    .line 2
    :cond_1
    iget-object p1, p0, La/b/c/j$c;->b:La/b/c/j;

    iget-object v0, p1, La/b/c/j;->h:La/b/c/h;

    if-eqz v0, :cond_2

    iget-object p1, p1, La/b/c/j;->o:La/b/g/a;

    invoke-interface {v0, p1}, La/b/c/h;->f(La/b/g/a;)V

    :cond_2
    iget-object p1, p0, La/b/c/j$c;->b:La/b/c/j;

    const/4 v0, 0x0

    iput-object v0, p1, La/b/c/j;->o:La/b/g/a;

    iget-object p1, p1, La/b/c/j;->u:Landroid/view/ViewGroup;

    .line 3
    sget-object v0, La/h/j/o;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    return-void
.end method

.method public c(La/b/g/a;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, La/b/c/j$c;->a:La/b/g/a$a;

    invoke-interface {v0, p1, p2}, La/b/g/a$a;->c(La/b/g/a;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public d(La/b/g/a;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, La/b/c/j$c;->a:La/b/g/a$a;

    invoke-interface {v0, p1, p2}, La/b/g/a$a;->d(La/b/g/a;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
