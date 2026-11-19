.class final Landroidx/compose/ui/platform/AndroidViewConfigurationApi34;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x22
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/ui/platform/AndroidViewConfigurationApi34;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/AndroidViewConfigurationApi34;

    invoke-direct {v0}, Landroidx/compose/ui/platform/AndroidViewConfigurationApi34;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/AndroidViewConfigurationApi34;->INSTANCE:Landroidx/compose/ui/platform/AndroidViewConfigurationApi34;

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
.method public final getScaledHandwritingGestureLineMargin(Landroid/view/ViewConfiguration;)F
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/platform/t;->a(Landroid/view/ViewConfiguration;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    return p1
.end method

.method public final getScaledHandwritingSlop(Landroid/view/ViewConfiguration;)F
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/platform/s;->a(Landroid/view/ViewConfiguration;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    return p1
.end method
