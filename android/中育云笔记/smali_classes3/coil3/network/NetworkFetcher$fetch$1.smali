.class final Lcoil3/network/NetworkFetcher$fetch$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/network/NetworkFetcher;->a(Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "coil3.network.NetworkFetcher"
    f = "NetworkFetcher.kt"
    l = {
        0x3d,
        0x4a,
        0x66
    }
    m = "fetch"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lcoil3/network/NetworkFetcher;

.field public j:I


# direct methods
.method public constructor <init>(Lcoil3/network/NetworkFetcher;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$1;->i:Lcoil3/network/NetworkFetcher;

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

    iput-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$1;->h:Ljava/lang/Object;

    iget p1, p0, Lcoil3/network/NetworkFetcher$fetch$1;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcoil3/network/NetworkFetcher$fetch$1;->j:I

    iget-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$1;->i:Lcoil3/network/NetworkFetcher;

    invoke-virtual {p1, p0}, Lcoil3/network/NetworkFetcher;->a(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
