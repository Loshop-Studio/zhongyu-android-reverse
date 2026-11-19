.class public final synthetic Lvb/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroid/net/Uri;

.field public final synthetic d:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvb/k;->c:Landroid/net/Uri;

    iput-object p2, p0, Lvb/k;->d:Lhd/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lvb/k;->c:Landroid/net/Uri;

    iget-object v1, p0, Lvb/k;->d:Lhd/l;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, p1}, Lvb/l;->i(Landroid/net/Uri;Lhd/l;Landroid/net/Uri;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
