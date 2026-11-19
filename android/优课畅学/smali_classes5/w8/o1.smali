.class public final Lw8/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/b;


# instance fields
.field public final a:Ls8/b;

.field public final b:Lu8/f;


# direct methods
.method public constructor <init>(Ls8/b;)V
    .locals 1

    .line 1
    const-string v0, "serializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lw8/o1;->a:Ls8/b;

    .line 10
    .line 11
    new-instance v0, Lw8/m2;

    .line 12
    .line 13
    invoke-interface {p1}, Ls8/b;->getDescriptor()Lu8/f;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {v0, p1}, Lw8/m2;-><init>(Lu8/f;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lw8/o1;->b:Lu8/f;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public deserialize(Lv8/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lv8/e;->decodeNotNullMark()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lw8/o1;->a:Ls8/b;

    .line 13
    .line 14
    check-cast v0, Ls8/a;

    .line 15
    .line 16
    invoke-interface {p1, v0}, Lv8/e;->decodeSerializableValue(Ls8/a;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    invoke-interface {p1}, Lv8/e;->decodeNull()Ljava/lang/Void;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    const-class v2, Lw8/o1;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lw8/o1;

    .line 18
    .line 19
    iget-object v2, p0, Lw8/o1;->a:Ls8/b;

    .line 20
    .line 21
    iget-object p1, p1, Lw8/o1;->a:Ls8/b;

    .line 22
    .line 23
    invoke-static {v2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    return v0

    .line 31
    :cond_3
    :goto_0
    return v1
.end method

.method public getDescriptor()Lu8/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lw8/o1;->b:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lw8/o1;->a:Ls8/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public serialize(Lv8/f;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-interface {p1}, Lv8/f;->encodeNotNullMark()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lw8/o1;->a:Ls8/b;

    .line 12
    .line 13
    check-cast v0, Ls8/i;

    .line 14
    .line 15
    invoke-interface {p1, v0, p2}, Lv8/f;->encodeSerializableValue(Ls8/i;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-interface {p1}, Lv8/f;->encodeNull()V

    .line 20
    .line 21
    .line 22
    return-void
.end method
