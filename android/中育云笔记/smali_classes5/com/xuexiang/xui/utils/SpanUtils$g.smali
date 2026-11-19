.class public Lcom/xuexiang/xui/utils/SpanUtils$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/utils/SpanUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field public final c:I

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$g;->c:I

    .line 4
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils$g;->d:I

    .line 5
    iput p3, p0, Lcom/xuexiang/xui/utils/SpanUtils$g;->e:I

    return-void
.end method

.method public synthetic constructor <init>(IIILcom/xuexiang/xui/utils/SpanUtils$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/utils/SpanUtils$g;-><init>(III)V

    return-void
.end method


# virtual methods
.method public drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    move-result-object p6

    .line 2
    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    move-result p8

    .line 3
    sget-object p9, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    iget p9, p0, Lcom/xuexiang/xui/utils/SpanUtils$g;->c:I

    invoke-virtual {p2, p9}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v1, p3

    int-to-float v2, p5

    .line 5
    iget p5, p0, Lcom/xuexiang/xui/utils/SpanUtils$g;->d:I

    mul-int/2addr p4, p5

    add-int/2addr p3, p4

    int-to-float v3, p3

    int-to-float v4, p7

    move-object v0, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 6
    invoke-virtual {p2, p6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 7
    invoke-virtual {p2, p8}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public getLeadingMargin(Z)I
    .locals 1

    .line 1
    iget p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$g;->d:I

    .line 2
    .line 3
    iget v0, p0, Lcom/xuexiang/xui/utils/SpanUtils$g;->e:I

    .line 4
    .line 5
    add-int/2addr p1, v0

    .line 6
    return p1
.end method
