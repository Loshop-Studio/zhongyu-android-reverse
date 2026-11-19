.class final Lcom/google/android/material/transition/platform/FadeModeEvaluators$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/transition/platform/FadeModeEvaluator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/transition/platform/FadeModeEvaluators;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public evaluate(FFF)Lcom/google/android/material/transition/platform/FadeModeResult;
    .locals 3

    .line 1
    sub-float v0, p3, p2

    .line 2
    .line 3
    const v1, 0x3eb33333    # 0.35f

    .line 4
    .line 5
    .line 6
    mul-float/2addr v0, v1

    .line 7
    add-float/2addr v0, p2

    .line 8
    const/16 v1, 0xff

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {v1, v2, p2, v0, p1}, Lcom/google/android/material/transition/platform/TransitionUtils;->lerp(IIFFF)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-static {v2, v1, v0, p3, p1}, Lcom/google/android/material/transition/platform/TransitionUtils;->lerp(IIFFF)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p2, p1}, Lcom/google/android/material/transition/platform/FadeModeResult;->startOnTop(II)Lcom/google/android/material/transition/platform/FadeModeResult;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method
