.class final Lcoil3/intercept/EngineInterceptor$intercept$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/intercept/EngineInterceptor;->a(Lcoil3/intercept/a$a;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "coil3.intercept.EngineInterceptor"
    f = "EngineInterceptor.kt"
    l = {
        0x4b
    }
    m = "intercept"
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

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lcoil3/intercept/EngineInterceptor;

.field public o:I


# direct methods
.method public constructor <init>(Lcoil3/intercept/EngineInterceptor;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/intercept/EngineInterceptor$intercept$1;->n:Lcoil3/intercept/EngineInterceptor;

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
    .locals 1

    iput-object p1, p0, Lcoil3/intercept/EngineInterceptor$intercept$1;->m:Ljava/lang/Object;

    iget p1, p0, Lcoil3/intercept/EngineInterceptor$intercept$1;->o:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcoil3/intercept/EngineInterceptor$intercept$1;->o:I

    iget-object p1, p0, Lcoil3/intercept/EngineInterceptor$intercept$1;->n:Lcoil3/intercept/EngineInterceptor;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcoil3/intercept/EngineInterceptor;->a(Lcoil3/intercept/a$a;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
