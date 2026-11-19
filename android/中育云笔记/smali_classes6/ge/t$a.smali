.class public final Lge/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lge/t;->a(Lod/c;)Lce/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lge/t;

.field public final synthetic d:Lod/c;


# direct methods
.method public constructor <init>(Lge/t;Lod/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lge/t$a;->c:Lge/t;

    .line 2
    .line 3
    iput-object p2, p0, Lge/t$a;->d:Lod/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lge/m;

    .line 2
    .line 3
    iget-object v1, p0, Lge/t$a;->c:Lge/t;

    .line 4
    .line 5
    invoke-virtual {v1}, Lge/t;->b()Lhd/l;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lge/t$a;->d:Lod/c;

    .line 10
    .line 11
    invoke-interface {v1, v2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lce/b;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lge/m;-><init>(Lce/b;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
