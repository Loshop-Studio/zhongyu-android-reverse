.class public final Lr/g$b;
.super La0/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/g;-><init>(JLr/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lr/g;


# direct methods
.method public constructor <init>(Lr/g;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/g$b;->d:Lr/g;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, La0/q;-><init>(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lr/d$b;

    .line 2
    .line 3
    check-cast p2, Lr/g$a;

    .line 4
    .line 5
    check-cast p3, Lr/g$a;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lr/g$b;->m(Lr/d$b;Lr/g$a;Lr/g$a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 0

    .line 1
    check-cast p1, Lr/d$b;

    .line 2
    .line 3
    check-cast p2, Lr/g$a;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lr/g$b;->n(Lr/d$b;Lr/g$a;)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    return-wide p1
.end method

.method public m(Lr/d$b;Lr/g$a;Lr/g$a;)V
    .locals 6

    .line 1
    iget-object p3, p0, Lr/g$b;->d:Lr/g;

    .line 2
    .line 3
    invoke-static {p3}, Lr/g;->g(Lr/g;)Lr/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p2}, Lr/g$a;->b()Lk/j;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p2}, Lr/g$a;->a()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {p2}, Lr/g$a;->c()J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    move-object v1, p1

    .line 20
    invoke-interface/range {v0 .. v5}, Lr/j;->d(Lr/d$b;Lk/j;Ljava/util/Map;J)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public n(Lr/d$b;Lr/g$a;)J
    .locals 0

    .line 1
    invoke-virtual {p2}, Lr/g$a;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
.end method
