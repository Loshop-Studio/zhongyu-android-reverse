.class public final Lw7/b$c;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lr7/b;

.field public final b:Lw7/g;


# direct methods
.method public constructor <init>(Lr7/b;Lw7/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw7/b$c;->a:Lr7/b;

    .line 5
    .line 6
    iput-object p2, p0, Lw7/b$c;->b:Lw7/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Lr7/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lw7/b$c;->a:Lr7/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lw7/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lw7/b$c;->b:Lw7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public onCleared()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/lifecycle/ViewModel;->onCleared()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lw7/b$c;->a:Lr7/b;

    .line 5
    .line 6
    const-class v1, Lw7/b$d;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lp7/a;->a(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lw7/b$d;

    .line 13
    .line 14
    invoke-interface {v0}, Lw7/b$d;->b()Lq7/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lv7/d;

    .line 19
    .line 20
    invoke-virtual {v0}, Lv7/d;->a()V

    .line 21
    .line 22
    .line 23
    return-void
.end method
