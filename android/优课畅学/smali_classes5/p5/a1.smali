.class public final synthetic Lp5/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lx7/l;

.field public final synthetic b:Lx7/a;


# direct methods
.method public synthetic constructor <init>(Lx7/l;Lx7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/a1;->a:Lx7/l;

    iput-object p2, p0, Lp5/a1;->b:Lx7/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lp5/a1;->a:Lx7/l;

    iget-object v1, p0, Lp5/a1;->b:Lx7/a;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardFragment$c;->a(Lx7/l;Lx7/a;Landroid/net/Uri;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
