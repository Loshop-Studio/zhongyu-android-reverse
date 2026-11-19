.class public final Landroidx/compose/ui/ComposeUiFlags;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/ui/ComposeUiFlags;

.field public static NewNestedScrollFlingDispatchingEnabled:Z

.field public static isRectTrackingEnabled:Z

.field public static isRemoveFocusedViewFixEnabled:Z

.field public static isSemanticAutofillEnabled:Z

.field public static isTrackFocusEnabled:Z

.field public static isViewFocusFixEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/ComposeUiFlags;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/ComposeUiFlags;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/ComposeUiFlags;->INSTANCE:Landroidx/compose/ui/ComposeUiFlags;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    sput-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isRectTrackingEnabled:Z

    .line 10
    .line 11
    sput-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->NewNestedScrollFlingDispatchingEnabled:Z

    .line 12
    .line 13
    sput-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isSemanticAutofillEnabled:Z

    .line 14
    .line 15
    sput-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 16
    .line 17
    const/16 v0, 0x8

    .line 18
    .line 19
    sput v0, Landroidx/compose/ui/ComposeUiFlags;->$stable:I

    .line 20
    .line 21
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

.method public static synthetic getNewNestedScrollFlingDispatchingEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isRectTrackingEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isRemoveFocusedViewFixEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isSemanticAutofillEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isTrackFocusEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isViewFocusFixEnabled$annotations()V
    .locals 0

    return-void
.end method
