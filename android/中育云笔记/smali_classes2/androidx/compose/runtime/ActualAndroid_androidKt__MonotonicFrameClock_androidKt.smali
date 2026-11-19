.class final synthetic Landroidx/compose/runtime/ActualAndroid_androidKt__MonotonicFrameClock_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DefaultMonotonicFrameClock$delegate:Lqc/d;

.field private static final DisallowDefaultMonotonicFrameClock:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/runtime/ActualAndroid_androidKt__MonotonicFrameClock_androidKt$DefaultMonotonicFrameClock$2;->INSTANCE:Landroidx/compose/runtime/ActualAndroid_androidKt__MonotonicFrameClock_androidKt$DefaultMonotonicFrameClock$2;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroidx/compose/runtime/ActualAndroid_androidKt__MonotonicFrameClock_androidKt;->DefaultMonotonicFrameClock$delegate:Lqc/d;

    .line 8
    .line 9
    return-void
.end method

.method public static final getDefaultMonotonicFrameClock()Landroidx/compose/runtime/MonotonicFrameClock;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/runtime/ActualAndroid_androidKt__MonotonicFrameClock_androidKt;->DefaultMonotonicFrameClock$delegate:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/runtime/MonotonicFrameClock;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic getDefaultMonotonicFrameClock$annotations()V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
