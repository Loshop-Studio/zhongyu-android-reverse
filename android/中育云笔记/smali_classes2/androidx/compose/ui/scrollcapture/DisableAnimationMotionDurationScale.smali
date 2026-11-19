.class final Landroidx/compose/ui/scrollcapture/DisableAnimationMotionDurationScale;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/MotionDurationScale;


# static fields
.field public static final INSTANCE:Landroidx/compose/ui/scrollcapture/DisableAnimationMotionDurationScale;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/scrollcapture/DisableAnimationMotionDurationScale;

    invoke-direct {v0}, Landroidx/compose/ui/scrollcapture/DisableAnimationMotionDurationScale;-><init>()V

    sput-object v0, Landroidx/compose/ui/scrollcapture/DisableAnimationMotionDurationScale;->INSTANCE:Landroidx/compose/ui/scrollcapture/DisableAnimationMotionDurationScale;

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
.method public fold(Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lhd/p;",
            ")TR;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/MotionDurationScale$DefaultImpls;->fold(Landroidx/compose/ui/MotionDurationScale;Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lkotlin/coroutines/d$b;",
            ">(",
            "Lkotlin/coroutines/d$c;",
            ")TE;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/ui/MotionDurationScale$DefaultImpls;->get(Landroidx/compose/ui/MotionDurationScale;Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getScaleFactor()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public minusKey(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d$c;",
            ")",
            "Lkotlin/coroutines/d;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/ui/MotionDurationScale$DefaultImpls;->minusKey(Landroidx/compose/ui/MotionDurationScale;Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public plus(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/ui/MotionDurationScale$DefaultImpls;->plus(Landroidx/compose/ui/MotionDurationScale;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
