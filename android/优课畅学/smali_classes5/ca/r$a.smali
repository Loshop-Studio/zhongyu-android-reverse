.class public final Lca/r$a;
.super Lca/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lca/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final d:Lca/e;


# direct methods
.method public constructor <init>(Lca/b0;Li9/e$a;Lca/h;Lca/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lca/r;-><init>(Lca/b0;Li9/e$a;Lca/h;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lca/r$a;->d:Lca/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c(Lca/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p2, p0, Lca/r$a;->d:Lca/e;

    .line 2
    .line 3
    invoke-interface {p2, p1}, Lca/e;->b(Lca/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
