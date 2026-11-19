.class final Landroidx/compose/foundation/MarqueeSpacing$Companion$fractionOfContainer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/MarqueeSpacing;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/MarqueeSpacing$Companion;->fractionOfContainer(F)Landroidx/compose/foundation/MarqueeSpacing;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"
    }
    d2 = {
        "Landroidx/compose/ui/unit/Density;",
        "",
        "<anonymous parameter 0>",
        "width",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $fraction:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/MarqueeSpacing$Companion$fractionOfContainer$1;->$fraction:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final calculateSpacing(Landroidx/compose/ui/unit/Density;II)I
    .locals 0

    .line 1
    const-string p2, "$this$MarqueeSpacing"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget p1, p0, Landroidx/compose/foundation/MarqueeSpacing$Companion$fractionOfContainer$1;->$fraction:F

    .line 7
    .line 8
    int-to-float p2, p3

    .line 9
    mul-float/2addr p1, p2

    .line 10
    invoke-static {p1}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method
