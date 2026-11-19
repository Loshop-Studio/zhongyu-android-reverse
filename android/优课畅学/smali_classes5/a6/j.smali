.class public final synthetic La6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:La6/l;

.field public final synthetic c:Lx7/l;


# direct methods
.method public synthetic constructor <init>(ZLa6/l;Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La6/j;->a:Z

    iput-object p2, p0, La6/j;->b:La6/l;

    iput-object p3, p0, La6/j;->c:Lx7/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, La6/j;->a:Z

    iget-object v1, p0, La6/j;->b:La6/l;

    iget-object v2, p0, La6/j;->c:Lx7/l;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, v2, p1}, La6/l;->h(ZLa6/l;Lx7/l;Landroid/net/Uri;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
