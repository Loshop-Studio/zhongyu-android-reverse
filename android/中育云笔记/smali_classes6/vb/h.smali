.class public final synthetic Lvb/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Z

.field public final synthetic d:Lvb/l;

.field public final synthetic e:Landroid/net/Uri;

.field public final synthetic f:Lhd/l;


# direct methods
.method public synthetic constructor <init>(ZLvb/l;Landroid/net/Uri;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lvb/h;->c:Z

    iput-object p2, p0, Lvb/h;->d:Lvb/l;

    iput-object p3, p0, Lvb/h;->e:Landroid/net/Uri;

    iput-object p4, p0, Lvb/h;->f:Lhd/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lvb/h;->c:Z

    iget-object v1, p0, Lvb/h;->d:Lvb/l;

    iget-object v2, p0, Lvb/h;->e:Landroid/net/Uri;

    iget-object v3, p0, Lvb/h;->f:Lhd/l;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Lvb/l;->j(ZLvb/l;Landroid/net/Uri;Lhd/l;Z)Lqc/q;

    move-result-object p1

    return-object p1
.end method
