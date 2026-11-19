.class public interface abstract Ll7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract decodeBooleanElement(Lk7/g;I)Z
.end method

.method public abstract decodeByteElement(Lk7/g;I)B
.end method

.method public abstract decodeCharElement(Lk7/g;I)C
.end method

.method public decodeCollectionSize(Lk7/g;)I
    .locals 1

    .line 1
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, -0x1

    return p1
.end method

.method public abstract decodeDoubleElement(Lk7/g;I)D
.end method

.method public abstract decodeElementIndex(Lk7/g;)I
.end method

.method public abstract decodeFloatElement(Lk7/g;I)F
.end method

.method public abstract decodeInlineElement(Lk7/g;I)Ll7/e;
.end method

.method public abstract decodeIntElement(Lk7/g;I)I
.end method

.method public abstract decodeLongElement(Lk7/g;I)J
.end method

.method public abstract decodeNullableSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public decodeSequentially()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract decodeShortElement(Lk7/g;I)S
.end method

.method public abstract decodeStringElement(Lk7/g;I)Ljava/lang/String;
.end method

.method public abstract endStructure(Lk7/g;)V
.end method

.method public abstract getSerializersModule()Lo7/e;
.end method
