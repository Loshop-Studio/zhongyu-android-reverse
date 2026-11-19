.class public final synthetic Lkb/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lhd/l;

.field public final synthetic d:Lhd/a;


# direct methods
.method public synthetic constructor <init>(Lhd/l;Lhd/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb/a1;->c:Lhd/l;

    iput-object p2, p0, Lkb/a1;->d:Lhd/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lkb/a1;->c:Lhd/l;

    iget-object v1, p0, Lkb/a1;->d:Lhd/a;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardFragment$c;->b(Lhd/l;Lhd/a;Landroid/net/Uri;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
