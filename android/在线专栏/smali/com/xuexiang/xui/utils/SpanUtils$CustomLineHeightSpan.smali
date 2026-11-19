.class Lcom/xuexiang/xui/utils/SpanUtils$CustomLineHeightSpan;
.super Landroid/text/style/CharacterStyle;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/LineHeightSpan;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/utils/SpanUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CustomLineHeightSpan"
.end annotation


# static fields
.field static final ALIGN_CENTER:I = 0x2

.field static final ALIGN_TOP:I = 0x3


# instance fields
.field private final height:I

.field final mVerticalAlignment:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomLineHeightSpan;->height:I

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomLineHeightSpan;->mVerticalAlignment:I

    return-void
.end method


# virtual methods
.method public chooseHeight(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V
    .locals 4

    .line 1
    iget p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomLineHeightSpan;->height:I

    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    add-int p3, p5, p2

    iget v0, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    sub-int/2addr p3, v0

    sub-int/2addr p3, p4

    sub-int p3, p1, p3

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-lez p3, :cond_2

    .line 2
    iget v3, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomLineHeightSpan;->mVerticalAlignment:I

    if-ne v3, v1, :cond_0

    add-int/2addr p2, p3

    .line 3
    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    goto :goto_0

    :cond_0
    if-ne v3, v2, :cond_1

    .line 4
    div-int/2addr p3, v2

    add-int/2addr p2, p3

    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    sub-int/2addr v0, p3

    .line 5
    iput v0, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    goto :goto_0

    :cond_1
    sub-int/2addr v0, p3

    .line 6
    iput v0, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 7
    :cond_2
    :goto_0
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    add-int/2addr p5, p2

    iget p3, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr p5, p3

    sub-int/2addr p5, p4

    sub-int/2addr p1, p5

    if-lez p1, :cond_5

    .line 8
    iget p4, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomLineHeightSpan;->mVerticalAlignment:I

    if-ne p4, v1, :cond_3

    add-int/2addr p3, p1

    .line 9
    iput p3, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    goto :goto_1

    :cond_3
    if-ne p4, v2, :cond_4

    .line 10
    div-int/2addr p1, v2

    add-int/2addr p2, p1

    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    sub-int/2addr p3, p1

    .line 11
    iput p3, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    goto :goto_1

    :cond_4
    sub-int/2addr p3, p1

    .line 12
    iput p3, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    :cond_5
    :goto_1
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 0

    return-void
.end method
