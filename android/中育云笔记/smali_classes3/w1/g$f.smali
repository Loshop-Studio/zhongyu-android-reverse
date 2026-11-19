.class public final Lw1/g$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public final a:Lw1/g$h;

.field public final b:Lw1/g$d;

.field public final c:Lw1/g$b;

.field public d:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Lw1/g$h;Lw1/g$d;Lw1/g$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lw1/g$f;->a:Lw1/g$h;

    .line 4
    iput-object p2, p0, Lw1/g$f;->b:Lw1/g$d;

    .line 5
    iput-object p3, p0, Lw1/g$f;->c:Lw1/g$b;

    return-void
.end method

.method public synthetic constructor <init>(Lw1/g$h;Lw1/g$d;Lw1/g$b;Lw1/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lw1/g$f;-><init>(Lw1/g$h;Lw1/g$d;Lw1/g$b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroidx/fragment/app/Fragment;)Lbc/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw1/g$f;->c(Landroidx/fragment/app/Fragment;)Lw1/g$f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b()Lw1/d;
    .locals 5

    .line 1
    iget-object v0, p0, Lw1/g$f;->d:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    const-class v1, Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lgc/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lw1/g$g;

    .line 9
    .line 10
    iget-object v1, p0, Lw1/g$f;->a:Lw1/g$h;

    .line 11
    .line 12
    iget-object v2, p0, Lw1/g$f;->b:Lw1/g$d;

    .line 13
    .line 14
    iget-object v3, p0, Lw1/g$f;->c:Lw1/g$b;

    .line 15
    .line 16
    iget-object v4, p0, Lw1/g$f;->d:Landroidx/fragment/app/Fragment;

    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v3, v4}, Lw1/g$g;-><init>(Lw1/g$h;Lw1/g$d;Lw1/g$b;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public bridge synthetic build()Lyb/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lw1/g$f;->b()Lw1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c(Landroidx/fragment/app/Fragment;)Lw1/g$f;
    .locals 0

    .line 1
    invoke-static {p1}, Lgc/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    iput-object p1, p0, Lw1/g$f;->d:Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    return-object p0
.end method
