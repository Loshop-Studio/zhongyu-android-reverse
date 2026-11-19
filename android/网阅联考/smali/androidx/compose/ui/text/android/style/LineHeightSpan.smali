.class public final Landroidx/compose/ui/text/android/style/LineHeightSpan;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/LineHeightSpan;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/compose/ui/text/android/InternalPlatformTextApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J8\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0002\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/text/android/style/LineHeightSpan;",
        "Landroid/text/style/LineHeightSpan;",
        "lineHeight",
        "",
        "(F)V",
        "getLineHeight",
        "()F",
        "chooseHeight",
        "",
        "text",
        "",
        "start",
        "",
        "end",
        "spanstartVertical",
        "fontMetricsInt",
        "Landroid/graphics/Paint$FontMetricsInt;",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final lineHeight:F


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/compose/ui/text/android/style/LineHeightSpan;->lineHeight:F

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public chooseHeight(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V
    .locals 2

    .line 1
    const-string/jumbo p2, "text"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string p1, "fontMetricsInt"

    .line 8
    .line 9
    invoke-static {p6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p6}, Landroidx/compose/ui/text/android/style/LineHeightStyleSpanKt;->lineHeight(Landroid/graphics/Paint$FontMetricsInt;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-gtz p1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget p2, p0, Landroidx/compose/ui/text/android/style/LineHeightSpan;->lineHeight:F

    .line 20
    .line 21
    float-to-double p2, p2

    .line 22
    invoke-static {p2, p3}, Ljava/lang/Math;->ceil(D)D

    .line 23
    .line 24
    .line 25
    move-result-wide p2

    .line 26
    double-to-float p2, p2

    .line 27
    float-to-int p2, p2

    .line 28
    int-to-float p3, p2

    .line 29
    const/high16 p4, 0x3f800000    # 1.0f

    .line 30
    .line 31
    mul-float/2addr p3, p4

    .line 32
    int-to-float p1, p1

    .line 33
    div-float/2addr p3, p1

    .line 34
    iget p1, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 35
    .line 36
    int-to-double p4, p1

    .line 37
    float-to-double v0, p3

    .line 38
    mul-double/2addr p4, v0

    .line 39
    invoke-static {p4, p5}, Ljava/lang/Math;->ceil(D)D

    .line 40
    .line 41
    .line 42
    move-result-wide p3

    .line 43
    double-to-int p1, p3

    .line 44
    iput p1, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 45
    .line 46
    sub-int/2addr p1, p2

    .line 47
    iput p1, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 48
    .line 49
    return-void
.end method

.method public final getLineHeight()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/text/android/style/LineHeightSpan;->lineHeight:F

    .line 2
    .line 3
    return v0
.end method
