.class public final synthetic Lvb/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Z

.field public final synthetic d:Lvb/l;

.field public final synthetic e:Lhd/l;


# direct methods
.method public synthetic constructor <init>(ZLvb/l;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lvb/i;->c:Z

    iput-object p2, p0, Lvb/i;->d:Lvb/l;

    iput-object p3, p0, Lvb/i;->e:Lhd/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lvb/i;->c:Z

    iget-object v1, p0, Lvb/i;->d:Lvb/l;

    iget-object v2, p0, Lvb/i;->e:Lhd/l;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, v2, p1}, Lvb/l;->h(ZLvb/l;Lhd/l;Landroid/net/Uri;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
