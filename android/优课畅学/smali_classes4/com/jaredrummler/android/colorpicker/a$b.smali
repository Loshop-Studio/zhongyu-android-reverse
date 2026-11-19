.class public final Lcom/jaredrummler/android/colorpicker/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jaredrummler/android/colorpicker/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/view/View;

.field public b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

.field public c:Landroid/widget/ImageView;

.field public d:I

.field public final synthetic e:Lcom/jaredrummler/android/colorpicker/a;


# direct methods
.method public constructor <init>(Lcom/jaredrummler/android/colorpicker/a;Landroid/content/Context;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b;->e:Lcom/jaredrummler/android/colorpicker/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget p1, p1, Lcom/jaredrummler/android/colorpicker/a;->d:I

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    sget p1, Lcom/jaredrummler/android/colorpicker/R$layout;->cpv_color_item_square:I

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget p1, Lcom/jaredrummler/android/colorpicker/R$layout;->cpv_color_item_circle:I

    .line 14
    .line 15
    :goto_0
    const/4 v0, 0x0

    .line 16
    invoke-static {p2, p1, v0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b;->a:Landroid/view/View;

    .line 21
    .line 22
    sget p2, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_panel_view:I

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 29
    .line 30
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 31
    .line 32
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b;->a:Landroid/view/View;

    .line 33
    .line 34
    sget p2, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_image_view:I

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Landroid/widget/ImageView;

    .line 41
    .line 42
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b;->c:Landroid/widget/ImageView;

    .line 43
    .line 44
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getBorderColor()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/a$b;->d:I

    .line 51
    .line 52
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b;->a:Landroid/view/View;

    .line 53
    .line 54
    invoke-virtual {p1, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/a$b;->e:Lcom/jaredrummler/android/colorpicker/a;

    .line 2
    .line 3
    iget v1, v0, Lcom/jaredrummler/android/colorpicker/a;->c:I

    .line 4
    .line 5
    if-ne p1, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lcom/jaredrummler/android/colorpicker/a;->b:[I

    .line 8
    .line 9
    aget p1, v0, p1

    .line 10
    .line 11
    invoke-static {p1}, Landroidx/core/graphics/ColorUtils;->calculateLuminance(I)D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide v2, 0x3fe4cccccccccccdL    # 0.65

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmpl-double p1, v0, v2

    .line 21
    .line 22
    if-ltz p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b;->c:Landroid/widget/ImageView;

    .line 25
    .line 26
    const/high16 v0, -0x1000000

    .line 27
    .line 28
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b;->c:Landroid/widget/ImageView;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final b(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/a$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 2
    .line 3
    new-instance v1, Lcom/jaredrummler/android/colorpicker/a$b$a;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/jaredrummler/android/colorpicker/a$b$a;-><init>(Lcom/jaredrummler/android/colorpicker/a$b;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 12
    .line 13
    new-instance v0, Lcom/jaredrummler/android/colorpicker/a$b$b;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lcom/jaredrummler/android/colorpicker/a$b$b;-><init>(Lcom/jaredrummler/android/colorpicker/a$b;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public c(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/a$b;->e:Lcom/jaredrummler/android/colorpicker/a;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/jaredrummler/android/colorpicker/a;->b:[I

    .line 4
    .line 5
    aget v0, v0, p1

    .line 6
    .line 7
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/a$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/a$b;->c:Landroid/widget/ImageView;

    .line 17
    .line 18
    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/a$b;->e:Lcom/jaredrummler/android/colorpicker/a;

    .line 19
    .line 20
    iget v3, v3, Lcom/jaredrummler/android/colorpicker/a;->c:I

    .line 21
    .line 22
    if-ne v3, p1, :cond_0

    .line 23
    .line 24
    sget v3, Lcom/jaredrummler/android/colorpicker/R$drawable;->cpv_preset_checked:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v3, 0x0

    .line 28
    :goto_0
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 29
    .line 30
    .line 31
    const/16 v2, 0xff

    .line 32
    .line 33
    if-eq v1, v2, :cond_2

    .line 34
    .line 35
    const/16 v2, 0xa5

    .line 36
    .line 37
    if-gt v1, v2, :cond_1

    .line 38
    .line 39
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/a$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 40
    .line 41
    const/high16 v2, -0x1000000

    .line 42
    .line 43
    or-int/2addr v0, v2

    .line 44
    invoke-virtual {v1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setBorderColor(I)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/a$b;->c:Landroid/widget/ImageView;

    .line 48
    .line 49
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 50
    .line 51
    invoke-virtual {v0, v2, v1}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/a$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 56
    .line 57
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/a$b;->d:I

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setBorderColor(I)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/a$b;->c:Landroid/widget/ImageView;

    .line 63
    .line 64
    const/4 v1, -0x1

    .line 65
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 66
    .line 67
    invoke-virtual {v0, v1, v2}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/a$b;->a(I)V

    .line 72
    .line 73
    .line 74
    :goto_1
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/a$b;->b(I)V

    .line 75
    .line 76
    .line 77
    return-void
.end method
