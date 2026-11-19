.class final Lcoil3/network/NetworkFetcher$writeToDiskCache$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/network/NetworkFetcher;->r(Lcoil3/disk/a$c;Ls/l;Ls/j;Ls/l;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "coil3.network.NetworkFetcher"
    f = "NetworkFetcher.kt"
    l = {
        0x8a,
        0x99
    }
    m = "writeToDiskCache"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lcoil3/network/NetworkFetcher;

.field public l:I


# direct methods
.method public constructor <init>(Lcoil3/network/NetworkFetcher;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->k:Lcoil3/network/NetworkFetcher;

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
    .locals 6

    iput-object p1, p0, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->j:Ljava/lang/Object;

    iget p1, p0, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->l:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->l:I

    iget-object v0, p0, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->k:Lcoil3/network/NetworkFetcher;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lcoil3/network/NetworkFetcher;->g(Lcoil3/network/NetworkFetcher;Lcoil3/disk/a$c;Ls/l;Ls/j;Ls/l;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
