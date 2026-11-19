.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;
.super Landroid/widget/TextView;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "AppCompatCustomView"
    }
.end annotation


# instance fields
.field public b:Z

.field public c:Lb/c/a/e/d/a/a;

.field public d:I

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->b:Z

    const p2, 0x7f040361

    const v0, 0x7f070085

    .line 1
    invoke-static {p1, p2, v0}, Lb/c/a/a;->C(Landroid/content/Context;II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->d:I

    sget-object p1, Lb/c/a/e/d/a/a;->d:Lb/c/a/e/d/a/a;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->c:Lb/c/a/e/d/a/a;

    return-void
.end method


# virtual methods
.method public a(ZZ)V
    .locals 3

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->b:Z

    if-ne v0, p1, :cond_0

    if-eqz p2, :cond_9

    :cond_0
    const/4 p2, 0x2

    const/4 v0, 0x1

    if-eqz p1, :cond_4

    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->c:Lb/c/a/e/d/a/a;

    .line 1
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_3

    if-eq v1, v0, :cond_2

    if-ne v1, p2, :cond_1

    const v1, 0x800005

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Invalid gravity constant"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    move v1, v0

    goto :goto_0

    :cond_3
    const v1, 0x800003

    :goto_0
    or-int/lit8 v1, v1, 0x10

    goto :goto_1

    :cond_4
    const/16 v1, 0x11

    .line 2
    :goto_1
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v1, 0x4

    if-eqz p1, :cond_6

    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->c:Lb/c/a/e/d/a/a;

    .line 3
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eq v2, v0, :cond_6

    if-eq v2, p2, :cond_5

    const/4 p2, 0x5

    goto :goto_2

    :cond_5
    const/4 p2, 0x6

    :goto_2
    move v1, p2

    .line 4
    :cond_6
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setTextAlignment(I)V

    if-eqz p1, :cond_7

    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->e:Landroid/graphics/drawable/Drawable;

    goto :goto_3

    :cond_7
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->f:Landroid/graphics/drawable/Drawable;

    .line 5
    :goto_3
    invoke-virtual {p0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_8

    .line 6
    iget p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->d:I

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->d:I

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p0, p2, v0, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_8
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->b:Z

    :cond_9
    return-void
.end method

.method public setAllCapsCompat(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    return-void
.end method

.method public setDefaultSelector(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->f:Landroid/graphics/drawable/Drawable;

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->b:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->a(ZZ)V

    :cond_0
    return-void
.end method

.method public setStackedGravity(Lb/c/a/e/d/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->c:Lb/c/a/e/d/a/a;

    return-void
.end method

.method public setStackedSelector(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->e:Landroid/graphics/drawable/Drawable;

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->b:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->a(ZZ)V

    :cond_0
    return-void
.end method
