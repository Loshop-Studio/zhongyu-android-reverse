.class public La/b/c/n;
.super La/h/j/x;
.source ""


# instance fields
.field public final synthetic a:La/b/c/j;


# direct methods
.method public constructor <init>(La/b/c/j;)V
    .locals 0

    iput-object p1, p0, La/b/c/n;->a:La/b/c/j;

    invoke-direct {p0}, La/h/j/x;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, La/b/c/n;->a:La/b/c/j;

    iget-object p1, p1, La/b/c/j;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, La/b/c/n;->a:La/b/c/j;

    iget-object p1, p1, La/b/c/j;->s:La/h/j/v;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, La/h/j/v;->d(La/h/j/w;)La/h/j/v;

    iget-object p1, p0, La/b/c/n;->a:La/b/c/j;

    iput-object v0, p1, La/b/c/j;->s:La/h/j/v;

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, La/b/c/n;->a:La/b/c/j;

    iget-object p1, p1, La/b/c/j;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, La/b/c/n;->a:La/b/c/j;

    iget-object p1, p1, La/b/c/j;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    iget-object p1, p0, La/b/c/n;->a:La/b/c/j;

    iget-object p1, p1, La/b/c/j;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, La/b/c/n;->a:La/b/c/j;

    iget-object p1, p1, La/b/c/j;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    .line 1
    sget-object v0, La/h/j/o;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    :cond_0
    return-void
.end method
