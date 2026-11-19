.class Lcom/xuexiang/xui/utils/SpanUtils$SpaceSpan;
.super Landroid/text/style/ReplacementSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/utils/SpanUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SpaceSpan"
.end annotation


# instance fields
.field private final color:I

.field private final width:I


# direct methods
.method private constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/utils/SpanUtils$SpaceSpan;-><init>(II)V

    return-void
.end method

.method private constructor <init>(II)V
    .locals 0

    .line 3
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$SpaceSpan;->width:I

    .line 5
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils$SpaceSpan;->color:I

    return-void
.end method

.method synthetic constructor <init>(IILcom/xuexiang/xui/utils/SpanUtils$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/utils/SpanUtils$SpaceSpan;-><init>(II)V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 6

    .line 1
    invoke-virtual {p9}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    move-result-object p2

    .line 2
    invoke-virtual {p9}, Landroid/graphics/Paint;->getColor()I

    move-result p3

    .line 3
    sget-object p4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p9, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    iget p4, p0, Lcom/xuexiang/xui/utils/SpanUtils$SpaceSpan;->color:I

    invoke-virtual {p9, p4}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v2, p6

    .line 5
    iget p4, p0, Lcom/xuexiang/xui/utils/SpanUtils$SpaceSpan;->width:I

    int-to-float p4, p4

    add-float v3, p5, p4

    int-to-float v4, p8

    move-object v0, p1

    move v1, p5

    move-object v5, p9

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 6
    invoke-virtual {p9, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 7
    invoke-virtual {p9, p3}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0

    iget p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$SpaceSpan;->width:I

    return p1
.end method
