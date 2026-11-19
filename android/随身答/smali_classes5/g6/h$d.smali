.class public final Lg6/h$d;
.super Lg6/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg6/h$d$a;
    }
.end annotation


# instance fields
.field public final a:Lg6/h$h;

.field public final b:Lg6/h$d;

.field public c:Lz7/f;


# direct methods
.method public constructor <init>(Lg6/h$h;Lw7/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lg6/c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lg6/h$d;->b:Lg6/h$d;

    .line 5
    .line 6
    iput-object p1, p0, Lg6/h$d;->a:Lg6/h$h;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lg6/h$d;->c(Lw7/g;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Lu7/a;
    .locals 4

    .line 1
    new-instance v0, Lg6/h$a;

    .line 2
    .line 3
    iget-object v1, p0, Lg6/h$d;->a:Lg6/h$h;

    .line 4
    .line 5
    iget-object v2, p0, Lg6/h$d;->b:Lg6/h$d;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lg6/h$a;-><init>(Lg6/h$h;Lg6/h$d;Lg6/i;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public b()Lq7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lg6/h$d;->c:Lz7/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lh8/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lq7/a;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c(Lw7/g;)V
    .locals 3

    .line 1
    new-instance p1, Lg6/h$d$a;

    .line 2
    .line 3
    iget-object v0, p0, Lg6/h$d;->a:Lg6/h$h;

    .line 4
    .line 5
    iget-object v1, p0, Lg6/h$d;->b:Lg6/h$d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {p1, v0, v1, v2}, Lg6/h$d$a;-><init>(Lg6/h$h;Lg6/h$d;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lz7/b;->b(Lz7/f;)Lz7/f;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lg6/h$d;->c:Lz7/f;

    .line 16
    .line 17
    return-void
.end method
