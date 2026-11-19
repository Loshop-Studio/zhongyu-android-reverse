.class final Lcoil3/RealImageLoader$execute$3;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/RealImageLoader;->g(Lw/g;ILvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "coil3.RealImageLoader"
    f = "RealImageLoader.kt"
    l = {
        0x75,
        0x81,
        0x85
    }
    m = "execute"
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

.field public final synthetic l:Lcoil3/RealImageLoader;

.field public m:I


# direct methods
.method public constructor <init>(Lcoil3/RealImageLoader;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/RealImageLoader$execute$3;->l:Lcoil3/RealImageLoader;

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
    .locals 2

    iput-object p1, p0, Lcoil3/RealImageLoader$execute$3;->k:Ljava/lang/Object;

    iget p1, p0, Lcoil3/RealImageLoader$execute$3;->m:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcoil3/RealImageLoader$execute$3;->m:I

    iget-object p1, p0, Lcoil3/RealImageLoader$execute$3;->l:Lcoil3/RealImageLoader;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lcoil3/RealImageLoader;->f(Lcoil3/RealImageLoader;Lw/g;ILvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
