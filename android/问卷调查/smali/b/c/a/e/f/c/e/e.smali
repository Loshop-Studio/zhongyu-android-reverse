.class public Lb/c/a/e/f/c/e/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$e;


# instance fields
.field public final synthetic a:Lb/c/a/e/f/c/e/h;


# direct methods
.method public constructor <init>(Lb/c/a/e/f/c/e/h;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/f/c/e/e;->a:Lb/c/a/e/f/c/e/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    const/16 v0, 0xff

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    iget-object v2, p0, Lb/c/a/e/f/c/e/e;->a:Lb/c/a/e/f/c/e/h;

    .line 1
    iget-object v2, v2, Lb/c/a/e/f/c/e/h;->V:Lb/c/a/e/f/c/c/a;

    .line 2
    invoke-interface {v2}, Lb/c/a/e/f/c/c/a;->l()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lb/c/a/e/f/c/e/e;->a:Lb/c/a/e/f/c/e/h;

    iget-object v2, v2, Lb/c/a/e/f/c/e/h;->b0:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lb/c/a/e/f/c/e/e;->a:Lb/c/a/e/f/c/e/h;

    iget-object v2, v2, Lb/c/a/e/f/c/e/h;->b0:Landroid/widget/ImageView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    iget-object v2, p0, Lb/c/a/e/f/c/e/e;->a:Lb/c/a/e/f/c/e/h;

    iget-object v2, v2, Lb/c/a/e/f/c/e/h;->Y:Landroid/view/View;

    int-to-float p1, p1

    const/high16 v3, 0x437f0000    # 255.0f

    div-float/2addr p1, v3

    mul-float/2addr p1, v3

    float-to-int p1, p1

    .line 3
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    shl-int/lit8 p1, p1, 0x18

    add-int/2addr p1, v1

    .line 4
    invoke-virtual {v2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method
