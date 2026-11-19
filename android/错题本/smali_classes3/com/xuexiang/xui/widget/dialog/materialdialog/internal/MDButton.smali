.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;
.super Landroid/widget/TextView;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "AppCompatCustomView"
    }
.end annotation


# instance fields
.field public a:Z

.field public b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public final c:I

.field public d:Landroid/graphics/drawable/Drawable;

.field public e:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 2
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->a:Z

    .line 3
    sget p2, Lcom/xuexiang/xui/R$attr;->md_dialog_frame_margin:I

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_md_dialog_frame_margin:I

    invoke-static {p1, p2, v0}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->c:I

    .line 4
    sget-object p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->END:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x0

    .line 6
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->a:Z

    .line 7
    sget p2, Lcom/xuexiang/xui/R$attr;->md_dialog_frame_margin:I

    sget p3, Lcom/xuexiang/xui/R$dimen;->default_md_dialog_frame_margin:I

    invoke-static {p1, p2, p3}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->c:I

    .line 8
    sget-object p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->END:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    return-void
.end method


# virtual methods
.method public final a(ZZ)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->a:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    return-void

    .line 9
    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    .line 10
    .line 11
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->getGravityInt()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    or-int/lit8 p2, p2, 0x10

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    const/16 p2, 0x11

    .line 21
    .line 22
    :goto_1
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 23
    .line 24
    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->getTextAlignment()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    goto :goto_2

    .line 34
    :cond_3
    const/4 p2, 0x4

    .line 35
    :goto_2
    invoke-virtual {p0, p2}, Landroid/view/View;->setTextAlignment(I)V

    .line 36
    .line 37
    .line 38
    if-eqz p1, :cond_4

    .line 39
    .line 40
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->d:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_4
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->e:Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    :goto_3
    invoke-virtual {p0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    .line 48
    if-eqz p1, :cond_5

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    iget v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->c:I

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    iget v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->c:I

    .line 61
    .line 62
    invoke-virtual {p0, v2, p2, v0, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 63
    .line 64
    .line 65
    :cond_5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->a:Z

    .line 66
    .line 67
    return-void
.end method

.method public setAllCapsCompat(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setDefaultSelector(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->e:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->a:Z

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->a(ZZ)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setStackedGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 2
    .line 3
    return-void
.end method

.method public setStackedSelector(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->d:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->a:Z

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->a(ZZ)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
