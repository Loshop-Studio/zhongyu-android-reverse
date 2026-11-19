.class public final Lt1/g$d;
.super Lt1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt1/g$d$a;
    }
.end annotation


# instance fields
.field public final a:Lt1/g$f;

.field public final b:Lt1/g$d;

.field public c:Lm2/a;


# direct methods
.method public constructor <init>(Lt1/g$f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lt1/c;-><init>()V

    .line 3
    iput-object p0, p0, Lt1/g$d;->b:Lt1/g$d;

    .line 4
    iput-object p1, p0, Lt1/g$d;->a:Lt1/g$f;

    .line 5
    invoke-virtual {p0}, Lt1/g$d;->c()V

    return-void
.end method

.method public synthetic constructor <init>(Lt1/g$f;Lt1/j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lt1/g$d;-><init>(Lt1/g$f;)V

    return-void
.end method


# virtual methods
.method public a()Ld2/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/g$d;->c:Lm2/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lm2/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld2/a;

    .line 8
    .line 9
    return-object v0
.end method

.method public b()Lg2/a;
    .locals 4

    .line 1
    new-instance v0, Lt1/g$a;

    .line 2
    .line 3
    iget-object v1, p0, Lt1/g$d;->a:Lt1/g$f;

    .line 4
    .line 5
    iget-object v2, p0, Lt1/g$d;->b:Lt1/g$d;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lt1/g$a;-><init>(Lt1/g$f;Lt1/g$d;Lt1/f;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final c()V
    .locals 4

    .line 1
    new-instance v0, Lt1/g$d$a;

    .line 2
    .line 3
    iget-object v1, p0, Lt1/g$d;->a:Lt1/g$f;

    .line 4
    .line 5
    iget-object v2, p0, Lt1/g$d;->b:Lt1/g$d;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lt1/g$d$a;-><init>(Lt1/g$f;Lt1/g$d;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lk2/a;->a(Lm2/a;)Lm2/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lt1/g$d;->c:Lm2/a;

    .line 16
    .line 17
    return-void
.end method
