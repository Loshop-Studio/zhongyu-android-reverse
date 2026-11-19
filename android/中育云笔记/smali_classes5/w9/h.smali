.class public final Lw9/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lw9/b;

.field public final b:Lw9/c;

.field public final c:Lw9/a;

.field public final d:Lw9/e;


# direct methods
.method public constructor <init>(Lw9/b;Lw9/c;Lw9/a;Lw9/e;)V
    .locals 1

    .line 1
    const-string v0, "backgroundLayer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fixLayer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lw9/h;->a:Lw9/b;

    .line 15
    .line 16
    iput-object p2, p0, Lw9/h;->b:Lw9/c;

    .line 17
    .line 18
    iput-object p3, p0, Lw9/h;->c:Lw9/a;

    .line 19
    .line 20
    iput-object p4, p0, Lw9/h;->d:Lw9/e;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()Lw9/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lw9/h;->c:Lw9/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lw9/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lw9/h;->a:Lw9/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lw9/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lw9/h;->b:Lw9/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lw9/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lw9/h;->d:Lw9/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lw9/h;->b:Lw9/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lw9/c;->b()Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw9/h;->b:Lw9/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lw9/c;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw9/h;->c:Lw9/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Lw9/a;->clear()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
