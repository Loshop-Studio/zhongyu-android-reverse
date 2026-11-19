.class public final synthetic La6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Landroid/net/Uri;

.field public final synthetic b:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La6/k;->a:Landroid/net/Uri;

    iput-object p2, p0, La6/k;->b:Lx7/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La6/k;->a:Landroid/net/Uri;

    iget-object v1, p0, La6/k;->b:Lx7/l;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, p1}, La6/l;->i(Landroid/net/Uri;Lx7/l;Landroid/net/Uri;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
