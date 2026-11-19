.class public final Lpd/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpd/g;


# instance fields
.field public final a:Lpd/g;

.field public final b:Lhd/l;


# direct methods
.method public constructor <init>(Lpd/g;Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "sequence"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "transformer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lpd/u;->a:Lpd/g;

    .line 15
    .line 16
    iput-object p2, p0, Lpd/u;->b:Lhd/l;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic c(Lpd/u;)Lpd/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lpd/u;->a:Lpd/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lpd/u;)Lhd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lpd/u;->b:Lhd/l;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lpd/u$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lpd/u$a;-><init>(Lpd/u;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
