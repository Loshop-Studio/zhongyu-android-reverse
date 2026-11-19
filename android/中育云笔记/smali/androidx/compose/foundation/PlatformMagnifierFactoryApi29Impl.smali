.class public final Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/PlatformMagnifierFactory;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1d
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;

.field private static final canUpdateZoom:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;->INSTANCE:Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    sput-boolean v0, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;->canUpdateZoom:Z

    .line 10
    .line 11
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic create-nHHXs2Y(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifier;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p9}, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;->create-nHHXs2Y(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;

    move-result-object p1

    return-object p1
.end method

.method public create-nHHXs2Y(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;
    .locals 2

    if-eqz p2, :cond_0

    .line 2
    new-instance p2, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;

    new-instance p3, Landroid/widget/Magnifier;

    invoke-direct {p3, p1}, Landroid/widget/Magnifier;-><init>(Landroid/view/View;)V

    invoke-direct {p2, p3}, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;-><init>(Landroid/widget/Magnifier;)V

    return-object p2

    .line 3
    :cond_0
    invoke-interface {p8, p3, p4}, Landroidx/compose/ui/unit/Density;->toSize-XkaWNTQ(J)J

    move-result-wide p2

    .line 4
    invoke-interface {p8, p5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result p4

    .line 5
    invoke-interface {p8, p6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result p5

    .line 6
    new-instance p6, Landroid/widget/Magnifier$Builder;

    invoke-direct {p6, p1}, Landroid/widget/Magnifier$Builder;-><init>(Landroid/view/View;)V

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long p1, p2, v0

    if-eqz p1, :cond_1

    const/16 p1, 0x20

    shr-long v0, p2, p1

    long-to-int p1, v0

    .line 7
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    .line 8
    invoke-static {p1}, Ljd/c;->d(F)I

    move-result p1

    const-wide v0, 0xffffffffL

    and-long/2addr p2, v0

    long-to-int p2, p2

    .line 9
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    .line 10
    invoke-static {p2}, Ljd/c;->d(F)I

    move-result p2

    invoke-virtual {p6, p1, p2}, Landroid/widget/Magnifier$Builder;->setSize(II)Landroid/widget/Magnifier$Builder;

    .line 11
    :cond_1
    invoke-static {p4}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_2

    .line 12
    invoke-virtual {p6, p4}, Landroid/widget/Magnifier$Builder;->setCornerRadius(F)Landroid/widget/Magnifier$Builder;

    .line 13
    :cond_2
    invoke-static {p5}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_3

    .line 14
    invoke-virtual {p6, p5}, Landroid/widget/Magnifier$Builder;->setElevation(F)Landroid/widget/Magnifier$Builder;

    .line 15
    :cond_3
    invoke-static {p9}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_4

    .line 16
    invoke-virtual {p6, p9}, Landroid/widget/Magnifier$Builder;->setInitialZoom(F)Landroid/widget/Magnifier$Builder;

    .line 17
    :cond_4
    invoke-virtual {p6, p7}, Landroid/widget/Magnifier$Builder;->setClippingEnabled(Z)Landroid/widget/Magnifier$Builder;

    .line 18
    invoke-virtual {p6}, Landroid/widget/Magnifier$Builder;->build()Landroid/widget/Magnifier;

    move-result-object p1

    .line 19
    new-instance p2, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;

    invoke-direct {p2, p1}, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;-><init>(Landroid/widget/Magnifier;)V

    return-object p2
.end method

.method public getCanUpdateZoom()Z
    .locals 1

    .line 1
    sget-boolean v0, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;->canUpdateZoom:Z

    .line 2
    .line 3
    return v0
.end method
