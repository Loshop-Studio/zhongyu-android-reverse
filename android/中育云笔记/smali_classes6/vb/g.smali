.class public final synthetic Lvb/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lvb/l;

.field public final synthetic d:Landroid/net/Uri;

.field public final synthetic e:Z

.field public final synthetic f:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lvb/l;Landroid/net/Uri;ZLhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvb/g;->c:Lvb/l;

    iput-object p2, p0, Lvb/g;->d:Landroid/net/Uri;

    iput-boolean p3, p0, Lvb/g;->e:Z

    iput-object p4, p0, Lvb/g;->f:Lhd/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lvb/g;->c:Lvb/l;

    iget-object v1, p0, Lvb/g;->d:Landroid/net/Uri;

    iget-boolean v2, p0, Lvb/g;->e:Z

    iget-object v3, p0, Lvb/g;->f:Lhd/l;

    invoke-static {v0, v1, v2, v3}, Lvb/l;->a(Lvb/l;Landroid/net/Uri;ZLhd/l;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
