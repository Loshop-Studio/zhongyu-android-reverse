.class public final Lcom/xuexiang/xui/utils/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;


# instance fields
.field public final a:I

.field public b:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/xuexiang/xui/utils/c;->b:Landroid/graphics/Path;

    .line 6
    .line 7
    iput p1, p0, Lcom/xuexiang/xui/utils/c;->a:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 0

    .line 1
    check-cast p8, Landroid/text/Spanned;

    .line 2
    .line 3
    invoke-interface {p8, p0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    if-ne p4, p9, :cond_2

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    .line 14
    .line 15
    .line 16
    move-result p6

    .line 17
    iget p8, p0, Lcom/xuexiang/xui/utils/c;->a:I

    .line 18
    .line 19
    invoke-virtual {p2, p8}, Landroid/graphics/Paint;->setColor(I)V

    .line 20
    .line 21
    .line 22
    sget-object p8, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 23
    .line 24
    invoke-virtual {p2, p8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 28
    .line 29
    .line 30
    move-result p8

    .line 31
    const/high16 p9, 0x40000000    # 2.0f

    .line 32
    .line 33
    const/4 p10, 0x0

    .line 34
    if-eqz p8, :cond_1

    .line 35
    .line 36
    iget-object p8, p0, Lcom/xuexiang/xui/utils/c;->b:Landroid/graphics/Path;

    .line 37
    .line 38
    if-nez p8, :cond_0

    .line 39
    .line 40
    new-instance p8, Landroid/graphics/Path;

    .line 41
    .line 42
    invoke-direct {p8}, Landroid/graphics/Path;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p8, p0, Lcom/xuexiang/xui/utils/c;->b:Landroid/graphics/Path;

    .line 46
    .line 47
    int-to-float p10, p10

    .line 48
    sget-object p11, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 49
    .line 50
    const/4 p12, 0x0

    .line 51
    invoke-virtual {p8, p12, p12, p10, p11}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 55
    .line 56
    .line 57
    int-to-float p3, p3

    .line 58
    add-int/2addr p5, p7

    .line 59
    int-to-float p5, p5

    .line 60
    div-float/2addr p5, p9

    .line 61
    invoke-virtual {p1, p3, p5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 62
    .line 63
    .line 64
    iget-object p3, p0, Lcom/xuexiang/xui/utils/c;->b:Landroid/graphics/Path;

    .line 65
    .line 66
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    int-to-float p3, p3

    .line 74
    add-int/2addr p5, p7

    .line 75
    int-to-float p5, p5

    .line 76
    div-float/2addr p5, p9

    .line 77
    int-to-float p7, p10

    .line 78
    invoke-virtual {p1, p3, p5, p7, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    invoke-virtual {p2, p6}, Landroid/graphics/Paint;->setColor(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    return-void
.end method

.method public final getLeadingMargin(Z)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
