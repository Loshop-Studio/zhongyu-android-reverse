.class public Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field public static final k:[I


# instance fields
.field public final a:Landroid/graphics/RectF;

.field public final b:Landroid/graphics/RectF;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:F

.field public final h:F

.field public i:Z

.field public final j:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    sput-object v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->k:[I

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->a:Landroid/graphics/RectF;

    .line 3
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->b:Landroid/graphics/RectF;

    .line 4
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h:F

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->i:Z

    const p1, 0x3e4ccccd    # 0.2f

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->j:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 9
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->a:Landroid/graphics/RectF;

    .line 10
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->b:Landroid/graphics/RectF;

    .line 11
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    const/4 p1, 0x0

    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h:F

    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->i:Z

    const p1, 0x3e4ccccd    # 0.2f

    .line 14
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->j:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->a:Landroid/graphics/RectF;

    .line 17
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->b:Landroid/graphics/RectF;

    .line 18
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    const/4 p1, 0x0

    .line 19
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h:F

    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->i:Z

    const p1, 0x3e4ccccd    # 0.2f

    .line 21
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->j:F

    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    const/high16 v3, 0x43b40000    # 360.0f

    .line 9
    .line 10
    const/high16 v4, 0x3f800000    # 1.0f

    .line 11
    .line 12
    if-gez v2, :cond_0

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    int-to-float v5, v5

    .line 16
    div-float/2addr v3, v5

    .line 17
    int-to-float v5, v2

    .line 18
    mul-float/2addr v3, v5

    .line 19
    add-float/2addr v3, v4

    .line 20
    iget v5, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->g:F

    .line 21
    .line 22
    sub-float/2addr v5, v4

    .line 23
    const/4 v4, 0x0

    .line 24
    mul-float/2addr v5, v4

    .line 25
    add-float v8, v5, v3

    .line 26
    .line 27
    const v9, 0x3dcccccd    # 0.1f

    .line 28
    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    iget-object v7, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->a:Landroid/graphics/RectF;

    .line 32
    .line 33
    const/4 v11, 0x0

    .line 34
    move-object/from16 v6, p1

    .line 35
    .line 36
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    :goto_1
    if-gez v1, :cond_1

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    int-to-float v2, v2

    .line 46
    div-float v2, v3, v2

    .line 47
    .line 48
    int-to-float v5, v1

    .line 49
    mul-float/2addr v2, v5

    .line 50
    add-float/2addr v2, v4

    .line 51
    const/4 v5, 0x0

    .line 52
    sub-float/2addr v2, v5

    .line 53
    iget v5, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->g:F

    .line 54
    .line 55
    sub-float/2addr v5, v4

    .line 56
    const/4 v6, 0x0

    .line 57
    mul-float/2addr v5, v6

    .line 58
    add-float v14, v5, v2

    .line 59
    .line 60
    const/16 v16, 0x0

    .line 61
    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    iget-object v13, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->b:Landroid/graphics/RectF;

    .line 65
    .line 66
    const v15, 0x3dcccccd    # 0.1f

    .line 67
    .line 68
    .line 69
    move-object/from16 v12, p1

    .line 70
    .line 71
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 72
    .line 73
    .line 74
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    const/4 v1, 0x0

    .line 78
    throw v1
.end method
