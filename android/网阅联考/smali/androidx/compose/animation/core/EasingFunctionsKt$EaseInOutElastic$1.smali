.class final Landroidx/compose/animation/core/EasingFunctionsKt$EaseInOutElastic$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/animation/core/Easing;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/animation/core/EasingFunctionsKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"
    }
    d2 = {
        "",
        "fraction",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/animation/core/EasingFunctionsKt$EaseInOutElastic$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/core/EasingFunctionsKt$EaseInOutElastic$1;

    invoke-direct {v0}, Landroidx/compose/animation/core/EasingFunctionsKt$EaseInOutElastic$1;-><init>()V

    sput-object v0, Landroidx/compose/animation/core/EasingFunctionsKt$EaseInOutElastic$1;->INSTANCE:Landroidx/compose/animation/core/EasingFunctionsKt$EaseInOutElastic$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final transform(F)F
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    move v1, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v1, v3

    .line 11
    :goto_0
    if-eqz v1, :cond_1

    .line 12
    .line 13
    goto :goto_3

    .line 14
    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    .line 15
    .line 16
    cmpg-float v4, p1, v1

    .line 17
    .line 18
    if-nez v4, :cond_2

    .line 19
    .line 20
    move v4, v2

    .line 21
    goto :goto_1

    .line 22
    :cond_2
    move v4, v3

    .line 23
    :goto_1
    if-eqz v4, :cond_3

    .line 24
    .line 25
    move v0, v1

    .line 26
    goto :goto_3

    .line 27
    :cond_3
    cmpg-float v0, v0, p1

    .line 28
    .line 29
    if-gtz v0, :cond_4

    .line 30
    .line 31
    const/high16 v0, 0x3f000000    # 0.5f

    .line 32
    .line 33
    cmpg-float v0, p1, v0

    .line 34
    .line 35
    if-gtz v0, :cond_4

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_4
    move v2, v3

    .line 39
    :goto_2
    const/high16 v0, 0x41320000    # 11.125f

    .line 40
    .line 41
    const/high16 v3, 0x41a00000    # 20.0f

    .line 42
    .line 43
    const/high16 v4, 0x41200000    # 10.0f

    .line 44
    .line 45
    const/high16 v5, 0x40000000    # 2.0f

    .line 46
    .line 47
    const-wide v6, 0x3ff657184ae74487L    # 1.3962634015954636

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    if-eqz v2, :cond_5

    .line 53
    .line 54
    float-to-double v1, v5

    .line 55
    mul-float/2addr p1, v3

    .line 56
    sub-float v3, p1, v4

    .line 57
    .line 58
    float-to-double v3, v3

    .line 59
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    double-to-float v3, v3

    .line 64
    float-to-double v3, v3

    .line 65
    sub-float/2addr p1, v0

    .line 66
    float-to-double v8, p1

    .line 67
    mul-double/2addr v8, v6

    .line 68
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    .line 69
    .line 70
    .line 71
    move-result-wide v5

    .line 72
    mul-double/2addr v3, v5

    .line 73
    neg-double v3, v3

    .line 74
    div-double/2addr v3, v1

    .line 75
    double-to-float v0, v3

    .line 76
    goto :goto_3

    .line 77
    :cond_5
    float-to-double v8, v5

    .line 78
    const/high16 v2, -0x3e600000    # -20.0f

    .line 79
    .line 80
    mul-float/2addr v2, p1

    .line 81
    add-float/2addr v2, v4

    .line 82
    float-to-double v4, v2

    .line 83
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 84
    .line 85
    .line 86
    move-result-wide v4

    .line 87
    double-to-float v2, v4

    .line 88
    float-to-double v4, v2

    .line 89
    mul-float/2addr p1, v3

    .line 90
    sub-float/2addr p1, v0

    .line 91
    float-to-double v2, p1

    .line 92
    mul-double/2addr v2, v6

    .line 93
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 94
    .line 95
    .line 96
    move-result-wide v2

    .line 97
    mul-double/2addr v4, v2

    .line 98
    div-double/2addr v4, v8

    .line 99
    double-to-float p1, v4

    .line 100
    add-float v0, p1, v1

    .line 101
    .line 102
    :goto_3
    return v0
.end method
