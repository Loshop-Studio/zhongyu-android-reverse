.class final Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1a
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;

    invoke-direct {v0}, Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;->INSTANCE:Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;

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
.method public final getHorizontalScrollFactor(Landroid/view/ViewConfiguration;)F
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledHorizontalScrollFactor()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final getVerticalScrollFactor(Landroid/view/ViewConfiguration;)F
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledVerticalScrollFactor()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
