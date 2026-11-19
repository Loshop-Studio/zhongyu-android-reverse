.class final Lcoil3/util/LifecyclesKt$awaitStarted$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/util/LifecyclesKt;->a(Landroidx/lifecycle/Lifecycle;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "coil3.util.LifecyclesKt"
    f = "lifecycles.kt"
    l = {
        0x2a
    }
    m = "awaitStarted"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public g:I


# direct methods
.method public constructor <init>(Lvc/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcoil3/util/LifecyclesKt$awaitStarted$1;->f:Ljava/lang/Object;

    iget p1, p0, Lcoil3/util/LifecyclesKt$awaitStarted$1;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcoil3/util/LifecyclesKt$awaitStarted$1;->g:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lcoil3/util/LifecyclesKt;->a(Landroidx/lifecycle/Lifecycle;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
