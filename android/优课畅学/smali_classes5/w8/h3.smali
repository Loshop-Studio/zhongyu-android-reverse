.class public final Lw8/h3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/b;


# static fields
.field public static final a:Lw8/h3;

.field public static final b:Lu8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lw8/h3;

    .line 2
    .line 3
    invoke-direct {v0}, Lw8/h3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw8/h3;->a:Lw8/h3;

    .line 7
    .line 8
    sget-object v0, Lkotlin/jvm/internal/a0;->a:Lkotlin/jvm/internal/a0;

    .line 9
    .line 10
    invoke-static {v0}, Lt8/a;->G(Lkotlin/jvm/internal/a0;)Ls8/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "kotlin.UShort"

    .line 15
    .line 16
    invoke-static {v1, v0}, Lw8/r0;->a(Ljava/lang/String;Ls8/b;)Lu8/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lw8/h3;->b:Lu8/f;

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
.method public a(Lv8/e;)S
    .locals 1

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lw8/h3;->getDescriptor()Lu8/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Lv8/e;->decodeInline(Lu8/f;)Lv8/e;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Lv8/e;->decodeShort()S

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Lh7/n;->b(S)S

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public b(Lv8/f;S)V
    .locals 1

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lw8/h3;->getDescriptor()Lu8/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Lv8/f;->encodeInline(Lu8/f;)Lv8/f;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1, p2}, Lv8/f;->encodeShort(S)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public bridge synthetic deserialize(Lv8/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw8/h3;->a(Lv8/e;)S

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Lh7/n;->a(S)Lh7/n;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public getDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Lw8/h3;->b:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic serialize(Lv8/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lh7/n;

    .line 2
    .line 3
    invoke-virtual {p2}, Lh7/n;->f()S

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0, p1, p2}, Lw8/h3;->b(Lv8/f;S)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
