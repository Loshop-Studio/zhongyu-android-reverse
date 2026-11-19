.class public final Landroidx/compose/runtime/RecomposerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final FramePending:Ljava/lang/Object;

.field private static final ProduceAnotherFrame:Ljava/lang/Object;

.field private static final RecomposerCompoundHashKey:I = 0x3e8


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/runtime/RecomposerKt;->ProduceAnotherFrame:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/compose/runtime/RecomposerKt;->FramePending:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public static final synthetic access$getFramePending$p()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/runtime/RecomposerKt;->FramePending:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getProduceAnotherFrame$p()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/runtime/RecomposerKt;->ProduceAnotherFrame:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final withRunningRecomposer(Lhd/q;Lvc/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/q;",
            "Lvc/c<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/runtime/RecomposerKt$withRunningRecomposer$2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Landroidx/compose/runtime/RecomposerKt$withRunningRecomposer$2;-><init>(Lhd/q;Lvc/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1}, Lkotlinx/coroutines/d;->e(Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
