.class public final synthetic Lk/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Ln/k$a;

.field public final synthetic d:Lod/c;


# direct methods
.method public synthetic constructor <init>(Ln/k$a;Lod/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/f;->c:Ln/k$a;

    iput-object p2, p0, Lk/f;->d:Lod/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lk/f;->c:Ln/k$a;

    iget-object v1, p0, Lk/f;->d:Lod/c;

    invoke-static {v0, v1}, Lcoil3/a$a;->d(Ln/k$a;Lod/c;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
