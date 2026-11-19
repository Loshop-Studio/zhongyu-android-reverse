.class public final Lq8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq8/c;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lx7/q;

.field public final c:Lx7/q;

.field public final d:Lx7/q;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lx7/q;Lx7/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lq8/d;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lq8/d;->b:Lx7/q;

    .line 4
    iput-object p3, p0, Lq8/d;->c:Lx7/q;

    .line 5
    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->c()Lx7/q;

    move-result-object p1

    iput-object p1, p0, Lq8/d;->d:Lx7/q;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lx7/q;Lx7/q;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lq8/d;-><init>(Ljava/lang/Object;Lx7/q;Lx7/q;)V

    return-void
.end method


# virtual methods
.method public a()Lx7/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lq8/d;->b:Lx7/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lx7/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lq8/d;->c:Lx7/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Lx7/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lq8/d;->d:Lx7/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lq8/d;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
