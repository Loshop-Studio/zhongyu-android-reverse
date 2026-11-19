.class public final Lae/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae/d;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lhd/q;

.field public final c:Lhd/q;

.field public final d:Lhd/q;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lhd/q;Lhd/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lae/e;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lae/e;->b:Lhd/q;

    .line 4
    iput-object p3, p0, Lae/e;->c:Lhd/q;

    .line 5
    invoke-static {}, Lae/m;->c()Lhd/q;

    move-result-object p1

    iput-object p1, p0, Lae/e;->d:Lhd/q;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lhd/q;Lhd/q;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lae/e;-><init>(Ljava/lang/Object;Lhd/q;Lhd/q;)V

    return-void
.end method


# virtual methods
.method public a()Lhd/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lae/e;->b:Lhd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lhd/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lae/e;->c:Lhd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Lhd/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lae/e;->d:Lhd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lae/e;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
