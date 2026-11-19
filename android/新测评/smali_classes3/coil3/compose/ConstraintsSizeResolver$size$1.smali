.class final Lcoil3/compose/ConstraintsSizeResolver$size$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/compose/ConstraintsSizeResolver;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "coil3.compose.ConstraintsSizeResolver"
    f = "ConstraintsSizeResolver.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x4d
    }
    m = "size"
    n = {
        "continuation",
        "$i$f$suspendCancellableCoroutine"
    }
    s = {
        "L$0",
        "I$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcoil3/compose/ConstraintsSizeResolver;

.field public e:I


# direct methods
.method public constructor <init>(Lcoil3/compose/ConstraintsSizeResolver;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcoil3/compose/ConstraintsSizeResolver$size$1;->d:Lcoil3/compose/ConstraintsSizeResolver;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcoil3/compose/ConstraintsSizeResolver$size$1;->c:Ljava/lang/Object;

    iget p1, p0, Lcoil3/compose/ConstraintsSizeResolver$size$1;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcoil3/compose/ConstraintsSizeResolver$size$1;->e:I

    iget-object p1, p0, Lcoil3/compose/ConstraintsSizeResolver$size$1;->d:Lcoil3/compose/ConstraintsSizeResolver;

    invoke-virtual {p1, p0}, Lcoil3/compose/ConstraintsSizeResolver;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
