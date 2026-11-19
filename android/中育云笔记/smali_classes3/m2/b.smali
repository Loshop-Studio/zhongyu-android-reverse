.class public final Lm2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm2/b$a;
    }
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroidx/databinding/ViewDataBinding;

.field public c:Landroid/widget/PopupWindow;

.field public d:Landroid/view/View;

.field public e:Landroid/view/View;

.field public f:Landroid/view/Window;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/widget/PopupWindow;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "popupWindow"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lm2/b;->a:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Lm2/b;->c:Landroid/widget/PopupWindow;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lm2/b;->d:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm2/b;->b:Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lm2/b;->d:Landroid/view/View;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lm2/b;->e:Landroid/view/View;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iput-object v0, p0, Lm2/b;->d:Landroid/view/View;

    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Lm2/b;->c:Landroid/widget/PopupWindow;

    .line 18
    .line 19
    iget-object v1, p0, Lm2/b;->d:Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lm2/b;->e:Landroid/view/View;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lm2/b;->b:Landroidx/databinding/ViewDataBinding;

    .line 10
    .line 11
    invoke-virtual {p0}, Lm2/b;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm2/b;->c:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm2/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Landroid/app/Activity;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lm2/b;->f:Landroid/view/Window;

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "getAttributes(...)"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 29
    .line 30
    iget-object p1, p0, Lm2/b;->f:Landroid/view/Window;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final f(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm2/b;->c:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lm2/b;->c:Landroid/widget/PopupWindow;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lm2/b;->c:Landroid/widget/PopupWindow;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final g(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm2/b;->c:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm2/b;->c:Landroid/widget/PopupWindow;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
