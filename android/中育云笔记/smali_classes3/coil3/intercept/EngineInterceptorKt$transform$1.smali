.class final Lcoil3/intercept/EngineInterceptorKt$transform$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/intercept/EngineInterceptorKt;->a(Lcoil3/intercept/EngineInterceptor$b;Lw/g;Lw/n;Lcoil3/b;Lcoil3/util/Logger;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "coil3.intercept.EngineInterceptorKt"
    f = "EngineInterceptor.kt"
    l = {
        0x103
    }
    m = "transform"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public synthetic t:Ljava/lang/Object;

.field public u:I


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
    .locals 6

    iput-object p1, p0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->t:Ljava/lang/Object;

    iget p1, p0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->u:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->u:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lcoil3/intercept/EngineInterceptorKt;->a(Lcoil3/intercept/EngineInterceptor$b;Lw/g;Lw/n;Lcoil3/b;Lcoil3/util/Logger;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
