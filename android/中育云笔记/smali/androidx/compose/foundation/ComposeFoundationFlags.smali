.class public final Landroidx/compose/foundation/ComposeFoundationFlags;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I

.field public static DragGesturePickUpEnabled:Z

.field public static final INSTANCE:Landroidx/compose/foundation/ComposeFoundationFlags;

.field public static NewNestedFlingPropagationEnabled:Z

.field public static isDetectTapGesturesImmediateCoroutineDispatchEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/ComposeFoundationFlags;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/foundation/ComposeFoundationFlags;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/foundation/ComposeFoundationFlags;->INSTANCE:Landroidx/compose/foundation/ComposeFoundationFlags;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    sput-boolean v0, Landroidx/compose/foundation/ComposeFoundationFlags;->NewNestedFlingPropagationEnabled:Z

    .line 10
    .line 11
    sput-boolean v0, Landroidx/compose/foundation/ComposeFoundationFlags;->DragGesturePickUpEnabled:Z

    .line 12
    .line 13
    sput-boolean v0, Landroidx/compose/foundation/ComposeFoundationFlags;->isDetectTapGesturesImmediateCoroutineDispatchEnabled:Z

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    sput v0, Landroidx/compose/foundation/ComposeFoundationFlags;->$stable:I

    .line 18
    .line 19
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

.method public static synthetic getDragGesturePickUpEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getNewNestedFlingPropagationEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isDetectTapGesturesImmediateCoroutineDispatchEnabled$annotations()V
    .locals 0

    return-void
.end method
