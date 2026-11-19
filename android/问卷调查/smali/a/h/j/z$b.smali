.class public La/h/j/z$b;
.super La/h/j/z$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/h/j/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final b:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, La/h/j/z$d;-><init>()V

    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    iput-object v0, p0, La/h/j/z$b;->b:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(La/h/j/z;)V
    .locals 1

    invoke-direct {p0, p1}, La/h/j/z$d;-><init>(La/h/j/z;)V

    invoke-virtual {p1}, La/h/j/z;->h()Landroid/view/WindowInsets;

    move-result-object p1

    new-instance v0, Landroid/view/WindowInsets$Builder;

    if-eqz p1, :cond_0

    invoke-direct {v0, p1}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_0
    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    :goto_0
    iput-object v0, p0, La/h/j/z$b;->b:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public a()La/h/j/z;
    .locals 3

    iget-object v0, p0, La/h/j/z$b;->b:Landroid/view/WindowInsets$Builder;

    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, La/h/j/z;->i(Landroid/view/WindowInsets;)La/h/j/z;

    move-result-object v0

    .line 1
    iget-object v1, v0, La/h/j/z;->a:La/h/j/z$j;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, La/h/j/z$j;->l([La/h/d/b;)V

    return-object v0
.end method

.method public b(La/h/d/b;)V
    .locals 1

    iget-object v0, p0, La/h/j/z$b;->b:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, La/h/d/b;->c()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public c(La/h/d/b;)V
    .locals 1

    iget-object v0, p0, La/h/j/z$b;->b:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, La/h/d/b;->c()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
