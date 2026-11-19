.class public interface abstract Ll7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract encodeBooleanElement(Lk7/g;IZ)V
.end method

.method public abstract encodeByteElement(Lk7/g;IB)V
.end method

.method public abstract encodeCharElement(Lk7/g;IC)V
.end method

.method public abstract encodeDoubleElement(Lk7/g;ID)V
.end method

.method public abstract encodeFloatElement(Lk7/g;IF)V
.end method

.method public abstract encodeInlineElement(Lk7/g;I)Ll7/f;
.end method

.method public abstract encodeIntElement(Lk7/g;II)V
.end method

.method public abstract encodeLongElement(Lk7/g;IJ)V
.end method

.method public abstract encodeNullableSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V
.end method

.method public abstract encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V
.end method

.method public abstract encodeShortElement(Lk7/g;IS)V
.end method

.method public abstract encodeStringElement(Lk7/g;ILjava/lang/String;)V
.end method

.method public abstract endStructure(Lk7/g;)V
.end method

.method public shouldEncodeElementDefault(Lk7/g;I)Z
    .locals 0

    .line 1
    const-string p2, "descriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
