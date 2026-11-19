.class public final Lb5/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb5/c;

.field public final b:Lb5/d;

.field public final c:Lb5/a;

.field public final d:Lb5/f;


# direct methods
.method public constructor <init>(Lb5/c;Lb5/d;Lb5/a;Lb5/f;)V
    .locals 1

    .line 1
    const-string v0, "backgroundLayer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fixLayer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lb5/j;->a:Lb5/c;

    .line 15
    .line 16
    iput-object p2, p0, Lb5/j;->b:Lb5/d;

    .line 17
    .line 18
    iput-object p3, p0, Lb5/j;->c:Lb5/a;

    .line 19
    .line 20
    iput-object p4, p0, Lb5/j;->d:Lb5/f;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()Lb5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/j;->c:Lb5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lb5/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/j;->a:Lb5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lb5/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/j;->b:Lb5/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lb5/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/j;->d:Lb5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/j;->b:Lb5/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lb5/d;->b()Landroid/graphics/Rect;

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
    iget-object v0, p0, Lb5/j;->b:Lb5/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lb5/d;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/j;->c:Lb5/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Lb5/a;->clear()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
