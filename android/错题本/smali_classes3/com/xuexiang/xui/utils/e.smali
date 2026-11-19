.class public final Lcom/xuexiang/xui/utils/e;
.super Landroid/text/style/CharacterStyle;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/LineHeightSpan;


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/xuexiang/xui/utils/e;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final chooseHeight(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V
    .locals 0

    .line 1
    iget p1, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 2
    .line 3
    add-int/2addr p1, p5

    .line 4
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 5
    .line 6
    sub-int/2addr p1, p2

    .line 7
    sub-int/2addr p1, p4

    .line 8
    iget p3, p0, Lcom/xuexiang/xui/utils/e;->a:I

    .line 9
    .line 10
    sub-int p1, p3, p1

    .line 11
    .line 12
    if-lez p1, :cond_0

    .line 13
    .line 14
    sub-int/2addr p2, p1

    .line 15
    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 16
    .line 17
    :cond_0
    iget p1, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 18
    .line 19
    add-int/2addr p5, p1

    .line 20
    iget p1, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 21
    .line 22
    sub-int/2addr p5, p1

    .line 23
    sub-int/2addr p5, p4

    .line 24
    sub-int/2addr p3, p5

    .line 25
    if-lez p3, :cond_1

    .line 26
    .line 27
    sub-int/2addr p1, p3

    .line 28
    iput p1, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 0

    return-void
.end method
