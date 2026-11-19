.class public final Lw2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr2/j;
.implements Lx2/c;
.implements Lx2/d;


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw2/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    .line 1
    const/16 v0, 0xff

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lw2/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    .line 6
    .line 7
    iget-object v2, v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Landroid/widget/ImageView;

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->b:Landroid/view/View;

    .line 15
    .line 16
    int-to-float p1, p1

    .line 17
    const/high16 v2, 0x437f0000    # 255.0f

    .line 18
    .line 19
    div-float/2addr p1, v2

    .line 20
    mul-float/2addr p1, v2

    .line 21
    float-to-int p1, p1

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    shl-int/lit8 p1, p1, 0x18

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const/4 p1, 0x0

    .line 38
    throw p1
.end method
