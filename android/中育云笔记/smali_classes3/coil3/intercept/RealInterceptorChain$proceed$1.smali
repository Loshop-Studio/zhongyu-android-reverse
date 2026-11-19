.class final Lcoil3/intercept/RealInterceptorChain$proceed$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/intercept/RealInterceptorChain;->g(Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "coil3.intercept.RealInterceptorChain"
    f = "RealInterceptorChain.kt"
    l = {
        0x1f
    }
    m = "proceed"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcoil3/intercept/RealInterceptorChain;

.field public g:I


# direct methods
.method public constructor <init>(Lcoil3/intercept/RealInterceptorChain;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/intercept/RealInterceptorChain$proceed$1;->f:Lcoil3/intercept/RealInterceptorChain;

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

    iput-object p1, p0, Lcoil3/intercept/RealInterceptorChain$proceed$1;->e:Ljava/lang/Object;

    iget p1, p0, Lcoil3/intercept/RealInterceptorChain$proceed$1;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcoil3/intercept/RealInterceptorChain$proceed$1;->g:I

    iget-object p1, p0, Lcoil3/intercept/RealInterceptorChain$proceed$1;->f:Lcoil3/intercept/RealInterceptorChain;

    invoke-virtual {p1, p0}, Lcoil3/intercept/RealInterceptorChain;->g(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
