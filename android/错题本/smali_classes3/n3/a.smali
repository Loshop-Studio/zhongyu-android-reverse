.class public final Ln3/a;
.super Landroid/widget/ListPopupWindow;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln3/a;->a:Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/widget/ListPopupWindow;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final show()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/ListPopupWindow;->show()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ln3/a;->a:Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    .line 5
    .line 6
    iget-object v1, v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->b:Landroid/widget/ImageView;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->d:Landroid/view/animation/RotateAnimation;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
