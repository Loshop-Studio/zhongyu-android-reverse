.class public abstract Lp1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;F)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    float-to-double v1, p0

    .line 15
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    .line 16
    .line 17
    add-double/2addr v1, v3

    .line 18
    double-to-int p1, v1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    cmpl-float p0, p0, v1

    .line 23
    .line 24
    if-lez p0, :cond_0

    .line 25
    .line 26
    return v0

    .line 27
    :cond_0
    return p1
.end method
