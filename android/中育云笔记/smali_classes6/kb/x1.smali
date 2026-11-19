.class public abstract Lkb/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ly9/n;Lhd/p;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onChange"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lkb/x1$a;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lkb/x1$a;-><init>(Lhd/p;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Ly9/n;->x(Lma/k;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final b(Ly9/n;Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onEvent"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lkb/x1$b;

    .line 12
    .line 13
    invoke-direct {v0, p1, p0}, Lkb/x1$b;-><init>(Lhd/l;Ly9/n;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Ly9/n;->D(Lma/b;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final c(Ly9/n;Lhd/a;Lhd/p;Lhd/a;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onMoveStart"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onMoving"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onMoveEnd"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lkb/x1$c;

    .line 22
    .line 23
    invoke-direct {v0, p2, p1, p3}, Lkb/x1$c;-><init>(Lhd/p;Lhd/a;Lhd/a;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v0}, Ly9/n;->setAreaMoveListener(Lma/d;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final d(Ly9/n;Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onMicroPhoneChange"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lkb/x1$d;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lkb/x1$d;-><init>(Lhd/l;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Ly9/n;->h(Lma/g;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final e(Ly9/n;Lhd/a;Lhd/l;Lhd/a;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onStart"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onProgress"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onStop"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lkb/x1$e;

    .line 22
    .line 23
    invoke-direct {v0, p2, p1, p3}, Lkb/x1$e;-><init>(Lhd/l;Lhd/a;Lhd/a;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v0}, Ly9/n;->k(Lma/i;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final f(Ly9/n;Lhd/l;Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onTextColorChange"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onTextSizeChange"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lkb/x1$f;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lkb/x1$f;-><init>(Lhd/l;Lhd/l;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, v0}, Ly9/n;->C(Lma/e;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
