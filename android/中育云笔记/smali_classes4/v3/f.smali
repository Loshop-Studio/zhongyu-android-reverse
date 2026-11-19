.class public final Lv3/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lv3/f;

.field public static b:Lhd/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lv3/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lv3/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv3/f;->a:Lv3/f;

    .line 7
    .line 8
    new-instance v0, Lv3/e;

    .line 9
    .line 10
    invoke-direct {v0}, Lv3/e;-><init>()V

    .line 11
    .line 12
    .line 13
    const v1, -0x599e6e4

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lv3/f;->b:Lhd/p;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Landroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lv3/f;->c(Landroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 8

    .line 1
    and-int/lit8 v0, p1, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    and-int/lit8 v1, p1, 0x1

    .line 10
    .line 11
    invoke-interface {p0, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const/4 v0, -0x1

    .line 24
    const-string v1, "com.friday.main.view.ComposableSingletons$DBActivityKt.lambda$-93972196.<anonymous> (DBActivity.kt:80)"

    .line 25
    .line 26
    const v2, -0x599e6e4

    .line 27
    .line 28
    .line 29
    invoke-static {v2, p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    sget-object p1, Landroidx/compose/material/icons/Icons$Filled;->INSTANCE:Landroidx/compose/material/icons/Icons$Filled;

    .line 33
    .line 34
    invoke-static {p1}, Landroidx/compose/material/icons/filled/FavoriteBorderKt;->getFavoriteBorder(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/16 v6, 0x30

    .line 39
    .line 40
    const/16 v7, 0xc

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    const/4 v2, 0x0

    .line 44
    const-wide/16 v3, 0x0

    .line 45
    .line 46
    move-object v5, p0

    .line 47
    invoke-static/range {v0 .. v7}, Landroidx/compose/material3/IconKt;->Icon-ww6aTOc(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move-object v5, p0

    .line 61
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 65
    .line 66
    return-object p0
.end method


# virtual methods
.method public final b()Lhd/p;
    .locals 1

    .line 1
    sget-object v0, Lv3/f;->b:Lhd/p;

    .line 2
    .line 3
    return-object v0
.end method
