.class public final Ln/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lw/n;Lcoil3/e;)Ln/k;
    .locals 0

    .line 1
    check-cast p1, [B

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Ln/c$a;->b([BLw/n;Lcoil3/e;)Ln/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b([BLw/n;Lcoil3/e;)Ln/k;
    .locals 0

    .line 1
    new-instance p3, Ln/c;

    .line 2
    .line 3
    invoke-direct {p3, p1, p2}, Ln/c;-><init>([BLw/n;)V

    .line 4
    .line 5
    .line 6
    return-object p3
.end method
