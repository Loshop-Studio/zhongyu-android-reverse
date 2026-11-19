.class final Landroidx/compose/animation/core/EasingFunctionsKt$EaseOutElastic$1;
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
.field public static final INSTANCE:Landroidx/compose/animation/core/EasingFunctionsKt$EaseOutElastic$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/core/EasingFunctionsKt$EaseOutElastic$1;

    invoke-direct {v0}, Landroidx/compose/animation/core/EasingFunctionsKt$EaseOutElastic$1;-><init>()V

    sput-object v0, Landroidx/compose/animation/core/EasingFunctionsKt$EaseOutElastic$1;->INSTANCE:Landroidx/compose/animation/core/EasingFunctionsKt$EaseOutElastic$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final transform(F)F
    .locals 7

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
    goto :goto_2

    .line 14
    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    cmpg-float v1, p1, v0

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_2
    move v2, v3

    .line 22
    :goto_1
    if-eqz v2, :cond_3

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_3
    const/high16 v1, 0x40000000    # 2.0f

    .line 26
    .line 27
    float-to-double v1, v1

    .line 28
    const/high16 v3, -0x3ee00000    # -10.0f

    .line 29
    .line 30
    mul-float/2addr v3, p1

    .line 31
    float-to-double v3, v3

    .line 32
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    double-to-float v1, v1

    .line 37
    float-to-double v1, v1

    .line 38
    const/high16 v3, 0x41200000    # 10.0f

    .line 39
    .line 40
    mul-float/2addr p1, v3

    .line 41
    const/high16 v3, 0x3f400000    # 0.75f

    .line 42
    .line 43
    sub-float/2addr p1, v3

    .line 44
    float-to-double v3, p1

    .line 45
    const-wide v5, 0x4000c152382d7365L    # 2.0943951023931953

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    mul-double/2addr v3, v5

    .line 51
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    mul-double/2addr v1, v3

    .line 56
    float-to-double v3, v0

    .line 57
    add-double/2addr v1, v3

    .line 58
    double-to-float v0, v1

    .line 59
    :goto_2
    return v0
.end method
