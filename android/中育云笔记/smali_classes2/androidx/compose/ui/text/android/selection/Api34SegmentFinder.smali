.class public final Landroidx/compose/ui/text/android/selection/Api34SegmentFinder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x22
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/ui/text/android/selection/Api34SegmentFinder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/text/android/selection/Api34SegmentFinder;

    invoke-direct {v0}, Landroidx/compose/ui/text/android/selection/Api34SegmentFinder;-><init>()V

    sput-object v0, Landroidx/compose/ui/text/android/selection/Api34SegmentFinder;->INSTANCE:Landroidx/compose/ui/text/android/selection/Api34SegmentFinder;

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
.method public final toAndroidSegmentFinder$ui_text_release(Landroidx/compose/ui/text/android/selection/SegmentFinder;)Landroid/text/SegmentFinder;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/text/android/selection/Api34SegmentFinder$toAndroidSegmentFinder$1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/compose/ui/text/android/selection/Api34SegmentFinder$toAndroidSegmentFinder$1;-><init>(Landroidx/compose/ui/text/android/selection/SegmentFinder;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/compose/ui/text/android/a;->a(Ljava/lang/Object;)Landroid/text/SegmentFinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method
