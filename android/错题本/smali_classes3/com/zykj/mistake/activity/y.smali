.class public final Lcom/zykj/mistake/activity/y;
.super Ls0/f;
.source "SourceFile"


# instance fields
.field public final synthetic d:Landroid/widget/ImageView;

.field public final synthetic e:Lcom/zykj/mistake/activity/MistakeDetailActivity;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Lcom/zykj/mistake/activity/MistakeDetailActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/activity/y;->d:Landroid/widget/ImageView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/activity/y;->e:Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/activity/y;->f:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Ls0/f;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Landroid/graphics/Bitmap;

    .line 3
    .line 4
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    iget-object p1, p0, Lcom/zykj/mistake/activity/y;->d:Landroid/widget/ImageView;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    int-to-float v1, v1

    .line 19
    int-to-float v2, v3

    .line 20
    div-float/2addr v1, v2

    .line 21
    new-instance v5, Landroid/graphics/Matrix;

    .line 22
    .line 23
    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v5, v1, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "createBitmap(...)"

    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, La5/f;

    .line 45
    .line 46
    const/4 v1, 0x5

    .line 47
    iget-object v2, p0, Lcom/zykj/mistake/activity/y;->e:Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 48
    .line 49
    iget-object v3, p0, Lcom/zykj/mistake/activity/y;->f:Ljava/lang/String;

    .line 50
    .line 51
    invoke-direct {v0, v1, v2, v3}, La5/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final h(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/activity/y;->d:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method
