.class public final Landroidx/compose/foundation/layout/Arrangement;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Immutable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/layout/Arrangement$Absolute;,
        Landroidx/compose/foundation/layout/Arrangement$Horizontal;,
        Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;,
        Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;,
        Landroidx/compose/foundation/layout/Arrangement$Vertical;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0005EFGHIB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020$H\u0007J-\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u0008.J%\u0010/\u001a\u00020&2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00080J-\u00101\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00082J-\u00103\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00084J-\u00105\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00086J-\u00107\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00088J\u001d\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020;H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008<\u0010=J%\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020;2\u0006\u0010\"\u001a\u00020#H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008>\u0010?J%\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020;2\u0006\u0010\"\u001a\u00020$H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008>\u0010@J/\u0010A\u001a\u00020&*\u00020*2\u0006\u0010B\u001a\u00020-2\u0018\u0010C\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&0DH\u0082\u0008R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0005\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\n\u0010\u0002\u001a\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000f\u0010\u0002\u001a\u0004\u0008\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0013\u0010\u0002\u001a\u0004\u0008\u0014\u0010\u000cR\u001c\u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0016\u0010\u0002\u001a\u0004\u0008\u0017\u0010\u000cR\u001c\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0019\u0010\u0002\u001a\u0004\u0008\u001a\u0010\u000cR\u001c\u0010\u001b\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001c\u0010\u0002\u001a\u0004\u0008\u001d\u0010\u0011R\u001c\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001f\u0010\u0002\u001a\u0004\u0008 \u0010\u0007\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006J"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/Arrangement;",
        "",
        "()V",
        "Bottom",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "getBottom$annotations",
        "getBottom",
        "()Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "Center",
        "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;",
        "getCenter$annotations",
        "getCenter",
        "()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;",
        "End",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "getEnd$annotations",
        "getEnd",
        "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "SpaceAround",
        "getSpaceAround$annotations",
        "getSpaceAround",
        "SpaceBetween",
        "getSpaceBetween$annotations",
        "getSpaceBetween",
        "SpaceEvenly",
        "getSpaceEvenly$annotations",
        "getSpaceEvenly",
        "Start",
        "getStart$annotations",
        "getStart",
        "Top",
        "getTop$annotations",
        "getTop",
        "aligned",
        "alignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "placeCenter",
        "",
        "totalSize",
        "",
        "size",
        "",
        "outPosition",
        "reverseInput",
        "",
        "placeCenter$foundation_layout_release",
        "placeLeftOrTop",
        "placeLeftOrTop$foundation_layout_release",
        "placeRightOrBottom",
        "placeRightOrBottom$foundation_layout_release",
        "placeSpaceAround",
        "placeSpaceAround$foundation_layout_release",
        "placeSpaceBetween",
        "placeSpaceBetween$foundation_layout_release",
        "placeSpaceEvenly",
        "placeSpaceEvenly$foundation_layout_release",
        "spacedBy",
        "space",
        "Landroidx/compose/ui/unit/Dp;",
        "spacedBy-0680j_4",
        "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;",
        "spacedBy-D5KLDUw",
        "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "forEachIndexed",
        "reversed",
        "action",
        "Lkotlin/Function2;",
        "Absolute",
        "Horizontal",
        "HorizontalOrVertical",
        "SpacedAligned",
        "Vertical",
        "foundation-layout_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,709:1\n700#1,2:715\n703#1,5:720\n700#1,2:725\n703#1,5:730\n700#1,2:738\n703#1,5:743\n700#1,2:751\n703#1,5:756\n700#1,2:764\n703#1,5:769\n700#1,2:777\n703#1,5:782\n155#2:710\n155#2:711\n13032#3,3:712\n13674#3,3:717\n13674#3,3:727\n13032#3,3:735\n13674#3,3:740\n13032#3,3:748\n13674#3,3:753\n13032#3,3:761\n13674#3,3:766\n13032#3,3:774\n13674#3,3:779\n13674#3,3:787\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n618#1:715,2\n618#1:720,5\n626#1:725,2\n626#1:730,5\n640#1:738,2\n640#1:743,5\n655#1:751,2\n655#1:756,5\n674#1:764,2\n674#1:769,5\n693#1:777,2\n693#1:782,5\n354#1:710\n366#1:711\n616#1:712,3\n618#1:717,3\n626#1:727,3\n638#1:735,3\n640#1:740,3\n652#1:748,3\n655#1:753,3\n667#1:761,3\n674#1:766,3\n686#1:774,3\n693#1:779,3\n701#1:787,3\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field private static final Bottom:Landroidx/compose/foundation/layout/Arrangement$Vertical;

.field private static final Center:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

.field private static final End:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

.field public static final INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

.field private static final SpaceAround:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

.field private static final SpaceBetween:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

.field private static final SpaceEvenly:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

.field private static final Start:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

.field private static final Top:Landroidx/compose/foundation/layout/Arrangement$Vertical;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 7
    .line 8
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$Start$1;

    .line 9
    .line 10
    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$Start$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->Start:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 14
    .line 15
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$End$1;

    .line 16
    .line 17
    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$End$1;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->End:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 21
    .line 22
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$Top$1;

    .line 23
    .line 24
    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$Top$1;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->Top:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 28
    .line 29
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$Bottom$1;

    .line 30
    .line 31
    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$Bottom$1;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->Bottom:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 35
    .line 36
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$Center$1;

    .line 37
    .line 38
    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$Center$1;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->Center:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 42
    .line 43
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1;

    .line 44
    .line 45
    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1;-><init>()V

    .line 46
    .line 47
    .line 48
    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceEvenly:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 49
    .line 50
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpaceBetween$1;

    .line 51
    .line 52
    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$SpaceBetween$1;-><init>()V

    .line 53
    .line 54
    .line 55
    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceBetween:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 56
    .line 57
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpaceAround$1;

    .line 58
    .line 59
    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$SpaceAround$1;-><init>()V

    .line 60
    .line 61
    .line 62
    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceAround:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 63
    .line 64
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final forEachIndexed([IZLkotlin/jvm/functions/Function2;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([IZ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    array-length p2, p1

    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    if-ge v0, p2, :cond_1

    .line 7
    .line 8
    aget v2, p1, v0

    .line 9
    .line 10
    add-int/lit8 v3, v1, 0x1

    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {p3, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    move v1, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    array-length p2, p1

    .line 28
    add-int/lit8 p2, p2, -0x1

    .line 29
    .line 30
    :goto_1
    const/4 v0, -0x1

    .line 31
    if-ge v0, p2, :cond_1

    .line 32
    .line 33
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    aget v1, p1, p2

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {p3, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    add-int/lit8 p2, p2, -0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    return-void
.end method

.method public static synthetic getBottom$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getCenter$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getEnd$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getSpaceAround$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getSpaceBetween$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getSpaceEvenly$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getStart$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getTop$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method


# virtual methods
.method public final aligned(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .locals 4
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    const-string v0, "alignment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    const/4 v1, 0x0

    int-to-float v1, v1

    .line 2
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 3
    new-instance v2, Landroidx/compose/foundation/layout/Arrangement$aligned$1;

    invoke-direct {v2, p1}, Landroidx/compose/foundation/layout/Arrangement$aligned$1;-><init>(Landroidx/compose/ui/Alignment$Horizontal;)V

    const/4 p1, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2, p1}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final aligned(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .locals 4
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    const-string v0, "alignment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    const/4 v1, 0x0

    int-to-float v2, v1

    .line 5
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 6
    new-instance v3, Landroidx/compose/foundation/layout/Arrangement$aligned$2;

    invoke-direct {v3, p1}, Landroidx/compose/foundation/layout/Arrangement$aligned$2;-><init>(Landroidx/compose/ui/Alignment$Vertical;)V

    const/4 p1, 0x0

    invoke-direct {v0, v2, v1, v3, p1}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final getBottom()Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->Bottom:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->Center:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEnd()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->End:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSpaceAround()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceAround:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSpaceBetween()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceBetween:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSpaceEvenly()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceEvenly:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->Start:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->Top:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 2
    .line 3
    return-object v0
.end method

.method public final placeCenter$foundation_layout_release(I[I[IZ)V
    .locals 5

    .line 1
    const-string/jumbo v0, "size"

    .line 2
    .line 3
    .line 4
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "outPosition"

    .line 8
    .line 9
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    array-length v0, p2

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v2, v0, :cond_0

    .line 17
    .line 18
    aget v4, p2, v2

    .line 19
    .line 20
    add-int/2addr v3, v4

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sub-int/2addr p1, v3

    .line 25
    int-to-float p1, p1

    .line 26
    const/4 v0, 0x2

    .line 27
    int-to-float v0, v0

    .line 28
    div-float/2addr p1, v0

    .line 29
    if-nez p4, :cond_1

    .line 30
    .line 31
    array-length p4, p2

    .line 32
    move v0, v1

    .line 33
    :goto_1
    if-ge v1, p4, :cond_2

    .line 34
    .line 35
    aget v2, p2, v1

    .line 36
    .line 37
    add-int/lit8 v3, v0, 0x1

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    aput v4, p3, v0

    .line 44
    .line 45
    int-to-float v0, v2

    .line 46
    add-float/2addr p1, v0

    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    move v0, v3

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    array-length p4, p2

    .line 52
    add-int/lit8 p4, p4, -0x1

    .line 53
    .line 54
    :goto_2
    const/4 v0, -0x1

    .line 55
    if-ge v0, p4, :cond_2

    .line 56
    .line 57
    aget v0, p2, p4

    .line 58
    .line 59
    invoke-static {p1}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    aput v1, p3, p4

    .line 64
    .line 65
    int-to-float v0, v0

    .line 66
    add-float/2addr p1, v0

    .line 67
    add-int/lit8 p4, p4, -0x1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    return-void
.end method

.method public final placeLeftOrTop$foundation_layout_release([I[IZ)V
    .locals 5

    .line 1
    const-string/jumbo v0, "size"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "outPosition"

    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-nez p3, :cond_0

    .line 14
    .line 15
    array-length p3, p1

    .line 16
    move v1, v0

    .line 17
    move v2, v1

    .line 18
    :goto_0
    if-ge v0, p3, :cond_1

    .line 19
    .line 20
    aget v3, p1, v0

    .line 21
    .line 22
    add-int/lit8 v4, v1, 0x1

    .line 23
    .line 24
    aput v2, p2, v1

    .line 25
    .line 26
    add-int/2addr v2, v3

    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    move v1, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    array-length p3, p1

    .line 32
    add-int/lit8 p3, p3, -0x1

    .line 33
    .line 34
    :goto_1
    const/4 v1, -0x1

    .line 35
    if-ge v1, p3, :cond_1

    .line 36
    .line 37
    aget v1, p1, p3

    .line 38
    .line 39
    aput v0, p2, p3

    .line 40
    .line 41
    add-int/2addr v0, v1

    .line 42
    add-int/lit8 p3, p3, -0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    return-void
.end method

.method public final placeRightOrBottom$foundation_layout_release(I[I[IZ)V
    .locals 5

    .line 1
    const-string/jumbo v0, "size"

    .line 2
    .line 3
    .line 4
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "outPosition"

    .line 8
    .line 9
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    array-length v0, p2

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v2, v0, :cond_0

    .line 17
    .line 18
    aget v4, p2, v2

    .line 19
    .line 20
    add-int/2addr v3, v4

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sub-int/2addr p1, v3

    .line 25
    if-nez p4, :cond_1

    .line 26
    .line 27
    array-length p4, p2

    .line 28
    move v0, v1

    .line 29
    :goto_1
    if-ge v1, p4, :cond_2

    .line 30
    .line 31
    aget v2, p2, v1

    .line 32
    .line 33
    add-int/lit8 v3, v0, 0x1

    .line 34
    .line 35
    aput p1, p3, v0

    .line 36
    .line 37
    add-int/2addr p1, v2

    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    move v0, v3

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    array-length p4, p2

    .line 43
    add-int/lit8 p4, p4, -0x1

    .line 44
    .line 45
    :goto_2
    const/4 v0, -0x1

    .line 46
    if-ge v0, p4, :cond_2

    .line 47
    .line 48
    aget v0, p2, p4

    .line 49
    .line 50
    aput p1, p3, p4

    .line 51
    .line 52
    add-int/2addr p1, v0

    .line 53
    add-int/lit8 p4, p4, -0x1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    return-void
.end method

.method public final placeSpaceAround$foundation_layout_release(I[I[IZ)V
    .locals 6

    .line 1
    const-string/jumbo v0, "size"

    .line 2
    .line 3
    .line 4
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "outPosition"

    .line 8
    .line 9
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    array-length v0, p2

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v2, v0, :cond_0

    .line 17
    .line 18
    aget v4, p2, v2

    .line 19
    .line 20
    add-int/2addr v3, v4

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    array-length v0, p2

    .line 25
    const/4 v2, 0x1

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    move v0, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v1

    .line 31
    :goto_1
    xor-int/2addr v0, v2

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    sub-int/2addr p1, v3

    .line 35
    int-to-float p1, p1

    .line 36
    array-length v0, p2

    .line 37
    int-to-float v0, v0

    .line 38
    div-float/2addr p1, v0

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    const/4 p1, 0x0

    .line 41
    :goto_2
    const/4 v0, 0x2

    .line 42
    int-to-float v0, v0

    .line 43
    div-float v0, p1, v0

    .line 44
    .line 45
    if-nez p4, :cond_3

    .line 46
    .line 47
    array-length p4, p2

    .line 48
    move v2, v1

    .line 49
    :goto_3
    if-ge v1, p4, :cond_4

    .line 50
    .line 51
    aget v3, p2, v1

    .line 52
    .line 53
    add-int/lit8 v4, v2, 0x1

    .line 54
    .line 55
    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    aput v5, p3, v2

    .line 60
    .line 61
    int-to-float v2, v3

    .line 62
    add-float/2addr v2, p1

    .line 63
    add-float/2addr v0, v2

    .line 64
    add-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    move v2, v4

    .line 67
    goto :goto_3

    .line 68
    :cond_3
    array-length p4, p2

    .line 69
    sub-int/2addr p4, v2

    .line 70
    :goto_4
    const/4 v1, -0x1

    .line 71
    if-ge v1, p4, :cond_4

    .line 72
    .line 73
    aget v1, p2, p4

    .line 74
    .line 75
    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    aput v2, p3, p4

    .line 80
    .line 81
    int-to-float v1, v1

    .line 82
    add-float/2addr v1, p1

    .line 83
    add-float/2addr v0, v1

    .line 84
    add-int/lit8 p4, p4, -0x1

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_4
    return-void
.end method

.method public final placeSpaceBetween$foundation_layout_release(I[I[IZ)V
    .locals 6

    .line 1
    const-string/jumbo v0, "size"

    .line 2
    .line 3
    .line 4
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "outPosition"

    .line 8
    .line 9
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    array-length v0, p2

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v2, v0, :cond_0

    .line 17
    .line 18
    aget v4, p2, v2

    .line 19
    .line 20
    add-int/2addr v3, v4

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    array-length v0, p2

    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v4, 0x1

    .line 27
    if-le v0, v4, :cond_1

    .line 28
    .line 29
    sub-int/2addr p1, v3

    .line 30
    int-to-float p1, p1

    .line 31
    array-length v0, p2

    .line 32
    sub-int/2addr v0, v4

    .line 33
    int-to-float v0, v0

    .line 34
    div-float/2addr p1, v0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move p1, v2

    .line 37
    :goto_1
    if-nez p4, :cond_2

    .line 38
    .line 39
    array-length p4, p2

    .line 40
    move v0, v1

    .line 41
    :goto_2
    if-ge v1, p4, :cond_3

    .line 42
    .line 43
    aget v3, p2, v1

    .line 44
    .line 45
    add-int/lit8 v4, v0, 0x1

    .line 46
    .line 47
    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    aput v5, p3, v0

    .line 52
    .line 53
    int-to-float v0, v3

    .line 54
    add-float/2addr v0, p1

    .line 55
    add-float/2addr v2, v0

    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    move v0, v4

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    array-length p4, p2

    .line 61
    sub-int/2addr p4, v4

    .line 62
    :goto_3
    const/4 v0, -0x1

    .line 63
    if-ge v0, p4, :cond_3

    .line 64
    .line 65
    aget v0, p2, p4

    .line 66
    .line 67
    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    aput v1, p3, p4

    .line 72
    .line 73
    int-to-float v0, v0

    .line 74
    add-float/2addr v0, p1

    .line 75
    add-float/2addr v2, v0

    .line 76
    add-int/lit8 p4, p4, -0x1

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_3
    return-void
.end method

.method public final placeSpaceEvenly$foundation_layout_release(I[I[IZ)V
    .locals 6

    .line 1
    const-string/jumbo v0, "size"

    .line 2
    .line 3
    .line 4
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "outPosition"

    .line 8
    .line 9
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    array-length v0, p2

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v2, v0, :cond_0

    .line 17
    .line 18
    aget v4, p2, v2

    .line 19
    .line 20
    add-int/2addr v3, v4

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sub-int/2addr p1, v3

    .line 25
    int-to-float p1, p1

    .line 26
    array-length v0, p2

    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    int-to-float v0, v0

    .line 30
    div-float/2addr p1, v0

    .line 31
    if-nez p4, :cond_1

    .line 32
    .line 33
    array-length p4, p2

    .line 34
    move v2, p1

    .line 35
    move v0, v1

    .line 36
    :goto_1
    if-ge v1, p4, :cond_2

    .line 37
    .line 38
    aget v3, p2, v1

    .line 39
    .line 40
    add-int/lit8 v4, v0, 0x1

    .line 41
    .line 42
    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    aput v5, p3, v0

    .line 47
    .line 48
    int-to-float v0, v3

    .line 49
    add-float/2addr v0, p1

    .line 50
    add-float/2addr v2, v0

    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    move v0, v4

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    array-length p4, p2

    .line 56
    add-int/lit8 p4, p4, -0x1

    .line 57
    .line 58
    move v0, p1

    .line 59
    :goto_2
    const/4 v1, -0x1

    .line 60
    if-ge v1, p4, :cond_2

    .line 61
    .line 62
    aget v1, p2, p4

    .line 63
    .line 64
    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    aput v2, p3, p4

    .line 69
    .line 70
    int-to-float v1, v1

    .line 71
    add-float/2addr v1, p1

    .line 72
    add-float/2addr v0, v1

    .line 73
    add-int/lit8 p4, p4, -0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    return-void
.end method

.method public final spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 4
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/foundation/layout/Arrangement$spacedBy$1;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement$spacedBy$1;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, p1, v3, v1, v2}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final spacedBy-D5KLDUw(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .locals 3
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    const-string v0, "alignment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    new-instance v1, Landroidx/compose/foundation/layout/Arrangement$spacedBy$2;

    invoke-direct {v1, p2}, Landroidx/compose/foundation/layout/Arrangement$spacedBy$2;-><init>(Landroidx/compose/ui/Alignment$Horizontal;)V

    const/4 p2, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p1, v2, v1, p2}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final spacedBy-D5KLDUw(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .locals 3
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    const-string v0, "alignment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    new-instance v1, Landroidx/compose/foundation/layout/Arrangement$spacedBy$3;

    invoke-direct {v1, p2}, Landroidx/compose/foundation/layout/Arrangement$spacedBy$3;-><init>(Landroidx/compose/ui/Alignment$Vertical;)V

    const/4 p2, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, v1, p2}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
