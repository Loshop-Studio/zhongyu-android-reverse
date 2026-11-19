.class public Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->u()V
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
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->i(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)Landroid/widget/TextView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->i(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)Landroid/widget/TextView;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 17
    .line 18
    sget v3, Lcom/xuexiang/xui/R$string;->xui_preview_count_string:I

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    new-array v4, v4, [Ljava/lang/Object;

    .line 22
    .line 23
    add-int/lit8 v5, p1, 0x1

    .line 24
    .line 25
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const/4 v6, 0x0

    .line 30
    aput-object v5, v4, v6

    .line 31
    .line 32
    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 33
    .line 34
    invoke-static {v5}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->j(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    aput-object v5, v4, v1

    .line 43
    .line 44
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 52
    .line 53
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->l(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;I)I

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 57
    .line 58
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->m(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 63
    .line 64
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->k(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p1, v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 69
    .line 70
    .line 71
    return-void
.end method
