.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/View;ZZ)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->e:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->b:Landroid/view/View;

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->c:Z

    iput-boolean p4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 5

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->b:Landroid/view/View;

    check-cast v0, Landroid/webkit/WebView;

    .line 1
    sget v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->u:I

    .line 2
    invoke-virtual {v0}, Landroid/webkit/WebView;->getMeasuredHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContentHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/webkit/WebView;->getScale()F

    move-result v0

    mul-float/2addr v0, v3

    cmpg-float v0, v2, v0

    const/4 v2, 0x0

    if-gez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_2

    .line 3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->e:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 4
    iput-boolean v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 5
    :cond_1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->d:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->e:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 6
    iput-boolean v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->g:Z

    goto :goto_1

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->e:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->b:Landroid/view/View;

    check-cast v2, Landroid/view/ViewGroup;

    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->c:Z

    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->d:Z

    .line 8
    invoke-virtual {v0, v2, v3, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b(Landroid/view/ViewGroup;ZZ)V

    .line 9
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_4
    return v1
.end method
