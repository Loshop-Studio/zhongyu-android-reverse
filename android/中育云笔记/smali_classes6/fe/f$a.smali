.class public abstract Lfe/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfe/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lfe/f;Lee/f;I)Lfe/d;
    .locals 0

    .line 1
    const-string p2, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p1}, Lfe/f;->beginStructure(Lee/f;)Lfe/d;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static b(Lfe/f;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static c(Lfe/f;Lce/i;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "serializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lce/i;->getDescriptor()Lee/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Lee/f;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0, p1, p2}, Lfe/f;->encodeSerializableValue(Lce/i;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    if-nez p2, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Lfe/f;->encodeNull()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-interface {p0}, Lfe/f;->encodeNotNullMark()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0, p1, p2}, Lfe/f;->encodeSerializableValue(Lce/i;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static d(Lfe/f;Lce/i;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "serializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0, p2}, Lce/i;->serialize(Lfe/f;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
