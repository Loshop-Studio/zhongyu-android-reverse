.class public final Lcom/friday/common/helper/RightListDecoration;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lqc/d;

.field public b:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lf2/i;

    .line 10
    .line 11
    invoke-direct {v0}, Lf2/i;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/friday/common/helper/RightListDecoration;->a:Lqc/d;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/friday/common/helper/RightListDecoration;->c()Landroid/graphics/Paint;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget v1, Lcom/friday/common/R$color;->app_black:I

    .line 25
    .line 26
    invoke-static {p1, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 35
    .line 36
    .line 37
    sget v0, Lcom/friday/common/R$drawable;->selector_note_list_tag:I

    .line 38
    .line 39
    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    const/4 v5, 0x7

    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v2, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v4, 0x0

    .line 50
    invoke-static/range {v1 .. v6}, Landroidx/core/graphics/drawable/DrawableKt;->toBitmap$default(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 p1, 0x0

    .line 56
    :goto_0
    iput-object p1, p0, Lcom/friday/common/helper/RightListDecoration;->b:Landroid/graphics/Bitmap;

    .line 57
    .line 58
    return-void
.end method

.method public static synthetic a()Landroid/graphics/Paint;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/common/helper/RightListDecoration;->b()Landroid/graphics/Paint;

    move-result-object v0

    return-object v0
.end method

.method public static final b()Landroid/graphics/Paint;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final c()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/helper/RightListDecoration;->a:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/Paint;

    .line 8
    .line 9
    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 5

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "parent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "state"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    instance-of v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v1, 0x0

    .line 36
    :goto_0
    const/4 v2, 0x0

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v1, v2

    .line 43
    :goto_1
    add-int/2addr v0, v1

    .line 44
    int-to-float v0, v0

    .line 45
    const/high16 v1, 0x42640000    # 57.0f

    .line 46
    .line 47
    add-float/2addr v0, v1

    .line 48
    :goto_2
    if-ge v2, p3, :cond_3

    .line 49
    .line 50
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    int-to-float v1, v1

    .line 59
    const/high16 v3, 0x42580000    # 54.0f

    .line 60
    .line 61
    add-float/2addr v1, v3

    .line 62
    iget-object v3, p0, Lcom/friday/common/helper/RightListDecoration;->b:Landroid/graphics/Bitmap;

    .line 63
    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/friday/common/helper/RightListDecoration;->c()Landroid/graphics/Paint;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {p1, v3, v0, v1, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    return-void
.end method
