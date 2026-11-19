.class public final synthetic La6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:La6/l;

.field public final synthetic b:Landroid/net/Uri;

.field public final synthetic c:Z

.field public final synthetic d:Lx7/l;


# direct methods
.method public synthetic constructor <init>(La6/l;Landroid/net/Uri;ZLx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La6/g;->a:La6/l;

    iput-object p2, p0, La6/g;->b:Landroid/net/Uri;

    iput-boolean p3, p0, La6/g;->c:Z

    iput-object p4, p0, La6/g;->d:Lx7/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La6/g;->a:La6/l;

    iget-object v1, p0, La6/g;->b:Landroid/net/Uri;

    iget-boolean v2, p0, La6/g;->c:Z

    iget-object v3, p0, La6/g;->d:Lx7/l;

    invoke-static {v0, v1, v2, v3}, La6/l;->a(La6/l;Landroid/net/Uri;ZLx7/l;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
