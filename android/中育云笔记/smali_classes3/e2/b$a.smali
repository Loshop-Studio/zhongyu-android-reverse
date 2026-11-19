.class public final Le2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le2/b;->a(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LifecycleOwner;Lhd/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lhd/l;


# direct methods
.method public constructor <init>(Lhd/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le2/b$a;->c:Lhd/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Le2/a;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Le2/a;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Le2/b$a;->c:Lhd/l;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Le2/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Le2/b$a;->a(Le2/a;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p1
.end method
