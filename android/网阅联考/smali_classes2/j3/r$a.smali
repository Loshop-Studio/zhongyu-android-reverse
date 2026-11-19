.class public final Lj3/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lj3/i;


# direct methods
.method public constructor <init>(Lj3/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj3/r$a;->a:Lj3/i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lr2/b0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lj3/r$a;->b(Lr2/b0;)Ljava/util/Optional;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(Lr2/b0;)Ljava/util/Optional;
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/r$a;->a:Lj3/i;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lj3/i;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lj3/q;->a(Ljava/lang/Object;)Ljava/util/Optional;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
