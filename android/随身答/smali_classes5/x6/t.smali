.class public abstract Lx6/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Lx6/t;->a:F

    .line 9
    .line 10
    return-void
.end method

.method public static final synthetic a()F
    .locals 1

    .line 1
    sget v0, Lx6/t;->a:F

    .line 2
    .line 3
    return v0
.end method
