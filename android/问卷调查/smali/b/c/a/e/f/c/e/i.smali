.class public Lb/c/a/e/f/c/e/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/t/a/b$i;


# instance fields
.field public final synthetic b:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/f/c/e/i;->b:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 7

    iget-object v0, p0, Lb/c/a/e/f/c/e/i;->b:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 1
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->t:Landroid/widget/TextView;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    const v4, 0x7f0f007b

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    add-int/lit8 v6, p1, 0x1

    .line 2
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v2

    iget-object v6, p0, Lb/c/a/e/f/c/e/i;->b:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 3
    invoke-virtual {v6}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->v()I

    move-result v6

    .line 4
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v3

    invoke-virtual {v0, v4, v5}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lb/c/a/e/f/c/e/i;->b:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 5
    iput p1, v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->q:I

    .line 6
    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 7
    iput-boolean v2, v0, La/t/a/b;->w:Z

    .line 8
    invoke-virtual {v0, p1, v3, v2, v2}, La/t/a/b;->y(IZZI)V

    return-void
.end method

.method public b(IFI)V
    .locals 0

    return-void
.end method

.method public c(I)V
    .locals 0

    return-void
.end method
