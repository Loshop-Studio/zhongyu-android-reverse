.class public final Lge/h3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/b;


# static fields
.field public static final a:Lge/h3;

.field public static final b:Lee/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lge/h3;

    .line 2
    .line 3
    invoke-direct {v0}, Lge/h3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lge/h3;->a:Lge/h3;

    .line 7
    .line 8
    sget-object v0, Lkotlin/jvm/internal/a0;->a:Lkotlin/jvm/internal/a0;

    .line 9
    .line 10
    invoke-static {v0}, Lde/a;->B(Lkotlin/jvm/internal/a0;)Lce/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "kotlin.UShort"

    .line 15
    .line 16
    invoke-static {v1, v0}, Lge/r0;->a(Ljava/lang/String;Lce/b;)Lee/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lge/h3;->b:Lee/f;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lfe/e;)S
    .locals 1

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lge/h3;->getDescriptor()Lee/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Lfe/e;->decodeInline(Lee/f;)Lfe/e;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Lfe/e;->decodeShort()S

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Lqc/o;->b(S)S

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public b(Lfe/f;S)V
    .locals 1

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lge/h3;->getDescriptor()Lee/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Lfe/f;->encodeInline(Lee/f;)Lfe/f;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1, p2}, Lfe/f;->encodeShort(S)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public bridge synthetic deserialize(Lfe/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lge/h3;->a(Lfe/e;)S

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Lqc/o;->a(S)Lqc/o;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public getDescriptor()Lee/f;
    .locals 1

    .line 1
    sget-object v0, Lge/h3;->b:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic serialize(Lfe/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lqc/o;

    .line 2
    .line 3
    invoke-virtual {p2}, Lqc/o;->f()S

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0, p1, p2}, Lge/h3;->b(Lfe/f;S)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
