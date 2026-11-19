.class public final Lae/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae/f;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lhd/q;

.field public final c:Lhd/q;

.field public final d:Lhd/q;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lhd/q;Lhd/q;Lhd/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lae/g;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lae/g;->b:Lhd/q;

    .line 7
    .line 8
    iput-object p3, p0, Lae/g;->c:Lhd/q;

    .line 9
    .line 10
    iput-object p4, p0, Lae/g;->d:Lhd/q;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Lhd/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lae/g;->b:Lhd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lhd/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lae/g;->d:Lhd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Lhd/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lae/g;->c:Lhd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lae/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
