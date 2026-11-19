.class public Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->m(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)Landroid/widget/TextView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->m(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)Landroid/widget/TextView;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 16
    .line 17
    sget v2, Lcom/xuexiang/xui/R$string;->xui_preview_count_string:I

    .line 18
    .line 19
    add-int/lit8 v3, p1, 0x1

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 26
    .line 27
    invoke-static {v4}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->n(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 47
    .line 48
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->p(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;I)I

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 52
    .line 53
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->q(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 58
    .line 59
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->o(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/4 v1, 0x1

    .line 64
    invoke-virtual {p1, v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
