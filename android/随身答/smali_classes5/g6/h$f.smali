.class public final Lg6/h$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu7/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public final a:Lg6/h$h;

.field public final b:Lg6/h$d;

.field public final c:Lg6/h$b;

.field public d:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Lg6/h$h;Lg6/h$d;Lg6/h$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lg6/h$f;->a:Lg6/h$h;

    .line 4
    iput-object p2, p0, Lg6/h$f;->b:Lg6/h$d;

    .line 5
    iput-object p3, p0, Lg6/h$f;->c:Lg6/h$b;

    return-void
.end method

.method public synthetic constructor <init>(Lg6/h$h;Lg6/h$d;Lg6/h$b;Lg6/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lg6/h$f;-><init>(Lg6/h$h;Lg6/h$d;Lg6/h$b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroidx/fragment/app/Fragment;)Lu7/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg6/h$f;->c(Landroidx/fragment/app/Fragment;)Lg6/h$f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b()Lg6/d;
    .locals 5

    .line 1
    iget-object v0, p0, Lg6/h$f;->d:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    const-class v1, Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lz7/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lg6/h$g;

    .line 9
    .line 10
    iget-object v1, p0, Lg6/h$f;->a:Lg6/h$h;

    .line 11
    .line 12
    iget-object v2, p0, Lg6/h$f;->b:Lg6/h$d;

    .line 13
    .line 14
    iget-object v3, p0, Lg6/h$f;->c:Lg6/h$b;

    .line 15
    .line 16
    iget-object v4, p0, Lg6/h$f;->d:Landroidx/fragment/app/Fragment;

    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v3, v4}, Lg6/h$g;-><init>(Lg6/h$h;Lg6/h$d;Lg6/h$b;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public bridge synthetic build()Lr7/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg6/h$f;->b()Lg6/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c(Landroidx/fragment/app/Fragment;)Lg6/h$f;
    .locals 0

    .line 1
    invoke-static {p1}, Lz7/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    iput-object p1, p0, Lg6/h$f;->d:Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    return-object p0
.end method
