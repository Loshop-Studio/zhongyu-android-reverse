.class public final Lcoil3/decode/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcoil3/decode/i;


# instance fields
.field public final a:Lh7/e;

.field public final b:Lcoil3/decode/m;


# direct methods
.method public constructor <init>(Lh7/e;Lcoil3/decode/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/decode/c;->a:Lh7/e;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil3/decode/c;->b:Lcoil3/decode/m;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ln/k;Ls/l;)Lcoil3/decode/j;
    .locals 3

    .line 1
    new-instance v0, Lcoil3/decode/d;

    .line 2
    .line 3
    iget-object p1, p1, Ln/k;->a:Lcoil3/decode/p;

    .line 4
    .line 5
    iget-object v1, p0, Lcoil3/decode/c;->a:Lh7/e;

    .line 6
    .line 7
    iget-object v2, p0, Lcoil3/decode/c;->b:Lcoil3/decode/m;

    .line 8
    .line 9
    invoke-direct {v0, p1, p2, v1, v2}, Lcoil3/decode/d;-><init>(Lcoil3/decode/p;Ls/l;Lh7/e;Lcoil3/decode/m;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
