.class Lcom/blankj/utilcode/util/SpanUtils$SpaceSpan;
.super Landroid/text/style/ReplacementSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/SpanUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SpaceSpan"
.end annotation


# instance fields
.field private final paint:Landroid/graphics/Paint;

.field private final width:I


# direct methods
.method private constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/blankj/utilcode/util/SpanUtils$SpaceSpan;-><init>(II)V

    return-void
.end method

.method private constructor <init>(II)V
    .locals 1

    .line 3
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 4
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils$SpaceSpan;->paint:Landroid/graphics/Paint;

    .line 5
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils$SpaceSpan;->width:I

    .line 6
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method

.method public synthetic constructor <init>(IILcom/blankj/utilcode/util/SpanUtils$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/blankj/utilcode/util/SpanUtils$SpaceSpan;-><init>(II)V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p4    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p9    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    int-to-float p3, p6

    .line 2
    iget p2, p0, Lcom/blankj/utilcode/util/SpanUtils$SpaceSpan;->width:I

    .line 3
    .line 4
    int-to-float p2, p2

    .line 5
    add-float p4, p5, p2

    .line 6
    .line 7
    int-to-float p2, p8

    .line 8
    iget-object p6, p0, Lcom/blankj/utilcode/util/SpanUtils$SpaceSpan;->paint:Landroid/graphics/Paint;

    .line 9
    .line 10
    move v0, p5

    .line 11
    move p5, p2

    .line 12
    move p2, v0

    .line 13
    invoke-virtual/range {p1 .. p6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0
    .param p1    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p4    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p5    # Landroid/graphics/Paint$FontMetricsInt;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget p1, p0, Lcom/blankj/utilcode/util/SpanUtils$SpaceSpan;->width:I

    .line 2
    .line 3
    return p1
.end method
