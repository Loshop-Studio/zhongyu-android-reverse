.class public final Lce/f;
.super Lge/b;
.source "SourceFile"


# instance fields
.field public final a:Lod/c;

.field public b:Ljava/util/List;

.field public final c:Lqc/d;


# direct methods
.method public constructor <init>(Lod/c;)V
    .locals 1

    .line 1
    const-string v0, "baseClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lge/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lce/f;->a:Lod/c;

    .line 10
    .line 11
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lce/f;->b:Ljava/util/List;

    .line 16
    .line 17
    sget-object p1, Lkotlin/LazyThreadSafetyMode;->d:Lkotlin/LazyThreadSafetyMode;

    .line 18
    .line 19
    new-instance v0, Lce/d;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lce/d;-><init>(Lce/f;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/a;->b(Lkotlin/LazyThreadSafetyMode;Lhd/a;)Lqc/d;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lce/f;->c:Lqc/d;

    .line 29
    .line 30
    return-void
.end method

.method public static synthetic f(Lce/f;)Lee/f;
    .locals 0

    .line 1
    invoke-static {p0}, Lce/f;->h(Lce/f;)Lee/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lce/f;Lee/a;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lce/f;->i(Lce/f;Lee/a;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lce/f;)Lee/f;
    .locals 4

    .line 1
    sget-object v0, Lee/d$a;->a:Lee/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Lee/f;

    .line 5
    .line 6
    new-instance v2, Lce/e;

    .line 7
    .line 8
    invoke-direct {v2, p0}, Lce/e;-><init>(Lce/f;)V

    .line 9
    .line 10
    .line 11
    const-string v3, "kotlinx.serialization.Polymorphic"

    .line 12
    .line 13
    invoke-static {v3, v0, v1, v2}, Lee/m;->h(Ljava/lang/String;Lee/n;[Lee/f;Lhd/l;)Lee/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Lce/f;->e()Lod/c;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {v0, p0}, Lee/b;->b(Lee/f;Lod/c;)Lee/f;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static final i(Lce/f;Lee/a;)Lqc/q;
    .locals 8

    .line 1
    const-string v1, "$this$buildSerialDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lkotlin/jvm/internal/c0;->a:Lkotlin/jvm/internal/c0;

    .line 7
    .line 8
    invoke-static {v1}, Lde/a;->C(Lkotlin/jvm/internal/c0;)Lce/b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Lce/b;->getDescriptor()Lee/f;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/16 v5, 0xc

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    const-string v1, "type"

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    move-object v0, p1

    .line 24
    invoke-static/range {v0 .. v6}, Lee/a;->b(Lee/a;Ljava/lang/String;Lee/f;Ljava/util/List;ZILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v1, "kotlinx.serialization.Polymorphic<"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lce/f;->e()Lod/c;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, Lod/c;->f()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 v1, 0x3e

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    sget-object v3, Lee/n$a;->a:Lee/n$a;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    new-array v4, v0, [Lee/f;

    .line 61
    .line 62
    const/16 v6, 0x8

    .line 63
    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v5, 0x0

    .line 66
    invoke-static/range {v2 .. v7}, Lee/m;->i(Ljava/lang/String;Lee/n;[Lee/f;Lhd/l;ILjava/lang/Object;)Lee/f;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const/16 v5, 0xc

    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    const-string v1, "value"

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    const/4 v4, 0x0

    .line 77
    move-object v0, p1

    .line 78
    invoke-static/range {v0 .. v6}, Lee/a;->b(Lee/a;Ljava/lang/String;Lee/f;Ljava/util/List;ZILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lce/f;->b:Ljava/util/List;

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Lee/a;->h(Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 87
    .line 88
    return-object v0
.end method


# virtual methods
.method public e()Lod/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lce/f;->a:Lod/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDescriptor()Lee/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lce/f;->c:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lee/f;

    .line 8
    .line 9
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "kotlinx.serialization.PolymorphicSerializer(baseClass: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lce/f;->e()Lod/c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x29

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method
