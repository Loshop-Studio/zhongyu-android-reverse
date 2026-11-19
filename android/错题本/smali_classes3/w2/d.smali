.class public final Lw2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw2/d;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 3

    .line 1
    iget-object v0, p0, Lw2/d;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->d:Ljava/util/ArrayList;

    .line 13
    .line 14
    iget v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->c:I

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    if-ltz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-ge v0, v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    check-cast v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 37
    .line 38
    new-instance v2, Lw2/b;

    .line 39
    .line 40
    invoke-direct {v2, v0}, Lw2/b;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setOnTransformListener(Lcom/xuexiang/xui/widget/imageview/preview/view/b;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    iput-boolean v0, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Z

    .line 48
    .line 49
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_IN:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 50
    .line 51
    iput-object v0, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void
.end method
