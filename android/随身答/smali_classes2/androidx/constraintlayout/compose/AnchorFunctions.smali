.class public final Landroidx/constraintlayout/compose/AnchorFunctions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/AnchorFunctions;",
        "",
        "()V",
        "horizontalAnchorIndexToAnchorName",
        "",
        "index",
        "",
        "verticalAnchorIndexToAnchorName",
        "constraintlayout-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/constraintlayout/compose/AnchorFunctions;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/constraintlayout/compose/AnchorFunctions;

    invoke-direct {v0}, Landroidx/constraintlayout/compose/AnchorFunctions;-><init>()V

    sput-object v0, Landroidx/constraintlayout/compose/AnchorFunctions;->INSTANCE:Landroidx/constraintlayout/compose/AnchorFunctions;

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
.method public final horizontalAnchorIndexToAnchorName(I)Ljava/lang/String;
    .locals 2

    .line 1
    const-string/jumbo v0, "top"

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-eq p1, v1, :cond_0

    .line 8
    .line 9
    const-string p1, "CCL"

    .line 10
    .line 11
    const-string v1, "horizontalAnchorIndexToAnchorName: Unknown horizontal index"

    .line 12
    .line 13
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    const-string p1, "bottom"

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_1
    return-object v0
.end method

.method public final verticalAnchorIndexToAnchorName(I)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, -0x2

    .line 2
    const-string/jumbo v1, "start"

    .line 3
    .line 4
    .line 5
    if-eq p1, v0, :cond_3

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-eq p1, v0, :cond_2

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    const-string p1, "CCL"

    .line 16
    .line 17
    const-string/jumbo v0, "verticalAnchorIndexToAnchorName: Unknown vertical index"

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_0
    const-string/jumbo p1, "right"

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    const-string p1, "left"

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_2
    const-string p1, "end"

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_3
    return-object v1
.end method
