.class public Ly8/b$f;
.super Ly8/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field public a:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly8/b$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ly8/b$f;->c(Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Lz8/c;IILz8/e;ZLmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Z
    .locals 0

    .line 1
    iget-object p3, p0, Ly8/b$f;->a:Ljava/util/Map;

    .line 2
    .line 3
    const/4 p4, 0x0

    .line 4
    if-eqz p3, :cond_1

    .line 5
    .line 6
    invoke-virtual {p1}, Lz8/c;->m()I

    .line 7
    .line 8
    .line 9
    move-result p5

    .line 10
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p5

    .line 14
    invoke-interface {p3, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    check-cast p3, Ljava/lang/Integer;

    .line 19
    .line 20
    if-eqz p3, :cond_0

    .line 21
    .line 22
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    if-lt p2, p3, :cond_0

    .line 27
    .line 28
    const/4 p4, 0x1

    .line 29
    :cond_0
    if-eqz p4, :cond_1

    .line 30
    .line 31
    iget p2, p1, Lz8/c;->F:I

    .line 32
    .line 33
    or-int/lit16 p2, p2, 0x100

    .line 34
    .line 35
    iput p2, p1, Lz8/c;->F:I

    .line 36
    .line 37
    :cond_1
    return p4
.end method

.method public c(Ljava/util/Map;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly8/b$f;->a:Ljava/util/Map;

    .line 2
    .line 3
    return-void
.end method
