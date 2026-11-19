.class public final Laa/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lga/d;

.field public final b:Lu9/a;

.field public final c:Lv9/c;


# direct methods
.method public constructor <init>(Lga/d;Lu9/a;Lv9/c;)V
    .locals 1

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrixAdapter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "graphControl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Laa/b;->a:Lga/d;

    .line 20
    .line 21
    iput-object p2, p0, Laa/b;->b:Lu9/a;

    .line 22
    .line 23
    iput-object p3, p0, Laa/b;->c:Lv9/c;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;J)Lz9/e;
    .locals 3

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laa/b;->a:Lga/d;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->p()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "data.sourceFileName"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->r()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-interface {v0, v1, p1}, Lga/d;->b(Ljava/lang/String;I)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    new-instance v0, Lha/g;

    .line 28
    .line 29
    invoke-direct {v0}, Lha/g;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Laa/b;->c:Lv9/c;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lz9/e;->n(Lv9/c;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Laa/b;->a:Lga/d;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lz9/e;->r(Lga/d;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Laa/b;->b:Lu9/a;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lz9/e;->o(Lu9/a;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1, p2, p3}, Lha/g;->D(Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;J)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_0
    const/4 p1, 0x0

    .line 52
    return-object p1
.end method

.method public b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;)V
    .locals 2

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->n()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "data.lastMatrix"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lna/n;->g(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lna/n;->c(Landroid/graphics/Matrix;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v1, "CameraMatrixExecute -> execute\uff0c\u62e6\u622a\u975e\u6cd5\u76f8\u673a\u77e9\u9635\uff0csource="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->p()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, "\uff0csourceId="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->r()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Laa/b;->b:Lu9/a;

    .line 66
    .line 67
    invoke-virtual {p1}, Lu9/a;->i()V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Laa/b;->c:Lv9/c;

    .line 71
    .line 72
    invoke-interface {p1}, Lv9/c;->g()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_0
    iget-object p1, p0, Laa/b;->b:Lu9/a;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Lu9/a;->j(Landroid/graphics/Matrix;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Laa/b;->c:Lv9/c;

    .line 82
    .line 83
    invoke-interface {p1}, Lv9/c;->g()V

    .line 84
    .line 85
    .line 86
    return-void
.end method
