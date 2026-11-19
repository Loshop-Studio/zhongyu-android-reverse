.class final Lcoil3/intercept/EngineInterceptor$fetch$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/intercept/EngineInterceptor;->i(Lcoil3/a;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "coil3.intercept.EngineInterceptor"
    f = "EngineInterceptor.kt"
    l = {
        0xa9
    }
    m = "fetch"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:I

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lcoil3/intercept/EngineInterceptor;

.field public m:I


# direct methods
.method public constructor <init>(Lcoil3/intercept/EngineInterceptor;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/intercept/EngineInterceptor$fetch$1;->l:Lcoil3/intercept/EngineInterceptor;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lcoil3/intercept/EngineInterceptor$fetch$1;->k:Ljava/lang/Object;

    iget p1, p0, Lcoil3/intercept/EngineInterceptor$fetch$1;->m:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcoil3/intercept/EngineInterceptor$fetch$1;->m:I

    iget-object v0, p0, Lcoil3/intercept/EngineInterceptor$fetch$1;->l:Lcoil3/intercept/EngineInterceptor;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lcoil3/intercept/EngineInterceptor;->d(Lcoil3/intercept/EngineInterceptor;Lcoil3/a;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
