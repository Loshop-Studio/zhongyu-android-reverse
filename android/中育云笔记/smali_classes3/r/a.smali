.class public final Lr/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/i;


# instance fields
.field public final a:Lr/j;

.field public b:J


# direct methods
.method public constructor <init>(Lr/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/a;->a:Lr/j;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lr/d$b;)Lr/d$c;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public b(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lr/a;->b:J

    .line 2
    .line 3
    return-void
.end method

.method public c()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
.end method

.method public clear()V
    .locals 0

    .line 1
    return-void
.end method

.method public d(Lr/d$b;Lk/j;Ljava/util/Map;J)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr/a;->a:Lr/j;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-wide v4, p4

    .line 7
    invoke-interface/range {v0 .. v5}, Lr/j;->d(Lr/d$b;Lk/j;Ljava/util/Map;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public f(Lr/d$b;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public getSize()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
.end method
