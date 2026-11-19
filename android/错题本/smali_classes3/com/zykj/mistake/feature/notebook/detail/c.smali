.class public final Lcom/zykj/mistake/feature/notebook/detail/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/a;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/widget/ResizableImageView;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z

.field public final synthetic d:Lr6/a;

.field public final synthetic e:Lcom/zykj/mistake/widget/ResizableImageView;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lr6/a;

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/widget/ResizableImageView;Ljava/lang/String;ZLr6/a;Lcom/zykj/mistake/widget/ResizableImageView;Ljava/lang/String;Lr6/a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->a:Lcom/zykj/mistake/widget/ResizableImageView;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->d:Lr6/a;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->e:Lcom/zykj/mistake/widget/ResizableImageView;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->g:Lr6/a;

    .line 17
    .line 18
    iput-boolean p8, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->h:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final f(Lcoil3/k;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->a:Lcom/zykj/mistake/widget/ResizableImageView;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->c:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->d:Lr6/a;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public final m(Lcoil3/k;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final q(Lcoil3/k;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->e:Lcom/zykj/mistake/widget/ResizableImageView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->f:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->g:Lr6/a;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {p1}, Lcoil3/o;->j(Lcoil3/k;)Landroid/graphics/Bitmap;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/c;->h:Z

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-static {p1}, Lcom/zykj/mistake/utils/d;->g(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_1
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void
.end method
